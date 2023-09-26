package com.caij.puremusic.views;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u001c\u001a\u00020\u001dR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00128F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006\u001f"}, d2 = {"Lcom/caij/puremusic/views/TopAppBarLayout;", "Lcom/google/android/material/appbar/AppBarLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "collapsingAppbarBinding", "Lcom/caij/puremusic/databinding/CollapsingAppbarLayoutBinding;", "mode", "Lcom/caij/puremusic/views/TopAppBarLayout$AppBarMode;", "getMode", "()Lcom/caij/puremusic/views/TopAppBarLayout$AppBarMode;", "simpleAppbarBinding", "Lcom/caij/puremusic/databinding/SimpleAppbarLayoutBinding;", "value", "", "title", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "getToolbar", "()Landroidx/appcompat/widget/Toolbar;", "pinWhenScrolled", "", "AppBarMode", "app_chinaDebug"})
public final class TopAppBarLayout extends com.google.android.material.appbar.AppBarLayout {
    @org.jetbrains.annotations.Nullable()
    private com.caij.puremusic.databinding.SimpleAppbarLayoutBinding simpleAppbarBinding;
    @org.jetbrains.annotations.Nullable()
    private com.caij.puremusic.databinding.CollapsingAppbarLayoutBinding collapsingAppbarBinding;
    @org.jetbrains.annotations.NotNull()
    private final com.caij.puremusic.views.TopAppBarLayout.AppBarMode mode = null;
    
    @kotlin.jvm.JvmOverloads()
    public TopAppBarLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.caij.puremusic.views.TopAppBarLayout.AppBarMode getMode() {
        return null;
    }
    
    public final void pinWhenScrolled() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.Toolbar getToolbar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @kotlin.jvm.JvmOverloads()
    public TopAppBarLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public TopAppBarLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/caij/puremusic/views/TopAppBarLayout$AppBarMode;", "", "(Ljava/lang/String;I)V", "COLLAPSING", "SIMPLE", "app_chinaDebug"})
    public static enum AppBarMode {
        /*public static final*/ COLLAPSING /* = new COLLAPSING() */,
        /*public static final*/ SIMPLE /* = new SIMPLE() */;
        
        AppBarMode() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.caij.puremusic.views.TopAppBarLayout.AppBarMode> getEntries() {
            return null;
        }
    }
}