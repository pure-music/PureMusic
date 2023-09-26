package com.caij.puremusic.analyze;

import android.content.Context;

import org.jetbrains.annotations.NotNull;

public class ChannelUtil {
    @NotNull
    public static String getChannel(@NotNull Context context) {
        return "google";
    }

    public static boolean isGoogle(Context context) {
        return true;
    }
}
