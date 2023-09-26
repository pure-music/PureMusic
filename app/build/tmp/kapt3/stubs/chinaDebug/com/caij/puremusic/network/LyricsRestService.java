package com.caij.puremusic.network;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/caij/puremusic/network/LyricsRestService;", "", "getLyrics", "", "artist", "title", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_chinaDebug"})
public abstract interface LyricsRestService {
    
    @retrofit2.http.Headers(value = {"Cache-Control: public"})
    @retrofit2.http.GET(value = "/lyrics")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLyrics(@retrofit2.http.Query(value = "artist")
    @org.jetbrains.annotations.NotNull()
    java.lang.String artist, @retrofit2.http.Query(value = "title")
    @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion);
}