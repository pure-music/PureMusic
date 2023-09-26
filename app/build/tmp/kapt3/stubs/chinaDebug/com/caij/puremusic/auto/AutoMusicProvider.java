package com.caij.puremusic.auto;

/**
 * Created by Beesham Sarendranauth (Beesham)
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u001a\u0010\u0017\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J \u0010\u001a\u001a\u00020\u001b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u001dH\u0002J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u000e\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/caij/puremusic/auto/AutoMusicProvider;", "", "mContext", "Landroid/content/Context;", "songsRepository", "Lcom/caij/puremusic/repository/SongRepository;", "genresRepository", "Lcom/caij/puremusic/repository/GenreRepository;", "topPlayedRepository", "Lcom/caij/puremusic/repository/TopPlayedRepository;", "roomRepository", "Lcom/caij/puremusic/repository/RoomRepository;", "(Landroid/content/Context;Lcom/caij/puremusic/repository/SongRepository;Lcom/caij/puremusic/repository/GenreRepository;Lcom/caij/puremusic/repository/TopPlayedRepository;Lcom/caij/puremusic/repository/RoomRepository;)V", "mMusicService", "Ljava/lang/ref/WeakReference;", "Lcom/caij/puremusic/service/MusicService;", "getChildren", "", "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;", "mediaId", "", "resources", "Landroid/content/res/Resources;", "getPlayableSong", "song", "Lcom/caij/puremusic/db/model/Song;", "getPlaylistChildren", "", "mediaItems", "", "getRootChildren", "setMusicService", "service", "app_chinaDebug"})
public final class AutoMusicProvider {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context mContext = null;
    @org.jetbrains.annotations.NotNull()
    private final com.caij.puremusic.repository.SongRepository songsRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.caij.puremusic.repository.GenreRepository genresRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.caij.puremusic.repository.TopPlayedRepository topPlayedRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.caij.puremusic.repository.RoomRepository roomRepository = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.ref.WeakReference<com.caij.puremusic.service.MusicService> mMusicService;
    
    public AutoMusicProvider(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.repository.SongRepository songsRepository, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.repository.GenreRepository genresRepository, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.repository.TopPlayedRepository topPlayedRepository, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.repository.RoomRepository roomRepository) {
        super();
    }
    
    public final void setMusicService(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.service.MusicService service) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> getChildren(@org.jetbrains.annotations.Nullable()
    java.lang.String mediaId, @org.jetbrains.annotations.NotNull()
    android.content.res.Resources resources) {
        return null;
    }
    
    private final void getPlaylistChildren(java.lang.String mediaId, java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> mediaItems) {
    }
    
    private final java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> getRootChildren(android.content.res.Resources resources) {
        return null;
    }
    
    private final android.support.v4.media.MediaBrowserCompat.MediaItem getPlayableSong(java.lang.String mediaId, com.caij.puremusic.db.model.Song song) {
        return null;
    }
}