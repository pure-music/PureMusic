package com.caij.puremusic.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b!\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0019\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000bH&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rH&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\rH&J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000bH&J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0014H&J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\rH&J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000bH&J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00190\r2\u0006\u0010\u001a\u001a\u00020\u0014H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\r2\u0006\u0010\u001e\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u0018\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH&J\b\u0010\"\u001a\u00020\u0003H&J\b\u0010#\u001a\u00020\u0003H&J\b\u0010$\u001a\u00020\u0003H&J\u0011\u0010%\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\b\u0010\'\u001a\u00020\u0003H&J\u0019\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u0019H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J\u0010\u0010+\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010,\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000bH&J\u001f\u0010-\u001a\u00020\u00032\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J\u001f\u00100\u001a\u00020\u00032\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00190\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J\u001f\u00102\u001a\u00020\u00032\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00190\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J\u0010\u00104\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000bH&J\u0018\u00105\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH&J\u0019\u00106\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u0019\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u001dH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00109J\u0016\u0010:\u001a\u00020\u00032\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0\rH&J\u001f\u0010;\u001a\u00020\u00032\f\u0010.\u001a\b\u0012\u0004\u0012\u00020<0\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J\u0019\u0010=\u001a\u00020\u00192\u0006\u0010>\u001a\u00020\u0014H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0016\u0010?\u001a\b\u0012\u0004\u0012\u00020<0\r2\u0006\u0010>\u001a\u00020\u0014H&J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u0011\u001a\u00020\u000bH&J\u0010\u0010A\u001a\u00020B2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010C\u001a\u00020B2\u0006\u0010\u0011\u001a\u00020\u000bH&J\u0012\u0010D\u001a\u0004\u0018\u00010E2\u0006\u0010\u0011\u001a\u00020\u000bH&J\u000e\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\rH&J\u0010\u0010H\u001a\u00020B2\u0006\u0010\u0018\u001a\u00020\u000bH&J\u000e\u0010I\u001a\b\u0012\u0004\u0012\u00020G0\rH&J\u0012\u0010J\u001a\u0004\u0018\u00010\u00192\u0006\u0010!\u001a\u00020\u000bH&J\u0012\u0010K\u001a\u0004\u0018\u00010<2\u0006\u0010\u0018\u001a\u00020\u000bH&J\u0016\u0010L\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010M\u001a\u00020BH&J\u0016\u0010N\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\u0011\u001a\u00020\u000bH&J\u0010\u0010O\u001a\u00020B2\u0006\u0010\u0011\u001a\u00020\u000bH&J\u001a\u0010P\u001a\u0004\u0018\u00010<2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH&J\u0016\u0010Q\u001a\b\u0012\u0004\u0012\u00020R0\r2\u0006\u0010S\u001a\u00020\u000bH&J\u001f\u0010T\u001a\u00020\u00032\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J\u0016\u0010V\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\rH&J\u001f\u0010W\u001a\u00020\u00032\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J\u0010\u0010X\u001a\u00020\u00032\u0006\u0010Y\u001a\u00020\u0010H&J \u0010Z\u001a\u00020\u00032\u0016\u0010[\u001a\u0012\u0012\u0004\u0012\u00020G0\\j\b\u0012\u0004\u0012\u00020G`]H&J \u0010^\u001a\u00020\u00032\u0016\u0010_\u001a\u0012\u0012\u0004\u0012\u00020G0\\j\b\u0012\u0004\u0012\u00020G`]H&J\u0010\u0010`\u001a\u00020\u00032\u0006\u0010a\u001a\u00020\bH&J\u0019\u0010b\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u001dH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00109J\u001f\u0010c\u001a\u00020\u00032\f\u0010.\u001a\b\u0012\u0004\u0012\u00020<0\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J\u001f\u0010d\u001a\b\u0012\u0004\u0012\u00020<0\r2\u0006\u0010e\u001a\u00020<H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010fJ!\u0010g\u001a\u00020\u00172\u0006\u0010h\u001a\u00020i2\u0006\u0010\u001e\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010jJ\u000e\u0010k\u001a\b\u0012\u0004\u0012\u00020\u001d0\rH&J\u000e\u00103\u001a\b\u0012\u0004\u0012\u00020\u00190\rH&J\u0019\u0010l\u001a\u00020\u00032\u0006\u0010e\u001a\u00020<H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010fJ!\u0010m\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010nJ\u0016\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0016\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\u0006\u0010q\u001a\u00020\u0014H&J\u0016\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00190\r2\u0006\u0010s\u001a\u00020\u0014H&J\u0016\u0010t\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010u\u001a\u00020\u0014H&J\u0012\u0010v\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001e\u001a\u00020\u000bH&J\u0016\u0010w\u001a\b\u0012\u0004\u0012\u00020<0\r2\u0006\u0010\u0018\u001a\u00020\u000bH&J\u001b\u0010x\u001a\u0004\u0018\u00010R2\u0006\u0010v\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0016\u0010y\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\u0004\u001a\u00020\u0014H&J\u0016\u0010z\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\n\u001a\u00020\u000bH&J\u0016\u0010{\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010Y\u001a\u00020\u0014H&J\u0016\u0010|\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\u0011\u001a\u00020\u000bH&J\u0016\u0010}\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010~\u001a\u00020\u0014H&J\u001d\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\b0\r2\r\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH&J\'\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010u\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0014H&J\u001f\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010u\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0014H&J\u001f\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010u\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\u0014H&J\u0017\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010u\u001a\u00020\u0014H&J\u0017\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010S\u001a\u00020\u000bH&J\u000f\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\b0\rH&J\u001a\u0010\u0087\u0001\u001a\u00020\u00032\u0006\u0010v\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\u0088\u0001\u001a\u00020\u00032\u0006\u0010v\u001a\u00020\bH&J\u001a\u0010\u0089\u0001\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u001dH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00109\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u008a\u0001"}, d2 = {"Lcom/caij/puremusic/repository/RoomRepository;", "", "addOrReplaceAlbum", "", "album", "Lcom/caij/puremusic/db/model/Album;", "addSongToHistory", "currentSong", "Lcom/caij/puremusic/db/model/Song;", "(Lcom/caij/puremusic/db/model/Song;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "albumId", "", "albums", "", "allSongs", "artistById", "Lcom/caij/puremusic/db/model/Artist;", "id", "artistByName", "name", "", "artists", "checkPlaylistExists", "", "playListId", "Lcom/caij/puremusic/db/model/PlaylistEntity;", "playlistName", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkSongExistInPlayCount", "Lcom/caij/puremusic/db/model/PlayCountEntity;", "songId", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkSongPlaylistExists", "playlistId", "clearAlbums", "clearArtists", "clearPlaybacks", "clearSongHistory", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearSongs", "createPlaylist", "playlistEntity", "(Lcom/caij/puremusic/db/model/PlaylistEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAlbumById", "deleteArtistById", "deletePlayCountSongs", "songs", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePlaylistEntities", "playlistEntities", "deletePlaylistSongs", "playlists", "deleteSongBySource", "deleteSongFromPlaylist", "deleteSongInHistory", "deleteSongInPlayCount", "playCountEntity", "(Lcom/caij/puremusic/db/model/PlayCountEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSongs", "deleteSongsInPlaylist", "Lcom/caij/puremusic/db/model/SongEntity;", "favoritePlaylist", "favorite", "favoritePlaylistSongs", "getAlbumByArtistId", "getAlbumSongCount", "", "getArtistSongCount", "getAudioFormat", "Lcom/caij/puremusic/db/model/ServerAudioFormat;", "getOriginalPlayingQueuePlayback", "Lcom/caij/puremusic/db/model/PlaybackSong;", "getPlayListSongCount", "getPlayingQueuePlayback", "getPlaylistEntity", "getPlaylistLastAddSong", "getRecentPlaySongs", "count", "getSongBySource", "getSongCountBySourceId", "getSongEntity", "historySongs", "Lcom/caij/puremusic/db/model/HistoryEntity;", "cutoff", "insertAllAlbums", "grouped", "insertAllArtists", "insertAllSongs", "insertArtist", "artist", "insertOriginalPlayingQueuePlayback", "originalPlayingQueuePlayback", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "insertPlayingQueuePlayback", "playingQueuePlayback", "insertSong", "newSong", "insertSongInPlayCount", "insertSongs", "isFavoriteSong", "songEntity", "(Lcom/caij/puremusic/db/model/SongEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isSongFavorite", "context", "Landroid/content/Context;", "(Landroid/content/Context;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "playCountSongs", "removeSongFromPlaylist", "renamePlaylistEntity", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchAlbumsByName", "searchArtistByName", "query", "searchPlaylistByName", "searchString", "searchSongsByTitle", "title", "song", "songEntities", "songPresentInHistory", "songsByAlum", "songsByAlumId", "songsByArtist", "songsByArtistIdWithLike", "songsByFilePath", "filePath", "songsByIds", "ids", "songsByInfo", "songsByNameAlbum", "songsByNameArtist", "songsByTitle", "songsDateLastDesc", "songsOrderDateAdd", "updateHistorySong", "updateSong", "updateSongInPlayCount", "app_chinaRelease"})
public abstract interface RoomRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.HistoryEntity> historySongs(long cutoff);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.SongEntity> songEntities(long playListId);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createPlaylist(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.PlaylistEntity playlistEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object checkPlaylistExists(@org.jetbrains.annotations.NotNull()
    java.lang.String playlistName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.PlaylistEntity>> continuation);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.PlaylistEntity> playlists();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.SongEntity> songs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deletePlaylistEntities(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.PlaylistEntity> playlistEntities, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object renamePlaylistEntity(long playlistId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteSongsInPlaylist(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.SongEntity> songs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    public abstract void deleteSongFromPlaylist(long playlistId, long songId);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deletePlaylistSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.PlaylistEntity> playlists, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object favoritePlaylist(@org.jetbrains.annotations.NotNull()
    java.lang.String favorite, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.caij.puremusic.db.model.PlaylistEntity> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object isFavoriteSong(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.SongEntity songEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.SongEntity>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object removeSongFromPlaylist(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.SongEntity songEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addSongToHistory(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song currentSong, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object songPresentInHistory(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song song, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.caij.puremusic.db.model.HistoryEntity> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateHistorySong(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song song, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.SongEntity> favoritePlaylistSongs(@org.jetbrains.annotations.NotNull()
    java.lang.String favorite);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertSongInPlayCount(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.PlayCountEntity playCountEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateSongInPlayCount(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.PlayCountEntity playCountEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteSongInPlayCount(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.PlayCountEntity playCountEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteSongInHistory(long songId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object clearSongHistory(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object checkSongExistInPlayCount(long songId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.PlayCountEntity>> continuation);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.PlayCountEntity> playCountSongs();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deletePlayCountSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Song> songs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object isSongFavorite(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long songId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
    
    public abstract boolean checkPlaylistExists(long playListId);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertAllSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Song> songs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.Song> allSongs();
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.caij.puremusic.db.model.Song song(long songId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.Song> songsByFilePath(@org.jetbrains.annotations.NotNull()
    java.lang.String filePath);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.caij.puremusic.db.model.Album album(long albumId);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertAllAlbums(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Album> grouped, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    public abstract void clearSongs();
    
    public abstract void clearAlbums();
    
    public abstract void updateSong(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song song);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.caij.puremusic.db.model.Artist artistById(long id);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.caij.puremusic.db.model.Artist artistByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.Artist> artists();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.Artist> searchArtistByName(@org.jetbrains.annotations.NotNull()
    java.lang.String query);
    
    public abstract void insertAllArtists(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Artist> artists);
    
    public abstract void clearArtists();
    
    public abstract void deleteSongBySource(long id);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.caij.puremusic.db.model.SongEntity getSongEntity(long playListId, long songId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.Song> songsOrderDateAdd();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.Song> searchSongsByTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.Song> songsByTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.Song> songsByAlum(@org.jetbrains.annotations.NotNull()
    java.lang.String album);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.Song> songsByArtist(@org.jetbrains.annotations.NotNull()
    java.lang.String artist);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.Song> songsByInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String artist, @org.jetbrains.annotations.NotNull()
    java.lang.String album);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.Song> songsByNameArtist(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String artist);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.Song> songsByNameAlbum(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String album);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.Song> songsByAlumId(long albumId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.Song> songsByIds(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> ids);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.Song> songsByArtistIdWithLike(long id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.Song> songsDateLastDesc(long cutoff);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.Album> albums();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.Album> searchAlbumsByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.caij.puremusic.db.model.PlaylistEntity getPlaylistEntity(long playlistId);
    
    public abstract int getPlayListSongCount(long playListId);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.caij.puremusic.db.model.SongEntity getPlaylistLastAddSong(long playListId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.PlaylistEntity> searchPlaylistByName(@org.jetbrains.annotations.NotNull()
    java.lang.String searchString);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.Album> getAlbumByArtistId(long id);
    
    public abstract void clearPlaybacks();
    
    public abstract void insertOriginalPlayingQueuePlayback(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.caij.puremusic.db.model.PlaybackSong> originalPlayingQueuePlayback);
    
    public abstract void insertPlayingQueuePlayback(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.caij.puremusic.db.model.PlaybackSong> playingQueuePlayback);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.PlaybackSong> getOriginalPlayingQueuePlayback();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.PlaybackSong> getPlayingQueuePlayback();
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.caij.puremusic.db.model.ServerAudioFormat getAudioFormat(long id);
    
    public abstract void insertArtist(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Artist artist);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.Song> getRecentPlaySongs(int count);
    
    public abstract int getAlbumSongCount(long albumId);
    
    public abstract void deleteAlbumById(long albumId);
    
    public abstract int getArtistSongCount(long id);
    
    public abstract void deleteArtistById(long id);
    
    public abstract boolean checkSongPlaylistExists(long playlistId, long songId);
    
    public abstract void addOrReplaceAlbum(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Album album);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.caij.puremusic.db.model.Song> getSongBySource(long id);
    
    public abstract void insertSong(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song newSong);
    
    public abstract void deleteSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Song> songs);
    
    public abstract int getSongCountBySourceId(long id);
}