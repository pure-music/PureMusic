package com.caij.puremusic.util;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/caij/puremusic/util/ViewUtil;", "", "()V", "RETRO_MUSIC_ANIM_TIME", "", "convertDpToPixel", "", "dp", "resources", "Landroid/content/res/Resources;", "hitTest", "", "v", "Landroid/view/View;", "x", "y", "setProgressDrawable", "", "progressSlider", "Landroid/widget/ProgressBar;", "newColor", "Landroid/widget/SeekBar;", "thumbTint", "app_chinaDebug"})
public final class ViewUtil {
    public static final int RETRO_MUSIC_ANIM_TIME = 1000;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.util.ViewUtil INSTANCE = null;
    
    private ViewUtil() {
        super();
    }
    
    public final void setProgressDrawable(@org.jetbrains.annotations.NotNull()
    android.widget.SeekBar progressSlider, int newColor, boolean thumbTint) {
    }
    
    public final void setProgressDrawable(@org.jetbrains.annotations.NotNull()
    android.widget.ProgressBar progressSlider, int newColor) {
    }
    
    public final boolean hitTest(@org.jetbrains.annotations.NotNull()
    android.view.View v, int x, int y) {
        return false;
    }
    
    public final float convertDpToPixel(float dp, @org.jetbrains.annotations.NotNull()
    android.content.res.Resources resources) {
        return 0.0F;
    }
}