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

import com.caij.puremusic.db.model.HistoryEntity
import com.caij.puremusic.db.model.PlayCountEntity
import com.caij.puremusic.db.model.PlaylistEntity
import com.caij.puremusic.db.model.SongEntity
import com.caij.puremusic.db.model.Song

//fun List<HistoryEntity>.fromHistoryToSongs(): List<Song> {
//    return map {
//        it.toSong()
//    }
//}

//fun List<SongEntity>.toSongsIO(): List<Song> {
//    return map {
//        it.toSong()
//    }
//}

fun Song.toHistoryEntity(timePlayed: Long): HistoryEntity {
    return HistoryEntity(
        id = id,
        timePlayed = timePlayed
    )
}

fun Song.toSongEntity(playListId: Long): SongEntity {
    return SongEntity(0, playListId, id)
}

//fun SongEntity.toSong(): Song {
//    return Song(
//        id = id,
//        title = title,
//        trackNumber = trackNumber,
//        year = year,
//        duration = duration,
//        data = data,
//        dateModified = dateModified,
//        albumId = albumId,
//        albumName = albumName,
//        artistId = artistId,
//        artistName = artistName,
//        composer = composer,
//        albumArtist = albumArtist,
//        dateAdded = dateAdded,
//        sourceType = sourceType,
//        sourceId = sourceId,
//        size = size
//    )
//}

//fun PlayCountEntity.toSong(): Song {
//    return Song(
//        id = id,
//        title = title,
//        trackNumber = trackNumber,
//        year = year,
//        duration = duration,
//        data = data,
//        dateModified = dateModified,
//        albumId = albumId,
//        albumName = albumName,
//        artistId = artistId,
//        artistName = artistName,
//        composer = composer,
//        albumArtist = albumArtist,
//        dateAdded = dateAdded,
//        sourceType = sourceType,
//        sourceId = sourceId,
//        size = size
//    )
//}

//fun HistoryEntity.toSong(): Song {
//    return Song(
//        id = id,
//        title = title,
//        trackNumber = trackNumber,
//        year = year,
//        duration = duration,
//        data = data,
//        dateModified = dateModified,
//        albumId = albumId,
//        albumName = albumName,
//        artistId = artistId,
//        artistName = artistName,
//        composer = composer,
//        albumArtist = albumArtist,
//        dateAdded = dateAdded,
//        sourceType = sourceType,
//        sourceId = sourceId,
//        size = size
//    )
//}

fun Song.toPlayCount(): PlayCountEntity {
    return PlayCountEntity(
        songId = id,
        timePlayed = System.currentTimeMillis(),
        playCount = 1
    )
}

fun List<Song>.toSongsEntity(playListId: Long): List<SongEntity> {
    return map {
        it.toSongEntity(playListId)
    }
}

fun List<Song>.toSongsEntityWrapper(playlistEntity: PlaylistEntity): List<SongEntityWrapper> {
    return map {
        SongEntityWrapper(playlistEntity.playListId, it)
    }
}

