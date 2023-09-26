package com.caij.puremusic.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\f"}, d2 = {"Lcom/caij/puremusic/util/RingtoneManager;", "", "()V", "requiresDialog", "", "context", "Landroid/content/Context;", "setRingtone", "", "song", "Lcom/caij/puremusic/db/model/Song;", "showDialog", "app_chinaRelease"})
public final class RingtoneManager {
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.util.RingtoneManager INSTANCE = null;
    
    private RingtoneManager() {
        super();
    }
    
    public final void setRingtone(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song song) {
    }
    
    public final boolean requiresDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final void showDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
}