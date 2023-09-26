package com.caij.puremusic.service;

import android.content.Context;
import android.net.Uri;

import androidx.annotation.NonNull;

import com.caij.exoplayer.ExoMediaPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.ext.okhttp.OkHttpDataSource;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultDataSource;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.upstream.cache.CacheKeyFactory;
import com.google.android.exoplayer2.util.Util;

import java.util.Map;
import java.util.concurrent.Executor;

import okhttp3.OkHttpClient;

public class OkhttpExoMediaPlayer extends ExoMediaPlayer {

    private final OkHttpClient okHttpClient;

    public OkhttpExoMediaPlayer(Context context, Executor executor) {
        this(context, executor, MediaHttp.getOkHttpClient());
    }

    public OkhttpExoMediaPlayer(Context context, Executor executor, OkHttpClient okHttpClient) {
        super(context, executor, false);
        this.okHttpClient = okHttpClient;
    }

    @Override
    protected DataSource.Factory buildHttpDataSourceFactory(Context context, Map<String, String> headers) {
        return buildCacheSourceFactory(context, headers, okHttpClient);
    }


}
