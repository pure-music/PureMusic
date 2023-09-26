package com.caij.puremusic.glide.artistimage;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\"H\u0002J \u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%2\u000e\u0010&\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\'H\u0016J(\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\r2\u0006\u0010$\u001a\u00020%2\u000e\u0010&\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\'H\u0002J(\u0010*\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\r2\u0006\u0010$\u001a\u00020%2\u000e\u0010&\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\'H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082D\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/caij/puremusic/glide/artistimage/ArtistImageFetcher;", "Lcom/bumptech/glide/load/data/DataFetcher;", "Ljava/io/InputStream;", "context", "Landroid/content/Context;", "deezerService", "Lcom/caij/puremusic/network/DeezerService;", "model", "Lcom/caij/puremusic/glide/artistimage/ArtistImage;", "okhttp", "Lokhttp3/OkHttpClient;", "(Landroid/content/Context;Lcom/caij/puremusic/network/DeezerService;Lcom/caij/puremusic/glide/artistimage/ArtistImage;Lokhttp3/OkHttpClient;)V", "TAG", "", "callDzResponse", "Lretrofit2/Call;", "Lcom/caij/puremusic/model/DeezerResponse;", "callResponse", "Lcom/caij/puremusic/network/model/SearchResponse;", "isCancelled", "", "getModel", "()Lcom/caij/puremusic/glide/artistimage/ArtistImage;", "streamFetcher", "Lcom/bumptech/glide/integration/okhttp3/OkHttpStreamFetcher;", "cancel", "", "cleanup", "getDataClass", "Ljava/lang/Class;", "getDataSource", "Lcom/bumptech/glide/load/DataSource;", "getHighestQuality", "imageUrl", "Lcom/caij/puremusic/model/Data;", "loadData", "priority", "Lcom/bumptech/glide/Priority;", "callback", "Lcom/bumptech/glide/load/data/DataFetcher$DataCallback;", "loadDeezer", "artist", "loadSpotify", "app_chinaDebug"})
public final class ArtistImageFetcher implements com.bumptech.glide.load.data.DataFetcher<java.io.InputStream> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.caij.puremusic.network.DeezerService deezerService = null;
    @org.jetbrains.annotations.NotNull()
    private final com.caij.puremusic.glide.artistimage.ArtistImage model = null;
    @org.jetbrains.annotations.NotNull()
    private final okhttp3.OkHttpClient okhttp = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "ArtistImageFetcher";
    @org.jetbrains.annotations.Nullable()
    private com.bumptech.glide.integration.okhttp3.OkHttpStreamFetcher streamFetcher;
    @org.jetbrains.annotations.Nullable()
    private retrofit2.Call<com.caij.puremusic.network.model.SearchResponse> callResponse;
    @org.jetbrains.annotations.Nullable()
    private retrofit2.Call<com.caij.puremusic.model.DeezerResponse> callDzResponse;
    private boolean isCancelled = false;
    
    public ArtistImageFetcher(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.network.DeezerService deezerService, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.glide.artistimage.ArtistImage model, @org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okhttp) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.caij.puremusic.glide.artistimage.ArtistImage getModel() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.Class<java.io.InputStream> getDataClass() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.bumptech.glide.load.DataSource getDataSource() {
        return null;
    }
    
    @java.lang.Override()
    public void loadData(@org.jetbrains.annotations.NotNull()
    com.bumptech.glide.Priority priority, @org.jetbrains.annotations.NotNull()
    com.bumptech.glide.load.data.DataFetcher.DataCallback<? super java.io.InputStream> callback) {
    }
    
    private final void loadDeezer(java.lang.String artist, com.bumptech.glide.Priority priority, com.bumptech.glide.load.data.DataFetcher.DataCallback<? super java.io.InputStream> callback) {
    }
    
    private final void loadSpotify(java.lang.String artist, com.bumptech.glide.Priority priority, com.bumptech.glide.load.data.DataFetcher.DataCallback<? super java.io.InputStream> callback) {
    }
    
    private final java.lang.String getHighestQuality(com.caij.puremusic.model.Data imageUrl) {
        return null;
    }
    
    @java.lang.Override()
    public void cleanup() {
    }
    
    @java.lang.Override()
    public void cancel() {
    }
}