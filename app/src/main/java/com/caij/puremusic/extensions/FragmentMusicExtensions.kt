package com.caij.puremusic.extensions

import android.webkit.MimeTypeMap
import androidx.annotation.WorkerThread
import com.caij.puremusic.db.DatabaseUtil
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.util.RetroUtil
import org.jaudiotagger.audio.AudioFileIO
import java.io.File
import java.net.URLEncoder

@WorkerThread
fun getSongInfo(song: Song): String {
    if (song.isLocal) {
        val file = File(song.url)
        if (file.exists()) {
            return try {
                val audioHeader = AudioFileIO.read(File(song.url)).audioHeader
                val string: StringBuilder = StringBuilder()
                string.append(audioHeader.encodingType).append(" • ")
                string.append(audioHeader.bitRate).append(" kb/s").append(" • ")
                string.append(RetroUtil.frequencyCount(audioHeader.sampleRate.toInt()))
                    .append(" kHz")
                string.toString()
            } catch (er: Exception) {
                " - "
            }
        }
    } else {
        val audioFormat = DatabaseUtil.pureMusicDatabase.serverAudioFormatDao().get(song.id)
        if (audioFormat != null) {
            val string: StringBuilder = StringBuilder()
            string.append(audioFormat.mimeType).append(" • ")
            string.append(audioFormat.bitRate).append(" kb/s").append(" • ")
            string.append(RetroUtil.frequencyCount(audioFormat.sampleRate.toInt()))
                .append(" kHz")
           return string.toString()
        }
    }
    return "-"
}

private fun getMimeType(url: String): String {
    var type: String? = MimeTypeMap.getFileExtensionFromUrl(
        URLEncoder.encode(url, "utf-8")
    ).uppercase()
    if (type == null) {
        type = url.substring(url.lastIndexOf(".") + 1)
    }
    return type
}