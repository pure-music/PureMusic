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
package com.caij.puremusic.extensions

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Build
import android.provider.Settings
import android.view.View
import android.view.ViewGroup
import androidx.annotation.DimenRes
import androidx.appcompat.app.AppCompatActivity
import code.name.monkey.appthemehelper.util.ToolbarContentTintHelper
import com.caij.puremusic.VipUIConfig
import com.caij.vip.DonatedActivity
import com.caij.vip.InitConfig
import com.google.android.material.appbar.MaterialToolbar

fun AppCompatActivity.applyToolbar(toolbar: MaterialToolbar) {
    ToolbarContentTintHelper.colorBackButton(toolbar)
    setSupportActionBar(toolbar)
}

inline fun <reified T : Any> Activity.extra(key: String, default: T? = null) = lazy {
    val value = intent?.extras?.get(key)
    if (value is T) value else default
}

inline fun <reified T : Any> Intent.extra(key: String, default: T? = null) = lazy {
    val value = extras?.get(key)
    if (value is T) value else default
}

inline fun <reified T : Any> Activity.extraNotNull(key: String, default: T? = null) = lazy {
    val value = intent?.extras?.get(key)
    requireNotNull(if (value is T) value else default) { key }
}

fun Activity.dip(@DimenRes id: Int): Int {
    return resources.getDimensionPixelSize(id)
}

inline val Activity.rootView: View get() = findViewById<ViewGroup>(android.R.id.content).getChildAt(0)

fun Context.goToProVersion() {
    InitConfig.provider = VipUIConfig(this.accentColor(), this.colorBackground(), this.textColorPrimary(), this.textColorSecondary())
    startActivity(Intent(this, DonatedActivity::class.java))
}

fun Context.getDeviceName(): String {
    // Use name from device settings
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N_MR1) {
        val name = Settings.Global.getString(contentResolver, Settings.Global.DEVICE_NAME)
        if (name != null) return name
    }

    // Concatenate the name based on manufacturer and model
    val manufacturer = Build.MANUFACTURER
    val model = Build.MODEL

    return if (model.startsWith(manufacturer) || manufacturer.isBlank()) model
    else "$manufacturer $model"
}

public fun androidDevice(context: Context): String {
    @SuppressLint("HardwareIds")
    val id = Settings.Secure.getString(context.contentResolver, Settings.Secure.ANDROID_ID)
    return id
}
