package com.caij.puremusic.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/caij/puremusic/util/CustomAlbumMetaImageUtil;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "mPreferences", "Landroid/content/SharedPreferences;", "hasCustomSongImage", "", "albumId", "", "saveImage", "", "artworkData", "", "Companion", "app_chinaRelease"})
public final class CustomAlbumMetaImageUtil {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final android.content.SharedPreferences mPreferences = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.util.CustomAlbumMetaImageUtil.Companion Companion = null;
    private static final java.lang.String CUSTOM_SONG_IMAGE_PREFS = "custom_album_meta_image";
    private static final java.lang.String FOLDER_NAME = "/custom_album_meta_images/";
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    private static com.caij.puremusic.util.CustomAlbumMetaImageUtil sInstance;
    
    private CustomAlbumMetaImageUtil(android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void saveImage(long albumId, @org.jetbrains.annotations.NotNull()
    byte[] artworkData) {
    }
    
    public final boolean hasCustomSongImage(long albumId) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.io.File getFile(long albumId) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/caij/puremusic/util/CustomAlbumMetaImageUtil$Companion;", "", "()V", "CUSTOM_SONG_IMAGE_PREFS", "", "FOLDER_NAME", "sInstance", "Lcom/caij/puremusic/util/CustomAlbumMetaImageUtil;", "getFile", "Ljava/io/File;", "albumId", "", "getFileName", "album", "Lcom/caij/puremusic/db/model/Album;", "getInstance", "context", "Landroid/content/Context;", "app_chinaRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.util.CustomAlbumMetaImageUtil getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final java.lang.String getFileName(long albumId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFileName(@org.jetbrains.annotations.NotNull()
        com.caij.puremusic.db.model.Album album) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final java.io.File getFile(long albumId) {
            return null;
        }
    }
}