package com.caij.puremusic.adapter.song;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001!B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0014\u0010\u0012\u001a\u00060\u0013R\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\nH\u0016J\u001c\u0010\u0019\u001a\u00020\u001a2\n\u0010\u001b\u001a\u00060\u0013R\u00020\u00142\u0006\u0010\u0018\u001a\u00020\nH\u0016J\u001e\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0 H\u0014R\u001b\u0010\f\u001a\u00020\r8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/caij/puremusic/adapter/song/OrderablePlaylistSongAdapter;", "Lcom/caij/puremusic/adapter/song/AbsOffsetSongAdapter;", "playlist", "Lcom/caij/puremusic/db/model/PlaylistEntity;", "activity", "Landroidx/fragment/app/FragmentActivity;", "dataSet", "", "Lcom/caij/puremusic/db/model/Song;", "itemLayoutRes", "", "(Lcom/caij/puremusic/db/model/PlaylistEntity;Landroidx/fragment/app/FragmentActivity;Ljava/util/List;I)V", "libraryViewModel", "Lcom/caij/puremusic/fragments/LibraryViewModel;", "getLibraryViewModel", "()Lcom/caij/puremusic/fragments/LibraryViewModel;", "libraryViewModel$delegate", "Lkotlin/Lazy;", "createViewHolder", "Lcom/caij/puremusic/adapter/song/SongAdapter$ViewHolder;", "Lcom/caij/puremusic/adapter/song/SongAdapter;", "view", "Landroid/view/View;", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onMultipleItemAction", "menuItem", "Landroid/view/MenuItem;", "selection", "", "ViewHolder", "app_chinaRelease"})
public final class OrderablePlaylistSongAdapter extends com.caij.puremusic.adapter.song.AbsOffsetSongAdapter {
    private final com.caij.puremusic.db.model.PlaylistEntity playlist = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy libraryViewModel$delegate = null;
    
    public OrderablePlaylistSongAdapter(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.PlaylistEntity playlist, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Song> dataSet, int itemLayoutRes) {
        super(null, null, 0);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.caij.puremusic.fragments.LibraryViewModel getLibraryViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.caij.puremusic.adapter.song.SongAdapter.ViewHolder createViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.adapter.song.SongAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    protected void onMultipleItemAction(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem menuItem, @org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Song> selection) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8T@TX\u0094\u000e\u00a2\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0017"}, d2 = {"Lcom/caij/puremusic/adapter/song/OrderablePlaylistSongAdapter$ViewHolder;", "Lcom/caij/puremusic/adapter/song/AbsOffsetSongAdapter$ViewHolder;", "Lcom/caij/puremusic/adapter/song/AbsOffsetSongAdapter;", "itemView", "Landroid/view/View;", "(Lcom/caij/puremusic/adapter/song/OrderablePlaylistSongAdapter;Landroid/view/View;)V", "playAction", "Lcom/google/android/material/button/MaterialButton;", "getPlayAction", "()Lcom/google/android/material/button/MaterialButton;", "shuffleAction", "getShuffleAction", "value", "", "songMenuRes", "getSongMenuRes", "()I", "setSongMenuRes", "(I)V", "onSongMenuItemClick", "", "item", "Landroid/view/MenuItem;", "app_chinaRelease"})
    public final class ViewHolder extends com.caij.puremusic.adapter.song.AbsOffsetSongAdapter.ViewHolder {
        @org.jetbrains.annotations.Nullable()
        private final com.google.android.material.button.MaterialButton playAction = null;
        @org.jetbrains.annotations.Nullable()
        private final com.google.android.material.button.MaterialButton shuffleAction = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.google.android.material.button.MaterialButton getPlayAction() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.google.android.material.button.MaterialButton getShuffleAction() {
            return null;
        }
        
        @java.lang.Override()
        protected int getSongMenuRes() {
            return 0;
        }
        
        @java.lang.Override()
        protected void setSongMenuRes(int value) {
        }
        
        @java.lang.Override()
        protected boolean onSongMenuItemClick(@org.jetbrains.annotations.NotNull()
        android.view.MenuItem item) {
            return false;
        }
    }
}