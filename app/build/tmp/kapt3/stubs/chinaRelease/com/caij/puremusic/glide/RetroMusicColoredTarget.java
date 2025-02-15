package com.caij.puremusic.glide;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0012\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\"\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0010\u0010\u0013\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0012\u0018\u00010\u0014H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/caij/puremusic/glide/RetroMusicColoredTarget;", "Lcom/caij/puremusic/glide/palette/BitmapPaletteTarget;", "view", "Landroid/widget/ImageView;", "(Landroid/widget/ImageView;)V", "defaultFooterColor", "", "getDefaultFooterColor", "()I", "onColorReady", "", "colors", "Lcom/caij/puremusic/util/color/MediaNotificationProcessor;", "onLoadFailed", "errorDrawable", "Landroid/graphics/drawable/Drawable;", "onResourceReady", "resource", "Lcom/caij/puremusic/glide/palette/BitmapPaletteWrapper;", "transition", "Lcom/bumptech/glide/request/transition/Transition;", "app_chinaRelease"})
public abstract class RetroMusicColoredTarget extends com.caij.puremusic.glide.palette.BitmapPaletteTarget {
    
    public RetroMusicColoredTarget(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view) {
        super(null);
    }
    
    protected final int getDefaultFooterColor() {
        return 0;
    }
    
    public abstract void onColorReady(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.util.color.MediaNotificationProcessor colors);
    
    @java.lang.Override()
    public void onLoadFailed(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable errorDrawable) {
    }
    
    @java.lang.Override()
    public void onResourceReady(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.glide.palette.BitmapPaletteWrapper resource, @org.jetbrains.annotations.Nullable()
    com.bumptech.glide.request.transition.Transition<? super com.caij.puremusic.glide.palette.BitmapPaletteWrapper> transition) {
    }
}