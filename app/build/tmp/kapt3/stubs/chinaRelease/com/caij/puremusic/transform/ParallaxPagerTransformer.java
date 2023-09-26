package com.caij.puremusic.transform;

import java.lang.System;

/**
 * Created by xgc1986 on 2/Apr/2016
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/caij/puremusic/transform/ParallaxPagerTransformer;", "Landroidx/viewpager/widget/ViewPager$PageTransformer;", "id", "", "(I)V", "speed", "", "setSpeed", "", "transformPage", "page", "Landroid/view/View;", "position", "app_chinaRelease"})
public final class ParallaxPagerTransformer implements androidx.viewpager.widget.ViewPager.PageTransformer {
    private final int id = 0;
    private float speed = 0.2F;
    
    public ParallaxPagerTransformer(int id) {
        super();
    }
    
    @java.lang.Override()
    public void transformPage(@org.jetbrains.annotations.NotNull()
    android.view.View page, float position) {
    }
    
    public final void setSpeed(float speed) {
    }
}