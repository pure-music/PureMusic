package com.caij.puremusic.service;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u00012\u00020\u0002:\u0001\rB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/caij/puremusic/service/MediaStoreObserver;", "Landroid/database/ContentObserver;", "Ljava/lang/Runnable;", "musicService", "Lcom/caij/puremusic/service/MusicService;", "mHandler", "Landroid/os/Handler;", "(Lcom/caij/puremusic/service/MusicService;Landroid/os/Handler;)V", "onChange", "", "selfChange", "", "run", "Companion", "app_chinaDebug"})
public final class MediaStoreObserver extends android.database.ContentObserver implements java.lang.Runnable {
    @org.jetbrains.annotations.NotNull()
    private final com.caij.puremusic.service.MusicService musicService = null;
    @org.jetbrains.annotations.NotNull()
    private final android.os.Handler mHandler = null;
    private static final long REFRESH_DELAY = 500L;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.service.MediaStoreObserver.Companion Companion = null;
    
    public MediaStoreObserver(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.service.MusicService musicService, @org.jetbrains.annotations.NotNull()
    android.os.Handler mHandler) {
        super(null);
    }
    
    @java.lang.Override()
    public void onChange(boolean selfChange) {
    }
    
    @java.lang.Override()
    public void run() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/caij/puremusic/service/MediaStoreObserver$Companion;", "", "()V", "REFRESH_DELAY", "", "app_chinaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}