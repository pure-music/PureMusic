package com.caij.puremusic.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00c6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b!\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0019\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180 H\u0016J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0 H\u0016J\u0012\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020\u001eH\u0016J\u0012\u0010%\u001a\u0004\u0018\u00010#2\u0006\u0010&\u001a\u00020\'H\u0016J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020#0 H\u0016J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001eH\u0016J\u001f\u0010)\u001a\b\u0012\u0004\u0012\u00020,0 2\u0006\u0010-\u001a\u00020\'H\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J\u001f\u0010/\u001a\b\u0012\u0004\u0012\u0002000 2\u0006\u00101\u001a\u00020\u001eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00102J\u0018\u00103\u001a\u00020*2\u0006\u00104\u001a\u00020\u001e2\u0006\u00101\u001a\u00020\u001eH\u0016J\b\u00105\u001a\u00020\u0016H\u0016J\b\u00106\u001a\u00020\u0016H\u0016J\b\u00107\u001a\u00020\u0016H\u0016J\u0011\u00108\u001a\u00020\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00109J\b\u0010:\u001a\u00020\u0016H\u0016J\u0019\u0010;\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020,H\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010=J\u0010\u0010>\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010?\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u001eH\u0016J\u001f\u0010@\u001a\u00020\u00162\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001b0 H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010BJ\u001f\u0010C\u001a\u00020\u00162\f\u0010D\u001a\b\u0012\u0004\u0012\u00020,0 H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010BJ\u001f\u0010E\u001a\u00020\u00162\f\u0010F\u001a\b\u0012\u0004\u0012\u00020,0 H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010BJ\u0010\u0010G\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u001eH\u0016J\u0018\u0010H\u001a\u00020\u00162\u0006\u00104\u001a\u00020\u001e2\u0006\u00101\u001a\u00020\u001eH\u0016J\u0019\u0010I\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u001eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00102J\u0019\u0010J\u001a\u00020\u00162\u0006\u0010K\u001a\u000200H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010LJ\u0016\u0010M\u001a\u00020\u00162\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001b0 H\u0016J\u001f\u0010N\u001a\u00020\u00162\f\u0010A\u001a\b\u0012\u0004\u0012\u00020O0 H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010BJ\u0019\u0010P\u001a\u00020,2\u0006\u0010Q\u001a\u00020\'H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J\u0016\u0010R\u001a\b\u0012\u0004\u0012\u00020O0 2\u0006\u0010Q\u001a\u00020\'H\u0016J\u0016\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00180 2\u0006\u0010$\u001a\u00020\u001eH\u0016J\u0010\u0010T\u001a\u00020U2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010V\u001a\u00020U2\u0006\u0010$\u001a\u00020\u001eH\u0016J\u0012\u0010W\u001a\u0004\u0018\u00010X2\u0006\u0010$\u001a\u00020\u001eH\u0016J\u000e\u0010Y\u001a\b\u0012\u0004\u0012\u00020Z0 H\u0016J\u0010\u0010[\u001a\u00020U2\u0006\u0010+\u001a\u00020\u001eH\u0016J\u000e\u0010\\\u001a\b\u0012\u0004\u0012\u00020Z0 H\u0016J\u0012\u0010]\u001a\u0004\u0018\u00010,2\u0006\u00104\u001a\u00020\u001eH\u0016J\u0012\u0010^\u001a\u0004\u0018\u00010O2\u0006\u0010+\u001a\u00020\u001eH\u0016J\u0016\u0010_\u001a\b\u0012\u0004\u0012\u00020\u001b0 2\u0006\u0010`\u001a\u00020UH\u0016J\u0016\u0010a\u001a\b\u0012\u0004\u0012\u00020\u001b0 2\u0006\u0010$\u001a\u00020\u001eH\u0016J\u0010\u0010b\u001a\u00020U2\u0006\u0010$\u001a\u00020\u001eH\u0016J\u001a\u0010c\u001a\u0004\u0018\u00010O2\u0006\u0010+\u001a\u00020\u001e2\u0006\u00101\u001a\u00020\u001eH\u0016J\u0016\u0010d\u001a\b\u0012\u0004\u0012\u00020e0 2\u0006\u0010f\u001a\u00020\u001eH\u0016J\u001f\u0010g\u001a\u00020\u00162\f\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00180 H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010BJ\u0016\u0010i\u001a\u00020\u00162\f\u0010(\u001a\b\u0012\u0004\u0012\u00020#0 H\u0016J\u001f\u0010j\u001a\u00020\u00162\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001b0 H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010BJ\u0010\u0010k\u001a\u00020\u00162\u0006\u0010l\u001a\u00020#H\u0016J \u0010m\u001a\u00020\u00162\u0016\u0010n\u001a\u0012\u0012\u0004\u0012\u00020Z0oj\b\u0012\u0004\u0012\u00020Z`pH\u0016J \u0010q\u001a\u00020\u00162\u0016\u0010r\u001a\u0012\u0012\u0004\u0012\u00020Z0oj\b\u0012\u0004\u0012\u00020Z`pH\u0016J\u0010\u0010s\u001a\u00020\u00162\u0006\u0010t\u001a\u00020\u001bH\u0016J\u0019\u0010u\u001a\u00020\u00162\u0006\u0010K\u001a\u000200H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010LJ\u001f\u0010v\u001a\u00020\u00162\f\u0010A\u001a\b\u0012\u0004\u0012\u00020O0 H\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010BJ\u001f\u0010w\u001a\b\u0012\u0004\u0012\u00020O0 2\u0006\u0010x\u001a\u00020OH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010yJ!\u0010z\u001a\u00020*2\u0006\u0010{\u001a\u00020|2\u0006\u00101\u001a\u00020\u001eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010}J\u000e\u0010~\u001a\b\u0012\u0004\u0012\u0002000 H\u0016J\u000e\u0010F\u001a\b\u0012\u0004\u0012\u00020,0 H\u0017J\u0019\u0010\u007f\u001a\u00020\u00162\u0006\u0010x\u001a\u00020OH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010yJ#\u0010\u0080\u0001\u001a\u00020\u00162\u0006\u00104\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\'H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0081\u0001J\u0017\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020\u00180 2\u0006\u0010&\u001a\u00020\'H\u0016J\u0018\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020#0 2\u0007\u0010\u0084\u0001\u001a\u00020\'H\u0016J\u0018\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020,0 2\u0007\u0010\u0086\u0001\u001a\u00020\'H\u0016J\u0018\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020\u001b0 2\u0007\u0010\u0088\u0001\u001a\u00020\'H\u0016J\u0013\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u001b2\u0006\u00101\u001a\u00020\u001eH\u0016J\u0017\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020O0 2\u0006\u0010+\u001a\u00020\u001eH\u0016J\u001d\u0010\u008b\u0001\u001a\u0004\u0018\u00010e2\u0007\u0010\u0089\u0001\u001a\u00020\u001bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0017\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020\u001b0 2\u0006\u0010\u0017\u001a\u00020\'H\u0016J\u0017\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020\u001b0 2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0017\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00020\u001b0 2\u0006\u0010l\u001a\u00020\'H\u0016J\u0017\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020\u001b0 2\u0006\u0010$\u001a\u00020\u001eH\u0016J\u0018\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020\u001b0 2\u0007\u0010\u0091\u0001\u001a\u00020\'H\u0016J\u001e\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020\u001b0 2\r\u0010\u0093\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0 H\u0016J(\u0010\u0094\u0001\u001a\b\u0012\u0004\u0012\u00020\u001b0 2\u0007\u0010\u0088\u0001\u001a\u00020\'2\u0006\u0010l\u001a\u00020\'2\u0006\u0010\u0017\u001a\u00020\'H\u0016J \u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u00020\u001b0 2\u0007\u0010\u0088\u0001\u001a\u00020\'2\u0006\u0010\u0017\u001a\u00020\'H\u0016J \u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00020\u001b0 2\u0007\u0010\u0088\u0001\u001a\u00020\'2\u0006\u0010l\u001a\u00020\'H\u0016J\u0018\u0010\u0097\u0001\u001a\b\u0012\u0004\u0012\u00020\u001b0 2\u0007\u0010\u0088\u0001\u001a\u00020\'H\u0016J\u0017\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020\u001b0 2\u0006\u0010f\u001a\u00020\u001eH\u0016J\u000f\u0010\u0099\u0001\u001a\b\u0012\u0004\u0012\u00020\u001b0 H\u0016J\u001b\u0010\u009a\u0001\u001a\u00020\u00162\u0007\u0010\u0089\u0001\u001a\u00020\u001bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0012\u0010\u009b\u0001\u001a\u00020\u00162\u0007\u0010\u0089\u0001\u001a\u00020\u001bH\u0016J\u001a\u0010\u009c\u0001\u001a\u00020\u00162\u0006\u0010K\u001a\u000200H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010LR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u009d\u0001"}, d2 = {"Lcom/caij/puremusic/repository/RealRoomRepository;", "Lcom/caij/puremusic/repository/RoomRepository;", "playlistDao", "Lcom/caij/puremusic/database/PlaylistDao;", "playCountDao", "Lcom/caij/puremusic/database/PlayCountDao;", "historyDao", "Lcom/caij/puremusic/database/HistoryDao;", "songsDao", "Lcom/caij/puremusic/database/SongsDao;", "albumDao", "Lcom/caij/puremusic/database/AlbumDao;", "artistDao", "Lcom/caij/puremusic/database/ArtistDao;", "songEntityDao", "Lcom/caij/puremusic/database/SongEntityDao;", "playbackDao", "Lcom/caij/puremusic/database/PlaybackDao;", "audioFormatDao", "Lcom/caij/puremusic/database/ServerAudioFormatDao;", "(Lcom/caij/puremusic/database/PlaylistDao;Lcom/caij/puremusic/database/PlayCountDao;Lcom/caij/puremusic/database/HistoryDao;Lcom/caij/puremusic/database/SongsDao;Lcom/caij/puremusic/database/AlbumDao;Lcom/caij/puremusic/database/ArtistDao;Lcom/caij/puremusic/database/SongEntityDao;Lcom/caij/puremusic/database/PlaybackDao;Lcom/caij/puremusic/database/ServerAudioFormatDao;)V", "addOrReplaceAlbum", "", "album", "Lcom/caij/puremusic/db/model/Album;", "addSongToHistory", "currentSong", "Lcom/caij/puremusic/db/model/Song;", "(Lcom/caij/puremusic/db/model/Song;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "albumId", "", "albums", "", "allSongs", "artistById", "Lcom/caij/puremusic/db/model/Artist;", "id", "artistByName", "name", "", "artists", "checkPlaylistExists", "", "playListId", "Lcom/caij/puremusic/db/model/PlaylistEntity;", "playlistName", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkSongExistInPlayCount", "Lcom/caij/puremusic/db/model/PlayCountEntity;", "songId", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkSongPlaylistExists", "playlistId", "clearAlbums", "clearArtists", "clearPlaybacks", "clearSongHistory", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearSongs", "createPlaylist", "playlistEntity", "(Lcom/caij/puremusic/db/model/PlaylistEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAlbumById", "deleteArtistById", "deletePlayCountSongs", "songs", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePlaylistEntities", "playlistEntities", "deletePlaylistSongs", "playlists", "deleteSongBySource", "deleteSongFromPlaylist", "deleteSongInHistory", "deleteSongInPlayCount", "playCountEntity", "(Lcom/caij/puremusic/db/model/PlayCountEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSongs", "deleteSongsInPlaylist", "Lcom/caij/puremusic/db/model/SongEntity;", "favoritePlaylist", "favorite", "favoritePlaylistSongs", "getAlbumByArtistId", "getAlbumSongCount", "", "getArtistSongCount", "getAudioFormat", "Lcom/caij/puremusic/db/model/ServerAudioFormat;", "getOriginalPlayingQueuePlayback", "Lcom/caij/puremusic/db/model/PlaybackSong;", "getPlayListSongCount", "getPlayingQueuePlayback", "getPlaylistEntity", "getPlaylistLastAddSong", "getRecentPlaySongs", "count", "getSongBySource", "getSongCountBySourceId", "getSongEntity", "historySongs", "Lcom/caij/puremusic/db/model/HistoryEntity;", "cutoff", "insertAllAlbums", "grouped", "insertAllArtists", "insertAllSongs", "insertArtist", "artist", "insertOriginalPlayingQueuePlayback", "originalPlayingQueuePlayback", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "insertPlayingQueuePlayback", "playingQueuePlayback", "insertSong", "newSong", "insertSongInPlayCount", "insertSongs", "isFavoriteSong", "songEntity", "(Lcom/caij/puremusic/db/model/SongEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isSongFavorite", "context", "Landroid/content/Context;", "(Landroid/content/Context;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "playCountSongs", "removeSongFromPlaylist", "renamePlaylistEntity", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchAlbumsByName", "searchArtistByName", "query", "searchPlaylistByName", "searchString", "searchSongsByTitle", "title", "song", "songEntities", "songPresentInHistory", "songsByAlum", "songsByAlumId", "songsByArtist", "songsByArtistIdWithLike", "songsByFilePath", "filePath", "songsByIds", "ids", "songsByInfo", "songsByNameAlbum", "songsByNameArtist", "songsByTitle", "songsDateLastDesc", "songsOrderDateAdd", "updateHistorySong", "updateSong", "updateSongInPlayCount", "app_chinaRelease"})
public final class RealRoomRepository implements com.caij.puremusic.repository.RoomRepository {
    private final com.caij.puremusic.database.PlaylistDao playlistDao = null;
    private final com.caij.puremusic.database.PlayCountDao playCountDao = null;
    private final com.caij.puremusic.database.HistoryDao historyDao = null;
    private final com.caij.puremusic.database.SongsDao songsDao = null;
    private final com.caij.puremusic.database.AlbumDao albumDao = null;
    private final com.caij.puremusic.database.ArtistDao artistDao = null;
    private final com.caij.puremusic.database.SongEntityDao songEntityDao = null;
    private final com.caij.puremusic.database.PlaybackDao playbackDao = null;
    private final com.caij.puremusic.database.ServerAudioFormatDao audioFormatDao = null;
    
