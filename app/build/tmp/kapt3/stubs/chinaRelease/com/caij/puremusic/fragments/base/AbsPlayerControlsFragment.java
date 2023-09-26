package com.caij.puremusic.fragments.base;

import java.lang.System;

/**
 * Created by hemanths on 24/09/17.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000 ^2\u00020\u00012\u00020\u0002:\u0001^B\u000f\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u00020<H$J\b\u0010=\u001a\u00020<H\u0002J\u0006\u0010>\u001a\u00020<J\u0012\u0010?\u001a\u00020<2\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\b\u0010B\u001a\u00020<H\u0016J\b\u0010C\u001a\u00020<H\u0016J\u0018\u0010D\u001a\u00020<2\u0006\u0010E\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u0007H\u0002J\b\u0010G\u001a\u00020<H\u0016J\b\u0010H\u001a\u00020<H\u0016J\b\u0010I\u001a\u00020<H\u0002J\u0010\u0010J\u001a\u00020<2\u0006\u0010E\u001a\u00020\u0004H\u0002J \u0010K\u001a\u00020<2\u0006\u0010L\u001a\u00020\u00042\u0006\u0010M\u001a\u00020\u00042\u0006\u0010N\u001a\u00020\u0004H\u0016J\u001a\u0010O\u001a\u00020<2\u0006\u0010P\u001a\u00020Q2\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\u0010\u0010R\u001a\u00020<2\u0006\u0010S\u001a\u00020TH&J\b\u0010U\u001a\u00020<H\u0003J\b\u0010V\u001a\u00020<H\u0002J\b\u0010W\u001a\u00020<H\u0002J\b\u0010X\u001a\u00020<H\u0002J\b\u0010Y\u001a\u00020<H$J\u0006\u0010Z\u001a\u00020<J\u0006\u0010[\u001a\u00020<J\u0006\u0010\\\u001a\u00020<J\n\u0010]\u001a\u00020<*\u00020QR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0005R\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\u0005R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u0018X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\u0004\u0018\u00010 X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010%\u001a\u00020\u0018X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b&\u0010\u001aR\u0016\u0010\'\u001a\u0004\u0018\u00010(X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0012\u0010+\u001a\u00020\u0018X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b,\u0010\u001aR\u0016\u0010-\u001a\u0004\u0018\u00010.X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0016\u00101\u001a\u0004\u0018\u00010.X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00100R\u001c\u00103\u001a\u0004\u0018\u000104X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108\u00a8\u0006_"}, d2 = {"Lcom/caij/puremusic/fragments/base/AbsPlayerControlsFragment;", "Lcom/caij/puremusic/fragments/base/AbsMusicServiceFragment;", "Lcom/caij/puremusic/helper/MusicProgressViewUpdateHelper$Callback;", "layout", "", "(I)V", "isSeeking", "", "lastDisabledPlaybackControlsColor", "getLastDisabledPlaybackControlsColor", "()I", "setLastDisabledPlaybackControlsColor", "lastPlaybackControlsColor", "getLastPlaybackControlsColor", "setLastPlaybackControlsColor", "lyricsCallback", "Lcom/caij/puremusic/service/LyricsCallback;", "lyricsProgressCallback", "Lcom/caij/puremusic/service/LyricsProgressCallback;", "lyricsView2", "Lcom/caij/puremusic/lyrics/SimpleLrcView;", "getLyricsView2", "()Lcom/caij/puremusic/lyrics/SimpleLrcView;", "nextButton", "Landroid/widget/ImageButton;", "getNextButton", "()Landroid/widget/ImageButton;", "previousButton", "getPreviousButton", "progressAnimator", "Landroid/animation/ObjectAnimator;", "progressSlider", "Lcom/google/android/material/slider/Slider;", "getProgressSlider", "()Lcom/google/android/material/slider/Slider;", "progressViewUpdateHelper", "Lcom/caij/puremusic/helper/MusicProgressViewUpdateHelper;", "repeatButton", "getRepeatButton", "seekBar", "Landroid/widget/SeekBar;", "getSeekBar", "()Landroid/widget/SeekBar;", "shuffleButton", "getShuffleButton", "songCurrentProgress", "Landroid/widget/TextView;", "getSongCurrentProgress", "()Landroid/widget/TextView;", "songTotalTime", "getSongTotalTime", "volumeFragment", "Lcom/caij/puremusic/fragments/other/VolumeFragment;", "getVolumeFragment", "()Lcom/caij/puremusic/fragments/other/VolumeFragment;", "setVolumeFragment", "(Lcom/caij/puremusic/fragments/other/VolumeFragment;)V", "getAvalibleHeight", "", "hide", "", "hideVolumeIfAvailable", "initLyrics", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onPause", "onProgressChange", "value", "fromUser", "onResume", "onStart", "onStartTrackingTouch", "onStopTrackingTouch", "onUpdateProgressViews", "progress", "bufferedPosition", "total", "onViewCreated", "view", "Landroid/view/View;", "setColor", "color", "Lcom/caij/puremusic/util/color/MediaNotificationProcessor;", "setUpPrevNext", "setUpProgressSlider", "setUpRepeatButton", "setUpShuffleButton", "show", "updatePrevNextColor", "updateRepeatState", "updateShuffleState", "showBounceAnimation", "Companion", "app_chinaRelease"})
public abstract class AbsPlayerControlsFragment extends com.caij.puremusic.fragments.base.AbsMusicServiceFragment implements com.caij.puremusic.helper.MusicProgressViewUpdateHelper.Callback {
    @org.jetbrains.annotations.Nullable()
    private final com.caij.puremusic.lyrics.SimpleLrcView lyricsView2 = null;
    private int lastPlaybackControlsColor = 0;
    private int lastDisabledPlaybackControlsColor = 0;
    private boolean isSeeking = false;
    @org.jetbrains.annotations.Nullable()
    private final com.google.android.material.slider.Slider progressSlider = null;
    @org.jetbrains.annotations.Nullable()
    private final android.widget.SeekBar seekBar = null;
    @org.jetbrains.annotations.Nullable()
    private final android.widget.ImageButton nextButton = null;
    @org.jetbrains.annotations.Nullable()
    private final android.widget.ImageButton previousButton = null;
    @org.jetbrains.annotations.Nullable()
    private final android.widget.TextView songTotalTime = null;
    @org.jetbrains.annotations.Nullable()
    private final android.widget.TextView songCurrentProgress = null;
    private android.animation.ObjectAnimator progressAnimator;
    private final com.caij.puremusic.service.LyricsCallback lyricsCallback = null;
    private final com.caij.puremusic.service.LyricsProgressCallback lyricsProgressCallback = null;
    private com.caij.puremusic.helper.MusicProgressViewUpdateHelper progressViewUpdateHelper;
    @org.jetbrains.annotations.Nullable()
    private com.caij.puremusic.fragments.other.VolumeFragment volumeFragment;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.fragments.base.AbsPlayerControlsFragment.Companion Companion = null;
    public static final long SLIDER_ANIMATION_TIME = 400L;
    
    public AbsPlayerControlsFragment(@androidx.annotation.LayoutRes()
    int layout) {
        super(0);
    }
    
    protected abstract void show();
    
    protected abstract void hide();
    
    public abstract void setColor(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.util.color.MediaNotificationProcessor color);
    
    @org.jetbrains.annotations.Nullable()
    public com.caij.puremusic.lyrics.SimpleLrcView getLyricsView2() {
        return null;
    }
    
    public final int getLastPlaybackControlsColor() {
        return 0;
    }
    
    public final void setLastPlaybackControlsColor(int p0) {
    }
    
    public final int getLastDisabledPlaybackControlsColor() {
        return 0;
    }
    
    public final void setLastDisabledPlaybackControlsColor(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public com.google.android.material.slider.Slider getProgressSlider() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public android.widget.SeekBar getSeekBar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.widget.ImageButton getShuffleButton();
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.widget.ImageButton getRepeatButton();
    
    @org.jetbrains.annotations.Nullable()
    public android.widget.ImageButton getNextButton() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public android.widget.ImageButton getPreviousButton() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public android.widget.TextView getSongTotalTime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public android.widget.TextView getSongCurrentProgress() {
        return null;
    }
    
    @java.lang.Override()
    public void onUpdateProgressViews(int progress, int bufferedPosition, int total) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void setUpProgressSlider() {
    }
    
    private final void onProgressChange(int value, boolean fromUser) {
    }
    
    private final void onStartTrackingTouch() {
    }
    
    private final void onStopTrackingTouch(int value) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void showBounceAnimation(@org.jetbrains.annotations.NotNull()
    android.view.View $this$showBounceAnimation) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void initLyrics() {
    }
    
    public float getAvalibleHeight() {
        return 0.0F;
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    private final void setUpPrevNext() {
    }
    
    private final void setUpShuffleButton() {
    }
    
    private final void setUpRepeatButton() {
    }
    
    public final void updatePrevNextColor() {
    }
    
    public final void updateShuffleState() {
    }
    
    public final void updateRepeatState() {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final com.caij.puremusic.fragments.other.VolumeFragment getVolumeFragment() {
        return null;
    }
    
    protected final void setVolumeFragment(@org.jetbrains.annotations.Nullable()
    com.caij.puremusic.fragments.other.VolumeFragment p0) {
    }
    
    private final void hideVolumeIfAvailable() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/caij/puremusic/fragments/base/AbsPlayerControlsFragment$Companion;", "", "()V", "SLIDER_ANIMATION_TIME", "", "app_chinaRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}