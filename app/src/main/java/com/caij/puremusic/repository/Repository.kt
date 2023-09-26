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
import com.caij.puremusic.fragments.search.Filter
import com.caij.puremusic.network.LastFMService
import com.caij.puremusic.network.Result
import com.caij.puremusic.network.Result.Error
import com.caij.puremusic.network.Result.Success
import com.caij.puremusic.network.model.LastFmAlbum
import com.caij.puremusic.network.model.LastFmArtist
import com.caij.puremusic.*
import com.caij.puremusic.db.model.*
import com.caij.puremusic.model.*
import com.caij.puremusic.util.*
import com.caij.puremusic.db.model.Song

interface Repository {

    fun historySong(l: Long): List<HistoryEntity>
    fun favorites(): List<SongEntity>
    fun albumById(albumId: Long): Album?
    fun playlistSongs(playListId: Long): List<SongEntity>
    suspend fun fetchAlbums(): List<Album>
    suspend fun allSongs(): List<Song>
    suspend fun fetchArtists(): List<Artist>
    suspend fun albumArtists(): List<Artist>
    suspend fun fetchGenres(): List<Genre>
    suspend fun search(query: String?, filter: Filter): MutableList<Any>
    suspend fun getGenre(genreId: Long): List<Song>
    suspend fun artistInfo(name: String, lang: String?, cache: String?): Result<LastFmArtist>
    suspend fun albumInfo(artist: String, album: String): Result<LastFmAlbum>
    fun artistById(artistId: Long): Artist?
    suspend fun albumArtistByName(name: String): Artist?
    suspend fun topArtists(): List<Artist>
    suspend fun topAlbums(): List<Album>
    suspend fun recentArtistsHome(): Home
    suspend fun topArtistsHome(): Home
    suspend fun topAlbumsHome(): Home
    suspend fun recentAlbumsHome(): Home
    suspend fun favoritePlaylistHome(): Home
    suspend fun suggestions(): List<Song>
    suspend fun genresHome(): Home
    suspend fun homeSections(): List<Home>
    suspend fun insertSongEntities(songs: List<SongEntity>)
    suspend fun checkPlaylistExists(playlistName: String): List<PlaylistEntity>
    suspend fun createPlaylist(playlistEntity: PlaylistEntity): Long
    suspend fun fetchPlaylists(): List<PlaylistEntity>
    suspend fun deleteRoomPlaylist(playlists: List<PlaylistEntity>)
    suspend fun renameRoomPlaylist(playlistId: Long, name: String)
    suspend fun deleteSongsInPlaylist(songs: List<SongEntity>)
    suspend fun removeSongFromPlaylist(songEntity: SongEntity)
    suspend fun deletePlaylistSongs(playlists: List<PlaylistEntity>)
    suspend fun favoritePlaylist(): PlaylistEntity
    suspend fun isFavoriteSong(songEntity: SongEntity): List<SongEntity>
    suspend fun addSongToHistory(currentSong: Song)
    suspend fun songPresentInHistory(currentSong: Song): HistoryEntity?
    suspend fun updateHistorySong(currentSong: Song)
    suspend fun favoritePlaylistSongs(): List<SongEntity>
    suspend fun insertSongInPlayCount(playCountEntity: PlayCountEntity)
    suspend fun updateSongInPlayCount(playCountEntity: PlayCountEntity)
    suspend fun deleteSongInPlayCount(playCountEntity: PlayCountEntity)
    suspend fun deleteSongInHistory(songId: Long)
    suspend fun clearSongHistory()
    suspend fun checkSongExistInPlayCount(songId: Long): List<PlayCountEntity>
    suspend fun playCountSongs(): List<PlayCountEntity>
    suspend fun deletePlayCountSongs(songs: List<Song>)
    suspend fun contributor(): List<Contributor>
    suspend fun searchArtists(query: String): List<Artist>
    suspend fun isSongFavorite(songId: Long): Boolean
    fun getSongByGenre(genreId: Long): Song
    fun checkPlaylistExists(playListId: Long): Boolean
    suspend fun insertAllAlbums(grouped: List<Album>)
    fun clearSongs()
    fun clearAlbums()
    fun updateSong(song: Song)
    fun insertAllArtists(artists: List<Artist>)
    fun clearArtists()
    fun deleteSongBySource(id: Long)
//    fun groupByArtistId(allSongs: List<Song>): List<Artist>
//    fun groupByAlbumId(allSongs: List<Song>): List<Album>
    fun getSongById(id: Long): Song?
    fun getSongEntity(playListId: Long, songId: Long): SongEntity?
    fun getPlayListSongs(playListId: Long): List<Song>
    fun getPlaylistEntity(playlistId: Long): PlaylistEntity?
    fun getPlayListSongCount(playListId: Long): Int
    fun getPlaylistLastAddSong(playListId: Long): SongEntity?
    fun getAlbumSongs(id: Long): List<Song>
    fun getArtistSongsById(id: Long): List<Song>
    fun recentArtists(): List<Artist>
    fun recentAlbums(): List<Album>
    fun insertArtist(artist: Artist)
    fun deleteSongFromPlaylist(playlistId: Long, songId: Long)
    fun getAlbumSongCount(albumId: Long): Int
    fun deleteAlbumById(albumId: Long)
    fun getArtistSongCount(id: Long): Int
    fun deleteArtistById(id: Long)
    fun checkSongPlaylistExists(playlistId: Long, songId: Long): Boolean
    fun addOrReplaceAlbum(album: Album)
    fun getSongBySource(id: Long): List<Song>
    fun deleteSongs(songs: List<Song>)
    fun getSongCountBySourceId(id: Long): Int
}

