package com.caij.puremusic.appshortcuts.shortcuttype;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\'\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000\u00a2\u0006\u0002\b\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u0012\u0010\b\u001a\u00020\tX\u00a0\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0012"}, d2 = {"Lcom/caij/puremusic/appshortcuts/shortcuttype/BaseShortcutType;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext$app_chinaDebug", "()Landroid/content/Context;", "setContext$app_chinaDebug", "shortcutInfo", "Landroid/content/pm/ShortcutInfo;", "getShortcutInfo$app_chinaDebug", "()Landroid/content/pm/ShortcutInfo;", "getPlaySongsIntent", "Landroid/content/Intent;", "shortcutType", "", "getPlaySongsIntent$app_chinaDebug", "Companion", "app_chinaDebug"})
@android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.N_MR1)
public abstract class BaseShortcutType {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ID_PREFIX = "code.name.monkey.retromusic.appshortcuts.id.";
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.appshortcuts.shortcuttype.BaseShortcutType.Companion Companion = null;
    
    public BaseShortcutType(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext$app_chinaDebug() {
        return null;
    }
    
    public final void setContext$app_chinaDebug(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.pm.ShortcutInfo getShortcutInfo$app_chinaDebug();
    
    /**
     * Creates an Intent that will launch MainActivtiy and immediately play {@param songs} in either shuffle or normal mode
     *
     * @param shortcutType Describes the type of shortcut to create (ShuffleAll, TopTracks, custom playlist, etc.)
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final android.content.Intent getPlaySongsIntent$app_chinaDebug(long shortcutType) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/caij/puremusic/appshortcuts/shortcuttype/BaseShortcutType$Companion;", "", "()V", "ID_PREFIX", "", "id", "getId", "()Ljava/lang/String;", "app_chinaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getId() {
            return null;
        }
    }
}