package com.caij.puremusic.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001f2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001f B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u0007H\u0002J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007H\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\u001c\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00072\n\u0010\u0016\u001a\u00060\u0002R\u00020\u0000H\u0002J\u001c\u0010\u0017\u001a\u00020\u00152\n\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0011H\u0016J\u001c\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0016J\u0014\u0010\u001d\u001a\u00020\u00152\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/caij/puremusic/adapter/DriveFileAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/caij/puremusic/adapter/DriveFileAdapter$ViewHolder;", "activity", "Landroid/app/Activity;", "dataSet", "", "Lcom/caij/puremusic/drive/model/DriveFile;", "callbacks", "Lcom/caij/puremusic/adapter/ICallbacks;", "(Landroid/app/Activity;Ljava/util/List;Lcom/caij/puremusic/adapter/ICallbacks;)V", "getDataSet", "getFileText", "", "file", "getFileTitle", "getItemCount", "", "getItemViewType", "position", "loadFileImage", "", "holder", "onBindViewHolder", "index", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "swapDataSet", "songFiles", "Companion", "ViewHolder", "app_chinaRelease"})
public final class DriveFileAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.caij.puremusic.adapter.DriveFileAdapter.ViewHolder> {
    private final android.app.Activity activity = null;
    private java.util.List<com.caij.puremusic.drive.model.DriveFile> dataSet;
    private final com.caij.puremusic.adapter.ICallbacks callbacks = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.adapter.DriveFileAdapter.Companion Companion = null;
    private static final int FILE = 0;
    private static final int FOLDER = 1;
    
    public DriveFileAdapter(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.drive.model.DriveFile> dataSet, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.adapter.ICallbacks callbacks) {
        super();
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    public final void swapDataSet(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.drive.model.DriveFile> songFiles) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.caij.puremusic.drive.model.DriveFile> getDataSet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.caij.puremusic.adapter.DriveFileAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.adapter.DriveFileAdapter.ViewHolder holder, int index) {
    }
    
    private final java.lang.String getFileTitle(com.caij.puremusic.drive.model.DriveFile file) {
        return null;
    }
    
    private final java.lang.String getFileText(com.caij.puremusic.drive.model.DriveFile file) {
        return null;
    }
    
    private final void loadFileImage(com.caij.puremusic.drive.model.DriveFile file, com.caij.puremusic.adapter.DriveFileAdapter.ViewHolder holder) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0016\u00a8\u0006\r"}, d2 = {"Lcom/caij/puremusic/adapter/DriveFileAdapter$ViewHolder;", "Lcom/caij/puremusic/adapter/base/MediaEntryViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/caij/puremusic/adapter/DriveFileAdapter;Landroid/view/View;)V", "isPositionInRange", "", "position", "", "onClick", "", "v", "onLongClick", "app_chinaRelease"})
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/caij/puremusic/adapter/DriveFileAdapter$Companion;", "", "()V", "FILE", "", "FOLDER", "readableFileSize", "", "size", "", "app_chinaRelease"})
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