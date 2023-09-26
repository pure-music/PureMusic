package com.caij.puremusic.dialogs;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J.\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\r0\u000fj\b\u0012\u0004\u0012\u00020\r`\u0010H\u0002J\u0016\u0010\u0011\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\"\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u001d"}, d2 = {"Lcom/caij/puremusic/dialogs/DeleteSongsDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "libraryViewModel", "Lcom/caij/puremusic/fragments/LibraryViewModel;", "getLibraryViewModel", "()Lcom/caij/puremusic/fragments/LibraryViewModel;", "setLibraryViewModel", "(Lcom/caij/puremusic/fragments/LibraryViewModel;)V", "deleteSongs", "", "songs", "", "Lcom/caij/puremusic/db/model/Song;", "localSongs", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "deleteSongs2", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_chinaDebug"})
public final class DeleteSongsDialog extends androidx.fragment.app.DialogFragment {
    public com.caij.puremusic.fragments.LibraryViewModel libraryViewModel;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.dialogs.DeleteSongsDialog.Companion Companion = null;
    
    public DeleteSongsDialog() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.caij.puremusic.fragments.LibraryViewModel getLibraryViewModel() {
        return null;
    }
    
    public final void setLibraryViewModel(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.fragments.LibraryViewModel p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void deleteSongs(java.util.List<com.caij.puremusic.db.model.Song> songs, java.util.ArrayList<com.caij.puremusic.db.model.Song> localSongs) {
    }
    
    private final void deleteSongs2(java.util.List<com.caij.puremusic.db.model.Song> songs) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u00a8\u0006\t"}, d2 = {"Lcom/caij/puremusic/dialogs/DeleteSongsDialog$Companion;", "", "()V", "create", "Lcom/caij/puremusic/dialogs/DeleteSongsDialog;", "song", "Lcom/caij/puremusic/db/model/Song;", "songs", "", "app_chinaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.dialogs.DeleteSongsDialog create(@org.jetbrains.annotations.NotNull()
        com.caij.puremusic.db.model.Song song) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.dialogs.DeleteSongsDialog create(@org.jetbrains.annotations.NotNull()
        java.util.List<com.caij.puremusic.db.model.Song> songs) {
            return null;
        }
    }
}