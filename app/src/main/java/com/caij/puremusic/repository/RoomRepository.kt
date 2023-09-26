package com.caij.puremusic.repository

import android.content.Context
import androidx.annotation.WorkerThread
import com.caij.puremusic.FAVORITE_PLAYLIST_ID
import com.caij.puremusic.R
import com.caij.puremusic.database.*
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.db.*
import com.caij.puremusic.db.model.*
import com.caij.puremusic.db.model.Album
import com.caij.puremusic.db.model.Artist
import com.caij.puremusic.db.model.ServerAudioFormat

interface RoomRepository {
    fun historySongs(cutoff: Long): List<HistoryEntity>
    fun songEntities(playListId: Long): List<SongEntity>
    suspend fun createPlaylist(playlistEntity: PlaylistEntity): Long
    suspend fun checkPlaylistExists(playlistName: String): List<PlaylistEntity>
    fun playlists(): List<PlaylistEntity>
//    suspend fun playlistWithSongs(): List<PlaylistWithSongs>
    suspend fun insertSongs(songs: List<SongEntity>)
    suspend fun deletePlaylistEntities(playlistEntities: List<PlaylistEntity>)
    suspend fun renamePlaylistEntity(playlistId: Long, name: String)
    suspend fun deleteSongsInPlaylist(songs: List<SongEntity>)
    fun deleteSongFromPlaylist(playlistId: Long, songId: Long)
    suspend fun deletePlaylistSongs(playlists: List<PlaylistEntity>)
    suspend fun favoritePlaylist(favorite: String): PlaylistEntity
    suspend fun isFavoriteSong(songEntity: SongEntity): List<SongEntity>
    suspend fun removeSongFromPlaylist(songEntity: SongEntity)
    suspend fun addSongToHistory(currentSong: Song)
    suspend fun songPresentInHistory(song: Song): HistoryEntity?
    suspend fun updateHistorySong(song: Song)
    fun favoritePlaylistSongs(favorite: String): List<SongEntity>
    suspend fun insertSongInPlayCount(playCountEntity: PlayCountEntity)
    suspend fun updateSongInPlayCount(playCountEntity: PlayCountEntity)
    suspend fun deleteSongInPlayCount(playCountEntity: PlayCountEntity)
    suspend fun deleteSongInHistory(songId: Long)
    suspend fun clearSongHistory()
    suspend fun checkSongExistInPlayCount(songId: Long): List<PlayCountEntity>
    fun playCountSongs(): List<PlayCountEntity>
    suspend fun deletePlayCountSongs(songs: List<Song>)
    suspend fun isSongFavorite(context: Context, songId: Long): Boolean
    fun checkPlaylistExists(playListId: Long): Boolean

    suspend fun insertAllSongs(songs: List<Song>)
    fun allSongs(): List<Song>
    fun song(songId: Long): Song?
    fun songsByFilePath(filePath: String): List<Song>
    fun album(albumId: Long): Album?
    suspend fun insertAllAlbums(grouped: List<Album>)
    fun clearSongs()
    fun clearAlbums()
    fun updateSong(song: Song)
    fun artistById(id: Long): Artist?
    fun artistByName(name: String): Artist?
    fun artists(): List<Artist>
    fun searchArtistByName(query: String): List<Artist>
    fun insertAllArtists(artists: List<Artist>)
    fun clearArtists()
    fun deleteSongBySource(id: Long)
    fun getSongEntity(playListId: Long, songId: Long): SongEntity?
    fun songsOrderDateAdd(): List<Song>
    fun searchSongsByTitle(title: String): List<Song>
    fun songsByTitle(title: String): List<Song>
    fun songsByAlum(album: String): List<Song>
    fun songsByArtist(artist: String): List<Song>
    fun songsByInfo(title: String, artist: String, album: String): List<Song>
    fun songsByNameArtist(title: String, artist: String): List<Song>
    fun songsByNameAlbum(title: String, album: String): List<Song>
    fun songsByAlumId(albumId: Long): List<Song>
    fun songsByIds(ids: List<Long>): List<Song>
    fun songsByArtistIdWithLike(id: Long): List<Song>
    fun songsDateLastDesc(cutoff: Long): List<Song>
    fun albums(): List<Album>
    fun searchAlbumsByName(name: String): List<Album>
    fun getPlaylistEntity(playlistId: Long): PlaylistEntity?
    fun getPlayListSongCount(playListId: Long): Int
    fun getPlaylistLastAddSong(playListId: Long): SongEntity?
    fun searchPlaylistByName(searchString: String): List<PlaylistEntity>
    fun getAlbumByArtistId(id: Long): List<Album>
    fun clearPlaybacks()
    fun insertOriginalPlayingQueuePlayback(originalPlayingQueuePlayback: ArrayList<PlaybackSong>)
    fun insertPlayingQueuePlayback(playingQueuePlayback: ArrayList<PlaybackSong>)
    fun getOriginalPlayingQueuePlayback(): List<PlaybackSong>
    fun getPlayingQueuePlayback(): List<PlaybackSong>
    fun getAudioFormat(id: Long): ServerAudioFormat?
    fun insertArtist(artist: Artist)
    fun getRecentPlaySongs(count: Int): List<Song>
    fun getAlbumSongCount(albumId: Long): Int
    fun deleteAlbumById(albumId: Long)
    fun getArtistSongCount(id: Long): Int
    fun deleteArtistById(id: Long)
    fun checkSongPlaylistExists(playlistId: Long, songId: Long): Boolean
    fun addOrReplaceAlbum(album: Album)
    fun getSongBySource(id: Long): List<Song>
    fun insertSong(newSong: Song)
    fun deleteSongs(songs: List<Song>)
    fun getSongCountBySourceId(id: Long): Int
}

