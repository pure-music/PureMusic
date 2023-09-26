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

import android.content.SharedPreferences
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.core.view.updatePadding
import androidx.preference.ListPreference
import androidx.preference.Preference
import androidx.preference.PreferenceDataStore
import code.name.monkey.appthemehelper.common.prefs.supportv7.ATEPreferenceFragmentCompat
import com.caij.puremusic.R
import com.caij.puremusic.extensions.dip
import com.caij.puremusic.extensions.goToProVersion
import com.caij.puremusic.extensions.showToast
import com.caij.puremusic.preferences.*
import com.caij.puremusic.util.PreferenceUtil
import dev.chrisbanes.insetter.applyInsetter

/**
 * @author Hemanth S (h4h13).
 */

abstract class AbsSettingsFragment : ATEPreferenceFragmentCompat() {

    internal fun showProToastAndNavigate(message: String) {
        showToast(getString(R.string.message_pro_feature, message))
        requireContext().goToProVersion()
    }

    internal fun setSummary(preference: Preference, value: Any?) {
        val stringValue = value.toString()
        if (preference is ListPreference) {
            val index = preference.findIndexOfValue(stringValue)
            preference.setSummary(if (index >= 0) preference.entries[index] else null)
        } else {
            preference.summary = stringValue
        }
    }

    abstract fun invalidateSettings()

    protected fun setSummary(preference: Preference?) {
        preference?.let {
            setSummary(
                it, PreferenceUtil.sharedPreferences
                    .getString(it.key, "")
            )
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setDivider(ColorDrawable(Color.TRANSPARENT))
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.S) {
            listView.overScrollMode = View.OVER_SCROLL_NEVER
        }

        listView.updatePadding(bottom = dip(R.dimen.mini_player_height))
        listView.applyInsetter {
            type(navigationBars = true) {
                padding(vertical = true)
            }
        }
        invalidateSettings()
    }

    override fun onDisplayPreferenceDialog(preference: Preference) {
        when (preference) {
            is LibraryPreference -> {
                val fragment = LibraryPreferenceDialog.newInstance()
                fragment.show(childFragmentManager, preference.key)
            }
            is NowPlayingScreenPreference -> {
                val fragment = NowPlayingScreenPreferenceDialog.newInstance()
                fragment.show(childFragmentManager, preference.key)
            }
            is AlbumCoverStylePreference -> {
                val fragment = AlbumCoverStylePreferenceDialog.newInstance()
                fragment.show(childFragmentManager, preference.key)
            }
            is BlacklistPreference -> {
                val fragment = BlacklistPreferenceDialog.newInstance()
                fragment.show(childFragmentManager, preference.key)
            }
            is DurationPreference -> {
                val fragment = DurationPreferenceDialog.newInstance()
                fragment.show(childFragmentManager, preference.key)
            }
            else -> super.onDisplayPreferenceDialog(preference)
        }
    }

    fun restartActivity() {
        activity?.recreate()
    }


    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        val sharedPreferences: SharedPreferences = PreferenceUtil.sharedPreferences
        preferenceManager.preferenceDataStore = object : PreferenceDataStore() {
            override fun putString(key: String, value: String?) {
                sharedPreferences.edit().putString(key, value).apply()
            }

            override fun putStringSet(key: String, values: Set<String>?) {
                sharedPreferences.edit().putStringSet(key, values).apply()
            }

            override fun putInt(key: String, value: Int) {
                sharedPreferences.edit().putInt(key, value).apply()
            }

            override fun putLong(key: String, value: Long) {
                sharedPreferences.edit().putLong(key, value).apply()
            }

            override fun putFloat(key: String, value: Float) {
                sharedPreferences.edit().putFloat(key, value).apply()
            }

            override fun putBoolean(key: String, value: Boolean) {
                sharedPreferences.edit().putBoolean(key, value).apply()
            }

            override fun getString(key: String, defValue: String?): String? {
                return sharedPreferences.getString(key, defValue)
            }

            override fun getStringSet(key: String, defValues: Set<String>?): Set<String>? {
                return sharedPreferences.getStringSet(key, defValues)
            }

            override fun getInt(key: String, defValue: Int): Int {
                return sharedPreferences.getInt(key, defValue)
            }

            override fun getLong(key: String, defValue: Long): Long {
                return sharedPreferences.getLong(key, defValue)
            }

            override fun getFloat(key: String, defValue: Float): Float {
                return sharedPreferences.getFloat(key, defValue)
            }

            override fun getBoolean(key: String, defValue: Boolean): Boolean {
                return sharedPreferences.getBoolean(key, defValue)
            }
        }
    }
}
