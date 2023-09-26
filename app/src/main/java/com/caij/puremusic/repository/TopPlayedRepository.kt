/*
 * Copyright (c) 2019 Hemanth Savarala.
 *
 * Licensed under the GNU General Public License v3
 *
 * This is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by
 *  the Free Software Foundation either version 3 of the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 */

package com.caij.puremusic.repository

import android.content.Context
import com.caij.puremusic.db.model.Album
import com.caij.puremusic.db.model.Artist
import com.caij.puremusic.util.ArtistUtil
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.util.AlbumUtil
import com.caij.puremusic.util.BaseAlbumUtil


/**
 * Created by hemanths on 16/08/17.
 */

interface TopPlayedRepository {

    fun topTracks(): List<Song>

    fun topAlbums(): List<Album>

    fun topArtists(): List<Artist>
}

class RealTopPlayedRepository(
    private val roomRepository: RoomRepository
) : TopPlayedRepository {

    override fun topTracks(): List<Song> {
        val playSongs = roomRepository.playCountSongs()
        val songs = ArrayList<Song>()
        playSongs.forEach { song ->
            val realSong = roomRepository.song(song.songId)
            if (realSong != null) {
                songs.add(realSong)
            }
        }
        return songs
    }

    override fun topAlbums(): List<Album> {
        val topSongs = topTracks()
        return BaseAlbumUtil.splitIntoAlbums(topSongs)
    }

    override fun topArtists(): List<Artist> {
        return ArtistUtil.splitIntoArtists(topTracks())
    }

}
