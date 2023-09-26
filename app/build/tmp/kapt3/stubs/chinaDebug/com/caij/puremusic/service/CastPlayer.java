package com.caij.puremusic.service;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H\u0016J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0004H\u0016J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0004H\u0016JQ\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 2\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 \u0018\u00010\"2\u0006\u0010#\u001a\u00020\u000e2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b&\u0012\b\b\'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00180%H\u0016J\u0018\u0010)\u001a\u00020\u00182\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0016J\u0010\u0010-\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020+H\u0016J\b\u0010/\u001a\u00020\u000eH\u0016J\b\u00100\u001a\u00020\u0018H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000f\u00a8\u00061"}, d2 = {"Lcom/caij/puremusic/service/CastPlayer;", "Lcom/caij/puremusic/service/playback/Playback;", "()V", "audioSessionId", "", "getAudioSessionId", "()I", "callbacks", "Lcom/caij/puremusic/service/playback/Playback$PlaybackCallbacks;", "getCallbacks", "()Lcom/caij/puremusic/service/playback/Playback$PlaybackCallbacks;", "setCallbacks", "(Lcom/caij/puremusic/service/playback/Playback$PlaybackCallbacks;)V", "isInitialized", "", "()Z", "isPlaying", "audioFormat", "", "bufferedPosition", "duration", "pause", "position", "release", "", "seek", "whereto", "setAudioSessionId", "sessionId", "setCrossFadeDuration", "setDataSource", "url", "", "headers", "", "force", "completion", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "success", "setPlaybackSpeedPitch", "speed", "", "pitch", "setVolume", "vol", "start", "stop", "app_chinaDebug"})
public final class CastPlayer implements com.caij.puremusic.service.playback.Playback {
    @org.jetbrains.annotations.Nullable()
    private com.caij.puremusic.service.playback.Playback.PlaybackCallbacks callbacks;
    
    public CastPlayer() {
        super();
    }
    
    @java.lang.Override()
    public boolean isInitialized() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isPlaying() {
        return false;
    }
    
    @java.lang.Override()
    public int getAudioSessionId() {
        return 0;
    }
    
    @java.lang.Override()
    public void setDataSource(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> headers, boolean force, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> completion) {
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
    
    @java.lang.Override()
    public boolean start() {
        return false;
    }
    
    @java.lang.Override()
    public void stop() {
    }
    
    @java.lang.Override()
    public void release() {
    }
    
    @java.lang.Override()
    public boolean pause() {
        return false;
    }
    
    @java.lang.Override()
    public int duration() {
        return 0;
    }
    
    @java.lang.Override()
    public int position() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object audioFormat() {
        return null;
    }
    
    @java.lang.Override()
    public int seek(int whereto) {
        return 0;
    }
    
    @java.lang.Override()
    public boolean setVolume(float vol) {
        return false;
    }
    
    @java.lang.Override()
    public boolean setAudioSessionId(int sessionId) {
        return false;
    }
    
    @java.lang.Override()
    public void setCrossFadeDuration(int duration) {
    }
    
    @java.lang.Override()
    public void setPlaybackSpeedPitch(float speed, float pitch) {
    }
    
    @java.lang.Override()
    public int bufferedPosition() {
        return 0;
    }
}