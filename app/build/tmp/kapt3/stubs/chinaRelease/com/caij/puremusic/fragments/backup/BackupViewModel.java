package com.caij.puremusic.fragments.backup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ1\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0005H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/caij/puremusic/fragments/backup/BackupViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "backupsLiveData", "Landroidx/lifecycle/LiveData;", "", "Ljava/io/File;", "getBackupsLiveData", "()Landroidx/lifecycle/LiveData;", "backupsMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "loadBackups", "", "restoreBackup", "activity", "Landroid/app/Activity;", "inputStream", "Ljava/io/InputStream;", "contents", "Lcom/caij/puremusic/helper/BackupContent;", "(Landroid/app/Activity;Ljava/io/InputStream;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_chinaRelease"})
public final class BackupViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<java.io.File>> backupsMutableLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<java.io.File>> backupsLiveData = null;
    
    public BackupViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<java.io.File>> getBackupsLiveData() {
        return null;
    }
    
    public final void loadBackups() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object restoreBackup(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    java.io.InputStream inputStream, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.caij.puremusic.helper.BackupContent> contents, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}