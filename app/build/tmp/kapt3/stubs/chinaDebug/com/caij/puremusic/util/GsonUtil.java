package com.caij.puremusic.util;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J-\u0010\u0006\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\u000bH\u0007\u00a2\u0006\u0002\u0010\fJ-\u0010\u0006\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\u000bH\u0007\u00a2\u0006\u0002\u0010\u000fJ%\u0010\u0010\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u00a2\u0006\u0002\u0010\u0013J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00012\u000e\u0010\u0017\u001a\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u0019H\u0007J\u0012\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u00a8\u0006\u001a"}, d2 = {"Lcom/caij/puremusic/util/GsonUtil;", "", "()V", "gson", "Lcom/google/gson/Gson;", "getGson$annotations", "fromJson", "T", "reader", "Ljava/io/Reader;", "tClass", "Ljava/lang/Class;", "(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;", "json", "", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "fromJsonType", "type", "Ljava/lang/reflect/Type;", "(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "toJson", "", "obj", "writer", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "app_chinaDebug"})
public final class GsonUtil {
    @org.jetbrains.annotations.NotNull()
    private static final com.google.gson.Gson gson = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.util.GsonUtil INSTANCE = null;
    
    private GsonUtil() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    @java.lang.Deprecated()
    private static void getGson$annotations() {
    }
    
    @kotlin.jvm.JvmStatic()
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String toJson(@org.jetbrains.annotations.Nullable()
    java.lang.Object obj) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void toJson(@org.jetbrains.annotations.NotNull()
    java.lang.Object obj, @org.jetbrains.annotations.Nullable()
    java.lang.Appendable writer) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final <T extends java.lang.Object>T fromJson(@org.jetbrains.annotations.Nullable()
    java.lang.String json, @org.jetbrains.annotations.Nullable()
    java.lang.Class<T> tClass) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final <T extends java.lang.Object>T fromJson(@org.jetbrains.annotations.Nullable()
    java.io.Reader reader, @org.jetbrains.annotations.Nullable()
    java.lang.Class<T> tClass) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final <T extends java.lang.Object>T fromJsonType(@org.jetbrains.annotations.Nullable()
    java.lang.String json, @org.jetbrains.annotations.NotNull()
    java.lang.reflect.Type type) {
        return null;
    }
}