package com.caij.puremusic.analyze;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;

import com.caij.puremusic.App;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;

import org.jetbrains.annotations.NotNull;

public class Catee {
    
    public static void preInit(@NotNull Context app, @NotNull String channel) {
        RemoteConfig.init();
    }

    public static void init(final Application application, final String channel, final boolean isDebug, final String versionName) {

    }

    public static void logEvent(@NotNull String key, @NotNull String value) {
        Bundle bundle = new Bundle();
        bundle.putString("value", value);
        FirebaseAnalytics.getInstance(App.Companion.getContext()).logEvent(key, bundle);
    }

    public static void logException(@NotNull Exception e) {
        FirebaseCrashlytics.getInstance().recordException(e);
    }

    public static void submitPolicyGrantResult(Application application, boolean grant) {

    }
}
