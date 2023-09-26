package com.caij.puremusic.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H&R\u001b\u0010\b\u001a\u00020\t8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0016"}, d2 = {"Lcom/caij/puremusic/model/AbsCustomPlaylist;", "Lcom/caij/puremusic/model/Playlist;", "Lorg/koin/core/component/KoinComponent;", "id", "", "name", "", "(JLjava/lang/String;)V", "songRepository", "Lcom/caij/puremusic/repository/SongRepository;", "getSongRepository", "()Lcom/caij/puremusic/repository/SongRepository;", "songRepository$delegate", "Lkotlin/Lazy;", "topPlayedRepository", "Lcom/caij/puremusic/repository/TopPlayedRepository;", "getTopPlayedRepository", "()Lcom/caij/puremusic/repository/TopPlayedRepository;", "topPlayedRepository$delegate", "songs", "", "Lcom/caij/puremusic/db/model/Song;", "app_chinaRelease"})
public abstract class AbsCustomPlaylist extends com.caij.puremusic.model.Playlist implements org.koin.core.component.KoinComponent {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy songRepository$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy topPlayedRepository$delegate = null;
    
    public AbsCustomPlaylist(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        super(0L, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.Song> songs();
    
    @org.jetbrains.annotations.NotNull()
    protected final com.caij.puremusic.repository.SongRepository getSongRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.caij.puremusic.repository.TopPlayedRepository getTopPlayedRepository() {
        return null;
    }
}