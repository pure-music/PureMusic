package com.caij.puremusic.service;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u00011B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0015H\u0016J\u0018\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015H\u0016J\b\u0010 \u001a\u00020\u0013H\u0017J\b\u0010!\u001a\u00020\u001aH\u0002J\b\u0010\"\u001a\u00020\u0013H\u0002J9\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&2!\u0010\'\u001a\u001d\u0012\u0013\u0012\u00110\u0013\u00a2\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u001a0(JO\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&2\u0014\u0010,\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0018\u00010-2!\u0010\'\u001a\u001d\u0012\u0013\u0012\u00110\u0013\u00a2\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u001a0(J\b\u0010.\u001a\u00020\u0013H\u0017J\b\u0010/\u001a\u00020\u001aH\u0017J\b\u00100\u001a\u00020\u001aH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/caij/puremusic/service/LocalPlayback;", "Lcom/caij/puremusic/service/playback/Playback;", "Lcom/caij/video/BaseMediaPlayer$OnCompletionListener;", "Lcom/caij/video/BaseMediaPlayer$OnErrorListener;", "Lcom/caij/video/BaseMediaPlayer$OnBufferingUpdateListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "audioFocusListener", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "audioFocusRequest", "Landroidx/media/AudioFocusRequestCompat;", "audioManager", "Landroid/media/AudioManager;", "becomingNoisyReceiver", "Landroid/content/BroadcastReceiver;", "becomingNoisyReceiverIntentFilter", "Landroid/content/IntentFilter;", "becomingNoisyReceiverRegistered", "", "bufferedPercentage", "", "getContext", "()Landroid/content/Context;", "isPausedByTransientLossOfFocus", "abandonFocus", "", "bufferedPosition", "onBufferingUpdate", "mp", "Lcom/caij/video/BaseMediaPlayer;", "percent", "pause", "registerBecomingNoisyReceiver", "requestFocus", "setDataSourceImpl", "player", "path", "", "completion", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "success", "headers", "", "start", "stop", "unregisterBecomingNoisyReceiver", "Volume", "app_chinaDebug"})
public abstract class LocalPlayback implements com.caij.puremusic.service.playback.Playback, com.caij.video.BaseMediaPlayer.OnCompletionListener, com.caij.video.BaseMediaPlayer.OnErrorListener, com.caij.video.BaseMediaPlayer.OnBufferingUpdateListener {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private int bufferedPercentage = -1;
    @org.jetbrains.annotations.NotNull()
    private final android.content.IntentFilter becomingNoisyReceiverIntentFilter = null;
    @org.jetbrains.annotations.Nullable()
    private final android.media.AudioManager audioManager = null;
    private boolean becomingNoisyReceiverRegistered = false;
    @org.jetbrains.annotations.NotNull()
    private final android.content.BroadcastReceiver becomingNoisyReceiver = null;
    private boolean isPausedByTransientLossOfFocus = false;
    @org.jetbrains.annotations.NotNull()
    private final android.media.AudioManager.OnAudioFocusChangeListener audioFocusListener = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.media.AudioFocusRequestCompat audioFocusRequest = null;
    
    public LocalPlayback(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @java.lang.Override()
    public int bufferedPosition() {
        return 0;
    }
    
    @java.lang.Override()
    @androidx.annotation.CallSuper()
    public boolean start() {
        return false;
    }
    
    @java.lang.Override()
    @androidx.annotation.CallSuper()
    public void stop() {
    }
    
    @java.lang.Override()
    @androidx.annotation.CallSuper()
    public boolean pause() {
        return false;
    }
    
    /**
     * @param player The [MediaPlayer] to use
     * @param path The path of the file, or the http/rtsp URL of the stream you want to play
     * @return True if the <code>player</code> has been prepared and is ready to play, false otherwise
     */
    public final void setDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.caij.video.BaseMediaPlayer player, @org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> completion) {
    }
    
    /**
     * @param player The [MediaPlayer] to use
     * @param path The path of the file, or the http/rtsp URL of the stream you want to play
     * @return True if the <code>player</code> has been prepared and is ready to play, false otherwise
     */
    public final void setDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.caij.video.BaseMediaPlayer player, @org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> headers, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> completion) {
    }
    
    @java.lang.Override()
    public void onBufferingUpdate(@org.jetbrains.annotations.NotNull()
    com.caij.video.BaseMediaPlayer mp, int percent) {
    }
    
    private final void unregisterBecomingNoisyReceiver() {
    }
    
    private final void registerBecomingNoisyReceiver() {
    }
    
    private final boolean requestFocus() {
        return false;
    }
    
    private final void abandonFocus() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/caij/puremusic/service/LocalPlayback$Volume;", "", "()V", "DUCK", "", "NORMAL", "app_chinaDebug"})
    public static final class Volume {
        
        /**
         * The volume we set the media player to when we lose audio focus, but are
         * allowed to reduce the volume instead of stopping playback.
         */
        public static final float DUCK = 0.2F;
        
        /**
         * The volume we set the media player when we have audio focus.
         */
        public static final float NORMAL = 1.0F;
        @org.jetbrains.annotations.NotNull()
        public static final com.caij.puremusic.service.LocalPlayback.Volume INSTANCE = null;
        
        private Volume() {
            super();
        }
    }
}