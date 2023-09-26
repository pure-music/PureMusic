package com.caij.puremusic.glide.artistimage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ.\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/caij/puremusic/glide/artistimage/ArtistImageLoader;", "Lcom/bumptech/glide/load/model/ModelLoader;", "Lcom/caij/puremusic/glide/artistimage/ArtistImage;", "Ljava/io/InputStream;", "context", "Landroid/content/Context;", "deezerService", "Lcom/caij/puremusic/network/DeezerService;", "okhttp", "Lokhttp3/OkHttpClient;", "(Landroid/content/Context;Lcom/caij/puremusic/network/DeezerService;Lokhttp3/OkHttpClient;)V", "getContext", "()Landroid/content/Context;", "buildLoadData", "Lcom/bumptech/glide/load/model/ModelLoader$LoadData;", "model", "width", "", "height", "options", "Lcom/bumptech/glide/load/Options;", "handles", "", "app_chinaRelease"})
public final class ArtistImageLoader implements com.bumptech.glide.load.model.ModelLoader<com.caij.puremusic.glide.artistimage.ArtistImage, java.io.InputStream> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final com.caij.puremusic.network.DeezerService deezerService = null;
    private final okhttp3.OkHttpClient okhttp = null;
    
    public ArtistImageLoader(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.network.DeezerService deezerService, @org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okhttp) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.bumptech.glide.load.model.ModelLoader.LoadData<java.io.InputStream> buildLoadData(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.glide.artistimage.ArtistImage model, int width, int height, @org.jetbrains.annotations.NotNull()
    com.bumptech.glide.load.Options options) {
        return null;
    }
    
    @java.lang.Override()
    public boolean handles(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.glide.artistimage.ArtistImage model) {
        return false;
    }
}