package com.caij.puremusic.fragments.genres;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000f\u001a\u00020\u0002H\u0014J\b\u0010\u0010\u001a\u00020\u0003H\u0014J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u0014\u0010\u0006\u001a\u00020\u00078TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0014\u0010\r\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\t\u00a8\u0006 "}, d2 = {"Lcom/caij/puremusic/fragments/genres/GenresFragment;", "Lcom/caij/puremusic/fragments/base/AbsRecyclerViewFragment;", "Lcom/caij/puremusic/adapter/GenreAdapter;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Lcom/caij/puremusic/interfaces/IGenreClickListener;", "()V", "emptyMessage", "", "getEmptyMessage", "()I", "isShuffleVisible", "", "()Z", "titleRes", "getTitleRes", "createAdapter", "createLayoutManager", "onClickGenre", "", "genre", "Lcom/caij/puremusic/model/Genre;", "view", "Landroid/view/View;", "onCreateMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_chinaRelease"})
public final class GenresFragment extends com.caij.puremusic.fragments.base.AbsRecyclerViewFragment<com.caij.puremusic.adapter.GenreAdapter, androidx.recyclerview.widget.LinearLayoutManager> implements com.caij.puremusic.interfaces.IGenreClickListener {
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.fragments.genres.GenresFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmField()
    public static final java.lang.String TAG = null;
    
    public GenresFragment() {
        super();
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected androidx.recyclerview.widget.LinearLayoutManager createLayoutManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.caij.puremusic.adapter.GenreAdapter createAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreateMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
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
    @kotlin.jvm.JvmStatic()
    public static final com.caij.puremusic.fragments.genres.GenresFragment newInstance() {
        return null;
    }
    
    @java.lang.Override()
    public void onClickGenre(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.model.Genre genre, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/caij/puremusic/fragments/genres/GenresFragment$Companion;", "", "()V", "TAG", "", "newInstance", "Lcom/caij/puremusic/fragments/genres/GenresFragment;", "app_chinaRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.caij.puremusic.fragments.genres.GenresFragment newInstance() {
            return null;
        }
    }
}