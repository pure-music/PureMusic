package com.caij.puremusic.activities.tageditor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00c2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 W2\u00020\u00012\u00020\u0002:\u0001WB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010&\u001a\u00020\'H\u0004J\b\u0010(\u001a\u00020\'H\u0002J\u0010\u0010)\u001a\u00020\'2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00120\tH\u0002J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\tH\u0002J\b\u0010-\u001a\u00020\'H\u0002J\u0010\u0010.\u001a\u00020\'2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0012\u0010/\u001a\u00020\'2\b\u00100\u001a\u0004\u0018\u00010,H\u0002J\u001e\u00101\u001a\u0010\u0012\u0004\u0012\u000203\u0012\u0006\u0012\u0004\u0018\u00010\u0012022\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\"\u00104\u001a\u00020\'2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002062\b\u00108\u001a\u0004\u0018\u000109H\u0014J\u0012\u0010:\u001a\u00020\'2\b\u0010;\u001a\u0004\u0018\u00010<H\u0014J\u0018\u0010=\u001a\u00020\'2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0016J\u0010\u0010B\u001a\u00020\f2\u0006\u0010C\u001a\u00020DH\u0016J\u0006\u0010E\u001a\u00020\'J\u000e\u0010F\u001a\u00020\'2\u0006\u0010G\u001a\u000206J\u001a\u0010H\u001a\u00020\'2\b\u0010I\u001a\u0004\u0018\u00010\u00052\u0006\u0010J\u001a\u000206H\u0004J\b\u0010K\u001a\u00020\'H\u0003J\b\u0010L\u001a\u00020\'H\u0002J\b\u0010M\u001a\u00020\'H\u0002J$\u0010N\u001a\u00020\'2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020,0\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002JB\u0010P\u001a\u00020\'2\u0012\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020\u00120R2\b\u0010T\u001a\u0004\u0018\u00010U2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020,0\tH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u00198DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010#\u00a8\u0006X"}, d2 = {"Lcom/caij/puremusic/activities/tageditor/SongTagEditorActivityV2;", "Lcom/caij/puremusic/activities/base/AbsBaseActivity;", "Landroidx/core/view/MenuProvider;", "()V", "albumArtBitmap", "Landroid/graphics/Bitmap;", "binding", "Lcom/caij/puremusic/databinding/ActivitySongTagEditorBinding;", "cacheFiles", "", "Ljava/io/File;", "deleteAlbumArt", "", "editorImage", "Landroid/widget/ImageView;", "getEditorImage", "()Landroid/widget/ImageView;", "items", "", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/IntentSenderRequest;", "mRoomRepository", "Lcom/caij/puremusic/repository/RoomRepository;", "show", "Landroidx/appcompat/app/AlertDialog;", "getShow", "()Landroidx/appcompat/app/AlertDialog;", "song", "Lcom/caij/puremusic/db/model/Song;", "songId", "", "songRepository", "Lcom/caij/puremusic/repository/SongRepository;", "getSongRepository", "()Lcom/caij/puremusic/repository/SongRepository;", "songRepository$delegate", "Lkotlin/Lazy;", "dataChanged", "", "deleteImage", "fillViewsWithFileTags", "getSongPaths", "getSongUris", "Landroid/net/Uri;", "hideFab", "loadCurrentImage", "loadImageFromFile", "selectedFile", "loadLyricsText", "Lkotlin/Pair;", "Lcom/caij/puremusic/fragments/lyrics/ComnLyricsFragment$LyricsType;", "onActivityResult", "requestCode", "", "resultCode", "intent", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateMenu", "menu", "Landroid/view/Menu;", "menuInflater", "Landroid/view/MenuInflater;", "onMenuItemSelected", "menuItem", "Landroid/view/MenuItem;", "save", "setColors", "color", "setImageBitmap", "bitmap", "bgColor", "setUpViews", "showFab", "startImagePicker", "writeToFiles", "songUris", "writeValuesToFiles", "fieldKeyValueMap", "", "Lorg/jaudiotagger/tag/FieldKey;", "artworkInfo", "Lcom/caij/puremusic/model/ArtworkInfo;", "songPaths", "Companion", "app_chinaRelease"})
public class SongTagEditorActivityV2 extends com.caij.puremusic.activities.base.AbsBaseActivity implements androidx.core.view.MenuProvider {
    private com.caij.puremusic.db.model.Song song;
    private com.caij.puremusic.databinding.ActivitySongTagEditorBinding binding;
    private final kotlin.Lazy songRepository$delegate = null;
    private final com.caij.puremusic.repository.RoomRepository mRoomRepository = null;
    private android.graphics.Bitmap albumArtBitmap;
    private boolean deleteAlbumArt = false;
    private long songId = 0L;
    private java.util.List<java.lang.String> items;
    private java.util.List<? extends java.io.File> cacheFiles;
    private androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> launcher;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.activities.tageditor.SongTagEditorActivityV2.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = null;
    
    public SongTagEditorActivityV2() {
        super();
    }
    
    private final com.caij.puremusic.repository.SongRepository getSongRepository() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    private final void setUpViews() {
    }
    
    protected final void dataChanged() {
    }
    
    private final void showFab() {
    }
    
    private final void hideFab() {
    }
    
    private final void fillViewsWithFileTags(com.caij.puremusic.db.model.Song song) {
    }
    
    private final kotlin.Pair<com.caij.puremusic.fragments.lyrics.ComnLyricsFragment.LyricsType, java.lang.String> loadLyricsText(com.caij.puremusic.db.model.Song song) {
        return null;
    }
    
    private final void loadCurrentImage(com.caij.puremusic.db.model.Song song) {
    }
    
    protected final void setImageBitmap(@org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap bitmap, int bgColor) {
    }
    
    private final void deleteImage() {
    }
    
    public final void setColors(int color) {
    }
    
    public final void save() {
    }
    
    private final void writeValuesToFiles(java.util.Map<org.jaudiotagger.tag.FieldKey, java.lang.String> fieldKeyValueMap, com.caij.puremusic.model.ArtworkInfo artworkInfo, java.util.List<java.lang.String> songPaths, java.util.List<? extends android.net.Uri> songUris) {
    }
    
    private final void writeToFiles(java.util.List<? extends android.net.Uri> songUris, java.util.List<? extends java.io.File> cacheFiles) {
    }
    
    private final java.util.List<java.lang.String> getSongPaths() {
        return null;
    }
    
    private final java.util.List<android.net.Uri> getSongUris() {
        return null;
    }
    
    private final void loadImageFromFile(android.net.Uri selectedFile) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.appcompat.app.AlertDialog getShow() {
        return null;
    }
    
    private final void startImagePicker() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    private final android.widget.ImageView getEditorImage() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreateMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater menuInflater) {
    }
    
    @java.lang.Override()
    public boolean onMenuItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem menuItem) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/caij/puremusic/activities/tageditor/SongTagEditorActivityV2$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "app_chinaRelease"})
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