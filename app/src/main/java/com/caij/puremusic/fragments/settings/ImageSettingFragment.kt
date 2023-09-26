/*
 * Copyright (c) 2020 Hemanth Savarla.
 *
 * Licensed under the GNU General Public License v3
 *
 * This is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 */
package com.caij.puremusic.fragments.settings

import android.os.Bundle
import android.view.View
import androidx.lifecycle.lifecycleScope
import androidx.preference.Preference
import com.bumptech.glide.Glide
import com.caij.puremusic.AUTO_DOWNLOAD_IMAGES_POLICY
import com.caij.puremusic.AUTO_DOWNLOAD_SONG_IMAGES_POLICY
import com.caij.puremusic.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * @author Hemanth S (h4h13).
 */

class ImageSettingFragment : AbsSettingsFragment() {
    override fun invalidateSettings() {
        val autoDownloadImagesPolicy: Preference = findPreference(AUTO_DOWNLOAD_IMAGES_POLICY)!!
        setSummary(autoDownloadImagesPolicy)
        autoDownloadImagesPolicy.setOnPreferenceChangeListener { _, o ->
            setSummary(autoDownloadImagesPolicy, o)
            resetImageCache()
            true
        }

        val autoDownloadSongImagesPolicy: Preference = findPreference(AUTO_DOWNLOAD_SONG_IMAGES_POLICY)!!
        setSummary(autoDownloadSongImagesPolicy)
        autoDownloadSongImagesPolicy.setOnPreferenceChangeListener { _, o ->
            setSummary(autoDownloadSongImagesPolicy, o)
            resetImageCache()
            true
        }
    }

    private fun resetImageCache() {
        lifecycleScope.launch(Dispatchers.IO) {
            Glide.get(requireActivity()).clearDiskCache()
            withContext(Dispatchers.Main) {
                Glide.get(requireActivity()).clearMemory()
            }
        }
    }

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        super.onCreatePreferences(savedInstanceState, rootKey)
        addPreferencesFromResource(R.xml.pref_images)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val preference: Preference? = findPreference(AUTO_DOWNLOAD_IMAGES_POLICY)
        preference?.let { setSummary(it) }
        requireActivity().title = getString(R.string.pref_header_images)
    }
}
