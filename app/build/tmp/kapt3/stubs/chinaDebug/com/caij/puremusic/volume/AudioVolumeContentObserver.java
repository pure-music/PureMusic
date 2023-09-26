package com.caij.puremusic.volume;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\'\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/caij/puremusic/volume/AudioVolumeContentObserver;", "Landroid/database/ContentObserver;", "handler", "Landroid/os/Handler;", "audioManager", "Landroid/media/AudioManager;", "audioStreamType", "", "listener", "Lcom/caij/puremusic/volume/OnAudioVolumeChangedListener;", "(Landroid/os/Handler;Landroid/media/AudioManager;ILcom/caij/puremusic/volume/OnAudioVolumeChangedListener;)V", "mAudioManager", "mAudioStreamType", "mLastVolume", "", "mListener", "onChange", "", "selfChange", "", "uri", "Landroid/net/Uri;", "app_chinaDebug"})
public final class AudioVolumeContentObserver extends android.database.ContentObserver {
    @org.jetbrains.annotations.Nullable()
    private final com.caij.puremusic.volume.OnAudioVolumeChangedListener mListener = null;
    @org.jetbrains.annotations.Nullable()
    private final android.media.AudioManager mAudioManager = null;
    private final int mAudioStreamType = 0;
    private float mLastVolume;
    
    public AudioVolumeContentObserver(@org.jetbrains.annotations.NotNull()
    android.os.Handler handler, @org.jetbrains.annotations.NotNull()
    android.media.AudioManager audioManager, int audioStreamType, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.volume.OnAudioVolumeChangedListener listener) {
        super(null);
    }
    
    /**
     * Depending on the handler this method may be executed on the UI thread
     */
    @java.lang.Override()
    public void onChange(boolean selfChange, @org.jetbrains.annotations.Nullable()
    android.net.Uri uri) {
    }
}