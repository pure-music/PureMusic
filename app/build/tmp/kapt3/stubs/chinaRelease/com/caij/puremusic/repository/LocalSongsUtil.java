package com.caij.puremusic.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J;\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\fj\b\u0012\u0004\u0012\u00020\t`\rH\u0002\u00a2\u0006\u0002\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J=\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0007\u00a2\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u000e\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eJ\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00140 J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00140 2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00140 2\u0006\u0010!\u001a\u00020\tJ\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00140 2\u0006\u0010#\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006$"}, d2 = {"Lcom/caij/puremusic/repository/LocalSongsUtil;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "addSelectionValues", "", "", "selectionValues", "paths", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "([Ljava/lang/String;Ljava/util/ArrayList;)[Ljava/lang/String;", "generateBlacklistSelection", "selection", "pathCount", "", "getSongFromCursorImpl", "Lcom/caij/puremusic/db/model/Song;", "cursor", "Landroid/database/Cursor;", "makeSongCursor", "sortOrder", "ignoreBlacklist", "", "(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Z)Landroid/database/Cursor;", "song", "songId", "", "songs", "", "query", "songsByFilePath", "filePath", "app_chinaRelease"})
public final class LocalSongsUtil {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    public LocalSongsUtil(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.caij.puremusic.db.model.Song> songs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.caij.puremusic.db.model.Song> songs(@org.jetbrains.annotations.Nullable()
    android.database.Cursor cursor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.caij.puremusic.db.model.Song song(@org.jetbrains.annotations.Nullable()
    android.database.Cursor cursor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.caij.puremusic.db.model.Song> songs(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.caij.puremusic.db.model.Song song(long songId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.caij.puremusic.db.model.Song> songsByFilePath(@org.jetbrains.annotations.NotNull()
    java.lang.String filePath, boolean ignoreBlacklist) {
        return null;
    }
    
    private final com.caij.puremusic.db.model.Song getSongFromCursorImpl(android.database.Cursor cursor) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    public final android.database.Cursor makeSongCursor(@org.jetbrains.annotations.Nullable()
    java.lang.String selection, @org.jetbrains.annotations.Nullable()
    java.lang.String[] selectionValues) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    public final android.database.Cursor makeSongCursor(@org.jetbrains.annotations.Nullable()
    java.lang.String selection, @org.jetbrains.annotations.Nullable()
    java.lang.String[] selectionValues, @org.jetbrains.annotations.NotNull()
    java.lang.String sortOrder) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    public final android.database.Cursor makeSongCursor(@org.jetbrains.annotations.Nullable()
    java.lang.String selection, @org.jetbrains.annotations.Nullable()
    java.lang.String[] selectionValues, @org.jetbrains.annotations.NotNull()
    java.lang.String sortOrder, boolean ignoreBlacklist) {
        return null;
    }
    
    private final java.lang.String generateBlacklistSelection(java.lang.String selection, int pathCount) {
        return null;
    }
    
    private final java.lang.String[] addSelectionValues(java.lang.String[] selectionValues, java.util.ArrayList<java.lang.String> paths) {
        return null;
    }
}