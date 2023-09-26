package com.caij.puremusic.model

import com.caij.puremusic.db.model.Album

data class AlbumWithCount(val album: Album, val count: Int)
