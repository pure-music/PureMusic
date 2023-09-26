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
package com.caij.puremusic.db

import com.caij.puremusic.database.*

//@Database(
//    entities = [HistoryEntity::class, PlayCountEntity::class],
//    version = 1,
//    exportSchema = false
//)
abstract class PureMusicDatabase {
    abstract fun playlistDao(): PlaylistDao
    abstract fun playCountDao(): PlayCountDao
    abstract fun historyDao(): HistoryDao
    abstract fun songDao(): SongsDao
    abstract fun albumDao(): AlbumDao
    abstract fun artistDao(): ArtistDao
    abstract fun songEntityDao(): SongEntityDao
    abstract fun playbackDao(): PlaybackDao
    abstract fun serverLyricsDao(): ServerLyricsDao
    abstract fun serverSongCoverDao(): ServerSongCoverDao
    abstract fun serverArtistCoverDao(): ServerArtistCoverDao
    abstract fun serverAudioFormatDao(): ServerAudioFormatDao
    abstract fun driveFileDownUrlInfoDao(): DriveFileDownUrlInfoDao
    abstract fun searchAlbumResultDao(): SearchAlbumResultDao
}
