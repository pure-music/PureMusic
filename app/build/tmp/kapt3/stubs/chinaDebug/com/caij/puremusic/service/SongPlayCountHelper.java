package com.caij.puremusic.service;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0012\u001a\u00020\u0010R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/caij/puremusic/service/SongPlayCountHelper;", "", "()V", "song", "Lcom/caij/puremusic/db/model/Song;", "getSong", "()Lcom/caij/puremusic/db/model/Song;", "setSong", "(Lcom/caij/puremusic/db/model/Song;)V", "stopWatch", "Lcom/caij/puremusic/helper/StopWatch;", "getPlayTime", "", "notifyPlayStateChanged", "", "isPlaying", "", "notifySongChanged", "shouldBumpPlayCount", "Companion", "app_chinaDebug"})
public final class SongPlayCountHelper {
    @org.jetbrains.annotations.NotNull()
    private final com.caij.puremusic.helper.StopWatch stopWatch = null;
    @org.jetbrains.annotations.NotNull()
    private com.caij.puremusic.db.model.Song song;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.service.SongPlayCountHelper.Companion Companion = null;
    
    public SongPlayCountHelper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.caij.puremusic.db.model.Song getSong() {
        return null;
    }
    
    public final void setSong(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song p0) {
    }
    
    public final boolean shouldBumpPlayCount() {
        return false;
    }
    
    public final void notifySongChanged(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song song) {
    }
    
    public final long getPlayTime() {
        return 0L;
    }
    
    public final void notifyPlayStateChanged(boolean isPlaying) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/caij/puremusic/service/SongPlayCountHelper$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "app_chinaDebug"})
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