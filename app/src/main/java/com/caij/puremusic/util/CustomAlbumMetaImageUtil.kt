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

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit
import com.caij.puremusic.App
import com.caij.puremusic.db.model.Album
import java.io.File
import java.io.IOException
import java.util.*

class CustomAlbumMetaImageUtil private constructor(val context: Context) {

    private val mPreferences: SharedPreferences = SPs.getSharedPreferences(context,
        CUSTOM_SONG_IMAGE_PREFS,
        Context.MODE_PRIVATE
    )

    fun saveImage(albumId: Long, artworkData: ByteArray) {
        val dir = File(context.filesDir, FOLDER_NAME)
        if (!dir.exists()) {
            if (!dir.mkdirs()) { // create the folder
                return
            }
        }
        val file = File(dir, getFileName(albumId))

        var successful = false
        try {
            file.outputStream().buffered().use { bos ->
                bos.write(artworkData)
                successful = true
            }
        } catch (e: IOException) {

        }

        if (successful) {
            mPreferences.edit { putInt(getFileName(albumId), artworkData.size) }
        }
    }

    // shared prefs saves us many IO operations
    fun hasCustomSongImage(albumId: Long): Boolean {
        return mPreferences.contains(getFileName(albumId))
    }

    companion object {
        private const val CUSTOM_SONG_IMAGE_PREFS = "custom_album_meta_image"
        private const val FOLDER_NAME = "/custom_album_meta_images/"

        @SuppressLint("StaticFieldLeak")
        private var sInstance: CustomAlbumMetaImageUtil? = null

        fun getInstance(context: Context): CustomAlbumMetaImageUtil {
            if (sInstance == null) {
                sInstance = CustomAlbumMetaImageUtil(context.applicationContext)
            }
            return sInstance!!
        }

        private fun getFileName(albumId: Long): String {
            // replace everything that is not a letter or a number with _
            return String.format(Locale.US, "#%d.jpeg", albumId)
        }

        fun getFileName(album: Album): String {
            return getFileName(album.id)
        }

        @JvmStatic
        fun getFile(albumId: Long): File {
            val dir = File(App.getContext().filesDir, FOLDER_NAME)
            return File(dir, getFileName(albumId))
        }
    }
}