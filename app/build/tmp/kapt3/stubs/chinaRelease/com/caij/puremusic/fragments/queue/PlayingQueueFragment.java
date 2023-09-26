package com.caij.puremusic.fragments.queue;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\b\u0010\u0019\u001a\u00020\u0013H\u0016J\b\u0010\u001a\u001a\u00020\u0013H\u0016J\u001a\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0013H\u0002J\b\u0010!\u001a\u00020\u0013H\u0002J\b\u0010\"\u001a\u00020\u0013H\u0002J\b\u0010#\u001a\u00020\u0013H\u0002J\b\u0010$\u001a\u00020\u0013H\u0002J\b\u0010%\u001a\u00020\u0013H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/caij/puremusic/fragments/queue/PlayingQueueFragment;", "Lcom/caij/puremusic/fragments/base/AbsMusicServiceFragment;", "()V", "_binding", "Lcom/caij/puremusic/databinding/FragmentPlayingQueueBinding;", "binding", "getBinding", "()Lcom/caij/puremusic/databinding/FragmentPlayingQueueBinding;", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "mainActivity", "Lcom/caij/puremusic/activities/MainActivity;", "getMainActivity", "()Lcom/caij/puremusic/activities/MainActivity;", "playingQueueAdapter", "Lcom/caij/puremusic/adapter/song/PlayingQueueAdapter;", "checkActivity", "", "checkForPadding", "", "getUpNextAndQueueTime", "", "onDestroy", "onMediaStoreChanged", "onPause", "onPlayingMetaChanged", "onQueueChanged", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "resetToCurrentPosition", "setUpRecyclerView", "setupToolbar", "updateCurrentSong", "updateQueue", "updateQueuePosition", "app_chinaRelease"})
public final class PlayingQueueFragment extends com.caij.puremusic.fragments.base.AbsMusicServiceFragment {
    private com.caij.puremusic.databinding.FragmentPlayingQueueBinding _binding;
    private com.caij.puremusic.adapter.song.PlayingQueueAdapter playingQueueAdapter;
    private androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager;
    
    public PlayingQueueFragment() {
        super(0);
    }
    
    private final com.caij.puremusic.databinding.FragmentPlayingQueueBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.caij.puremusic.activities.MainActivity getMainActivity() {
        return null;
    }
    
    private final java.lang.String getUpNextAndQueueTime() {
        return null;
    }
    
    @java.lang.Override()
    public boolean checkActivity() {
        return false;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpRecyclerView() {
    }
    
    private final void checkForPadding() {
    }
    
    @java.lang.Override()
    public void onQueueChanged() {
    }
    
    @java.lang.Override()
    public void onMediaStoreChanged() {
    }
    
    private final void updateCurrentSong() {
    }
    
    @java.lang.Override()
    public void onPlayingMetaChanged() {
    }
    
    private final void updateQueuePosition() {
    }
    
    private final void updateQueue() {
    }
    
    private final void resetToCurrentPosition() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void setupToolbar() {
    }
}