package com.caij.puremusic.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00ce\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0014\u0010\u001b\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0013J#\u0010\u001e\u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J!\u0010$\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J$\u0010%\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010&\u001a\u00020\'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013J\u0010\u0010)\u001a\u0004\u0018\u00010\u001a2\u0006\u0010*\u001a\u00020+J\u001a\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00130\f2\u0006\u0010-\u001a\u00020\bJ\u0016\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\f2\u0006\u0010/\u001a\u00020+J\u0010\u00100\u001a\u0004\u0018\u00010\u001d2\u0006\u0010*\u001a\u00020+J\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00130\f2\u0006\u0010-\u001a\u00020\bJ\u001f\u00101\u001a\b\u0012\u0004\u0012\u0002020\u00132\u0006\u0010&\u001a\u00020\'H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103J\u0006\u00104\u001a\u00020\u0018J\u0006\u00105\u001a\u00020\u0018J\u0019\u00106\u001a\u00020+2\u0006\u00107\u001a\u000202H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00108J\u0014\u00109\u001a\u00020:2\f\u0010;\u001a\b\u0012\u0004\u0012\u0002020\u0013J\u0014\u0010<\u001a\u00020\u00182\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013J\u0014\u0010=\u001a\u00020:2\f\u0010;\u001a\b\u0012\u0004\u0012\u0002020\u0013J\u0014\u0010>\u001a\u00020\u00182\f\u0010(\u001a\b\u0012\u0004\u0012\u00020?0\u0013J\u0014\u0010@\u001a\u00020\u00182\f\u0010(\u001a\b\u0012\u0004\u0012\u00020?0\u0013J\u0019\u0010A\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010BJ\u0011\u0010C\u001a\u000202H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010DJ\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013J\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010DJ\u0012\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0\u00130\fJ\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020J0\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010DJ\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00020L0\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010DJ!\u0010M\u001a\u0012\u0012\u0004\u0012\u00020N0\u0010j\b\u0012\u0004\u0012\u00020N`OH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010DJ\u0017\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010DJ$\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00160\u00132\u0006\u0010!\u001a\u00020\"2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013H\u0002J\u0014\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00160\u00132\u0006\u0010*\u001a\u00020+J\u0016\u0010S\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\f2\u0006\u0010/\u001a\u00020\'J\u0014\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00160\u00132\u0006\u0010*\u001a\u00020+J\u0017\u0010U\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010DJ\f\u0010V\u001a\b\u0012\u0004\u0012\u00020\b0\fJ\u0014\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00160X2\u0006\u0010Y\u001a\u00020+J\u0012\u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\fJ\u000e\u0010[\u001a\u00020\b2\u0006\u0010*\u001a\u00020+J\u001f\u0010\\\u001a\u00020\u00182\f\u0010(\u001a\b\u0012\u0004\u0012\u00020?0\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010]J\u001f\u0010^\u001a\b\u0012\u0004\u0012\u00020?0\u00132\u0006\u0010_\u001a\u00020?H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010`J\u0019\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020+H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010dJ\b\u0010e\u001a\u00020\u0018H\u0002J\u0012\u0010f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00130\fJ\b\u0010g\u001a\u00020\u0018H\u0016J\b\u0010h\u001a\u00020\u0018H\u0016J\b\u0010i\u001a\u00020\u0018H\u0016J\b\u0010j\u001a\u00020\u0018H\u0016J\b\u0010k\u001a\u00020\u0018H\u0016J\b\u0010l\u001a\u00020\u0018H\u0016J\b\u0010m\u001a\u00020\u0018H\u0016J\b\u0010n\u001a\u00020\u0018H\u0016J\b\u0010o\u001a\u00020\u0018H\u0016J\u0012\u0010p\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00130\fJ\u0019\u0010q\u001a\u00020\u00182\u0006\u0010r\u001a\u00020?H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010`J\u0016\u0010s\u001a\u00020:2\u0006\u0010Y\u001a\u00020+2\u0006\u0010t\u001a\u00020\'J\u0006\u0010u\u001a\u00020\u0018J\u0019\u0010v\u001a\u00020\u00182\u0006\u0010w\u001a\u00020xH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010yJ\u0018\u0010z\u001a\u00020:2\b\u0010{\u001a\u0004\u0018\u00010\'2\u0006\u0010|\u001a\u00020}J\u0016\u0010~\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u007f\u001a\u00020\bJ\u0007\u0010\u0080\u0001\u001a\u00020:J\"\u0010\u0081\u0001\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0010\u0010\u0082\u0001\u001a\u00020\u00182\u0007\u0010\u0083\u0001\u001a\u00020\bR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\b0\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00130\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0084\u0001"}, d2 = {"Lcom/caij/puremusic/fragments/LibraryViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/caij/puremusic/interfaces/IMusicServiceEventListener;", "repository", "Lcom/caij/puremusic/repository/RealRepository;", "(Lcom/caij/puremusic/repository/RealRepository;)V", "_paletteColor", "Landroidx/lifecycle/MutableLiveData;", "", "fabMargin", "kotlin.jvm.PlatformType", "paletteColor", "Landroidx/lifecycle/LiveData;", "getPaletteColor", "()Landroidx/lifecycle/LiveData;", "previousSongHistory", "Ljava/util/ArrayList;", "Lcom/caij/puremusic/db/model/HistoryEntity;", "searchResults", "", "", "songHistory", "Lcom/caij/puremusic/db/model/Song;", "addOrReplaceAlbum", "", "album", "Lcom/caij/puremusic/db/model/Album;", "addOrReplaceArtist", "artists", "Lcom/caij/puremusic/db/model/Artist;", "addSongServerSource", "context", "Landroid/content/Context;", "folder", "Lcom/caij/puremusic/db/model/Folder;", "(Landroid/content/Context;Lcom/caij/puremusic/db/model/Folder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addSongSource", "addToPlaylist", "playlistName", "", "songs", "albumById", "id", "", "albums", "type", "artist", "artistId", "artistById", "checkPlaylistExists", "Lcom/caij/puremusic/db/model/PlaylistEntity;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearHistory", "clearSearchResult", "createPlaylist", "playlistEntity", "(Lcom/caij/puremusic/db/model/PlaylistEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteRoomPlaylist", "Lkotlinx/coroutines/Job;", "playlists", "deleteSongs", "deleteSongsFromPlaylist", "deleteSongsInPlaylist", "Lcom/caij/puremusic/db/model/SongEntity;", "deleteSongsInPlaylistWithNofify", "deleteSource", "(Lcom/caij/puremusic/db/model/Folder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "favoritePlaylist", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "favorites", "fetchAlbums", "fetchContributors", "Lcom/caij/puremusic/model/Contributor;", "fetchGenres", "Lcom/caij/puremusic/model/Genre;", "fetchHomeSections", "Lcom/caij/puremusic/model/Home;", "fetchPlaylists", "Lcom/caij/puremusic/model/PlaylistWrapper;", "Lkotlin/collections/ArrayList;", "fetchSongs", "filterSongs", "getAlbumSongs", "getArtistByStrId", "getArtistSongs", "getArtists", "getFabMargin", "getPlaylistSongs", "", "playListId", "getSearchResult", "getSongCountBySourceId", "insertSongs", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isFavoriteSong", "song", "(Lcom/caij/puremusic/db/model/SongEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isSongFavorite", "", "songId", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyAllChange", "observableHistorySongs", "onFavoriteStateChanged", "onMediaStoreChanged", "onPlayStateChanged", "onPlayingMetaChanged", "onQueueChanged", "onRepeatModeChanged", "onServiceConnected", "onServiceDisconnected", "onShuffleModeChanged", "playCountSongs", "removeSongFromPlaylist", "songEntity", "renameRoomPlaylist", "name", "restoreHistory", "saveMediaInfo", "mediaInfos", "Lcom/caij/puremusic/drive/model/MediaInfoWrapper;", "(Lcom/caij/puremusic/drive/model/MediaInfoWrapper;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "query", "filter", "Lcom/caij/puremusic/fragments/search/Filter;", "setFabMargin", "bottomMargin", "shuffleSongs", "syncSource", "updateColor", "newColor", "app_chinaRelease"})
public final class LibraryViewModel extends androidx.lifecycle.ViewModel implements com.caij.puremusic.interfaces.IMusicServiceEventListener {
    private final com.caij.puremusic.repository.RealRepository repository = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _paletteColor = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.Object>> searchResults = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> fabMargin = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.caij.puremusic.db.model.Song>> songHistory = null;
    private java.util.ArrayList<com.caij.puremusic.db.model.HistoryEntity> previousSongHistory;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> paletteColor = null;
    
