package com.caij.puremusic.activities;

import java.lang.System;

/**
 * Created by hemanths on 2020-02-02.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0012H\u0014J\b\u0010\u0017\u001a\u00020\u0012H\u0016J\b\u0010\u0018\u001a\u00020\u0012H\u0016J\b\u0010\u0019\u001a\u00020\u0012H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0014J\b\u0010\u001b\u001a\u00020\u0012H\u0016J\b\u0010\u001c\u001a\u00020\u0012H\u0016J \u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0016J\b\u0010!\u001a\u00020\u0012H\u0002J\b\u0010\"\u001a\u00020\u0012H\u0002J\b\u0010#\u001a\u00020\u0012H\u0002J\b\u0010$\u001a\u00020\u0012H\u0002J\b\u0010%\u001a\u00020\u0012H\u0002J\b\u0010&\u001a\u00020\u0012H\u0002J\b\u0010\'\u001a\u00020\u0012H\u0002J\u0010\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020\u0012H\u0002J\b\u0010,\u001a\u00020\u0012H\u0002J\b\u0010-\u001a\u00020\u0012H\u0002J\u0006\u0010.\u001a\u00020\u0012J\b\u0010/\u001a\u00020\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u00060"}, d2 = {"Lcom/caij/puremusic/activities/DriveModeActivity;", "Lcom/caij/puremusic/activities/base/AbsMusicServiceActivity;", "Lcom/caij/puremusic/helper/MusicProgressViewUpdateHelper$Callback;", "()V", "binding", "Lcom/caij/puremusic/databinding/ActivityDriveModeBinding;", "lastDisabledPlaybackControlsColor", "", "lastPlaybackControlsColor", "progressViewUpdateHelper", "Lcom/caij/puremusic/helper/MusicProgressViewUpdateHelper;", "repository", "Lcom/caij/puremusic/repository/RealRepository;", "getRepository", "()Lcom/caij/puremusic/repository/RealRepository;", "repository$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onFavoriteStateChanged", "onPause", "onPlayStateChanged", "onPlayingMetaChanged", "onRepeatModeChanged", "onResume", "onServiceConnected", "onShuffleModeChanged", "onUpdateProgressViews", "progress", "bufferedPosition", "total", "setUpMusicControllers", "setUpPlayPauseFab", "setUpPrevNext", "setUpProgressSlider", "setUpRepeatButton", "setUpShuffleButton", "setupFavouriteToggle", "toggleFavorite", "song", "Lcom/caij/puremusic/db/model/Song;", "updateFavorite", "updatePlayPauseDrawableState", "updateRepeatState", "updateShuffleState", "updateSong", "app_chinaRelease"})
public final class DriveModeActivity extends com.caij.puremusic.activities.base.AbsMusicServiceActivity implements com.caij.puremusic.helper.MusicProgressViewUpdateHelper.Callback {
    private com.caij.puremusic.databinding.ActivityDriveModeBinding binding;
    private int lastPlaybackControlsColor = android.graphics.Color.GRAY;
    private int lastDisabledPlaybackControlsColor = android.graphics.Color.GRAY;
    private com.caij.puremusic.helper.MusicProgressViewUpdateHelper progressViewUpdateHelper;
    private final kotlin.Lazy repository$delegate = null;
    
    public DriveModeActivity() {
        super();
    }
    
    private final com.caij.puremusic.repository.RealRepository getRepository() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpMusicControllers() {
    }
    
    private final void setupFavouriteToggle() {
    }
    
    private final void toggleFavorite(com.caij.puremusic.db.model.Song song) {
    }
    
    private final void updateFavorite() {
    }
    
    private final void setUpProgressSlider() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void setUpPrevNext() {
    }
    
    private final void setUpShuffleButton() {
    }
    
    private final void setUpRepeatButton() {
    }
    
    private final void setUpPlayPauseFab() {
    }
    
    @java.lang.Override()
    public void onRepeatModeChanged() {
    }
    
    @java.lang.Override()
    public void onShuffleModeChanged() {
    }
    
    @java.lang.Override()
    public void onPlayStateChanged() {
    }
    
    @java.lang.Override()
    public void onServiceConnected() {
    }
    
    private final void updatePlayPauseDrawableState() {
    }
    
    public final void updateShuffleState() {
    }
    
    private final void updateRepeatState() {
    }
    
    @java.lang.Override()
    public void onPlayingMetaChanged() {
    }
    
    @java.lang.Override()
    public void onFavoriteStateChanged() {
    }
    
    private final void updateSong() {
    }
    
    @java.lang.Override()
    public void onUpdateProgressViews(int progress, int bufferedPosition, int total) {
    }
}