package com.caij.puremusic.util;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/caij/puremusic/util/CustomSongMeteImageUtil;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "mPreferences", "Landroid/content/SharedPreferences;", "hasCustomSongImage", "", "song", "Lcom/caij/puremusic/db/model/Song;", "artworkData", "", "resetCustomSongImage", "", "(Lcom/caij/puremusic/db/model/Song;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveImage", "Companion", "app_chinaDebug"})
public final class CustomSongMeteImageUtil {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.SharedPreferences mPreferences = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String CUSTOM_SONG_IMAGE_PREFS = "custom_song_meta_image_v2";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String FOLDER_NAME = "/custom_song_meta_images/";
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    @org.jetbrains.annotations.Nullable()
    private static com.caij.puremusic.util.CustomSongMeteImageUtil sInstance;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.util.CustomSongMeteImageUtil.Companion Companion = null;
    
    private CustomSongMeteImageUtil(android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void saveImage(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song song, @org.jetbrains.annotations.NotNull()
    byte[] artworkData) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object resetCustomSongImage(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song song, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    public final boolean hasCustomSongImage(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song song) {
        return false;
    }
    
    public final boolean hasCustomSongImage(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song song, @org.jetbrains.annotations.NotNull()
    byte[] artworkData) {
        return false;
    }
    
    @kotlin.jvm.JvmStatic()
    @org.jetbrains.annotations.NotNull()
    public static final java.io.File getFile(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song song) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/caij/puremusic/util/CustomSongMeteImageUtil$Companion;", "", "()V", "CUSTOM_SONG_IMAGE_PREFS", "", "FOLDER_NAME", "sInstance", "Lcom/caij/puremusic/util/CustomSongMeteImageUtil;", "getFile", "Ljava/io/File;", "song", "Lcom/caij/puremusic/db/model/Song;", "getFileName", "songId", "", "getInstance", "context", "Landroid/content/Context;", "app_chinaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.util.CustomSongMeteImageUtil getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final java.lang.String getFileName(long songId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFileName(@org.jetbrains.annotations.NotNull()
        com.caij.puremusic.db.model.Song song) {
            return null;
        }
        
        @kotlin.jvm.JvmStatic()
        @org.jetbrains.annotations.NotNull()
        public final java.io.File getFile(@org.jetbrains.annotations.NotNull()
        com.caij.puremusic.db.model.Song song) {
            return null;
        }
    }
}