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

import com.caij.puremusic.helper.SortOrder
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.util.PreferenceUtil
import java.text.Collator
import kotlin.collections.ArrayList

/**
 * Created by hemanths on 10/08/17.
 */
interface SongRepository {

    fun songsDefaultOrder(): List<Song>

    fun songsByFilePath(filePath: String, ignoreBlacklist: Boolean = false): List<Song>

    fun song(songId: Long): Song?

    fun searchSongsByTitle(title: String): List<Song>

    fun songsByTitle(title: String): List<Song>

    fun songsByAlum(album: String): List<Song>

    fun songsByArtist(artist: String): List<Song>

    fun songsByInfo(title: String, artist: String, album: String): List<Song>

    fun songsByNameArtist(title: String, artist: String): List<Song>

    fun songsByNameAlbum(title: String, album: String): List<Song>

    fun songsByIds(ids: ArrayList<Long>): List<Song>

    fun songsByArtistIdWithLike(id: Long): List<Song>

    fun songsDateLastDesc(cutoff: Long): List<Song>

    fun songsByAlumId(id: Long): List<Song>

    fun recentSongs(cutoff: Long = PreferenceUtil.getRecentlyPlayedCutoffTimeMillis()): List<Song>

    fun notRecentlyPlayedTracks(cutoff: Long = PreferenceUtil.getRecentlyPlayedCutoffTimeMillis()): List<Song>
}
//
//class RealSongRepository(private val context: Context) : SongRepository {
//
//    override fun songs(): List<Song> {
//        return emptyList()
////        return sortedSongs(makeSongCursor(null, null))
//    }
//
//    override fun songs(cursor: Cursor?): List<Song> {
//        val songs = arrayListOf<Song>()
//        if (cursor != null && cursor.moveToFirst()) {
//            do {
//                songs.add(getSongFromCursorImpl(cursor))
//            } while (cursor.moveToNext())
//        }
//        cursor?.close()
//        return songs
//    }
//
//    override fun sortedSongs(cursor: Cursor?): List<Song> {
//        val collator = Collator.getInstance()
//        val songs = songs(cursor)
//        return when (PreferenceUtil.songSortOrder) {
//            SortOrder.SongSortOrder.SONG_A_Z -> {
//                songs.sortedWith{ s1, s2 -> collator.compare(s1.title, s2.title) }
//            }
//            SortOrder.SongSortOrder.SONG_Z_A -> {
//                songs.sortedWith{ s1, s2 -> collator.compare(s2.title, s1.title) }
//            }
//            SortOrder.SongSortOrder.SONG_ALBUM -> {
//                songs.sortedWith{ s1, s2 -> collator.compare(s1.albumName, s2.albumName) }
//            }
//            SortOrder.SongSortOrder.SONG_ALBUM_ARTIST -> {
//                songs.sortedWith{ s1, s2 -> collator.compare(s1.albumArtist, s2.albumArtist) }
//            }
//            SortOrder.SongSortOrder.SONG_ARTIST -> {
//                songs.sortedWith{ s1, s2 -> collator.compare(s1.artistName, s2.artistName) }
//            }
//            SortOrder.SongSortOrder.COMPOSER -> {
//                songs.sortedWith{ s1, s2 -> collator.compare(s1.composer, s2.composer) }
//            }
//            else -> songs
//        }
//    }
//
//    override fun song(cursor: Cursor?): Song {
//        val song: Song = if (cursor != null && cursor.moveToFirst()) {
//            getSongFromCursorImpl(cursor)
//        } else {
//            Song.emptySong
//        }
//        cursor?.close()
//        return song
//    }
//
//    override fun songs(query: String): List<Song> {
//        return emptyList()
////        return songs(makeSongCursor(AudioColumns.TITLE + " LIKE ?", arrayOf("%$query%")))
//    }
//
//    override fun song(songId: Long): Song {
//        return Song.emptySong
////        return song(makeSongCursor(AudioColumns._ID + "=?", arrayOf(songId.toString())))
//    }
//
//    override fun search(query: String): List<Song> {
//        return emptyList()
//    }
//
//    override fun albums(query: String?): List<Album> {
//        return emptyList()
//    }
//
//    override fun songsByFilePath(filePath: String, ignoreBlacklist: Boolean): List<Song> {
//        return emptyList()
////        return songs(
////            makeSongCursor(
////                Constants.DATA + "=?",
////                arrayOf(filePath),
////                ignoreBlacklist = ignoreBlacklist
////            )
////        )
//    }
//
//    private fun getSongFromCursorImpl(
//        cursor: Cursor
//    ): Song {
//        val id = cursor.getLong(AudioColumns._ID)
//        val title = cursor.getString(AudioColumns.TITLE)
//        val trackNumber = cursor.getInt(AudioColumns.TRACK)
//        val year = cursor.getInt(AudioColumns.YEAR)
//        val duration = cursor.getLong(AudioColumns.DURATION)
//        val data = cursor.getString(Constants.DATA)
//        val dateModified = cursor.getLong(AudioColumns.DATE_MODIFIED)
//        val albumId = cursor.getLong(AudioColumns.ALBUM_ID)
//        val albumName = cursor.getStringOrNull(AudioColumns.ALBUM)
//        val artistId = cursor.getLong(AudioColumns.ARTIST_ID)
//        val artistName = cursor.getStringOrNull(AudioColumns.ARTIST)
//        val composer = cursor.getStringOrNull(AudioColumns.COMPOSER)
//        val albumArtist = cursor.getStringOrNull("album_artist")
//        return Song(
//            id,
//            title,
//            trackNumber,
//            year,
//            duration,
//            data,
//            dateModified,
//            albumId,
//            albumName ?: "",
//            artistId,
//            artistName ?: "",
//            composer ?: "",
//            albumArtist ?: ""
//        )
//    }
//
//    private fun generateBlacklistSelection(
//        selection: String?,
//        pathCount: Int
//    ): String {
//        val newSelection = StringBuilder(
//            if (selection != null && selection.trim { it <= ' ' } != "") "$selection AND " else "")
//        newSelection.append(Constants.DATA + " NOT LIKE ?")
//        for (i in 0 until pathCount - 1) {
//            newSelection.append(" AND " + Constants.DATA + " NOT LIKE ?")
//        }
//        return newSelection.toString()
//    }
//
//    private fun addSelectionValues(
//        selectionValues: Array<String>?,
//        paths: ArrayList<String>
//    ): Array<String> {
//        var selectionValuesFinal = selectionValues
//        if (selectionValuesFinal == null) {
//            selectionValuesFinal = emptyArray()
//        }
//        val newSelectionValues = Array(selectionValuesFinal.size + paths.size) {
//            "n = $it"
//        }
//        System.arraycopy(selectionValuesFinal, 0, newSelectionValues, 0, selectionValuesFinal.size)
//        for (i in selectionValuesFinal.size until newSelectionValues.size) {
//            newSelectionValues[i] = paths[i - selectionValuesFinal.size] + "%"
//        }
//        return newSelectionValues
//    }
//}

