package com.caij.puremusic.fragments.player.full;

import java.lang.System;

/**
 * Created by hemanths on 20/09/17.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020$H\u0016J\b\u0010&\u001a\u00020$H\u0016J\u0006\u0010\'\u001a\u00020$J\u0012\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020$H\u0016J\b\u0010-\u001a\u00020$H\u0016J\b\u0010.\u001a\u00020$H\u0016J\b\u0010/\u001a\u00020$H\u0016J\b\u00100\u001a\u00020$H\u0016J\u001a\u00101\u001a\u00020$2\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u0010\u00106\u001a\u00020$2\u0006\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u00020$H\u0002J\b\u0010:\u001a\u00020$H\u0002J\b\u0010;\u001a\u00020$H\u0002J\b\u0010<\u001a\u00020$H\u0002J\b\u0010=\u001a\u00020$H\u0016J\u0010\u0010>\u001a\u00020$2\u0006\u0010?\u001a\u00020@H\u0002J\u0010\u0010A\u001a\u00020$2\b\b\u0002\u0010B\u001a\u00020)J\b\u0010C\u001a\u00020$H\u0002J\b\u0010D\u001a\u00020$H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012R\u0014\u0010\u001b\u001a\u00020\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u0012R\u0014\u0010\u001d\u001a\u00020\u001e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\"\u0010 \u00a8\u0006E"}, d2 = {"Lcom/caij/puremusic/fragments/player/full/FullPlaybackControlsFragment;", "Lcom/caij/puremusic/fragments/base/AbsPlayerControlsFragment;", "Landroidx/appcompat/widget/PopupMenu$OnMenuItemClickListener;", "()V", "_binding", "Lcom/caij/puremusic/databinding/FragmentFullPlayerControlsBinding;", "binding", "getBinding", "()Lcom/caij/puremusic/databinding/FragmentFullPlayerControlsBinding;", "libraryViewModel", "Lcom/caij/puremusic/fragments/LibraryViewModel;", "getLibraryViewModel", "()Lcom/caij/puremusic/fragments/LibraryViewModel;", "libraryViewModel$delegate", "Lkotlin/Lazy;", "nextButton", "Landroid/widget/ImageButton;", "getNextButton", "()Landroid/widget/ImageButton;", "previousButton", "getPreviousButton", "progressSlider", "Lcom/google/android/material/slider/Slider;", "getProgressSlider", "()Lcom/google/android/material/slider/Slider;", "repeatButton", "getRepeatButton", "shuffleButton", "getShuffleButton", "songCurrentProgress", "Landroid/widget/TextView;", "getSongCurrentProgress", "()Landroid/widget/TextView;", "songTotalTime", "getSongTotalTime", "hide", "", "onDestroyView", "onFavoriteStateChanged", "onFavoriteToggled", "onMenuItemClick", "", "item", "Landroid/view/MenuItem;", "onPlayStateChanged", "onPlayingMetaChanged", "onRepeatModeChanged", "onServiceConnected", "onShuffleModeChanged", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setColor", "color", "Lcom/caij/puremusic/util/color/MediaNotificationProcessor;", "setUpMusicControllers", "setUpPlayPauseFab", "setupFavourite", "setupMenu", "show", "toggleFavorite", "song", "Lcom/caij/puremusic/db/model/Song;", "updateIsFavorite", "animate", "updatePlayPauseDrawableState", "updateSong", "app_chinaRelease"})
public final class FullPlaybackControlsFragment extends com.caij.puremusic.fragments.base.AbsPlayerControlsFragment implements androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener {
    private final kotlin.Lazy libraryViewModel$delegate = null;
    private com.caij.puremusic.databinding.FragmentFullPlayerControlsBinding _binding;
    
    public FullPlaybackControlsFragment() {
        super(0);
    }
    
    private final com.caij.puremusic.fragments.LibraryViewModel getLibraryViewModel() {
        return null;
    }
    
    private final com.caij.puremusic.databinding.FragmentFullPlayerControlsBinding getBinding() {
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
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void show() {
    }
    
    @java.lang.Override()
    public void hide() {
    }
    
    @java.lang.Override()
    public void setColor(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.util.color.MediaNotificationProcessor color) {
    }
    
    @java.lang.Override()
    public void onServiceConnected() {
    }
    
    private final void updateSong() {
    }
    
    @java.lang.Override()
    public void onPlayingMetaChanged() {
    }
    
    @java.lang.Override()
    public void onPlayStateChanged() {
    }
    
    private final void updatePlayPauseDrawableState() {
    }
    
    private final void setUpPlayPauseFab() {
    }
    
    private final void setUpMusicControllers() {
    }
    
    private final void setupMenu() {
    }
    
    @java.lang.Override()
    public boolean onMenuItemClick(@org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onRepeatModeChanged() {
    }
    
    @java.lang.Override()
    public void onShuffleModeChanged() {
    }
    
    private final void setupFavourite() {
    }
    
    @java.lang.Override()
    public void onFavoriteStateChanged() {
    }
    
    public final void updateIsFavorite(boolean animate) {
    }
    
    private final void toggleFavorite(com.caij.puremusic.db.model.Song song) {
    }
    
    public final void onFavoriteToggled() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}