package com.caij.puremusic.volume;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\nR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/caij/puremusic/volume/AudioVolumeObserver;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "contentObserver", "Lcom/caij/puremusic/volume/AudioVolumeContentObserver;", "mAudioManager", "Landroid/media/AudioManager;", "register", "", "audioStreamType", "", "listener", "Lcom/caij/puremusic/volume/OnAudioVolumeChangedListener;", "unregister", "app_chinaRelease"})
public final class AudioVolumeObserver {
    private final android.content.Context context = null;
    private final android.media.AudioManager mAudioManager = null;
    private com.caij.puremusic.volume.AudioVolumeContentObserver contentObserver;
    
    public AudioVolumeObserver(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public final void register(int audioStreamType, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.volume.OnAudioVolumeChangedListener listener) {
    }
    
    public final void unregister() {
    }
}