class SyncSongRepository(private val roomRepository: RealRoomRepository) : SongRepository {

    override fun songsDefaultOrder(): List<Song> {
        val songs = roomRepository.allSongs()
        return sortedSongs(songs)
    }

    private fun sortedSongs(songs: List<Song>): List<Song> {
        val collator = Collator.getInstance()
        return when (PreferenceUtil.songSortOrder) {
            SortOrder.SongSortOrder.SONG_A_Z -> {
                songs.sortedWith{ s1, s2 -> collator.compare(s1.title, s2.title) }
            }
            SortOrder.SongSortOrder.SONG_Z_A -> {
                songs.sortedWith{ s1, s2 -> collator.compare(s2.title, s1.title) }
            }
            SortOrder.SongSortOrder.SONG_ALBUM -> {
                songs.sortedWith{ s1, s2 -> collator.compare(s1.albumName, s2.albumName) }
            }
            SortOrder.SongSortOrder.SONG_ALBUM_ARTIST -> {
                songs.sortedWith{ s1, s2 ->
                    if (s1.albumArtist == null || s2.albumArtist == null) {
                        1
                    } else {
                        collator.compare(s1.albumArtist, s2.albumArtist)
                    }
                }
            }
            SortOrder.SongSortOrder.SONG_ARTIST -> {
                songs.sortedWith{ s1, s2 -> collator.compare(s1.artistName, s2.artistName) }
            }
            SortOrder.SongSortOrder.COMPOSER -> {
                songs.sortedWith{ s1, s2 -> collator.compare(s1.composer, s2.composer) }
            }
            else -> songs
        }
    }

