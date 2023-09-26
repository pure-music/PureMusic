package com.caij.puremusic.fragments.player.flat;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020\u001eH\u0016J\b\u0010!\u001a\u00020\u001eH\u0016J\b\u0010\"\u001a\u00020\u001eH\u0016J\b\u0010#\u001a\u00020\u001eH\u0016J\b\u0010$\u001a\u00020\u001eH\u0016J\u001a\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0010\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020\u001eH\u0016J\b\u0010.\u001a\u00020\u001eH\u0002J\b\u0010/\u001a\u00020\u001eH\u0002J\u0010\u00100\u001a\u00020\u001e2\u0006\u0010+\u001a\u000201H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\fR\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a\u00a8\u00062"}, d2 = {"Lcom/caij/puremusic/fragments/player/flat/FlatPlaybackControlsFragment;", "Lcom/caij/puremusic/fragments/base/AbsPlayerControlsFragment;", "Lcom/caij/puremusic/helper/MusicProgressViewUpdateHelper$Callback;", "()V", "_binding", "Lcom/caij/puremusic/databinding/FragmentFlatPlayerPlaybackControlsBinding;", "binding", "getBinding", "()Lcom/caij/puremusic/databinding/FragmentFlatPlayerPlaybackControlsBinding;", "nextButton", "Landroid/widget/ImageButton;", "getNextButton", "()Landroid/widget/ImageButton;", "previousButton", "getPreviousButton", "repeatButton", "getRepeatButton", "seekBar", "Landroid/widget/SeekBar;", "getSeekBar", "()Landroid/widget/SeekBar;", "shuffleButton", "getShuffleButton", "songCurrentProgress", "Landroid/widget/TextView;", "getSongCurrentProgress", "()Landroid/widget/TextView;", "songTotalTime", "getSongTotalTime", "hide", "", "onDestroyView", "onPlayStateChanged", "onPlayingMetaChanged", "onRepeatModeChanged", "onServiceConnected", "onShuffleModeChanged", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setColor", "color", "Lcom/caij/puremusic/util/color/MediaNotificationProcessor;", "show", "updatePlayPauseDrawableState", "updateSong", "updateTextColors", "", "app_chinaDebug"})
public final class FlatPlaybackControlsFragment extends com.caij.puremusic.fragments.base.AbsPlayerControlsFragment implements com.caij.puremusic.helper.MusicProgressViewUpdateHelper.Callback {
    @org.jetbrains.annotations.Nullable()
    private com.caij.puremusic.databinding.FragmentFlatPlayerPlaybackControlsBinding _binding;
    
    public FlatPlaybackControlsFragment() {
        super(0);
    }
    
    private final com.caij.puremusic.databinding.FragmentFlatPlayerPlaybackControlsBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.widget.SeekBar getSeekBar() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.widget.ImageButton getShuffleButton() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.widget.ImageButton getRepeatButton() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.widget.ImageButton getNextButton() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.widget.ImageButton getPreviousButton() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView getSongTotalTime() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
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
    
    private final void updateTextColors(int color) {
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
    
    private final void updatePlayPauseDrawableState() {
    }
    
    private final void updateSong() {
    }
    
    @java.lang.Override()
    public void onRepeatModeChanged() {
    }
    
    @java.lang.Override()
    public void onShuffleModeChanged() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}