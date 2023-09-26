package com.caij.puremusic.service;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bJ\u0006\u0010\u0015\u001a\u00020\u000fJ \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016J\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0005J\u000e\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\rJ\u0006\u0010\u001e\u001a\u00020\u0017J\u0006\u0010\u001f\u001a\u00020\u0017J\u000e\u0010 \u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0005J\u000e\u0010!\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\rJ\u0010\u0010\"\u001a\u00020\u00172\b\b\u0002\u0010#\u001a\u00020$J\u000e\u0010%\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000fR\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0004j\b\u0012\u0004\u0012\u00020\r`\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/caij/puremusic/service/GlobalLyricsManager;", "Lcom/caij/puremusic/helper/MusicProgressViewUpdateHelper$Callback;", "()V", "callbacks", "Ljava/util/ArrayList;", "Lcom/caij/puremusic/service/LyricsCallback;", "Lkotlin/collections/ArrayList;", "lyricsCache", "", "Lcom/caij/puremusic/lyrics/LrcEntry;", "preSong", "Lcom/caij/puremusic/db/model/Song;", "progressCallbacks", "Lcom/caij/puremusic/service/LyricsProgressCallback;", "showLine", "", "updateHelper", "Lcom/caij/puremusic/helper/MusicProgressViewUpdateHelper;", "getCurrentLyricsText", "", "getLyrics", "getShowLine", "onUpdateProgressViews", "", "progress", "bufferedPosition", "total", "register", "callback", "registerProgress", "start", "stop", "unregister", "unregisterProgress", "update", "isForce", "", "updateTime", "app_chinaDebug"})
public final class GlobalLyricsManager implements com.caij.puremusic.helper.MusicProgressViewUpdateHelper.Callback {
    @org.jetbrains.annotations.NotNull()
    private static com.caij.puremusic.helper.MusicProgressViewUpdateHelper updateHelper;
    private static int showLine = 0;
    @org.jetbrains.annotations.Nullable()
    private static java.util.List<? extends com.caij.puremusic.lyrics.LrcEntry> lyricsCache;
    @org.jetbrains.annotations.NotNull()
    private static java.util.ArrayList<com.caij.puremusic.service.LyricsCallback> callbacks;
    @org.jetbrains.annotations.NotNull()
    private static java.util.ArrayList<com.caij.puremusic.service.LyricsProgressCallback> progressCallbacks;
    @org.jetbrains.annotations.NotNull()
    private static com.caij.puremusic.db.model.Song preSong;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.service.GlobalLyricsManager INSTANCE = null;
    
    private GlobalLyricsManager() {
        super();
    }
    
    public final void start() {
    }
    
    public final void stop() {
    }
    
    public final void register(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.service.LyricsCallback callback) {
    }
    
    public final void unregister(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.service.LyricsCallback callback) {
    }
    
    public final void registerProgress(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.service.LyricsProgressCallback callback) {
    }
    
    public final void unregisterProgress(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.service.LyricsProgressCallback callback) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrentLyricsText() {
        return null;
    }
    
    public final int getShowLine() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.caij.puremusic.lyrics.LrcEntry> getLyrics() {
        return null;
    }
    
    public final int updateTime(int progress) {
        return 0;
    }
    
    public final void update(boolean isForce) {
    }
    
    @java.lang.Override()
    public void onUpdateProgressViews(int progress, int bufferedPosition, int total) {
    }
}