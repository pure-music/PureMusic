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
import android.graphics.Bitmap
import android.widget.Toast
import androidx.core.content.edit
import com.caij.puremusic.App
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.extensions.showToast
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.withContext
import java.io.File
import java.io.IOException
import java.util.*

class CustomSongMeteImageUtil private constructor(val context: Context) {

    private val mPreferences: SharedPreferences = SPs.getSharedPreferences(context,
        CUSTOM_SONG_IMAGE_PREFS,
        Context.MODE_PRIVATE
    )

    fun saveImage(song: Song, artworkData: ByteArray) {
        val dir = File(context.filesDir, FOLDER_NAME)
        if (!dir.exists()) {
            if (!dir.mkdirs()) { // create the folder
                return
            }
        }
        val file = File(dir, getFileName(song))

        var successful = false
        try {
            file.outputStream().buffered().use { bos ->
                bos.write(artworkData)
                successful = true
            }
        } catch (e: IOException) {

        }

        if (successful) {
            mPreferences.edit { putInt(getFileName(song), artworkData.size) }
        }
    }

    suspend fun resetCustomSongImage(song: Song) {
        withContext(IO) {
            mPreferences.edit { putBoolean(getFileName(song), false) }
            val file = getFile(song)
            if (file.exists()) {
                file.delete()
            }
        }
    }

    // shared prefs saves us many IO operations
    fun hasCustomSongImage(song: Song): Boolean {
        return mPreferences.contains(getFileName(song))
    }

    fun hasCustomSongImage(song: Song, artworkData: ByteArray): Boolean {
        if (hasCustomSongImage(song)) {
            val size = mPreferences.getInt(getFileName(song), 0)
            if (size == artworkData.size) return true
        }
        return false
    }

    companion object {
        private const val CUSTOM_SONG_IMAGE_PREFS = "custom_song_meta_image_v2"
        private const val FOLDER_NAME = "/custom_song_meta_images/"

        @SuppressLint("StaticFieldLeak")
        private var sInstance: CustomSongMeteImageUtil? = null

        fun getInstance(context: Context): CustomSongMeteImageUtil {
            if (sInstance == null) {
                sInstance = CustomSongMeteImageUtil(context.applicationContext)
            }
            return sInstance!!
        }

        private fun getFileName(songId: Long): String {
            // replace everything that is not a letter or a number with _
            return String.format(Locale.US, "#%d.jpeg", songId)
        }

        fun getFileName(song: Song): String {
            return getFileName(song.id)
        }

        @JvmStatic
        fun getFile(song: Song): File {
            val dir = File(App.getContext().filesDir, FOLDER_NAME)
            return File(dir, getFileName(song))
        }
    }
}