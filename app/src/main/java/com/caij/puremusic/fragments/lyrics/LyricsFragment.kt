/*
 * Copyright (c) 2020 Hemanth Savarla.
 *
 * Licensed under the GNU General Public License v3
 *
 * This is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 */
package com.caij.puremusic.fragments.lyrics

import android.os.Bundle
import android.view.*
import androidx.core.view.MenuProvider
import com.caij.puremusic.extensions.accentColor
import com.caij.puremusic.helper.MusicPlayerRemote
import com.caij.puremusic.helper.MusicProgressViewUpdateHelper
import com.caij.puremusic.lyrics.LrcView

class LyricsFragment : ComnLyricsFragment(),
    MusicProgressViewUpdateHelper.Callback, MenuProvider {

    private lateinit var updateHelper: MusicProgressViewUpdateHelper

    override fun onPlayingMetaChanged() {
        super.onPlayingMetaChanged()
        updateTitleSong()
        loadLyrics()
    }

    override fun onServiceConnected() {
        super.onServiceConnected()
        updateTitleSong()
        loadLyrics()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        updateHelper = MusicProgressViewUpdateHelper(this, 500, 1000)
        binding.lyricsView.apply {
            setDraggable(true, LrcView.OnPlayClickListener {
                MusicPlayerRemote.seekTo(it.toInt())
                return@OnPlayClickListener true
            })
        }
    }

    private fun updateTitleSong() {
        song = MusicPlayerRemote.currentSong
    }

    override fun onUpdateProgressViews(progress: Int, bufferedPosition: Int, total: Int) {
        binding.lyricsView.updateTime(progress.toLong())
    }

    override fun onResume() {
        super.onResume()
        updateHelper.start()
    }

    override fun onPause() {
        super.onPause()
        updateHelper.stop()
    }
}
