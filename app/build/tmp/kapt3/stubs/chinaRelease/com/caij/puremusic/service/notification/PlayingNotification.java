package com.caij.puremusic.service.notification;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH&J\u001e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH&\u00a8\u0006\u0011"}, d2 = {"Lcom/caij/puremusic/service/notification/PlayingNotification;", "Landroidx/core/app/NotificationCompat$Builder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "setPlaying", "", "isPlaying", "", "updateFavorite", "isFavorite", "updateMetadata", "song", "Lcom/caij/puremusic/db/model/Song;", "onUpdate", "Lkotlin/Function0;", "Companion", "app_chinaRelease"})
public abstract class PlayingNotification extends androidx.core.app.NotificationCompat.Builder {
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.service.notification.PlayingNotification.Companion Companion = null;
    public static final float NOTIFICATION_CONTROLS_SIZE_MULTIPLIER = 1.0F;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NOTIFICATION_CHANNEL_ID = "playing_notification";
    public static final int NOTIFICATION_ID = 1;
    
    /**
     * Flyme 状态栏歌词 TICKER 一直显示
     */
    public static final int FLAG_ALWAYS_SHOW_TICKER = 16777216;
    
    /**
     * 只更新 Flyme 状态栏歌词，不更新封面等
     */
    public static final int FLAG_ONLY_UPDATE_TICKER = 33554432;
    
    public PlayingNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null, null);
    }
    
    public abstract void updateMetadata(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song song, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onUpdate);
    
    public abstract void setPlaying(boolean isPlaying);
    
    public abstract void updateFavorite(boolean isFavorite);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/caij/puremusic/service/notification/PlayingNotification$Companion;", "", "()V", "FLAG_ALWAYS_SHOW_TICKER", "", "FLAG_ONLY_UPDATE_TICKER", "NOTIFICATION_CHANNEL_ID", "", "NOTIFICATION_CONTROLS_SIZE_MULTIPLIER", "", "NOTIFICATION_ID", "createNotificationChannel", "", "context", "Landroid/content/Context;", "notificationManager", "Landroid/app/NotificationManager;", "app_chinaRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @androidx.annotation.RequiresApi(value = 26)
        public final void createNotificationChannel(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.app.NotificationManager notificationManager) {
        }
    }
}