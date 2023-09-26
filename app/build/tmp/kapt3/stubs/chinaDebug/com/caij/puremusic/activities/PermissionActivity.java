package com.caij.puremusic.activities;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0003J\b\u0010\u0007\u001a\u00020\u0006H\u0003J\b\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u000e\u001a\u00020\nH\u0014J\b\u0010\u000f\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/caij/puremusic/activities/PermissionActivity;", "Lcom/caij/puremusic/activities/base/AbsMusicServiceActivity;", "()V", "binding", "Lcom/caij/puremusic/databinding/ActivityPermissionBinding;", "hasAudioPermission", "", "hasBluetoothPermission", "hasStoragePermission", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "setupTitle", "app_chinaDebug"})
public final class PermissionActivity extends com.caij.puremusic.activities.base.AbsMusicServiceActivity {
    private com.caij.puremusic.databinding.ActivityPermissionBinding binding;
    
    public PermissionActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupTitle() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final boolean hasStoragePermission() {
        return false;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.S)
    private final boolean hasBluetoothPermission() {
        return false;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    private final boolean hasAudioPermission() {
        return false;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
}