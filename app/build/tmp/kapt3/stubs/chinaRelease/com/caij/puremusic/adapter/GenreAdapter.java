package com.caij.puremusic.adapter;

import java.lang.System;

/**
 * @author Hemanth S (h4h13).
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001 B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\n\u0010\u0014\u001a\u00060\u0002R\u00020\u0000H\u0002J\u001c\u0010\u0015\u001a\u00020\u00122\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0010H\u0016J\u001c\u0010\u001b\u001a\u00020\u00122\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0016\u0010\u001e\u001a\u00020\u00122\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/caij/puremusic/adapter/GenreAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/caij/puremusic/adapter/GenreAdapter$ViewHolder;", "activity", "Landroidx/fragment/app/FragmentActivity;", "dataSet", "", "Lcom/caij/puremusic/model/Genre;", "listener", "Lcom/caij/puremusic/interfaces/IGenreClickListener;", "(Landroidx/fragment/app/FragmentActivity;Ljava/util/List;Lcom/caij/puremusic/interfaces/IGenreClickListener;)V", "getDataSet", "()Ljava/util/List;", "setDataSet", "(Ljava/util/List;)V", "getItemCount", "", "loadGenreImage", "", "genre", "holder", "onBindViewHolder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setColors", "color", "Lcom/caij/puremusic/util/color/MediaNotificationProcessor;", "swapDataSet", "list", "ViewHolder", "app_chinaRelease"})
public final class GenreAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.caij.puremusic.adapter.GenreAdapter.ViewHolder> {
    private final androidx.fragment.app.FragmentActivity activity = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.caij.puremusic.model.Genre> dataSet;
    private final com.caij.puremusic.interfaces.IGenreClickListener listener = null;
    
    public GenreAdapter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.model.Genre> dataSet, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.interfaces.IGenreClickListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.caij.puremusic.model.Genre> getDataSet() {
        return null;
    }
    
    public final void setDataSet(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.model.Genre> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.caij.puremusic.adapter.GenreAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.adapter.GenreAdapter.ViewHolder holder, int position) {
    }
    
    private final void loadGenreImage(com.caij.puremusic.model.Genre genre, com.caij.puremusic.adapter.GenreAdapter.ViewHolder holder) {
    }
    
    private final void setColors(com.caij.puremusic.adapter.GenreAdapter.ViewHolder holder, com.caij.puremusic.util.color.MediaNotificationProcessor color) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void swapDataSet(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.model.Genre> list) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\f"}, d2 = {"Lcom/caij/puremusic/adapter/GenreAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "binding", "Lcom/caij/puremusic/databinding/ItemGenreBinding;", "(Lcom/caij/puremusic/adapter/GenreAdapter;Lcom/caij/puremusic/databinding/ItemGenreBinding;)V", "getBinding", "()Lcom/caij/puremusic/databinding/ItemGenreBinding;", "onClick", "", "v", "Landroid/view/View;", "app_chinaRelease"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private final com.caij.puremusic.databinding.ItemGenreBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.caij.puremusic.databinding.ItemGenreBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.databinding.ItemGenreBinding getBinding() {
            return null;
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.Nullable()
        android.view.View v) {
        }
    }
}