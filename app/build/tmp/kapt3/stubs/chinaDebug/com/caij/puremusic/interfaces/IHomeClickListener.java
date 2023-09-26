package com.caij.puremusic.interfaces;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lcom/caij/puremusic/interfaces/IHomeClickListener;", "", "onAlbumClick", "", "album", "Lcom/caij/puremusic/db/model/Album;", "onArtistClick", "artist", "Lcom/caij/puremusic/db/model/Artist;", "onGenreClick", "genre", "Lcom/caij/puremusic/model/Genre;", "app_chinaDebug"})
public abstract interface IHomeClickListener {
    
    public abstract void onAlbumClick(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Album album);
    
    public abstract void onArtistClick(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Artist artist);
    
    public abstract void onGenreClick(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.model.Genre genre);
}