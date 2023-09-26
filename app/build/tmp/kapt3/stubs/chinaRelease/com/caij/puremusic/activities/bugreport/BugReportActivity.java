package com.caij.puremusic.activities.bugreport;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\n\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/caij/puremusic/activities/bugreport/BugReportActivity;", "Lcom/caij/puremusic/activities/base/AbsThemeActivity;", "()V", "binding", "Lcom/caij/puremusic/databinding/ActivityBugReportBinding;", "deviceInfo", "Lcom/caij/puremusic/activities/bugreport/model/DeviceInfo;", "copyDeviceInfoToClipBoard", "", "initViews", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "reportIssue", "Companion", "app_chinaRelease"})
public class BugReportActivity extends com.caij.puremusic.activities.base.AbsThemeActivity {
    private com.caij.puremusic.databinding.ActivityBugReportBinding binding;
    private com.caij.puremusic.activities.bugreport.model.DeviceInfo deviceInfo;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.activities.bugreport.BugReportActivity.Companion Companion = null;
    private static final java.lang.String ISSUE_TRACKER_LINK = "https://github.com/RetroMusicPlayer/RetroMusicPlayer/issues";
    
    public BugReportActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViews() {
    }
    
    private final void reportIssue() {
    }
    
    private final void copyDeviceInfoToClipBoard() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/caij/puremusic/activities/bugreport/BugReportActivity$Companion;", "", "()V", "ISSUE_TRACKER_LINK", "", "app_chinaRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}