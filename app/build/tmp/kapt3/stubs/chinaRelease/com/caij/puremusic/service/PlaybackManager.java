package com.caij.puremusic.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u0015H\u0002J\b\u0010#\u001a\u00020!H\u0002J\u001c\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00112\f\u0010&\u001a\b\u0012\u0004\u0012\u00020!0\'J\u0014\u0010(\u001a\u00020!2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020!0\'J\u0006\u0010*\u001a\u00020!J\u000e\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\tJ\u000e\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020/JO\u00100\u001a\u00020!2\u0006\u00101\u001a\u0002022\u0014\u00103\u001a\u0010\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000202\u0018\u0001042\u0006\u0010%\u001a\u00020\u00112!\u00105\u001a\u001d\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(9\u0012\u0004\u0012\u00020!06J\u0016\u0010:\u001a\u00020!2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020<J>\u0010>\u001a\u00020!26\u0010?\u001a2\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(A\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(B\u0012\u0004\u0012\u00020!0@JH\u0010C\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u001526\u0010?\u001a2\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(A\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(B\u0012\u0004\u0012\u00020!0@H\u0002JF\u0010D\u001a\u00020!2\u0006\u0010E\u001a\u00020F26\u0010?\u001a2\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(A\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(B\u0012\u0004\u0012\u00020!0@R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00018F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001c\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u000bR\u0011\u0010\u001e\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u000b\u00a8\u0006G"}, d2 = {"Lcom/caij/puremusic/service/PlaybackManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "audioFormat", "getAudioFormat", "()Ljava/lang/Object;", "audioSessionId", "", "getAudioSessionId", "()I", "bufferedPosition", "getBufferedPosition", "getContext", "()Landroid/content/Context;", "isLocalPlayback", "", "()Z", "isPlaying", "playback", "Lcom/caij/puremusic/service/playback/Playback;", "getPlayback", "()Lcom/caij/puremusic/service/playback/Playback;", "setPlayback", "(Lcom/caij/puremusic/service/playback/Playback;)V", "playbackLocation", "Lcom/caij/puremusic/service/PlaybackLocation;", "songDurationMillis", "getSongDurationMillis", "songProgressMillis", "getSongProgressMillis", "closeAudioEffectSession", "", "createLocalPlayback", "openAudioEffectSession", "pause", "force", "onPause", "Lkotlin/Function0;", "play", "onNotInitialized", "release", "seek", "millis", "setCallbacks", "callbacks", "Lcom/caij/puremusic/service/playback/Playback$PlaybackCallbacks;", "setDataSource", "url", "", "headers", "", "completion", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "success", "setPlaybackSpeedPitch", "playbackSpeed", "", "playbackPitch", "switchToLocalPlayback", "onChange", "Lkotlin/Function2;", "wasPlaying", "progress", "switchToPlayback", "switchToRemotePlayback", "castPlayer", "Lcom/caij/puremusic/service/CastPlayer;", "app_chinaRelease"})
public final class PlaybackManager {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.Nullable()
    private com.caij.puremusic.service.playback.Playback playback;
    private com.caij.puremusic.service.PlaybackLocation playbackLocation = com.caij.puremusic.service.PlaybackLocation.LOCAL;
    
    public PlaybackManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.caij.puremusic.service.playback.Playback getPlayback() {
        return null;
    }
    
    public final void setPlayback(@org.jetbrains.annotations.Nullable()
    com.caij.puremusic.service.playback.Playback p0) {
    }
    
    public final boolean isLocalPlayback() {
        return false;
    }
    
    public final int getAudioSessionId() {
        return 0;
    }
    
    public final int getSongDurationMillis() {
        return 0;
    }
    
    public final int getSongProgressMillis() {
        return 0;
    }
    
    public final int getBufferedPosition() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAudioFormat() {
        return null;
    }
    
    public final boolean isPlaying() {
        return false;
    }
    
    public final void setCallbacks(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.service.playback.Playback.PlaybackCallbacks callbacks) {
    }
    
    public final void play(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onNotInitialized) {
    }
    
    public final void pause(boolean force, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onPause) {
    }
    
    public final int seek(int millis) {
        return 0;
    }
    
    public final void setDataSource(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> headers, boolean force, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> completion) {
    }
    
    public final void release() {
    }
    
    private final void openAudioEffectSession() {
    }
    
    private final void closeAudioEffectSession() {
    }
    
    public final void switchToLocalPlayback(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Integer, kotlin.Unit> onChange) {
    }
    
    public final void switchToRemotePlayback(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.service.CastPlayer castPlayer, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Integer, kotlin.Unit> onChange) {
    }
    
    private final void switchToPlayback(com.caij.puremusic.service.playback.Playback playback, kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Integer, kotlin.Unit> onChange) {
    }
    
    private final com.caij.puremusic.service.playback.Playback createLocalPlayback() {
        return null;
    }
    
    public final void setPlaybackSpeedPitch(float playbackSpeed, float playbackPitch) {
    }
}