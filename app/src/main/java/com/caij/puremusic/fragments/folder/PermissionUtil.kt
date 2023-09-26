package com.caij.puremusic.fragments.folder

import android.Manifest
import code.name.monkey.appthemehelper.util.VersionUtils

object PermissionUtil {

    @JvmStatic
    public fun getStoragePermissionsToRequest(): Array<String> {
        return mutableListOf(Manifest.permission.READ_EXTERNAL_STORAGE).apply {
            if (!VersionUtils.hasR()) {
                add(Manifest.permission.WRITE_EXTERNAL_STORAGE)
            }
        }.toTypedArray()
    }

}