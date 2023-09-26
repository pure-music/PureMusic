package com.caij.puremusic.service.playback;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0001/J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0001H&J\b\u0010\u0011\u001a\u00020\u0003H&J\b\u0010\u0012\u001a\u00020\u0003H&J\b\u0010\u0013\u001a\u00020\rH&J\b\u0010\u0014\u001a\u00020\u0003H&J\b\u0010\u0015\u001a\u00020\u0016H&J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003H&J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0003H&J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0003H&JQ\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001e2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e\u0018\u00010 2\u0006\u0010!\u001a\u00020\r2!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00160#H&J\u0018\u0010\'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)H&J\u0010\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020)H&J\b\u0010-\u001a\u00020\rH&J\b\u0010.\u001a\u00020\u0016H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u000e\u00a8\u00060"}, d2 = {"Lcom/caij/puremusic/service/playback/Playback;", "", "audioSessionId", "", "getAudioSessionId", "()I", "callbacks", "Lcom/caij/puremusic/service/playback/Playback$PlaybackCallbacks;", "getCallbacks", "()Lcom/caij/puremusic/service/playback/Playback$PlaybackCallbacks;", "setCallbacks", "(Lcom/caij/puremusic/service/playback/Playback$PlaybackCallbacks;)V", "isInitialized", "", "()Z", "isPlaying", "audioFormat", "bufferedPosition", "duration", "pause", "position", "release", "", "seek", "whereto", "setAudioSessionId", "sessionId", "setCrossFadeDuration", "setDataSource", "url", "", "headers", "", "force", "completion", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "success", "setPlaybackSpeedPitch", "speed", "", "pitch", "setVolume", "vol", "start", "stop", "PlaybackCallbacks", "app_chinaRelease"})
public abstract interface Playback {
    
    public abstract boolean isInitialized();
    
    public abstract boolean isPlaying();
    
    public abstract int getAudioSessionId();
    
    public abstract void setDataSource(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> headers, boolean force, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.caij.puremusic.service.playback.Playback.PlaybackCallbacks getCallbacks();
    
    public abstract void setCallbacks(@org.jetbrains.annotations.Nullable()
    com.caij.puremusic.service.playback.Playback.PlaybackCallbacks p0);
    
    public abstract boolean start();
    
    public abstract void stop();
    
    public abstract void release();
    
    public abstract boolean pause();
    
    public abstract int duration();
    
    public abstract int position();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object audioFormat();
    
    public abstract int seek(int whereto);
    
    public abstract boolean setVolume(float vol);
    
    public abstract boolean setAudioSessionId(int sessionId);
    
    public abstract void setCrossFadeDuration(int duration);
    
    public abstract void setPlaybackSpeedPitch(float speed, float pitch);
    
    public abstract int bufferedPosition();
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&\u00a8\u0006\n"}, d2 = {"Lcom/caij/puremusic/service/playback/Playback$PlaybackCallbacks;", "", "onPlayError", "", "what", "", "extra", "onPlayStateChanged", "onTrackEnded", "onTrackEndedWithCrossfade", "app_chinaRelease"})
    public static abstract interface PlaybackCallbacks {
        
        public abstract void onTrackEnded();
        
        public abstract void onTrackEndedWithCrossfade();
        
        public abstract void onPlayError(int what, int extra);
        
        public abstract void onPlayStateChanged();
    }
}