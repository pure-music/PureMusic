package com.caij.puremusic.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001c\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u0016\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0012J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ6\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010 J\u001c\u0010!\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u001c\u0010\"\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u000e\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0018J\u000e\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020&J\u0016\u0010(\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0012J\u0010\u0010)\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u001c\u0010*\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u000e\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0018J\u001a\u0010-\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010/\u001a\u000200J\u0016\u00101\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u00102\u001a\u00020&J\u0016\u00103\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u00104\u001a\u00020\u001eJ\u000e\u00105\u001a\u00020\u001e2\u0006\u00106\u001a\u00020\u0018J\u0014\u00107\u001a\u00020\u00182\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u000e\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020&J\u001c\u0010:\u001a\u00020&2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u00106\u001a\u00020\u0018J \u0010;\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010<\u001a\u0004\u0018\u00010\u0006J\u0010\u0010=\u001a\u0002002\b\u0010>\u001a\u0004\u0018\u00010\u0006J\u0019\u0010?\u001a\u0002002\u0006\u0010\u0014\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010@J\u0010\u0010A\u001a\u0002002\b\u0010>\u001a\u0004\u0018\u00010\u0006J\u001c\u0010B\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020C0\u0011J\u000e\u0010D\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u0018J\u0019\u0010F\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010@R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006G"}, d2 = {"Lcom/caij/puremusic/util/MusicUtil;", "Lorg/koin/core/component/KoinComponent;", "()V", "repository", "Lcom/caij/puremusic/repository/Repository;", "buildInfoString", "", "string1", "string2", "createAlbumArtDir", "Ljava/io/File;", "context", "Landroid/content/Context;", "createAlbumArtFile", "createShareMultipleSongIntent", "Landroid/content/Intent;", "songs", "", "Lcom/caij/puremusic/db/model/Song;", "createShareSongFileIntent", "song", "deleteAlbumArt", "", "albumId", "", "deleteTracks", "(Landroid/content/Context;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "activity", "Landroidx/fragment/app/FragmentActivity;", "safUris", "Landroid/net/Uri;", "callback", "Ljava/lang/Runnable;", "getArtistInfoString1", "getArtistInfoString2", "getDateModifiedString", "date", "getFixedTrackNumber", "", "trackNumberToFix", "getLyrics", "getMediaStoreAlbumCoverUri", "getPlaylistInfoString", "getReadableDurationString", "songDurationMillis", "getSectionName", "mediaTitle", "stripPrefix", "", "getSongCountString", "songCount", "getSongFilePath", "uri", "getSongFileUri", "songId", "getTotalDuration", "getYearString", "year", "indexOfSongInList", "insertAlbumArt", "path", "isArtistNameUnknown", "artistName", "isFavorite", "(Lcom/caij/puremusic/db/model/Song;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isVariousArtists", "playlistInfoString", "Lcom/caij/puremusic/db/model/SongEntity;", "songByGenre", "genreId", "toggleFavorite", "app_chinaRelease"})
public final class MusicUtil implements org.koin.core.component.KoinComponent {
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.util.MusicUtil INSTANCE = null;
    private static final com.caij.puremusic.repository.Repository repository = null;
    
    private MusicUtil() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Intent createShareSongFileIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song song) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Intent createShareMultipleSongIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Song> songs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String buildInfoString(@org.jetbrains.annotations.Nullable()
    java.lang.String string1, @org.jetbrains.annotations.Nullable()
    java.lang.String string2) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File createAlbumArtFile(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private final java.io.File createAlbumArtDir(android.content.Context context) {
        return null;
    }
    
    public final void deleteAlbumArt(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long albumId) {
    }
    
    public final int getFixedTrackNumber(int trackNumberToFix) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLyrics(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song song) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final android.net.Uri getMediaStoreAlbumCoverUri(long albumId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPlaylistInfoString(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Song> songs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String playlistInfoString(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.SongEntity> songs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReadableDurationString(long songDurationMillis) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSectionName(@org.jetbrains.annotations.Nullable()
    java.lang.String mediaTitle, boolean stripPrefix) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSongCountString(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int songCount) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri getSongFileUri(long songId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSongFilePath(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return null;
    }
    
    public final long getTotalDuration(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Song> songs) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getYearString(int year) {
        return null;
    }
    
    public final int indexOfSongInList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Song> songs, long songId) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDateModifiedString(long date) {
        return null;
    }
    
    public final void insertAlbumArt(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long albumId, @org.jetbrains.annotations.Nullable()
    java.lang.String path) {
    }
    
    public final boolean isArtistNameUnknown(@org.jetbrains.annotations.Nullable()
    java.lang.String artistName) {
        return false;
    }
    
    public final boolean isVariousArtists(@org.jetbrains.annotations.Nullable()
    java.lang.String artistName) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object toggleFavorite(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song song, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object isFavorite(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song song, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    public final void deleteTracks(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Song> songs, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends android.net.Uri> safUris, @org.jetbrains.annotations.Nullable()
    java.lang.Runnable callback) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteTracks(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Song> songs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.caij.puremusic.db.model.Song songByGenre(long genreId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getArtistInfoString1(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Song> songs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getArtistInfoString2(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Song> songs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
}