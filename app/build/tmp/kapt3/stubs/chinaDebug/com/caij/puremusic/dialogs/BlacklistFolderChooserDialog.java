package com.caij.puremusic.dialogs;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\r\n\u0002\b\u0004\u0018\u0000 $2\u00020\u0001:\u0002$%B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0015\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\bH\u0002\u00a2\u0006\u0002\u0010\u0014J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0018H\u0016J\u0010\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0012H\u0002J\u0010\u0010\u001f\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!*\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002\u00a2\u0006\u0002\u0010#R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/caij/puremusic/dialogs/BlacklistFolderChooserDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "callback", "Lcom/caij/puremusic/dialogs/BlacklistFolderChooserDialog$FolderCallback;", "canGoUp", "", "contentsArray", "", "", "getContentsArray", "()[Ljava/lang/String;", "initialPath", "parentContents", "Ljava/io/File;", "[Ljava/io/File;", "parentFolder", "checkIfCanGoUp", "", "listFiles", "()[Ljava/io/File;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onSaveInstanceState", "outState", "onSelection", "i", "", "reload", "setCallback", "toCharSequence", "", "", "([Ljava/lang/String;)Ljava/util/List;", "Companion", "FolderCallback", "app_chinaDebug"})
public final class BlacklistFolderChooserDialog extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String initialPath;
    @org.jetbrains.annotations.Nullable()
    private java.io.File parentFolder;
    @org.jetbrains.annotations.Nullable()
    private java.io.File[] parentContents;
    private boolean canGoUp = false;
    @org.jetbrains.annotations.Nullable()
    private com.caij.puremusic.dialogs.BlacklistFolderChooserDialog.FolderCallback callback;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.dialogs.BlacklistFolderChooserDialog.Companion Companion = null;
    
    public BlacklistFolderChooserDialog() {
        super();
    }
    
    private final java.lang.String[] getContentsArray() {
        return null;
    }
    
    private final java.io.File[] listFiles() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void onSelection(int i) {
    }
    
    private final void checkIfCanGoUp() {
    }
    
    private final void reload() {
    }
    
    private final java.util.List<java.lang.CharSequence> toCharSequence(java.lang.String[] $this$toCharSequence) {
        return null;
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    com.caij.puremusic.dialogs.BlacklistFolderChooserDialog.FolderCallback callback) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/caij/puremusic/dialogs/BlacklistFolderChooserDialog$Companion;", "", "()V", "create", "Lcom/caij/puremusic/dialogs/BlacklistFolderChooserDialog;", "app_chinaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.dialogs.BlacklistFolderChooserDialog create() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/caij/puremusic/dialogs/BlacklistFolderChooserDialog$FolderCallback;", "", "onFolderSelection", "", "context", "Landroid/content/Context;", "folder", "Ljava/io/File;", "app_chinaDebug"})
    public static abstract interface FolderCallback {
        
        public abstract void onFolderSelection(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.io.File folder);
    }
}