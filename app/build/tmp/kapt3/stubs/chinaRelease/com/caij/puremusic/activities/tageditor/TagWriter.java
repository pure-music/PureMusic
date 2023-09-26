package com.caij.puremusic.activities.tageditor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/caij/puremusic/activities/tageditor/TagWriter;", "", "()V", "Companion", "app_chinaRelease"})
public final class TagWriter {
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.activities.tageditor.TagWriter.Companion Companion = null;
    
    public TagWriter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J+\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/caij/puremusic/activities/tageditor/TagWriter$Companion;", "", "()V", "scan", "", "context", "Landroid/content/Context;", "toBeScanned", "", "", "(Landroid/content/Context;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeTagsToFiles", "info", "Lcom/caij/puremusic/model/AudioTagInfo;", "(Landroid/content/Context;Lcom/caij/puremusic/model/AudioTagInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeTagsToFilesR", "Ljava/io/File;", "app_chinaRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object scan(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        java.util.List<java.lang.String> toBeScanned, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object writeTagsToFiles(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.caij.puremusic.model.AudioTagInfo info, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.R)
        public final java.lang.Object writeTagsToFilesR(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.caij.puremusic.model.AudioTagInfo info, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super java.util.List<? extends java.io.File>> continuation) {
            return null;
        }
    }
}