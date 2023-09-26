package com.caij.puremusic.service.notification;

import java.lang.System;

/**
 * @author Hemanth S (h4h13).
 */
@android.annotation.SuppressLint(value = {"RestrictedApi"})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0010H\u0002J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u0012H\u0016J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0012H\u0016J\u001e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190 H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/caij/puremusic/service/notification/PlayingNotificationClassic;", "Lcom/caij/puremusic/service/notification/PlayingNotification;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "primaryColor", "", "buildPendingIntent", "Landroid/app/PendingIntent;", "action", "", "serviceName", "Landroid/content/ComponentName;", "getCombinedRemoteViews", "Landroid/widget/RemoteViews;", "collapsed", "", "song", "Lcom/caij/puremusic/db/model/Song;", "getPlayPauseBitmap", "Landroid/graphics/Bitmap;", "isPlaying", "linkButtons", "", "notificationLayout", "setPlaying", "updateFavorite", "isFavorite", "updateMetadata", "onUpdate", "Lkotlin/Function0;", "Companion", "app_chinaRelease"})
public final class PlayingNotificationClassic extends com.caij.puremusic.service.notification.PlayingNotification {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private int primaryColor = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.service.notification.PlayingNotificationClassic.Companion Companion = null;
    
    public PlayingNotificationClassic(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    private final android.widget.RemoteViews getCombinedRemoteViews(boolean collapsed, com.caij.puremusic.db.model.Song song) {
        return null;
    }
    
    @java.lang.Override()
    public void updateMetadata(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song song, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onUpdate) {
    }
    
    private final android.graphics.Bitmap getPlayPauseBitmap(boolean isPlaying) {
        return null;
    }
    
    @java.lang.Override()
    public void setPlaying(boolean isPlaying) {
    }
    
    @java.lang.Override()
    public void updateFavorite(boolean isFavorite) {
    }
    
    private final android.app.PendingIntent buildPendingIntent(android.content.Context context, java.lang.String action, android.content.ComponentName serviceName) {
        return null;
    }
    
    private final void linkButtons(android.widget.RemoteViews notificationLayout) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/caij/puremusic/service/notification/PlayingNotificationClassic$Companion;", "", "()V", "from", "Lcom/caij/puremusic/service/notification/PlayingNotification;", "context", "Landroid/content/Context;", "notificationManager", "Landroid/app/NotificationManager;", "app_chinaRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.service.notification.PlayingNotification from(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.app.NotificationManager notificationManager) {
            return null;
        }
    }
}