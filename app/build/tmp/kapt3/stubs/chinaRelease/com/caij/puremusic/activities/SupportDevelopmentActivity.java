package com.caij.puremusic.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\nH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/caij/puremusic/activities/SupportDevelopmentActivity;", "Lcom/caij/puremusic/activities/base/AbsThemeActivity;", "()V", "binding", "Lcom/caij/puremusic/databinding/ActivityDonationBinding;", "getBinding", "()Lcom/caij/puremusic/databinding/ActivityDonationBinding;", "setBinding", "(Lcom/caij/puremusic/databinding/ActivityDonationBinding;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "setupToolbar", "Companion", "app_chinaRelease"})
public final class SupportDevelopmentActivity extends com.caij.puremusic.activities.base.AbsThemeActivity {
    public com.caij.puremusic.databinding.ActivityDonationBinding binding;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.activities.SupportDevelopmentActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PAYPAL_URL = "https://paypal.me/quickersilver";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KOFI_URL = "https://ko-fi.com/quickersilver";
    
    public SupportDevelopmentActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.caij.puremusic.databinding.ActivityDonationBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.databinding.ActivityDonationBinding p0) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupToolbar() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/caij/puremusic/activities/SupportDevelopmentActivity$Companion;", "", "()V", "KOFI_URL", "", "PAYPAL_URL", "app_chinaRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}