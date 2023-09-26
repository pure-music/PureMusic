package com.caij.puremusic.fragments.backup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0017J\b\u0010\u001b\u001a\u00020\u0012H\u0016J\u001a\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u0012H\u0002J\b\u0010\"\u001a\u00020\u0012H\u0002J\b\u0010#\u001a\u00020\u0012H\u0003R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006$"}, d2 = {"Lcom/caij/puremusic/fragments/backup/BackupFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/caij/puremusic/adapter/backup/BackupAdapter$BackupClickedListener;", "()V", "_binding", "Lcom/caij/puremusic/databinding/FragmentBackupBinding;", "backupAdapter", "Lcom/caij/puremusic/adapter/backup/BackupAdapter;", "backupViewModel", "Lcom/caij/puremusic/fragments/backup/BackupViewModel;", "getBackupViewModel", "()Lcom/caij/puremusic/fragments/backup/BackupViewModel;", "backupViewModel$delegate", "Lkotlin/Lazy;", "binding", "getBinding", "()Lcom/caij/puremusic/databinding/FragmentBackupBinding;", "checkIsEmpty", "", "initAdapter", "onBackupClicked", "file", "Ljava/io/File;", "onBackupMenuClicked", "", "menuItem", "Landroid/view/MenuItem;", "onDestroyView", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupRecyclerview", "showBackChannel", "showCreateBackupDialog", "app_chinaRelease"})
public final class BackupFragment extends androidx.fragment.app.Fragment implements com.caij.puremusic.adapter.backup.BackupAdapter.BackupClickedListener {
    private final kotlin.Lazy backupViewModel$delegate = null;
    private com.caij.puremusic.adapter.backup.BackupAdapter backupAdapter;
    private com.caij.puremusic.databinding.FragmentBackupBinding _binding;
    
    public BackupFragment() {
        super();
    }
    
    private final com.caij.puremusic.fragments.backup.BackupViewModel getBackupViewModel() {
        return null;
    }
    
    private final com.caij.puremusic.databinding.FragmentBackupBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initAdapter() {
    }
    
    private final void checkIsEmpty() {
    }
    
    private final void setupRecyclerview() {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    private final void showCreateBackupDialog() {
    }
    
    private final void showBackChannel() {
    }
    
    @java.lang.Override()
    public void onBackupClicked(@org.jetbrains.annotations.NotNull()
    java.io.File file) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public boolean onBackupMenuClicked(@org.jetbrains.annotations.NotNull()
    java.io.File file, @org.jetbrains.annotations.NotNull()
    android.view.MenuItem menuItem) {
        return false;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}