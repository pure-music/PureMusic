package com.caij.puremusic.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 +2\u0012\u0012\b\u0012\u00060\u0002R\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002+,B-\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0002J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0002J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\nH\u0014J\b\u0010\u0016\u001a\u00020\nH\u0016J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0003H\u0014J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\nH\u0002J\u001c\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u00032\n\u0010\u001e\u001a\u00060\u0002R\u00020\u0000H\u0002J\u001c\u0010\u001f\u001a\u00020\u001d2\n\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010 \u001a\u00020\nH\u0016J\u001c\u0010!\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\nH\u0016J\u001e\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0014J\u0014\u0010)\u001a\u00020\u001d2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030\bR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/caij/puremusic/adapter/SongFileAdapter;", "Lcom/caij/puremusic/adapter/base/AbsMultiSelectAdapter;", "Lcom/caij/puremusic/adapter/SongFileAdapter$ViewHolder;", "Ljava/io/File;", "Lme/zhanghai/android/fastscroll/PopupTextProvider;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "dataSet", "", "itemLayoutRes", "", "iCallbacks", "Lcom/caij/puremusic/interfaces/ICallbacks;", "(Landroidx/appcompat/app/AppCompatActivity;Ljava/util/List;ILcom/caij/puremusic/interfaces/ICallbacks;)V", "getActivity", "()Landroidx/appcompat/app/AppCompatActivity;", "getFileText", "", "file", "getFileTitle", "getIdentifier", "position", "getItemCount", "getItemViewType", "getName", "model", "getPopupText", "getSectionName", "loadFileImage", "", "holder", "onBindViewHolder", "index", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onMultipleItemAction", "menuItem", "Landroid/view/MenuItem;", "selection", "swapDataSet", "songFiles", "Companion", "ViewHolder", "app_chinaRelease"})
public final class SongFileAdapter extends com.caij.puremusic.adapter.base.AbsMultiSelectAdapter<com.caij.puremusic.adapter.SongFileAdapter.ViewHolder, java.io.File> implements me.zhanghai.android.fastscroll.PopupTextProvider {
    @org.jetbrains.annotations.NotNull()
    private final androidx.appcompat.app.AppCompatActivity activity = null;
    private java.util.List<? extends java.io.File> dataSet;
    private final int itemLayoutRes = 0;
    private final com.caij.puremusic.interfaces.ICallbacks iCallbacks = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.adapter.SongFileAdapter.Companion Companion = null;
    private static final int FILE = 0;
    private static final int FOLDER = 1;
    
    public SongFileAdapter(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.io.File> dataSet, int itemLayoutRes, @org.jetbrains.annotations.Nullable()
    com.caij.puremusic.interfaces.ICallbacks iCallbacks) {
        super(null, 0);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.appcompat.app.AppCompatActivity getActivity() {
        return null;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    public final void swapDataSet(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.io.File> songFiles) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.caij.puremusic.adapter.SongFileAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.adapter.SongFileAdapter.ViewHolder holder, int index) {
    }
    
    private final java.lang.String getFileTitle(java.io.File file) {
        return null;
    }
    
    private final java.lang.String getFileText(java.io.File file) {
        return null;
    }
    
    private final void loadFileImage(java.io.File file, com.caij.puremusic.adapter.SongFileAdapter.ViewHolder holder) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.io.File getIdentifier(int position) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.lang.String getName(@org.jetbrains.annotations.NotNull()
    java.io.File model) {
        return null;
    }
    
    @java.lang.Override()
    protected void onMultipleItemAction(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem menuItem, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.io.File> selection) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getPopupText(int position) {
        return null;
    }
    
    private final java.lang.String getSectionName(int position) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0016\u00a8\u0006\r"}, d2 = {"Lcom/caij/puremusic/adapter/SongFileAdapter$ViewHolder;", "Lcom/caij/puremusic/adapter/base/MediaEntryViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/caij/puremusic/adapter/SongFileAdapter;Landroid/view/View;)V", "isPositionInRange", "", "position", "", "onClick", "", "v", "onLongClick", "app_chinaRelease"})
    public final class ViewHolder extends com.caij.puremusic.adapter.base.MediaEntryViewHolder {
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.Nullable()
        android.view.View v) {
        }
        
        @java.lang.Override()
        public boolean onLongClick(@org.jetbrains.annotations.Nullable()
        android.view.View v) {
            return false;
        }
        
        private final boolean isPositionInRange(int position) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/caij/puremusic/adapter/SongFileAdapter$Companion;", "", "()V", "FILE", "", "FOLDER", "readableFileSize", "", "size", "", "app_chinaRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String readableFileSize(long size) {
            return null;
        }
    }
}