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
package com.caij.puremusic.helper

import android.app.SearchManager
import android.os.Bundle
import android.provider.MediaStore
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.repository.SongRepository
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

object SearchQueryHelper : KoinComponent {
    private const val TITLE_SELECTION = "lower(title)"
    private const val ALBUM_SELECTION = "lower(album_name)"
    private const val ARTIST_SELECTION = "lower(artist_name)"
    private const val AND = " AND "
    private val songRepository by inject<SongRepository>()
    var songs = ArrayList<Song>()

    @JvmStatic
    fun getSongs(extras: Bundle): List<Song> {
        val query = extras.getString(SearchManager.QUERY, null)
        val artistName = extras.getString(MediaStore.EXTRA_MEDIA_ARTIST, null)
        val albumName = extras.getString(MediaStore.EXTRA_MEDIA_ALBUM, null)
        val titleName = extras.getString(MediaStore.EXTRA_MEDIA_TITLE, null)

        var songs = listOf<Song>()
        if (artistName != null && albumName != null && titleName != null) {
            songs = songRepository.songsByInfo(titleName.lowercase(), artistName.lowercase(), albumName.lowercase())
//            songs = songRepository.searchSongs(
//                 "$ARTIST_SELECTION=" + artistName.lowercase()
//                    + " AND $ALBUM_SELECTION=" + albumName.lowercase()
//                    + " AND $TITLE_SELECTION=" + titleName.lowercase())
        }
        if (songs.isNotEmpty()) {
            return songs
        }
        if (artistName != null && titleName != null) {
            songs = songRepository.songsByNameArtist(titleName.lowercase(), artistName.lowercase())
//            songs = songRepository.searchSongs("$ARTIST_SELECTION=" + artistName.lowercase() + " AND $TITLE_SELECTION=" + titleName.lowercase())
        }
        if (songs.isNotEmpty()) {
            return songs
        }
        if (albumName != null && titleName != null) {
            songs = songRepository.songsByNameAlbum(titleName.lowercase(), albumName.lowercase())
//            songs = songRepository.searchSongs("$ALBUM_SELECTION=" + albumName.lowercase()
//                    + " AND $TITLE_SELECTION=" + titleName.lowercase())
        }
        if (songs.isNotEmpty()) {
            return songs
        }
        if (artistName != null) {
            songs = songRepository.songsByArtist(artistName.lowercase())
        }
        if (songs.isNotEmpty()) {
            return songs
        }
        if (albumName != null) {
            songs = songRepository.songsByAlum(albumName.lowercase())
        }
        if (songs.isNotEmpty()) {
            return songs
        }
        if (titleName != null) {
            songs = songRepository.songsByTitle(titleName.lowercase())
        }
        if (songs.isNotEmpty()) {
            return songs
        }
        songs = songRepository.songsByArtist(query.lowercase())

        if (songs.isNotEmpty()) {
            return songs
        }
        songs = songRepository.songsByAlum(query.lowercase())
        if (songs.isNotEmpty()) {
            return songs
        }
        songs = songRepository.songsByTitle(query.lowercase())
        return songs.ifEmpty { ArrayList() }
    }
}
