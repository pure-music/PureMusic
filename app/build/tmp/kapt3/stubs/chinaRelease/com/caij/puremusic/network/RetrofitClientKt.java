package com.caij.puremusic.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a\b\u0010\t\u001a\u0004\u0018\u00010\n\u001a\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b\u001a\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b\u001a\u0016\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\n\u00a8\u0006\u0014"}, d2 = {"headerInterceptor", "Lokhttp3/Interceptor;", "context", "Landroid/content/Context;", "logInterceptor", "provideDeezerRest", "Lcom/caij/puremusic/network/DeezerService;", "retrofit", "Lretrofit2/Retrofit;", "provideDefaultCache", "Lokhttp3/Cache;", "provideLastFmRest", "Lcom/caij/puremusic/network/LastFMService;", "provideLastFmRetrofit", "client", "Lokhttp3/OkHttpClient;", "provideLyrics", "Lcom/caij/puremusic/network/LyricsRestService;", "provideOkHttp", "cache", "app_chinaRelease"})
public final class RetrofitClientKt {
    
    @org.jetbrains.annotations.Nullable()
    public static final okhttp3.Cache provideDefaultCache() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final okhttp3.Interceptor logInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final okhttp3.Interceptor headerInterceptor(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final okhttp3.OkHttpClient provideOkHttp(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    okhttp3.Cache cache) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final retrofit2.Retrofit provideLastFmRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient client) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.network.LastFMService provideLastFmRest(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.network.DeezerService provideDeezerRest(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.network.LyricsRestService provideLyrics(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
}