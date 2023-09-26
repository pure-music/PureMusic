package com.caij.puremusic.helper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u0000 *2\u00020\u0001:\u0001*B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0006\u0010\u0013\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0018\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0007H\u0002J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001a\u001a\u00020\u0017H\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010 \u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010!\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J8\u0010#\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J8\u0010\'\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010(\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010)\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006+"}, d2 = {"Lcom/caij/puremusic/helper/UpdateHelper;", "", "context", "Landroid/app/Application;", "version", "", "channel", "", "isVip", "", "isHard", "(Landroid/app/Application;ILjava/lang/String;ZZ)V", "()Z", "getVersion", "()I", "acceptVersionResponse", "", "updateInfo", "Lcom/caij/puremusic/model/UpdateInfo;", "checkUpdate", "checkUpdateLimit", "formatDate", "createTime", "", "format", "formatFileSize", "size", "getDesc", "Landroid/text/SpannableStringBuilder;", "activity", "Landroid/content/Context;", "getTitle", "isCanIgnore", "isForcedUpgrade", "noUpdate", "showDefaultDialog", "title", "desc", "packageName", "showGoogleDialog", "toDown", "update", "Companion", "app_chinaRelease"})
public class UpdateHelper {
    private final android.app.Application context = null;
    private final int version = 0;
    private final java.lang.String channel = null;
    private final boolean isVip = false;
    private final boolean isHard = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.helper.UpdateHelper.Companion Companion = null;
    private static final java.lang.String TAG = "UpdateHelper";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String UPDATE_FILE = "update_file";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String UPDATE_TIME_KEY = "update_time_key";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String IGNORE_UPDATE_VERSION = "ignore_update_version";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String GOOGLE_APP_STORE_APPID = "com.android.vending";
    private static final java.lang.String KEY_LOAD_TIEMTRAM = "load_data_server_time";
    private static final long UPDATE_TIME_INVAL = 1800000L;
    private static final long CHECK_TIME_LIFE = 18000000L;
    
    public UpdateHelper(@org.jetbrains.annotations.NotNull()
    android.app.Application context, int version, @org.jetbrains.annotations.NotNull()
    java.lang.String channel, boolean isVip, boolean isHard) {
        super();
    }
    
    public final int getVersion() {
        return 0;
    }
    
    public final boolean isHard() {
        return false;
    }
    
    public final void checkUpdateLimit() {
    }
    
    public final void checkUpdate() {
    }
    
    private final void acceptVersionResponse(com.caij.puremusic.model.UpdateInfo updateInfo) {
    }
    
    private final void noUpdate(com.caij.puremusic.model.UpdateInfo updateInfo) {
    }
    
    protected void update(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.model.UpdateInfo updateInfo) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public android.text.SpannableStringBuilder getDesc(@org.jetbrains.annotations.NotNull()
    android.content.Context activity, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.model.UpdateInfo updateInfo) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String formatFileSize(long size) {
        return null;
    }
    
    private final java.lang.String formatDate(long createTime, java.lang.String format) {
        return null;
    }
    
    private final java.lang.String getTitle(android.content.Context context, com.caij.puremusic.model.UpdateInfo updateInfo) {
        return null;
    }
    
    private final boolean isForcedUpgrade(com.caij.puremusic.model.UpdateInfo updateInfo) {
        return false;
    }
    
    private final void showDefaultDialog(android.content.Context context, java.lang.String title, android.text.SpannableStringBuilder desc, java.lang.String packageName, com.caij.puremusic.model.UpdateInfo updateInfo, java.lang.String channel) {
    }
    
    private final void toDown(com.caij.puremusic.model.UpdateInfo updateInfo) {
    }
    
    private final void showGoogleDialog(android.content.Context context, java.lang.String title, android.text.SpannableStringBuilder desc, java.lang.String packageName, com.caij.puremusic.model.UpdateInfo updateInfo, java.lang.String channel) {
    }
    
    private final boolean isCanIgnore(com.caij.puremusic.model.UpdateInfo updateInfo) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0006H\u0002J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u001e\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u000e\u0010\u000e\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\n\u00a8\u0006$"}, d2 = {"Lcom/caij/puremusic/helper/UpdateHelper$Companion;", "", "()V", "CHECK_TIME_LIFE", "", "GOOGLE_APP_STORE_APPID", "", "getGOOGLE_APP_STORE_APPID", "()Ljava/lang/String;", "setGOOGLE_APP_STORE_APPID", "(Ljava/lang/String;)V", "IGNORE_UPDATE_VERSION", "getIGNORE_UPDATE_VERSION", "setIGNORE_UPDATE_VERSION", "KEY_LOAD_TIEMTRAM", "TAG", "UPDATE_FILE", "getUPDATE_FILE", "setUPDATE_FILE", "UPDATE_TIME_INVAL", "UPDATE_TIME_KEY", "getUPDATE_TIME_KEY", "setUPDATE_TIME_KEY", "checkUpdateTime", "", "context", "Landroid/content/Context;", "saveIgnoreUpdateVersion", "", "versionName", "saveNextCheckUpdateTime", "toAppStore", "activity", "Landroid/app/Activity;", "packageName", "channel", "app_chinaRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUPDATE_FILE() {
            return null;
        }
        
        public final void setUPDATE_FILE(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUPDATE_TIME_KEY() {
            return null;
        }
        
        public final void setUPDATE_TIME_KEY(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getIGNORE_UPDATE_VERSION() {
            return null;
        }
        
        public final void setIGNORE_UPDATE_VERSION(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getGOOGLE_APP_STORE_APPID() {
            return null;
        }
        
        public final void setGOOGLE_APP_STORE_APPID(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        private final void saveNextCheckUpdateTime(android.content.Context context) {
        }
        
        private final void saveIgnoreUpdateVersion(android.content.Context context, java.lang.String versionName) {
        }
        
        public final void toAppStore(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity, @org.jetbrains.annotations.NotNull()
        java.lang.String packageName, @org.jetbrains.annotations.NotNull()
        java.lang.String channel) {
        }
        
        public final boolean checkUpdateTime(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return false;
        }
    }
}