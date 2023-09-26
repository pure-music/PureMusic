package com.caij.puremusic.analyze;

import android.text.TextUtils;

import androidx.annotation.NonNull;

import com.caij.puremusic.BuildConfig;
import com.caij.vip.LogUtil;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;

public class RemoteConfig {

    private static final String TAG = "RemoteConfig";
    private static FirebaseRemoteConfig mFirebaseRemoteConfig;


    public static void init() {
        mFirebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        FirebaseRemoteConfigSettings configSettings = new FirebaseRemoteConfigSettings.Builder()
                .setMinimumFetchIntervalInSeconds(BuildConfig.DEBUG ? 60 : 3600)
                .build();
        mFirebaseRemoteConfig.setConfigSettingsAsync(configSettings);

        mFirebaseRemoteConfig.fetchAndActivate()
                .addOnCompleteListener(new OnCompleteListener<Boolean>() {
                    @Override
                    public void onComplete(@NonNull Task<Boolean> task) {
                        if (task.isSuccessful()) {
                            boolean updated = task.getResult();
                            LogUtil.d(TAG, "Config params updated: " + updated);
                        } else {
                            LogUtil.d(TAG, "Config params error: " + task.getException().getMessage());
                        }
                    }
                });
    }

    public static String getString(String key, String defaultValue) {
        String value = mFirebaseRemoteConfig.getString(key);
        try {
            if (!TextUtils.isEmpty(value)) {
                return value;
            }
        } catch (Throwable t) {

        }
        return defaultValue;
    }

    public static int getInt(String key, int defaultValue) {
        String value = mFirebaseRemoteConfig.getString(key);
        try {
            if (!TextUtils.isEmpty(value)) {
                return Integer.parseInt(value);
            }
        } catch (Throwable t) {

        }
        return defaultValue;
    }


    public static boolean getBoolean(String key, boolean defaultValue) {
        String value = mFirebaseRemoteConfig.getString(key);
        try {
            if (!TextUtils.isEmpty(value)) {
                return Boolean.parseBoolean(value);
            }
        } catch (Throwable t) {

        }
        return defaultValue;
    }
}
