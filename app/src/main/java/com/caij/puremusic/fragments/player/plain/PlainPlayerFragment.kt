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
package com.caij.puremusic.fragments.player.plain

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar
import code.name.monkey.appthemehelper.util.ToolbarContentTintHelper
import com.caij.puremusic.R
import com.caij.puremusic.databinding.FragmentPlainPlayerBinding
import com.caij.puremusic.extensions.colorControlNormal
import com.caij.puremusic.extensions.drawAboveSystemBars
import com.caij.puremusic.extensions.whichFragment
import com.caij.puremusic.fragments.base.AbsPlayerFragment
import com.caij.puremusic.fragments.base.goToAlbum
import com.caij.puremusic.fragments.base.goToArtist
import com.caij.puremusic.fragments.player.PlayerAlbumCoverFragment
import com.caij.puremusic.helper.MusicPlayerRemote
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.util.color.MediaNotificationProcessor

class PlainPlayerFragment : AbsPlayerFragment(R.layout.fragment_plain_player) {

    private lateinit var plainPlaybackControlsFragment: PlainPlaybackControlsFragment
    private var lastColor: Int = 0
    override val paletteColor: Int
        get() = lastColor
    private var _binding: FragmentPlainPlayerBinding? = null
    private val binding get() = _binding!!


    override fun onPlayingMetaChanged() {
        super.onPlayingMetaChanged()
        updateSong()
    }

    private fun updateSong() {
        val song = MusicPlayerRemote.currentSong
        binding.title.text = song.title
        binding.text.text = song.artistName
    }

    override fun onServiceConnected() {
        super.onServiceConnected()
        updateSong()
    }

    private fun setUpPlayerToolbar() {
        binding.includePlayMenu.actionSleepTimer.setOnClickListener(this)
        binding.includePlayMenu.actionToggleLyrics.setOnClickListener(this)
        binding.includePlayMenu.actionToggleFavorite.setOnClickListener(this)
        binding.includePlayMenu.nowPlaying.setOnClickListener(this)
        binding.includePlayMenu.actionMore.setOnClickListener(this)
        tintChild(binding.includePlayMenu.root, colorControlNormal())
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentPlainPlayerBinding.bind(view)
        setUpSubFragments()
        setUpPlayerToolbar()
        binding.title.isSelected = true
        binding.text.isSelected = true
        binding.title.setOnClickListener {
            goToAlbum(requireActivity())
        }
        binding.text.setOnClickListener {
            goToArtist(requireActivity())
        }
        binding.playerToolbar.drawAboveSystemBars()
    }

    private fun setUpSubFragments() {
        plainPlaybackControlsFragment = whichFragment(R.id.playbackControlsFragment)
        val playerAlbumCoverFragment: PlayerAlbumCoverFragment =
            whichFragment(R.id.playerAlbumCoverFragment)
        playerAlbumCoverFragment.setCallbacks(this)
    }

    override fun onShow() {
        plainPlaybackControlsFragment.show()
    }

    override fun onHide() {
        plainPlaybackControlsFragment.hide()
        onBackPressed()
    }

    override fun onBackPressed(): Boolean {
        return false
    }

    override fun toolbarIconColor() = colorControlNormal()

    override fun onColorChanged(color: MediaNotificationProcessor) {
        plainPlaybackControlsFragment.setColor(color)
        lastColor = color.primaryTextColor
        libraryViewModel.updateColor(color.primaryTextColor)
        tintChild(binding.includePlayMenu.root, colorControlNormal())
    }

    override fun onFavoriteToggled() {
        toggleFavorite(MusicPlayerRemote.currentSong)
    }

    override fun toggleFavorite(song: Song) {
        super.toggleFavorite(song)
        if (song.id == MusicPlayerRemote.currentSong.id) {
            updateIsFavorite()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
