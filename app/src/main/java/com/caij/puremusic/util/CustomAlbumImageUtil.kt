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
import android.content.SharedPreferences
import android.graphics.Bitmap
import android.widget.Toast
import androidx.core.content.edit
import com.caij.puremusic.App
import com.caij.puremusic.extensions.showToast
import com.caij.puremusic.db.model.Album
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.withContext
import java.io.File
import java.io.IOException
import java.util.*

class CustomAlbumImageUtil private constructor(context: Context) {

    private val mPreferences: SharedPreferences = SPs.getSharedPreferences(context,
        CUSTOM_ALBUM_IMAGE_PREFS,
        Context.MODE_PRIVATE
    )

    suspend fun setCustomAlbumImage(album: Album, bitmap: Bitmap) {
        val context = App.getContext()
        withContext(IO) {
            saveImage(context, album, bitmap)
        }
    }

    private fun saveImage(context: Context, album: Album, bitmap: Bitmap) {
        val dir = File(context.filesDir, FOLDER_NAME)
        if (!dir.exists()) {
            if (!dir.mkdirs()) { // create the folder
                return
            }
        }
        val file = File(dir, getFileName(album))

        var successful = false
        try {
            file.outputStream().buffered().use { bos ->
                successful = ImageUtil.resizeBitmap(bitmap, 2048)
                    .compress(Bitmap.CompressFormat.JPEG, 100, bos)
            }
        } catch (e: IOException) {

        }

        if (successful) {
            mPreferences.edit { putBoolean(getFileName(album), true) }
        }
    }

    suspend fun resetCustomAlbumImage(album: Album) {
        withContext(IO) {
            mPreferences.edit { putBoolean(getFileName(album), false) }
            val file = getFile(album)
            if (file.exists()) {
                file.delete()
            }
        }
    }

    // shared prefs saves us many IO operations
    fun hasCustomAlbumImage(album: Album): Boolean {
        return mPreferences.getBoolean(getFileName(album), false)
    }

    fun hasCustomAlbumImage(albumId: Long): Boolean {
        return mPreferences.getBoolean(getFileName(albumId), false)
    }

    companion object {
        private const val CUSTOM_ALBUM_IMAGE_PREFS = "custom_album_image"
        private const val FOLDER_NAME = "/custom_album_images/"

        private var sInstance: CustomAlbumImageUtil? = null

        fun getInstance(context: Context): CustomAlbumImageUtil {
            if (sInstance == null) {
                sInstance = CustomAlbumImageUtil(context.applicationContext)
            }
            return sInstance!!
        }

        fun getFileName(albumId: Long): String {
            // replace everything that is not a letter or a number with _
            return String.format(Locale.US, "#%d.jpeg", albumId)
        }

        fun getFileName(album: Album): String {
            return getFileName(album.id)
        }


        @JvmStatic
        fun getFile(album: Album): File {
            val dir = File(App.getContext().filesDir, FOLDER_NAME)
            return File(dir, getFileName(album))
        }

        @JvmStatic
        fun getFile(albumId: Long): File {
            val dir = File(App.getContext().filesDir, FOLDER_NAME)
            return File(dir, getFileName(albumId))
        }
    }
}