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
package com.caij.puremusic.fragments.albums

import androidx.lifecycle.*
import com.caij.puremusic.interfaces.IMusicServiceEventListener
import com.caij.puremusic.db.model.Album
import com.caij.puremusic.model.AlbumWrapper
import com.caij.puremusic.model.ArtistWrapper
import com.caij.puremusic.repository.RealRepository
import com.caij.puremusic.util.BaseAlbumUtil
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.util.AlbumUtil
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

class AlbumDetailsViewModel(
    private val repository: RealRepository,
    private val albumId: Long
) : ViewModel(), IMusicServiceEventListener {
    private val albumDetails = MutableLiveData<AlbumWrapper>()

    init {
        fetchAlbum()
    }

    fun fetchAlbum() {
        viewModelScope.launch(IO) {
            val album = repository.albumById(albumId)
            if (album != null) {
                var songs = repository.getAlbumSongs(albumId)
                songs = AlbumUtil.sortAlbumSongs(songs)
                albumDetails.postValue(AlbumWrapper(album, songs))
            }
        }
    }

    fun getSongs(): List<Song> {
        return repository.getAlbumSongs(albumId)
    }

    fun getAlbum(): LiveData<AlbumWrapper> = albumDetails

    fun getArtistByStrId(artistId: Long): LiveData<ArtistWrapper> = liveData(IO) {
        val result = repository.artistById(artistId)
        if (result != null) {
            val songs = repository.getArtistSongsById(result.id)
            val artistWrapper = ArtistWrapper(result, songs)
            emit(artistWrapper)
        }
    }

    fun getMoreAlbums(artistWrapper: ArtistWrapper): LiveData<List<Album>> = liveData(IO) {
        val albumGroups = BaseAlbumUtil.splitIntoAlbums(artistWrapper.songs)
        albumGroups.filter { item -> item.id != albumId }.let { albums ->
            if (albums.isNotEmpty()) emit(albums)
        }
    }

    override fun onMediaStoreChanged() {

    }

    override fun onServiceConnected() {}
    override fun onServiceDisconnected() {}
    override fun onQueueChanged() {}
    override fun onPlayingMetaChanged() {}
    override fun onPlayStateChanged() {}
    override fun onRepeatModeChanged() {}
    override fun onShuffleModeChanged() {}
    override fun onFavoriteStateChanged() {}

}
