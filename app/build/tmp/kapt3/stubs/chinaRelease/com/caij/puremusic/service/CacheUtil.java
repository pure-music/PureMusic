package com.caij.puremusic.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/caij/puremusic/service/CacheUtil;", "", "()V", "Companion", "app_chinaRelease"})
public final class CacheUtil {
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.service.CacheUtil.Companion Companion = null;
    public static final long CACHE_FRAGMENT_SIZE = 1048576L;
    @org.jetbrains.annotations.NotNull()
    private static final com.google.android.exoplayer2.upstream.cache.CacheKeyFactory cacheKeyFactory = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.google.android.exoplayer2.upstream.cache.SimpleCache simpleCache = null;
    
    public CacheUtil() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J6\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0004J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0019"}, d2 = {"Lcom/caij/puremusic/service/CacheUtil$Companion;", "", "()V", "CACHE_FRAGMENT_SIZE", "", "cacheKeyFactory", "Lcom/google/android/exoplayer2/upstream/cache/CacheKeyFactory;", "getCacheKeyFactory", "()Lcom/google/android/exoplayer2/upstream/cache/CacheKeyFactory;", "simpleCache", "Lcom/google/android/exoplayer2/upstream/cache/SimpleCache;", "getSimpleCache", "()Lcom/google/android/exoplayer2/upstream/cache/SimpleCache;", "cache", "", "context", "Landroid/content/Context;", "url", "", "headers", "", "position", "getCache", "Ljava/util/NavigableSet;", "Lcom/google/android/exoplayer2/upstream/cache/CacheSpan;", "app_chinaRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.android.exoplayer2.upstream.cache.CacheKeyFactory getCacheKeyFactory() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.android.exoplayer2.upstream.cache.SimpleCache getSimpleCache() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.NavigableSet<com.google.android.exoplayer2.upstream.cache.CacheSpan> getCache(@org.jetbrains.annotations.NotNull()
        java.lang.String url, long position) {
            return null;
        }
        
        public final void cache(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.String> headers, long position) {
        }
    }
}