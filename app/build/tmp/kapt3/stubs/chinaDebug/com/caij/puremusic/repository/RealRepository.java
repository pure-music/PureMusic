package com.caij.puremusic.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00dc\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0019\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u00162\u0006\u0010$\u001a\u00020%H\u0016J\'\u0010&\u001a\b\u0012\u0004\u0012\u00020(0\'2\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u001eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00190!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u0012\u0010,\u001a\u0004\u0018\u00010\u001c2\u0006\u0010-\u001a\u00020%H\u0016J3\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\'2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u00100\u001a\u0004\u0018\u00010\u001e2\b\u00101\u001a\u0004\u0018\u00010\u001eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00102J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u00020%H\u0016J\u001f\u00103\u001a\b\u0012\u0004\u0012\u0002060!2\u0006\u00107\u001a\u00020\u001eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u001f\u00108\u001a\b\u0012\u0004\u0012\u0002090!2\u0006\u0010:\u001a\u00020%H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010;J\u0018\u0010<\u001a\u0002042\u0006\u0010=\u001a\u00020%2\u0006\u0010:\u001a\u00020%H\u0016J\b\u0010>\u001a\u00020\u0014H\u0016J\b\u0010?\u001a\u00020\u0014H\u0016J\u0011\u0010@\u001a\u00020\u0014H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\b\u0010A\u001a\u00020\u0014H\u0016J\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020C0!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u0019\u0010D\u001a\u00020%2\u0006\u0010E\u001a\u000206H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010FJ\u0010\u0010G\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010H\u001a\u00020\u00142\u0006\u0010I\u001a\u00020%H\u0016J\u001f\u0010J\u001a\u00020\u00142\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00190!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010LJ\u001f\u0010M\u001a\u00020\u00142\f\u0010N\u001a\b\u0012\u0004\u0012\u0002060!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010LJ\u001f\u0010O\u001a\u00020\u00142\f\u0010N\u001a\b\u0012\u0004\u0012\u0002060!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010LJ\u0010\u0010P\u001a\u00020\u00142\u0006\u0010I\u001a\u00020%H\u0016J\u0018\u0010Q\u001a\u00020\u00142\u0006\u0010=\u001a\u00020%2\u0006\u0010:\u001a\u00020%H\u0016J\u0019\u0010R\u001a\u00020\u00142\u0006\u0010:\u001a\u00020%H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010;J\u0019\u0010S\u001a\u00020\u00142\u0006\u0010T\u001a\u000209H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010UJ\u0016\u0010V\u001a\u00020\u00142\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00190!H\u0016J\u001f\u0010W\u001a\u00020\u00142\f\u0010K\u001a\b\u0012\u0004\u0012\u00020X0!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010LJ\u0011\u0010Y\u001a\u000206H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u0011\u0010Z\u001a\u00020[H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u0017\u0010\\\u001a\b\u0012\u0004\u0012\u00020X0!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u000e\u0010]\u001a\b\u0012\u0004\u0012\u00020X0!H\u0016J\u0017\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00160!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u0017\u0010_\u001a\b\u0012\u0004\u0012\u00020\u001c0!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u0017\u0010`\u001a\b\u0012\u0004\u0012\u00020a0!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u0017\u0010b\u001a\b\u0012\u0004\u0012\u0002060!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u0011\u0010c\u001a\u00020[H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u0010\u0010d\u001a\u00020e2\u0006\u0010$\u001a\u00020%H\u0016J\u0016\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00190!2\u0006\u0010I\u001a\u00020%H\u0016J\u0010\u0010g\u001a\u00020e2\u0006\u0010I\u001a\u00020%H\u0016J\u0016\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00190!2\u0006\u0010I\u001a\u00020%H\u0016J\u001f\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00190!2\u0006\u0010j\u001a\u00020%H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010;J\u0010\u0010k\u001a\u00020e2\u0006\u00105\u001a\u00020%H\u0016J\u0016\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00190!2\u0006\u00105\u001a\u00020%H\u0016J\u0012\u0010m\u001a\u0004\u0018\u0001062\u0006\u0010=\u001a\u00020%H\u0016J\u0012\u0010n\u001a\u0004\u0018\u00010X2\u0006\u00105\u001a\u00020%H\u0016J\u0010\u0010o\u001a\u00020\u00192\u0006\u0010j\u001a\u00020%H\u0016J\u0012\u0010p\u001a\u0004\u0018\u00010\u00192\u0006\u0010I\u001a\u00020%H\u0016J\u0016\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00190!2\u0006\u0010I\u001a\u00020%H\u0016J\u0010\u0010r\u001a\u00020e2\u0006\u0010I\u001a\u00020%H\u0016J\u001a\u0010s\u001a\u0004\u0018\u00010X2\u0006\u00105\u001a\u00020%2\u0006\u0010:\u001a\u00020%H\u0016J\u0016\u0010t\u001a\b\u0012\u0004\u0012\u00020u0!2\u0006\u0010v\u001a\u00020%H\u0016J\u0017\u0010w\u001a\b\u0012\u0004\u0012\u00020[0!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u001f\u0010x\u001a\u00020\u00142\f\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00160!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010LJ\u0016\u0010z\u001a\u00020\u00142\f\u0010{\u001a\b\u0012\u0004\u0012\u00020\u001c0!H\u0016J\u001f\u0010|\u001a\u00020\u00142\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00190!H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010LJ\u0010\u0010}\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u001cH\u0016J\u001f\u0010~\u001a\u00020\u00142\f\u0010K\u001a\b\u0012\u0004\u0012\u00020X0!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010LJ\u0019\u0010\u007f\u001a\u00020\u00142\u0006\u0010T\u001a\u000209H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010UJ\"\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020X0!2\u0007\u0010\u0081\u0001\u001a\u00020XH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0082\u0001J\u001a\u0010\u0083\u0001\u001a\u0002042\u0006\u0010:\u001a\u00020%H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010;J\u0018\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u0002090!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u0017\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020X0!2\u0006\u00105\u001a\u00020%H\u0016J\u000f\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160!H\u0016J\u0012\u0010\u0087\u0001\u001a\u00020[H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u000f\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020\u001c0!H\u0016J\u0012\u0010\u0089\u0001\u001a\u00020[H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u001c\u0010\u008a\u0001\u001a\u00020\u00142\u0007\u0010\u0081\u0001\u001a\u00020XH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0082\u0001J#\u0010\u008b\u0001\u001a\u00020\u00142\u0006\u0010=\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\u001eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u008c\u0001J0\u0010\u008d\u0001\u001a\n\u0012\u0005\u0012\u00030\u008f\u00010\u008e\u00012\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0091\u0001\u001a\u00030\u0092\u0001H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0093\u0001J!\u0010\u0094\u0001\u001a\b\u0012\u0004\u0012\u00020\u001c0!2\u0007\u0010\u0090\u0001\u001a\u00020\u001eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u001c\u0010\u0095\u0001\u001a\u0004\u0018\u00010u2\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0018\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00020\u00190!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u0018\u0010\u0097\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u0012\u0010\u0098\u0001\u001a\u00020[H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u0018\u0010\u0099\u0001\u001a\b\u0012\u0004\u0012\u00020\u001c0!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u0012\u0010\u009a\u0001\u001a\u00020[H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u001a\u0010\u009b\u0001\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0012\u0010\u009c\u0001\u001a\u00020\u00142\u0007\u0010\u009d\u0001\u001a\u00020\u0019H\u0016J\u001a\u0010\u009e\u0001\u001a\u00020\u00142\u0006\u0010T\u001a\u000209H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010UR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u009f\u0001"}, d2 = {"Lcom/caij/puremusic/repository/RealRepository;", "Lcom/caij/puremusic/repository/Repository;", "context", "Landroid/content/Context;", "lastFMService", "Lcom/caij/puremusic/network/LastFMService;", "songRepository", "Lcom/caij/puremusic/repository/SongRepository;", "genreRepository", "Lcom/caij/puremusic/repository/GenreRepository;", "searchRepository", "Lcom/caij/puremusic/repository/RealSearchRepository;", "topPlayedRepository", "Lcom/caij/puremusic/repository/TopPlayedRepository;", "roomRepository", "Lcom/caij/puremusic/repository/RoomRepository;", "localDataRepository", "Lcom/caij/puremusic/repository/LocalDataRepository;", "(Landroid/content/Context;Lcom/caij/puremusic/network/LastFMService;Lcom/caij/puremusic/repository/SongRepository;Lcom/caij/puremusic/repository/GenreRepository;Lcom/caij/puremusic/repository/RealSearchRepository;Lcom/caij/puremusic/repository/TopPlayedRepository;Lcom/caij/puremusic/repository/RoomRepository;Lcom/caij/puremusic/repository/LocalDataRepository;)V", "addOrReplaceAlbum", "", "album", "Lcom/caij/puremusic/db/model/Album;", "addSongToHistory", "currentSong", "Lcom/caij/puremusic/db/model/Song;", "(Lcom/caij/puremusic/db/model/Song;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "albumArtistByName", "Lcom/caij/puremusic/db/model/Artist;", "name", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "albumArtists", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "albumById", "albumId", "", "albumInfo", "Lcom/caij/puremusic/network/Result;", "Lcom/caij/puremusic/network/model/LastFmAlbum;", "artist", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "allSongs", "artistById", "artistId", "artistInfo", "Lcom/caij/puremusic/network/model/LastFmArtist;", "lang", "cache", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkPlaylistExists", "", "playListId", "Lcom/caij/puremusic/db/model/PlaylistEntity;", "playlistName", "checkSongExistInPlayCount", "Lcom/caij/puremusic/db/model/PlayCountEntity;", "songId", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkSongPlaylistExists", "playlistId", "clearAlbums", "clearArtists", "clearSongHistory", "clearSongs", "contributor", "Lcom/caij/puremusic/model/Contributor;", "createPlaylist", "playlistEntity", "(Lcom/caij/puremusic/db/model/PlaylistEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAlbumById", "deleteArtistById", "id", "deletePlayCountSongs", "songs", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePlaylistSongs", "playlists", "deleteRoomPlaylist", "deleteSongBySource", "deleteSongFromPlaylist", "deleteSongInHistory", "deleteSongInPlayCount", "playCountEntity", "(Lcom/caij/puremusic/db/model/PlayCountEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSongs", "deleteSongsInPlaylist", "Lcom/caij/puremusic/db/model/SongEntity;", "favoritePlaylist", "favoritePlaylistHome", "Lcom/caij/puremusic/model/Home;", "favoritePlaylistSongs", "favorites", "fetchAlbums", "fetchArtists", "fetchGenres", "Lcom/caij/puremusic/model/Genre;", "fetchPlaylists", "genresHome", "getAlbumSongCount", "", "getAlbumSongs", "getArtistSongCount", "getArtistSongsById", "getGenre", "genreId", "getPlayListSongCount", "getPlayListSongs", "getPlaylistEntity", "getPlaylistLastAddSong", "getSongByGenre", "getSongById", "getSongBySource", "getSongCountBySourceId", "getSongEntity", "historySong", "Lcom/caij/puremusic/db/model/HistoryEntity;", "cutoff", "homeSections", "insertAllAlbums", "grouped", "insertAllArtists", "artists", "insertAllSongs", "insertArtist", "insertSongEntities", "insertSongInPlayCount", "isFavoriteSong", "songEntity", "(Lcom/caij/puremusic/db/model/SongEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isSongFavorite", "playCountSongs", "playlistSongs", "recentAlbums", "recentAlbumsHome", "recentArtists", "recentArtistsHome", "removeSongFromPlaylist", "renameRoomPlaylist", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "", "", "query", "filter", "Lcom/caij/puremusic/fragments/search/Filter;", "(Ljava/lang/String;Lcom/caij/puremusic/fragments/search/Filter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchArtists", "songPresentInHistory", "suggestions", "topAlbums", "topAlbumsHome", "topArtists", "topArtistsHome", "updateHistorySong", "updateSong", "song", "updateSongInPlayCount", "app_chinaDebug"})
public final class RealRepository implements com.caij.puremusic.repository.Repository {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.caij.puremusic.network.LastFMService lastFMService = null;
    @org.jetbrains.annotations.NotNull()
    private final com.caij.puremusic.repository.SongRepository songRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.caij.puremusic.repository.GenreRepository genreRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.caij.puremusic.repository.RealSearchRepository searchRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.caij.puremusic.repository.TopPlayedRepository topPlayedRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.caij.puremusic.repository.RoomRepository roomRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.caij.puremusic.repository.LocalDataRepository localDataRepository = null;
    
