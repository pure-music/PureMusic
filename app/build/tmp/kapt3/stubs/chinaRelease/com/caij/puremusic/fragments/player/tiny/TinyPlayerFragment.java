package com.caij.puremusic.fragments.player.tiny;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u00019B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001b\u001a\u00020\u0012H\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0012\u0010 \u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\u001dH\u0016J\b\u0010$\u001a\u00020\u001dH\u0016J\b\u0010%\u001a\u00020\u001dH\u0016J\b\u0010&\u001a\u00020\u001dH\u0016J\b\u0010\'\u001a\u00020\u001dH\u0016J\b\u0010(\u001a\u00020\u001dH\u0016J\b\u0010)\u001a\u00020\u001dH\u0016J\b\u0010*\u001a\u00020\u001dH\u0016J \u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\u0014H\u0016J\u001a\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u0002012\b\u0010!\u001a\u0004\u0018\u00010\"H\u0017J\b\u00102\u001a\u00020\u001dH\u0002J\b\u00103\u001a\u00020\u001dH\u0002J\u0010\u00104\u001a\u00020\u001d2\u0006\u00105\u001a\u000206H\u0014J\b\u00107\u001a\u00020\u0014H\u0016J\b\u00108\u001a\u00020\u001dH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006:"}, d2 = {"Lcom/caij/puremusic/fragments/player/tiny/TinyPlayerFragment;", "Lcom/caij/puremusic/fragments/base/AbsPlayerFragment;", "Lcom/caij/puremusic/helper/MusicProgressViewUpdateHelper$Callback;", "()V", "_binding", "Lcom/caij/puremusic/databinding/FragmentTinyPlayerBinding;", "animator", "Landroid/animation/ObjectAnimator;", "getAnimator", "()Landroid/animation/ObjectAnimator;", "setAnimator", "(Landroid/animation/ObjectAnimator;)V", "binding", "getBinding", "()Lcom/caij/puremusic/databinding/FragmentTinyPlayerBinding;", "controlsFragment", "Lcom/caij/puremusic/fragments/player/tiny/TinyPlaybackControlsFragment;", "isDragEnabled", "", "lastColor", "", "paletteColor", "getPaletteColor", "()I", "progressViewUpdateHelper", "Lcom/caij/puremusic/helper/MusicProgressViewUpdateHelper;", "toolbarColor", "onBackPressed", "onColorChanged", "", "color", "Lcom/caij/puremusic/util/color/MediaNotificationProcessor;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onFavoriteToggled", "onHide", "onPause", "onPlayingMetaChanged", "onResume", "onServiceConnected", "onShow", "onUpdateProgressViews", "progress", "bufferedPosition", "total", "onViewCreated", "view", "Landroid/view/View;", "setUpPlayerToolbar", "setUpSubFragments", "toggleFavorite", "song", "Lcom/caij/puremusic/db/model/Song;", "toolbarIconColor", "updateSong", "ProgressHelper", "app_chinaRelease"})
public final class TinyPlayerFragment extends com.caij.puremusic.fragments.base.AbsPlayerFragment implements com.caij.puremusic.helper.MusicProgressViewUpdateHelper.Callback {
    private com.caij.puremusic.databinding.FragmentTinyPlayerBinding _binding;
    private int lastColor = 0;
    private int toolbarColor = 0;
    private boolean isDragEnabled = false;
    public android.animation.ObjectAnimator animator;
    private com.caij.puremusic.fragments.player.tiny.TinyPlaybackControlsFragment controlsFragment;
    private com.caij.puremusic.helper.MusicProgressViewUpdateHelper progressViewUpdateHelper;
    
    public TinyPlayerFragment() {
        super(0);
    }
    
    private final com.caij.puremusic.databinding.FragmentTinyPlayerBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.animation.ObjectAnimator getAnimator() {
        return null;
    }
    
    public final void setAnimator(@org.jetbrains.annotations.NotNull()
    android.animation.ObjectAnimator p0) {
    }
    
    @java.lang.Override()
    public void onShow() {
    }
    
    @java.lang.Override()
    public void onHide() {
    }
    
    @java.lang.Override()
    public boolean onBackPressed() {
        return false;
    }
    
    @java.lang.Override()
    public int toolbarIconColor() {
        return 0;
    }
    
    @java.lang.Override()
    public int getPaletteColor() {
        return 0;
    }
    
    @java.lang.Override()
    public void onColorChanged(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.util.color.MediaNotificationProcessor color) {
    }
    
    @java.lang.Override()
    public void onFavoriteToggled() {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    private final void updateSong() {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpSubFragments() {
    }
    
    private final void setUpPlayerToolbar() {
    }
    
    @java.lang.Override()
    protected void toggleFavorite(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song song) {
    }
    
    @java.lang.Override()
    public void onServiceConnected() {
    }
    
    @java.lang.Override()
    public void onPlayingMetaChanged() {
    }
    
    @java.lang.Override()
    public void onUpdateProgressViews(int progress, int bufferedPosition, int total) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0017J\b\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/caij/puremusic/fragments/player/tiny/TinyPlayerFragment$ProgressHelper;", "Landroid/view/View$OnTouchListener;", "context", "Landroid/content/Context;", "(Lcom/caij/puremusic/fragments/player/tiny/TinyPlayerFragment;Landroid/content/Context;)V", "displayHeight", "", "gestureDetector", "Landroid/view/GestureDetector;", "initialProgress", "initialY", "progress", "onTouch", "", "v", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "vibrate", "", "app_chinaRelease"})
    public final class ProgressHelper implements android.view.View.OnTouchListener {
        private int initialY = 0;
        private int initialProgress = 0;
        private int progress = 0;
        private final int displayHeight = 0;
        private android.view.GestureDetector gestureDetector;
        
        public ProgressHelper(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
        
        @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
        @java.lang.Override()
        public boolean onTouch(@org.jetbrains.annotations.NotNull()
        android.view.View v, @org.jetbrains.annotations.NotNull()
        android.view.MotionEvent event) {
            return false;
        }
        
        @kotlin.Suppress(names = {"Deprecation"})
        private final void vibrate() {
        }
    }
}