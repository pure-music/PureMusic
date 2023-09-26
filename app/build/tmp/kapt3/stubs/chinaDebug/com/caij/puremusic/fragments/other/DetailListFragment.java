package com.caij.puremusic.fragments.other;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u0016\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000fH\u0002J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001bH\u0002J\u0018\u0010$\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001bH\u0002J\b\u0010%\u001a\u00020!H\u0002J\b\u0010&\u001a\u00020!H\u0002J\u0018\u0010\'\u001a\u00020!2\u0006\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020*H\u0016J\u0018\u0010+\u001a\u00020!2\u0006\u0010,\u001a\u00020\u00182\u0006\u0010)\u001a\u00020*H\u0016J\u0012\u0010-\u001a\u00020!2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0018\u00100\u001a\u00020!2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u00020!H\u0016J\u0010\u00106\u001a\u00020\u000b2\u0006\u00107\u001a\u000208H\u0016J\u001a\u00109\u001a\u00020!2\u0006\u0010)\u001a\u00020*2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u0010:\u001a\u00020!H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006;"}, d2 = {"Lcom/caij/puremusic/fragments/other/DetailListFragment;", "Lcom/caij/puremusic/fragments/base/AbsMainActivityFragment;", "Lcom/caij/puremusic/interfaces/IArtistClickListener;", "Lcom/caij/puremusic/interfaces/IAlbumClickListener;", "()V", "_binding", "Lcom/caij/puremusic/databinding/FragmentPlaylistDetailBinding;", "binding", "getBinding", "()Lcom/caij/puremusic/databinding/FragmentPlaylistDetailBinding;", "showClearHistoryOption", "", "albumAdapter", "Lcom/caij/puremusic/adapter/album/AlbumAdapter;", "albums", "", "Lcom/caij/puremusic/db/model/Album;", "artistAdapter", "Lcom/caij/puremusic/adapter/artist/ArtistAdapter;", "artists", "Lcom/caij/puremusic/db/model/Artist;", "getAlbumSongs", "Lcom/caij/puremusic/db/model/Song;", "id", "", "getArtistSongs", "gridCount", "", "gridLayoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "loadAlbums", "", "title", "type", "loadArtists", "loadFavorite", "loadHistory", "onAlbumClick", "albumId", "view", "Landroid/view/View;", "onArtist", "artistId", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onDestroyView", "onMenuItemSelected", "item", "Landroid/view/MenuItem;", "onViewCreated", "topPlayed", "app_chinaDebug"})
public final class DetailListFragment extends com.caij.puremusic.fragments.base.AbsMainActivityFragment implements com.caij.puremusic.interfaces.IArtistClickListener, com.caij.puremusic.interfaces.IAlbumClickListener {
    @org.jetbrains.annotations.Nullable()
    private com.caij.puremusic.databinding.FragmentPlaylistDetailBinding _binding;
    private boolean showClearHistoryOption = false;
    
    public DetailListFragment() {
        super(0);
    }
    
    private final com.caij.puremusic.databinding.FragmentPlaylistDetailBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void topPlayed() {
    }
    
    private final void loadHistory() {
    }
    
    private final void loadFavorite() {
    }
    
    private final void loadArtists(int title, int type) {
    }
    
    private final void loadAlbums(int title, int type) {
    }
    
    private final com.caij.puremusic.adapter.artist.ArtistAdapter artistAdapter(java.util.List<com.caij.puremusic.db.model.Artist> artists) {
        return null;
    }
    
    private final com.caij.puremusic.adapter.album.AlbumAdapter albumAdapter(java.util.List<com.caij.puremusic.db.model.Album> albums) {
        return null;
    }
    
    private final androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager() {
        return null;
    }
    
    private final androidx.recyclerview.widget.GridLayoutManager gridLayoutManager() {
        return null;
    }
    
    private final int gridCount() {
        return 0;
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
    
    @java.lang.Override()
    public void onDestroyView() {
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
}