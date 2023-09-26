package com.caij.puremusic.fragments.songs;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 @2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001@B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000f\u001a\u00020\u0002H\u0014J\b\u0010\u0010\u001a\u00020\u0003H\u0014J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0007H\u0014J\b\u0010\u0019\u001a\u00020\u0007H\u0014J\b\u0010\u001a\u001a\u00020\u0007H\u0015J\b\u0010\u001b\u001a\u00020\u001cH\u0014J\u0018\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0017H\u0016J\u001a\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u001c2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010\'\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010(\u001a\u00020\u0017H\u0016J\b\u0010)\u001a\u00020\u0017H\u0016J\u001a\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0010\u0010/\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u0007H\u0014J\u0010\u00101\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u0007H\u0014J\u0012\u00102\u001a\u00020\u00172\b\b\u0001\u00103\u001a\u00020\u0007H\u0014J\u0010\u00104\u001a\u00020\u00172\u0006\u00105\u001a\u00020\u001cH\u0014J\u0010\u00106\u001a\u00020\u00172\u0006\u00107\u001a\u00020\u0007H\u0014J\u0010\u00108\u001a\u00020\u00172\u0006\u00105\u001a\u00020\u001cH\u0014J\u0010\u00109\u001a\u00020\u00172\u0006\u0010:\u001a\u00020;H\u0002J\u0010\u0010<\u001a\u00020\u00172\u0006\u0010=\u001a\u00020;H\u0002J\u0010\u0010>\u001a\u00020\u00172\u0006\u0010?\u001a\u00020;H\u0002R\u0014\u0010\u0006\u001a\u00020\u00078TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0014\u0010\r\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\t\u00a8\u0006A"}, d2 = {"Lcom/caij/puremusic/fragments/songs/SongsFragment;", "Lcom/caij/puremusic/fragments/base/AbsRecyclerViewCustomGridSizeFragment;", "Lcom/caij/puremusic/adapter/song/SongAdapter;", "Landroidx/recyclerview/widget/GridLayoutManager;", "Lcom/caij/puremusic/EventObserver;", "()V", "emptyMessage", "", "getEmptyMessage", "()I", "isShuffleVisible", "", "()Z", "titleRes", "getTitleRes", "createAdapter", "createLayoutManager", "handleGridSizeMenuItem", "item", "Landroid/view/MenuItem;", "handleLayoutResType", "handleSortOrderMenuItem", "loadData", "", "loadGridSize", "loadGridSizeLand", "loadLayoutRes", "loadSortOrder", "", "onCreateMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onDestroyView", "onEvent", "key", "value", "", "onMenuItemSelected", "onPause", "onShuffleClicked", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "saveGridSize", "gridColumns", "saveGridSizeLand", "saveLayoutRes", "layoutRes", "saveSortOrder", "sortOrder", "setGridSize", "gridSize", "setSortOrder", "setUpGridSizeMenu", "gridSizeMenu", "Landroid/view/SubMenu;", "setUpSortOrderMenu", "sortOrderMenu", "setupLayoutMenu", "subMenu", "Companion", "app_chinaDebug"})
public final class SongsFragment extends com.caij.puremusic.fragments.base.AbsRecyclerViewCustomGridSizeFragment<com.caij.puremusic.adapter.song.SongAdapter, androidx.recyclerview.widget.GridLayoutManager> implements com.caij.puremusic.EventObserver {
    @kotlin.jvm.JvmField()
    @org.jetbrains.annotations.NotNull()
    public static java.lang.String TAG;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.fragments.songs.SongsFragment.Companion Companion = null;
    
    public SongsFragment() {
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
    
    @java.lang.Override()
    public void onShuffleClicked() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected androidx.recyclerview.widget.GridLayoutManager createLayoutManager() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected com.caij.puremusic.adapter.song.SongAdapter createAdapter() {
        return null;
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
    protected void setGridSize(int gridSize) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected java.lang.String loadSortOrder() {
        return null;
    }
    
    @java.lang.Override()
    protected void saveSortOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String sortOrder) {
    }
    
    @java.lang.Override()
    @androidx.annotation.LayoutRes()
    protected int loadLayoutRes() {
        return 0;
    }
    
    @java.lang.Override()
    protected void saveLayoutRes(@androidx.annotation.LayoutRes()
    int layoutRes) {
    }
    
    @java.lang.Override()
    protected void setSortOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String sortOrder) {
    }
    
    @java.lang.Override()
    public void onCreateMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    private final void setUpSortOrderMenu(android.view.SubMenu sortOrderMenu) {
    }
    
    private final void setupLayoutMenu(android.view.SubMenu subMenu) {
    }
    
    private final void setUpGridSizeMenu(android.view.SubMenu gridSizeMenu) {
    }
    
    @java.lang.Override()
    public boolean onMenuItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final boolean handleSortOrderMenuItem(android.view.MenuItem item) {
        return false;
    }
    
    private final boolean handleLayoutResType(android.view.MenuItem item) {
        return false;
    }
    
    private final boolean handleGridSizeMenuItem(android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.Object value) {
    }
    
    @kotlin.jvm.JvmStatic()
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.fragments.songs.SongsFragment newInstance() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/caij/puremusic/fragments/songs/SongsFragment$Companion;", "", "()V", "TAG", "", "newInstance", "Lcom/caij/puremusic/fragments/songs/SongsFragment;", "app_chinaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.JvmStatic()
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.fragments.songs.SongsFragment newInstance() {
            return null;
        }
    }
}