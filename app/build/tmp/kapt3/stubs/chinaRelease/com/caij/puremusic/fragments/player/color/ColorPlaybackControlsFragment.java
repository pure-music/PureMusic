package com.caij.puremusic.fragments.player.color;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\'H\u0016J\b\u0010(\u001a\u00020\'H\u0016J\b\u0010)\u001a\u00020\'H\u0016J\b\u0010*\u001a\u00020\'H\u0016J\b\u0010+\u001a\u00020\'H\u0016J\b\u0010,\u001a\u00020\'H\u0016J\b\u0010-\u001a\u00020\'H\u0016J\u001a\u0010.\u001a\u00020\'2\u0006\u0010\"\u001a\u00020#2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0010\u00101\u001a\u00020\'2\u0006\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u00020\'H\u0002J\b\u00105\u001a\u00020\'H\u0016J\b\u00106\u001a\u00020\'H\u0002J\b\u00107\u001a\u00020\'H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u000fR\u0014\u0010\u0018\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u000fR\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d\u00a8\u00068"}, d2 = {"Lcom/caij/puremusic/fragments/player/color/ColorPlaybackControlsFragment;", "Lcom/caij/puremusic/fragments/base/AbsPlayerControlsFragment;", "()V", "_binding", "Lcom/caij/puremusic/databinding/FragmentColorPlayerPlaybackControlsBinding;", "binding", "getBinding", "()Lcom/caij/puremusic/databinding/FragmentColorPlayerPlaybackControlsBinding;", "lyricsView2", "Lcom/caij/puremusic/lyrics/SimpleLrcView;", "getLyricsView2", "()Lcom/caij/puremusic/lyrics/SimpleLrcView;", "nextButton", "Landroid/widget/ImageButton;", "getNextButton", "()Landroid/widget/ImageButton;", "previousButton", "getPreviousButton", "progressSlider", "Lcom/google/android/material/slider/Slider;", "getProgressSlider", "()Lcom/google/android/material/slider/Slider;", "repeatButton", "getRepeatButton", "shuffleButton", "getShuffleButton", "songCurrentProgress", "Landroid/widget/TextView;", "getSongCurrentProgress", "()Landroid/widget/TextView;", "songTotalTime", "getSongTotalTime", "createRevealAnimator", "Landroid/animation/Animator;", "view", "Landroid/view/View;", "getAvalibleHeight", "", "hide", "", "onDestroyView", "onPlayStateChanged", "onPlayingMetaChanged", "onRepeatModeChanged", "onServiceConnected", "onShuffleModeChanged", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "setColor", "color", "Lcom/caij/puremusic/util/color/MediaNotificationProcessor;", "setUpPlayPauseFab", "show", "updatePlayPauseDrawableState", "updateSong", "app_chinaRelease"})
public final class ColorPlaybackControlsFragment extends com.caij.puremusic.fragments.base.AbsPlayerControlsFragment {
    private com.caij.puremusic.databinding.FragmentColorPlayerPlaybackControlsBinding _binding;
    
    public ColorPlaybackControlsFragment() {
        super(0);
    }
    
    private final com.caij.puremusic.databinding.FragmentColorPlayerPlaybackControlsBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.android.material.slider.Slider getProgressSlider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.ImageButton getShuffleButton() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.ImageButton getRepeatButton() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.ImageButton getNextButton() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.ImageButton getPreviousButton() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.TextView getSongTotalTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.TextView getSongCurrentProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.caij.puremusic.lyrics.SimpleLrcView getLyricsView2() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public float getAvalibleHeight() {
        return 0.0F;
    }
    
    private final void updateSong() {
    }
    
    @java.lang.Override()
    public void onServiceConnected() {
    }
    
    @java.lang.Override()
    public void onPlayingMetaChanged() {
    }
    
    @java.lang.Override()
    public void onPlayStateChanged() {
    }
    
    @java.lang.Override()
    public void onRepeatModeChanged() {
    }
    
    @java.lang.Override()
    public void onShuffleModeChanged() {
    }
    
    @java.lang.Override()
    public void setColor(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.util.color.MediaNotificationProcessor color) {
    }
    
    private final void setUpPlayPauseFab() {
    }
    
    private final void updatePlayPauseDrawableState() {
    }
    
    @java.lang.Override()
    public void show() {
    }
    
    @java.lang.Override()
    public void hide() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.animation.Animator createRevealAnimator(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}