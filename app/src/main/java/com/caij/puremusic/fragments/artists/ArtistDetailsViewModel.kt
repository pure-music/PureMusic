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
package com.caij.puremusic.fragments.artists

import androidx.lifecycle.*
import com.caij.puremusic.interfaces.IMusicServiceEventListener
import com.caij.puremusic.model.ArtistWrapper
import com.caij.puremusic.repository.RealRepository
import com.caij.puremusic.util.logD
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.util.ArtistUtil
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

class ArtistDetailsViewModel(
    private val realRepository: RealRepository,
    private val artistId: Long?,
    private val artistName: String?
) : ViewModel(), IMusicServiceEventListener {
    private val artistDetails = MutableLiveData<ArtistWrapper>()

    init {
        fetchArtist()
    }

    private fun fetchArtist() {
        viewModelScope.launch(IO) {
            artistId?.let {
                val start = System.currentTimeMillis()
                val artist = realRepository.artistById(it)
                if (artist != null) {
                    var songs = realRepository.getArtistSongsById(artist.id)
                    songs = ArtistUtil.sortedSongs(songs)
                    val artistWrapper = ArtistWrapper(artist, songs)
                    artistDetails.postValue(artistWrapper)
                }
                val dt = System.currentTimeMillis() - start
                logD("cost $dt")
            }

            artistName?.let {
                val artist = realRepository.albumArtistByName(it)
                if (artist != null) {
                    var songs = realRepository.getArtistSongsById(artist.id)
                    songs = ArtistUtil.sortedSongs(songs)
                    val artistWrapper = ArtistWrapper(artist, songs)
                    artistDetails.postValue(artistWrapper)
                }
            }
        }
    }

    fun getArtist(): LiveData<ArtistWrapper> = artistDetails

    override fun onMediaStoreChanged() {
        fetchArtist()
    }

    override fun onServiceConnected() {}
    override fun onServiceDisconnected() {}
    override fun onQueueChanged() {}
    override fun onPlayingMetaChanged() {}
    override fun onPlayStateChanged() {}
    override fun onRepeatModeChanged() {}
    override fun onShuffleModeChanged() {}
    override fun onFavoriteStateChanged() {}

    fun getAlbumSongs(id: Long): List<Song> {
        return realRepository.getAlbumSongs(id)
    }
}