    public RealRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.network.LastFMService lastFMService, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.repository.SongRepository songRepository, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.repository.GenreRepository genreRepository, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.repository.RealSearchRepository searchRepository, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.repository.TopPlayedRepository topPlayedRepository, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.repository.RoomRepository roomRepository, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.repository.LocalDataRepository localDataRepository) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.caij.puremusic.db.model.Song getSongByGenre(long genreId) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deletePlayCountSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Song> songs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertAllSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Song> songs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object contributor(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.model.Contributor>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object isSongFavorite(long songId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertAllAlbums(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Album> grouped, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
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
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public com.caij.puremusic.db.model.Song getSongById(long id) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public com.caij.puremusic.db.model.SongEntity getSongEntity(long playListId, long songId) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.caij.puremusic.db.model.Song> getPlayListSongs(long playListId) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public com.caij.puremusic.db.model.PlaylistEntity getPlaylistEntity(long playlistId) {
        return null;
    }
    
    @java.lang.Override()
    public int getPlayListSongCount(long playListId) {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public com.caij.puremusic.db.model.SongEntity getPlaylistLastAddSong(long playListId) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.caij.puremusic.db.model.Song> getAlbumSongs(long id) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.caij.puremusic.db.model.Song> getArtistSongsById(long id) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.caij.puremusic.db.model.Artist> recentArtists() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.caij.puremusic.db.model.Album> recentAlbums() {
        return null;
    }
    
    @java.lang.Override()
    public void insertArtist(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Artist artist) {
    }
    
    @java.lang.Override()
    public void deleteSongFromPlaylist(long playlistId, long songId) {
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
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.caij.puremusic.db.model.Song> getSongBySource(long id) {
        return null;
    }
    
    @java.lang.Override()
    public void deleteSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Song> songs) {
    }
    
    @java.lang.Override()
    public int getSongCountBySourceId(long id) {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object searchArtists(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.Artist>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchAlbums(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.Album>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public com.caij.puremusic.db.model.Album albumById(long albumId) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchArtists(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.Artist>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object albumArtists(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.Artist>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public com.caij.puremusic.db.model.Artist artistById(long artistId) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object albumArtistByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.caij.puremusic.db.model.Artist> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object topArtists(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.Artist>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object topAlbums(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.Album>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchGenres(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.model.Genre>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object allSongs(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.Song>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object search(@org.jetbrains.annotations.Nullable()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.fragments.search.Filter filter, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Object>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getGenre(long genreId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.Song>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object artistInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String lang, @org.jetbrains.annotations.Nullable()
    java.lang.String cache, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.caij.puremusic.network.Result<? extends com.caij.puremusic.network.model.LastFmArtist>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object albumInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String artist, @org.jetbrains.annotations.NotNull()
    java.lang.String album, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.caij.puremusic.network.Result<? extends com.caij.puremusic.network.model.LastFmAlbum>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object homeSections(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.model.Home>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.caij.puremusic.db.model.SongEntity> playlistSongs(long playListId) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertSongEntities(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.SongEntity> songs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object checkPlaylistExists(@org.jetbrains.annotations.NotNull()
    java.lang.String playlistName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.PlaylistEntity>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    public boolean checkPlaylistExists(long playListId) {
        return false;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object createPlaylist(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.PlaylistEntity playlistEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchPlaylists(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.PlaylistEntity>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteRoomPlaylist(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.PlaylistEntity> playlists, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object renameRoomPlaylist(long playlistId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteSongsInPlaylist(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.SongEntity> songs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object removeSongFromPlaylist(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.SongEntity songEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deletePlaylistSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.PlaylistEntity> playlists, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object favoritePlaylist(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.caij.puremusic.db.model.PlaylistEntity> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object isFavoriteSong(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.SongEntity songEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.SongEntity>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object addSongToHistory(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song currentSong, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object songPresentInHistory(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song currentSong, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.caij.puremusic.db.model.HistoryEntity> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updateHistorySong(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song currentSong, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object favoritePlaylistSongs(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.SongEntity>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertSongInPlayCount(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.PlayCountEntity playCountEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updateSongInPlayCount(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.PlayCountEntity playCountEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteSongInPlayCount(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.PlayCountEntity playCountEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteSongInHistory(long songId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object clearSongHistory(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object checkSongExistInPlayCount(long songId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.PlayCountEntity>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object playCountSongs(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.PlayCountEntity>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.caij.puremusic.db.model.HistoryEntity> historySong(long cutoff) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.caij.puremusic.db.model.SongEntity> favorites() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object suggestions(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.caij.puremusic.db.model.Song>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object genresHome(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.caij.puremusic.model.Home> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object recentArtistsHome(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.caij.puremusic.model.Home> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object recentAlbumsHome(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.caij.puremusic.model.Home> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object topAlbumsHome(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.caij.puremusic.model.Home> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object topArtistsHome(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.caij.puremusic.model.Home> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object favoritePlaylistHome(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.caij.puremusic.model.Home> $completion) {
        return null;
    }
}