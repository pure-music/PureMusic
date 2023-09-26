package com.caij.puremusic.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\tJ\u0014\u0010\n\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fJ\u0014\u0010\r\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u000e0\f\u00a8\u0006\u000f"}, d2 = {"Lcom/caij/puremusic/util/CoverManager;", "", "()V", "deleteSongBySource", "", "id", "", "getArtistCover", "Lcom/caij/puremusic/db/model/ServerArtistCover;", "", "insertArtistCover", "serverSongCovers", "Ljava/util/ArrayList;", "insertServerSongCover", "Lcom/caij/puremusic/db/model/ServerSongCover;", "app_chinaRelease"})
public final class CoverManager {
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.util.CoverManager INSTANCE = null;
    
    private CoverManager() {
        super();
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void insertServerSongCover(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.caij.puremusic.db.model.ServerSongCover> serverSongCovers) {
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void insertArtistCover(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.caij.puremusic.db.model.ServerArtistCover> serverSongCovers) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Synchronized()
    public final synchronized com.caij.puremusic.db.model.ServerArtistCover getArtistCover(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    public final void deleteSongBySource(long id) {
    }
}