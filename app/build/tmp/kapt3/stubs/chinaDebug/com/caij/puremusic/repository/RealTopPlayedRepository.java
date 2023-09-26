package com.caij.puremusic.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/caij/puremusic/repository/RealTopPlayedRepository;", "Lcom/caij/puremusic/repository/TopPlayedRepository;", "roomRepository", "Lcom/caij/puremusic/repository/RoomRepository;", "(Lcom/caij/puremusic/repository/RoomRepository;)V", "topAlbums", "", "Lcom/caij/puremusic/db/model/Album;", "topArtists", "Lcom/caij/puremusic/db/model/Artist;", "topTracks", "Lcom/caij/puremusic/db/model/Song;", "app_chinaDebug"})
public final class RealTopPlayedRepository implements com.caij.puremusic.repository.TopPlayedRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.caij.puremusic.repository.RoomRepository roomRepository = null;
    
    public RealTopPlayedRepository(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.repository.RoomRepository roomRepository) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.caij.puremusic.db.model.Song> topTracks() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.caij.puremusic.db.model.Album> topAlbums() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.caij.puremusic.db.model.Artist> topArtists() {
        return null;
    }
}