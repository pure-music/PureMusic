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

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.media.audiofx.AudioEffect
import android.widget.Toast
import com.caij.puremusic.R
import com.caij.puremusic.activities.DriveModeActivity
import com.caij.puremusic.activities.LicenseActivity
import com.caij.puremusic.activities.SupportDevelopmentActivity
import com.caij.puremusic.activities.WebActivity
import com.caij.puremusic.analyze.ChannelUtil
import com.caij.puremusic.extensions.showToast
import com.caij.puremusic.helper.MusicPlayerRemote.audioSessionId

object NavigationUtil {

    fun goToOpenSource(activity: Activity) {
        activity.startActivity(
            Intent(activity, LicenseActivity::class.java), null
        )
    }

    fun goToSupportDevelopment(activity: Activity) {
        activity.startActivity(
            Intent(activity, SupportDevelopmentActivity::class.java), null
        )
    }

    fun gotoDriveMode(activity: Activity) {
        activity.startActivity(
            Intent(activity, DriveModeActivity::class.java), null
        )
    }

//    fun gotoWhatNews(activity: FragmentActivity) {
//        val changelogBottomSheet = WhatsNewFragment()
//        changelogBottomSheet.show(activity.supportFragmentManager, WhatsNewFragment.TAG)
//    }

    fun openEqualizer(activity: Activity) {
        stockEqualizer(activity)
    }

    private fun stockEqualizer(activity: Activity) {
        val sessionId = audioSessionId
        if (sessionId == AudioEffect.ERROR_BAD_VALUE) {
            activity.showToast(R.string.no_audio_ID, Toast.LENGTH_LONG)
        } else {
            try {
                val effects = Intent(AudioEffect.ACTION_DISPLAY_AUDIO_EFFECT_CONTROL_PANEL)
                effects.putExtra(AudioEffect.EXTRA_AUDIO_SESSION, sessionId)
                effects.putExtra(AudioEffect.EXTRA_CONTENT_TYPE, AudioEffect.CONTENT_TYPE_MUSIC)
                activity.startActivityForResult(effects, 0)
            } catch (notFound: ActivityNotFoundException) {
                activity.showToast(R.string.no_equalizer)
            }
        }
    }

    fun openPrivacy(context: Context) {
        val intent = Intent(context, WebActivity::class.java)
        if (RetroUtil.getLanguageOnly(context).startsWith("zh")) {
            intent.putExtra("url", "https://music.caij.xyz/privacy/zh/")
        } else {
            if (ChannelUtil.getChannel(context) == "google") {
                intent.putExtra("url", "https://music.caij.xyz/privacy")
            } else {
                intent.putExtra("url", "https://music.caij.xyz/privacy/zh/")
            }
        }
        context.startActivity(intent)
    }
}