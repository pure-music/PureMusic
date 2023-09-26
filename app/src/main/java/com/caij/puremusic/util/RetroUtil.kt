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

import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.content.res.Configuration
import android.graphics.Point
import android.os.Build
import androidx.core.net.toUri
import com.caij.puremusic.App.Companion.getContext
import java.net.InetAddress
import java.net.NetworkInterface
import java.text.DecimalFormat
import java.util.*

object RetroUtil {
    fun formatValue(numValue: Float): String {
        var value = numValue
        val arr = arrayOf("", "K", "M", "B", "T", "P", "E")
        var index = 0
        while (value / 1000 >= 1) {
            value /= 1000
            index++
        }
        val decimalFormat = DecimalFormat("#.##")
        return String.format("%s %s", decimalFormat.format(value.toDouble()), arr[index])
    }

    fun frequencyCount(frequency: Int): Float {
        return (frequency / 1000.0).toFloat()
    }

    fun getScreenSize(context: Context): Point {
        val x: Int = context.resources.displayMetrics.widthPixels
        val y: Int = context.resources.displayMetrics.heightPixels
        return Point(x, y)
    }

    val statusBarHeight: Int
        get() {
            var result = 0
            val resourceId = getContext()
                .resources
                .getIdentifier("status_bar_height", "dimen", "android")
            if (resourceId > 0) {
                result = getContext().resources.getDimensionPixelSize(resourceId)
            }
            return result
        }

    val navigationBarHeight: Int
        get() {
            var result = 0
            val resourceId = getContext()
                .resources
                .getIdentifier("navigation_bar_height", "dimen", "android")
            if (resourceId > 0) {
                result = getContext().resources.getDimensionPixelSize(resourceId)
            }
            return result
        }

    val isLandscape: Boolean
        get() = (getContext().resources.configuration.orientation
                == Configuration.ORIENTATION_LANDSCAPE)
    val isTablet: Boolean
        get() = (getContext().resources.configuration.smallestScreenWidthDp
                >= 600)

    fun getIpAddress(useIPv4: Boolean): String? {
        try {
            val interfaces: List<NetworkInterface> =
                Collections.list(NetworkInterface.getNetworkInterfaces())
            for (intf in interfaces) {
                val addrs: List<InetAddress> = Collections.list(intf.inetAddresses)
                for (addr in addrs) {
                    if (!addr.isLoopbackAddress) {
                        val sAddr = addr.hostAddress

                        if (sAddr != null) {
                            val isIPv4 = sAddr.indexOf(':') < 0
                            if (useIPv4) {
                                if (isIPv4) return sAddr
                            } else {
                                if (!isIPv4) {
                                    val delim = sAddr.indexOf('%') // drop ip6 zone suffix
                                    return if (delim < 0) {
                                        sAddr.uppercase()
                                    } else {
                                        sAddr.substring(
                                            0,
                                            delim
                                        ).uppercase()
                                    }
                                }
                            }
                        } else {
                            return null
                        }

                    }
                }
            }
        } catch (ignored: Exception) {
        }
        return ""
    }

    @JvmStatic
    fun getLanguageOnly(context: Context): String {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            val local = context.resources.configuration.locales.get(0)
            local.language
        } else {
            val local = context.resources.configuration.locale
            local.language
        }
    }

    fun onClick(dialog: DialogInterface) {
        try { //下面三句控制弹框的关闭
            val field = Dialog::class.java.getDeclaredField("mShowing")
            field.isAccessible = true
            field[dialog] = false //true表示要关闭
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }
    }

    fun dismissDialog(dialog: DialogInterface) {
        try { //下面三句控制弹框的关闭
            val field = Dialog::class.java.getDeclaredField("mShowing")
            field.isAccessible = true
            field[dialog] = true //true表示要关闭
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }
        dialog.dismiss()
    }

    fun toQA(context: Context) {
        if (Locale.getDefault().language == "zh") {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = "https://music.caij.xyz/faq/zh/".toUri()
            context.startActivity(intent)
        }
    }
}