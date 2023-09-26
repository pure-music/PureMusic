package com.caij.puremusic.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lcom/caij/puremusic/interfaces/IArtistClickListener;", "", "getArtistSongs", "", "Lcom/caij/puremusic/db/model/Song;", "id", "", "onArtist", "", "artistId", "view", "Landroid/view/View;", "app_chinaRelease"})
public abstract interface IArtistClickListener {
    
    public abstract void onArtist(long artistId, @org.jetbrains.annotations.NotNull()
    android.view.View view);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.Song> getArtistSongs(long id);
}