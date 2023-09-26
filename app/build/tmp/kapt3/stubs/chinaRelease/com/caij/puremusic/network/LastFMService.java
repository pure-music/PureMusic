package com.caij.puremusic.network;

import java.lang.System;

/**
 * Created by hemanths on 2019-11-26.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J3\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/caij/puremusic/network/LastFMService;", "", "albumInfo", "Lcom/caij/puremusic/network/model/LastFmAlbum;", "artistName", "", "albumName", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "artistInfo", "Lcom/caij/puremusic/network/model/LastFmArtist;", "language", "cacheControl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_chinaRelease"})
public abstract interface LastFMService {
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.network.LastFMService.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_QUERY_PARAMETERS = "?format=json&autocorrect=1&api_key=c679c8d3efa84613dc7dcb2e8d42da4c";
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "?format=json&autocorrect=1&api_key=c679c8d3efa84613dc7dcb2e8d42da4c&method=artist.getinfo")
    public abstract java.lang.Object artistInfo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "artist")
    java.lang.String artistName, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "lang")
    java.lang.String language, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Cache-Control")
    java.lang.String cacheControl, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.caij.puremusic.network.model.LastFmArtist> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "?format=json&autocorrect=1&api_key=c679c8d3efa84613dc7dcb2e8d42da4c&method=album.getinfo")
    public abstract java.lang.Object albumInfo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "artist")
    java.lang.String artistName, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "album")
    java.lang.String albumName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.caij.puremusic.network.model.LastFmAlbum> continuation);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/caij/puremusic/network/LastFMService$Companion;", "", "()V", "API_KEY", "", "BASE_QUERY_PARAMETERS", "app_chinaRelease"})
    public static final class Companion {
        private static final java.lang.String API_KEY = "c679c8d3efa84613dc7dcb2e8d42da4c";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BASE_QUERY_PARAMETERS = "?format=json&autocorrect=1&api_key=c679c8d3efa84613dc7dcb2e8d42da4c";
        
        private Companion() {
            super();
        }
    }
}