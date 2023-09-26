package com.caij.puremusic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015\u00a2\u0006\u0010\n\u0002\u0010\u0019\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001a"}, d2 = {"Lcom/caij/puremusic/Constants;", "", "()V", "APP_TELEGRAM_LINK", "", "DATA", "FAQ_LINK", "GITHUB_PROJECT", "IS_MUSIC", "NUMBER_OF_TOP_TRACKS", "", "PINTEREST", "PRO_VERSION_PRODUCT_ID", "RATE_ON_GOOGLE_PLAY", "RELEASE_HISTORY", "TELEGRAM_CHANGE_LOG", "TRANSLATE", "USER_BANNER", "USER_PROFILE", "WEBSITE", "baseProjection", "", "getBaseProjection$annotations", "getBaseProjection", "()[Ljava/lang/String;", "[Ljava/lang/String;", "app_chinaRelease"})
public final class Constants {
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.Constants INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PRO_VERSION_PRODUCT_ID = "pro_version";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RATE_ON_GOOGLE_PLAY = "https://play.google.com/store/apps/details?id=%s";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TRANSLATE = "https://crowdin.com/project/retromusicplayer";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WEBSITE = "https://music.caij.xyz";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GITHUB_PROJECT = "https://github.com/pure-music/PureMusic";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TELEGRAM_CHANGE_LOG = "https://t.me/retromusiclog";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_PROFILE = "profile.jpg";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_BANNER = "banner.jpg";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APP_TELEGRAM_LINK = "https://t.me/ppuremusic/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FAQ_LINK = "https://music.caij.xyz/faq/zh/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PINTEREST = "https://in.pinterest.com/retromusicapp/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RELEASE_HISTORY = "https://github.com/pure-music/PureMusic/releases";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IS_MUSIC = "is_music=1 AND title != \'\'";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DATA = "_data";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String[] baseProjection = {"_id", "title", "track", "year", "duration", "_data", "date_modified", "album_id", "album", "artist_id", "artist", "composer", "album_artist", "date_added", "_size"};
    public static final int NUMBER_OF_TOP_TRACKS = 99;
    
    private Constants() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getBaseProjection() {
        return null;
    }
    
    @kotlin.Suppress(names = {"Deprecation"})
    @java.lang.Deprecated()
    public static void getBaseProjection$annotations() {
    }
}