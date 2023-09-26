package com.caij.puremusic.helper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0018"}, d2 = {"Lcom/caij/puremusic/helper/SearchQueryHelper;", "Lorg/koin/core/component/KoinComponent;", "()V", "ALBUM_SELECTION", "", "AND", "ARTIST_SELECTION", "TITLE_SELECTION", "songRepository", "Lcom/caij/puremusic/repository/SongRepository;", "getSongRepository", "()Lcom/caij/puremusic/repository/SongRepository;", "songRepository$delegate", "Lkotlin/Lazy;", "songs", "Ljava/util/ArrayList;", "Lcom/caij/puremusic/db/model/Song;", "getSongs", "()Ljava/util/ArrayList;", "setSongs", "(Ljava/util/ArrayList;)V", "", "extras", "Landroid/os/Bundle;", "app_chinaRelease"})
public final class SearchQueryHelper implements org.koin.core.component.KoinComponent {
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.helper.SearchQueryHelper INSTANCE = null;
    private static final java.lang.String TITLE_SELECTION = "lower(title)";
    private static final java.lang.String ALBUM_SELECTION = "lower(album_name)";
    private static final java.lang.String ARTIST_SELECTION = "lower(artist_name)";
    private static final java.lang.String AND = " AND ";
    private static final kotlin.Lazy songRepository$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static java.util.ArrayList<com.caij.puremusic.db.model.Song> songs;
    
    private SearchQueryHelper() {
        super();
    }
    
    private final com.caij.puremusic.repository.SongRepository getSongRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.caij.puremusic.db.model.Song> getSongs() {
        return null;
    }
    
    public final void setSongs(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.caij.puremusic.db.model.Song> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.util.List<com.caij.puremusic.db.model.Song> getSongs(@org.jetbrains.annotations.NotNull()
    android.os.Bundle extras) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
}