package com.caij.puremusic.util

import com.caij.puremusic.BuildConfig
import io.ktor.client.*
import io.ktor.client.engine.okhttp.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json
import okhttp3.OkHttpClient

object HttpUtil {
    private val okHttpClientBuilder: OkHttpClient.Builder = BuildConfig.sBuildHelper
        .addNetworkInterceptor(HttpManager.getInstance().defaultOkHttpClient.newBuilder())
    val okHttpClient: OkHttpClient = okHttpClientBuilder.build()

    val httpClient = HttpClient(OkHttp) {
        engine {
            config {
                followRedirects(true)
                followSslRedirects(true)
                BuildConfig.sBuildHelper.addNetworkInterceptor(this)
            }
        }
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
            })
        }
    }
}