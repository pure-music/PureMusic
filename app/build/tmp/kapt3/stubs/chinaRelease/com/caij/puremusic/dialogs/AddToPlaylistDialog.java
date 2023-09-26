package com.caij.puremusic.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lcom/caij/puremusic/dialogs/AddToPlaylistDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "libraryViewModel", "Lcom/caij/puremusic/fragments/LibraryViewModel;", "getLibraryViewModel", "()Lcom/caij/puremusic/fragments/LibraryViewModel;", "libraryViewModel$delegate", "Lkotlin/Lazy;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "showCreateDialog", "", "songs", "", "Lcom/caij/puremusic/db/model/Song;", "Companion", "app_chinaRelease"})
public final class AddToPlaylistDialog extends androidx.fragment.app.DialogFragment {
    private final kotlin.Lazy libraryViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.dialogs.AddToPlaylistDialog.Companion Companion = null;
    
    public AddToPlaylistDialog() {
        super();
    }
    
    private final com.caij.puremusic.fragments.LibraryViewModel getLibraryViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void showCreateDialog(java.util.List<com.caij.puremusic.db.model.Song> songs) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\"\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/caij/puremusic/dialogs/AddToPlaylistDialog$Companion;", "", "()V", "create", "Lcom/caij/puremusic/dialogs/AddToPlaylistDialog;", "playlistEntities", "", "Lcom/caij/puremusic/db/model/PlaylistEntity;", "song", "Lcom/caij/puremusic/db/model/Song;", "songs", "app_chinaRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.dialogs.AddToPlaylistDialog create(@org.jetbrains.annotations.NotNull()
        java.util.List<com.caij.puremusic.db.model.PlaylistEntity> playlistEntities, @org.jetbrains.annotations.NotNull()
        com.caij.puremusic.db.model.Song song) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.dialogs.AddToPlaylistDialog create(@org.jetbrains.annotations.NotNull()
        java.util.List<com.caij.puremusic.db.model.PlaylistEntity> playlistEntities, @org.jetbrains.annotations.NotNull()
        java.util.List<com.caij.puremusic.db.model.Song> songs) {
            return null;
        }
    }
}