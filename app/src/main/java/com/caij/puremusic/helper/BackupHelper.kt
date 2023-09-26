package com.caij.puremusic.helper

import android.content.Context
import android.os.Environment
import com.caij.puremusic.R
import com.caij.puremusic.db.model.PlaylistEntity
import com.caij.puremusic.db.PlaylistWithSongs
import com.caij.puremusic.db.model.SongEntity
import com.caij.puremusic.db.toSongEntity
import com.caij.puremusic.extensions.showToast
import com.caij.puremusic.extensions.zipOutputStream
import com.caij.puremusic.helper.BackupContent.*
import com.caij.puremusic.repository.Repository
import com.caij.puremusic.repository.SongRepository
import com.caij.puremusic.util.getExternalStoragePublicDirectory
import com.caij.puremusic.util.logE
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import java.io.File
import java.io.InputStream
import java.text.SimpleDateFormat
import java.util.*
import java.util.zip.ZipEntry
import java.util.zip.ZipInputStream

object BackupHelper : KoinComponent {
    private val repository by inject<Repository>()
    private val songRepository by inject<SongRepository>()

    suspend fun createBackup(context: Context, name: String) {
        val backupFile =
            File(getBackupRoot(), name + APPEND_EXTENSION)
        if (backupFile.parentFile?.exists() != true) {
            backupFile.parentFile?.mkdirs()
        }
        val zipItems = mutableListOf<ZipItem>()
        zipItems.addAll(getPlaylistZipItems(context))
        zipAll(context, zipItems, backupFile)
        // Clean Cache Playlist Directory
        File(context.filesDir, PLAYLISTS_PATH).deleteRecursively()
    }

    private suspend fun zipAll(context: Context, zipItems: List<ZipItem>, backupFile: File) =
        withContext(Dispatchers.IO) {
            runCatching {
                backupFile.outputStream().buffered().zipOutputStream().use { out ->
                    for (zipItem in zipItems) {
                        File(zipItem.filePath).inputStream().buffered().use { origin ->
                            val entry = ZipEntry(zipItem.zipPath)
                            out.putNextEntry(entry)
                            origin.copyTo(out)
                        }
                    }
                }
            }.onFailure {
                withContext(Dispatchers.Main) {
                    context.showToast(R.string.error_create_backup)
                }
            }.onSuccess {
                withContext(Dispatchers.Main) {
                    context.showToast(R.string.message_backup_create_success)
                }
            }
        }

    private suspend fun getPlaylistZipItems(context: Context): List<ZipItem> {
        val playlistZipItems = mutableListOf<ZipItem>()
        // Cache Playlist files in App storage
        val playlistFolder = File(context.filesDir, PLAYLISTS_PATH)
        if (!playlistFolder.exists()) {
            playlistFolder.mkdirs()
        }
        val fetchPlaylists = repository.fetchPlaylists()
        val playlistWithSongs = ArrayList<PlaylistWithSongs>()
        fetchPlaylists.forEach {
            playlistWithSongs.add(PlaylistWithSongs(it, repository.playlistSongs(it.playListId), repository.getPlayListSongs(it.playListId)))
        }
        for (playlist in playlistWithSongs) {
            runCatching {
                M3UWriter.writeIO(playlistFolder,  playlist)
            }.onSuccess { playlistFile ->
                if (playlistFile.exists()) {
                    playlistZipItems.add(
                        ZipItem(
                            playlistFile.absolutePath,
                            PLAYLISTS_PATH.child(playlistFile.name)
                        )
                    )
                }
            }.onFailure {
                logE("save playlist error " + it.message)
            }
        }
        return playlistZipItems
    }

    suspend fun restoreBackup(
        context: Context,
        inputStream: InputStream?,
        contents: List<BackupContent>
    ) {
        withContext(Dispatchers.IO) {
            ZipInputStream(inputStream).use {
                var entry = it.nextEntry
                while (entry != null) {
                    if (entry.isPlaylistEntry() && contents.contains(PLAYLISTS)) {
                        restorePlaylists(it, entry)
                    }
                    entry = it.nextEntry
                }
            }
            withContext(Dispatchers.Main) {
                context.showToast(R.string.message_restore_success)
            }
        }
    }

