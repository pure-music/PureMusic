package com.caij.puremusic.util.meta;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00180\u0017J\u0006\u0010\u0019\u001a\u00020\u001aJ \u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001cH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/caij/puremusic/util/meta/OkhttpDataReader;", "Lcom/google/android/exoplayer2/upstream/DataReader;", "url", "", "okHttpClient", "Lokhttp3/OkHttpClient;", "(Ljava/lang/String;Lokhttp3/OkHttpClient;)V", "response", "Lokhttp3/Response;", "getResponse", "()Lokhttp3/Response;", "setResponse", "(Lokhttp3/Response;)V", "responseBody", "Lokhttp3/ResponseBody;", "getResponseBody", "()Lokhttp3/ResponseBody;", "setResponseBody", "(Lokhttp3/ResponseBody;)V", "close", "", "connect", "getHeaders", "", "", "getLength", "", "read", "", "buffer", "", "offset", "length", "app_chinaRelease"})
public final class OkhttpDataReader implements com.google.android.exoplayer2.upstream.DataReader {
    private final java.lang.String url = null;
    private final okhttp3.OkHttpClient okHttpClient = null;
    @org.jetbrains.annotations.Nullable()
    private okhttp3.ResponseBody responseBody;
    @org.jetbrains.annotations.Nullable()
    private okhttp3.Response response;
    
    public OkhttpDataReader(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.ResponseBody getResponseBody() {
        return null;
    }
    
    public final void setResponseBody(@org.jetbrains.annotations.Nullable()
    okhttp3.ResponseBody p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.Response getResponse() {
        return null;
    }
    
    public final void setResponse(@org.jetbrains.annotations.Nullable()
    okhttp3.Response p0) {
    }
    
    private final void connect() {
    }
    
    public final long getLength() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeaders() {
        return null;
    }
    
    @java.lang.Override()
    public int read(@org.jetbrains.annotations.NotNull()
    byte[] buffer, int offset, int length) {
        return 0;
    }
    
    public final void close() {
    }
}