    private fun sortedSongs(): String {
        return when (PreferenceUtil.songSortOrder) {
            SortOrder.SongSortOrder.SONG_A_Z -> {
                "title ASC"
            }
            SortOrder.SongSortOrder.SONG_Z_A -> {
                "title DESC"
            }
            SortOrder.SongSortOrder.SONG_ALBUM -> {
                "album_name ASC"
            }
            SortOrder.SongSortOrder.SONG_ALBUM_ARTIST -> {
                "album_artist ASC"
            }
            SortOrder.SongSortOrder.SONG_ARTIST -> {
                "artist_name ASC"
            }
            SortOrder.SongSortOrder.COMPOSER -> {
                "composer ASC"
            }
            else -> "title ASC"
        }
    }

    override fun song(songId: Long): Song? {
        return roomRepository.song(songId)
    }

    override fun searchSongsByTitle(title: String): List<Song> {
        return roomRepository.searchSongsByTitle("%$title%")
    }

    override fun songsByTitle(title: String): List<Song> {
        return roomRepository.songsByTitle(title)
    }

    override fun songsByAlum(album: String): List<Song> {
        return roomRepository.songsByAlum(album)
    }

    override fun songsByArtist(artist: String): List<Song> {
        return roomRepository.songsByArtist(artist)
    }

    override fun songsByInfo(title: String, artist: String, album: String): List<Song> {
        return roomRepository.songsByInfo(title, artist, album)
    }

    override fun songsByNameArtist(title: String, artist: String): List<Song> {
        return roomRepository.songsByNameArtist(title, artist)
    }

    override fun songsByNameAlbum(title: String, album: String): List<Song> {
        return roomRepository.songsByNameAlbum(title, album)
    }

    override fun songsByIds(ids: ArrayList<Long>): List<Song> {
        return roomRepository.songsByIds(ids)
    }

    override fun songsByArtistIdWithLike(id: Long): List<Song> {
        return roomRepository.songsByArtistIdWithLike(id)
    }

    override fun songsDateLastDesc(cutoff: Long): List<Song> {
        return roomRepository.songsDateLastDesc(cutoff)
    }

    override fun songsByAlumId(id: Long): List<Song> {
        return roomRepository.songsByAlumId(id)
    }

    override fun recentSongs(cutoff: Long): List<Song> {
        val his = roomRepository.historySongs(cutoff)
        val songs = ArrayList<Song>()
        his.forEach {
            val song = roomRepository.song(it.id)
            if (song != null) {
                songs.add(song)
            }
        }
        return songs
    }

    override fun notRecentlyPlayedTracks(cutoff: Long): List<Song> {
        val his = roomRepository.historySongs(cutoff)
        val songs = ArrayList(roomRepository.allSongs())
        his.forEach {
            remove(it.id, songs)
        }
        return songs
    }

    private fun remove(id: Long, songs: ArrayList<Song>) {
        for (i in songs.indices) {
            if (songs[i].id == id) {
                songs.removeAt(i)
                break
            }
        }
    }

    override fun songsByFilePath(filePath: String, ignoreBlacklist: Boolean): List<Song> {
        return roomRepository.songsByFilePath(filePath)
    }

}
