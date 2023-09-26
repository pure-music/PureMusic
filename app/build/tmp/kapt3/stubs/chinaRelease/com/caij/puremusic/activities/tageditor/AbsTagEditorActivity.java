package com.caij.puremusic.activities.tageditor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00c4\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0014\b&\u0018\u0000 \u0088\u0001*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0002\u0088\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010V\u001a\u00020WH\u0004J\b\u0010X\u001a\u00020WH$J\u0010\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\fH\u0002J\b\u0010\\\u001a\u00020WH\u0002J\u000e\u0010]\u001a\b\u0012\u0004\u0012\u00020\f0\u001eH$J\u000e\u0010^\u001a\b\u0012\u0004\u0012\u00020_0\u001eH$J\b\u0010`\u001a\u00020WH\u0002J\b\u0010a\u001a\u00020WH$J\u0012\u0010b\u001a\u00020W2\b\u0010c\u001a\u0004\u0018\u00010_H$J\"\u0010d\u001a\u00020W2\u0006\u0010e\u001a\u0002082\u0006\u0010f\u001a\u0002082\b\u0010g\u001a\u0004\u0018\u00010hH\u0014J\u0012\u0010i\u001a\u00020W2\b\u0010j\u001a\u0004\u0018\u00010kH\u0014J\b\u0010l\u001a\u00020WH\u0016J\u0010\u0010m\u001a\u00020n2\u0006\u0010o\u001a\u00020pH\u0016J\b\u0010q\u001a\u00020WH$J\b\u0010r\u001a\u00020WH$J!\u0010s\u001a\u00020W2\u0012\u0010t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0u\"\u00020\fH\u0004\u00a2\u0006\u0002\u0010vJ\u0010\u0010w\u001a\u00020W2\u0006\u0010x\u001a\u000208H\u0014J\u001a\u0010y\u001a\u00020W2\b\u0010z\u001a\u0004\u0018\u00010\b2\u0006\u0010{\u001a\u000208H\u0004J\b\u0010|\u001a\u00020WH\u0002J\b\u0010}\u001a\u00020WH\u0002J\b\u0010~\u001a\u00020WH\u0002J\b\u0010\u007f\u001a\u00020WH\u0002J\t\u0010\u0080\u0001\u001a\u00020WH\u0002J\u001a\u0010\u0081\u0001\u001a\u00020W2\u000f\u0010\u0082\u0001\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001eH\u0002J&\u0010\u0083\u0001\u001a\u00020W2\r\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020_0\u001e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J)\u0010\u0085\u0001\u001a\u00020W2\u0013\u0010\u0086\u0001\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\f0I2\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010FH\u0004R\u0012\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\f8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\f8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0015\u001a\u00028\u00008DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00028\u00000\u0019X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010 \u001a\u0004\u0018\u00010\f8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u000eR\u0010\u0010\"\u001a\u0004\u0018\u00010\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010#\u001a\u0004\u0018\u00010\f8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b$\u0010\u000eR\u0012\u0010%\u001a\u00020&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\'\u0010(R\u0016\u0010)\u001a\u0004\u0018\u00010\f8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b*\u0010\u000eR\u001a\u0010+\u001a\u00020,X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u00101\u001a\b\u0012\u0004\u0012\u00020\f0\u001eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u00102\u001a\b\u0012\u0004\u0012\u00020403X\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u00105\u001a\u0004\u0018\u00010\f8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b6\u0010\u000eR\u000e\u00107\u001a\u000208X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u00109\u001a\u00020:8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b;\u0010<R\u001a\u0010?\u001a\u00020@X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0010\u0010E\u001a\u0004\u0018\u00010FX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010G\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010H\u001a\u0010\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\f\u0018\u00010IX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010K\u001a\u00020L8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\bM\u0010NR\u0016\u0010O\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010P\u001a\u0004\u0018\u00010\f8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\bQ\u0010\u000eR\u0016\u0010R\u001a\u0004\u0018\u00010\f8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\bS\u0010\u000eR\u0016\u0010T\u001a\u0004\u0018\u00010\f8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\bU\u0010\u000e\u00a8\u0006\u0089\u0001"}, d2 = {"Lcom/caij/puremusic/activities/tageditor/AbsTagEditorActivity;", "VB", "Landroidx/viewbinding/ViewBinding;", "Lcom/caij/puremusic/activities/base/AbsBaseActivity;", "()V", "_binding", "Landroidx/viewbinding/ViewBinding;", "albumArt", "Landroid/graphics/Bitmap;", "getAlbumArt", "()Landroid/graphics/Bitmap;", "albumArtist", "", "getAlbumArtist$app_chinaRelease", "()Ljava/lang/String;", "albumArtistName", "getAlbumArtistName", "albumTitle", "getAlbumTitle", "artistName", "getArtistName", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "bindingInflater", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "getBindingInflater", "()Lkotlin/jvm/functions/Function1;", "cacheFiles", "", "Ljava/io/File;", "composer", "getComposer", "currentSongPath", "discNumber", "getDiscNumber", "editorImage", "Landroid/widget/ImageView;", "getEditorImage", "()Landroid/widget/ImageView;", "genreName", "getGenreName", "id", "", "getId", "()J", "setId", "(J)V", "items", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/IntentSenderRequest;", "lyrics", "getLyrics", "paletteColorPrimary", "", "repository", "Lcom/caij/puremusic/repository/Repository;", "getRepository", "()Lcom/caij/puremusic/repository/Repository;", "repository$delegate", "Lkotlin/Lazy;", "saveFab", "Lcom/google/android/material/button/MaterialButton;", "getSaveFab", "()Lcom/google/android/material/button/MaterialButton;", "setSaveFab", "(Lcom/google/android/material/button/MaterialButton;)V", "savedArtworkInfo", "Lcom/caij/puremusic/model/ArtworkInfo;", "savedSongPaths", "savedTags", "", "Lorg/jaudiotagger/tag/FieldKey;", "show", "Landroidx/appcompat/app/AlertDialog;", "getShow", "()Landroidx/appcompat/app/AlertDialog;", "songPaths", "songTitle", "getSongTitle", "songYear", "getSongYear", "trackNumber", "getTrackNumber", "dataChanged", "", "deleteImage", "getAudioFile", "Lorg/jaudiotagger/audio/AudioFile;", "path", "getIntentExtras", "getSongPaths", "getSongUris", "Landroid/net/Uri;", "hideFab", "loadCurrentImage", "loadImageFromFile", "selectedFile", "onActivityResult", "requestCode", "resultCode", "intent", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "save", "searchImageOnWeb", "searchWebFor", "keys", "", "([Ljava/lang/String;)V", "setColors", "color", "setImageBitmap", "bitmap", "bgColor", "setUpFab", "setUpImageView", "setUpViews", "showFab", "startImagePicker", "writeTags", "paths", "writeToFiles", "songUris", "writeValuesToFiles", "fieldKeyValueMap", "artworkInfo", "Companion", "app_chinaRelease"})
public abstract class AbsTagEditorActivity<VB extends androidx.viewbinding.ViewBinding> extends com.caij.puremusic.activities.base.AbsBaseActivity {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy repository$delegate = null;
    public com.google.android.material.button.MaterialButton saveFab;
    private long id = -1L;
    private int paletteColorPrimary = 0;
    private java.util.List<java.lang.String> songPaths;
    private java.util.List<java.lang.String> savedSongPaths;
    private final java.lang.String currentSongPath = null;
    private java.util.Map<org.jaudiotagger.tag.FieldKey, java.lang.String> savedTags;
    private com.caij.puremusic.model.ArtworkInfo savedArtworkInfo;
    private VB _binding;
    private java.util.List<? extends java.io.File> cacheFiles;
    private androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> launcher;
    private java.util.List<java.lang.String> items;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.activities.tageditor.AbsTagEditorActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_ID = "extra_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_PALETTE = "extra_palette";
    private static final java.lang.String TAG = null;
    public static final int REQUEST_CODE_SELECT_IMAGE = 1000;
    
    public AbsTagEditorActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.widget.ImageView getEditorImage();
    
    @org.jetbrains.annotations.NotNull()
    public final com.caij.puremusic.repository.Repository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.button.MaterialButton getSaveFab() {
        return null;
    }
    
    public final void setSaveFab(@org.jetbrains.annotations.NotNull()
    com.google.android.material.button.MaterialButton p0) {
    }
    
    protected final long getId() {
        return 0L;
    }
    
    protected final void setId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final VB getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlin.jvm.functions.Function1<android.view.LayoutInflater, VB> getBindingInflater();
    
    protected abstract void loadImageFromFile(@org.jetbrains.annotations.Nullable()
    android.net.Uri selectedFile);
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.appcompat.app.AlertDialog getShow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAlbumArtist$app_chinaRelease() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final java.lang.String getSongTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final java.lang.String getComposer() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final java.lang.String getAlbumTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final java.lang.String getArtistName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final java.lang.String getAlbumArtistName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final java.lang.String getGenreName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final java.lang.String getSongYear() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final java.lang.String getTrackNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final java.lang.String getDiscNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final java.lang.String getLyrics() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final android.graphics.Bitmap getAlbumArt() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpViews() {
    }
    
    private final void setUpImageView() {
    }
    
    private final void startImagePicker() {
    }
    
    protected abstract void loadCurrentImage();
    
    protected abstract void searchImageOnWeb();
    
    protected abstract void deleteImage();
    
    private final void setUpFab() {
    }
    
    protected abstract void save();
    
    private final void getIntentExtras() {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract java.util.List<java.lang.String> getSongPaths();
    
    @org.jetbrains.annotations.NotNull()
    protected abstract java.util.List<android.net.Uri> getSongUris();
    
    protected final void searchWebFor(@org.jetbrains.annotations.NotNull()
    java.lang.String... keys) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    protected final void dataChanged() {
    }
    
    private final void showFab() {
    }
    
    private final void hideFab() {
    }
    
    protected final void setImageBitmap(@org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap bitmap, int bgColor) {
    }
    
    protected void setColors(int color) {
    }
    
    protected final void writeValuesToFiles(@org.jetbrains.annotations.NotNull()
    java.util.Map<org.jaudiotagger.tag.FieldKey, java.lang.String> fieldKeyValueMap, @org.jetbrains.annotations.Nullable()
    com.caij.puremusic.model.ArtworkInfo artworkInfo) {
    }
    
    private final void writeTags(java.util.List<java.lang.String> paths) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    private final org.jaudiotagger.audio.AudioFile getAudioFile(java.lang.String path) {
        return null;
    }
    
    private final void writeToFiles(java.util.List<? extends android.net.Uri> songUris, java.util.List<? extends java.io.File> cacheFiles) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \t*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/caij/puremusic/activities/tageditor/AbsTagEditorActivity$Companion;", "", "()V", "EXTRA_ID", "", "EXTRA_PALETTE", "REQUEST_CODE_SELECT_IMAGE", "", "TAG", "kotlin.jvm.PlatformType", "app_chinaRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}