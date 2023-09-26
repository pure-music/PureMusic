package com.caij.puremusic.appwidgets;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/caij/puremusic/appwidgets/AppWidgetText;", "Lcom/caij/puremusic/appwidgets/base/BaseAppWidget;", "()V", "defaultAppWidget", "", "context", "Landroid/content/Context;", "appWidgetIds", "", "linkButtons", "views", "Landroid/widget/RemoteViews;", "performUpdate", "service", "Lcom/caij/puremusic/service/MusicService;", "Companion", "app_chinaDebug"})
public final class AppWidgetText extends com.caij.puremusic.appwidgets.base.BaseAppWidget {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NAME = "app_widget_text";
    @org.jetbrains.annotations.Nullable()
    private static com.caij.puremusic.appwidgets.AppWidgetText mInstance;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.appwidgets.AppWidgetText.Companion Companion = null;
    
    public AppWidgetText() {
        super();
    }
    
    @java.lang.Override()
    protected void defaultAppWidget(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    int[] appWidgetIds) {
    }
    
    /**
     * Link up various button actions using [PendingIntent].
     */
    private final void linkButtons(android.content.Context context, android.widget.RemoteViews views) {
    }
    
    @java.lang.Override()
    public void performUpdate(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.service.MusicService service, @org.jetbrains.annotations.Nullable()
    int[] appWidgetIds) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/caij/puremusic/appwidgets/AppWidgetText$Companion;", "", "()V", "NAME", "", "instance", "Lcom/caij/puremusic/appwidgets/AppWidgetText;", "getInstance", "()Lcom/caij/puremusic/appwidgets/AppWidgetText;", "mInstance", "app_chinaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.Synchronized()
        @org.jetbrains.annotations.NotNull()
        public final synchronized com.caij.puremusic.appwidgets.AppWidgetText getInstance() {
            return null;
        }
    }
}