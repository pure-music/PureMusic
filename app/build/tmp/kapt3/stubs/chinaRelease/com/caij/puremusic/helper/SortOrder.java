package com.caij.puremusic.helper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\u0018\u00002\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\nB\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u000b"}, d2 = {"Lcom/caij/puremusic/helper/SortOrder;", "", "()V", "AlbumSongSortOrder", "AlbumSortOrder", "ArtistAlbumSortOrder", "ArtistSongSortOrder", "ArtistSortOrder", "GenreSortOrder", "PlaylistSortOrder", "SongSortOrder", "app_chinaRelease"})
public final class SortOrder {
    
    public SortOrder() {
        super();
    }
    
    /**
     * Artist sort order entries.
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/caij/puremusic/helper/SortOrder$ArtistSortOrder;", "", "Companion", "app_chinaRelease"})
    public static abstract interface ArtistSortOrder {
        @org.jetbrains.annotations.NotNull()
        public static final com.caij.puremusic.helper.SortOrder.ArtistSortOrder.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ARTIST_A_Z = "artist_key";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ARTIST_Z_A = "artist_key DESC";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ARTIST_NUMBER_OF_SONGS = "number_of_tracks DESC";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ARTIST_NUMBER_OF_ALBUMS = "number_of_albums DESC";
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/caij/puremusic/helper/SortOrder$ArtistSortOrder$Companion;", "", "()V", "ARTIST_A_Z", "", "ARTIST_NUMBER_OF_ALBUMS", "ARTIST_NUMBER_OF_SONGS", "ARTIST_Z_A", "app_chinaRelease"})
        public static final class Companion {
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String ARTIST_A_Z = "artist_key";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String ARTIST_Z_A = "artist_key DESC";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String ARTIST_NUMBER_OF_SONGS = "number_of_tracks DESC";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String ARTIST_NUMBER_OF_ALBUMS = "number_of_albums DESC";
            
            private Companion() {
                super();
            }
        }
    }
    
    /**
     * Album sort order entries.
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/caij/puremusic/helper/SortOrder$AlbumSortOrder;", "", "Companion", "app_chinaRelease"})
    public static abstract interface AlbumSortOrder {
        @org.jetbrains.annotations.NotNull()
        public static final com.caij.puremusic.helper.SortOrder.AlbumSortOrder.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ALBUM_A_Z = "album_key";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ALBUM_Z_A = "album_key DESC";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ALBUM_NUMBER_OF_SONGS = "numsongs DESC";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ALBUM_ARTIST = "case when lower(album_artist) is null then 1 else 0 end, lower(album_artist)";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ALBUM_YEAR = "year DESC";
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/caij/puremusic/helper/SortOrder$AlbumSortOrder$Companion;", "", "()V", "ALBUM_ARTIST", "", "ALBUM_A_Z", "ALBUM_NUMBER_OF_SONGS", "ALBUM_YEAR", "ALBUM_Z_A", "app_chinaRelease"})
        public static final class Companion {
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String ALBUM_A_Z = "album_key";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String ALBUM_Z_A = "album_key DESC";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String ALBUM_NUMBER_OF_SONGS = "numsongs DESC";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String ALBUM_ARTIST = "case when lower(album_artist) is null then 1 else 0 end, lower(album_artist)";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String ALBUM_YEAR = "year DESC";
            
            private Companion() {
                super();
            }
        }
    }
    
    /**
     * Song sort order entries.
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/caij/puremusic/helper/SortOrder$SongSortOrder;", "", "Companion", "app_chinaRelease"})
    public static abstract interface SongSortOrder {
        @org.jetbrains.annotations.NotNull()
        public static final com.caij.puremusic.helper.SortOrder.SongSortOrder.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SONG_DEFAULT = "title_key";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SONG_A_Z = "title";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SONG_Z_A = "title DESC";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SONG_ARTIST = "artist_key";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SONG_ALBUM_ARTIST = "album_artist";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SONG_ALBUM = "album_key";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SONG_YEAR = "year DESC";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SONG_DURATION = "duration DESC";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SONG_DATE = "date_added DESC";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SONG_DATE_MODIFIED = "date_modified DESC";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COMPOSER = "composer";
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/caij/puremusic/helper/SortOrder$SongSortOrder$Companion;", "", "()V", "COMPOSER", "", "SONG_ALBUM", "SONG_ALBUM_ARTIST", "SONG_ARTIST", "SONG_A_Z", "SONG_DATE", "SONG_DATE_MODIFIED", "SONG_DEFAULT", "SONG_DURATION", "SONG_YEAR", "SONG_Z_A", "app_chinaRelease"})
        public static final class Companion {
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String SONG_DEFAULT = "title_key";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String SONG_A_Z = "title";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String SONG_Z_A = "title DESC";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String SONG_ARTIST = "artist_key";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String SONG_ALBUM_ARTIST = "album_artist";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String SONG_ALBUM = "album_key";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String SONG_YEAR = "year DESC";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String SONG_DURATION = "duration DESC";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String SONG_DATE = "date_added DESC";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String SONG_DATE_MODIFIED = "date_modified DESC";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String COMPOSER = "composer";
            
            private Companion() {
                super();
            }
        }
    }
    
    /**
     * Album song sort order entries.
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/caij/puremusic/helper/SortOrder$AlbumSongSortOrder;", "", "Companion", "app_chinaRelease"})
    public static abstract interface AlbumSongSortOrder {
        @org.jetbrains.annotations.NotNull()
        public static final com.caij.puremusic.helper.SortOrder.AlbumSongSortOrder.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SONG_A_Z = "title_key";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SONG_Z_A = "title_key DESC";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SONG_TRACK_LIST = "track, title_key";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SONG_DURATION = "duration DESC";
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/caij/puremusic/helper/SortOrder$AlbumSongSortOrder$Companion;", "", "()V", "SONG_A_Z", "", "SONG_DURATION", "SONG_TRACK_LIST", "SONG_Z_A", "app_chinaRelease"})
        public static final class Companion {
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String SONG_A_Z = "title_key";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String SONG_Z_A = "title_key DESC";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String SONG_TRACK_LIST = "track, title_key";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String SONG_DURATION = "duration DESC";
            
            private Companion() {
                super();
            }
        }
    }
    
    /**
     * Artist song sort order entries.
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/caij/puremusic/helper/SortOrder$ArtistSongSortOrder;", "", "Companion", "app_chinaRelease"})
    public static abstract interface ArtistSongSortOrder {
        @org.jetbrains.annotations.NotNull()
        public static final com.caij.puremusic.helper.SortOrder.ArtistSongSortOrder.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SONG_A_Z = "title_key";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SONG_Z_A = "title_key DESC";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SONG_ALBUM = "album";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SONG_YEAR = "year DESC";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SONG_DURATION = "duration DESC";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SONG_DATE = "date_added DESC";
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/caij/puremusic/helper/SortOrder$ArtistSongSortOrder$Companion;", "", "()V", "SONG_ALBUM", "", "SONG_A_Z", "SONG_DATE", "SONG_DURATION", "SONG_YEAR", "SONG_Z_A", "app_chinaRelease"})
        public static final class Companion {
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String SONG_A_Z = "title_key";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String SONG_Z_A = "title_key DESC";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String SONG_ALBUM = "album";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String SONG_YEAR = "year DESC";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String SONG_DURATION = "duration DESC";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String SONG_DATE = "date_added DESC";
            
            private Companion() {
                super();
            }
        }
    }
    
    /**
     * Artist album sort order entries.
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/caij/puremusic/helper/SortOrder$ArtistAlbumSortOrder;", "", "Companion", "app_chinaRelease"})
    public static abstract interface ArtistAlbumSortOrder {
        @org.jetbrains.annotations.NotNull()
        public static final com.caij.puremusic.helper.SortOrder.ArtistAlbumSortOrder.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ALBUM_A_Z = "album_key";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ALBUM_Z_A = "album_key DESC";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ALBUM_YEAR = "year DESC";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ALBUM_YEAR_ASC = "year ASC";
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/caij/puremusic/helper/SortOrder$ArtistAlbumSortOrder$Companion;", "", "()V", "ALBUM_A_Z", "", "ALBUM_YEAR", "ALBUM_YEAR_ASC", "ALBUM_Z_A", "app_chinaRelease"})
        public static final class Companion {
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String ALBUM_A_Z = "album_key";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String ALBUM_Z_A = "album_key DESC";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String ALBUM_YEAR = "year DESC";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String ALBUM_YEAR_ASC = "year ASC";
            
            private Companion() {
                super();
            }
        }
    }
    
    /**
     * Genre sort order entries.
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/caij/puremusic/helper/SortOrder$GenreSortOrder;", "", "Companion", "app_chinaRelease"})
    public static abstract interface GenreSortOrder {
        @org.jetbrains.annotations.NotNull()
        public static final com.caij.puremusic.helper.SortOrder.GenreSortOrder.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String GENRE_A_Z = "name";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ALBUM_Z_A = "name DESC";
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/caij/puremusic/helper/SortOrder$GenreSortOrder$Companion;", "", "()V", "ALBUM_Z_A", "", "GENRE_A_Z", "app_chinaRelease"})
        public static final class Companion {
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String GENRE_A_Z = "name";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String ALBUM_Z_A = "name DESC";
            
            private Companion() {
                super();
            }
        }
    }
    
    /**
     * Playlist sort order entries.
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/caij/puremusic/helper/SortOrder$PlaylistSortOrder;", "", "Companion", "app_chinaRelease"})
    public static abstract interface PlaylistSortOrder {
        @org.jetbrains.annotations.NotNull()
        public static final com.caij.puremusic.helper.SortOrder.PlaylistSortOrder.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PLAYLIST_A_Z = "name";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PLAYLIST_Z_A = "name DESC";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PLAYLIST_SONG_COUNT = "playlist_song_count";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PLAYLIST_SONG_COUNT_DESC = "playlist_song_count DESC";
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/caij/puremusic/helper/SortOrder$PlaylistSortOrder$Companion;", "", "()V", "PLAYLIST_A_Z", "", "PLAYLIST_SONG_COUNT", "PLAYLIST_SONG_COUNT_DESC", "PLAYLIST_Z_A", "app_chinaRelease"})
        public static final class Companion {
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String PLAYLIST_A_Z = "name";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String PLAYLIST_Z_A = "name DESC";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String PLAYLIST_SONG_COUNT = "playlist_song_count";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String PLAYLIST_SONG_COUNT_DESC = "playlist_song_count DESC";
            
            private Companion() {
                super();
            }
        }
    }
}