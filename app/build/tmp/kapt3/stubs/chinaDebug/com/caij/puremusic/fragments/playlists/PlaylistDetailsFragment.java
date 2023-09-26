package com.caij.puremusic.fragments.playlists;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0006\u0010\u0019\u001a\u00020\u0018J\u0012\u0010\u001a\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0018H\u0016J\b\u0010#\u001a\u00020\u0018H\u0016J\u001a\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020\u0018H\u0016J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0016J\u001a\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u0002002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0014\u00101\u001a\u00020\u00182\f\u00102\u001a\b\u0012\u0004\u0012\u00020403J\b\u00105\u001a\u00020\u0018H\u0002J\b\u00106\u001a\u00020\u0018H\u0002J\u0014\u00107\u001a\u00020\u00182\f\u00107\u001a\b\u0012\u0004\u0012\u00020803R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\u00a8\u00069"}, d2 = {"Lcom/caij/puremusic/fragments/playlists/PlaylistDetailsFragment;", "Lcom/caij/puremusic/fragments/base/AbsMainActivityFragment;", "Lcom/caij/puremusic/EventObserver;", "()V", "_binding", "Lcom/caij/puremusic/databinding/FragmentPlaylistDetailBinding;", "binding", "getBinding", "()Lcom/caij/puremusic/databinding/FragmentPlaylistDetailBinding;", "mRoomRepository", "Lcom/caij/puremusic/repository/RoomRepository;", "playlistId", "", "playlistSongAdapter", "Lcom/caij/puremusic/adapter/song/OrderablePlaylistSongAdapter;", "playlistWithSongs", "Lcom/caij/puremusic/db/PlaylistWithSongs;", "viewModel", "Lcom/caij/puremusic/fragments/playlists/PlaylistDetailsViewModel;", "getViewModel", "()Lcom/caij/puremusic/fragments/playlists/PlaylistDetailsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "checkIsEmpty", "", "loadData", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onDestroy", "onDestroyView", "onEvent", "key", "", "value", "", "onFavoriteStateChanged", "onMenuItemSelected", "", "item", "Landroid/view/MenuItem;", "onViewCreated", "view", "Landroid/view/View;", "resetDBSongEntity", "dataSet", "", "Lcom/caij/puremusic/db/model/SongEntity;", "setUpRecyclerView", "showEmptyView", "songs", "Lcom/caij/puremusic/db/model/Song;", "app_chinaDebug"})
public final class PlaylistDetailsFragment extends com.caij.puremusic.fragments.base.AbsMainActivityFragment implements com.caij.puremusic.EventObserver {
    private long playlistId = 0L;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.caij.puremusic.repository.RoomRepository mRoomRepository = null;
    @org.jetbrains.annotations.Nullable()
    private com.caij.puremusic.databinding.FragmentPlaylistDetailBinding _binding;
    private com.caij.puremusic.db.PlaylistWithSongs playlistWithSongs;
    private com.caij.puremusic.adapter.song.OrderablePlaylistSongAdapter playlistSongAdapter;
    
    public PlaylistDetailsFragment() {
        super(0);
    }
    
    private final com.caij.puremusic.fragments.playlists.PlaylistDetailsViewModel getViewModel() {
        return null;
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
    
    public final void loadData() {
    }
    
    public final void resetDBSongEntity(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.SongEntity> dataSet) {
    }
    
    @java.lang.Override()
    public void onFavoriteStateChanged() {
    }
    
    private final void setUpRecyclerView() {
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
    
    private final void checkIsEmpty() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void showEmptyView() {
    }
    
    public final void songs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Song> songs) {
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