package com.caij.puremusic.fragments.player.gradient;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b/\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&H\u0016J\u0012\u0010\'\u001a\u00020!2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020!H\u0016J\b\u0010+\u001a\u00020!H\u0016J\b\u0010,\u001a\u00020!H\u0016J\b\u0010-\u001a\u00020!H\u0016JR\u0010.\u001a\u00020!2\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u00020\u000e2\u0006\u00102\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\u000eH\u0016J\b\u00109\u001a\u00020!H\u0016J\b\u0010:\u001a\u00020!H\u0016J\b\u0010;\u001a\u00020!H\u0016J\b\u0010<\u001a\u00020!H\u0016J\b\u0010=\u001a\u00020!H\u0016J\b\u0010>\u001a\u00020!H\u0016J\b\u0010?\u001a\u00020!H\u0016J\b\u0010@\u001a\u00020!H\u0016J\b\u0010A\u001a\u00020!H\u0016J \u0010B\u001a\u00020!2\u0006\u0010C\u001a\u00020\u000e2\u0006\u0010D\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020\u000eH\u0016J\u001a\u0010F\u001a\u00020!2\u0006\u0010G\u001a\u0002002\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010H\u001a\u00020!H\u0002J\b\u0010I\u001a\u00020!H\u0002J\b\u0010J\u001a\u00020!H\u0002J\b\u0010K\u001a\u00020!H\u0003J\b\u0010L\u001a\u00020!H\u0002J\b\u0010M\u001a\u00020!H\u0002J\b\u0010N\u001a\u00020!H\u0002J\b\u0010O\u001a\u00020!H\u0002J\b\u0010P\u001a\u00020!H\u0002J\b\u0010Q\u001a\u00020!H\u0002J\b\u0010R\u001a\u00020!H\u0002J\b\u0010S\u001a\u00020!H\u0003J\b\u0010T\u001a\u00020\u000eH\u0016J\u0012\u0010U\u001a\u00020!2\b\b\u0002\u0010V\u001a\u00020#H\u0002J\b\u0010W\u001a\u00020!H\u0002J\b\u0010X\u001a\u00020!H\u0002J\b\u0010Y\u001a\u00020!H\u0002J\b\u0010Z\u001a\u00020!H\u0002J\b\u0010[\u001a\u00020!H\u0002J\u0006\u0010\\\u001a\u00020!J\u0006\u0010]\u001a\u00020!J\b\u0010^\u001a\u00020!H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006_"}, d2 = {"Lcom/caij/puremusic/fragments/player/gradient/GradientPlayerFragment;", "Lcom/caij/puremusic/fragments/base/AbsPlayerFragment;", "Lcom/caij/puremusic/helper/MusicProgressViewUpdateHelper$Callback;", "Landroid/view/View$OnLayoutChangeListener;", "Landroidx/appcompat/widget/PopupMenu$OnMenuItemClickListener;", "()V", "_binding", "Lcom/caij/puremusic/databinding/FragmentGradientPlayerBinding;", "binding", "getBinding", "()Lcom/caij/puremusic/databinding/FragmentGradientPlayerBinding;", "bottomSheetCallbackList", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "lastColor", "", "lastDisabledPlaybackControlsColor", "lastPlaybackControlsColor", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "navBarHeight", "paletteColor", "getPaletteColor", "()I", "playingQueueAdapter", "Lcom/caij/puremusic/adapter/song/PlayingQueueAdapter;", "progressViewUpdateHelper", "Lcom/caij/puremusic/helper/MusicProgressViewUpdateHelper;", "volumeFragment", "Lcom/caij/puremusic/fragments/other/VolumeFragment;", "getQueuePanel", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "hideVolumeIfAvailable", "", "onBackPressed", "", "onColorChanged", "color", "Lcom/caij/puremusic/util/color/MediaNotificationProcessor;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onFavoriteStateChanged", "onFavoriteToggled", "onHide", "onLayoutChange", "v", "Landroid/view/View;", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "onPause", "onPlayStateChanged", "onPlayingMetaChanged", "onQueueChanged", "onRepeatModeChanged", "onResume", "onServiceConnected", "onShow", "onShuffleModeChanged", "onUpdateProgressViews", "progress", "bufferedPosition", "total", "onViewCreated", "view", "resetToCurrentPosition", "setUpMusicControllers", "setUpPlayPauseFab", "setUpPrevNext", "setUpProgressSlider", "setUpRepeatButton", "setUpShuffleButton", "setupFavourite", "setupMenu", "setupPanel", "setupRecyclerView", "setupSheet", "toolbarIconColor", "updateIsFavoriteIcon", "animate", "updateLabel", "updatePlayPauseDrawableState", "updatePrevNextColor", "updateQueue", "updateQueuePosition", "updateRepeatState", "updateShuffleState", "updateSong", "app_chinaRelease"})
public final class GradientPlayerFragment extends com.caij.puremusic.fragments.base.AbsPlayerFragment implements com.caij.puremusic.helper.MusicProgressViewUpdateHelper.Callback, android.view.View.OnLayoutChangeListener, androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener {
    private int lastColor = 0;
    private int lastPlaybackControlsColor = 0;
    private int lastDisabledPlaybackControlsColor = 0;
    private com.caij.puremusic.helper.MusicProgressViewUpdateHelper progressViewUpdateHelper;
    private com.caij.puremusic.fragments.other.VolumeFragment volumeFragment;
    private com.caij.puremusic.adapter.song.PlayingQueueAdapter playingQueueAdapter;
    private androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager;
    private int navBarHeight = 0;
    private com.caij.puremusic.databinding.FragmentGradientPlayerBinding _binding;
    private final com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback bottomSheetCallbackList = null;
    
    public GradientPlayerFragment() {
        super(0);
    }
    
    private final com.caij.puremusic.databinding.FragmentGradientPlayerBinding getBinding() {
        return null;
    }
    
    private final void setupFavourite() {
    }
    
    private final void setupMenu() {
    }
    
    private final void setupPanel() {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    private final void setupSheet() {
    }
    
    private final com.google.android.material.bottomsheet.BottomSheetBehavior<androidx.constraintlayout.widget.ConstraintLayout> getQueuePanel() {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
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
    
    private final void updateIsFavoriteIcon(boolean animate) {
    }
    
    private final void hideVolumeIfAvailable() {
    }
    
    @java.lang.Override()
    public void onServiceConnected() {
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
    public void onPlayingMetaChanged() {
    }
    
    @java.lang.Override()
    public void onFavoriteStateChanged() {
    }
    
    @java.lang.Override()
    public void onQueueChanged() {
    }
    
    private final void updateSong() {
    }
    
    private final void setUpMusicControllers() {
    }
    
    private final void updatePlayPauseDrawableState() {
    }
    
    private final void setUpPlayPauseFab() {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    private final void setUpPrevNext() {
    }
    
    private final void updatePrevNextColor() {
    }
    
    private final void setUpShuffleButton() {
    }
    
    public final void updateShuffleState() {
    }
    
    private final void setUpRepeatButton() {
    }
    
    public final void updateRepeatState() {
    }
    
    private final void updateLabel() {
    }
    
    @java.lang.Override()
    public void onLayoutChange(@org.jetbrains.annotations.Nullable()
    android.view.View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
    }
    
    private final void setupRecyclerView() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void updateQueuePosition() {
    }
    
    private final void updateQueue() {
    }
    
    private final void resetToCurrentPosition() {
    }
    
    private final void setUpProgressSlider() {
    }
    
    @java.lang.Override()
    public void onUpdateProgressViews(int progress, int bufferedPosition, int total) {
    }
}