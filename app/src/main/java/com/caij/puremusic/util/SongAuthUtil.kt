package com.caij.puremusic.util

import android.content.Context
import android.os.Looper
import com.caij.down.core.Callback
import com.caij.down.core.FileData
import com.caij.down.core.Progress
import com.caij.puremusic.App
import com.caij.puremusic.BuildConfig
import com.caij.puremusic.EVENT_LYRICS_UPDATE
import com.caij.puremusic.EventBus
import com.caij.puremusic.ThreadManager
import com.caij.puremusic.db.DatabaseUtil
import com.caij.puremusic.drive.DriveFactory
import com.caij.puremusic.drive.DriveFactorys
import com.caij.puremusic.drive.model.WebDAVToken
import com.caij.puremusic.extensions.isLocal
import com.caij.puremusic.fragments.folder.FolderUtil
import com.caij.puremusic.db.model.Song
import com.google.android.exoplayer2.metadata.Metadata
import com.google.android.exoplayer2.metadata.vorbis.VorbisComment
import com.thegrizzlylabs.sardineandroid.util.SardineUtil
import com.caij.puremusic.db.model.Folder
import com.caij.puremusic.drive.jellyfin.AuthorizationHeaderBuilder
import com.caij.puremusic.drive.model.Auth2Token
import com.caij.puremusic.drive.plex.HeaderHelper
import io.ktor.http.HttpHeaders
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import okhttp3.Credentials
import okhttp3.Request
import org.json.JSONObject
import java.io.File
import java.io.IOException
import java.util.HashMap

object SongAuthUtil {

    fun getSongUrl(song: Song): String {
        return if (song.sourceType == DriveFactory.TYPE_INNER) {
            MusicUtil.getSongFileUri(songId = song.id).toString()
        } else {
            song.url
        }
    }

    suspend fun getRequestHeaders(folder: Folder): Map<String, String> {
        if (Thread.currentThread() == Looper.getMainLooper().thread) throw java.lang.RuntimeException("")
        try {
            if (folder.type == DriveFactory.TYPE_ONEDRIVE || folder.type == DriveFactory.TYPE_GOOGLE_DRIVE
                || folder.type == DriveFactory.TYPE_DROPBOX || folder.type == DriveFactory.TYPE_ADRIVE) {
                val driveFactory = DriveFactorys.getFactory(folder.type)
                if (driveFactory != null) {
                    val driveEngine = driveFactory.createDriveEngine(folder)
                    val tokenFolder = driveEngine.checkToken()
                    val auth2Token: Auth2Token = GsonUtil.fromJson(tokenFolder.tokenJson, Auth2Token::class.java)
                    val headers = HashMap<String, String>()
                    headers["Authorization"] = auth2Token.token_type + " " + auth2Token.access_token
                    return headers
                }
            } else if (folder.type == DriveFactory.TYPE_WEBDAV) {
                val webDAVToken = GsonUtil.fromJson(folder.tokenJson, WebDAVToken::class.java)
                val headers = HashMap<String, String>()
                headers["Authorization"] = Credentials.basic(webDAVToken.username, webDAVToken.pwd, SardineUtil.standardUTF8())
                return headers
            } else if (folder.type == DriveFactory.TYPE_BAIDUDRIVE) {
                val driveFactory = DriveFactorys.getFactory(folder.type)
                if (driveFactory != null) {
                    val driveEngine = driveFactory.createDriveEngine(folder)
                    val tokenFolder = driveEngine.checkToken()
                    val auth2Token: Auth2Token = GsonUtil.fromJson(tokenFolder.tokenJson, Auth2Token::class.java)
                    val headers = HashMap<String, String>()
                    headers["access_token"] = auth2Token.access_token
                    return headers
                }
            } else if (folder.type == DriveFactory.TYPE_JELLYFIN || folder.type == DriveFactory.TYPE_EMBY) {
                val webDAVToken = GsonUtil.fromJson(folder.tokenJson, WebDAVToken::class.java)
                val jsonObject = Json.parseToJsonElement(folder.extJson).jsonObject
                val deviceId = jsonObject["deviceId"]?.jsonPrimitive?.content ?: ""
                val deviceName = jsonObject["deviceName"]?.jsonPrimitive?.content ?: ""
                val headers = HashMap<String, String>()
                headers[HttpHeaders.Authorization] =
                    AuthorizationHeaderBuilder.buildHeader("PureMusic", "1.0.0",
                    deviceId, deviceName, webDAVToken.pwd)
                return headers
            } else if (folder.type == DriveFactory.TYPE_PLEX) {
                val webDAVToken = GsonUtil.fromJson(folder.tokenJson, WebDAVToken::class.java)
                val jsonObject = Json.parseToJsonElement(folder.extJson).jsonObject
                val deviceId = jsonObject["deviceId"]?.jsonPrimitive?.content ?: ""
                val deviceName = jsonObject["deviceName"]?.jsonPrimitive?.content ?: ""
                val headers = HeaderHelper.buildHeader("PureMusic", "1.0.0",
                    deviceId, deviceName, webDAVToken.pwd)

                //过滤header value为空
                val filters = HashMap<String, String>()
                for (entry in headers) {
                    if (!entry.value.isNullOrEmpty()) {
                        filters[entry.key] = entry.value!!
                    }
                }

                return filters
            }
        } catch (ignore : IOException) {

        }
        return emptyMap()
    }

