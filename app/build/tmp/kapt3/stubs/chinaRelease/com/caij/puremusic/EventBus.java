package com.caij.puremusic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0001J\u0016\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0007J\u0016\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0007R@\u0010\u0003\u001a4\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004j\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\t`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/caij/puremusic/EventBus;", "", "()V", "map", "Ljava/util/HashMap;", "", "Ljava/util/ArrayList;", "Lcom/caij/puremusic/EventObserver;", "Lkotlin/collections/HashMap;", "Lkotlin/collections/ArrayList;", "post", "", "key", "value", "register", "eventObserver", "unregister", "app_chinaRelease"})
public final class EventBus {
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.EventBus INSTANCE = null;
    private static final java.util.HashMap<java.lang.String, java.util.ArrayList<com.caij.puremusic.EventObserver>> map = null;
    
    private EventBus() {
        super();
    }
    
    public final void register(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.EventObserver eventObserver) {
    }
    
    public final void unregister(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.EventObserver eventObserver) {
    }
    
    public final void post(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.Object value) {
    }
}