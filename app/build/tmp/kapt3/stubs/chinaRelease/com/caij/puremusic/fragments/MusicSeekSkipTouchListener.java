package com.caij.puremusic.fragments;

import java.lang.System;

/**
 * @param activity, Activity
 * @param next, if the button is next, if false then it's considered previous
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J(\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0002J\u001c\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0017R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/caij/puremusic/fragments/MusicSeekSkipTouchListener;", "Landroid/view/View$OnTouchListener;", "activity", "Landroidx/fragment/app/FragmentActivity;", "next", "", "(Landroidx/fragment/app/FragmentActivity;Z)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "counter", "", "job", "Lkotlinx/coroutines/Job;", "getNext", "()Z", "scaledTouchSlop", "startX", "", "startY", "wasSeeking", "isAClick", "endX", "endY", "onTouch", "v", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "app_chinaRelease"})
public final class MusicSeekSkipTouchListener implements android.view.View.OnTouchListener {
    @org.jetbrains.annotations.NotNull()
    private final androidx.fragment.app.FragmentActivity activity = null;
    private final boolean next = false;
    private kotlinx.coroutines.Job job;
    private int counter = 0;
    private boolean wasSeeking = false;
    private float startX = 0.0F;
    private float startY = 0.0F;
    private final int scaledTouchSlop = 0;
    
    public MusicSeekSkipTouchListener(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, boolean next) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.fragment.app.FragmentActivity getActivity() {
        return null;
    }
    
    public final boolean getNext() {
        return false;
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    @java.lang.Override()
    public boolean onTouch(@org.jetbrains.annotations.Nullable()
    android.view.View v, @org.jetbrains.annotations.Nullable()
    android.view.MotionEvent event) {
        return false;
    }
    
    private final boolean isAClick(float startX, float endX, float startY, float endY) {
        return false;
    }
}