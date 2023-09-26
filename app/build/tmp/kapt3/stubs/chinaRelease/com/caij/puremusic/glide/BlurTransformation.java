package com.caij.puremusic.glide;

import java.lang.System;

@kotlin.Suppress(names = {"Deprecation"})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0014J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/caij/puremusic/glide/BlurTransformation;", "Lcom/bumptech/glide/load/resource/bitmap/BitmapTransformation;", "builder", "Lcom/caij/puremusic/glide/BlurTransformation$Builder;", "(Lcom/caij/puremusic/glide/BlurTransformation$Builder;)V", "blurRadius", "", "context", "Landroid/content/Context;", "sampling", "", "transform", "Landroid/graphics/Bitmap;", "pool", "Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;", "toTransform", "outWidth", "outHeight", "updateDiskCacheKey", "", "messageDigest", "Ljava/security/MessageDigest;", "Builder", "Companion", "app_chinaRelease"})
public final class BlurTransformation extends com.bumptech.glide.load.resource.bitmap.BitmapTransformation {
    private android.content.Context context;
    private float blurRadius = 0.0F;
    private int sampling = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.glide.BlurTransformation.Companion Companion = null;
    public static final float DEFAULT_BLUR_RADIUS = 5.0F;
    
    private BlurTransformation(com.caij.puremusic.glide.BlurTransformation.Builder builder) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.graphics.Bitmap transform(@org.jetbrains.annotations.NotNull()
    com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool pool, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap toTransform, int outWidth, int outHeight) {
        return null;
    }
    
    @java.lang.Override()
    public void updateDiskCacheKey(@org.jetbrains.annotations.NotNull()
    java.security.MessageDigest messageDigest) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\bJ\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0017"}, d2 = {"Lcom/caij/puremusic/glide/BlurTransformation$Builder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "bitmapPool", "Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;", "blurRadius", "", "getBlurRadius", "()F", "setBlurRadius", "(F)V", "getContext", "()Landroid/content/Context;", "sampling", "", "getSampling", "()I", "setSampling", "(I)V", "build", "Lcom/caij/puremusic/glide/BlurTransformation;", "app_chinaRelease"})
    public static final class Builder {
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context context = null;
        private com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool;
        private float blurRadius = 5.0F;
        private int sampling = 0;
        
        public Builder(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        public final float getBlurRadius() {
            return 0.0F;
        }
        
        public final void setBlurRadius(float p0) {
        }
        
        public final int getSampling() {
            return 0;
        }
        
        public final void setSampling(int p0) {
        }
        
        /**
         * @param blurRadius The radius to use. Must be between 0 and 25. Default is 5.
         * @return the same Builder
         */
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.glide.BlurTransformation.Builder blurRadius(@androidx.annotation.FloatRange(from = 0.0, to = 25.0)
        float blurRadius) {
            return null;
        }
        
        /**
         * @param sampling The inSampleSize to use. Must be a power of 2, or 1 for no down sampling or 0 for auto detect sampling. Default is 0.
         * @return the same Builder
         */
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.glide.BlurTransformation.Builder sampling(int sampling) {
            return null;
        }
        
        /**
         * @param bitmapPool The BitmapPool to use.
         * @return the same Builder
         */
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.glide.BlurTransformation.Builder bitmapPool(@org.jetbrains.annotations.Nullable()
        com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.glide.BlurTransformation build() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/caij/puremusic/glide/BlurTransformation$Companion;", "", "()V", "DEFAULT_BLUR_RADIUS", "", "app_chinaRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}