class RealRoomRepository(
    private val playlistDao: PlaylistDao,
    private val playCountDao: PlayCountDao,
    private val historyDao: HistoryDao,
    private val songsDao: SongsDao,
    private val albumDao: AlbumDao,
    private val artistDao: ArtistDao,
    private val songEntityDao: SongEntityDao,
    private val playbackDao: PlaybackDao,
    private val audioFormatDao: ServerAudioFormatDao
) : RoomRepository {
    @WorkerThread
    override suspend fun createPlaylist(playlistEntity: PlaylistEntity): Long =
        playlistDao.createPlaylist(playlistEntity)

    @WorkerThread
    override suspend fun checkPlaylistExists(playlistName: String): List<PlaylistEntity> =
        playlistDao.playlist(playlistName)

    @WorkerThread
    override fun playlists(): List<PlaylistEntity> = playlistDao.playlists()

    @WorkerThread
//    override suspend fun playlistWithSongs(): List<PlaylistWithSongs> = songEntityDao.playlistWithSongs()
//        when (PreferenceUtil.playlistSortOrder) {
//            PLAYLIST_A_Z ->
//                playlistDao.playlistsWithSongs().sortedBy {
//                    it.playlistEntity.playlistName
//                }
//            PLAYLIST_Z_A -> playlistDao.playlistsWithSongs()
//                .sortedByDescending {
//                    it.playlistEntity.playlistName
//                }
//            PLAYLIST_SONG_COUNT -> playlistDao.playlistsWithSongs().sortedBy { it.songs.size }
//            PLAYLIST_SONG_COUNT_DESC -> playlistDao.playlistsWithSongs()
//                .sortedByDescending { it.songs.size }
//            else -> playlistDao.playlistsWithSongs().sortedBy {
//                it.playlistEntity.playlistName
//            }
//        }

    override suspend fun insertSongs(songs: List<SongEntity>) {
        songEntityDao.insertSongs(songs)
    }

    override fun songEntities(playListId: Long): List<SongEntity> =
        songEntityDao.songsFromPlaylist(playListId)

    override fun checkPlaylistExists(playListId: Long): Boolean =
        playlistDao.checkPlaylistExists(playListId)

    override suspend fun deletePlaylistEntities(playlistEntities: List<PlaylistEntity>) =
        playlistDao.deletePlaylists(playlistEntities)

    override suspend fun renamePlaylistEntity(playlistId: Long, name: String) =
        playlistDao.renamePlaylist(playlistId, name)

    override suspend fun deleteSongsInPlaylist(songs: List<SongEntity>) {
        songs.forEach {
            songEntityDao.deleteSongFromPlaylist(it.playlistId, it.songId)
        }
    }

    override fun deleteSongFromPlaylist(playlistId: Long, songId: Long) {
        songEntityDao.deleteSongFromPlaylist(playlistId, songId)
    }

    override suspend fun deletePlaylistSongs(playlists: List<PlaylistEntity>) =
        playlists.forEach {
            songEntityDao.deletePlaylistSongs(it.playListId)
        }

    override suspend fun favoritePlaylist(favorite: String): PlaylistEntity {
        var playlist: PlaylistEntity? = playlistDao.getPlaylistEntityById(FAVORITE_PLAYLIST_ID)
        return if (playlist != null) {
            playlist
        } else {
            playlist = PlaylistEntity(FAVORITE_PLAYLIST_ID,  favorite)
            createPlaylist(playlist)
            playlist
        }
    }

    override suspend fun isFavoriteSong(songEntity: SongEntity): List<SongEntity> =
        songEntityDao.isSongExistsInPlaylist(
            songEntity.playlistId,
            songEntity.songId
        )

    override suspend fun removeSongFromPlaylist(songEntity: SongEntity) =
        songEntityDao.deleteSongFromPlaylist(songEntity.playlistId, songEntity.songId)

    override suspend fun addSongToHistory(currentSong: Song) =
        historyDao.insertSongInHistory(currentSong.toHistoryEntity(System.currentTimeMillis()))

    override suspend fun songPresentInHistory(song: Song): HistoryEntity? =
        historyDao.isSongPresentInHistory(song.id)

    override suspend fun updateHistorySong(song: Song) =
        historyDao.updateHistorySong(song.toHistoryEntity(System.currentTimeMillis()))

    override fun historySongs(cutoff: Long): List<HistoryEntity> = historyDao.historySongs(cutoff)

    override fun favoritePlaylistSongs(favorite: String): List<SongEntity> =
        if (playlistDao.playlist(favorite).isNotEmpty()) songEntityDao.favoritesSongs(
            playlistDao.playlist(favorite).first().playListId
        ) else emptyList()

    override suspend fun insertSongInPlayCount(playCountEntity: PlayCountEntity) =
        playCountDao.insertSongInPlayCount(playCountEntity)

    override suspend fun updateSongInPlayCount(playCountEntity: PlayCountEntity) =
        playCountDao.updateSongInPlayCount(playCountEntity)

    override suspend fun deleteSongInPlayCount(playCountEntity: PlayCountEntity) =
        playCountDao.deleteSongInPlayCount(playCountEntity)

    override suspend fun deleteSongInHistory(songId: Long) {
        historyDao.deleteSongInHistory(songId)
    }

    override suspend fun clearSongHistory() {
        historyDao.clearHistory()
    }

    override suspend fun checkSongExistInPlayCount(songId: Long): List<PlayCountEntity> =
        playCountDao.checkSongExistInPlayCount(songId)

    override fun playCountSongs(): List<PlayCountEntity> =
        playCountDao.playCountSongs()

    override suspend fun deletePlayCountSongs(songs: List<Song>) = songs.forEach {
        playCountDao.deleteSong(it.id)
    }

    override suspend fun isSongFavorite(context: Context, songId: Long): Boolean {
        return songEntityDao.isSongExistsInPlaylist(
            playlistDao.playlist(context.getString(R.string.favorites)).firstOrNull()?.playListId
                ?: -1,
            songId
        ).isNotEmpty()
    }

    override suspend fun insertAllSongs(songs: List<Song>) {
        songsDao.insert(songs)
    }

    override fun allSongs(): List<Song> {
        return songsDao.allSongs()
    }

    override fun song(songId: Long): Song? {
        return songsDao.song(songId)
    }

    override fun songsByFilePath(filePath: String): List<Song> {
        return songsDao.songsByFilePath(filePath)
    }

    override fun album(albumId: Long): Album? {
        return albumDao.album(albumId)
    }

    override suspend fun insertAllAlbums(grouped: List<Album>) {
        albumDao.insertAllAlbums(grouped)
    }

    override fun clearSongs() {
        songsDao.clear()
    }

    override fun clearAlbums() {
        albumDao.clear()
    }

    override fun updateSong(song: Song) {
        songsDao.update(song)
    }

    override fun artistById(id: Long): Artist? {
        return artistDao.artistById(id)
    }

    override fun artistByName(name: String): Artist? {
        return artistDao.artistByName(name)
    }


    override fun artists(): List<Artist> {
        return artistDao.artists()
    }

    override fun searchArtistByName(query: String): List<Artist> {
        return artistDao.searchArtistByName("%$query%")
    }

    override fun insertAllArtists(artists: List<Artist>) {
        artistDao.insertAllArtists(artists)
    }

    override fun clearArtists() {
        artistDao.clear()
    }

    override fun deleteSongBySource(id: Long) {
        songsDao.deleteSongBySource(id)
    }

    override fun getSongEntity(playListId: Long, songId: Long): SongEntity? {
        return songEntityDao.getSongEntity(playListId, songId)
    }

    override fun songsOrderDateAdd(): List<Song> {
        return songsDao.songsOrderDateAdd()
    }

    override fun searchSongsByTitle(title: String): List<Song> {
        return songsDao.searchSongsByTitle(title)
    }

    override fun songsByTitle(title: String): List<Song> {
        return songsDao.songsByTitle(title)
    }

    override fun songsByAlum(album: String): List<Song> {
        return songsDao.songsByAlum(album)
    }

    override fun songsByArtist(artist: String): List<Song> {
        return songsDao.songsByArtist(artist)
    }

    override fun songsByInfo(title: String, artist: String, album: String): List<Song> {
        return songsDao.songsByInfo(title, artist, album)
    }

    override fun songsByNameArtist(title: String, artist: String): List<Song> {
        return songsDao.songsByNameArtist(title, artist)
    }

    override fun songsByNameAlbum(title: String, album: String): List<Song> {
        return songsDao.songsByNameAlbum(title, album)
    }

    override fun songsByAlumId(albumId: Long): List<Song> {
        return songsDao.songsByAlumId(albumId)
    }

    override fun songsByIds(ids: List<Long>): List<Song> {
        return songsDao.songsByIds(ids)
    }

    override fun songsByArtistIdWithLike(id: Long): List<Song> {
        return songsDao.songsByArtistIdWithLike(id)
    }

    override fun songsDateLastDesc(cutoff: Long): List<Song> {
        return songsDao.songsDateLastDesc(cutoff)
    }

    override fun albums(): List<Album> {
        return albumDao.albums()
    }

    override fun searchAlbumsByName(name: String): List<Album> {
        return albumDao.searchAlbumsByName("%$name%")
    }

    override fun getPlaylistEntity(playlistId: Long): PlaylistEntity? {
        return playlistDao.getPlaylistEntityById(playlistId)
    }

    override fun getPlayListSongCount(playListId: Long): Int {
        return songEntityDao.getPlayListSongCount(playListId)
    }

    override fun getPlaylistLastAddSong(playListId: Long): SongEntity? {
        return songEntityDao.getPlaylistLastAddSong(playListId)
    }

    override fun searchPlaylistByName(searchString: String): List<PlaylistEntity> {
        return playlistDao.searchPlaylistByName(searchString)
    }

    override fun getAlbumByArtistId(id: Long): List<Album> {
        return albumDao.getAlbumByArtistId(id)
    }

    override fun clearPlaybacks() {
        playbackDao.clearPlaybacks()
    }

    override fun insertOriginalPlayingQueuePlayback(originalPlayingQueuePlayback: ArrayList<PlaybackSong>) {
        playbackDao.insertPlaybacks(originalPlayingQueuePlayback)
    }

    override fun insertPlayingQueuePlayback(playingQueuePlayback: ArrayList<PlaybackSong>) {
        playbackDao.insertPlaybacks(playingQueuePlayback)
    }

    override fun getOriginalPlayingQueuePlayback(): List<PlaybackSong> {
        return playbackDao.getPlaybacks(2)
    }

    override fun getPlayingQueuePlayback(): List<PlaybackSong> {
        return playbackDao.getPlaybacks(1)
    }

    override fun getAudioFormat(id: Long): ServerAudioFormat? {
        return audioFormatDao.get(id)
    }

    override fun insertArtist(artist: Artist) {
        artistDao.insert(artist)
    }

    override fun getRecentPlaySongs(count: Int): List<Song> {
        val entities = historyDao.historySongsOrderByTime(count)
        val songs = ArrayList<Song>(entities.size)
        entities.forEach {
            val song = songsDao.song(it.id)
            if (song != null) {
                songs.add(song)
            }
        }
        return songs
    }

    override fun getAlbumSongCount(albumId: Long): Int {
        return songsDao.getAlbumSongCount(albumId)
    }

    override fun deleteAlbumById(albumId: Long) {
        albumDao.deleteAlbumById(albumId)
    }

    override fun getArtistSongCount(id: Long): Int {
        return songsDao.getArtistSongCount(id)
    }

    override fun deleteArtistById(id: Long) {
        artistDao.deleteArtistById(id)
    }

    override fun checkSongPlaylistExists(playlistId: Long, songId: Long): Boolean {
        return songEntityDao.checkSongPlaylistExists(playlistId, songId)
    }

    override fun addOrReplaceAlbum(album: Album) {
        albumDao.addOrReplaceAlbum(album)
    }

    override fun getSongBySource(id: Long): List<Song> {
        return songsDao.getSongBySource(id)
    }

    override fun insertSong(newSong: Song) {
        songsDao.insertSong(newSong)
    }

    override fun deleteSongs(songs: List<Song>) {
        songsDao.deleteSongs(songs)
    }

    override fun getSongCountBySourceId(id: Long): Int {
        return songsDao.getSongCountBySourceId(id)
    }
}