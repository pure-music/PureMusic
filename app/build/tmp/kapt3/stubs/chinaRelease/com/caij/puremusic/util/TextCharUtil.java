package com.caij.puremusic.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J\u0016\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004\u00a8\u0006\f"}, d2 = {"Lcom/caij/puremusic/util/TextCharUtil;", "", "()V", "getDeviceCountry", "", "context", "Landroid/content/Context;", "isChinese", "", "str", "isSimple", "encode", "app_chinaRelease"})
public final class TextCharUtil {
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.util.TextCharUtil INSTANCE = null;
    
    private TextCharUtil() {
        super();
    }
    
    public final boolean isSimple(@org.jetbrains.annotations.NotNull()
    java.lang.String str, @org.jetbrains.annotations.NotNull()
    java.lang.String encode) {
        return false;
    }
    
    public final boolean isChinese(@org.jetbrains.annotations.NotNull()
    java.lang.String str) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeviceCountry(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}