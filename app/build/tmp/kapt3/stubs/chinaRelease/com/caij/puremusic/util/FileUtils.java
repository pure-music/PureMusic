package com.caij.puremusic.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0002J.\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r\u00a8\u0006\u0012"}, d2 = {"Lcom/caij/puremusic/util/FileUtils;", "", "()V", "copyFileToUri", "", "context", "Landroid/content/Context;", "fromFile", "Ljava/io/File;", "toUri", "Landroid/net/Uri;", "createDirectory", "directoryName", "", "createFile", "fileName", "body", "fileType", "app_chinaRelease"})
public final class FileUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.util.FileUtils INSTANCE = null;
    
    private FileUtils() {
        super();
    }
    
    public final void copyFileToUri(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.io.File fromFile, @org.jetbrains.annotations.NotNull()
    android.net.Uri toUri) {
    }
    
    /**
     * creates a new file in storage in app specific directory.
     *
     * @return the file
     * @throws IOException
     */
    @org.jetbrains.annotations.NotNull()
    public final java.io.File createFile(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String directoryName, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName, @org.jetbrains.annotations.NotNull()
    java.lang.String body, @org.jetbrains.annotations.NotNull()
    java.lang.String fileType) {
        return null;
    }
    
    /**
     * creates a new directory in storage in app specific directory.
     *
     * @return the file
     */
    private final java.io.File createDirectory(android.content.Context context, java.lang.String directoryName) {
        return null;
    }
}