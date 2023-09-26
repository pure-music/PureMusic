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
package com.caij.puremusic.fragments

import android.Manifest
import android.animation.ValueAnimator
import android.content.Context
import android.content.Intent
import androidx.core.animation.doOnEnd
import androidx.lifecycle.*
import com.bumptech.glide.Glide
import com.caij.easypermissions.Permissions
import com.caij.puremusic.*
import com.caij.puremusic.BuildConfig
import com.caij.puremusic.R
import com.caij.puremusic.analyze.Catee
import com.caij.puremusic.db.*
import com.caij.puremusic.db.model.*
import com.caij.puremusic.drive.DriveFactory
import com.caij.puremusic.drive.DriveFactorys
import com.caij.puremusic.extensions.*
import com.caij.puremusic.fragments.search.Filter
import com.caij.puremusic.helper.MusicPlayerRemote
import com.caij.puremusic.interfaces.IMusicServiceEventListener
import com.caij.puremusic.model.*
import com.caij.puremusic.repository.LocalSongsUtil
import com.caij.puremusic.repository.RealRepository
import com.caij.puremusic.util.*
import com.caij.puremusic.db.model.Folder
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.drive.ErrorResponseException
import com.caij.puremusic.drive.SyncCallback
import com.caij.puremusic.drive.emby.EmbyEngine
import com.caij.puremusic.drive.jellyfin.JellyfinEngine
import com.caij.puremusic.drive.model.MediaInfoWrapper
import com.caij.puremusic.drive.plex.PlexEngine
import com.caij.puremusic.service.MusicService
import com.caij.puremusic.drive.subsonic.SubsonicEngine
import io.ktor.http.HttpStatusCode
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.File
import java.io.IOException
import java.net.ConnectException


