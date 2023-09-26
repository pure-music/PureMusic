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
//import androidx.room.Entity
//import androidx.room.Ignore
//import androidx.room.PrimaryKey
//import com.caij.puremusic.BuildConfig
//import com.caij.puremusic.helper.SortOrder
//import com.caij.puremusic.repository.AlbumRepository
//import com.caij.puremusic.util.PreferenceUtil
//import java.text.Collator
//
//@Entity
//data class Album(
//    @PrimaryKey
//    val id: Long,
//    val year: Int,
//    val duration: Long,
//    val data: String,
//    val dateModified: Long,
//    val albumId: Long,
//    val albumName: String,
//    val artistId: String,
//    val artistName: String,
//    val composer: String?,
//    val songCount: Int,
//    val sourceType: Int
//) {
//    companion object {
//        val empty = Album(-1, -1, -1, "", -1, -1, "",
//            "", "", "",  0, 0)
//    }
//
//    @Ignore
//    var albumRepository: AlbumRepository? = null
//    val songs: List<Song>
//        @Ignore get() {
//            if (BuildConfig.DEBUG && albumRepository == null) throw java.lang.RuntimeException("")
//            val songs = albumRepository?.albumSongs(id) ?: emptyList()
//            return sortAlbumSongs(songs)
//        }
//
//
//    private fun sortAlbumSongs(songs : List<Song>): List<Song> {
//        val collator = Collator.getInstance()
//        val songs = when (PreferenceUtil.albumDetailSongSortOrder) {
//            SortOrder.AlbumSongSortOrder.SONG_TRACK_LIST -> songs.sortedWith { o1, o2 ->
//                o1.trackNumber.compareTo(o2.trackNumber)
//            }
//            SortOrder.AlbumSongSortOrder.SONG_A_Z -> {
//                songs.sortedWith { o1, o2 -> collator.compare(o1.title, o2.title) }
//            }
//            SortOrder.AlbumSongSortOrder.SONG_Z_A -> {
//                songs.sortedWith { o1, o2 -> collator.compare(o2.title, o1.title) }
//            }
//            SortOrder.AlbumSongSortOrder.SONG_DURATION -> songs.sortedWith { o1, o2 ->
//                o1.duration.compareTo(o2.duration)
//            }
//            else -> throw IllegalArgumentException("invalid ${PreferenceUtil.albumDetailSongSortOrder}")
//        }
//        return songs
//    }
//
//}
