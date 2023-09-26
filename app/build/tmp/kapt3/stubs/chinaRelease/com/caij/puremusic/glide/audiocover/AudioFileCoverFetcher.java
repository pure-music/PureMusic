package com.caij.puremusic.glide.audiocover;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/caij/puremusic/glide/audiocover/AudioFileCoverFetcher;", "Lcom/bumptech/glide/load/data/DataFetcher;", "Ljava/io/InputStream;", "model", "Lcom/caij/puremusic/glide/audiocover/AudioFileCover;", "(Lcom/caij/puremusic/glide/audiocover/AudioFileCover;)V", "stream", "cancel", "", "cleanup", "getDataClass", "Ljava/lang/Class;", "getDataSource", "Lcom/bumptech/glide/load/DataSource;", "loadData", "priority", "Lcom/bumptech/glide/Priority;", "callback", "Lcom/bumptech/glide/load/data/DataFetcher$DataCallback;", "app_chinaRelease"})
public final class AudioFileCoverFetcher implements com.bumptech.glide.load.data.DataFetcher<java.io.InputStream> {
    private final com.caij.puremusic.glide.audiocover.AudioFileCover model = null;
    private java.io.InputStream stream;
    
    public AudioFileCoverFetcher(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.glide.audiocover.AudioFileCover model) {
        super();
    }
    
    @java.lang.Override()
    public void loadData(@org.jetbrains.annotations.NotNull()
    com.bumptech.glide.Priority priority, @org.jetbrains.annotations.NotNull()
    com.bumptech.glide.load.data.DataFetcher.DataCallback<? super java.io.InputStream> callback) {
    }
    
    @java.lang.Override()
    public void cleanup() {
    }
    
    @java.lang.Override()
    public void cancel() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Class<java.io.InputStream> getDataClass() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.bumptech.glide.load.DataSource getDataSource() {
        return null;
    }
}