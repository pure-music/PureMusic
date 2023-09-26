package com.caij.puremusic.fragments.folder;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/caij/puremusic/fragments/folder/DefaultSyncCallback;", "Lcom/caij/puremusic/drive/SyncCallback;", "context", "Landroid/content/Context;", "dialog", "Landroidx/appcompat/app/AlertDialog;", "(Landroid/content/Context;Landroidx/appcompat/app/AlertDialog;)V", "getContext", "()Landroid/content/Context;", "getDialog", "()Landroidx/appcompat/app/AlertDialog;", "onLoadAlbums", "", "count", "", "onLoadPlaylists", "onLoadSongs", "onPreloadInfo", "showToast", "id", "", "app_chinaDebug"})
public final class DefaultSyncCallback implements com.caij.puremusic.drive.SyncCallback {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.appcompat.app.AlertDialog dialog = null;
    
    public DefaultSyncCallback(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AlertDialog dialog) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.app.AlertDialog getDialog() {
        return null;
    }
    
    @java.lang.Override()
    public void onPreloadInfo() {
    }
    
    @java.lang.Override()
    public void onLoadSongs(int count) {
    }
    
    @java.lang.Override()
    public void onLoadAlbums(int count) {
    }
    
    @java.lang.Override()
    public void onLoadPlaylists(int count) {
    }
    
    private final void showToast(java.lang.String id) {
    }
}