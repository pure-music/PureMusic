package com.caij.puremusic.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u00041234B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bH\u0002J\u0016\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000bH\u0002J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020!H\u0002J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&H\u0016J\u0018\u0010\'\u001a\u00020#2\u0006\u0010(\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&H\u0016J\u0018\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001bH\u0016J\u0018\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u001bH\u0016J\u0016\u0010/\u001a\u00020#2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lcom/caij/puremusic/adapter/HomeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/caij/puremusic/interfaces/IArtistClickListener;", "Lcom/caij/puremusic/interfaces/IAlbumClickListener;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "libraryViewModel", "Lcom/caij/puremusic/fragments/LibraryViewModel;", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/caij/puremusic/fragments/LibraryViewModel;)V", "list", "", "Lcom/caij/puremusic/model/Home;", "albumAdapter", "Lcom/caij/puremusic/adapter/album/AlbumAdapter;", "albums", "Lcom/caij/puremusic/db/model/Album;", "artistsAdapter", "Lcom/caij/puremusic/adapter/artist/ArtistAdapter;", "artists", "Lcom/caij/puremusic/db/model/Artist;", "getAlbumSongs", "Lcom/caij/puremusic/db/model/Song;", "id", "", "getArtistSongs", "getItemCount", "", "getItemViewType", "position", "gridLayoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "onAlbumClick", "", "albumId", "view", "Landroid/view/View;", "onArtist", "artistId", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "swapData", "sections", "AbsHomeViewItem", "AlbumViewHolder", "ArtistViewHolder", "PlaylistViewHolder", "app_chinaDebug"})
public final class HomeAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> implements com.caij.puremusic.interfaces.IArtistClickListener, com.caij.puremusic.interfaces.IAlbumClickListener {
    @org.jetbrains.annotations.NotNull()
    private final androidx.appcompat.app.AppCompatActivity activity = null;
    @org.jetbrains.annotations.NotNull()
    private final com.caij.puremusic.fragments.LibraryViewModel libraryViewModel = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.caij.puremusic.model.Home> list;
    
    public HomeAdapter(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.fragments.LibraryViewModel libraryViewModel) {
        super();
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void swapData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.model.Home> sections) {
    }
    
    private final com.caij.puremusic.adapter.artist.ArtistAdapter artistsAdapter(java.util.List<com.caij.puremusic.db.model.Artist> artists) {
        return null;
    }
    
    private final com.caij.puremusic.adapter.album.AlbumAdapter albumAdapter(java.util.List<com.caij.puremusic.db.model.Album> albums) {
        return null;
    }
    
    private final androidx.recyclerview.widget.GridLayoutManager gridLayoutManager() {
        return null;
    }
    
    private final androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager() {
        return null;
    }
    
    @java.lang.Override()
    public void onArtist(long artistId, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.caij.puremusic.db.model.Song> getArtistSongs(long id) {
        return null;
    }
    
    @java.lang.Override()
    public void onAlbumClick(long albumId, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.caij.puremusic.db.model.Song> getAlbumSongs(long id) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/caij/puremusic/adapter/HomeAdapter$AbsHomeViewItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "clickableArea", "Landroid/view/ViewGroup;", "getClickableArea", "()Landroid/view/ViewGroup;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "title", "Landroidx/appcompat/widget/AppCompatTextView;", "getTitle", "()Landroidx/appcompat/widget/AppCompatTextView;", "app_chinaDebug"})
    public static class AbsHomeViewItem extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final androidx.recyclerview.widget.RecyclerView recyclerView = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.appcompat.widget.AppCompatTextView title = null;
        @org.jetbrains.annotations.NotNull()
        private final android.view.ViewGroup clickableArea = null;
        
        public AbsHomeViewItem(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.RecyclerView getRecyclerView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.ViewGroup getClickableArea() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/caij/puremusic/adapter/HomeAdapter$AlbumViewHolder;", "Lcom/caij/puremusic/adapter/HomeAdapter$AbsHomeViewItem;", "view", "Landroid/view/View;", "(Lcom/caij/puremusic/adapter/HomeAdapter;Landroid/view/View;)V", "bindView", "", "home", "Lcom/caij/puremusic/model/Home;", "app_chinaDebug"})
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    final class AlbumViewHolder extends com.caij.puremusic.adapter.HomeAdapter.AbsHomeViewItem {
        
        public AlbumViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        public final void bindView(@org.jetbrains.annotations.NotNull()
        com.caij.puremusic.model.Home home) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/caij/puremusic/adapter/HomeAdapter$ArtistViewHolder;", "Lcom/caij/puremusic/adapter/HomeAdapter$AbsHomeViewItem;", "view", "Landroid/view/View;", "(Lcom/caij/puremusic/adapter/HomeAdapter;Landroid/view/View;)V", "bindView", "", "home", "Lcom/caij/puremusic/model/Home;", "app_chinaDebug"})
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    final class ArtistViewHolder extends com.caij.puremusic.adapter.HomeAdapter.AbsHomeViewItem {
        
        public ArtistViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        public final void bindView(@org.jetbrains.annotations.NotNull()
        com.caij.puremusic.model.Home home) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/caij/puremusic/adapter/HomeAdapter$PlaylistViewHolder;", "Lcom/caij/puremusic/adapter/HomeAdapter$AbsHomeViewItem;", "view", "Landroid/view/View;", "(Lcom/caij/puremusic/adapter/HomeAdapter;Landroid/view/View;)V", "bindView", "", "home", "Lcom/caij/puremusic/model/Home;", "app_chinaDebug"})
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    final class PlaylistViewHolder extends com.caij.puremusic.adapter.HomeAdapter.AbsHomeViewItem {
        
        public PlaylistViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        public final void bindView(@org.jetbrains.annotations.NotNull()
        com.caij.puremusic.model.Home home) {
        }
    }
}