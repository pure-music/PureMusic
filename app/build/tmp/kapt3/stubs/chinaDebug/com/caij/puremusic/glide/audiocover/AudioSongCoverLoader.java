package com.caij.puremusic.glide.audiocover;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ.\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/caij/puremusic/glide/audiocover/AudioSongCoverLoader;", "Lcom/bumptech/glide/load/model/ModelLoader;", "Lcom/caij/puremusic/glide/audiocover/AudioSongCover;", "Ljava/io/InputStream;", "context", "Landroid/content/Context;", "deezerService", "Lcom/caij/puremusic/network/DeezerService;", "okhttp", "Lokhttp3/OkHttpClient;", "(Landroid/content/Context;Lcom/caij/puremusic/network/DeezerService;Lokhttp3/OkHttpClient;)V", "getContext", "()Landroid/content/Context;", "buildLoadData", "Lcom/bumptech/glide/load/model/ModelLoader$LoadData;", "audioSongCover", "width", "", "height", "options", "Lcom/bumptech/glide/load/Options;", "handles", "", "audioFileCover", "Factory", "app_chinaDebug"})
public final class AudioSongCoverLoader implements com.bumptech.glide.load.model.ModelLoader<com.caij.puremusic.glide.audiocover.AudioSongCover, java.io.InputStream> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.caij.puremusic.network.DeezerService deezerService = null;
    @org.jetbrains.annotations.NotNull()
    private final okhttp3.OkHttpClient okhttp = null;
    
    public AudioSongCoverLoader(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.network.DeezerService deezerService, @org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okhttp) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.bumptech.glide.load.model.ModelLoader.LoadData<java.io.InputStream> buildLoadData(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.glide.audiocover.AudioSongCover audioSongCover, int width, int height, @org.jetbrains.annotations.NotNull()
    com.bumptech.glide.load.Options options) {
        return null;
    }
    
    @java.lang.Override()
    public boolean handles(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.glide.audiocover.AudioSongCover audioFileCover) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lcom/caij/puremusic/glide/audiocover/AudioSongCoverLoader$Factory;", "Lcom/bumptech/glide/load/model/ModelLoaderFactory;", "Lcom/caij/puremusic/glide/audiocover/AudioSongCover;", "Ljava/io/InputStream;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "build", "Lcom/bumptech/glide/load/model/ModelLoader;", "multiFactory", "Lcom/bumptech/glide/load/model/MultiModelLoaderFactory;", "teardown", "", "app_chinaDebug"})
    public static final class Factory implements com.bumptech.glide.load.model.ModelLoaderFactory<com.caij.puremusic.glide.audiocover.AudioSongCover, java.io.InputStream> {
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context context = null;
        
        public Factory(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public com.bumptech.glide.load.model.ModelLoader<com.caij.puremusic.glide.audiocover.AudioSongCover, java.io.InputStream> build(@org.jetbrains.annotations.NotNull()
        com.bumptech.glide.load.model.MultiModelLoaderFactory multiFactory) {
            return null;
        }
        
        @java.lang.Override()
        public void teardown() {
        }
    }
}