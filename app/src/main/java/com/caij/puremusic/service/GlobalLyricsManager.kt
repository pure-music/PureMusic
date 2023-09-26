package com.caij.puremusic.service

import com.caij.puremusic.App
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.extensions.isLocal
import com.caij.puremusic.helper.MusicPlayerRemote
import com.caij.puremusic.helper.MusicProgressViewUpdateHelper
import com.caij.puremusic.lyrics.LrcEntry
import com.caij.puremusic.lyrics.LrcUtils
import com.caij.puremusic.lyrics.SimpleLrcView
import com.caij.puremusic.util.BaseSongUtil
import com.caij.puremusic.util.LyricUtil
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.collections.ArrayList

object GlobalLyricsManager : MusicProgressViewUpdateHelper.Callback {

    private var updateHelper: MusicProgressViewUpdateHelper =
        MusicProgressViewUpdateHelper(this, 500, 1000)
    private var showLine: Int = 0
    private var lyricsCache: List<LrcEntry>? = null
    private var callbacks: ArrayList<LyricsCallback> = ArrayList()
    private var progressCallbacks: ArrayList<LyricsProgressCallback> = ArrayList()
    private var preSong: Song = BaseSongUtil.emptySong

    fun start() {
        showLine = 0
        if (!lyricsCache.isNullOrEmpty()) {
            showLine = SimpleLrcView.findShowLine(lyricsCache, MusicPlayerRemote.songProgressMillis.toLong())
        }
        updateHelper.start()
    }

    fun stop() {
        updateHelper.stop()
    }

    fun register(callback: LyricsCallback) {
        callbacks.add(callback)
    }

    fun unregister(callback: LyricsCallback) {
        callbacks.remove(callback)
    }

    fun registerProgress(callback: LyricsProgressCallback) {
        progressCallbacks.add(callback)
    }

    fun unregisterProgress(callback: LyricsProgressCallback) {
        progressCallbacks.remove(callback)
    }

    fun getCurrentLyricsText(): String? {
        if (lyricsCache != null && lyricsCache!!.isNotEmpty()) {
            return lyricsCache!![showLine].text
        }
        return null
    }

    fun getShowLine(): Int {
        return showLine
    }

    fun getLyrics(): List<LrcEntry>? {
        return lyricsCache
    }

    fun updateTime(progress: Int): Int {
        showLine = SimpleLrcView.findShowLine(lyricsCache, progress.toLong())
        return showLine
    }

    fun update(isForce: Boolean = false) {
        val song = MusicPlayerRemote.currentSong
        if (song.id == preSong.id) {
            if (!isForce) {
                return
            }
        }
        preSong = song
        lyricsCache = null
        showLine = 0
        for (c in callbacks) {
            c.lyricsReset()
        }
        if (song != BaseSongUtil.emptySong) {
            GlobalScope.launch(Dispatchers.IO) {
                val lrcFile = LyricUtil.getLrcFile(App.getContext(), song)
                val ents = if (lrcFile != null) {
                    LrcUtils.parseLrc(lrcFile)
                } else {
                    val embeddedLyrics = if (song.isLocal) {
                        LyricUtil.getEmbeddedSyncedLyrics(song.url)
                    } else {
                        ""
                    }
                    if (!embeddedLyrics.isNullOrEmpty()) {
                        LrcUtils.parseLrc(embeddedLyrics)
                    } else {
                        emptyList()
                    }
                }
                val results = if (ents.isNotEmpty()) {
                    LrcUtils.mergeSort(ents)
                } else {
                    ents
                }

                lyricsCache = results

                withContext(Dispatchers.Main) {
                    for (c in callbacks) {
                        c.lyricsUpdate(lyricsCache!!)
                    }
                }
            }
        } else {
            lyricsCache = emptyList()
            for (c in callbacks) {
                c.lyricsUpdate(lyricsCache!!)
            }
        }
    }

    override fun onUpdateProgressViews(progress: Int, bufferedPosition: Int, total: Int) {
        if (!lyricsCache.isNullOrEmpty()) {
            showLine = SimpleLrcView.findShowLine(lyricsCache, progress.toLong())
        }
        for (c in progressCallbacks) {
            c.onLineUpdate(showLine)
        }
    }
}

interface LyricsCallback {
    fun lyricsReset()
    fun lyricsUpdate(lyricsCache: List<LrcEntry>)
}

interface LyricsProgressCallback {
    fun onLineUpdate(line: Int)
}