package com.caij.puremusic.fragments.genres;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0013H\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u001a\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u0010(\u001a\u00020\u0013H\u0002J\u0014\u0010)\u001a\u00020\u00132\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/caij/puremusic/fragments/genres/GenreDetailsFragment;", "Lcom/caij/puremusic/fragments/base/AbsMainActivityFragment;", "()V", "_binding", "Lcom/caij/puremusic/databinding/FragmentPlaylistDetailBinding;", "binding", "getBinding", "()Lcom/caij/puremusic/databinding/FragmentPlaylistDetailBinding;", "detailsViewModel", "Lcom/caij/puremusic/fragments/genres/GenreDetailsViewModel;", "getDetailsViewModel", "()Lcom/caij/puremusic/fragments/genres/GenreDetailsViewModel;", "detailsViewModel$delegate", "Lkotlin/Lazy;", "genre", "Lcom/caij/puremusic/model/Genre;", "songAdapter", "Lcom/caij/puremusic/adapter/song/SongAdapter;", "checkForPadding", "", "checkIsEmpty", "getEmojiByUnicode", "", "unicode", "", "onCreateMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onDestroyView", "onMenuItemSelected", "", "item", "Landroid/view/MenuItem;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupRecyclerView", "songs", "", "Lcom/caij/puremusic/db/model/Song;", "app_chinaDebug"})
public final class GenreDetailsFragment extends com.caij.puremusic.fragments.base.AbsMainActivityFragment {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy detailsViewModel$delegate = null;
    private com.caij.puremusic.model.Genre genre;
    private com.caij.puremusic.adapter.song.SongAdapter songAdapter;
    @org.jetbrains.annotations.Nullable()
    private com.caij.puremusic.databinding.FragmentPlaylistDetailBinding _binding;
    
    public GenreDetailsFragment() {
        super(0);
    }
    
    private final com.caij.puremusic.fragments.genres.GenreDetailsViewModel getDetailsViewModel() {
        return null;
    }
    
    private final com.caij.puremusic.databinding.FragmentPlaylistDetailBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupRecyclerView() {
    }
    
    public final void songs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Song> songs) {
    }
    
    private final java.lang.String getEmojiByUnicode(int unicode) {
        return null;
    }
    
    private final void checkIsEmpty() {
    }
    
    private final void checkForPadding() {
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
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}