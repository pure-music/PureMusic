package com.caij.puremusic.fragments.albums;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\u000b\u001a\u00020\fJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000eJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0011\u001a\u00020\u0006J\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u000e2\u0006\u0010\u0015\u001a\u00020\u0010J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013J\b\u0010\u0018\u001a\u00020\fH\u0016J\b\u0010\u0019\u001a\u00020\fH\u0016J\b\u0010\u001a\u001a\u00020\fH\u0016J\b\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010\u001c\u001a\u00020\fH\u0016J\b\u0010\u001d\u001a\u00020\fH\u0016J\b\u0010\u001e\u001a\u00020\fH\u0016J\b\u0010\u001f\u001a\u00020\fH\u0016J\b\u0010 \u001a\u00020\fH\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/caij/puremusic/fragments/albums/AlbumDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/caij/puremusic/interfaces/IMusicServiceEventListener;", "repository", "Lcom/caij/puremusic/repository/RealRepository;", "albumId", "", "(Lcom/caij/puremusic/repository/RealRepository;J)V", "albumDetails", "Landroidx/lifecycle/MutableLiveData;", "Lcom/caij/puremusic/model/AlbumWrapper;", "fetchAlbum", "", "getAlbum", "Landroidx/lifecycle/LiveData;", "getArtistByStrId", "Lcom/caij/puremusic/model/ArtistWrapper;", "artistId", "getMoreAlbums", "", "Lcom/caij/puremusic/db/model/Album;", "artistWrapper", "getSongs", "Lcom/caij/puremusic/db/model/Song;", "onFavoriteStateChanged", "onMediaStoreChanged", "onPlayStateChanged", "onPlayingMetaChanged", "onQueueChanged", "onRepeatModeChanged", "onServiceConnected", "onServiceDisconnected", "onShuffleModeChanged", "app_chinaDebug"})
public final class AlbumDetailsViewModel extends androidx.lifecycle.ViewModel implements com.caij.puremusic.interfaces.IMusicServiceEventListener {
    @org.jetbrains.annotations.NotNull()
    private final com.caij.puremusic.repository.RealRepository repository = null;
    private final long albumId = 0L;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.caij.puremusic.model.AlbumWrapper> albumDetails = null;
    
    public AlbumDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.repository.RealRepository repository, long albumId) {
        super();
    }
    
    public final void fetchAlbum() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.caij.puremusic.db.model.Song> getSongs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.caij.puremusic.model.AlbumWrapper> getAlbum() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.caij.puremusic.model.ArtistWrapper> getArtistByStrId(long artistId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.caij.puremusic.db.model.Album>> getMoreAlbums(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.model.ArtistWrapper artistWrapper) {
        return null;
    }
    
    @java.lang.Override()
    public void onMediaStoreChanged() {
    }
    
    @java.lang.Override()
    public void onServiceConnected() {
    }
    
    @java.lang.Override()
    public void onServiceDisconnected() {
    }
    
    @java.lang.Override()
    public void onQueueChanged() {
    }
    
    @java.lang.Override()
    public void onPlayingMetaChanged() {
    }
    
    @java.lang.Override()
    public void onPlayStateChanged() {
    }
    
    @java.lang.Override()
    public void onRepeatModeChanged() {
    }
    
    @java.lang.Override()
    public void onShuffleModeChanged() {
    }
    
    @java.lang.Override()
    public void onFavoriteStateChanged() {
    }
}