class RealRepository(
    private val context: Context,
    private val lastFMService: LastFMService,
    private val songRepository: SongRepository,
    private val genreRepository: GenreRepository,
    private val searchRepository: RealSearchRepository,
    private val topPlayedRepository: TopPlayedRepository,
    private val roomRepository: RoomRepository,
    private val localDataRepository: LocalDataRepository,
) : Repository {

    override fun getSongByGenre(genreId: Long): Song = genreRepository.song(genreId)

    override suspend fun deletePlayCountSongs(songs: List<Song>) = roomRepository.deletePlayCountSongs(songs)

    suspend fun insertAllSongs(songs: List<Song>) = roomRepository.insertAllSongs(songs)

    override suspend fun contributor(): List<Contributor> = localDataRepository.contributors()

    override suspend fun isSongFavorite(songId: Long): Boolean =
        roomRepository.isSongFavorite(context, songId)

    override suspend fun insertAllAlbums(grouped: List<Album>) = roomRepository.insertAllAlbums(grouped)

    override fun clearSongs() {
        roomRepository.clearSongs()
    }

    override fun clearAlbums() {
        roomRepository.clearAlbums()
    }

    override fun updateSong(song: Song) {
        roomRepository.updateSong(song)
    }

    override fun insertAllArtists(artists: List<Artist>) {
        roomRepository.insertAllArtists(artists)
    }

    override fun clearArtists() {
        roomRepository.clearArtists()
    }

    override fun deleteSongBySource(id: Long) {
        roomRepository.deleteSongBySource(id)
    }

//    override fun groupByArtistId(allSongs: List<Song>): List<Artist> {
//        return ArtistUtil.splitIntoArtists(allSongs)
//    }

//    override fun groupByAlbumId(allSongs: List<Song>): List<Album> {
//        return albumRepository.splitIntoAlbums(allSongs, false)
//    }

    override fun getSongById(id: Long): Song? {
        return songRepository.song(id)
    }

    override fun getSongEntity(playListId: Long, songId: Long): SongEntity? {
        return roomRepository.getSongEntity(playListId, songId)
    }

    override fun getPlayListSongs(playListId: Long): List<Song> {
        val songs = ArrayList<Song>()
        val  songEntities = roomRepository.songEntities(playListId)
        songEntities.forEach {
            val song = roomRepository.song(it.songId)
            if (song != null) {
                songs.add(song)
            }
        }
        return songs
    }

    override fun getPlaylistEntity(playlistId: Long): PlaylistEntity? {
        return roomRepository.getPlaylistEntity(playlistId)
    }

    override fun getPlayListSongCount(playListId: Long): Int {
        return roomRepository.getPlayListSongCount(playListId)
    }

    override fun getPlaylistLastAddSong(playListId: Long): SongEntity? {
        return roomRepository.getPlaylistLastAddSong(playListId)
    }

    override fun getAlbumSongs(id: Long): List<Song> {
        return roomRepository.songsByAlumId(id)
    }

    override fun getArtistSongsById(id: Long): List<Song> {
        return roomRepository.songsByArtistIdWithLike(id)
    }

    override fun recentArtists(): List<Artist> {
        return ArtistUtil.splitIntoArtists(songRepository.recentSongs())
    }

    override fun recentAlbums(): List<Album> {
        return BaseAlbumUtil.splitIntoAlbums(songRepository.recentSongs())
    }

    override fun insertArtist(artist: Artist) {
        roomRepository.insertArtist(artist)
    }

    override fun deleteSongFromPlaylist(playlistId: Long, songId: Long) {
        roomRepository.deleteSongFromPlaylist(playlistId, songId)
    }

    override fun getAlbumSongCount(albumId: Long): Int {
       return roomRepository.getAlbumSongCount(albumId)
    }

    override fun deleteAlbumById(albumId: Long) {
        roomRepository.deleteAlbumById(albumId)
    }

    override fun getArtistSongCount(id: Long): Int {
        return roomRepository.getArtistSongCount(id)
    }

    override fun deleteArtistById(id: Long) {
        roomRepository.deleteArtistById(id)
    }

    override fun checkSongPlaylistExists(playlistId: Long, songId: Long): Boolean {
        return roomRepository.checkSongPlaylistExists(playlistId, songId)
    }

    override fun addOrReplaceAlbum(album: Album) {
        roomRepository.addOrReplaceAlbum(album)
    }

    override fun getSongBySource(id: Long): List<Song> {
        return roomRepository.getSongBySource(id)
    }

    override fun deleteSongs(songs: List<Song>) {
        roomRepository.deleteSongs(songs)
    }

    override fun getSongCountBySourceId(id: Long): Int {
        return roomRepository.getSongCountBySourceId(id)
    }

    override suspend fun searchArtists(query: String): List<Artist> =
        roomRepository.searchArtistByName(query)

    override suspend fun fetchAlbums(): List<Album> = roomRepository.albums()

    override fun albumById(albumId: Long): Album? = roomRepository.album(albumId)

    override suspend fun fetchArtists(): List<Artist> = roomRepository.artists()

    override suspend fun albumArtists(): List<Artist> = emptyList()

    override fun artistById(artistId: Long): Artist? = roomRepository.artistById(artistId)

    override suspend fun albumArtistByName(name: String): Artist? =
        roomRepository.artistByName(name)

    override suspend fun topArtists(): List<Artist> = topPlayedRepository.topArtists()

    override suspend fun topAlbums(): List<Album> = topPlayedRepository.topAlbums()

    override suspend fun fetchGenres(): List<Genre> = genreRepository.genres()

    override suspend fun allSongs(): List<Song> = songRepository.songsDefaultOrder()

    override suspend fun search(query: String?, filter: Filter): MutableList<Any> =
        searchRepository.searchAll(context, query, filter)

    override suspend fun getGenre(genreId: Long): List<Song> = genreRepository.songs(genreId)

    override suspend fun artistInfo(
        name: String,
        lang: String?,
        cache: String?,
    ): Result<LastFmArtist> {
        return try {
            Success(lastFMService.artistInfo(name, lang, cache))
        } catch (e: Exception) {
            logE(e)
            Error(e)
        }
    }

    override suspend fun albumInfo(
        artist: String,
        album: String,
    ): Result<LastFmAlbum> {
        return try {
            val lastFmAlbum = lastFMService.albumInfo(artist, album)
            Success(lastFmAlbum)
        } catch (e: Exception) {
            logE(e)
            Error(e)
        }
    }

    override suspend fun homeSections(): List<Home> {
        val homeSections = mutableListOf<Home>()
        val sections: List<Home> = listOf(
            topArtistsHome(),
            topAlbumsHome(),
            recentArtistsHome(),
            recentAlbumsHome(),
            favoritePlaylistHome()
        )
        for (section in sections) {
            if (section.arrayList.isNotEmpty()) {
                homeSections.add(section)
            }
        }
        return homeSections
    }

    override fun playlistSongs(playListId: Long): List<SongEntity> =
        roomRepository.songEntities(playListId)

    override suspend fun insertSongEntities(songs: List<SongEntity>) =
        roomRepository.insertSongs(songs)

    override suspend fun checkPlaylistExists(playlistName: String): List<PlaylistEntity> =
        roomRepository.checkPlaylistExists(playlistName)

    override fun checkPlaylistExists(playListId: Long): Boolean =
        roomRepository.checkPlaylistExists(playListId)

    override suspend fun createPlaylist(playlistEntity: PlaylistEntity): Long =
        roomRepository.createPlaylist(playlistEntity)

    override suspend fun fetchPlaylists(): List<PlaylistEntity> = roomRepository.playlists()

    override suspend fun deleteRoomPlaylist(playlists: List<PlaylistEntity>) =
        roomRepository.deletePlaylistEntities(playlists)

    override suspend fun renameRoomPlaylist(playlistId: Long, name: String) =
        roomRepository.renamePlaylistEntity(playlistId, name)

    override suspend fun deleteSongsInPlaylist(songs: List<SongEntity>) =
        roomRepository.deleteSongsInPlaylist(songs)

    override suspend fun removeSongFromPlaylist(songEntity: SongEntity) =
        roomRepository.removeSongFromPlaylist(songEntity)

    override suspend fun deletePlaylistSongs(playlists: List<PlaylistEntity>) =
        roomRepository.deletePlaylistSongs(playlists)

    override suspend fun favoritePlaylist(): PlaylistEntity =
        roomRepository.favoritePlaylist(context.getString(R.string.favorites))

    override suspend fun isFavoriteSong(songEntity: SongEntity): List<SongEntity> =
        roomRepository.isFavoriteSong(songEntity)

    override suspend fun addSongToHistory(currentSong: Song) =
        roomRepository.addSongToHistory(currentSong)

    override suspend fun songPresentInHistory(currentSong: Song): HistoryEntity? =
        roomRepository.songPresentInHistory(currentSong)

    override suspend fun updateHistorySong(currentSong: Song) =
        roomRepository.updateHistorySong(currentSong)

    override suspend fun favoritePlaylistSongs(): List<SongEntity> =
        roomRepository.favoritePlaylistSongs(context.getString(R.string.favorites))

    override suspend fun insertSongInPlayCount(playCountEntity: PlayCountEntity) =
        roomRepository.insertSongInPlayCount(playCountEntity)

    override suspend fun updateSongInPlayCount(playCountEntity: PlayCountEntity) =
        roomRepository.updateSongInPlayCount(playCountEntity)

    override suspend fun deleteSongInPlayCount(playCountEntity: PlayCountEntity) =
        roomRepository.deleteSongInPlayCount(playCountEntity)

    override suspend fun deleteSongInHistory(songId: Long) =
        roomRepository.deleteSongInHistory(songId)

    override suspend fun clearSongHistory() {
        roomRepository.clearSongHistory()
    }

    override suspend fun checkSongExistInPlayCount(songId: Long): List<PlayCountEntity> =
        roomRepository.checkSongExistInPlayCount(songId)

    override suspend fun playCountSongs(): List<PlayCountEntity> =
        roomRepository.playCountSongs()

    override fun historySong(cutoff: Long): List<HistoryEntity> =
        roomRepository.historySongs(cutoff)

    override fun favorites(): List<SongEntity> =
        roomRepository.favoritePlaylistSongs(context.getString(R.string.favorites))

    override suspend fun suggestions(): List<Song> {
        val cutoff = PreferenceUtil.getRecentlyPlayedCutoffTimeMillis()
        return songRepository.notRecentlyPlayedTracks(cutoff).shuffled().takeIf {
            it.size > 9
        } ?: emptyList()
    }

    override suspend fun genresHome(): Home {
        val genres = genreRepository.genres().shuffled()
        return Home(genres, GENRES, R.string.genres)
    }

    override suspend fun recentArtistsHome(): Home {
        val artists = ArtistUtil.splitIntoArtists(songRepository.recentSongs()).take(5)
        return Home(artists, RECENT_ARTISTS, R.string.recent_artists)
    }

    override suspend fun recentAlbumsHome(): Home {
        val albums = BaseAlbumUtil.splitIntoAlbums(songRepository.recentSongs()).take(5)
        return Home(albums, RECENT_ALBUMS, R.string.recent_albums)
    }

    override suspend fun topAlbumsHome(): Home {
        val albums = topPlayedRepository.topAlbums().take(5)
        return Home(albums, TOP_ALBUMS, R.string.top_albums)
    }

    override suspend fun topArtistsHome(): Home {
        val artists = topPlayedRepository.topArtists().take(5)
        return Home(artists, TOP_ARTISTS, R.string.top_artists)
    }

    override suspend fun favoritePlaylistHome(): Home {
        val songs = favoritePlaylistSongs()
        val realSongs = ArrayList<Song>()
        songs.forEach { songEntity ->
            val song = getSongById(songEntity.songId)
            if (song != null) {
                realSongs.add(song)
            }
        }
        return Home(realSongs, FAVOURITES, R.string.favorites)
    }

}