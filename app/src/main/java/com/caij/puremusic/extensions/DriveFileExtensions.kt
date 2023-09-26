package com.caij.puremusic.extensions

import com.caij.puremusic.drive.model.DriveFile
import com.caij.puremusic.model.DriveFileParcelable

val DriveFile.toParcelable: DriveFileParcelable
    get() = DriveFileParcelable(
        id = this.id,
        fileName = this.fileName,
        createTime = this.createTime,
        updateTime = this.updateTime,
        url = this.url,
        fileLength = this.fileLength,
        sourceId = this.sourceId,
        sourceType = this.sourceType,
        filePath = this.filePath,
        fileId = this.fileId,
        isDirectory = this.isDirectory
    )

val DriveFileParcelable.toDriveFile: DriveFile
    get() = DriveFile(
        id = this.id,
        fileName = this.fileName,
        createTime = this.createTime,
        updateTime = this.updateTime,
        url = this.url,
        fileLength = this.fileLength,
        sourceId = this.sourceId,
        sourceType = this.sourceType,
        filePath = this.filePath,
        fileId = this.fileId,
        isDirectory = this.isDirectory
    )


