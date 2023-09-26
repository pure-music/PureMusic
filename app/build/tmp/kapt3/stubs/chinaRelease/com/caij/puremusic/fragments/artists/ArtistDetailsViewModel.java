package com.caij.puremusic.fragments.artists;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0006J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0015J\b\u0010\u0016\u001a\u00020\u000fH\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0016J\b\u0010\u0018\u001a\u00020\u000fH\u0016J\b\u0010\u0019\u001a\u00020\u000fH\u0016J\b\u0010\u001a\u001a\u00020\u000fH\u0016J\b\u0010\u001b\u001a\u00020\u000fH\u0016J\b\u0010\u001c\u001a\u00020\u000fH\u0016J\b\u0010\u001d\u001a\u00020\u000fH\u0016J\b\u0010\u001e\u001a\u00020\u000fH\u0016R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/caij/puremusic/fragments/artists/ArtistDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/caij/puremusic/interfaces/IMusicServiceEventListener;", "realRepository", "Lcom/caij/puremusic/repository/RealRepository;", "artistId", "", "artistName", "", "(Lcom/caij/puremusic/repository/RealRepository;Ljava/lang/Long;Ljava/lang/String;)V", "artistDetails", "Landroidx/lifecycle/MutableLiveData;", "Lcom/caij/puremusic/model/ArtistWrapper;", "Ljava/lang/Long;", "fetchArtist", "", "getAlbumSongs", "", "Lcom/caij/puremusic/db/model/Song;", "id", "getArtist", "Landroidx/lifecycle/LiveData;", "onFavoriteStateChanged", "onMediaStoreChanged", "onPlayStateChanged", "onPlayingMetaChanged", "onQueueChanged", "onRepeatModeChanged", "onServiceConnected", "onServiceDisconnected", "onShuffleModeChanged", "app_chinaRelease"})
public final class ArtistDetailsViewModel extends androidx.lifecycle.ViewModel implements com.caij.puremusic.interfaces.IMusicServiceEventListener {
    private final com.caij.puremusic.repository.RealRepository realRepository = null;
    private final java.lang.Long artistId = null;
    private final java.lang.String artistName = null;
    private final androidx.lifecycle.MutableLiveData<com.caij.puremusic.model.ArtistWrapper> artistDetails = null;
    
    public ArtistDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.repository.RealRepository realRepository, @org.jetbrains.annotations.Nullable()
    java.lang.Long artistId, @org.jetbrains.annotations.Nullable()
    java.lang.String artistName) {
        super();
    }
    
    private final void fetchArtist() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.caij.puremusic.model.ArtistWrapper> getArtist() {
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.caij.puremusic.db.model.Song> getAlbumSongs(long id) {
        return null;
    }
}