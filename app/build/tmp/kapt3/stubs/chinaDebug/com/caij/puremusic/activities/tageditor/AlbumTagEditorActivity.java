package com.caij.puremusic.activities.tageditor;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0014J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015H\u0014J\b\u0010\u0019\u001a\u00020\u0012H\u0014J\u0012\u0010\u001a\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018H\u0014J\u0012\u0010\u001c\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\b\u0010\u001f\u001a\u00020\u0012H\u0014J\b\u0010 \u001a\u00020\u0012H\u0014J\u0010\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020#H\u0014J\b\u0010$\u001a\u00020\u0012H\u0002J\b\u0010%\u001a\u00020\u0012H\u0002J\b\u0010&\u001a\u00020\u0012H\u0002J\b\u0010\'\u001a\u00020\u0012H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006)"}, d2 = {"Lcom/caij/puremusic/activities/tageditor/AlbumTagEditorActivity;", "Lcom/caij/puremusic/activities/tageditor/AbsTagEditorActivity;", "Lcom/caij/puremusic/databinding/ActivityAlbumTagEditorBinding;", "()V", "albumArtBitmap", "Landroid/graphics/Bitmap;", "bindingInflater", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "getBindingInflater", "()Lkotlin/jvm/functions/Function1;", "deleteAlbumArt", "", "editorImage", "Landroid/widget/ImageView;", "getEditorImage", "()Landroid/widget/ImageView;", "deleteImage", "", "fillViewsWithFileTags", "getSongPaths", "", "", "getSongUris", "Landroid/net/Uri;", "loadCurrentImage", "loadImageFromFile", "selectedFile", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "save", "searchImageOnWeb", "setColors", "color", "", "setUpViews", "setupToolbar", "toastLoadingFailed", "windowEnterTransition", "Companion", "app_chinaDebug"})
public final class AlbumTagEditorActivity extends com.caij.puremusic.activities.tageditor.AbsTagEditorActivity<com.caij.puremusic.databinding.ActivityAlbumTagEditorBinding> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<android.view.LayoutInflater, com.caij.puremusic.databinding.ActivityAlbumTagEditorBinding> bindingInflater = null;
    @org.jetbrains.annotations.Nullable()
    private android.graphics.Bitmap albumArtBitmap;
    private boolean deleteAlbumArt = false;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.activities.tageditor.AlbumTagEditorActivity.Companion Companion = null;
    
    public AlbumTagEditorActivity() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlin.jvm.functions.Function1<android.view.LayoutInflater, com.caij.puremusic.databinding.ActivityAlbumTagEditorBinding> getBindingInflater() {
        return null;
    }
    
    private final void windowEnterTransition() {
    }
    
    private final void setupToolbar() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpViews() {
    }
    
    private final void fillViewsWithFileTags() {
    }
    
    @java.lang.Override()
    protected void loadCurrentImage() {
    }
    
    private final void toastLoadingFailed() {
    }
    
    @java.lang.Override()
    protected void searchImageOnWeb() {
    }
    
    @java.lang.Override()
    protected void deleteImage() {
    }
    
    @java.lang.Override()
    protected void loadImageFromFile(@org.jetbrains.annotations.Nullable()
    android.net.Uri selectedFile) {
    }
    
    @java.lang.Override()
    protected void save() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected java.util.List<java.lang.String> getSongPaths() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected java.util.List<android.net.Uri> getSongUris() {
        return null;
    }
    
    @java.lang.Override()
    protected void setColors(int color) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.widget.ImageView getEditorImage() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/caij/puremusic/activities/tageditor/AlbumTagEditorActivity$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "app_chinaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG() {
            return null;
        }
    }
}