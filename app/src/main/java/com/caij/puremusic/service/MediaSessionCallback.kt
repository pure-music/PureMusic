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

package com.caij.puremusic.service

import android.os.Bundle
import android.provider.MediaStore
import android.support.v4.media.session.MediaSessionCompat
import com.caij.puremusic.auto.AutoMediaIDHelper
import com.caij.puremusic.db.model.PlaylistEntity
import com.caij.puremusic.helper.MusicPlayerRemote
import com.caij.puremusic.helper.MusicPlayerRemote.cycleRepeatMode
import com.caij.puremusic.helper.ShuffleHelper.makeShuffleList
import com.caij.puremusic.db.model.Album
import com.caij.puremusic.db.model.Artist
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.repository.*
import com.caij.puremusic.service.MusicService.Companion.CYCLE_REPEAT
import com.caij.puremusic.service.MusicService.Companion.TOGGLE_FAVORITE
import com.caij.puremusic.service.MusicService.Companion.TOGGLE_SHUFFLE
import com.caij.puremusic.util.BaseSongUtil
import com.caij.puremusic.util.MusicUtil
import com.caij.puremusic.util.logD
import com.caij.puremusic.util.logE
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

/**
 * Created by hemanths on 2019-08-01.
 */

class MediaSessionCallback(
    private val musicService: MusicService,
) : MediaSessionCompat.Callback(), KoinComponent {

    private val songRepository by inject<SongRepository>()
    private val genreRepository by inject<GenreRepository>()
    private val topPlayedRepository by inject<TopPlayedRepository>()
    private val roomRepository by inject<RoomRepository>()

    override fun onPlayFromMediaId(mediaId: String?, extras: Bundle?) {
        super.onPlayFromMediaId(mediaId, extras)
        val musicId = AutoMediaIDHelper.extractMusicID(mediaId!!)
        logD("Music Id $musicId")
        val itemId = musicId?.toLong() ?: -1
        val songs: ArrayList<Song> = ArrayList()
        when (val category = AutoMediaIDHelper.extractCategory(mediaId)) {
            AutoMediaIDHelper.MEDIA_ID_MUSICS_BY_ALBUM -> {
                val album: Album? = roomRepository.album(itemId)
                if (album != null) {
                    val dbSongs = songRepository.songsByAlumId(album.id)
                    songs.addAll(dbSongs)
                    musicService.openQueue(songs, 0, true)
                }
            }
            AutoMediaIDHelper.MEDIA_ID_MUSICS_BY_ARTIST -> {
                val artist: Artist? = roomRepository.artistById(itemId)
                if (artist != null) {
                    val artistSongs = songRepository.songsByArtistIdWithLike(artist.id)
                    songs.addAll(artistSongs)
                    musicService.openQueue(songs, 0, true)
                }
            }
            AutoMediaIDHelper.MEDIA_ID_MUSICS_BY_ALBUM_ARTIST -> {
                val album = roomRepository.album(itemId)
                if (album != null) {
                    val artist: Artist? = roomRepository.artistByName(album.artistName)
                    if (artist != null) {
                        val artistSongs = songRepository.songsByArtistIdWithLike(artist.id)
                        songs.addAll(artistSongs)
                        musicService.openQueue(songs, 0, true)
                    }
                }
            }
            AutoMediaIDHelper.MEDIA_ID_MUSICS_BY_PLAYLIST -> {
                val playlist: PlaylistEntity? = roomRepository.getPlaylistEntity(itemId)
                if (playlist != null) {
                    val playlistSongs = ArrayList<Song>()
                    val songEntities = roomRepository.songEntities(itemId)
                    songEntities.forEach {
                        val song = roomRepository.song(it.songId)
                        if (song != null) {
                            playlistSongs.add(song)
                        }
                    }
                    if (playlistSongs.isNotEmpty()) {
                        songs.addAll(playlistSongs)
                        musicService.openQueue(songs, 0, true)
                    }
                }
            }
            AutoMediaIDHelper.MEDIA_ID_MUSICS_BY_SHUFFLE -> {
                val allSongs: ArrayList<Song> = songRepository.songsDefaultOrder() as ArrayList<Song>
                makeShuffleList(allSongs, -1)
                musicService.openQueue(allSongs, 0, true)
            }
            AutoMediaIDHelper.MEDIA_ID_MUSICS_BY_HISTORY,
            AutoMediaIDHelper.MEDIA_ID_MUSICS_BY_SUGGESTIONS,
            AutoMediaIDHelper.MEDIA_ID_MUSICS_BY_TOP_TRACKS,
            AutoMediaIDHelper.MEDIA_ID_MUSICS_BY_QUEUE,
            -> {
                val tracks: List<Song> = when (category) {
                    AutoMediaIDHelper.MEDIA_ID_MUSICS_BY_HISTORY -> songRepository.recentSongs()
                    AutoMediaIDHelper.MEDIA_ID_MUSICS_BY_SUGGESTIONS -> songRepository.notRecentlyPlayedTracks()
                    AutoMediaIDHelper.MEDIA_ID_MUSICS_BY_TOP_TRACKS -> topPlayedRepository.topTracks()
                    else -> musicService.playingQueue
                }
                songs.addAll(tracks)
                var songIndex = MusicUtil.indexOfSongInList(tracks, itemId)
                if (songIndex == -1) {
                    songIndex = 0
                }
                musicService.openQueue(songs, songIndex, true)
            }
        }
        musicService.play()
    }

    override fun onPlayFromSearch(query: String?, extras: Bundle?) {
        val songs = ArrayList<Song>()
        if (query.isNullOrEmpty()) {
            // The user provided generic string e.g. 'Play music'
            // Build appropriate playlist queue
            songs.addAll(songRepository.songsDefaultOrder())
        } else {
            // Build a queue based on songs that match "query" or "extras" param
            val mediaFocus: String? = extras?.getString(MediaStore.EXTRA_MEDIA_FOCUS)
            if (mediaFocus == MediaStore.Audio.Artists.ENTRY_CONTENT_TYPE) {
                val artistQuery = extras.getString(MediaStore.EXTRA_MEDIA_ARTIST)
                if (artistQuery != null) {
                    roomRepository.searchArtistByName(artistQuery).forEach {
                        val artistSongs = songRepository.songsByArtistIdWithLike(it.id)
                        songs.addAll(artistSongs)
                    }
                }
            } else if (mediaFocus == MediaStore.Audio.Albums.ENTRY_CONTENT_TYPE) {
                val albumQuery = extras.getString(MediaStore.EXTRA_MEDIA_ALBUM)
                if (albumQuery != null) {
                    roomRepository.searchAlbumsByName(albumQuery).forEach {
                        val albumSongs = songRepository.songsByAlumId(it.id)
                        songs.addAll(albumSongs)
                    }
                }
            }
        }

        if (songs.isEmpty()) {
            // No focus found, search by query for song title
            query?.also {
                songs.addAll(songRepository.searchSongsByTitle(it))
            }
        }

        musicService.openQueue(songs, 0, true)

        musicService.play()
    }

    override fun onPrepare() {
        super.onPrepare()
        if (musicService.currentSong != BaseSongUtil.emptySong)
            musicService.restoreState(::onPlay)
    }

    override fun onPlay() {
        super.onPlay()
        if (musicService.currentSong != BaseSongUtil.emptySong) musicService.play()
    }

    override fun onPause() {
        super.onPause()
        musicService.pause()
    }

    override fun onSkipToNext() {
        super.onSkipToNext()
        musicService.playNextSong(true)
    }

    override fun onSkipToPrevious() {
        super.onSkipToPrevious()
        musicService.playPreviousSong(true)
    }

    override fun onStop() {
        super.onStop()
        musicService.quit()
    }

    override fun onSeekTo(pos: Long) {
        super.onSeekTo(pos)
        musicService.seek(pos.toInt())
    }

    override fun onCustomAction(action: String, extras: Bundle?) {
        when (action) {
            CYCLE_REPEAT -> {
                cycleRepeatMode()
                musicService.updateMediaSessionPlaybackState()
            }

            TOGGLE_SHUFFLE -> {
                musicService.toggleShuffle()
                musicService.updateMediaSessionPlaybackState()
            }
            TOGGLE_FAVORITE -> {
                musicService.toggleFavorite()
            }
            else -> {
                logE("Unsupported action: $action")
            }
        }
    }

    private fun checkAndStartPlaying(songs: ArrayList<Song>, itemId: Long) {
        var songIndex = MusicUtil.indexOfSongInList(songs, itemId)
        if (songIndex == -1) {
            songIndex = 0
        }
        openQueue(songs, songIndex)
    }

    private fun openQueue(songs: ArrayList<Song>, index: Int, startPlaying: Boolean = true) {
        MusicPlayerRemote.openQueue(songs, index, startPlaying)
    }
}