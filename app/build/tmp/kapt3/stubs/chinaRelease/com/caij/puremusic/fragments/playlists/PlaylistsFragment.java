package com.caij.puremusic.fragments.playlists;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0010\u001a\u00020\u0002H\u0014J(\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\fH\u0002J\b\u0010\u0018\u001a\u00020\u0003H\u0014J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010\"\u001a\u00020\u0012H\u0002J\b\u0010#\u001a\u00020\bH\u0014J\b\u0010$\u001a\u00020\bH\u0014J\b\u0010%\u001a\u00020\bH\u0014J\b\u0010&\u001a\u00020\'H\u0014J\u0018\u0010(\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020\u0012H\u0016J\u001a\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\'2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0010\u00101\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0018\u00102\u001a\u00020\u00122\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0016J\u001a\u00107\u001a\u00020\u00122\u0006\u00105\u001a\u0002062\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u0010\u0010:\u001a\u00020\u00122\u0006\u0010;\u001a\u00020\bH\u0014J\u0010\u0010<\u001a\u00020\u00122\u0006\u0010;\u001a\u00020\bH\u0014J\u0010\u0010=\u001a\u00020\u00122\u0006\u0010>\u001a\u00020\bH\u0014J\u0010\u0010?\u001a\u00020\u00122\u0006\u0010@\u001a\u00020\'H\u0014J\u0010\u0010A\u001a\u00020\u00122\u0006\u0010B\u001a\u00020\bH\u0014J\u0010\u0010C\u001a\u00020\u00122\u0006\u0010@\u001a\u00020\'H\u0014J\u0010\u0010D\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u0014H\u0002J\u0010\u0010F\u001a\u00020\u00122\u0006\u0010G\u001a\u00020\u0014H\u0002R\u0014\u0010\u0007\u001a\u00020\b8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u0014\u0010\u000e\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\n\u00a8\u0006H"}, d2 = {"Lcom/caij/puremusic/fragments/playlists/PlaylistsFragment;", "Lcom/caij/puremusic/fragments/base/AbsRecyclerViewCustomGridSizeFragment;", "Lcom/caij/puremusic/adapter/playlist/PlaylistAdapter;", "Landroidx/recyclerview/widget/GridLayoutManager;", "Lcom/caij/puremusic/interfaces/IPlaylistClickListener;", "Lcom/caij/puremusic/EventObserver;", "()V", "emptyMessage", "", "getEmptyMessage", "()I", "isShuffleVisible", "", "()Z", "titleRes", "getTitleRes", "createAdapter", "createId", "", "menu", "Landroid/view/SubMenu;", "id", "title", "checked", "createLayoutManager", "getPlaylistSongs", "", "Lcom/caij/puremusic/db/model/Song;", "playListId", "", "handleGridSizeMenuItem", "item", "Landroid/view/MenuItem;", "handleSortOrderMenuItem", "loadData", "loadGridSize", "loadGridSizeLand", "loadLayoutRes", "loadSortOrder", "", "onCreateMenu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onDestroyView", "onEvent", "key", "value", "", "onMenuItemSelected", "onPlaylistClick", "playlistWithSongs", "Lcom/caij/puremusic/model/PlaylistWrapper;", "view", "Landroid/view/View;", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "saveGridSize", "gridColumns", "saveGridSizeLand", "saveLayoutRes", "layoutRes", "saveSortOrder", "sortOrder", "setGridSize", "gridSize", "setSortOrder", "setUpSortOrderMenu", "subMenu", "setupGridSizeMenu", "gridSizeMenu", "app_chinaRelease"})
public final class PlaylistsFragment extends com.caij.puremusic.fragments.base.AbsRecyclerViewCustomGridSizeFragment<com.caij.puremusic.adapter.playlist.PlaylistAdapter, androidx.recyclerview.widget.GridLayoutManager> implements com.caij.puremusic.interfaces.IPlaylistClickListener, com.caij.puremusic.EventObserver {
    
    public PlaylistsFragment() {
        super();
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void loadData() {
    }
    
    @java.lang.Override()
    public int getTitleRes() {
        return 0;
    }
    
    @java.lang.Override()
    protected int getEmptyMessage() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean isShuffleVisible() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected androidx.recyclerview.widget.GridLayoutManager createLayoutManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.caij.puremusic.adapter.playlist.PlaylistAdapter createAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreateMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onMenuItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void setupGridSizeMenu(android.view.SubMenu gridSizeMenu) {
    }
    
    private final void setUpSortOrderMenu(android.view.SubMenu subMenu) {
    }
    
    private final boolean handleSortOrderMenuItem(android.view.MenuItem item) {
        return false;
    }
    
    private final boolean handleGridSizeMenuItem(android.view.MenuItem item) {
        return false;
    }
    
    private final void createId(android.view.SubMenu menu, int id, int title, boolean checked) {
    }
    
    @java.lang.Override()
    protected void setGridSize(int gridSize) {
    }
    
    @java.lang.Override()
    protected void setSortOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String sortOrder) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.lang.String loadSortOrder() {
        return null;
    }
    
    @java.lang.Override()
    protected void saveSortOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String sortOrder) {
    }
    
    @java.lang.Override()
    protected int loadGridSize() {
        return 0;
    }
    
    @java.lang.Override()
    protected void saveGridSize(int gridColumns) {
    }
    
    @java.lang.Override()
    protected int loadGridSizeLand() {
        return 0;
    }
    
    @java.lang.Override()
    protected void saveGridSizeLand(int gridColumns) {
    }
    
    @java.lang.Override()
    protected int loadLayoutRes() {
        return 0;
    }
    
    @java.lang.Override()
    protected void saveLayoutRes(int layoutRes) {
    }
    
    @java.lang.Override()
    public void onPlaylistClick(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.model.PlaylistWrapper playlistWithSongs, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Collection<com.caij.puremusic.db.model.Song> getPlaylistSongs(long playListId) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.Object value) {
    }
}