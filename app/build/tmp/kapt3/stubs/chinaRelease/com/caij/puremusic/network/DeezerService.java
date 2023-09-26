package com.caij.puremusic.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\bf\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'JV\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00062\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u00062\b\b\u0003\u0010\u000e\u001a\u00020\u0006H\'Jb\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\'\u00a8\u0006\u0018"}, d2 = {"Lcom/caij/puremusic/network/DeezerService;", "", "getArtistImage", "Lretrofit2/Call;", "Lcom/caij/puremusic/model/DeezerResponse;", "artistName", "", "searchArtist", "Lcom/caij/puremusic/network/model/SearchResponse;", "type", "market", "limit", "offset", "authorization", "include_external", "translationGoogle", "client", "sl", "tl", "dj", "dt", "q", "userAgent", "Companion", "app_chinaRelease"})
public abstract interface DeezerService {
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.network.DeezerService.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.SkipCallbackExecutor()
    @retrofit2.http.GET(value = "search/artist&limit=1")
    public abstract retrofit2.Call<com.caij.puremusic.model.DeezerResponse> getArtistImage(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String artistName);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.SkipCallbackExecutor()
    @retrofit2.http.GET(value = "https://api.spotify.com/v1/search")
    public abstract retrofit2.Call<com.caij.puremusic.network.model.SearchResponse> searchArtist(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String artistName, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "type")
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "market")
    java.lang.String market, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "limit")
    java.lang.String limit, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "offset")
    java.lang.String offset, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "include_external")
    java.lang.String include_external);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "https://translate.googleapis.com/translate_a/single")
    public abstract retrofit2.Call<java.lang.String> translationGoogle(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "client")
    java.lang.String client, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "sl")
    java.lang.String sl, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "tl")
    java.lang.String tl, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "dj")
    java.lang.String dj, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "dt")
    java.lang.String dt, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "q")
    java.lang.String q, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "User-Agent")
    java.lang.String userAgent);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3)
    public final class DefaultImpls {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086\u0002\u00a8\u0006\u000f"}, d2 = {"Lcom/caij/puremusic/network/DeezerService$Companion;", "", "()V", "createCacheControlInterceptor", "Lokhttp3/Interceptor;", "createDefaultCache", "Lokhttp3/Cache;", "context", "Landroid/content/Context;", "createDefaultOkHttpClient", "Lokhttp3/OkHttpClient$Builder;", "invoke", "Lcom/caij/puremusic/network/DeezerService;", "client", "Lokhttp3/Call$Factory;", "app_chinaRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.network.DeezerService invoke(@org.jetbrains.annotations.NotNull()
        okhttp3.Call.Factory client) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final okhttp3.OkHttpClient.Builder createDefaultOkHttpClient(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final okhttp3.Cache createDefaultCache(android.content.Context context) {
            return null;
        }
        
        private final okhttp3.Interceptor createCacheControlInterceptor() {
            return null;
        }
    }
}