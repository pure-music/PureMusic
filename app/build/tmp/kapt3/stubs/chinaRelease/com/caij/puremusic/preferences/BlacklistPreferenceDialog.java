package com.caij.puremusic.preferences;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/caij/puremusic/preferences/BlacklistPreferenceDialog;", "Landroidx/fragment/app/DialogFragment;", "Lcom/caij/puremusic/dialogs/BlacklistFolderChooserDialog$FolderCallback;", "()V", "paths", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onFolderSelection", "", "context", "Landroid/content/Context;", "folder", "Ljava/io/File;", "refreshBlacklistData", "Companion", "app_chinaRelease"})
public final class BlacklistPreferenceDialog extends androidx.fragment.app.DialogFragment implements com.caij.puremusic.dialogs.BlacklistFolderChooserDialog.FolderCallback {
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.preferences.BlacklistPreferenceDialog.Companion Companion = null;
    private java.util.ArrayList<java.lang.String> paths;
    
    public BlacklistPreferenceDialog() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void refreshBlacklistData(android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onFolderSelection(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.io.File folder) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/caij/puremusic/preferences/BlacklistPreferenceDialog$Companion;", "", "()V", "newInstance", "Lcom/caij/puremusic/preferences/BlacklistPreferenceDialog;", "app_chinaRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.preferences.BlacklistPreferenceDialog newInstance() {
            return null;
        }
    }
}