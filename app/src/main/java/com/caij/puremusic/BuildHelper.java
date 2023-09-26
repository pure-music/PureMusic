package com.caij.puremusic;

import android.content.Context;

import okhttp3.OkHttpClient;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 *         2017/7/25
 */
public interface BuildHelper {

    void init(Context context);

    OkHttpClient.Builder addNetworkInterceptor(OkHttpClient.Builder builder);
}
