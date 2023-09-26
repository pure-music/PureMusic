package com.caij.puremusic.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DriveFileParcelable(val id: String,
                               val fileName: String,
                               val createTime: Long,
                               val updateTime: Long,
                               val url: String,
                               val fileLength: Long,
                               val sourceId: Long,
                               val sourceType: Int,
                               val filePath: String,
                               val fileId: String,
                               val isDirectory: Boolean): Parcelable
