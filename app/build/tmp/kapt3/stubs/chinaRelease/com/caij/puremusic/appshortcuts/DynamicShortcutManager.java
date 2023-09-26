package com.caij.puremusic.appshortcuts;

import java.lang.System;

@android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.N_MR1)
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/caij/puremusic/appshortcuts/DynamicShortcutManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "defaultShortcuts", "", "Landroid/content/pm/ShortcutInfo;", "getDefaultShortcuts", "()Ljava/util/List;", "shortcutManager", "Landroid/content/pm/ShortcutManager;", "initDynamicShortcuts", "", "updateDynamicShortcuts", "Companion", "app_chinaRelease"})
public final class DynamicShortcutManager {
    private final android.content.Context context = null;
    private final android.content.pm.ShortcutManager shortcutManager = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.appshortcuts.DynamicShortcutManager.Companion Companion = null;
    
    public DynamicShortcutManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    private final java.util.List<android.content.pm.ShortcutInfo> getDefaultShortcuts() {
        return null;
    }
    
    public final void initDynamicShortcuts() {
    }
    
    public final void updateDynamicShortcuts() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\b\u00a8\u0006\u0012"}, d2 = {"Lcom/caij/puremusic/appshortcuts/DynamicShortcutManager$Companion;", "", "()V", "createShortcut", "Landroid/content/pm/ShortcutInfo;", "context", "Landroid/content/Context;", "id", "", "shortLabel", "longLabel", "icon", "Landroid/graphics/drawable/Icon;", "intent", "Landroid/content/Intent;", "reportShortcutUsed", "", "shortcutId", "app_chinaRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.pm.ShortcutInfo createShortcut(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String shortLabel, @org.jetbrains.annotations.NotNull()
        java.lang.String longLabel, @org.jetbrains.annotations.NotNull()
        android.graphics.drawable.Icon icon, @org.jetbrains.annotations.NotNull()
        android.content.Intent intent) {
            return null;
        }
        
        public final void reportShortcutUsed(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String shortcutId) {
        }
    }
}