    fun downServerLyrics(context: Context, song: Song, notify: Boolean) {
        if (song.isLocal) return
        GlobalScope.launch(Dispatchers.IO) {
            val folder = FolderUtil.folderManager.getFolder(song.sourceId)
            if (folder != null) {
                val serverLyrics = DatabaseUtil.pureMusicDatabase.serverLyricsDao().get(song.id)
                if (serverLyrics != null) {
                    val lyricUrl = serverLyrics.url
                    val file = File(LyricUtil.getLrcNetCachePath(context, song))
                    if (!file.exists()) {
                        if (folder.type == DriveFactory.TYPE_EMBY) {
                            loadEmbyLyric(lyricUrl, file)
                        } else {
                            val dataSource = FileData(file)
                            val headers = getRequestHeaders(folder)
                            DownManager.getInstance().down(lyricUrl, headers, dataSource)
                                .executeOn(ThreadManager.getInstance().NET_WORK_EXECUTOR)
                                .execute(object : Callback {
                                    override fun onProgress(progress: Progress) {

                                    }

                                    override fun onComplete() {
                                        if (notify) EventBus.post(EVENT_LYRICS_UPDATE)
                                    }

                                    override fun onError(e: Throwable) {

                                    }
                                })
                        }
                    }
                } else {
                    logD("not found ignore down lyrics ${song.title}")
                }
            }
        }
    }

    private fun loadEmbyLyric(lyricUrl: String, file: File) {
        try {
            val request = Request.Builder().url(lyricUrl).get().build()
            val response = HttpUtil.okHttpClient.newCall(request).execute()
            val lyricText = StringBuilder()
            if (response.code in 200..299) {
                val jsonStr = response.body!!.string()
                val jsonObj = JSONObject(jsonStr)
                val jsonEvents = jsonObj.optJSONArray("TrackEvents")
                for (i in 0 until jsonEvents.length()) {
                    val event = jsonEvents.getJSONObject(i)
                    val text = event.getString("Text")
                    var start = event.getLong("StartPositionTicks") / 10
//                [00:00.01]歌曲名 江南(经典风行版)
                    val min = start / 1000 / 1000 / 60
                    val minStr = if (min < 10) {
                        "0$min"
                    } else {
                        min
                    }
                    val sec = (start - min * 60 * 1000 * 1000) / 1000 / 1000
                    val secStr = if (sec < 10) {
                        "0$sec"
                    } else {
                        sec
                    }
                    val miSec = (start - min * 60 * 1000 * 1000 - sec * 1000 * 1000) / 1000 / 10
                    val miSecStr = if (miSec < 10) {
                        "0$miSec"
                    } else {
                        miSec
                    }
                    lyricText.append("[").append(minStr).append(":").append(secStr).append(".").append(miSecStr).append("]").append(text)
                    if (i < jsonEvents.length() - 1) {
                        lyricText.append("\n")
                    }
                }
            }
            if (BuildConfig.DEBUG) {
                logD("ly:  ${lyricText.toString()}")
            }
            if (lyricText.isNotEmpty()) {
                FileUtil.write(file, lyricText.toString())
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun saveSongLyrics(song: Song, metadata: Metadata, notify: Boolean) {
        for (i in 0 until metadata.length()) {
            val entry = metadata.get(i)
            if (entry is VorbisComment && entry.key.lowercase() == "lyrics") {
                val file = File(LyricUtil.getLrcSongMetaCachePath(App.getContext(), song))
                if (!file.exists()) {
                    FileUtil.write(file, entry.value)
                    if (notify) EventBus.post(EVENT_LYRICS_UPDATE)
                }
            }
        }
    }
}