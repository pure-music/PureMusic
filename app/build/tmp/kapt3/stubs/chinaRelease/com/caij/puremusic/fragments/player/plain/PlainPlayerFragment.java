package com.caij.puremusic.fragments.player.plain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u0012H\u0016J\b\u0010\u0018\u001a\u00020\u0012H\u0016J\b\u0010\u0019\u001a\u00020\u0012H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0016J\u001a\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0012H\u0002J\b\u0010!\u001a\u00020\u0012H\u0002J\u0010\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020$H\u0014J\b\u0010%\u001a\u00020\tH\u0016J\b\u0010&\u001a\u00020\u0012H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/caij/puremusic/fragments/player/plain/PlainPlayerFragment;", "Lcom/caij/puremusic/fragments/base/AbsPlayerFragment;", "()V", "_binding", "Lcom/caij/puremusic/databinding/FragmentPlainPlayerBinding;", "binding", "getBinding", "()Lcom/caij/puremusic/databinding/FragmentPlainPlayerBinding;", "lastColor", "", "paletteColor", "getPaletteColor", "()I", "plainPlaybackControlsFragment", "Lcom/caij/puremusic/fragments/player/plain/PlainPlaybackControlsFragment;", "onBackPressed", "", "onColorChanged", "", "color", "Lcom/caij/puremusic/util/color/MediaNotificationProcessor;", "onDestroyView", "onFavoriteToggled", "onHide", "onPlayingMetaChanged", "onServiceConnected", "onShow", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setUpPlayerToolbar", "setUpSubFragments", "toggleFavorite", "song", "Lcom/caij/puremusic/db/model/Song;", "toolbarIconColor", "updateSong", "app_chinaRelease"})
public final class PlainPlayerFragment extends com.caij.puremusic.fragments.base.AbsPlayerFragment {
    private com.caij.puremusic.fragments.player.plain.PlainPlaybackControlsFragment plainPlaybackControlsFragment;
    private int lastColor = 0;
    private com.caij.puremusic.databinding.FragmentPlainPlayerBinding _binding;
    
    public PlainPlayerFragment() {
        super(0);
    }
    
    @java.lang.Override()
    public int getPaletteColor() {
        return 0;
    }
    
    private final com.caij.puremusic.databinding.FragmentPlainPlayerBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onPlayingMetaChanged() {
    }
    
    private final void updateSong() {
    }
    
    @java.lang.Override()
    public void onServiceConnected() {
    }
    
    private final void setUpPlayerToolbar() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpSubFragments() {
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
    public void onColorChanged(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.util.color.MediaNotificationProcessor color) {
    }
    
    @java.lang.Override()
    public void onFavoriteToggled() {
    }
    
    @java.lang.Override()
    protected void toggleFavorite(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song song) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}