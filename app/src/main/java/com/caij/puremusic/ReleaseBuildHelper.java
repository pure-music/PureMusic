package com.caij.puremusic;

import android.content.Context;

import okhttp3.OkHttpClient;

public class ReleaseBuildHelper implements BuildHelper {
    @Override
    public void init(Context context) {

    }

    @Override
    public OkHttpClient.Builder addNetworkInterceptor(OkHttpClient.Builder builder) {
        return builder;
    }
}
