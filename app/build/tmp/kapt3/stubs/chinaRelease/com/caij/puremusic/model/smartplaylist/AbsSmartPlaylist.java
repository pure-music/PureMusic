package com.caij.puremusic.model.smartplaylist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/caij/puremusic/model/smartplaylist/AbsSmartPlaylist;", "Lcom/caij/puremusic/model/AbsCustomPlaylist;", "name", "", "iconRes", "", "(Ljava/lang/String;I)V", "getIconRes", "()I", "app_chinaRelease"})
public abstract class AbsSmartPlaylist extends com.caij.puremusic.model.AbsCustomPlaylist {
    private final int iconRes = 0;
    
    public AbsSmartPlaylist(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @androidx.annotation.DrawableRes()
    int iconRes) {
        super(0L, null);
    }
    
    public final int getIconRes() {
        return 0;
    }
}