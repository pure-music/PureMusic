package com.caij.puremusic.util;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bJ\u0014\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0010J\u0016\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0014"}, d2 = {"Lcom/caij/puremusic/util/CustomServerAlbumImageUtil;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "getCustomAlbumImage", "", "albumId", "", "hasCustomAlbumImage", "", "resetCustomAlbumImage", "", "albumIds", "", "setCustomAlbumImage", "url", "Companion", "app_chinaDebug"})
public final class CustomServerAlbumImageUtil {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String CUSTOM_ALBUM_IMAGE_PREFS = "custom_server_album_image";
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    @org.jetbrains.annotations.Nullable()
    private static com.caij.puremusic.util.CustomServerAlbumImageUtil sInstance;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.util.CustomServerAlbumImageUtil.Companion Companion = null;
    
    private CustomServerAlbumImageUtil(android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setCustomAlbumImage(@org.jetbrains.annotations.NotNull()
    java.lang.String albumId, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCustomAlbumImage(long albumId) {
        return null;
    }
    
    public final void resetCustomAlbumImage(@org.jetbrains.annotations.NotNull()
    java.lang.String albumId) {
    }
    
    public final void resetCustomAlbumImage(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> albumIds) {
    }
    
    public final boolean hasCustomAlbumImage(long albumId) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/caij/puremusic/util/CustomServerAlbumImageUtil$Companion;", "", "()V", "CUSTOM_ALBUM_IMAGE_PREFS", "", "sInstance", "Lcom/caij/puremusic/util/CustomServerAlbumImageUtil;", "getInstance", "context", "Landroid/content/Context;", "app_chinaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.util.CustomServerAlbumImageUtil getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}