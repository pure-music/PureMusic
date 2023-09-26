package com.caij.puremusic.fragments.folder.manager;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0013H\u0002J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0018\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\u0012\u0010#\u001a\u00020\u00132\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000eJ\b\u0010%\u001a\u00020\u0013H\u0002J\b\u0010&\u001a\u00020\u0013H\u0002R6\u0010\u000b\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R4\u0010\u000f\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e \u0011*\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\r0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/caij/puremusic/fragments/folder/manager/MusicFolderUtil;", "", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "context", "Landroidx/fragment/app/FragmentActivity;", "libraryViewModel", "Lcom/caij/puremusic/fragments/LibraryViewModel;", "musicFolderAdapter", "Lcom/caij/puremusic/adapter/MusicFolderAdapter;", "(Landroidx/activity/result/ActivityResultCaller;Landroidx/fragment/app/FragmentActivity;Lcom/caij/puremusic/fragments/LibraryViewModel;Lcom/caij/puremusic/adapter/MusicFolderAdapter;)V", "auth20ActivityResultContract", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "auth20Launcher", "Landroidx/activity/result/ActivityResultLauncher;", "kotlin.jvm.PlatformType", "addFolder", "", "folder", "Lcom/caij/puremusic/db/model/Folder;", "addLocalStorage", "Landroid/content/Context;", "permissionInnerStorage", "showJellyfinEditDialog", "type", "", "showLoadingDialog", "Landroidx/appcompat/app/AlertDialog;", "showPathEdit", "factory", "Lcom/caij/puremusic/drive/DriveFactory;", "auth2Token", "Lcom/caij/puremusic/drive/model/Auth2Token;", "showSourceSelectDialog", "title", "showSubsonicEditDialog", "showWebDAVEditDialog", "app_chinaDebug"})
public final class MusicFolderUtil {
    @org.jetbrains.annotations.NotNull()
    private final androidx.fragment.app.FragmentActivity context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.caij.puremusic.fragments.LibraryViewModel libraryViewModel = null;
    @org.jetbrains.annotations.Nullable()
    private final com.caij.puremusic.adapter.MusicFolderAdapter musicFolderAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.contract.ActivityResultContract<java.util.Map<java.lang.String, java.lang.String>, java.util.Map<java.lang.String, java.lang.String>> auth20ActivityResultContract = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<java.util.Map<java.lang.String, java.lang.String>> auth20Launcher = null;
    
    public MusicFolderUtil(@org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultCaller activityResultCaller, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity context, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.fragments.LibraryViewModel libraryViewModel, @org.jetbrains.annotations.Nullable()
    com.caij.puremusic.adapter.MusicFolderAdapter musicFolderAdapter) {
        super();
    }
    
    private final void showPathEdit(com.caij.puremusic.drive.DriveFactory factory, com.caij.puremusic.drive.model.Auth2Token auth2Token) {
    }
    
    public final void showSourceSelectDialog(@org.jetbrains.annotations.Nullable()
    java.lang.String title) {
    }
    
    private final void permissionInnerStorage() {
    }
    
    private final void showSubsonicEditDialog() {
    }
    
    private final void showJellyfinEditDialog(int type) {
    }
    
    private final void showWebDAVEditDialog() {
    }
    
    private final void addLocalStorage(android.content.Context context) {
    }
    
    private final void addFolder(com.caij.puremusic.db.model.Folder folder) {
    }
    
    private final androidx.appcompat.app.AlertDialog showLoadingDialog() {
        return null;
    }
}