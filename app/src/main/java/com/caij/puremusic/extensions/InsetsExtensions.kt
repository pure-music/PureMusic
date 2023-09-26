package com.caij.puremusic.extensions

import androidx.core.view.WindowInsetsCompat
import com.caij.puremusic.util.PreferenceUtil
import com.caij.puremusic.util.RetroUtil

fun WindowInsetsCompat?.getBottomInsets(): Int {
    return if (PreferenceUtil.isFullScreenMode) {
        return 0
    } else {
        this?.getInsets(WindowInsetsCompat.Type.systemBars())?.bottom ?: RetroUtil.navigationBarHeight
    }
}
