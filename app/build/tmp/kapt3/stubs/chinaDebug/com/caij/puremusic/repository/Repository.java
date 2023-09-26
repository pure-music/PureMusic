package com.caij.puremusic.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00a6\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0019\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u0014H&J\'\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0010H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001c\u001a\u00020\u0014H&J3\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00162\u0006\u0010\f\u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\r2\b\u0010 \u001a\u0004\u0018\u00010\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0014H&J\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020%0\u00102\u0006\u0010&\u001a\u00020\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001f\u0010\'\u001a\b\u0012\u0004\u0012\u00020(0\u00102\u0006\u0010)\u001a\u00020\u0014H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J\u0018\u0010+\u001a\u00020#2\u0006\u0010,\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u0014H&J\b\u0010-\u001a\u00020\u0003H&J\b\u0010.\u001a\u00020\u0003H&J\u0011\u0010/\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\b\u00100\u001a\u00020\u0003H&J\u0017\u00101\u001a\b\u0012\u0004\u0012\u0002020\u0010H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u00103\u001a\u00020\u00142\u0006\u00104\u001a\u00020%H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00105J\u0010\u00106\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0010\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u0014H&J\u001f\u00109\u001a\u00020\u00032\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\b0\u0010H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010;J\u001f\u0010<\u001a\u00020\u00032\f\u0010=\u001a\b\u0012\u0004\u0012\u00020%0\u0010H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010;J\u001f\u0010>\u001a\u00020\u00032\f\u0010=\u001a\b\u0012\u0004\u0012\u00020%0\u0010H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010;J\u0010\u0010?\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u0014H&J\u0018\u0010@\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u0014H&J\u0019\u0010A\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u0014H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J\u0019\u0010B\u001a\u00020\u00032\u0006\u0010C\u001a\u00020(H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010DJ\u0016\u0010E\u001a\u00020\u00032\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\b0\u0010H&J\u001f\u0010F\u001a\u00020\u00032\f\u0010:\u001a\b\u0012\u0004\u0012\u00020G0\u0010H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010;J\u0011\u0010H\u001a\u00020%H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0011\u0010I\u001a\u00020JH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00020G0\u0010H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u000e\u0010L\u001a\b\u0012\u0004\u0012\u00020G0\u0010H&J\u0017\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0017\u0010N\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020P0\u0010H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0017\u0010Q\u001a\b\u0012\u0004\u0012\u00020%0\u0010H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0011\u0010R\u001a\u00020JH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010S\u001a\u00020T2\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0016\u0010U\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u00108\u001a\u00020\u0014H&J\u0010\u0010V\u001a\u00020T2\u0006\u00108\u001a\u00020\u0014H&J\u0016\u0010W\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u00108\u001a\u00020\u0014H&J\u001f\u0010X\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010Y\u001a\u00020\u0014H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J\u0010\u0010Z\u001a\u00020T2\u0006\u0010$\u001a\u00020\u0014H&J\u0016\u0010[\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010$\u001a\u00020\u0014H&J\u0012\u0010\\\u001a\u0004\u0018\u00010%2\u0006\u0010,\u001a\u00020\u0014H&J\u0012\u0010]\u001a\u0004\u0018\u00010G2\u0006\u0010$\u001a\u00020\u0014H&J\u0010\u0010^\u001a\u00020\b2\u0006\u0010Y\u001a\u00020\u0014H&J\u0012\u0010_\u001a\u0004\u0018\u00010\b2\u0006\u00108\u001a\u00020\u0014H&J\u0016\u0010`\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u00108\u001a\u00020\u0014H&J\u0010\u0010a\u001a\u00020T2\u0006\u00108\u001a\u00020\u0014H&J\u001a\u0010b\u001a\u0004\u0018\u00010G2\u0006\u0010$\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u0014H&J\u0016\u0010c\u001a\b\u0012\u0004\u0012\u00020d0\u00102\u0006\u0010e\u001a\u00020\u0014H&J\u0017\u0010f\u001a\b\u0012\u0004\u0012\u00020J0\u0010H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001f\u0010g\u001a\u00020\u00032\f\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010;J\u0016\u0010i\u001a\u00020\u00032\f\u0010j\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010H&J\u0010\u0010k\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u000bH&J\u001f\u0010l\u001a\u00020\u00032\f\u0010:\u001a\b\u0012\u0004\u0012\u00020G0\u0010H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010;J\u0019\u0010m\u001a\u00020\u00032\u0006\u0010C\u001a\u00020(H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010DJ\u001f\u0010n\u001a\b\u0012\u0004\u0012\u00020G0\u00102\u0006\u0010o\u001a\u00020GH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010pJ\u0019\u0010q\u001a\u00020#2\u0006\u0010)\u001a\u00020\u0014H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J\u0017\u0010r\u001a\b\u0012\u0004\u0012\u00020(0\u0010H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0016\u0010s\u001a\b\u0012\u0004\u0012\u00020G0\u00102\u0006\u0010$\u001a\u00020\u0014H&J\u000e\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H&J\u0011\u0010u\u001a\u00020JH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u000e\u0010v\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010H&J\u0011\u0010w\u001a\u00020JH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010x\u001a\u00020\u00032\u0006\u0010o\u001a\u00020GH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010pJ!\u0010y\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010zJ*\u0010{\u001a\b\u0012\u0004\u0012\u00020\u00010|2\b\u0010}\u001a\u0004\u0018\u00010\r2\u0006\u0010~\u001a\u00020\u007fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0080\u0001J \u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\u0006\u0010}\u001a\u00020\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001c\u0010\u0082\u0001\u001a\u0004\u0018\u00010d2\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\b0\u0010H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0018\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0012\u0010\u0085\u0001\u001a\u00020JH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0018\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0012\u0010\u0087\u0001\u001a\u00020JH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001a\u0010\u0088\u0001\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\u0089\u0001\u001a\u00020\u00032\u0007\u0010\u008a\u0001\u001a\u00020\bH&J\u001a\u0010\u008b\u0001\u001a\u00020\u00032\u0006\u0010C\u001a\u00020(H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010D\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u008c\u0001"}, d2 = {"Lcom/caij/puremusic/repository/Repository;", "", "addOrReplaceAlbum", "", "album", "Lcom/caij/puremusic/db/model/Album;", "addSongToHistory", "currentSong", "Lcom/caij/puremusic/db/model/Song;", "(Lcom/caij/puremusic/db/model/Song;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "albumArtistByName", "Lcom/caij/puremusic/db/model/Artist;", "name", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "albumArtists", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "albumById", "albumId", "", "albumInfo", "Lcom/caij/puremusic/network/Result;", "Lcom/caij/puremusic/network/model/LastFmAlbum;", "artist", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "allSongs", "artistById", "artistId", "artistInfo", "Lcom/caij/puremusic/network/model/LastFmArtist;", "lang", "cache", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkPlaylistExists", "", "playListId", "Lcom/caij/puremusic/db/model/PlaylistEntity;", "playlistName", "checkSongExistInPlayCount", "Lcom/caij/puremusic/db/model/PlayCountEntity;", "songId", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkSongPlaylistExists", "playlistId", "clearAlbums", "clearArtists", "clearSongHistory", "clearSongs", "contributor", "Lcom/caij/puremusic/model/Contributor;", "createPlaylist", "playlistEntity", "(Lcom/caij/puremusic/db/model/PlaylistEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAlbumById", "deleteArtistById", "id", "deletePlayCountSongs", "songs", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePlaylistSongs", "playlists", "deleteRoomPlaylist", "deleteSongBySource", "deleteSongFromPlaylist", "deleteSongInHistory", "deleteSongInPlayCount", "playCountEntity", "(Lcom/caij/puremusic/db/model/PlayCountEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSongs", "deleteSongsInPlaylist", "Lcom/caij/puremusic/db/model/SongEntity;", "favoritePlaylist", "favoritePlaylistHome", "Lcom/caij/puremusic/model/Home;", "favoritePlaylistSongs", "favorites", "fetchAlbums", "fetchArtists", "fetchGenres", "Lcom/caij/puremusic/model/Genre;", "fetchPlaylists", "genresHome", "getAlbumSongCount", "", "getAlbumSongs", "getArtistSongCount", "getArtistSongsById", "getGenre", "genreId", "getPlayListSongCount", "getPlayListSongs", "getPlaylistEntity", "getPlaylistLastAddSong", "getSongByGenre", "getSongById", "getSongBySource", "getSongCountBySourceId", "getSongEntity", "historySong", "Lcom/caij/puremusic/db/model/HistoryEntity;", "l", "homeSections", "insertAllAlbums", "grouped", "insertAllArtists", "artists", "insertArtist", "insertSongEntities", "insertSongInPlayCount", "isFavoriteSong", "songEntity", "(Lcom/caij/puremusic/db/model/SongEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isSongFavorite", "playCountSongs", "playlistSongs", "recentAlbums", "recentAlbumsHome", "recentArtists", "recentArtistsHome", "removeSongFromPlaylist", "renameRoomPlaylist", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "", "query", "filter", "Lcom/caij/puremusic/fragments/search/Filter;", "(Ljava/lang/String;Lcom/caij/puremusic/fragments/search/Filter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchArtists", "songPresentInHistory", "suggestions", "topAlbums", "topAlbumsHome", "topArtists", "topArtistsHome", "updateHistorySong", "updateSong", "song", "updateSongInPlayCount", "app_chinaDebug"})
public abstract interface Repository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.HistoryEntity> historySong(long l);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.SongEntity> favorites();
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.caij.puremusic.db.model.Album albumById(long albumId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.SongEntity> playlistSongs(long playListId);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchAlbums(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.Album>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object allSongs(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.Song>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchArtists(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.Artist>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object albumArtists(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.Artist>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchGenres(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.model.Genre>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object search(@org.jetbrains.annotations.Nullable()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.fragments.search.Filter filter, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Object>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getGenre(long genreId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.Song>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object artistInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String lang, @org.jetbrains.annotations.Nullable()
    java.lang.String cache, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.caij.puremusic.network.Result<? extends com.caij.puremusic.network.model.LastFmArtist>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object albumInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String artist, @org.jetbrains.annotations.NotNull()
    java.lang.String album, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.caij.puremusic.network.Result<? extends com.caij.puremusic.network.model.LastFmAlbum>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.caij.puremusic.db.model.Artist artistById(long artistId);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object albumArtistByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.caij.puremusic.db.model.Artist> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object topArtists(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.Artist>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object topAlbums(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.Album>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object recentArtistsHome(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.caij.puremusic.model.Home> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object topArtistsHome(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.caij.puremusic.model.Home> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object topAlbumsHome(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.caij.puremusic.model.Home> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object recentAlbumsHome(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.caij.puremusic.model.Home> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object favoritePlaylistHome(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.caij.puremusic.model.Home> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object suggestions(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.Song>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object genresHome(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.caij.puremusic.model.Home> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object homeSections(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.model.Home>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertSongEntities(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.SongEntity> songs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object checkPlaylistExists(@org.jetbrains.annotations.NotNull()
    java.lang.String playlistName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.PlaylistEntity>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createPlaylist(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.PlaylistEntity playlistEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchPlaylists(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.PlaylistEntity>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteRoomPlaylist(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.PlaylistEntity> playlists, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object renameRoomPlaylist(long playlistId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteSongsInPlaylist(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.SongEntity> songs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object removeSongFromPlaylist(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.SongEntity songEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deletePlaylistSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.PlaylistEntity> playlists, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object favoritePlaylist(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.caij.puremusic.db.model.PlaylistEntity> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object isFavoriteSong(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.SongEntity songEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.SongEntity>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addSongToHistory(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song currentSong, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object songPresentInHistory(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song currentSong, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.caij.puremusic.db.model.HistoryEntity> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateHistorySong(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song currentSong, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object favoritePlaylistSongs(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.SongEntity>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertSongInPlayCount(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.PlayCountEntity playCountEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateSongInPlayCount(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.PlayCountEntity playCountEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteSongInPlayCount(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.PlayCountEntity playCountEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteSongInHistory(long songId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object clearSongHistory(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object checkSongExistInPlayCount(long songId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.PlayCountEntity>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object playCountSongs(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.PlayCountEntity>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deletePlayCountSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Song> songs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object contributor(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.model.Contributor>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object searchArtists(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.Artist>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object isSongFavorite(long songId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.caij.puremusic.db.model.Song getSongByGenre(long genreId);
    
    public abstract boolean checkPlaylistExists(long playListId);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertAllAlbums(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Album> grouped, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    public abstract void clearSongs();
    
    public abstract void clearAlbums();
    
    public abstract void updateSong(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song song);
    
    public abstract void insertAllArtists(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Artist> artists);
    
    public abstract void clearArtists();
    
    public abstract void deleteSongBySource(long id);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.caij.puremusic.db.model.Song getSongById(long id);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.caij.puremusic.db.model.SongEntity getSongEntity(long playListId, long songId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.Song> getPlayListSongs(long playListId);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.caij.puremusic.db.model.PlaylistEntity getPlaylistEntity(long playlistId);
    
    public abstract int getPlayListSongCount(long playListId);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.caij.puremusic.db.model.SongEntity getPlaylistLastAddSong(long playListId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.Song> getAlbumSongs(long id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.Song> getArtistSongsById(long id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.Artist> recentArtists();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.Album> recentAlbums();
    
    public abstract void insertArtist(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Artist artist);
    
    public abstract void deleteSongFromPlaylist(long playlistId, long songId);
    
    public abstract int getAlbumSongCount(long albumId);
    
    public abstract void deleteAlbumById(long albumId);
    
    public abstract int getArtistSongCount(long id);
    
    public abstract void deleteArtistById(long id);
    
    public abstract boolean checkSongPlaylistExists(long playlistId, long songId);
    
    public abstract void addOrReplaceAlbum(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Album album);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.Song> getSongBySource(long id);
    
    public abstract void deleteSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Song> songs);
    
    public abstract int getSongCountBySourceId(long id);
}