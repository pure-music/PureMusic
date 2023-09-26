package com.caij.puremusic.helper.menu;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b\u00a8\u0006\f"}, d2 = {"Lcom/caij/puremusic/helper/menu/SongsMenuHelper;", "Lorg/koin/core/component/KoinComponent;", "()V", "handleMenuClick", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "songs", "", "Lcom/caij/puremusic/db/model/Song;", "menuItemId", "", "app_chinaRelease"})
public final class SongsMenuHelper implements org.koin.core.component.KoinComponent {
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.helper.menu.SongsMenuHelper INSTANCE = null;
    
    private SongsMenuHelper() {
        super();
    }
    
    public final boolean handleMenuClick(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Song> songs, int menuItemId) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
}