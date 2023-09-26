package com.caij.puremusic.service;

import java.lang.System;

/**
 * Used to control headset playback.
 * Single press: pause/resume
 * Double press: actionNext track
 * Triple press: previous track
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\n"}, d2 = {"Lcom/caij/puremusic/service/MediaButtonIntentReceiver;", "Landroidx/media/session/MediaButtonReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "app_chinaRelease"})
public final class MediaButtonIntentReceiver extends androidx.media.session.MediaButtonReceiver {
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.service.MediaButtonIntentReceiver.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = null;
    private static final boolean DEBUG = com.caij.puremusic.BuildConfig.DEBUG;
    private static final int MSG_HEADSET_DOUBLE_CLICK_TIMEOUT = 2;
    private static final int DOUBLE_CLICK = 400;
    private static android.os.PowerManager.WakeLock wakeLock;
    private static int mClickCounter = 0;
    private static long mLastClickTime = 0L;
    private static final android.os.Handler mHandler = null;
    
    public MediaButtonIntentReceiver() {
        super();
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0010H\u0002J\u0016\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u0015H\u0002J\u001a\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010 \u001a\u0004\u0018\u00010\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0018\u00010\u0012R\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/caij/puremusic/service/MediaButtonIntentReceiver$Companion;", "", "()V", "DEBUG", "", "DOUBLE_CLICK", "", "MSG_HEADSET_DOUBLE_CLICK_TIMEOUT", "TAG", "", "getTAG", "()Ljava/lang/String;", "mClickCounter", "mHandler", "Landroid/os/Handler;", "mLastClickTime", "", "wakeLock", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "acquireWakeLockAndSendMessage", "", "context", "Landroid/content/Context;", "msg", "Landroid/os/Message;", "delay", "handleIntent", "intent", "Landroid/content/Intent;", "releaseWakeLockIfHandlerIdle", "startService", "command", "app_chinaRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG() {
            return null;
        }
        
        public final boolean handleIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.content.Intent intent) {
            return false;
        }
        
        private final void startService(android.content.Context context, java.lang.String command) {
        }
        
        private final void acquireWakeLockAndSendMessage(android.content.Context context, android.os.Message msg, long delay) {
        }
        
        private final void releaseWakeLockIfHandlerIdle() {
        }
    }
}