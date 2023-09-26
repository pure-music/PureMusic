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

import android.Manifest.permission.BLUETOOTH_CONNECT
import android.content.Intent
import android.content.pm.PackageManager.PERMISSION_GRANTED
import android.media.audiofx.AudioEffect
import android.os.Bundle
import androidx.core.app.ActivityCompat
import androidx.preference.Preference
import code.name.monkey.appthemehelper.util.VersionUtils
import com.caij.puremusic.BLUETOOTH_PLAYBACK
import com.caij.puremusic.EQUALIZER
import com.caij.puremusic.R
import com.caij.puremusic.activities.base.AbsBaseActivity.Companion.BLUETOOTH_PERMISSION_REQUEST
import com.caij.puremusic.util.NavigationUtil

/**
 * @author Hemanth S (h4h13).
 */

class AudioSettings : AbsSettingsFragment() {
    override fun invalidateSettings() {
        val eqPreference: Preference? = findPreference(EQUALIZER)
        if (!hasEqualizer()) {
            eqPreference?.isEnabled = false
            eqPreference?.summary = resources.getString(R.string.no_equalizer)
        } else {
            eqPreference?.isEnabled = true
        }
        eqPreference?.setOnPreferenceClickListener {
            NavigationUtil.openEqualizer(requireActivity())
            true
        }
        val bluetoothPreference: Preference? = findPreference(BLUETOOTH_PLAYBACK)
        if (VersionUtils.hasS()) {
            bluetoothPreference?.setOnPreferenceChangeListener { _, newValue ->
                if (newValue as Boolean) {
                    if (ActivityCompat.checkSelfPermission(requireContext(),
                            BLUETOOTH_CONNECT) != PERMISSION_GRANTED
                    ) {
                        ActivityCompat.requestPermissions(requireActivity(), arrayOf(
                            BLUETOOTH_CONNECT), BLUETOOTH_PERMISSION_REQUEST)
                    }
                }
                return@setOnPreferenceChangeListener true
            }
        }
    }

    private fun hasEqualizer(): Boolean {
        val effects = Intent(AudioEffect.ACTION_DISPLAY_AUDIO_EFFECT_CONTROL_PANEL)

        val pm = requireActivity().packageManager
        val ri = pm.resolveActivity(effects, 0)
        return ri != null
    }

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        super.onCreatePreferences(savedInstanceState, rootKey)
        addPreferencesFromResource(R.xml.pref_audio)
        requireActivity().title = getString(R.string.pref_header_audio)
    }
}
