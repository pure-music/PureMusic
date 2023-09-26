package com.caij.puremusic.db

import com.caij.puremusic.App
import com.caij.puremusic.database.*
import com.caij.puremusic.database.imp.DriveFileDownUrlInfoDaoImp

object DatabaseUtil {
    public val database = createDatabase(DriverFactory(App.getContext()))

    val pureMusicDatabase: PureMusicDatabase  = object : PureMusicDatabase() {

        val playlistDao = PlaylistDaoImp(database)
        val playCountDao = PlayCountDaoImp(database)
        val historyDao = HistoryDaoImp(database)
        val songDao = SongsDaoImp(database)
        val albumDao = AlbumDaoImp(database)
        val artistDao = ArtistDaoImp(database)
        val songEntityDao = SongEntityDaoImp(database)
        val playbackDao = PlaybackDaoImp(database)
        val serverLyricsDao = ServerLyricsDaoImp(database)
        val serverSongCoverDao = ServerSongCoverDaoImp(database)
        val serverArtistCoverDao = ServerArtistCoverDaoImp(database.serverArtistCoverQueries)
        val serverAudioFormatDao = ServerAudioFormatDaoImp(database.serverAudioFormatQueries)
        val driveFileDownUrlInfoDao = DriveFileDownUrlInfoDaoImp(database.driveFileDownUrlInfoQueries)
        val searchAlbumResultDao = SearchAlbumResultDaoImp(database.searchAlbumResultQueries)

        override fun playlistDao(): PlaylistDao {
            return playlistDao
        }

        override fun playCountDao(): PlayCountDao {
            return playCountDao
        }

        override fun historyDao(): HistoryDao {
            return historyDao
        }

        override fun songDao(): SongsDao {
            return songDao
        }

        override fun albumDao(): AlbumDao {
            return albumDao
        }

        override fun artistDao(): ArtistDao {
            return artistDao
        }

        override fun songEntityDao(): SongEntityDao {
            return songEntityDao
        }

       override fun playbackDao(): PlaybackDao {
           return playbackDao
       }

       override fun serverLyricsDao(): ServerLyricsDao {
           return serverLyricsDao
       }

       override fun serverSongCoverDao(): ServerSongCoverDao {
           return serverSongCoverDao
       }

       override fun serverArtistCoverDao(): ServerArtistCoverDao {
           return serverArtistCoverDao
       }

       override fun serverAudioFormatDao(): ServerAudioFormatDao {
           return serverAudioFormatDao
       }

       override fun driveFileDownUrlInfoDao(): DriveFileDownUrlInfoDao {
           return driveFileDownUrlInfoDao
       }

        override fun searchAlbumResultDao(): SearchAlbumResultDao {
            return searchAlbumResultDao
        }

    }
}