package com.caij.puremusic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/caij/puremusic/VipUIConfig;", "Lcom/caij/vip/InitConfig$Provider;", "accentColor", "", "pageBackgroundColor", "titleTextColor", "sub1TextColor", "(IIII)V", "context", "Landroid/content/Context;", "getWXAppId", "", "okHttpClient", "Lokhttp3/OkHttpClient$Builder;", "versionCode", "app_chinaRelease"})
public final class VipUIConfig implements com.caij.vip.InitConfig.Provider {
    private final int accentColor = 0;
    private final int pageBackgroundColor = 0;
    private final int titleTextColor = 0;
    private final int sub1TextColor = 0;
    
    public VipUIConfig(int accentColor, int pageBackgroundColor, int titleTextColor, int sub1TextColor) {
        super();
    }
    
    @java.lang.Override()
    public int accentColor(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    @java.lang.Override()
    public int versionCode() {
        return 0;
    }
    
    @java.lang.Override()
    public int pageBackgroundColor(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    @java.lang.Override()
    public int titleTextColor(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    @java.lang.Override()
    public int sub1TextColor(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getWXAppId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public okhttp3.OkHttpClient.Builder okHttpClient() {
        return null;
    }
}