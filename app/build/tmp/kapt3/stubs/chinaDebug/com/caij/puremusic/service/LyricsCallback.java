package com.caij.puremusic.service;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/caij/puremusic/service/LyricsCallback;", "", "lyricsReset", "", "lyricsUpdate", "lyricsCache", "", "Lcom/caij/puremusic/lyrics/LrcEntry;", "app_chinaDebug"})
public abstract interface LyricsCallback {
    
    public abstract void lyricsReset();
    
    public abstract void lyricsUpdate(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.caij.puremusic.lyrics.LrcEntry> lyricsCache);
}