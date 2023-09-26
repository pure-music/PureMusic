package com.caij.puremusic.fragments;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00d6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0014\u0010\u001b\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0013J!\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J)\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J$\u0010(\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&2\u0006\u0010)\u001a\u00020*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013J\u0010\u0010,\u001a\u0004\u0018\u00010\u001a2\u0006\u0010-\u001a\u00020.J\u001a\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00130\f2\u0006\u00100\u001a\u00020\bJ\u0016\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\f2\u0006\u00102\u001a\u00020.J\u0010\u00103\u001a\u0004\u0018\u00010\u001d2\u0006\u0010-\u001a\u00020.J\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00130\f2\u0006\u00100\u001a\u00020\bJ\u001f\u00104\u001a\b\u0012\u0004\u0012\u0002050\u00132\u0006\u0010)\u001a\u00020*H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00106J\u0006\u00107\u001a\u00020\u0018J\u0006\u00108\u001a\u00020\u0018J\u0019\u00109\u001a\u00020.2\u0006\u0010:\u001a\u000205H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010;J\u0014\u0010<\u001a\u00020=2\f\u0010>\u001a\b\u0012\u0004\u0012\u0002050\u0013J\u0014\u0010?\u001a\u00020\u00182\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013J\u0014\u0010@\u001a\u00020=2\f\u0010>\u001a\b\u0012\u0004\u0012\u0002050\u0013J\u0014\u0010A\u001a\u00020\u00182\f\u0010+\u001a\b\u0012\u0004\u0012\u00020B0\u0013J\u0014\u0010C\u001a\u00020\u00182\f\u0010+\u001a\b\u0012\u0004\u0012\u00020B0\u0013J\u0019\u0010D\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010EJ\u0011\u0010F\u001a\u000205H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010GJ\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013J\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010GJ\u0012\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0\u00130\fJ\u0017\u0010L\u001a\b\u0012\u0004\u0012\u00020M0\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010GJ\u0017\u0010N\u001a\b\u0012\u0004\u0012\u00020O0\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010GJ!\u0010P\u001a\u0012\u0012\u0004\u0012\u00020Q0\u0010j\b\u0012\u0004\u0012\u00020Q`RH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010GJ\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010GJ$\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00160\u00132\u0006\u0010\u001f\u001a\u00020 2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013H\u0002J\u0014\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00160\u00132\u0006\u0010-\u001a\u00020.J\u0016\u0010V\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\f2\u0006\u00102\u001a\u00020*J\u0014\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00160\u00132\u0006\u0010-\u001a\u00020.J\u0017\u0010X\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010GJ\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\b0\fJ\u0014\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00160[2\u0006\u0010\\\u001a\u00020.J\u0012\u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\fJ\u000e\u0010^\u001a\u00020\b2\u0006\u0010-\u001a\u00020.J\u001f\u0010_\u001a\u00020\u00182\f\u0010+\u001a\b\u0012\u0004\u0012\u00020B0\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010`J\u001f\u0010a\u001a\b\u0012\u0004\u0012\u00020B0\u00132\u0006\u0010b\u001a\u00020BH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010cJ\u0019\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020.H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010gJ\b\u0010h\u001a\u00020\u0018H\u0002J\u0012\u0010i\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00130\fJ\b\u0010j\u001a\u00020\u0018H\u0016J\b\u0010k\u001a\u00020\u0018H\u0016J\b\u0010l\u001a\u00020\u0018H\u0016J\b\u0010m\u001a\u00020\u0018H\u0016J\b\u0010n\u001a\u00020\u0018H\u0016J\b\u0010o\u001a\u00020\u0018H\u0016J\b\u0010p\u001a\u00020\u0018H\u0016J\b\u0010q\u001a\u00020\u0018H\u0016J\b\u0010r\u001a\u00020\u0018H\u0016J\u0012\u0010s\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00130\fJ\u0019\u0010t\u001a\u00020\u00182\u0006\u0010u\u001a\u00020BH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010cJ\u0016\u0010v\u001a\u00020=2\u0006\u0010\\\u001a\u00020.2\u0006\u0010w\u001a\u00020*J\u0006\u0010x\u001a\u00020\u0018J\u0019\u0010y\u001a\u00020\u00182\u0006\u0010z\u001a\u00020{H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010|J\u0019\u0010}\u001a\u00020=2\b\u0010~\u001a\u0004\u0018\u00010*2\u0007\u0010\u007f\u001a\u00030\u0080\u0001J\u0018\u0010\u0081\u0001\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&2\u0007\u0010\u0082\u0001\u001a\u00020\bJ\u0019\u0010\u0083\u0001\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&2\u0006\u0010-\u001a\u00020\bH\u0002J\u0007\u0010\u0084\u0001\u001a\u00020=J*\u0010\u0085\u0001\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u0010\u0010\u0086\u0001\u001a\u00020\u00182\u0007\u0010\u0087\u0001\u001a\u00020\bR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\b0\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00130\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0088\u0001"}, d2 = {"Lcom/caij/puremusic/fragments/LibraryViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/caij/puremusic/interfaces/IMusicServiceEventListener;", "repository", "Lcom/caij/puremusic/repository/RealRepository;", "(Lcom/caij/puremusic/repository/RealRepository;)V", "_paletteColor", "Landroidx/lifecycle/MutableLiveData;", "", "fabMargin", "kotlin.jvm.PlatformType", "paletteColor", "Landroidx/lifecycle/LiveData;", "getPaletteColor", "()Landroidx/lifecycle/LiveData;", "previousSongHistory", "Ljava/util/ArrayList;", "Lcom/caij/puremusic/db/model/HistoryEntity;", "searchResults", "", "", "songHistory", "Lcom/caij/puremusic/db/model/Song;", "addOrReplaceAlbum", "", "album", "Lcom/caij/puremusic/db/model/Album;", "addOrReplaceArtist", "artists", "Lcom/caij/puremusic/db/model/Artist;", "addSongServerSource", "folder", "Lcom/caij/puremusic/db/model/Folder;", "syncCallback", "Lcom/caij/puremusic/drive/SyncCallback;", "(Lcom/caij/puremusic/db/model/Folder;Lcom/caij/puremusic/drive/SyncCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addSongSource", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lcom/caij/puremusic/db/model/Folder;Lcom/caij/puremusic/drive/SyncCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addToPlaylist", "playlistName", "", "songs", "albumById", "id", "", "albums", "type", "artist", "artistId", "artistById", "checkPlaylistExists", "Lcom/caij/puremusic/db/model/PlaylistEntity;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearHistory", "clearSearchResult", "createPlaylist", "playlistEntity", "(Lcom/caij/puremusic/db/model/PlaylistEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteRoomPlaylist", "Lkotlinx/coroutines/Job;", "playlists", "deleteSongs", "deleteSongsFromPlaylist", "deleteSongsInPlaylist", "Lcom/caij/puremusic/db/model/SongEntity;", "deleteSongsInPlaylistWithNofify", "deleteSource", "(Lcom/caij/puremusic/db/model/Folder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "favoritePlaylist", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "favorites", "fetchAlbums", "fetchContributors", "Lcom/caij/puremusic/model/Contributor;", "fetchGenres", "Lcom/caij/puremusic/model/Genre;", "fetchHomeSections", "Lcom/caij/puremusic/model/Home;", "fetchPlaylists", "Lcom/caij/puremusic/model/PlaylistWrapper;", "Lkotlin/collections/ArrayList;", "fetchSongs", "filterSongs", "getAlbumSongs", "getArtistByStrId", "getArtistSongs", "getArtists", "getFabMargin", "getPlaylistSongs", "", "playListId", "getSearchResult", "getSongCountBySourceId", "insertSongs", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isFavoriteSong", "song", "(Lcom/caij/puremusic/db/model/SongEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isSongFavorite", "", "songId", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyAllChange", "observableHistorySongs", "onFavoriteStateChanged", "onMediaStoreChanged", "onPlayStateChanged", "onPlayingMetaChanged", "onQueueChanged", "onRepeatModeChanged", "onServiceConnected", "onServiceDisconnected", "onShuffleModeChanged", "playCountSongs", "removeSongFromPlaylist", "songEntity", "renameRoomPlaylist", "name", "restoreHistory", "saveMediaInfo", "mediaInfos", "Lcom/caij/puremusic/drive/model/MediaInfoWrapper;", "(Lcom/caij/puremusic/drive/model/MediaInfoWrapper;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "query", "filter", "Lcom/caij/puremusic/fragments/search/Filter;", "setFabMargin", "bottomMargin", "showToast", "shuffleSongs", "syncSource", "updateColor", "newColor", "app_chinaDebug"})
public final class LibraryViewModel extends androidx.lifecycle.ViewModel implements com.caij.puremusic.interfaces.IMusicServiceEventListener {
    @org.jetbrains.annotations.NotNull()
    private final com.caij.puremusic.repository.RealRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _paletteColor = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.Object>> searchResults = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> fabMargin = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.caij.puremusic.db.model.Song>> songHistory = null;
    @org.jetbrains.annotations.NotNull()
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
    com.caij.puremusic.drive.SyncCallback syncCallback, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object saveMediaInfo(com.caij.puremusic.drive.model.MediaInfoWrapper mediaInfos, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object addSongServerSource(com.caij.puremusic.db.model.Folder folder, com.caij.puremusic.drive.SyncCallback syncCallback, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
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
    com.caij.puremusic.drive.SyncCallback syncCallback, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final void showToast(android.content.Context context, int id) {
    }
    
    private final java.util.List<com.caij.puremusic.db.model.Song> filterSongs(com.caij.puremusic.db.model.Folder folder, java.util.List<com.caij.puremusic.db.model.Song> songs) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteSource(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Folder folder, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
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
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.Song>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchAlbums(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.Album>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchPlaylists(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.ArrayList<com.caij.puremusic.model.PlaylistWrapper>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchGenres(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.model.Genre>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchHomeSections(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.model.Home>> $completion) {
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
    kotlin.coroutines.Continuation<? super com.caij.puremusic.db.model.PlaylistEntity> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object isFavoriteSong(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.SongEntity song, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.SongEntity>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object isSongFavorite(long songId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.SongEntity> songs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object removeSongFromPlaylist(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.SongEntity songEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object checkPlaylistExists(java.lang.String playlistName, kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.PlaylistEntity>> $completion) {
        return null;
    }
    
    private final java.lang.Object createPlaylist(com.caij.puremusic.db.model.PlaylistEntity playlistEntity, kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
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
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.Artist>> $completion) {
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