package com.caij.puremusic.util;


import android.content.Context;

import com.caij.down.asynctask.ATDownLoad;
import com.caij.down.asynctask.Result;
import com.caij.down.core.Connection;
import com.caij.down.core.DataSource;
import com.caij.down.core.Engine;
import com.caij.puremusic.BuildConfig;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class DownManager {

    private ATDownLoad mRxDownload;

    private DownManager(){}

    private static class Holder {
        static final DownManager sDownManager = new DownManager();
    }

    public static DownManager getInstance() {
        return Holder.sDownManager;
    }

    public Result down(String download_url, DataSource fileData) {
        return mRxDownload.down(download_url, fileData, 500);
    }

    public Result down(String download_url, Map<String, String> headers, DataSource fileData) {
        return mRxDownload.down(download_url, headers, fileData, 500);
    }

    public void initSelf(OkHttpClient okHttpClient) {
        mRxDownload = new ATDownLoad(new OkHttpEngine(okHttpClient));
    }

    public static class OkHttpEngine implements Engine {

        private OkHttpClient okHttpClient;

        public OkHttpEngine(OkHttpClient okHttpClient) {
            this.okHttpClient = okHttpClient;
        }

        @Override
        public Connection createConnection(String url) {
            return new OKHttpConnection(okHttpClient, url);
        }
    }

    private static class OKHttpConnection implements Connection {

        private  String mUrl;
        private OkHttpClient okHttpClient;
        private Call call;
        private Response response;

        OKHttpConnection(OkHttpClient okHttpClient, String url) {
            this.okHttpClient = okHttpClient;
            this.mUrl = url;
        }

        @Override
        public void connect() throws IOException {
            connect(null);
        }

        @Override
        public void connect(Map<String, String> headers) throws IOException {
            Request.Builder requestBuilder = new Request.Builder()
                    .url(mUrl);

            if (headers != null && !headers.isEmpty()) {
                for (Map.Entry<String, String> entry : headers.entrySet()) {
                     requestBuilder.addHeader(entry.getKey(), entry.getValue());
                }
            }

            call = okHttpClient.newCall(requestBuilder.build());
            response = call.execute();
        }

        @Override
        public void disconnect() {
            if (response != null) response.close();
        }

        @Override
        public int getResponseCode() throws IOException {
            if (response != null) return response.code();
            return 0;
        }

        @Override
        public InputStream getInputStream() throws IOException {
            if (response != null) {
                ResponseBody responseBody = response.body();
                if (responseBody != null) {
                    return responseBody.byteStream();
                }
            }
            return null;
        }

        @Override
        public long getContentLength() {
            if (response != null) {
                ResponseBody responseBody = response.body();
                if (responseBody != null) {
                    return responseBody.contentLength();
                }
            }
            return 0;
        }

        @Override
        public void cancel() {
            if (call != null) call.cancel();
        }
    }
}
