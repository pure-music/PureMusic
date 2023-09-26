package com.caij.puremusic.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u001a\u001e\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b\u001a\u001e\u0010\n\u001a\u00020\u000b*\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b\u001a\u001c\u0010\n\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\r\u001a\u00020\b\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003\u00a8\u0006\u0010"}, d2 = {"isLandscape", "", "Landroid/content/Context;", "(Landroid/content/Context;)Z", "isTablet", "getTintedDrawable", "Landroid/graphics/drawable/Drawable;", "id", "", "color", "showToast", "", "stringRes", "duration", "message", "", "app_chinaRelease"})
public final class ContextExtensionsKt {
    
    public static final void showToast(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$showToast, @androidx.annotation.StringRes()
    int stringRes, int duration) {
    }
    
    public static final void showToast(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$showToast, @org.jetbrains.annotations.NotNull()
    java.lang.String message, int duration) {
    }
    
    public static final boolean isLandscape(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$isLandscape) {
        return false;
    }
    
    public static final boolean isTablet(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$isTablet) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.graphics.drawable.Drawable getTintedDrawable(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getTintedDrawable, @androidx.annotation.DrawableRes()
    int id, @androidx.annotation.ColorInt()
    int color) {
        return null;
    }
}