package com.caij.puremusic.db

import com.caij.puremusic.db.model.Song

data class SongEntityWrapper(val playlistCreatorId: Long, val song: Song)