package com.caij.puremusic.fragments.settings;

import java.lang.System;

/**
 * @author Hemanth S (h4h13).
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\u001c\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0006\u0010\u0010\u001a\u00020\u0004J\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0000\u00a2\u0006\u0002\b\u0014J\u0012\u0010\u0011\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0004J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\tH\u0000\u00a2\u0006\u0002\b\u0017\u00a8\u0006\u0018"}, d2 = {"Lcom/caij/puremusic/fragments/settings/AbsSettingsFragment;", "Lcode/name/monkey/appthemehelper/common/prefs/supportv7/ATEPreferenceFragmentCompat;", "()V", "invalidateSettings", "", "onCreatePreferences", "savedInstanceState", "Landroid/os/Bundle;", "rootKey", "", "onDisplayPreferenceDialog", "preference", "Landroidx/preference/Preference;", "onViewCreated", "view", "Landroid/view/View;", "restartActivity", "setSummary", "value", "", "setSummary$app_chinaRelease", "showProToastAndNavigate", "message", "showProToastAndNavigate$app_chinaRelease", "app_chinaRelease"})
public abstract class AbsSettingsFragment extends code.name.monkey.appthemehelper.common.prefs.supportv7.ATEPreferenceFragmentCompat {
    
    public AbsSettingsFragment() {
        super();
    }
    
    public final void showProToastAndNavigate$app_chinaRelease(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void setSummary$app_chinaRelease(@org.jetbrains.annotations.NotNull()
    androidx.preference.Preference preference, @org.jetbrains.annotations.Nullable()
    java.lang.Object value) {
    }
    
    public abstract void invalidateSettings();
    
    protected final void setSummary(@org.jetbrains.annotations.Nullable()
    androidx.preference.Preference preference) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDisplayPreferenceDialog(@org.jetbrains.annotations.NotNull()
    androidx.preference.Preference preference) {
    }
    
    public final void restartActivity() {
    }
    
    @java.lang.Override()
    public void onCreatePreferences(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState, @org.jetbrains.annotations.Nullable()
    java.lang.String rootKey) {
    }
}