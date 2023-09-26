package com.caij.puremusic.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\bJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000f\u001a\u00020\fJ(\u0010\u000e\u001a\u00020\u00102\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0012j\b\u0012\u0004\u0012\u00020\t`\u00132\u0006\u0010\u000f\u001a\u00020\fH\u0002J.\u0010\u000e\u001a\u00020\u00102\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0012j\b\u0012\u0004\u0012\u00020\t`\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015J\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b\u00a8\u0006\u0017"}, d2 = {"Lcom/caij/puremusic/util/ArtistUtil;", "", "()V", "contains", "", "aid", "", "artists", "", "Lcom/caij/puremusic/db/model/Artist;", "sortArtists", "sortedSongs", "Lcom/caij/puremusic/db/model/Song;", "songs", "splitIntoArtists", "song", "", "data", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "artistId", "", "artistName", "app_chinaRelease"})
public final class ArtistUtil {
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.util.ArtistUtil INSTANCE = null;
    
    private ArtistUtil() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.caij.puremusic.db.model.Song> sortedSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Song> songs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.caij.puremusic.db.model.Artist> sortArtists(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Artist> artists) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.caij.puremusic.db.model.Artist> splitIntoArtists(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Song> songs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.caij.puremusic.db.model.Artist> splitIntoArtists(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song song) {
        return null;
    }
    
    private final void splitIntoArtists(java.util.ArrayList<com.caij.puremusic.db.model.Artist> data, com.caij.puremusic.db.model.Song song) {
    }
    
    public final void splitIntoArtists(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.caij.puremusic.db.model.Artist> data, @org.jetbrains.annotations.NotNull()
    java.lang.String artistId, @org.jetbrains.annotations.NotNull()
    java.lang.String artistName) {
    }
    
    public final boolean contains(long aid, @org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Artist> artists) {
        return false;
    }
}