package com.caij.puremusic.util;

import static com.caij.puremusic.util.LogUtilKt.logD;

import android.content.Context;

import androidx.annotation.NonNull;


import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.SSLException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;

public class HttpManager {

    private static final long READ_TIMEOUT = 10;
    private static final long WRITE_TIMEOUT = 10;
    private static final long CONNECT_TIMEOUT = 5;

    private static final String TAG = "HttpPlugin";

    private OkHttpClient mGlobalOkhttp;

    private OkHttpClient dateOkHttpClient;
    private OkHttpClient downOkHttpClient;

    //https://github.com/square/okhttp/issues/3146

    private static class Holder {
        private static HttpManager httpManager = new HttpManager();
    }

    public static HttpManager getInstance() {
        return Holder.httpManager;
    }

    private HttpManager() {

    }

    public void initSelf(Context context, boolean isOpenH2) {
        Interceptor errorInterceptor = new Interceptor() {

            @NonNull
            @Override
            public Response intercept(@NonNull Chain chain) throws IOException {
                Request request = chain.request();
                try {
                    return chain.proceed(request);
                } catch (Exception e) {
//                  https://github.com/square/okhttp/issues/3761
                    if (e instanceof RuntimeException && e.getCause() instanceof SSLException) {
                        throw new IOException(e.getCause());
                    }

                    if (!(e instanceof IOException)) {
                        //解决闪退问题
                        throw new IOException(e);
                    }

                    throw e;
                }
            }
        };

        List<Protocol> protocols;
        if (isOpenH2) {
            protocols = Arrays.asList(Protocol.HTTP_1_1, Protocol.HTTP_2);
            logD(TAG, "开启http 2");
        } else {
            protocols = Arrays.asList(Protocol.HTTP_1_1);
        }

        OkHttpClient.Builder builder = new OkHttpClient.Builder()
                .addInterceptor(errorInterceptor)
                .protocols(protocols);

        mGlobalOkhttp = builder
                .build();
    }

    public OkHttpClient getDefaultOkHttpClient() {
        if (dateOkHttpClient == null) {
            OkHttpClient.Builder okHttpBuild = mGlobalOkhttp.newBuilder();
            dateOkHttpClient = okHttpBuild
                    .readTimeout(READ_TIMEOUT, TimeUnit.SECONDS)//设置读取超时时间
                    .writeTimeout(WRITE_TIMEOUT, TimeUnit.SECONDS)//设置写的超时时间
                    .connectTimeout(CONNECT_TIMEOUT, TimeUnit.SECONDS)//设置连接超时时S间
                    .build();
        }
        return dateOkHttpClient;
    }

    public OkHttpClient getDownImage() {
        if (downOkHttpClient == null) {
            downOkHttpClient = mGlobalOkhttp.newBuilder()
                    .readTimeout(3, TimeUnit.SECONDS)//设置读取超时时间
                    .writeTimeout(3, TimeUnit.SECONDS)//设置写的超时时间
                    .connectTimeout(3, TimeUnit.SECONDS)//设置连接超时时间
                    .build();
        }
        return downOkHttpClient;
    }

    public OkHttpClient getDownClient() {
        if (downOkHttpClient == null) {
            downOkHttpClient = mGlobalOkhttp.newBuilder()
                    .readTimeout(READ_TIMEOUT, TimeUnit.SECONDS)//设置读取超时时间
                    .writeTimeout(WRITE_TIMEOUT, TimeUnit.SECONDS)//设置写的超时时间
                    .connectTimeout(CONNECT_TIMEOUT, TimeUnit.SECONDS)//设置连接超时时间
                    .build();
        }
        return downOkHttpClient;
    }
}
