package com.caij.puremusic.appshortcuts;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u00a8\u0006\r"}, d2 = {"Lcom/caij/puremusic/appshortcuts/AppShortcutLauncherActivity;", "Landroid/app/Activity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "startServiceWithPlaylist", "shuffleMode", "", "playlist", "Lcom/caij/puremusic/model/Playlist;", "Companion", "app_chinaDebug"})
public final class AppShortcutLauncherActivity extends android.app.Activity {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_SHORTCUT_TYPE = "code.name.monkey.retromusic.appshortcuts.ShortcutType";
    public static final long SHORTCUT_TYPE_SHUFFLE_ALL = 0L;
    public static final long SHORTCUT_TYPE_TOP_TRACKS = 1L;
    public static final long SHORTCUT_TYPE_NONE = 4L;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.appshortcuts.AppShortcutLauncherActivity.Companion Companion = null;
    
    public AppShortcutLauncherActivity() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void startServiceWithPlaylist(int shuffleMode, com.caij.puremusic.model.Playlist playlist) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/caij/puremusic/appshortcuts/AppShortcutLauncherActivity$Companion;", "", "()V", "KEY_SHORTCUT_TYPE", "", "SHORTCUT_TYPE_NONE", "", "SHORTCUT_TYPE_SHUFFLE_ALL", "SHORTCUT_TYPE_TOP_TRACKS", "app_chinaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}