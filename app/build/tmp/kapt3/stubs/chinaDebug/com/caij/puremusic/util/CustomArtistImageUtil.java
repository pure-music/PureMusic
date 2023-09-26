package com.caij.puremusic.util;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ \u0010\u000e\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J!\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/caij/puremusic/util/CustomArtistImageUtil;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mPreferences", "Landroid/content/SharedPreferences;", "hasCustomArtistImage", "", "artist", "Lcom/caij/puremusic/db/model/Artist;", "resetCustomArtistImage", "", "(Lcom/caij/puremusic/db/model/Artist;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveImage", "bitmap", "Landroid/graphics/Bitmap;", "setCustomArtistImage", "uri", "Landroid/net/Uri;", "(Lcom/caij/puremusic/db/model/Artist;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_chinaDebug"})
public final class CustomArtistImageUtil {
    @org.jetbrains.annotations.NotNull()
    private final android.content.SharedPreferences mPreferences = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String CUSTOM_ARTIST_IMAGE_PREFS = "custom_artist_image";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String FOLDER_NAME = "/custom_artist_images/";
    @org.jetbrains.annotations.Nullable()
    private static com.caij.puremusic.util.CustomArtistImageUtil sInstance;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.util.CustomArtistImageUtil.Companion Companion = null;
    
    private CustomArtistImageUtil(android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setCustomArtistImage(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Artist artist, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final void saveImage(android.content.Context context, com.caij.puremusic.db.model.Artist artist, android.graphics.Bitmap bitmap) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object resetCustomArtistImage(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Artist artist, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    public final boolean hasCustomArtistImage(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Artist artist) {
        return false;
    }
    
    @kotlin.jvm.JvmStatic()
    @org.jetbrains.annotations.NotNull()
    public static final java.io.File getFile(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Artist artist) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/caij/puremusic/util/CustomArtistImageUtil$Companion;", "", "()V", "CUSTOM_ARTIST_IMAGE_PREFS", "", "FOLDER_NAME", "sInstance", "Lcom/caij/puremusic/util/CustomArtistImageUtil;", "getFile", "Ljava/io/File;", "artist", "Lcom/caij/puremusic/db/model/Artist;", "getFileName", "getInstance", "context", "Landroid/content/Context;", "app_chinaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.util.CustomArtistImageUtil getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFileName(@org.jetbrains.annotations.NotNull()
        com.caij.puremusic.db.model.Artist artist) {
            return null;
        }
        
        @kotlin.jvm.JvmStatic()
        @org.jetbrains.annotations.NotNull()
        public final java.io.File getFile(@org.jetbrains.annotations.NotNull()
        com.caij.puremusic.db.model.Artist artist) {
            return null;
        }
    }
}