    private suspend fun restorePlaylists(
        zipIn: ZipInputStream,
        zipEntry: ZipEntry
    ) {
        val playlistName = zipEntry.getFileName().substringBeforeLast(".")
        val songs = mutableListOf<SongEntity>()

        var playlistEntity = repository.checkPlaylistExists(playlistName).firstOrNull()

        val playListId = if (playlistEntity == null) {
            playlistEntity = PlaylistEntity(System.currentTimeMillis(), playlistName)
            repository.createPlaylist(playlistEntity)
        } else {
            playlistEntity.playListId
        }

        // Get songs from m3u playlist files
        zipIn.bufferedReader().lineSequence().forEach { line ->
            if (line.startsWith(M3UConstants.DATA)) {
                val values = line.split(M3UConstants.SPIT)
                if (values.size == 3) {
                    if (File(line).exists()) {
                        val s = songRepository.songsByFilePath(values[1])
                        if (s.isNotEmpty()) {
                            songs.addAll(s.filter {
                                !isExistInPlaylist(playListId, it.id)
                            }.map {
                                it.toSongEntity(playlistEntity.playListId)
                            })
                        } else {
                            val id = values[2].toLong()
                            if (!isExistInPlaylist(playListId, id)) {
                                songs.add(
                                    SongEntity(0, playListId, id)
                                )
                            }
                        }
                    }
                }
            } else if (line.startsWith(M3UConstants.ID)) {
                val values = line.split(M3UConstants.SPIT)
                if (values.size == 2) {
                    val id = values[1].toLong()
                    if (!isExistInPlaylist(playListId, id)) {
                        songs.add(
                            SongEntity(0, playListId, id)
                        )
                    }
                }
            }
        }
        repository.insertSongEntities(songs)
    }

    private fun isExistInPlaylist(playListId: Long, songId: Long): Boolean {
        return repository.getSongEntity(playListId, songId) != null
    }

    fun getBackupRoot(): File {
        return File(
            getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS),
            "PureMusic/Backups"
        )
    }

    const val BACKUP_EXTENSION = "rmbak"
    const val APPEND_EXTENSION = ".$BACKUP_EXTENSION"
    private const val PLAYLISTS_PATH = "Playlists"
    private const val SETTINGS_PATH = "prefs"
    private const val IMAGES_PATH = "userImages"
    private const val CUSTOM_ARTISTS_PATH = "artistImages"
    private const val THEME_PREFS_KEY_DEFAULT = "[[kabouzeid_app-theme-helper]]"

    private fun ZipEntry.isPlaylistEntry(): Boolean {
        return name.startsWith(PLAYLISTS_PATH)
    }

    private fun ZipEntry.isPreferenceEntry(): Boolean {
        return name.startsWith(SETTINGS_PATH)
    }

    private fun ZipEntry.isImageEntry(): Boolean {
        return name.startsWith(IMAGES_PATH)
    }

    private fun ZipEntry.isCustomArtistEntry(): Boolean {
        return name.startsWith(CUSTOM_ARTISTS_PATH)
    }

    private fun ZipEntry.isCustomArtistImageEntry(): Boolean {
        return name.startsWith(CUSTOM_ARTISTS_PATH) && name.contains("custom_artist_images")
    }

    private fun ZipEntry.isCustomArtistPrefEntry(): Boolean {
        return name.startsWith(CUSTOM_ARTISTS_PATH) && name.contains("prefs")
    }

    private fun ZipEntry.getFileName(): String {
        return name.substring(name.lastIndexOf(File.separator) + 1)
    }

    fun getTimeStamp(): String {
        return SimpleDateFormat("dd-MMM yyyy HHmmss", Locale.getDefault()).format(Date())
    }
}

data class ZipItem(val filePath: String, val zipPath: String)

fun CharSequence.sanitize(): String {
    return toString().replace("/", "_")
        .replace(":", "_")
        .replace("*", "_")
        .replace("?", "_")
        .replace("\"", "_")
        .replace("<", "_")
        .replace(">", "_")
        .replace("|", "_")
        .replace("\\", "_")
        .replace("&", "_")
}

fun String.child(child: String): String {
    return this + File.separator + child
}

enum class BackupContent {
    SETTINGS,
    USER_IMAGES,
    CUSTOM_ARTIST_IMAGES,
    PLAYLISTS
}