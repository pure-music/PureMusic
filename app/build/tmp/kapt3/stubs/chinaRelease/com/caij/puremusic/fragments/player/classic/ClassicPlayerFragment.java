package com.caij.puremusic.fragments.player.classic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&H\u0016J\u0012\u0010\'\u001a\u00020!2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020!H\u0016J\b\u0010+\u001a\u00020!H\u0016J\b\u0010,\u001a\u00020!H\u0016JR\u0010-\u001a\u00020!2\b\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\u0006\u00102\u001a\u00020\r2\u0006\u00103\u001a\u00020\r2\u0006\u00104\u001a\u00020\r2\u0006\u00105\u001a\u00020\r2\u0006\u00106\u001a\u00020\r2\u0006\u00107\u001a\u00020\rH\u0016J\b\u00108\u001a\u00020!H\u0016J\b\u00109\u001a\u00020!H\u0016J\b\u0010:\u001a\u00020!H\u0016J\b\u0010;\u001a\u00020!H\u0016J\b\u0010<\u001a\u00020!H\u0016J\b\u0010=\u001a\u00020!H\u0016J\b\u0010>\u001a\u00020!H\u0016J\b\u0010?\u001a\u00020!H\u0016J\b\u0010@\u001a\u00020!H\u0016J \u0010A\u001a\u00020!2\u0006\u0010B\u001a\u00020\r2\u0006\u0010C\u001a\u00020\r2\u0006\u0010D\u001a\u00020\rH\u0016J\u001a\u0010E\u001a\u00020!2\u0006\u0010F\u001a\u00020/2\b\u0010(\u001a\u0004\u0018\u00010)H\u0017J\b\u0010G\u001a\u00020!H\u0002J\b\u0010H\u001a\u00020!H\u0002J\b\u0010I\u001a\u00020!H\u0002J\b\u0010J\u001a\u00020!H\u0002J\b\u0010K\u001a\u00020!H\u0003J\b\u0010L\u001a\u00020!H\u0002J\b\u0010M\u001a\u00020!H\u0002J\b\u0010N\u001a\u00020!H\u0002J\b\u0010O\u001a\u00020!H\u0002J\b\u0010P\u001a\u00020!H\u0002J\u0010\u0010Q\u001a\u00020!2\u0006\u0010R\u001a\u00020SH\u0014J\b\u0010T\u001a\u00020\rH\u0016J\b\u0010U\u001a\u00020!H\u0002J\b\u0010V\u001a\u00020!H\u0002J\b\u0010W\u001a\u00020!H\u0002J\b\u0010X\u001a\u00020!H\u0002J\u0006\u0010Y\u001a\u00020!J\u0006\u0010Z\u001a\u00020!J\b\u0010[\u001a\u00020!H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\\"}, d2 = {"Lcom/caij/puremusic/fragments/player/classic/ClassicPlayerFragment;", "Lcom/caij/puremusic/fragments/base/AbsPlayerFragment;", "Landroid/view/View$OnLayoutChangeListener;", "Lcom/caij/puremusic/helper/MusicProgressViewUpdateHelper$Callback;", "()V", "_binding", "Lcom/caij/puremusic/databinding/FragmentClassicPlayerBinding;", "binding", "getBinding", "()Lcom/caij/puremusic/databinding/FragmentClassicPlayerBinding;", "bottomSheetCallbackList", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "lastColor", "", "lastDisabledPlaybackControlsColor", "lastPlaybackControlsColor", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "paletteColor", "getPaletteColor", "()I", "playingQueueAdapter", "Lcom/caij/puremusic/adapter/song/PlayingQueueAdapter;", "progressViewUpdateHelper", "Lcom/caij/puremusic/helper/MusicProgressViewUpdateHelper;", "shapeDrawable", "Lcom/google/android/material/shape/MaterialShapeDrawable;", "volumeFragment", "Lcom/caij/puremusic/fragments/other/VolumeFragment;", "getQueuePanel", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Lcom/google/android/material/card/MaterialCardView;", "hideVolumeIfAvailable", "", "onBackPressed", "", "onColorChanged", "color", "Lcom/caij/puremusic/util/color/MediaNotificationProcessor;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onFavoriteToggled", "onHide", "onLayoutChange", "v", "Landroid/view/View;", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "onPause", "onPlayStateChanged", "onPlayingMetaChanged", "onQueueChanged", "onRepeatModeChanged", "onResume", "onServiceConnected", "onShow", "onShuffleModeChanged", "onUpdateProgressViews", "progress", "bufferedPosition", "total", "onViewCreated", "view", "resetToCurrentPosition", "setUpMusicControllers", "setUpPlayPauseFab", "setUpPlayerToolbar", "setUpPrevNext", "setUpProgressSlider", "setUpRepeatButton", "setUpShuffleButton", "setupPanel", "setupRecyclerView", "toggleFavorite", "song", "Lcom/caij/puremusic/db/model/Song;", "toolbarIconColor", "updatePlayPauseDrawableState", "updatePrevNextColor", "updateQueue", "updateQueuePosition", "updateRepeatState", "updateShuffleState", "updateSong", "app_chinaRelease"})
public final class ClassicPlayerFragment extends com.caij.puremusic.fragments.base.AbsPlayerFragment implements android.view.View.OnLayoutChangeListener, com.caij.puremusic.helper.MusicProgressViewUpdateHelper.Callback {
    private com.caij.puremusic.databinding.FragmentClassicPlayerBinding _binding;
    private int lastColor = 0;
    private int lastPlaybackControlsColor = 0;
    private int lastDisabledPlaybackControlsColor = 0;
    private com.caij.puremusic.helper.MusicProgressViewUpdateHelper progressViewUpdateHelper;
    private com.caij.puremusic.fragments.other.VolumeFragment volumeFragment;
    private com.google.android.material.shape.MaterialShapeDrawable shapeDrawable;
    private com.caij.puremusic.adapter.song.PlayingQueueAdapter playingQueueAdapter;
    private androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager;
    private final com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback bottomSheetCallbackList = null;
    
    public ClassicPlayerFragment() {
        super(0);
    }
    
    private final com.caij.puremusic.databinding.FragmentClassicPlayerBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void hideVolumeIfAvailable() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void updateSong() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
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
    public void onQueueChanged() {
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
    protected void toggleFavorite(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song song) {
    }
    
    @java.lang.Override()
    public void onFavoriteToggled() {
    }
    
    @java.lang.Override()
    public void onUpdateProgressViews(int progress, int bufferedPosition, int total) {
    }
    
    private final void updateQueuePosition() {
    }
    
    private final void updateQueue() {
    }
    
    private final void resetToCurrentPosition() {
    }
    
    private final com.google.android.material.bottomsheet.BottomSheetBehavior<com.google.android.material.card.MaterialCardView> getQueuePanel() {
        return null;
    }
    
    private final void setupPanel() {
    }
    
    private final void setUpPlayerToolbar() {
    }
    
    private final void setupRecyclerView() {
    }
    
    private final void setUpProgressSlider() {
    }
    
    private final void setUpPlayPauseFab() {
    }
    
    private final void updatePlayPauseDrawableState() {
    }
    
    private final void setUpMusicControllers() {
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
    
    @java.lang.Override()
    public void onLayoutChange(@org.jetbrains.annotations.Nullable()
    android.view.View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
    }
}