package com.caij.puremusic.service;

/**
 * @author Andrew Neal, Karim Abou Zeid (kabouzeid)
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\"\u0010\u001d\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0016J\b\u0010 \u001a\u00020\u0010H\u0016J\b\u0010!\u001a\u00020\u0006H\u0016J\b\u0010\"\u001a\u00020\u001aH\u0016J\u0010\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0016J\u0010\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u0006H\u0016J\u0010\u0010\'\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0006H\u0016JQ\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020*2\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*\u0018\u00010,2\u0006\u0010-\u001a\u00020\u00102!\u0010.\u001a\u001d\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020\u001a0/H\u0016J\u0018\u00103\u001a\u00020\u001a2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000205H\u0016J\u0010\u00107\u001a\u00020\u00102\u0006\u00108\u001a\u000205H\u0016J\b\u00109\u001a\u00020\u0010H\u0016J\b\u0010:\u001a\u00020\u001aH\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@RX\u0096\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"}, d2 = {"Lcom/caij/puremusic/service/MultiPlayer;", "Lcom/caij/puremusic/service/LocalPlayback;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "audioSessionId", "", "getAudioSessionId", "()I", "callbacks", "Lcom/caij/puremusic/service/playback/Playback$PlaybackCallbacks;", "getCallbacks", "()Lcom/caij/puremusic/service/playback/Playback$PlaybackCallbacks;", "setCallbacks", "(Lcom/caij/puremusic/service/playback/Playback$PlaybackCallbacks;)V", "<set-?>", "", "isInitialized", "()Z", "isPlaying", "mCurrentMediaPlayer", "Lcom/caij/puremusic/service/OkhttpExoMediaPlayer;", "audioFormat", "", "duration", "onCompletion", "", "mp", "Lcom/caij/video/BaseMediaPlayer;", "onError", "what", "extra", "pause", "position", "release", "seek", "whereto", "setAudioSessionId", "sessionId", "setCrossFadeDuration", "setDataSource", "url", "", "headers", "", "force", "completion", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "success", "setPlaybackSpeedPitch", "speed", "", "pitch", "setVolume", "vol", "start", "stop", "Companion", "app_chinaDebug"})
public final class MultiPlayer extends com.caij.puremusic.service.LocalPlayback {
    @org.jetbrains.annotations.NotNull()
    private com.caij.puremusic.service.OkhttpExoMediaPlayer mCurrentMediaPlayer;
    @org.jetbrains.annotations.Nullable()
    private com.caij.puremusic.service.playback.Playback.PlaybackCallbacks callbacks;
    
    /**
     * @return True if the player is ready to go, false otherwise
     */
    private boolean isInitialized = false;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.service.MultiPlayer.Companion Companion = null;
    
    public MultiPlayer(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public com.caij.puremusic.service.playback.Playback.PlaybackCallbacks getCallbacks() {
        return null;
    }
    
    @java.lang.Override()
    public void setCallbacks(@org.jetbrains.annotations.Nullable()
    com.caij.puremusic.service.playback.Playback.PlaybackCallbacks p0) {
    }
    
    /**
     * @return True if the player is ready to go, false otherwise
     */
    @java.lang.Override()
    public boolean isInitialized() {
        return false;
    }
    
    /**
     * @param song The song object you want to play
     * @return True if the `player` has been prepared and is ready to play, false otherwise
     */
    @java.lang.Override()
    public void setDataSource(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> headers, boolean force, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> completion) {
    }
    
    /**
     * Starts or resumes playback.
     */
    @java.lang.Override()
    public boolean start() {
        return false;
    }
    
    /**
     * Resets the MediaPlayer to its uninitialized state.
     */
    @java.lang.Override()
    public void stop() {
    }
    
    /**
     * Releases resources associated with this MediaPlayer object.
     */
    @java.lang.Override()
    public void release() {
    }
    
    /**
     * Pauses playback. Call start() to resume.
     */
    @java.lang.Override()
    public boolean pause() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isPlaying() {
        return false;
    }
    
    /**
     * Gets the duration of the file.
     *
     * @return The duration in milliseconds
     */
    @java.lang.Override()
    public int duration() {
        return 0;
    }
    
    /**
     * Gets the current playback position.
     *
     * @return The current position in milliseconds
     */
    @java.lang.Override()
    public int position() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object audioFormat() {
        return null;
    }
    
    /**
     * Gets the current playback position.
     *
     * @param whereto The offset in milliseconds from the start to seek to
     * @return The offset in milliseconds from the start to seek to
     */
    @java.lang.Override()
    public int seek(int whereto) {
        return 0;
    }
    
    @java.lang.Override()
    public boolean setVolume(float vol) {
        return false;
    }
    
    /**
     * Sets the audio session ID.
     *
     * @param sessionId The audio session ID
     */
    @java.lang.Override()
    public boolean setAudioSessionId(int sessionId) {
        return false;
    }
    
    @java.lang.Override()
    public int getAudioSessionId() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean onError(@org.jetbrains.annotations.Nullable()
    com.caij.video.BaseMediaPlayer mp, int what, int extra) {
        return false;
    }
    
    @java.lang.Override()
    public void onCompletion(@org.jetbrains.annotations.NotNull()
    com.caij.video.BaseMediaPlayer mp) {
    }
    
    @java.lang.Override()
    public void setCrossFadeDuration(int duration) {
    }
    
    @java.lang.Override()
    public void setPlaybackSpeedPitch(float speed, float pitch) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/caij/puremusic/service/MultiPlayer$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "app_chinaDebug"})
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