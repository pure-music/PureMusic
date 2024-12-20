package com.caij.puremusic.appwidgets.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH$J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0004J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0004J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0016\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\bJ \u0010\u001c\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\"\u0010 \u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010!\u001a\u00020\"H\u0004\u00a8\u0006$"}, d2 = {"Lcom/caij/puremusic/appwidgets/base/BaseAppWidget;", "Landroid/appwidget/AppWidgetProvider;", "()V", "buildPendingIntent", "Landroid/app/PendingIntent;", "context", "Landroid/content/Context;", "action", "", "serviceName", "Landroid/content/ComponentName;", "defaultAppWidget", "", "appWidgetIds", "", "getAlbumArtDrawable", "Landroid/graphics/drawable/Drawable;", "bitmap", "Landroid/graphics/Bitmap;", "getSongArtistAndAlbum", "song", "Lcom/caij/puremusic/db/model/Song;", "hasInstances", "", "notifyChange", "service", "Lcom/caij/puremusic/service/MusicService;", "what", "onUpdate", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "performUpdate", "pushUpdate", "views", "Landroid/widget/RemoteViews;", "Companion", "app_chinaRelease"})
public abstract class BaseAppWidget extends android.appwidget.AppWidgetProvider {
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.appwidgets.base.BaseAppWidget.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NAME = "app_widget";
    
    public BaseAppWidget() {
        super();
    }
    
    /**
     * {@inheritDoc}
     */
    @java.lang.Override()
    public void onUpdate(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.appwidget.AppWidgetManager appWidgetManager, @org.jetbrains.annotations.NotNull()
    int[] appWidgetIds) {
    }
    
    /**
     * Handle a change notification coming over from [MusicService]
     */
    public final void notifyChange(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.service.MusicService service, @org.jetbrains.annotations.NotNull()
    java.lang.String what) {
    }
    
    protected final void pushUpdate(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    int[] appWidgetIds, @org.jetbrains.annotations.NotNull()
    android.widget.RemoteViews views) {
    }
    
    /**
     * Check against [AppWidgetManager] if there are any instances of this widget.
     */
    private final boolean hasInstances(android.content.Context context) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final android.app.PendingIntent buildPendingIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.NotNull()
    android.content.ComponentName serviceName) {
        return null;
    }
    
    protected abstract void defaultAppWidget(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    int[] appWidgetIds);
    
    public abstract void performUpdate(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.service.MusicService service, @org.jetbrains.annotations.Nullable()
    int[] appWidgetIds);
    
    @org.jetbrains.annotations.NotNull()
    protected final android.graphics.drawable.Drawable getAlbumArtDrawable(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap bitmap) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.lang.String getSongArtistAndAlbum(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song song) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J0\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0004JB\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/caij/puremusic/appwidgets/base/BaseAppWidget$Companion;", "", "()V", "NAME", "", "composeRoundedRectPath", "Landroid/graphics/Path;", "rect", "Landroid/graphics/RectF;", "tl", "", "tr", "bl", "br", "createRoundedBitmap", "Landroid/graphics/Bitmap;", "drawable", "Landroid/graphics/drawable/Drawable;", "width", "", "height", "app_chinaRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.graphics.Bitmap createRoundedBitmap(@org.jetbrains.annotations.Nullable()
        android.graphics.drawable.Drawable drawable, int width, int height, float tl, float tr, float bl, float br) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        protected final android.graphics.Path composeRoundedRectPath(@org.jetbrains.annotations.NotNull()
        android.graphics.RectF rect, float tl, float tr, float bl, float br) {
            return null;
        }
    }
}