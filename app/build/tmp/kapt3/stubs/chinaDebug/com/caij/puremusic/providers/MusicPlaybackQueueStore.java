package com.caij.puremusic.providers;

/**
 * @author Andrew Neal, modified for Phonograph by Karim Abou Zeid
 *
 * This keeps track of the music playback and history state of the playback service
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\"\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0011"}, d2 = {"Lcom/caij/puremusic/providers/MusicPlaybackQueueStore;", "", "context", "Landroid/content/Context;", "roomRepository", "Lcom/caij/puremusic/repository/RoomRepository;", "(Landroid/content/Context;Lcom/caij/puremusic/repository/RoomRepository;)V", "getRoomRepository", "()Lcom/caij/puremusic/repository/RoomRepository;", "saveQueues", "", "playingQueue", "", "Lcom/caij/puremusic/db/model/Song;", "originalPlayingQueue", "savedOriginalPlayingQueue", "savedPlayingQueue", "app_chinaDebug"})
public final class MusicPlaybackQueueStore {
    @org.jetbrains.annotations.NotNull()
    private final com.caij.puremusic.repository.RoomRepository roomRepository = null;
    
    public MusicPlaybackQueueStore(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.repository.RoomRepository roomRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.caij.puremusic.repository.RoomRepository getRoomRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.caij.puremusic.db.model.Song> savedOriginalPlayingQueue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.caij.puremusic.db.model.Song> savedPlayingQueue() {
        return null;
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void saveQueues(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Song> playingQueue, @org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Song> originalPlayingQueue) {
    }
}