    public RealRoomRepository(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.database.PlaylistDao playlistDao, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.database.PlayCountDao playCountDao, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.database.HistoryDao historyDao, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.database.SongsDao songsDao, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.database.AlbumDao albumDao, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.database.ArtistDao artistDao, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.database.SongEntityDao songEntityDao, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.database.PlaybackDao playbackDao, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.database.ServerAudioFormatDao audioFormatDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    @java.lang.Override()
    public java.lang.Object createPlaylist(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.PlaylistEntity playlistEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    @java.lang.Override()
    public java.lang.Object checkPlaylistExists(@org.jetbrains.annotations.NotNull()
    java.lang.String playlistName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.PlaylistEntity>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.WorkerThread()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.PlaylistEntity> playlists() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    @java.lang.Override()
    public java.lang.Object insertSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.SongEntity> songs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.SongEntity> songEntities(long playListId) {
        return null;
    }
    
    @java.lang.Override()
    public boolean checkPlaylistExists(long playListId) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deletePlaylistEntities(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.PlaylistEntity> playlistEntities, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object renamePlaylistEntity(long playlistId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteSongsInPlaylist(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.SongEntity> songs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @java.lang.Override()
    public void deleteSongFromPlaylist(long playlistId, long songId) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deletePlaylistSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.PlaylistEntity> playlists, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object favoritePlaylist(@org.jetbrains.annotations.NotNull()
    java.lang.String favorite, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.caij.puremusic.db.model.PlaylistEntity> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object isFavoriteSong(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.SongEntity songEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.SongEntity>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object removeSongFromPlaylist(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.SongEntity songEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object addSongToHistory(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song currentSong, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object songPresentInHistory(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song song, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.caij.puremusic.db.model.HistoryEntity> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateHistorySong(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song song, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.HistoryEntity> historySongs(long cutoff) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.SongEntity> favoritePlaylistSongs(@org.jetbrains.annotations.NotNull()
    java.lang.String favorite) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertSongInPlayCount(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.PlayCountEntity playCountEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateSongInPlayCount(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.PlayCountEntity playCountEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteSongInPlayCount(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.PlayCountEntity playCountEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteSongInHistory(long songId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object clearSongHistory(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object checkSongExistInPlayCount(long songId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.PlayCountEntity>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.PlayCountEntity> playCountSongs() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deletePlayCountSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Song> songs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object isSongFavorite(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long songId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertAllSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Song> songs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.Song> allSongs() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.caij.puremusic.db.model.Song song(long songId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.Song> songsByFilePath(@org.jetbrains.annotations.NotNull()
    java.lang.String filePath) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.caij.puremusic.db.model.Album album(long albumId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertAllAlbums(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Album> grouped, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @java.lang.Override()
    public void clearSongs() {
    }
    
    @java.lang.Override()
    public void clearAlbums() {
    }
    
    @java.lang.Override()
    public void updateSong(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song song) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.caij.puremusic.db.model.Artist artistById(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.caij.puremusic.db.model.Artist artistByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.Artist> artists() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.Artist> searchArtistByName(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @java.lang.Override()
    public void insertAllArtists(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Artist> artists) {
    }
    
    @java.lang.Override()
    public void clearArtists() {
    }
    
    @java.lang.Override()
    public void deleteSongBySource(long id) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.caij.puremusic.db.model.SongEntity getSongEntity(long playListId, long songId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.Song> songsOrderDateAdd() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.Song> searchSongsByTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.Song> songsByTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.Song> songsByAlum(@org.jetbrains.annotations.NotNull()
    java.lang.String album) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.Song> songsByArtist(@org.jetbrains.annotations.NotNull()
    java.lang.String artist) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.Song> songsByInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String artist, @org.jetbrains.annotations.NotNull()
    java.lang.String album) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.Song> songsByNameArtist(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String artist) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.Song> songsByNameAlbum(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String album) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.Song> songsByAlumId(long albumId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.Song> songsByIds(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> ids) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.Song> songsByArtistIdWithLike(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.Song> songsDateLastDesc(long cutoff) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.Album> albums() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.Album> searchAlbumsByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.caij.puremusic.db.model.PlaylistEntity getPlaylistEntity(long playlistId) {
        return null;
    }
    
    @java.lang.Override()
    public int getPlayListSongCount(long playListId) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.caij.puremusic.db.model.SongEntity getPlaylistLastAddSong(long playListId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.PlaylistEntity> searchPlaylistByName(@org.jetbrains.annotations.NotNull()
    java.lang.String searchString) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.Album> getAlbumByArtistId(long id) {
        return null;
    }
    
    @java.lang.Override()
    public void clearPlaybacks() {
    }
    
    @java.lang.Override()
    public void insertOriginalPlayingQueuePlayback(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.caij.puremusic.db.model.PlaybackSong> originalPlayingQueuePlayback) {
    }
    
    @java.lang.Override()
    public void insertPlayingQueuePlayback(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.caij.puremusic.db.model.PlaybackSong> playingQueuePlayback) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.PlaybackSong> getOriginalPlayingQueuePlayback() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.PlaybackSong> getPlayingQueuePlayback() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.caij.puremusic.db.model.ServerAudioFormat getAudioFormat(long id) {
        return null;
    }
    
    @java.lang.Override()
    public void insertArtist(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Artist artist) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.Song> getRecentPlaySongs(int count) {
        return null;
    }
    
    @java.lang.Override()
    public int getAlbumSongCount(long albumId) {
        return 0;
    }
    
    @java.lang.Override()
    public void deleteAlbumById(long albumId) {
    }
    
    @java.lang.Override()
    public int getArtistSongCount(long id) {
        return 0;
    }
    
    @java.lang.Override()
    public void deleteArtistById(long id) {
    }
    
    @java.lang.Override()
    public boolean checkSongPlaylistExists(long playlistId, long songId) {
        return false;
    }
    
    @java.lang.Override()
    public void addOrReplaceAlbum(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Album album) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.caij.puremusic.db.model.Song> getSongBySource(long id) {
        return null;
    }
    
    @java.lang.Override()
    public void insertSong(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song newSong) {
    }
    
    @java.lang.Override()
    public void deleteSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Song> songs) {
    }
    
    @java.lang.Override()
    public int getSongCountBySourceId(long id) {
        return 0;
    }
}