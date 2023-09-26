package com.caij.puremusic.service

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.net.Uri
import com.caij.puremusic.App.Companion.getContext
import com.caij.puremusic.BuildConfig
import com.caij.puremusic.ThreadManager
import com.google.android.exoplayer2.database.DatabaseProvider
import com.google.android.exoplayer2.upstream.DataSource
import com.google.android.exoplayer2.upstream.DataSpec
import com.google.android.exoplayer2.upstream.cache.*
import java.io.File
import java.util.*

class CacheUtil {
    companion object {
        const val CACHE_FRAGMENT_SIZE = 1 * 1024 * 1024L
        val cacheKeyFactory = CacheKeyFactory.DEFAULT

        val simpleCache: SimpleCache
        init {
            val dbHelper = DBHelper(getContext(), "music_cache.db", null, 1)
            simpleCache = SimpleCache(File(getContext().cacheDir, "exocache"), LeastRecentlyUsedCacheEvictor((200 * 1024 * 1024).toLong()),
                object : DatabaseProvider {
                    override fun getWritableDatabase(): SQLiteDatabase {
                        return dbHelper.writableDatabase
                    }

                    override fun getReadableDatabase(): SQLiteDatabase {
                        return dbHelper.readableDatabase
                    }
                })
        }

        fun getCache(url: String, position: Long = 0): NavigableSet<CacheSpan> {
            val builder = DataSpec.Builder().setUri(url)
                .setPosition(0)
                .setLength(CACHE_FRAGMENT_SIZE)
            var dataSpec = builder.build()
            val key = cacheKeyFactory.buildCacheKey(dataSpec)
            return simpleCache.getCachedSpans(key)
        }

        fun cache(context: Context, url: String, headers: Map<String, String>?, position: Long = 0) {
            val okhttpExoMediaPlayer = OkhttpExoMediaPlayer(context, ThreadManager.getInstance().NET_WORK_EXECUTOR)
            ThreadManager.getInstance().DISK_IO_EXECUTOR.execute(Runnable {
                val builder = DataSpec.Builder().setUri(url)
                    .setPosition(position)
                    .setLength(CACHE_FRAGMENT_SIZE)
                if (headers != null) {
                    builder.setHttpRequestHeaders(headers)
                }
                var dataSpec = builder.build()
                dataSpec = dataSpec.buildUpon().setKey(cacheKeyFactory.buildCacheKey(dataSpec)).build()
                try {
                    val factory = okhttpExoMediaPlayer.buildHttpDataSourceFactory(context, headers)
                    if (factory is CacheDataSource.Factory) {
                        val cacheDataSource = factory.createDataSource()
                        CacheWriter(cacheDataSource, dataSpec, null, null).cache()
                    }
                } catch (e: Exception) {
                    if (BuildConfig.DEBUG) {
                        throw RuntimeException(e)
                    }
                }
            })
        }
    }
}

class DBHelper(
    context: Context,
    name: String,
    factory: SQLiteDatabase.CursorFactory?,
    version: Int
) : SQLiteOpenHelper(context, name, factory, version) {
    override fun onCreate(db: SQLiteDatabase) {}
    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {}
}