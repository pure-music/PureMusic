package com.caij.puremusic.fragments.player.peek;

/**
 * Created by hemanths on 2019-10-03.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u0012H\u0016J\b\u0010\u0018\u001a\u00020\u0012H\u0016J\b\u0010\u0019\u001a\u00020\u0012H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0016J\u001a\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0012H\u0002J\b\u0010!\u001a\u00020\u0012H\u0002J\b\u0010\"\u001a\u00020\u000bH\u0016J\b\u0010#\u001a\u00020\u0012H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006$"}, d2 = {"Lcom/caij/puremusic/fragments/player/peek/PeekPlayerFragment;", "Lcom/caij/puremusic/fragments/base/AbsPlayerFragment;", "()V", "_binding", "Lcom/caij/puremusic/databinding/FragmentPeekPlayerBinding;", "binding", "getBinding", "()Lcom/caij/puremusic/databinding/FragmentPeekPlayerBinding;", "controlsFragment", "Lcom/caij/puremusic/fragments/player/peek/PeekPlayerControlFragment;", "lastColor", "", "paletteColor", "getPaletteColor", "()I", "onBackPressed", "", "onColorChanged", "", "color", "Lcom/caij/puremusic/util/color/MediaNotificationProcessor;", "onDestroyView", "onFavoriteToggled", "onHide", "onPlayingMetaChanged", "onServiceConnected", "onShow", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setUpPlayerToolbar", "setUpSubFragments", "toolbarIconColor", "updateSong", "app_chinaDebug"})
public final class PeekPlayerFragment extends com.caij.puremusic.fragments.base.AbsPlayerFragment {
    private com.caij.puremusic.fragments.player.peek.PeekPlayerControlFragment controlsFragment;
    private int lastColor = 0;
    @org.jetbrains.annotations.Nullable()
    private com.caij.puremusic.databinding.FragmentPeekPlayerBinding _binding;
    
    public PeekPlayerFragment() {
        super(0);
    }
    
    private final com.caij.puremusic.databinding.FragmentPeekPlayerBinding getBinding() {
        return null;
    }
    
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
    
    private final void updateSong() {
    }
    
    @java.lang.Override()
    public void onServiceConnected() {
    }
    
    @java.lang.Override()
    public void onPlayingMetaChanged() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}