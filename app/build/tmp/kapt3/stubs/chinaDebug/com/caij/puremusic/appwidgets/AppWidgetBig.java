package com.caij.puremusic.appwidgets;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u001a\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/caij/puremusic/appwidgets/AppWidgetBig;", "Lcom/caij/puremusic/appwidgets/base/BaseAppWidget;", "()V", "target", "Lcom/bumptech/glide/request/target/Target;", "Landroid/graphics/Bitmap;", "defaultAppWidget", "", "context", "Landroid/content/Context;", "appWidgetIds", "", "linkButtons", "views", "Landroid/widget/RemoteViews;", "performUpdate", "service", "Lcom/caij/puremusic/service/MusicService;", "Companion", "app_chinaDebug"})
public final class AppWidgetBig extends com.caij.puremusic.appwidgets.base.BaseAppWidget {
    @org.jetbrains.annotations.Nullable()
    private com.bumptech.glide.request.target.Target<android.graphics.Bitmap> target;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NAME = "app_widget_big";
    @org.jetbrains.annotations.Nullable()
    private static com.caij.puremusic.appwidgets.AppWidgetBig mInstance;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.appwidgets.AppWidgetBig.Companion Companion = null;
    
    public AppWidgetBig() {
        super();
    }
    
    /**
     * Initialize given widgets to default state, where we launch Music on default click and hide
     * actions if service not running.
     */
    @java.lang.Override()
    protected void defaultAppWidget(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    int[] appWidgetIds) {
    }
    
    /**
     * Update all active widget instances by pushing changes
     */
    @java.lang.Override()
    public void performUpdate(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.service.MusicService service, @org.jetbrains.annotations.Nullable()
    int[] appWidgetIds) {
    }
    
    /**
     * Link up various button actions using [PendingIntent].
     */
    private final void linkButtons(android.content.Context context, android.widget.RemoteViews views) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/caij/puremusic/appwidgets/AppWidgetBig$Companion;", "", "()V", "NAME", "", "instance", "Lcom/caij/puremusic/appwidgets/AppWidgetBig;", "getInstance", "()Lcom/caij/puremusic/appwidgets/AppWidgetBig;", "mInstance", "app_chinaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.Synchronized()
        @org.jetbrains.annotations.NotNull()
        public final synchronized com.caij.puremusic.appwidgets.AppWidgetBig getInstance() {
            return null;
        }
    }
}