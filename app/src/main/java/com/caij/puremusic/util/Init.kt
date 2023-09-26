package com.caij.puremusic.util

import android.app.Application
import com.caij.puremusic.BuildConfig
import com.caij.puremusic.ThreadManager
import com.caij.puremusic.analyze.Catee

object Init {

    fun initCatee(application: Application, channel: String) {
        ThreadManager.getInstance().NET_WORK_EXECUTOR.execute(Runnable {
            Catee.init(application, channel, BuildConfig.DEBUG, BuildConfig.VERSION_NAME)
        })
    }
}