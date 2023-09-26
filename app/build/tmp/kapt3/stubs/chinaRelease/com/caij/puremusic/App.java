package com.caij.puremusic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/caij/puremusic/App;", "Landroid/app/Application;", "()V", "wallpaperAccentManager", "Lcom/caij/puremusic/helper/WallpaperAccentManager;", "onCreate", "", "onTerminate", "Companion", "app_chinaRelease"})
public final class App extends android.app.Application {
    private final com.caij.puremusic.helper.WallpaperAccentManager wallpaperAccentManager = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.App.Companion Companion = null;
    private static com.caij.puremusic.App instance;
    
    public App() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public void onTerminate() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/caij/puremusic/App$Companion;", "", "()V", "instance", "Lcom/caij/puremusic/App;", "getContext", "isAllowedCollectImage", "", "isAllowedPlayDrive", "isProVersion", "app_chinaRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.App getContext() {
            return null;
        }
        
        public final boolean isProVersion() {
            return false;
        }
        
        public final boolean isAllowedPlayDrive() {
            return false;
        }
        
        public final boolean isAllowedCollectImage() {
            return false;
        }
    }
}