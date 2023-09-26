package com.caij.puremusic

import android.content.Context
import com.caij.puremusic.util.HttpManager
import com.caij.vip.InitConfig
import com.tencent.mm.opensdk.openapi.WXAPIFactory
import okhttp3.OkHttpClient

class VipUIConfig(private val accentColor: Int, private val pageBackgroundColor: Int,
                  private val titleTextColor: Int, private val sub1TextColor: Int) : InitConfig.Provider {

    override fun accentColor(context: Context): Int {
        return accentColor
    }

    override fun versionCode(): Int {
        return BuildConfig.VERSION_CODE
    }

    override fun pageBackgroundColor(context: Context): Int {
        return pageBackgroundColor
    }

    override fun titleTextColor(context: Context): Int {
        return titleTextColor
    }

    override fun sub1TextColor(context: Context): Int {
        return sub1TextColor
    }

    override fun getWXAppId(): String {
        return WEIXIN_APP_ID
    }

    override fun okHttpClient(): OkHttpClient.Builder {
        return BuildConfig.sBuildHelper
            .addNetworkInterceptor(HttpManager.getInstance().defaultOkHttpClient.newBuilder())
    }
}