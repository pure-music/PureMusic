package com.caij.puremusic.service.notification;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\fH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u001aH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u001c"}, d2 = {"Lcom/caij/puremusic/service/notification/PlayingNotificationImpl24;", "Lcom/caij/puremusic/service/notification/PlayingNotification;", "context", "Lcom/caij/puremusic/service/MusicService;", "mediaSessionToken", "Landroid/support/v4/media/session/MediaSessionCompat$Token;", "(Lcom/caij/puremusic/service/MusicService;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V", "getContext", "()Lcom/caij/puremusic/service/MusicService;", "buildFavoriteAction", "Landroidx/core/app/NotificationCompat$Action;", "isFavorite", "", "buildPlayAction", "isPlaying", "retrievePlaybackAction", "Landroid/app/PendingIntent;", "action", "", "setPlaying", "", "updateFavorite", "updateMetadata", "song", "Lcom/caij/puremusic/db/model/Song;", "onUpdate", "Lkotlin/Function0;", "Companion", "app_chinaDebug"})
@android.annotation.SuppressLint(value = {"RestrictedApi"})
public final class PlayingNotificationImpl24 extends com.caij.puremusic.service.notification.PlayingNotification {
    @org.jetbrains.annotations.NotNull()
    private final com.caij.puremusic.service.MusicService context = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.service.notification.PlayingNotificationImpl24.Companion Companion = null;
    
    public PlayingNotificationImpl24(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.service.MusicService context, @org.jetbrains.annotations.NotNull()
    android.support.v4.media.session.MediaSessionCompat.Token mediaSessionToken) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.caij.puremusic.service.MusicService getContext() {
        return null;
    }
    
    @java.lang.Override()
    public void updateMetadata(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song song, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onUpdate) {
    }
    
    private final androidx.core.app.NotificationCompat.Action buildPlayAction(boolean isPlaying) {
        return null;
    }
    
    private final androidx.core.app.NotificationCompat.Action buildFavoriteAction(boolean isFavorite) {
        return null;
    }
    
    @java.lang.Override()
    public void setPlaying(boolean isPlaying) {
    }
    
    @java.lang.Override()
    public void updateFavorite(boolean isFavorite) {
    }
    
    private final android.app.PendingIntent retrievePlaybackAction(java.lang.String action) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lcom/caij/puremusic/service/notification/PlayingNotificationImpl24$Companion;", "", "()V", "from", "Lcom/caij/puremusic/service/notification/PlayingNotification;", "context", "Lcom/caij/puremusic/service/MusicService;", "notificationManager", "Landroid/app/NotificationManager;", "mediaSession", "Landroid/support/v4/media/session/MediaSessionCompat;", "app_chinaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.service.notification.PlayingNotification from(@org.jetbrains.annotations.NotNull()
        com.caij.puremusic.service.MusicService context, @org.jetbrains.annotations.NotNull()
        android.app.NotificationManager notificationManager, @org.jetbrains.annotations.NotNull()
        android.support.v4.media.session.MediaSessionCompat mediaSession) {
            return null;
        }
    }
}