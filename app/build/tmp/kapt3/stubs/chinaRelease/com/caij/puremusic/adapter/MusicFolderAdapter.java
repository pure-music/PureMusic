package com.caij.puremusic.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\tH\u0016J\u001c\u0010\u000e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0014J\u0014\u0010\u0012\u001a\u00020\u000b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/caij/puremusic/adapter/MusicFolderAdapter;", "Lcom/caij/adapter/ExtendBaseAdapter;", "Lcom/caij/puremusic/adapter/FolderWrapper;", "Lcom/caij/puremusic/adapter/MusicFolderAdapter$ViewHolder;", "ui", "", "(Ljava/lang/Object;)V", "counts", "", "", "onBindViewHolderInner", "", "holder", "position", "onCreateViewHolderInner", "parent", "Landroid/view/ViewGroup;", "viewType", "setCounts", "ViewHolder", "app_chinaRelease"})
public final class MusicFolderAdapter extends com.caij.adapter.ExtendBaseAdapter<com.caij.puremusic.adapter.FolderWrapper, com.caij.puremusic.adapter.MusicFolderAdapter.ViewHolder> {
    private java.util.List<java.lang.Integer> counts;
    
    public MusicFolderAdapter(@org.jetbrains.annotations.NotNull()
    java.lang.Object ui) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.caij.puremusic.adapter.MusicFolderAdapter.ViewHolder onCreateViewHolderInner(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public final void setCounts(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> counts) {
    }
    
    @java.lang.Override()
    public void onBindViewHolderInner(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.adapter.MusicFolderAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0096\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/caij/puremusic/adapter/MusicFolderAdapter$ViewHolder;", "Lcom/caij/adapter/BaseViewHolder;", "itemView", "Landroid/view/View;", "itemMusicSourceFolderBinding", "Lcom/caij/puremusic/databinding/ItemMusicSourceFolderBinding;", "(Lcom/caij/puremusic/adapter/MusicFolderAdapter;Landroid/view/View;Lcom/caij/puremusic/databinding/ItemMusicSourceFolderBinding;)V", "getItemMusicSourceFolderBinding", "()Lcom/caij/puremusic/databinding/ItemMusicSourceFolderBinding;", "app_chinaRelease"})
    public class ViewHolder extends com.caij.adapter.BaseViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.caij.puremusic.databinding.ItemMusicSourceFolderBinding itemMusicSourceFolderBinding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView, @org.jetbrains.annotations.NotNull()
        com.caij.puremusic.databinding.ItemMusicSourceFolderBinding itemMusicSourceFolderBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.databinding.ItemMusicSourceFolderBinding getItemMusicSourceFolderBinding() {
            return null;
        }
    }
}