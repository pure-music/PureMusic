package com.caij.puremusic.util.meta

import com.google.android.exoplayer2.upstream.DataReader
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import okhttp3.ResponseBody
import java.io.IOException

class OkhttpDataReader(private val url: String, private val okHttpClient: OkHttpClient): DataReader {

    var responseBody: ResponseBody? = null
    var response: Response? = null

    private fun connect() {
        val request = Request.Builder().url(url).get().build()
        val call = okHttpClient.newCall(request)
        val response = call.execute()
        if (response.code in 200..299) {
            responseBody = response.body
            this.response = response
        } else {
            throw IOException("error http code ${response.code}")
        }
    }

    fun getLength(): Long {
        if (responseBody == null) {
            connect()
        }
        return responseBody!!.contentLength()
    }

    fun getHeaders(): Map<String, List<String>> {
        if (responseBody == null) {
            connect()
        }
        return response!!.headers.toMultimap()
    }

    override fun read(buffer: ByteArray, offset: Int, length: Int): Int {
        if (responseBody == null) {
            connect()
        }
        return responseBody!!.byteStream().read(buffer, offset, length)
    }

    fun close() {
       responseBody?.close()
    }
}