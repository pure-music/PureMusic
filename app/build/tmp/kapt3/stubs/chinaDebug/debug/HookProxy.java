package debug;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Ldebug/HookProxy;", "", "()V", "registerContentObserver", "", "contentResolver", "Landroid/content/ContentResolver;", "uri", "Landroid/net/Uri;", "notifyForDescendants", "", "observer", "Landroid/database/ContentObserver;", "app_chinaDebug"})
@com.yl.lib.privacy_annotation.PrivacyClassProxy()
@androidx.annotation.Keep()
public final class HookProxy {
    @org.jetbrains.annotations.NotNull()
    public static final debug.HookProxy INSTANCE = null;
    
    private HookProxy() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    @com.yl.lib.privacy_annotation.PrivacyMethodProxy(originalClass = android.content.ContentResolver.class, originalMethod = "registerContentObserver", originalOpcode = com.yl.lib.privacy_annotation.MethodInvokeOpcode.INVOKEVIRTUAL)
    public static final void registerContentObserver(@org.jetbrains.annotations.NotNull()
    android.content.ContentResolver contentResolver, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri, boolean notifyForDescendants, @org.jetbrains.annotations.NotNull()
    android.database.ContentObserver observer) {
    }
}