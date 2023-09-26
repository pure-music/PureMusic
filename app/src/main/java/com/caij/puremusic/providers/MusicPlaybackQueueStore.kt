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
package com.caij.puremusic.providers

import android.content.Context
import com.caij.puremusic.db.model.PlaybackSong
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.repository.RoomRepository

/**
 * @author Andrew Neal, modified for Phonograph by Karim Abou Zeid
 *
 * This keeps track of the music playback and history state of the playback service
 */
class MusicPlaybackQueueStore(context: Context, val roomRepository: RoomRepository) {

    fun savedOriginalPlayingQueue(): List<Song> {
        val backSongs = roomRepository.getOriginalPlayingQueuePlayback()
        val songs = ArrayList<Song>()
        for (item in backSongs) {
            val song = roomRepository.song(item.songId)
            if (song != null) {
                songs.add(song)
            }
        }
        return songs
    }

    fun savedPlayingQueue(): List<Song> {
        val backSongs = roomRepository.getPlayingQueuePlayback()
        val songs = ArrayList<Song>()
        for (item in backSongs) {
            val song = roomRepository.song(item.songId)
            if (song != null) {
                songs.add(song)
            }
        }
        return songs
    }

    @Synchronized
    fun saveQueues(
        playingQueue: List<Song>, originalPlayingQueue: List<Song>
    ) {
        roomRepository.clearPlaybacks()

        val playingQueueSave = ArrayList(playingQueue)
        val originalPlayingQueueSave = ArrayList(originalPlayingQueue)

        val playingQueuePlayback = ArrayList<PlaybackSong>()
        for (i in playingQueueSave.indices) {
            val song = playingQueueSave[i]
            val playbackSong = PlaybackSong(0, i, song.id, 1)
            playingQueuePlayback.add(playbackSong)
        }

        val originalPlayingQueuePlayback = ArrayList<PlaybackSong>()
        for (i in originalPlayingQueueSave.indices) {
            val song = originalPlayingQueueSave[i]
            val playbackSong = PlaybackSong(0, i, song.id, 2)
            originalPlayingQueuePlayback.add(playbackSong)
        }


        roomRepository.insertOriginalPlayingQueuePlayback(originalPlayingQueuePlayback)
        roomRepository.insertPlayingQueuePlayback(playingQueuePlayback)
    }

}