class LibraryViewModel(
    private val repository: RealRepository
) : ViewModel(), IMusicServiceEventListener {

    private val _paletteColor = MutableLiveData<Int>()
    private val searchResults = MutableLiveData<List<Any>>()
    private val fabMargin = MutableLiveData(0)
    private val songHistory = MutableLiveData<List<Song>>()
    private var previousSongHistory = ArrayList<HistoryEntity>()
    val paletteColor: LiveData<Int> = _paletteColor


    fun getSearchResult(): LiveData<List<Any>> = searchResults

    fun getFabMargin(): LiveData<Int> = fabMargin

    suspend fun fetchSongs(): List<Song> {
        return repository.allSongs()
    }

    suspend fun fetchAlbums(): List<Album> {
        return repository.fetchAlbums()
    }

    suspend fun fetchPlaylists(): ArrayList<PlaylistWrapper> {
        val fetchPlaylists = repository.fetchPlaylists()
        val playlistEntityWrappers = ArrayList<PlaylistWrapper>()
        fetchPlaylists.forEach {
            val size = repository.getPlayListSongCount(it.playListId)
            val songEntity = repository.getPlaylistLastAddSong(it.playListId)
            if (songEntity != null) {
                val song = repository.getSongById(songEntity.songId)
                playlistEntityWrappers.add(PlaylistWrapper(it, size, song))
            } else {
                playlistEntityWrappers.add(PlaylistWrapper(it, 0, null))
            }
        }
        return playlistEntityWrappers
    }

    suspend fun fetchGenres(): List<Genre> {
        return repository.fetchGenres()
    }

    suspend fun fetchHomeSections(): List<Home> {
        return repository.homeSections()
    }

    fun search(query: String?, filter: Filter) =
        viewModelScope.launch(IO) {
            val result = repository.search(query, filter)
            searchResults.postValue(result)
        }

    fun updateColor(newColor: Int) {
        _paletteColor.postValue(newColor)
    }

    override fun onMediaStoreChanged() {
        logD("onMediaStoreChanged")
//        for (folder in FolderUtil.folderManager.getFolders()) {
//            if (folder.type == DriveFactory.TYPE_INNER) {
//                viewModelScope.launch(IO) {
//                    deleteSource(folder)
//                    addSongSource(null, folder)
//                    loadLibraryContent()
//                }
//                break
//            }
//        }
    }

    override fun onServiceConnected() {
        logD("onServiceConnected")
    }

    override fun onServiceDisconnected() {
        logD("onServiceDisconnected")
    }

    override fun onQueueChanged() {
        logD("onQueueChanged")
    }

    override fun onPlayingMetaChanged() {
        logD("onPlayingMetaChanged")
    }

    override fun onPlayStateChanged() {
        logD("onPlayStateChanged")
    }

    override fun onRepeatModeChanged() {
        logD("onRepeatModeChanged")
    }

    override fun onShuffleModeChanged() {
        logD("onShuffleModeChanged")
    }

    override fun onFavoriteStateChanged() {
        logD("onFavoriteStateChanged")
    }

    fun shuffleSongs() = viewModelScope.launch(IO) {
        val songs = repository.allSongs()
        withContext(Main) {
            MusicPlayerRemote.openAndShuffleQueue(songs, true)
        }
    }

    fun renameRoomPlaylist(playListId: Long, name: String) = viewModelScope.launch(IO) {
        repository.renameRoomPlaylist(playListId, name)
    }

    fun deleteSongsInPlaylistWithNofify(songs: List<SongEntity>) {
        viewModelScope.launch(IO) {
            repository.deleteSongsInPlaylist(songs)
            val playlistIds = songs.groupBy {
                it.playlistId
            }
            withContext(Main) {
                EventBus.post(EVENT_PLAY_LIST_UPDATE, null)
                for (id in playlistIds.keys) {
                    EventBus.post(EVENT_PLAY_LIST_SONGS_UPDATE, id)
                    if (id == FAVORITE_PLAYLIST_ID) {
                        App.getContext().sendBroadcast(Intent(MusicService.FAVORITE_STATE_CHANGED))
                    }
                }
            }
        }
    }

    fun deleteSongsInPlaylist(songs: List<SongEntity>) {
        viewModelScope.launch(IO) {
            repository.deleteSongsInPlaylist(songs)
        }
    }

    fun deleteSongsFromPlaylist(playlists: List<PlaylistEntity>) = viewModelScope.launch(IO) {
        repository.deletePlaylistSongs(playlists)
    }

    fun deleteRoomPlaylist(playlists: List<PlaylistEntity>) = viewModelScope.launch(IO) {
        repository.deleteRoomPlaylist(playlists)
    }

    fun albumById(id: Long) = repository.albumById(id)

    fun artistById(id: Long) = repository.artistById(id)

    fun getArtistByStrId(artistId: String): LiveData<Artist?> = liveData(IO) {
        val result = if (artistId.contains(",")) {
            val aids = artistId.split(",")
            var artist: Artist? = null
            for (aid in aids) {
                val dbartist = repository.artistById(aid.toLong())
                if (dbartist != null) {
                    artist = dbartist
                    break
                }
            }
            artist
        } else {
            repository.artistById(artistId.toLong())
        }
        emit(result)
    }

    suspend fun favoritePlaylist() = repository.favoritePlaylist()
    suspend fun isFavoriteSong(song: SongEntity) = repository.isFavoriteSong(song)
    suspend fun isSongFavorite(songId: Long) = repository.isSongFavorite(songId)
    suspend fun insertSongs(songs: List<SongEntity>) = repository.insertSongEntities(songs)
    suspend fun removeSongFromPlaylist(songEntity: SongEntity) =
        repository.removeSongFromPlaylist(songEntity)

    private suspend fun checkPlaylistExists(playlistName: String): List<PlaylistEntity> =
        repository.checkPlaylistExists(playlistName)

    private suspend fun createPlaylist(playlistEntity: PlaylistEntity): Long =
        repository.createPlaylist(playlistEntity)

//    fun importPlaylists() = viewModelScope.launch(IO) {
//        val playlists = repository.fetchLegacyPlaylist()
//        playlists.forEach { playlist ->
//            val playlistEntity = repository.checkPlaylistExists(playlist.name).firstOrNull()
//            if (playlistEntity != null) {
//                val songEntities = playlist.getSongs().map {
//                    it.toSongEntity(playlistEntity.playListId)
//                }
//                repository.insertSongs(songEntities)
//            } else {
//                if (playlist != Playlist.empty) {
//                    val playListId = createPlaylist(PlaylistEntity(System.currentTimeMillis(), playlistName = playlist.name))
//                    val songEntities = playlist.getSongs().map {
//                        it.toSongEntity(playListId)
//                    }
//                    repository.insertSongs(songEntities)
//                }
//            }
//            forceReload(Playlists)
//        }
//    }

    fun playCountSongs(): LiveData<List<Song>> = liveData(IO) {
        val playSongs = repository.playCountSongs()
        val songs = ArrayList<Song>()
        playSongs.forEach { song ->
            val realSong = repository.getSongById(song.songId)
            if (realSong == null || song.songId == -1L || (realSong.isLocal && !File(realSong.url).exists())) {
                repository.deleteSongInPlayCount(song)
            } else {
                songs.add(realSong)
            }
        }
        emit(songs)
    }

    fun artists(type: Int): LiveData<List<Artist>> = liveData(IO) {
        when (type) {
            TOP_ARTISTS -> emit(repository.topArtists())
            RECENT_ARTISTS -> {
                emit(repository.recentArtists())
            }
        }
    }

    fun albums(type: Int): LiveData<List<Album>> = liveData(IO) {
        when (type) {
            TOP_ALBUMS -> emit(repository.topAlbums())
            RECENT_ALBUMS -> {
                emit(repository.recentAlbums())
            }
        }
    }

    fun artist(artistId: Long): LiveData<Artist?> = liveData(IO) {
        emit(repository.artistById(artistId))
    }

    fun fetchContributors(): LiveData<List<Contributor>> = liveData(IO) {
        emit(repository.contributor())
    }

    fun observableHistorySongs(): LiveData<List<Song>> {
        viewModelScope.launch(IO) {
            val historySongs = repository.historySong(0L)
            val songs = ArrayList<Song>()
            historySongs.forEach {
                val song = repository.getSongById(it.id)
                if (song == null || song.id == -1L
                    || (song.isLocal && !File(song.url).exists())) {
                    repository.deleteSongInHistory(it.id)
                } else {
                    songs.add(song)
                }
            }
            songHistory.postValue(songs)
        }
        return songHistory
    }

    fun clearHistory() {
        viewModelScope.launch(IO) {
            previousSongHistory = repository.historySong(0L) as ArrayList<HistoryEntity>
            repository.clearSongHistory()
        }
        songHistory.value = emptyList()
    }


    fun restoreHistory() {
        viewModelScope.launch(IO) {
            if (previousSongHistory.isNotEmpty()) {
                val history = ArrayList<Song>()
                for (song in previousSongHistory) {
                    val realSong = repository.getSongById(song.id)
                    if (realSong != null) {
                        repository.addSongToHistory(realSong)
                        history.add(realSong)
                    }
                }
                songHistory.postValue(history)
            }
        }
    }

    fun favorites() : List<Song>{
        val songEntities =  repository.favorites()
        val songs = ArrayList<Song>()
        songEntities.forEach {
            val song = repository.getSongById(it.songId)
            if (song != null) {
                songs.add(song)
            }
        }
        return songs
    }

    fun clearSearchResult() {
        searchResults.value = emptyList()
    }

    fun addToPlaylist(context: Context, playlistName: String, songs: List<Song>) {
        viewModelScope.launch(IO) {
            val playlists = checkPlaylistExists(playlistName)
            if (playlists.isEmpty()) {
                val playlistId: Long =
                    createPlaylist(PlaylistEntity(System.currentTimeMillis(), playlistName = playlistName))
                insertSongs(songs.map { it.toSongEntity(playlistId) })
                withContext(Main) {
                    context.showToast(context.getString(
                        R.string.playlist_created_sucessfully,
                        playlistName))
                }
            } else {
                val playlist = playlists.firstOrNull()
                if (playlist != null) {
                    insertSongs(songs.map {
                        it.toSongEntity(playListId = playlist.playListId)
                    })
                }
            }
            withContext(Main) {
                EventBus.post(EVENT_PLAY_LIST_UPDATE, null)
                context.showToast(
                    context.getString(
                        R.string.added_song_count_to_playlist,
                        songs.size,
                        playlistName))
            }
        }
    }

    fun setFabMargin(context: Context, bottomMargin: Int) {
        val currentValue = DensityUtil.dip2px(context, 16F) +
                bottomMargin
        ValueAnimator.ofInt(fabMargin.value!!, currentValue).apply {
            addUpdateListener {
                fabMargin.postValue(
                    (it.animatedValue as Int)
                )
            }
            doOnEnd {
                fabMargin.postValue(currentValue)
            }
            start()
        }
    }

    fun getPlaylistSongs(playListId: Long): Collection<Song> {
        return repository.getPlayListSongs(playListId)
    }

    fun getAlbumSongs(id: Long): List<Song> {
        return repository.getAlbumSongs(id)
    }

    fun getArtistSongs(id: Long): List<Song> {
        return repository.getArtistSongsById(id)
    }

    suspend fun getArtists(): List<Artist> {
        return if (PreferenceUtil.albumArtistsOnly) {
            repository.albumArtists()
        } else {
            repository.fetchArtists()
        }
    }

    fun addOrReplaceAlbum(album: Album) {
        repository.addOrReplaceAlbum(album)
    }

    fun deleteSongs(songs: List<Song>) {
        repository.deleteSongs(songs)
    }

    fun getSongCountBySourceId(id: Long): Int {
        return repository.getSongCountBySourceId(id)
    }
}

enum class ReloadType {
    Songs,
    Albums,
    Artists,
    Playlists,
    Genres,
    Suggestions
}
