package com.caij.puremusic.util;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ%\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u001e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/caij/puremusic/util/SongAuthUtil;", "", "()V", "downServerLyrics", "", "context", "Landroid/content/Context;", "song", "Lcom/caij/puremusic/db/model/Song;", "notify", "", "getRequestHeaders", "", "", "folder", "Lcom/caij/puremusic/db/model/Folder;", "(Lcom/caij/puremusic/db/model/Folder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSongUrl", "loadEmbyLyric", "lyricUrl", "file", "Ljava/io/File;", "saveSongLyrics", "metadata", "Lcom/google/android/exoplayer2/metadata/Metadata;", "app_chinaDebug"})
public final class SongAuthUtil {
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.util.SongAuthUtil INSTANCE = null;
    
    private SongAuthUtil() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSongUrl(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song song) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getRequestHeaders(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Folder folder, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, java.lang.String>> $completion) {
        return null;
    }
    
    public final void downServerLyrics(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song song, boolean notify) {
    }
    
    private final void loadEmbyLyric(java.lang.String lyricUrl, java.io.File file) {
    }
    
    public final void saveSongLyrics(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song song, @org.jetbrains.annotations.NotNull()
    com.google.android.exoplayer2.metadata.Metadata metadata, boolean notify) {
    }
}