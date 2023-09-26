package com.caij.puremusic.fragments.folder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/caij/puremusic/fragments/folder/DriveFilesFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/caij/puremusic/adapter/ICallbacks;", "()V", "_binding", "Lcom/caij/puremusic/databinding/FragmentFolderFilesBinding;", "adapter", "Lcom/caij/puremusic/adapter/DriveFileAdapter;", "binding", "getBinding", "()Lcom/caij/puremusic/databinding/FragmentFolderFilesBinding;", "mRoomRepository", "Lcom/caij/puremusic/repository/RoomRepository;", "onFileClicked", "", "position", "", "file", "Lcom/caij/puremusic/drive/model/DriveFile;", "onFolderClicked", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_chinaRelease"})
public final class DriveFilesFragment extends androidx.fragment.app.Fragment implements com.caij.puremusic.adapter.ICallbacks {
    private com.caij.puremusic.adapter.DriveFileAdapter adapter;
    private com.caij.puremusic.databinding.FragmentFolderFilesBinding _binding;
    private final com.caij.puremusic.repository.RoomRepository mRoomRepository = null;
    
    public DriveFilesFragment() {
        super();
    }
    
    private final com.caij.puremusic.databinding.FragmentFolderFilesBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onFolderClicked(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.drive.model.DriveFile file) {
    }
    
    @java.lang.Override()
    public void onFileClicked(int position, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.drive.model.DriveFile file) {
    }
}