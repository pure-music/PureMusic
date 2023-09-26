package com.caij.puremusic.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\"\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0010j\b\u0012\u0004\u0012\u00020\t`\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\bH\u0002J\n\u0010\u0018\u001a\u0004\u0018\u00010\u000eH\u0002J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/caij/puremusic/repository/RealGenreRepository;", "Lcom/caij/puremusic/repository/GenreRepository;", "contentResolver", "Landroid/content/ContentResolver;", "songRepository", "Lcom/caij/puremusic/repository/SongRepository;", "(Landroid/content/ContentResolver;Lcom/caij/puremusic/repository/SongRepository;)V", "genres", "", "Lcom/caij/puremusic/model/Genre;", "query", "", "getGenreFromCursor", "cursor", "Landroid/database/Cursor;", "getGenresFromCursor", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getSongCount", "", "genreId", "", "getSongsWithNoGenre", "Lcom/caij/puremusic/db/model/Song;", "makeGenreCursor", "makeGenreSongCursor", "song", "songs", "app_chinaRelease"})
public final class RealGenreRepository implements com.caij.puremusic.repository.GenreRepository {
    private final android.content.ContentResolver contentResolver = null;
    private final com.caij.puremusic.repository.SongRepository songRepository = null;
    
    public RealGenreRepository(@org.jetbrains.annotations.NotNull()
    android.content.ContentResolver contentResolver, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.repository.SongRepository songRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.model.Genre> genres(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.model.Genre> genres() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.Song> songs(long genreId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.caij.puremusic.db.model.Song song(long genreId) {
        return null;
    }
    
    private final int getSongCount(long genreId) {
        return 0;
    }
    
    private final com.caij.puremusic.model.Genre getGenreFromCursor(android.database.Cursor cursor) {
        return null;
    }
    
    private final java.util.List<com.caij.puremusic.db.model.Song> getSongsWithNoGenre() {
        return null;
    }
    
    private final android.database.Cursor makeGenreSongCursor(long genreId) {
        return null;
    }
    
    private final java.util.ArrayList<com.caij.puremusic.model.Genre> getGenresFromCursor(android.database.Cursor cursor) {
        return null;
    }
    
    private final android.database.Cursor makeGenreCursor() {
        return null;
    }
    
    private final android.database.Cursor makeGenreCursor(java.lang.String query) {
        return null;
    }
}