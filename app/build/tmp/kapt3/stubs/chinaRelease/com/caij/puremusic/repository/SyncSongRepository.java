package com.caij.puremusic.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J(\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u000fj\b\u0012\u0004\u0012\u00020\u0007`\u0010H\u0002J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0015\u001a\u00020\tH\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\tH\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\tH\u0016J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J&\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\t0\u000fj\b\u0012\u0004\u0012\u00020\t`\u0010H\u0016J&\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u000e\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\b\u0010(\u001a\u00020\u0013H\u0002J\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/caij/puremusic/repository/SyncSongRepository;", "Lcom/caij/puremusic/repository/SongRepository;", "roomRepository", "Lcom/caij/puremusic/repository/RealRoomRepository;", "(Lcom/caij/puremusic/repository/RealRoomRepository;)V", "notRecentlyPlayedTracks", "", "Lcom/caij/puremusic/db/model/Song;", "cutoff", "", "recentSongs", "remove", "", "id", "songs", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "searchSongsByTitle", "title", "", "song", "songId", "songsByAlum", "album", "songsByAlumId", "songsByArtist", "artist", "songsByArtistIdWithLike", "songsByFilePath", "filePath", "ignoreBlacklist", "", "songsByIds", "ids", "songsByInfo", "songsByNameAlbum", "songsByNameArtist", "songsByTitle", "songsDateLastDesc", "songsDefaultOrder", "sortedSongs", "app_chinaRelease"})
public final class SyncSongRepository implements com.caij.puremusic.repository.SongRepository {
    private final com.caij.puremusic.repository.RealRoomRepository roomRepository = null;
    
    public SyncSongRepository(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.repository.RealRoomRepository roomRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.Song> songsDefaultOrder() {
        return null;
    }
    
    private final java.util.List<com.caij.puremusic.db.model.Song> sortedSongs(java.util.List<com.caij.puremusic.db.model.Song> songs) {
        return null;
    }
    
    private final java.lang.String sortedSongs() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.caij.puremusic.db.model.Song song(long songId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.Song> searchSongsByTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.Song> songsByTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.Song> songsByAlum(@org.jetbrains.annotations.NotNull()
    java.lang.String album) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.Song> songsByArtist(@org.jetbrains.annotations.NotNull()
    java.lang.String artist) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.Song> songsByInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String artist, @org.jetbrains.annotations.NotNull()
    java.lang.String album) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.Song> songsByNameArtist(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String artist) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.Song> songsByNameAlbum(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String album) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.Song> songsByIds(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Long> ids) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.Song> songsByArtistIdWithLike(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.Song> songsDateLastDesc(long cutoff) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.Song> songsByAlumId(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.Song> recentSongs(long cutoff) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.Song> notRecentlyPlayedTracks(long cutoff) {
        return null;
    }
    
    private final void remove(long id, java.util.ArrayList<com.caij.puremusic.db.model.Song> songs) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.Song> songsByFilePath(@org.jetbrains.annotations.NotNull()
    java.lang.String filePath, boolean ignoreBlacklist) {
        return null;
    }
}