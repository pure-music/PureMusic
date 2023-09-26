package com.caij.puremusic.service;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JJ\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\n2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0003J4\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0003J\b\u0010\u001b\u001a\u00020\fH\u0007J\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0003R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e\u00a2\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0002\u00a8\u0006\u001e"}, d2 = {"Lcom/caij/puremusic/service/MediaHttp;", "", "()V", "adriveLock", "Ljava/lang/Object;", "getAdriveLock", "()Ljava/lang/Object;", "baiduDriveLock", "getBaiduDriveLock", "preAliTime", "", "sOkHttpClient", "Lokhttp3/OkHttpClient;", "getSOkHttpClient$annotations", "getADriveRealDownUrl", "", "folderId", "headers", "", "drive_id", "file_id", "folder", "Lcom/caij/puremusic/db/model/Folder;", "isRetry", "", "getBaiduDriveRealDownUrl", "token", "getOkHttpClient", "getSubsonicArtisInfo", "id", "app_chinaDebug"})
public final class MediaHttp {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.Object adriveLock = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.Object baiduDriveLock = null;
    @org.jetbrains.annotations.Nullable()
    private static okhttp3.OkHttpClient sOkHttpClient;
    private static long preAliTime = 0L;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.service.MediaHttp INSTANCE = null;
    
    private MediaHttp() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getAdriveLock() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getBaiduDriveLock() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    @java.lang.Deprecated()
    private static void getSOkHttpClient$annotations() {
    }
    
    @kotlin.jvm.JvmStatic()
    @org.jetbrains.annotations.NotNull()
    public static final okhttp3.OkHttpClient getOkHttpClient() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    private static final java.lang.String getSubsonicArtisInfo(java.lang.String id, com.caij.puremusic.db.model.Folder folder) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    private static final java.lang.String getADriveRealDownUrl(long folderId, java.util.Map<java.lang.String, java.lang.String> headers, java.lang.String drive_id, java.lang.String file_id, com.caij.puremusic.db.model.Folder folder, boolean isRetry) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    private static final java.lang.String getBaiduDriveRealDownUrl(long folderId, java.lang.String token, java.lang.String file_id, com.caij.puremusic.db.model.Folder folder, boolean isRetry) {
        return null;
    }
}