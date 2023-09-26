package com.caij.puremusic.glide.artistimage;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0010"}, d2 = {"Lcom/caij/puremusic/glide/artistimage/Factory;", "Lcom/bumptech/glide/load/model/ModelLoaderFactory;", "Lcom/caij/puremusic/glide/artistimage/ArtistImage;", "Ljava/io/InputStream;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "build", "Lcom/bumptech/glide/load/model/ModelLoader;", "multiFactory", "Lcom/bumptech/glide/load/model/MultiModelLoaderFactory;", "teardown", "", "Companion", "app_chinaDebug"})
public final class Factory implements com.bumptech.glide.load.model.ModelLoaderFactory<com.caij.puremusic.glide.artistimage.ArtistImage, java.io.InputStream> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private static final long TIMEOUT = 5000L;
    @org.jetbrains.annotations.NotNull()
    private static com.caij.puremusic.network.DeezerService deezerService;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.glide.artistimage.Factory.Companion Companion = null;
    
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
    public com.bumptech.glide.load.model.ModelLoader<com.caij.puremusic.glide.artistimage.ArtistImage, java.io.InputStream> build(@org.jetbrains.annotations.NotNull()
    com.bumptech.glide.load.model.MultiModelLoaderFactory multiFactory) {
        return null;
    }
    
    @java.lang.Override()
    public void teardown() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/caij/puremusic/glide/artistimage/Factory$Companion;", "", "()V", "TIMEOUT", "", "deezerService", "Lcom/caij/puremusic/network/DeezerService;", "getDeezerService", "()Lcom/caij/puremusic/network/DeezerService;", "setDeezerService", "(Lcom/caij/puremusic/network/DeezerService;)V", "createLogInterceptor", "Lokhttp3/Interceptor;", "app_chinaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.network.DeezerService getDeezerService() {
            return null;
        }
        
        public final void setDeezerService(@org.jetbrains.annotations.NotNull()
        com.caij.puremusic.network.DeezerService p0) {
        }
        
        private final okhttp3.Interceptor createLogInterceptor() {
            return null;
        }
    }
}