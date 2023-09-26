package com.caij.puremusic.auto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c0\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\b"}, d2 = {"Lcom/caij/puremusic/auto/AutoMediaItem;", "", "()V", "with", "Lcom/caij/puremusic/auto/AutoMediaItem$Builder;", "context", "Landroid/content/Context;", "Builder", "app_chinaRelease"})
public final class AutoMediaItem {
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.auto.AutoMediaItem INSTANCE = null;
    
    private AutoMediaItem() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.caij.puremusic.auto.AutoMediaItem.Builder with(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\u0000J\u0006\u0010\n\u001a\u00020\u0000J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\bJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016J\u0018\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0016J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/caij/puremusic/auto/AutoMediaItem$Builder;", "", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mBuilder", "Landroid/support/v4/media/MediaDescriptionCompat$Builder;", "mFlags", "", "asBrowsable", "asPlayable", "build", "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;", "gridLayout", "isGrid", "", "icon", "uri", "Landroid/net/Uri;", "iconDrawableId", "path", "fullPath", "", "id", "", "subTitle", "title", "Companion", "app_chinaRelease"})
    public static final class Builder {
        private final android.content.Context mContext = null;
        private android.support.v4.media.MediaDescriptionCompat.Builder mBuilder;
        private int mFlags = 0;
        @org.jetbrains.annotations.NotNull()
        public static final com.caij.puremusic.auto.AutoMediaItem.Builder.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CONTENT_STYLE_SUPPORTED = "android.media.browse.CONTENT_STYLE_SUPPORTED";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CONTENT_STYLE_BROWSABLE_HINT = "android.media.browse.CONTENT_STYLE_BROWSABLE_HINT";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CONTENT_STYLE_PLAYABLE_HINT = "android.media.browse.CONTENT_STYLE_PLAYABLE_HINT";
        public static final int CONTENT_STYLE_LIST_ITEM_HINT_VALUE = 1;
        public static final int CONTENT_STYLE_GRID_ITEM_HINT_VALUE = 2;
        
        public Builder(@org.jetbrains.annotations.NotNull()
        android.content.Context mContext) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.auto.AutoMediaItem.Builder path(@org.jetbrains.annotations.NotNull()
        java.lang.String fullPath) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.auto.AutoMediaItem.Builder path(@org.jetbrains.annotations.Nullable()
        java.lang.String path, long id) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.auto.AutoMediaItem.Builder title(@org.jetbrains.annotations.NotNull()
        java.lang.String title) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.auto.AutoMediaItem.Builder subTitle(@org.jetbrains.annotations.NotNull()
        java.lang.String subTitle) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.auto.AutoMediaItem.Builder icon(@org.jetbrains.annotations.Nullable()
        android.net.Uri uri) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.auto.AutoMediaItem.Builder icon(int iconDrawableId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.auto.AutoMediaItem.Builder gridLayout(boolean isGrid) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.auto.AutoMediaItem.Builder asBrowsable() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.auto.AutoMediaItem.Builder asPlayable() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.support.v4.media.MediaBrowserCompat.MediaItem build() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/caij/puremusic/auto/AutoMediaItem$Builder$Companion;", "", "()V", "CONTENT_STYLE_BROWSABLE_HINT", "", "CONTENT_STYLE_GRID_ITEM_HINT_VALUE", "", "CONTENT_STYLE_LIST_ITEM_HINT_VALUE", "CONTENT_STYLE_PLAYABLE_HINT", "CONTENT_STYLE_SUPPORTED", "app_chinaRelease"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
}