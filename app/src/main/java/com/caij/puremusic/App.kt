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
package com.caij.puremusic

import android.app.Application
import code.name.monkey.appthemehelper.ThemeStore
import code.name.monkey.appthemehelper.util.VersionUtils
import com.caij.lib.lifemanager.ActivityStackManager
import com.caij.lib.toast.ToastUtil
import com.caij.puremusic.analyze.Catee
import com.caij.puremusic.analyze.ChannelUtil
import com.caij.puremusic.analyze.RemoteConfig
import com.caij.puremusic.appshortcuts.DynamicShortcutManager
import com.caij.puremusic.drive.DriveFactorys
import com.caij.puremusic.drive.adrive.ADriveDriveFactory
import com.caij.puremusic.drive.baidu.BaiduDriveFactory
import com.caij.puremusic.drive.dropbox.DropboxDriveFactory
import com.caij.puremusic.drive.emby.EmbyFactory
import com.caij.puremusic.drive.google.GoogleDriveFactory
import com.caij.puremusic.drive.jellyfin.JellyfinFactory
import com.caij.puremusic.drive.onedrive.OneDriveFactory
import com.caij.puremusic.drive.plex.PlexFactory
import com.caij.puremusic.drive.subsonic.SubsonicFactory
import com.caij.puremusic.drive.webdav.WebDAVDriveFactory
import com.caij.puremusic.extensions.accentColor
import com.caij.puremusic.extensions.colorBackground
import com.caij.puremusic.extensions.textColorPrimary
import com.caij.puremusic.extensions.textColorSecondary
import com.caij.puremusic.fragments.folder.FolderUtil
import com.caij.puremusic.helper.WallpaperAccentManager
import com.caij.puremusic.util.*
import com.caij.vip.InitConfig
import com.caij.vip.VipWrapper
import io.github.aakira.napier.DebugAntilog
import io.github.aakira.napier.Napier
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    private val wallpaperAccentManager = WallpaperAccentManager(this)

    override fun onCreate() {
        super.onCreate()
        instance = this

        if (BuildConfig.DEBUG) {
            Napier.base(DebugAntilog())
        }

        BuildConfig.sBuildHelper.init(this)

        startKoin {
            androidContext(this@App)
            modules(appModules)
        }
        // default theme
        ThemeStore.themeValue = DefaultThemeValue()
        if (!ThemeStore.isConfigured(this, 3)) {
            ThemeStore.editTheme(this)
                .accentColorRes(code.name.monkey.appthemehelper.R.color.m3_accent_color2)
                .coloredNavigationBar(true)
                .commit()
        }
        wallpaperAccentManager.init()

        if (VersionUtils.hasNougatMR())
            DynamicShortcutManager(this).initDynamicShortcuts()

        InitConfig.provider = VipUIConfig(this.accentColor(), this.colorBackground(), this.textColorPrimary(), this.textColorSecondary())

        // Set Default values for now playing preferences
        // This will reduce startup time for now playing settings fragment as Preference listener of AbsSlidingMusicPanelActivity won't be called
//        PreferenceManager.setDefaultValues(this, R.xml.pref_now_playing_screen, false)

        ActivityStackManager.getInstance().init(this)
        HttpManager.getInstance().initSelf(this, false)
        DownManager.getInstance().initSelf(MediaHttp.getOkHttpClient())

        VipWrapper.init(this, ChannelUtil.isGoogle(this))

        ToastUtil.init(this)


//        val httpClient = KtorUtil.client
        val httpClient = HttpUtil.httpClient
        val folderManager = FolderUtil.folderManager
        DriveFactorys.addFactory(WebDAVDriveFactory(httpClient))
        DriveFactorys.addFactory(OneDriveFactory(httpClient, folderManager))
        DriveFactorys.addFactory(GoogleDriveFactory(httpClient, folderManager))
        DriveFactorys.addFactory(DropboxDriveFactory(httpClient, folderManager))
        DriveFactorys.addFactory(ADriveDriveFactory(httpClient, folderManager))
        DriveFactorys.addFactory(BaiduDriveFactory(httpClient, folderManager))
        DriveFactorys.addFactory(SubsonicFactory(httpClient))
        DriveFactorys.addFactory(JellyfinFactory(httpClient))
        DriveFactorys.addFactory(EmbyFactory(httpClient))
        DriveFactorys.addFactory(PlexFactory(httpClient))

        val showPrivacy = SPs.getGlobalSharedPreferences(this).getBoolean(SHOW_PRIVACY, true)
        if (!showPrivacy) {
            VipWrapper.getInstance(this)
            val channel = ChannelUtil.getChannel(this)
            Catee.preInit(this, channel)
            Init.initCatee(this, channel)
        }
    }

    override fun onTerminate() {
        super.onTerminate()
        wallpaperAccentManager.release()
    }

    companion object {
        private var instance: App? = null

        fun getContext(): App {
            return instance!!
        }

        fun isProVersion(): Boolean {
//            return true
            return VipWrapper.getInstance(instance).wwwwwwww()
        }

        fun isAllowedPlayDrive(): Boolean {
            return isProVersion() || RemoteConfig.getBoolean("isAllowedPlayDrive", false)
        }

        fun isAllowedCollectImage(): Boolean {
            return isProVersion() || RemoteConfig.getBoolean("isAllowedCollectImage", false)
        }
    }
}
