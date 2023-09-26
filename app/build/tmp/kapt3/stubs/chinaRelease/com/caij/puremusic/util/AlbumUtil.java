package com.caij.puremusic.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0010J\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012\u00a8\u0006\u0017"}, d2 = {"Lcom/caij/puremusic/util/AlbumUtil;", "", "()V", "findFirstSong", "Lcom/caij/puremusic/db/model/Song;", "id", "", "type", "", "isOnlyServer", "", "rateSong", "", "song", "audioFormat", "Lcom/google/android/exoplayer2/Format;", "", "sort", "", "Lcom/caij/puremusic/db/model/Album;", "grouped", "sortAlbumSongs", "songs", "app_chinaRelease"})
public final class AlbumUtil {
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.util.AlbumUtil INSTANCE = null;
    
    private AlbumUtil() {
        super();
    }
    
    public final void rateSong(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song song, @org.jetbrains.annotations.NotNull()
    com.google.android.exoplayer2.Format audioFormat, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
    }
    
    @androidx.annotation.WorkerThread()
    public final boolean isOnlyServer(long id) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.caij.puremusic.db.model.Song findFirstSong(long id, int type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.caij.puremusic.db.model.Song> sortAlbumSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Song> songs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.caij.puremusic.db.model.Album> sort(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Album> grouped) {
        return null;
    }
}