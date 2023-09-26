/*
 * Copyright (c) 2019 Hemanth Savarala.
 *
 * Licensed under the GNU General Public License v3
 *
 * This is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by
 *  the Free Software Foundation either version 3 of the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 */
package com.caij.puremusic.util

import android.content.Context
import android.util.Log
import com.caij.puremusic.extensions.isLocal
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.fragments.lyrics.LyricsFragment
import com.caij.puremusic.model.lyrics.AbsSynchronizedLyrics
import org.jaudiotagger.audio.AudioFileIO
import org.jaudiotagger.tag.FieldKey
import java.io.*

/**
 * Created by hefuyi on 2016/11/8.
 */
object LyricUtil {
    private val lrcRootPath =
        getExternalStorageDirectory().toString() + "/PureMusic/lyrics/"
    private const val TAG = "LyricUtil"
    fun writeLrcToLoc(
        title: String, artist: String, lrcContext: String
    ): File? {
        var writer: FileWriter? = null
        return try {
            val file = File(getLrcPath(title, artist))
            if (file.parentFile?.exists() != true) {
                file.parentFile?.mkdirs()
            }
            writer = FileWriter(getLrcPath(title, artist))
            writer.write(lrcContext)
            file
        } catch (e: IOException) {
            e.printStackTrace()
            null
        } finally {
            try {
                writer?.close()
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
    }

    //So in Retro, Lrc file can be same folder as Music File or in RetroMusic Folder
    // In this case we pass location of the file and Contents to write to file
    fun writeLrc(song: Song, lrcContext: String) {
        var writer: FileWriter? = null
        val location: File?
        try {
            if (isLrcOriginalFileExist(song.url)) {
                location = getLocalLyricOriginalFile(song.url)
            } else if (isLrcFileExist(song.title, song.artistName)) {
                location = getLocalLyricFile(song.title, song.artistName)
            } else {
                location = File(getLrcPath(song.title, song.artistName))
                if (location.parentFile?.exists() != true) {
                    location.parentFile?.mkdirs()
                }
            }
            writer = FileWriter(location)
            writer.write(lrcContext)
        } catch (e: IOException) {
            e.printStackTrace()
        } finally {
            try {
                writer?.close()
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
    }

    fun writeLrc(location: File, lrcContext: String) {
        var writer: FileWriter? = null
        try {
            if (location.parentFile?.exists() != true) {
                location.parentFile?.mkdirs()
            }
            writer = FileWriter(location)
            writer.write(lrcContext)
        } catch (e: IOException) {
            e.printStackTrace()
        } finally {
            try {
                writer?.close()
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
    }


    fun getLrcFile(context: Context, song: Song): File? {
        val file = when {
            LyricUtil.isLrcOriginalFileExist(song.url) -> {
                LyricUtil.getLocalLyricOriginalFile(song.url)
            }
            LyricUtil.isLrcFileExist(song.title, song.artistName) -> {
                LyricUtil.getLocalLyricFile(song.title, song.artistName)
            }
            LyricUtil.isNetLrcCacheFileExist(context, song) -> {
                LyricUtil.getLrcNetCacheFile(context, song)
            }
            LyricUtil.isLrcSongMetaCacheFileExist(context, song) -> {
                File(LyricUtil.getLrcSongMetaCachePath(context, song))
            }
            else -> {
                null
            }
        }
        return file
    }

    fun deleteLrcFile(title: String, artist: String): Boolean {
        val file = File(getLrcPath(title, artist))
        return file.delete()
    }

    fun isLrcFileExist(title: String, artist: String): Boolean {
        val file = File(getLrcPath(title, artist))
        return file.exists()
    }

    fun isLrcOriginalFileExist(path: String): Boolean {
        val file = File(getLrcOriginalPath(path))
        return file.exists()
    }

    fun isNetLrcCacheFileExist(context: Context, song: Song): Boolean {
        val file = File(getLrcNetCachePath(context, song))
        return file.exists()
    }

    fun getLocalLyricFile(title: String, artist: String): File? {
        val file = File(getLrcPath(title, artist))
        return if (file.exists()) {
            file
        } else {
            null
        }
    }

    fun getLocalLyricOriginalFile(path: String): File? {
        val file = File(getLrcOriginalPath(path))
        return if (file.exists()) {
            file
        } else {
            null
        }
    }

    private fun getLrcPath(title: String, artist: String): String {
        return "$lrcRootPath$title - $artist.lrc"
    }

    fun getLrcOriginalPath(filePath: String): String {
        return filePath.replace(filePath.substring(filePath.lastIndexOf(".") + 1), "lrc")
    }

    fun getLrcNetCacheFile(context: Context, song: Song): File? {
        val file = File(getLrcNetCachePath(context, song))
        return if (file.exists()) {
            file
        } else {
            null
        }
    }

    fun getLrcNetCachePath(context: Context, song: Song): String {
        val file = File(context.cacheDir, "/lrc/${song.id}-${song.sourceId}.lrc")
        return file.absolutePath
    }

    fun isLrcSongMetaCacheFileExist(context: Context, song: Song): Boolean {
        val file = File(getLrcSongMetaCachePath(context, song))
        return file.exists()
    }

    fun getLrcSongMetaCachePath(context: Context, song: Song): String {
        val file = File(context.cacheDir, "/lrcMeta/${song.id}-${song.sourceId}.lrc")
        return file.absolutePath
    }

    @Throws(Exception::class)
    fun getStringFromFile(title: String, artist: String): String {
        val file = File(getLrcPath(title, artist))
        val fin = FileInputStream(file)
        val ret = convertStreamToString(fin)
        fin.close()
        return ret
    }

    @Throws(Exception::class)
    private fun convertStreamToString(inputStream: InputStream): String {
        return inputStream.bufferedReader().readLines().joinToString(separator = "\n")
    }

    fun getStringFromLrc(file: File?): String {
        try {
            val reader = BufferedReader(FileReader(file))
            return reader.readLines().joinToString(separator = "\n")
        } catch (e: Exception) {
            Log.i("Error", "Error Occurred")
        }
        return ""
    }

//    fun getSyncedLyricsFile(context: Context, song: Song): File? {
//        if (song.isLocal) {
//            return when {
//                isLrcOriginalFileExist(song.url) -> {
//                    getLocalLyricOriginalFile(song.url)
//                }
//                isLrcFileExist(song.title, song.artistName) -> {
//                    getLocalLyricFile(song.title, song.artistName)
//                }
//                else -> {
//                    null
//                }
//            }
//        } else {
//            if (isNetLrcCacheFileExist(context, song)) {
//                return getLrcNetCacheFile(context, song)
//            } else if (isLrcSongMetaCacheFileExist(context, song)) {
//                return File(getLrcSongMetaCachePath(context, song))
//            }
//        }
//        return null
//    }

    fun getEmbeddedSyncedLyrics(data: String): String? {
        val embeddedLyrics = try {
            AudioFileIO.read(File(data)).tagOrCreateDefault.getFirst(FieldKey.LYRICS)
        } catch (e: Exception) {
            return null
        }
        return if (AbsSynchronizedLyrics.isSynchronized(embeddedLyrics)) {
            embeddedLyrics
        } else {
            null
        }
    }
}