package com.caij.puremusic.fragments.other;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 02\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u00010B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0012H\u0016J\b\u0010!\u001a\u00020\u0012H\u0016J \u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0016J\u001a\u0010)\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020(H\u0002J\u000e\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u0014J\u000e\u0010.\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u0014J\u0006\u0010/\u001a\u00020\u0012R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u00061"}, d2 = {"Lcom/caij/puremusic/fragments/other/VolumeFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/google/android/material/slider/Slider$OnChangeListener;", "Lcom/caij/puremusic/volume/OnAudioVolumeChangedListener;", "Landroid/view/View$OnClickListener;", "()V", "_binding", "Lcom/caij/puremusic/databinding/FragmentVolumeBinding;", "audioManager", "Landroid/media/AudioManager;", "getAudioManager", "()Landroid/media/AudioManager;", "audioVolumeObserver", "Lcom/caij/puremusic/volume/AudioVolumeObserver;", "binding", "getBinding", "()Lcom/caij/puremusic/databinding/FragmentVolumeBinding;", "onAudioVolumeChanged", "", "currentVolume", "", "maxVolume", "onClick", "view", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onResume", "onValueChange", "slider", "Lcom/google/android/material/slider/Slider;", "value", "", "fromUser", "", "onViewCreated", "setPauseWhenZeroVolume", "pauseWhenZeroVolume", "setTintable", "color", "setTintableColor", "tintWhiteColor", "Companion", "app_chinaRelease"})
public final class VolumeFragment extends androidx.fragment.app.Fragment implements com.google.android.material.slider.Slider.OnChangeListener, com.caij.puremusic.volume.OnAudioVolumeChangedListener, android.view.View.OnClickListener {
    private com.caij.puremusic.databinding.FragmentVolumeBinding _binding;
    private com.caij.puremusic.volume.AudioVolumeObserver audioVolumeObserver;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.fragments.other.VolumeFragment.Companion Companion = null;
    
    public VolumeFragment() {
        super();
    }
    
    private final com.caij.puremusic.databinding.FragmentVolumeBinding getBinding() {
        return null;
    }
    
    private final android.media.AudioManager getAudioManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onAudioVolumeChanged(int currentVolume, int maxVolume) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onValueChange(@org.jetbrains.annotations.NotNull()
    com.google.android.material.slider.Slider slider, float value, boolean fromUser) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void tintWhiteColor() {
    }
    
    public final void setTintable(int color) {
    }
    
    private final void setPauseWhenZeroVolume(boolean pauseWhenZeroVolume) {
    }
    
    public final void setTintableColor(int color) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/caij/puremusic/fragments/other/VolumeFragment$Companion;", "", "()V", "newInstance", "Lcom/caij/puremusic/fragments/other/VolumeFragment;", "app_chinaRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.fragments.other.VolumeFragment newInstance() {
            return null;
        }
    }
}