package com.caij.puremusic.network;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\bf\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'JV\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00062\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u00062\b\b\u0003\u0010\u000e\u001a\u00020\u0006H\'Jb\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\'\u00a8\u0006\u0018"}, d2 = {"Lcom/caij/puremusic/network/DeezerService;", "", "getArtistImage", "Lretrofit2/Call;", "Lcom/caij/puremusic/model/DeezerResponse;", "artistName", "", "searchArtist", "Lcom/caij/puremusic/network/model/SearchResponse;", "type", "market", "limit", "offset", "authorization", "include_external", "translationGoogle", "client", "sl", "tl", "dj", "dt", "q", "userAgent", "Companion", "app_chinaDebug"})
public abstract interface DeezerService {
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.network.DeezerService.Companion Companion = null;
    
    @retrofit2.http.GET(value = "search/artist&limit=1")
    @retrofit2.SkipCallbackExecutor()
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<com.caij.puremusic.model.DeezerResponse> getArtistImage(@retrofit2.http.Query(value = "q")
    @org.jetbrains.annotations.NotNull()
    java.lang.String artistName);
    
    @retrofit2.http.GET(value = "https://api.spotify.com/v1/search")
    @retrofit2.SkipCallbackExecutor()
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<com.caij.puremusic.network.model.SearchResponse> searchArtist(@retrofit2.http.Query(value = "q")
    @org.jetbrains.annotations.NotNull()
    java.lang.String artistName, @retrofit2.http.Query(value = "type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String type, @retrofit2.http.Query(value = "market")
    @org.jetbrains.annotations.Nullable()
    java.lang.String market, @retrofit2.http.Query(value = "limit")
    @org.jetbrains.annotations.NotNull()
    java.lang.String limit, @retrofit2.http.Query(value = "offset")
    @org.jetbrains.annotations.NotNull()
    java.lang.String offset, @retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String authorization, @retrofit2.http.Query(value = "include_external")
    @org.jetbrains.annotations.NotNull()
    java.lang.String include_external);
    
    @retrofit2.http.POST(value = "https://translate.googleapis.com/translate_a/single")
    @retrofit2.http.FormUrlEncoded()
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<java.lang.String> translationGoogle(@retrofit2.http.Query(value = "client")
    @org.jetbrains.annotations.Nullable()
    java.lang.String client, @retrofit2.http.Query(value = "sl")
    @org.jetbrains.annotations.Nullable()
    java.lang.String sl, @retrofit2.http.Query(value = "tl")
    @org.jetbrains.annotations.Nullable()
    java.lang.String tl, @retrofit2.http.Query(value = "dj")
    @org.jetbrains.annotations.Nullable()
    java.lang.String dj, @retrofit2.http.Query(value = "dt")
    @org.jetbrains.annotations.Nullable()
    java.lang.String dt, @retrofit2.http.Field(value = "q")
    @org.jetbrains.annotations.Nullable()
    java.lang.String q, @retrofit2.http.Header(value = "User-Agent")
    @org.jetbrains.annotations.Nullable()
    java.lang.String userAgent);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086\u0002\u00a8\u0006\u000f"}, d2 = {"Lcom/caij/puremusic/network/DeezerService$Companion;", "", "()V", "createCacheControlInterceptor", "Lokhttp3/Interceptor;", "createDefaultCache", "Lokhttp3/Cache;", "context", "Landroid/content/Context;", "createDefaultOkHttpClient", "Lokhttp3/OkHttpClient$Builder;", "invoke", "Lcom/caij/puremusic/network/DeezerService;", "client", "Lokhttp3/Call$Factory;", "app_chinaDebug"})
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}