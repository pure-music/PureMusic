package com.caij.puremusic.fragments.home;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 12\u00020\u00012\u00020\u00022\u00020\u0003:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\u0006\u0010\u000f\u001a\u00020\rJ\b\u0010\u0010\u001a\u00020\rH\u0002J\b\u0010\u0011\u001a\u00020\rH\u0002J\u0016\u0010\u0012\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\rH\u0016J\u001a\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010&\u001a\u00020\rH\u0016J\u001a\u0010\'\u001a\u00020\r2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020\rH\u0016J\u0006\u0010-\u001a\u00020\rJ\u0006\u0010.\u001a\u00020\rJ\b\u0010/\u001a\u00020\rH\u0002J\b\u00100\u001a\u00020\rH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/caij/puremusic/fragments/home/HomeFragment;", "Lcom/caij/puremusic/fragments/base/AbsMainActivityFragment;", "Lcom/caij/puremusic/interfaces/IScrollHelper;", "Lcom/caij/puremusic/EventObserver;", "()V", "_binding", "Lcom/caij/puremusic/fragments/home/HomeBinding;", "binding", "getBinding", "()Lcom/caij/puremusic/fragments/home/HomeBinding;", "homeAdapter", "Lcom/caij/puremusic/adapter/HomeAdapter;", "adjustPlaylistButtons", "", "checkForMargins", "colorButtons", "loadProfile", "loadSections", "loadSuggestions", "songs", "", "Lcom/caij/puremusic/db/model/Song;", "onCreateMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onDestroyView", "onEvent", "key", "", "value", "", "onMenuItemSelected", "", "item", "Landroid/view/MenuItem;", "onPrepareMenu", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "scrollToTop", "setSharedAxisXTransitions", "setSharedAxisYTransitions", "setupListeners", "setupTitle", "Companion", "app_chinaDebug"})
public final class HomeFragment extends com.caij.puremusic.fragments.base.AbsMainActivityFragment implements com.caij.puremusic.interfaces.IScrollHelper, com.caij.puremusic.EventObserver {
    private com.caij.puremusic.adapter.HomeAdapter homeAdapter;
    @org.jetbrains.annotations.Nullable()
    private com.caij.puremusic.fragments.home.HomeBinding _binding;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "BannerHomeFragment";
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.fragments.home.HomeFragment.Companion Companion = null;
    
    public HomeFragment() {
        super(0);
    }
    
    private final com.caij.puremusic.fragments.home.HomeBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void loadSections() {
    }
    
    private final void adjustPlaylistButtons() {
    }
    
    private final void setupListeners() {
    }
    
    private final void setupTitle() {
    }
    
    private final void loadProfile() {
    }
    
    public final void colorButtons() {
    }
    
    private final void checkForMargins() {
    }
    
    @java.lang.Override()
    public void onCreateMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public void scrollToTop() {
    }
    
    public final void setSharedAxisXTransitions() {
    }
    
    public final void setSharedAxisYTransitions() {
    }
    
    private final void loadSuggestions(java.util.List<com.caij.puremusic.db.model.Song> songs) {
    }
    
    @java.lang.Override()
    public boolean onMenuItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onPrepareMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
    }
    
    @java.lang.Override()
    public void onResume() {
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
    public static final com.caij.puremusic.fragments.home.HomeFragment newInstance() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/caij/puremusic/fragments/home/HomeFragment$Companion;", "", "()V", "TAG", "", "newInstance", "Lcom/caij/puremusic/fragments/home/HomeFragment;", "app_chinaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.JvmStatic()
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.fragments.home.HomeFragment newInstance() {
            return null;
        }
    }
}