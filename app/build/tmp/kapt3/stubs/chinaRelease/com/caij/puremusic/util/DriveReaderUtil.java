package com.caij.puremusic.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J#\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ8\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J)\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0012H\u0002\u00a2\u0006\u0002\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/caij/puremusic/util/DriveReaderUtil;", "", "()V", "addSongServerSource", "Lcom/caij/puremusic/drive/model/MediaInfoWrapper;", "context", "Landroid/content/Context;", "folder", "Lcom/caij/puremusic/db/model/Folder;", "(Landroid/content/Context;Lcom/caij/puremusic/db/model/Folder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readFileMeta", "", "driveFile", "Lcom/caij/puremusic/drive/model/DriveFile;", "song", "Lcom/caij/puremusic/db/model/Song;", "copySongs", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "lock", "Ljava/lang/Object;", "saveSongMetadata", "mediaMetadata", "Lcom/google/android/exoplayer2/MediaMetadata;", "duration", "(Lcom/caij/puremusic/db/model/Song;Lcom/google/android/exoplayer2/MediaMetadata;Ljava/lang/Long;)Lcom/caij/puremusic/db/model/Song;", "app_chinaRelease"})
public final class DriveReaderUtil {
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.util.DriveReaderUtil INSTANCE = null;
    
    private DriveReaderUtil() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addSongServerSource(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Folder folder, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.caij.puremusic.drive.model.MediaInfoWrapper> continuation) {
        return null;
    }
    
    private final void readFileMeta(com.caij.puremusic.drive.model.DriveFile driveFile, com.caij.puremusic.db.model.Song song, java.util.ArrayList<java.lang.Long> copySongs, java.lang.Object lock) {
    }
    
    private final com.caij.puremusic.db.model.Song saveSongMetadata(com.caij.puremusic.db.model.Song song, com.google.android.exoplayer2.MediaMetadata mediaMetadata, java.lang.Long duration) {
        return null;
    }
}