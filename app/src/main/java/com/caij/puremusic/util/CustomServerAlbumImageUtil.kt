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
import com.caij.puremusic.extensions.showToast
import com.caij.puremusic.db.model.Album
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.withContext
import java.io.File
import java.io.IOException
import java.util.*

class CustomServerAlbumImageUtil private constructor(val context: Context) {

    fun setCustomAlbumImage(albumId: String, url: String) {
        val mPreferences: SharedPreferences = SPs.getSharedPreferences(context,
            CUSTOM_ALBUM_IMAGE_PREFS,
            Context.MODE_PRIVATE
        )
        mPreferences.edit { putString(albumId.toString(), url) }
    }

    fun getCustomAlbumImage(albumId: Long): String {
        val mPreferences: SharedPreferences = SPs.getSharedPreferences(context,
            CUSTOM_ALBUM_IMAGE_PREFS,
            Context.MODE_PRIVATE
        )
        return mPreferences.getString(albumId.toString(), "")!!
    }

    fun resetCustomAlbumImage(albumId: String) {
        val mPreferences: SharedPreferences = SPs.getSharedPreferences(context,
            CUSTOM_ALBUM_IMAGE_PREFS,
            Context.MODE_PRIVATE
        )
        mPreferences.edit().remove(albumId).apply()
    }

    fun resetCustomAlbumImage(albumIds: List<String>) {
        val mPreferences: SharedPreferences = SPs.getSharedPreferences(context,
            CUSTOM_ALBUM_IMAGE_PREFS,
            Context.MODE_PRIVATE
        )
        val editor = mPreferences.edit()
        for (albumId in albumIds) {
            editor.remove(albumId)
        }
        editor.apply()
    }


    // shared prefs saves us many IO operations
    fun hasCustomAlbumImage(albumId: Long): Boolean {
        val mPreferences: SharedPreferences = SPs.getSharedPreferences(context,
            CUSTOM_ALBUM_IMAGE_PREFS,
            Context.MODE_PRIVATE
        )
        return mPreferences.contains(albumId.toString())
    }

    companion object {
        private const val CUSTOM_ALBUM_IMAGE_PREFS = "custom_server_album_image"

        @SuppressLint("StaticFieldLeak")
        private var sInstance: CustomServerAlbumImageUtil? = null

        fun getInstance(context: Context): CustomServerAlbumImageUtil {
            if (sInstance == null) {
                sInstance = CustomServerAlbumImageUtil(context.applicationContext)
            }
            return sInstance!!
        }
    }
}