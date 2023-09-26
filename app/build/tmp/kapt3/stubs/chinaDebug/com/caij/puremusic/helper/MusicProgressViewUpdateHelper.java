package com.caij.puremusic.helper;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0006H\u0002J\u0006\u0010\u0013\u001a\u00020\fJ\u0006\u0010\u0014\u001a\u00020\fR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/caij/puremusic/helper/MusicProgressViewUpdateHelper;", "Landroid/os/Handler;", "callback", "Lcom/caij/puremusic/helper/MusicProgressViewUpdateHelper$Callback;", "(Lcom/caij/puremusic/helper/MusicProgressViewUpdateHelper$Callback;)V", "intervalPlaying", "", "intervalPaused", "(Lcom/caij/puremusic/helper/MusicProgressViewUpdateHelper$Callback;II)V", "firstUpdate", "", "handleMessage", "", "msg", "Landroid/os/Message;", "queueNextRefresh", "delay", "", "refreshProgressViews", "start", "stop", "Callback", "Companion", "app_chinaDebug"})
public final class MusicProgressViewUpdateHelper extends android.os.Handler {
    @org.jetbrains.annotations.Nullable()
    private com.caij.puremusic.helper.MusicProgressViewUpdateHelper.Callback callback;
    private int intervalPlaying = 0;
    private int intervalPaused = 0;
    private boolean firstUpdate = true;
    private static final int CMD_REFRESH_PROGRESS_VIEWS = 1;
    private static final int MIN_INTERVAL = 20;
    private static final int UPDATE_INTERVAL_PLAYING = 500;
    private static final int UPDATE_INTERVAL_PAUSED = 500;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.helper.MusicProgressViewUpdateHelper.Companion Companion = null;
    
    public final void start() {
    }
    
    public final void stop() {
    }
    
    public MusicProgressViewUpdateHelper(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.helper.MusicProgressViewUpdateHelper.Callback callback) {
        super();
    }
    
    public MusicProgressViewUpdateHelper(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.helper.MusicProgressViewUpdateHelper.Callback callback, int intervalPlaying, int intervalPaused) {
        super();
    }
    
    @java.lang.Override()
    public void handleMessage(@org.jetbrains.annotations.NotNull()
    android.os.Message msg) {
    }
    
    private final int refreshProgressViews() {
        return 0;
    }
    
    private final void queueNextRefresh(long delay) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Lcom/caij/puremusic/helper/MusicProgressViewUpdateHelper$Callback;", "", "onUpdateProgressViews", "", "progress", "", "bufferedPosition", "total", "app_chinaDebug"})
    public static abstract interface Callback {
        
        public abstract void onUpdateProgressViews(int progress, int bufferedPosition, int total);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/caij/puremusic/helper/MusicProgressViewUpdateHelper$Companion;", "", "()V", "CMD_REFRESH_PROGRESS_VIEWS", "", "MIN_INTERVAL", "UPDATE_INTERVAL_PAUSED", "UPDATE_INTERVAL_PLAYING", "app_chinaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}