package com.caij.puremusic.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\f"}, d2 = {"Lcom/caij/puremusic/repository/GenreRepository;", "", "genres", "", "Lcom/caij/puremusic/model/Genre;", "query", "", "song", "Lcom/caij/puremusic/db/model/Song;", "genreId", "", "songs", "app_chinaRelease"})
public abstract interface GenreRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.model.Genre> genres(@org.jetbrains.annotations.NotNull()
    java.lang.String query);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.model.Genre> genres();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.Song> songs(long genreId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.caij.puremusic.db.model.Song song(long genreId);
}