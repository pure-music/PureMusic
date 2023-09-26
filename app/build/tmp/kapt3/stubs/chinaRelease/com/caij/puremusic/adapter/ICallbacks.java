package com.caij.puremusic.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lcom/caij/puremusic/adapter/ICallbacks;", "", "onFileClicked", "", "position", "", "file", "Lcom/caij/puremusic/drive/model/DriveFile;", "onFolderClicked", "app_chinaRelease"})
public abstract interface ICallbacks {
    
    public abstract void onFolderClicked(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.drive.model.DriveFile file);
    
    public abstract void onFileClicked(int position, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.drive.model.DriveFile file);
}