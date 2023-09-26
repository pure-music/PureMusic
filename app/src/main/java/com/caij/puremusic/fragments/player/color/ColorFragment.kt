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
package com.caij.puremusic.fragments.player.color

import android.animation.ValueAnimator
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.core.animation.doOnEnd
import code.name.monkey.appthemehelper.util.ToolbarContentTintHelper
import com.caij.puremusic.R
import com.caij.puremusic.databinding.FragmentColorPlayerBinding
import com.caij.puremusic.extensions.colorControlNormal
import com.caij.puremusic.extensions.drawAboveSystemBars
import com.caij.puremusic.extensions.whichFragment
import com.caij.puremusic.fragments.base.AbsPlayerFragment
import com.caij.puremusic.fragments.player.PlayerAlbumCoverFragment
import com.caij.puremusic.helper.MusicPlayerRemote
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.util.color.MediaNotificationProcessor

class ColorFragment : AbsPlayerFragment(R.layout.fragment_color_player) {

    private var lastColor: Int = 0
    private var navigationColor: Int = 0
    private lateinit var playbackControlsFragment: ColorPlaybackControlsFragment
    private var valueAnimator: ValueAnimator? = null
    private var _binding: FragmentColorPlayerBinding? = null
    private val binding get() = _binding!!

    override val paletteColor: Int
        get() = navigationColor

    override fun onColorChanged(color: MediaNotificationProcessor) {
        if (_binding == null) return

        libraryViewModel.updateColor(color.backgroundColor)
        lastColor = color.secondaryTextColor
        playbackControlsFragment.setColor(color)
        navigationColor = color.backgroundColor

        binding.colorGradientBackground.setBackgroundColor(color.backgroundColor)
        val animator =
            playbackControlsFragment.createRevealAnimator(binding.colorGradientBackground)
        animator.doOnEnd {
            _binding?.root?.setBackgroundColor(color.backgroundColor)
        }
        animator.start()
        binding.playerToolbar.post {
            tintChild(binding.includePlayMenu.root, color.secondaryTextColor)
        }
    }

    override fun onFavoriteToggled() {
        toggleFavorite(MusicPlayerRemote.currentSong)
    }

    override fun onShow() {
        playbackControlsFragment.show()
    }

    override fun onHide() {
        playbackControlsFragment.hide()
        onBackPressed()
    }

    override fun onBackPressed(): Boolean {
        return false
    }

    override fun toolbarIconColor(): Int {
        return lastColor
    }

    override fun toggleFavorite(song: Song) {
        super.toggleFavorite(song)
        if (song.id == MusicPlayerRemote.currentSong.id) {
            updateIsFavorite()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        if (valueAnimator != null) {
            valueAnimator!!.cancel()
            valueAnimator = null
        }
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentColorPlayerBinding.bind(view)
        setUpSubFragments()
        setUpPlayerToolbar()
        val playerAlbumCoverFragment: PlayerAlbumCoverFragment =
            whichFragment(R.id.playerAlbumCoverFragment)
        playerAlbumCoverFragment.setCallbacks(this)
        binding.playerToolbar.drawAboveSystemBars()
    }

    private fun setUpSubFragments() {
        playbackControlsFragment = whichFragment(R.id.playbackControlsFragment)
    }

    private fun setUpPlayerToolbar() {
        binding.includePlayMenu.actionSleepTimer.setOnClickListener(this)
        binding.includePlayMenu.actionToggleLyrics.setOnClickListener(this)
        binding.includePlayMenu.actionToggleFavorite.setOnClickListener(this)
        binding.includePlayMenu.nowPlaying.setOnClickListener(this)
        binding.includePlayMenu.actionMore.setOnClickListener(this)
        tintChild(binding.includePlayMenu.root, colorControlNormal())
    }

    companion object {
        fun newInstance(): ColorFragment {
            return ColorFragment()
        }
    }
}
