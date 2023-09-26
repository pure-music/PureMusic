package com.caij.puremusic.activities.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\b&\u0018\u0000 c2\u00020\u00012\u00020\u0002:\u0001cB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020&H\u0002J\b\u0010>\u001a\u00020<H\u0002J\u0006\u0010?\u001a\u00020<J\u0006\u0010@\u001a\u00020<J\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\b\u0010B\u001a\u00020\u0016H\u0002J\"\u0010C\u001a\u00020<2\u0006\u0010D\u001a\u00020\u00162\b\b\u0002\u0010E\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u0016J\b\u0010F\u001a\u00020<H\u0016J\u0012\u0010G\u001a\u00020<2\b\u0010H\u001a\u0004\u0018\u00010IH\u0014J\b\u0010J\u001a\u00020<H\u0016J\b\u0010K\u001a\u00020<H\u0002J\b\u0010L\u001a\u00020<H\u0016J\b\u0010M\u001a\u00020<H\u0016J\b\u0010N\u001a\u00020<H\u0014J\b\u0010O\u001a\u00020<H\u0016J\b\u0010P\u001a\u00020<H\u0014J\b\u0010Q\u001a\u00020<H\u0016J\u001c\u0010R\u001a\u00020<2\b\u0010S\u001a\u0004\u0018\u00010T2\b\u0010U\u001a\u0004\u0018\u00010VH\u0016J\u000e\u0010W\u001a\u00020<2\u0006\u0010X\u001a\u00020\u0016J\"\u0010Y\u001a\u00020<2\u0006\u0010Z\u001a\u00020\u00162\b\b\u0002\u0010E\u001a\u00020\u00162\b\b\u0002\u0010C\u001a\u00020\u0016J\u0010\u0010[\u001a\u00020<2\u0006\u0010\\\u001a\u00020]H\u0002J\u0010\u0010^\u001a\u00020<2\u0006\u0010=\u001a\u00020&H\u0002J\b\u0010_\u001a\u00020<H\u0002J\b\u0010`\u001a\u00020<H\u0002J\b\u0010a\u001a\u00020<H\u0002J\u0006\u0010b\u001a\u00020<R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00168F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0018R\u000e\u0010\u001c\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001e\u001a\u00020\u001f8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010\u0014\u001a\u0004\b \u0010!R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\'\u001a\u0004\u0018\u00010(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010)\u001a\u00020*8F\u00a2\u0006\u0006\u001a\u0004\b+\u0010,R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u00100\u001a\u00020&8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b1\u00102R\u000e\u00103\u001a\u000204X\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u00105\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b6\u00107R\u000e\u00108\u001a\u00020&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00109\u001a\u0004\u0018\u00010:X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006d"}, d2 = {"Lcom/caij/puremusic/activities/base/AbsSlidingMusicPanelActivity;", "Lcom/caij/puremusic/activities/base/AbsMusicServiceActivity;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "()V", "argbEvaluator", "Landroid/animation/ArgbEvaluator;", "binding", "Lcom/caij/puremusic/databinding/SlidingMusicPanelLayoutBinding;", "getBinding", "()Lcom/caij/puremusic/databinding/SlidingMusicPanelLayoutBinding;", "setBinding", "(Lcom/caij/puremusic/databinding/SlidingMusicPanelLayoutBinding;)V", "bottomSheetBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/widget/FrameLayout;", "bottomSheetCallbackList", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "getBottomSheetCallbackList", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "bottomSheetCallbackList$delegate", "Lkotlin/Lazy;", "fromNotification", "", "getFromNotification", "()Z", "setFromNotification", "(Z)V", "isBottomNavVisible", "isInOneTabMode", "isResume", "libraryViewModel", "Lcom/caij/puremusic/fragments/LibraryViewModel;", "getLibraryViewModel", "()Lcom/caij/puremusic/fragments/LibraryViewModel;", "libraryViewModel$delegate", "miniPlayerFragment", "Lcom/caij/puremusic/fragments/other/MiniPlayerFragment;", "navigationBarColor", "", "navigationBarColorAnimator", "Landroid/animation/ValueAnimator;", "navigationView", "Lcom/google/android/material/navigation/NavigationBarView;", "getNavigationView", "()Lcom/google/android/material/navigation/NavigationBarView;", "nowPlayingScreen", "Lcom/caij/puremusic/fragments/NowPlayingScreen;", "paletteColor", "panelState", "getPanelState", "()I", "playerFragment", "Lcom/caij/puremusic/fragments/base/AbsPlayerFragment;", "slidingPanel", "getSlidingPanel", "()Landroid/widget/FrameLayout;", "taskColor", "windowInsets", "Landroidx/core/view/WindowInsetsCompat;", "animateNavigationBarColor", "", "color", "chooseFragmentForTheme", "collapsePanel", "expandPanel", "getBottomSheetBehavior", "handleBackPress", "hideBottomSheet", "hide", "animate", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPaletteColorChanged", "onPanelCollapsed", "onPanelExpanded", "onPause", "onQueueChanged", "onResume", "onServiceConnected", "onSharedPreferenceChanged", "sharedPreferences", "Landroid/content/SharedPreferences;", "key", "", "setAllowDragging", "allowDragging", "setBottomNavVisibility", "visible", "setMiniPlayerAlphaProgress", "progress", "", "setTaskDescColor", "setupBottomSheet", "setupSlidingUpPanel", "updateColor", "updateTabs", "Companion", "app_chinaRelease"})
public abstract class AbsSlidingMusicPanelActivity extends com.caij.puremusic.activities.base.AbsMusicServiceActivity implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.activities.base.AbsSlidingMusicPanelActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = null;
    private boolean isResume = false;
    private boolean fromNotification = false;
    private androidx.core.view.WindowInsetsCompat windowInsets;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy libraryViewModel$delegate = null;
    private com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehavior;
    private com.caij.puremusic.fragments.base.AbsPlayerFragment playerFragment;
    private com.caij.puremusic.fragments.other.MiniPlayerFragment miniPlayerFragment;
    private com.caij.puremusic.fragments.NowPlayingScreen nowPlayingScreen;
    private int taskColor = 0;
    private int paletteColor = android.graphics.Color.WHITE;
    private int navigationBarColor = 0;
    public com.caij.puremusic.databinding.SlidingMusicPanelLayoutBinding binding;
    private boolean isInOneTabMode = false;
    private android.animation.ValueAnimator navigationBarColorAnimator;
    private final android.animation.ArgbEvaluator argbEvaluator = null;
    private final kotlin.Lazy bottomSheetCallbackList$delegate = null;
    
    public AbsSlidingMusicPanelActivity() {
        super();
    }
    
    public final boolean getFromNotification() {
        return false;
    }
    
    public final void setFromNotification(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.caij.puremusic.fragments.LibraryViewModel getLibraryViewModel() {
        return null;
    }
    
    private final int getPanelState() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.caij.puremusic.databinding.SlidingMusicPanelLayoutBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.databinding.SlidingMusicPanelLayoutBinding p0) {
    }
    
    private final com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback getBottomSheetCallbackList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> getBottomSheetBehavior() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupBottomSheet() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void onSharedPreferenceChanged(@org.jetbrains.annotations.Nullable()
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.Nullable()
    java.lang.String key) {
    }
    
    public final void collapsePanel() {
    }
    
    public final void expandPanel() {
    }
    
    private final void setMiniPlayerAlphaProgress(float progress) {
    }
    
    private final void animateNavigationBarColor(int color) {
    }
    
    public void onPanelCollapsed() {
    }
    
    public void onPanelExpanded() {
    }
    
    private final void setupSlidingUpPanel() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.navigation.NavigationBarView getNavigationView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.FrameLayout getSlidingPanel() {
        return null;
    }
    
    public final boolean isBottomNavVisible() {
        return false;
    }
    
    @java.lang.Override()
    public void onServiceConnected() {
    }
    
    @java.lang.Override()
    public void onQueueChanged() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final boolean handleBackPress() {
        return false;
    }
    
    private final void onPaletteColorChanged() {
    }
    
    private final void setTaskDescColor(int color) {
    }
    
    public final void updateTabs() {
    }
    
    private final void updateColor() {
    }
    
    public final void setBottomNavVisibility(boolean visible, boolean animate, boolean hideBottomSheet) {
    }
    
    public final void hideBottomSheet(boolean hide, boolean animate, boolean isBottomNavVisible) {
    }
    
    public final void setAllowDragging(boolean allowDragging) {
    }
    
    private final void chooseFragmentForTheme() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/caij/puremusic/activities/base/AbsSlidingMusicPanelActivity$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "app_chinaRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG() {
            return null;
        }
    }
}