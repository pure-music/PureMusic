package com.caij.puremusic.network

import android.content.Context
import com.caij.puremusic.BuildConfig
import com.caij.puremusic.model.DeezerResponse
import com.caij.puremusic.network.model.SearchResponse
import okhttp3.Cache
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.SkipCallbackExecutor
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.create
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Query
import java.io.File
import java.util.*

private const val BASE_QUERY_ARTIST = "search/artist"
private const val BASE_URL = "https://api.deezer.com/"

interface DeezerService {

    @GET("$BASE_QUERY_ARTIST&limit=1")
    @SkipCallbackExecutor
    fun getArtistImage(
        @Query("q") artistName: String
    ): Call<DeezerResponse>


    @GET("https://api.spotify.com/v1/search")
    @SkipCallbackExecutor
    fun searchArtist(
        @Query("q") artistName: String, @Query("type") type: String, @Query("market") market: String?,
        @Query("limit") limit: String, @Query("offset") offset: String,
        @Header("Authorization") authorization: String, @Query("include_external") include_external: String = "audio"
    ): Call<SearchResponse>

    @POST("https://translate.googleapis.com/translate_a/single")
    @FormUrlEncoded
    fun translationGoogle(
        @Query("client") client: String?, @Query("sl") sl: String?,
        @Query("tl") tl: String?, @Query("dj") dj: String?,
        @Query("dt") dt: String?, @Field("q") q: String?, @Header("User-Agent") userAgent: String?
    ): Call<String>

    companion object {
        operator fun invoke(
            client: okhttp3.Call.Factory
        ): DeezerService {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .callFactory(client)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create()
        }

        fun createDefaultOkHttpClient(
            context: Context
        ): OkHttpClient.Builder = BuildConfig.sBuildHelper.addNetworkInterceptor(OkHttpClient.Builder())
            .cache(createDefaultCache(context))
            .addInterceptor(createCacheControlInterceptor())

        private fun createDefaultCache(
            context: Context
        ): Cache? {
            val cacheDir = File(context.applicationContext.cacheDir.absolutePath, "/okhttp-deezer/")
            if (cacheDir.mkdir() or cacheDir.isDirectory) {
                return Cache(cacheDir, 1024 * 1024 * 10)
            }
            return null
        }

        private fun createCacheControlInterceptor(): Interceptor {
            return Interceptor { chain ->
                val modifiedRequest = chain.request().newBuilder()
                    .addHeader(
                        "Cache-Control",
                        String.format(
                            Locale.getDefault(),
                            "max-age=31536000, max-stale=31536000"
                        )
                    ).build()
                chain.proceed(modifiedRequest)
            }
        }
    }
}