    public LibraryViewModel(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.repository.RealRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getPaletteColor() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addSongSource(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Folder folder, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object saveMediaInfo(com.caij.puremusic.drive.model.MediaInfoWrapper mediaInfos, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object addSongServerSource(android.content.Context context, com.caij.puremusic.db.model.Folder folder, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void notifyAllChange() {
    }
    
    public final void addOrReplaceArtist(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Artist> artists) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object syncSource(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Folder folder, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.util.List<com.caij.puremusic.db.model.Song> filterSongs(com.caij.puremusic.db.model.Folder folder, java.util.List<com.caij.puremusic.db.model.Song> songs) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteSource(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Folder folder, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<java.lang.Object>> getSearchResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getFabMargin() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchSongs(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.Song>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchAlbums(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.Album>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchPlaylists(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.ArrayList<com.caij.puremusic.model.PlaylistWrapper>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchGenres(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.model.Genre>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchHomeSections(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.model.Home>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job search(@org.jetbrains.annotations.Nullable()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.fragments.search.Filter filter) {
        return null;
    }
    
    public final void updateColor(int newColor) {
    }
    
    @java.lang.Override()
    public void onMediaStoreChanged() {
    }
    
    @java.lang.Override()
    public void onServiceConnected() {
    }
    
    @java.lang.Override()
    public void onServiceDisconnected() {
    }
    
    @java.lang.Override()
    public void onQueueChanged() {
    }
    
    @java.lang.Override()
    public void onPlayingMetaChanged() {
    }
    
    @java.lang.Override()
    public void onPlayStateChanged() {
    }
    
    @java.lang.Override()
    public void onRepeatModeChanged() {
    }
    
    @java.lang.Override()
    public void onShuffleModeChanged() {
    }
    
    @java.lang.Override()
    public void onFavoriteStateChanged() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job shuffleSongs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job renameRoomPlaylist(long playListId, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    public final void deleteSongsInPlaylistWithNofify(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.SongEntity> songs) {
    }
    
    public final void deleteSongsInPlaylist(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.SongEntity> songs) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteSongsFromPlaylist(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.PlaylistEntity> playlists) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteRoomPlaylist(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.PlaylistEntity> playlists) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.caij.puremusic.db.model.Album albumById(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.caij.puremusic.db.model.Artist artistById(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.caij.puremusic.db.model.Artist> getArtistByStrId(@org.jetbrains.annotations.NotNull()
    java.lang.String artistId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object favoritePlaylist(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.caij.puremusic.db.model.PlaylistEntity> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object isFavoriteSong(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.SongEntity song, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.SongEntity>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object isSongFavorite(long songId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.SongEntity> songs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object removeSongFromPlaylist(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.SongEntity songEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object checkPlaylistExists(java.lang.String playlistName, kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.PlaylistEntity>> continuation) {
        return null;
    }
    
    private final java.lang.Object createPlaylist(com.caij.puremusic.db.model.PlaylistEntity playlistEntity, kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.caij.puremusic.db.model.Song>> playCountSongs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.caij.puremusic.db.model.Artist>> artists(int type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.caij.puremusic.db.model.Album>> albums(int type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.caij.puremusic.db.model.Artist> artist(long artistId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.caij.puremusic.model.Contributor>> fetchContributors() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.caij.puremusic.db.model.Song>> observableHistorySongs() {
        return null;
    }
    
    public final void clearHistory() {
    }
    
    public final void restoreHistory() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.caij.puremusic.db.model.Song> favorites() {
        return null;
    }
    
    public final void clearSearchResult() {
    }
    
    public final void addToPlaylist(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String playlistName, @org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Song> songs) {
    }
    
    public final void setFabMargin(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int bottomMargin) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Collection<com.caij.puremusic.db.model.Song> getPlaylistSongs(long playListId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.caij.puremusic.db.model.Song> getAlbumSongs(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.caij.puremusic.db.model.Song> getArtistSongs(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getArtists(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.Artist>> continuation) {
        return null;
    }
    
    public final void addOrReplaceAlbum(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Album album) {
    }
    
    public final void deleteSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Song> songs) {
    }
    
    public final int getSongCountBySourceId(long id) {
        return 0;
    }
}