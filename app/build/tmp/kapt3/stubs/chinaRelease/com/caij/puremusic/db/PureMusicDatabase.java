package com.caij.puremusic.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\u0018H&J\b\u0010\u0019\u001a\u00020\u001aH&J\b\u0010\u001b\u001a\u00020\u001cH&J\b\u0010\u001d\u001a\u00020\u001eH&\u00a8\u0006\u001f"}, d2 = {"Lcom/caij/puremusic/db/PureMusicDatabase;", "", "()V", "albumDao", "Lcom/caij/puremusic/database/AlbumDao;", "artistDao", "Lcom/caij/puremusic/database/ArtistDao;", "driveFileDownUrlInfoDao", "Lcom/caij/puremusic/database/DriveFileDownUrlInfoDao;", "historyDao", "Lcom/caij/puremusic/database/HistoryDao;", "playCountDao", "Lcom/caij/puremusic/database/PlayCountDao;", "playbackDao", "Lcom/caij/puremusic/database/PlaybackDao;", "playlistDao", "Lcom/caij/puremusic/database/PlaylistDao;", "searchAlbumResultDao", "Lcom/caij/puremusic/database/SearchAlbumResultDao;", "serverArtistCoverDao", "Lcom/caij/puremusic/database/ServerArtistCoverDao;", "serverAudioFormatDao", "Lcom/caij/puremusic/database/ServerAudioFormatDao;", "serverLyricsDao", "Lcom/caij/puremusic/database/ServerLyricsDao;", "serverSongCoverDao", "Lcom/caij/puremusic/database/ServerSongCoverDao;", "songDao", "Lcom/caij/puremusic/database/SongsDao;", "songEntityDao", "Lcom/caij/puremusic/database/SongEntityDao;", "app_chinaRelease"})
public abstract class PureMusicDatabase {
    
    public PureMusicDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.caij.puremusic.database.PlaylistDao playlistDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.caij.puremusic.database.PlayCountDao playCountDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.caij.puremusic.database.HistoryDao historyDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.caij.puremusic.database.SongsDao songDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.caij.puremusic.database.AlbumDao albumDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.caij.puremusic.database.ArtistDao artistDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.caij.puremusic.database.SongEntityDao songEntityDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.caij.puremusic.database.PlaybackDao playbackDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.caij.puremusic.database.ServerLyricsDao serverLyricsDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.caij.puremusic.database.ServerSongCoverDao serverSongCoverDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.caij.puremusic.database.ServerArtistCoverDao serverArtistCoverDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.caij.puremusic.database.ServerAudioFormatDao serverAudioFormatDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.caij.puremusic.database.DriveFileDownUrlInfoDao driveFileDownUrlInfoDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.caij.puremusic.database.SearchAlbumResultDao searchAlbumResultDao();
}