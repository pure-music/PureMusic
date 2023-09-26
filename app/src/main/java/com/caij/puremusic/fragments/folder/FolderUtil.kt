package com.caij.puremusic.fragments.folder

import com.caij.puremusic.db.DatabaseUtil
import com.caij.puremusic.drive.FolderManager

object FolderUtil {
    val folderManager: FolderManager = FolderManager(DatabaseUtil.database)
}