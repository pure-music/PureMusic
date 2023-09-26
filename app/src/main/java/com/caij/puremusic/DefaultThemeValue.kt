package com.caij.puremusic

import android.content.Context
import code.name.monkey.appthemehelper.ThemeStore
import com.caij.puremusic.extensions.generalThemeValue
import com.caij.puremusic.extensions.isSystemDarkModeEnabled
import com.caij.puremusic.util.PreferenceUtil
import com.caij.puremusic.util.theme.ThemeMode

class DefaultThemeValue : ThemeStore.ThemeValue {
    override fun isBlack(context: Context): Boolean {
        return (context.generalThemeValue == ThemeMode.AUTO && context.isSystemDarkModeEnabled())
                || context.generalThemeValue == ThemeMode.DARK
                || context.generalThemeValue == ThemeMode.BLACK
    }

    override fun isMD3Enabled(context: Context): Boolean {
        return PreferenceUtil.materialYou
    }

    override fun isWallpaperAccentEnabled(context: Context): Boolean {
        return false
    }
}