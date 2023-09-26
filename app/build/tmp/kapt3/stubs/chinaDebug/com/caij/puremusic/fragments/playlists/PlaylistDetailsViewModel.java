package com.caij.puremusic.fragments.playlists;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0005J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/caij/puremusic/fragments/playlists/PlaylistDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "realRepository", "Lcom/caij/puremusic/repository/RealRepository;", "playlistId", "", "(Lcom/caij/puremusic/repository/RealRepository;J)V", "getPlaylistEntity", "Lcom/caij/puremusic/db/model/PlaylistEntity;", "getSong", "Lcom/caij/puremusic/db/model/Song;", "id", "getSongEntities", "", "Lcom/caij/puremusic/db/model/SongEntity;", "playlistExists", "", "app_chinaDebug"})
public final class PlaylistDetailsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.caij.puremusic.repository.RealRepository realRepository = null;
    private long playlistId;
    
    public PlaylistDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.repository.RealRepository realRepository, long playlistId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.caij.puremusic.db.model.SongEntity> getSongEntities() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.caij.puremusic.db.model.Song getSong(long id) {
        return null;
    }
    
    public final boolean playlistExists() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.caij.puremusic.db.model.PlaylistEntity getPlaylistEntity() {
        return null;
    }
}