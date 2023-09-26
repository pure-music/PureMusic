package com.caij.puremusic.helper.menu;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lcom/caij/puremusic/helper/menu/PlaylistMenuHelper;", "Lorg/koin/core/component/KoinComponent;", "()V", "handleMenuClick", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "playlistWithSongs", "Lcom/caij/puremusic/db/model/PlaylistEntity;", "item", "Landroid/view/MenuItem;", "app_chinaDebug"})
public final class PlaylistMenuHelper implements org.koin.core.component.KoinComponent {
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.helper.menu.PlaylistMenuHelper INSTANCE = null;
    
    private PlaylistMenuHelper() {
        super();
    }
    
    public final boolean handleMenuClick(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.PlaylistEntity playlistWithSongs, @org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
}