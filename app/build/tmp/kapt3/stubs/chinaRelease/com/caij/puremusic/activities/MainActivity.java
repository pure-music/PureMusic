package com.caij.puremusic.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000  2\u00020\u0001:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0012\u0010\u0012\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u0013\u001a\u00020\fH\u0016J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\bH\u0002J\b\u0010\u001b\u001a\u00020\fH\u0002J\b\u0010\u001c\u001a\u00020\fH\u0002J\b\u0010\u001d\u001a\u00020\fH\u0002J\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/caij/puremusic/activities/MainActivity;", "Lcom/caij/puremusic/activities/base/AbsCastActivity;", "()V", "lastShowFragment", "Landroidx/fragment/app/Fragment;", "musicFolderUtil", "Lcom/caij/puremusic/fragments/folder/manager/MusicFolderUtil;", "findCategoryId", "", "menuId", "getLastFragment", "handlePlaybackIntent", "", "intent", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "onServiceConnected", "parseLongFromIntent", "", "longKey", "", "stringKey", "saveTab", "categoryId", "setupNavigationController", "showFolderHint", "showPrivacy", "toFragment", "id", "Companion", "app_chinaRelease"})
public final class MainActivity extends com.caij.puremusic.activities.base.AbsCastActivity {
    private androidx.fragment.app.Fragment lastShowFragment;
    private com.caij.puremusic.fragments.folder.manager.MusicFolderUtil musicFolderUtil;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.activities.MainActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "MainActivity";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXPAND_PANEL = "expand_panel";
    
    public MainActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showFolderHint() {
    }
    
    private final void showPrivacy() {
    }
    
    private final void setupNavigationController() {
    }
    
    private final void toFragment(int id) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.fragment.app.Fragment getLastFragment() {
        return null;
    }
    
    private final int findCategoryId(int menuId) {
        return 0;
    }
    
    private final void saveTab(int categoryId) {
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    @java.lang.Override()
    public void onServiceConnected() {
    }
    
    private final void handlePlaybackIntent(android.content.Intent intent) {
    }
    
    private final long parseLongFromIntent(android.content.Intent intent, java.lang.String longKey, java.lang.String stringKey) {
        return 0L;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/caij/puremusic/activities/MainActivity$Companion;", "", "()V", "EXPAND_PANEL", "", "TAG", "app_chinaRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}