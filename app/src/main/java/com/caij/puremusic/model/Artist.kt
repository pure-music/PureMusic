///*
// * Copyright (c) 2019 Hemanth Savarala.
// *
// * Licensed under the GNU General Public License v3
// *
// * This is free software: you can redistribute it and/or modify it under
// * the terms of the GNU General Public License as published by
// *  the Free Software Foundation either version 3 of the License, or (at your option) any later version.
// *
// * This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
// * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
// * See the GNU General Public License for more details.
// */
//
//package com.caij.puremusic.model
//
//import androidx.annotation.WorkerThread
//import androidx.room.Entity
//import androidx.room.Ignore
//import androidx.room.PrimaryKey
//import com.caij.puremusic.BuildConfig
//import com.caij.puremusic.helper.SortOrder
//import com.caij.puremusic.repository.ArtistRepository
//import com.caij.puremusic.util.AlbumUtil
//import com.caij.puremusic.util.PreferenceUtil
//import java.text.Collator
//
//@Entity
//data class Artist(
//    @PrimaryKey
//    val id: Long,
//    val name: String
//) {
//
//    @Ignore
//    var artistRepository: ArtistRepository? = null
//    val songs: List<Song>
//        @Ignore get() {
//            if (BuildConfig.DEBUG && artistRepository == null) throw java.lang.RuntimeException("")
//            return artistRepository?.artistSongs(id) ?: emptyList()
//        }
//
//    val albums: List<Album> get() {
//        return parseAlbums(songs)
//    }
//
//    fun parseAlbums(songs: List<Song>): List<Album> {
//        return AlbumUtil.splitIntoAlbums(songs)
//    }
//
//    val sortedSongs: List<Song>
//        @WorkerThread
//        get() {
//            val collator = Collator.getInstance()
//            return songs.sortedWith(
//                when (PreferenceUtil.artistDetailSongSortOrder) {
//                    SortOrder.ArtistSongSortOrder.SONG_A_Z -> { o1, o2 ->
//                        collator.compare(o1.title, o2.title)
//                    }
//                    SortOrder.ArtistSongSortOrder.SONG_Z_A -> { o1, o2 ->
//                        collator.compare(o2.title, o1.title)
//                    }
//                    SortOrder.ArtistSongSortOrder.SONG_ALBUM -> { o1, o2 ->
//                        collator.compare(o1.albumName, o2.albumName)
//                    }
//                    SortOrder.ArtistSongSortOrder.SONG_YEAR -> { o1, o2 ->
//                        o2.year.compareTo(
//                            o1.year
//                        )
//                    }
//                    SortOrder.ArtistSongSortOrder.SONG_DURATION -> { o1, o2 ->
//                        o1.duration.compareTo(
//                            o2.duration
//                        )
//                    }
//                    else -> {
//                        throw IllegalArgumentException("invalid ${PreferenceUtil.artistDetailSongSortOrder}")
//                    }
//                })
//        }
//
//    fun safeGetFirstAlbum(): Album {
//        return albums.firstOrNull() ?: Album.empty
//    }
//
//    companion object {
//        const val UNKNOWN_ARTIST_DISPLAY_NAME = "Unknown Artist"
//        const val VARIOUS_ARTISTS_DISPLAY_NAME = "Various Artists"
//        const val VARIOUS_ARTISTS_ID: Long = -2
//        val empty = Artist(-1, UNKNOWN_ARTIST_DISPLAY_NAME)
//    }
//
//    override fun equals(other: Any?): Boolean {
//        if (other is Artist) {
//            return id == other.id
//        }
//        return false
//    }
//
//    override fun hashCode(): Int {
//        return id.hashCode()
//    }
//}
