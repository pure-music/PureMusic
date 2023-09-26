package com.caij.puremusic.service;

import java.lang.System;

/**
 * Created by hemanths on 2019-08-01.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J(\u0010\u001b\u001a\u00020\u001c2\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u001ej\b\u0012\u0004\u0012\u00020\u001f` 2\u0006\u0010!\u001a\u00020\"H\u0002J\u001a\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u0010(\u001a\u00020\u001cH\u0016J\b\u0010)\u001a\u00020\u001cH\u0016J\u001c\u0010*\u001a\u00020\u001c2\b\u0010+\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u001c\u0010,\u001a\u00020\u001c2\b\u0010-\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u0010.\u001a\u00020\u001cH\u0016J\u0010\u0010/\u001a\u00020\u001c2\u0006\u00100\u001a\u00020\"H\u0016J\b\u00101\u001a\u00020\u001cH\u0016J\b\u00102\u001a\u00020\u001cH\u0016J\b\u00103\u001a\u00020\u001cH\u0016J2\u00104\u001a\u00020\u001c2\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u001ej\b\u0012\u0004\u0012\u00020\u001f` 2\u0006\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u000208H\u0002R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u0018\u0010\u0019\u00a8\u00069"}, d2 = {"Lcom/caij/puremusic/service/MediaSessionCallback;", "Landroid/support/v4/media/session/MediaSessionCompat$Callback;", "Lorg/koin/core/component/KoinComponent;", "musicService", "Lcom/caij/puremusic/service/MusicService;", "(Lcom/caij/puremusic/service/MusicService;)V", "genreRepository", "Lcom/caij/puremusic/repository/GenreRepository;", "getGenreRepository", "()Lcom/caij/puremusic/repository/GenreRepository;", "genreRepository$delegate", "Lkotlin/Lazy;", "roomRepository", "Lcom/caij/puremusic/repository/RoomRepository;", "getRoomRepository", "()Lcom/caij/puremusic/repository/RoomRepository;", "roomRepository$delegate", "songRepository", "Lcom/caij/puremusic/repository/SongRepository;", "getSongRepository", "()Lcom/caij/puremusic/repository/SongRepository;", "songRepository$delegate", "topPlayedRepository", "Lcom/caij/puremusic/repository/TopPlayedRepository;", "getTopPlayedRepository", "()Lcom/caij/puremusic/repository/TopPlayedRepository;", "topPlayedRepository$delegate", "checkAndStartPlaying", "", "songs", "Ljava/util/ArrayList;", "Lcom/caij/puremusic/db/model/Song;", "Lkotlin/collections/ArrayList;", "itemId", "", "onCustomAction", "action", "", "extras", "Landroid/os/Bundle;", "onPause", "onPlay", "onPlayFromMediaId", "mediaId", "onPlayFromSearch", "query", "onPrepare", "onSeekTo", "pos", "onSkipToNext", "onSkipToPrevious", "onStop", "openQueue", "index", "", "startPlaying", "", "app_chinaRelease"})
public final class MediaSessionCallback extends android.support.v4.media.session.MediaSessionCompat.Callback implements org.koin.core.component.KoinComponent {
    private final com.caij.puremusic.service.MusicService musicService = null;
    private final kotlin.Lazy songRepository$delegate = null;
    private final kotlin.Lazy genreRepository$delegate = null;
    private final kotlin.Lazy topPlayedRepository$delegate = null;
    private final kotlin.Lazy roomRepository$delegate = null;
    
    public MediaSessionCallback(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.service.MusicService musicService) {
        super();
    }
    
    private final com.caij.puremusic.repository.SongRepository getSongRepository() {
        return null;
    }
    
    private final com.caij.puremusic.repository.GenreRepository getGenreRepository() {
        return null;
    }
    
    private final com.caij.puremusic.repository.TopPlayedRepository getTopPlayedRepository() {
        return null;
    }
    
    private final com.caij.puremusic.repository.RoomRepository getRoomRepository() {
        return null;
    }
    
    @java.lang.Override()
    public void onPlayFromMediaId(@org.jetbrains.annotations.Nullable()
    java.lang.String mediaId, @org.jetbrains.annotations.Nullable()
    android.os.Bundle extras) {
    }
    
    @java.lang.Override()
    public void onPlayFromSearch(@org.jetbrains.annotations.Nullable()
    java.lang.String query, @org.jetbrains.annotations.Nullable()
    android.os.Bundle extras) {
    }
    
    @java.lang.Override()
    public void onPrepare() {
    }
    
    @java.lang.Override()
    public void onPlay() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onSkipToNext() {
    }
    
    @java.lang.Override()
    public void onSkipToPrevious() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onSeekTo(long pos) {
    }
    
    @java.lang.Override()
    public void onCustomAction(@org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.Nullable()
    android.os.Bundle extras) {
    }
    
    private final void checkAndStartPlaying(java.util.ArrayList<com.caij.puremusic.db.model.Song> songs, long itemId) {
    }
    
    private final void openQueue(java.util.ArrayList<com.caij.puremusic.db.model.Song> songs, int index, boolean startPlaying) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
}