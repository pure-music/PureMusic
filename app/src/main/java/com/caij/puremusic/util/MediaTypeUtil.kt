package com.caij.puremusic.util

object MediaTypeUtil {

    fun getAllowMediaType(): List<String> {
        val mediaType = ArrayList<String>()
        mediaType.add("mp3")
        mediaType.add("flac")
        mediaType.add("m4a")
        mediaType.add("MP3")
        mediaType.add("FLAC")
        mediaType.add("M4A")
        mediaType.add("wav")
        mediaType.add("WAV")
        return mediaType
    }
}