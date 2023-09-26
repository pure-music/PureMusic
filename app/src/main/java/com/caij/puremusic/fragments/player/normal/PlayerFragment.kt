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
package com.caij.puremusic.fragments.player.normal

import android.animation.ArgbEvaluator
import android.animation.ValueAnimator
import android.content.SharedPreferences
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.core.view.isVisible
import code.name.monkey.appthemehelper.util.ToolbarContentTintHelper
import com.caij.puremusic.R
import com.caij.puremusic.SNOWFALL
import com.caij.puremusic.databinding.FragmentPlayerBinding
import com.caij.puremusic.fragments.base.AbsPlayerFragment
import com.caij.puremusic.fragments.player.PlayerAlbumCoverFragment
import com.caij.puremusic.helper.MusicPlayerRemote
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.util.PreferenceUtil
import com.caij.puremusic.util.ViewUtil
import com.caij.puremusic.util.color.MediaNotificationProcessor
import com.caij.puremusic.views.DrawableGradient
import com.caij.puremusic.extensions.*

class PlayerFragment : AbsPlayerFragment(R.layout.fragment_player),
    SharedPreferences.OnSharedPreferenceChangeListener {

    private var lastColor: Int = 0
    override val paletteColor: Int
        get() = lastColor

    private lateinit var controlsFragment: PlayerPlaybackControlsFragment
    private var valueAnimator: ValueAnimator? = null

    private var _binding: FragmentPlayerBinding? = null
    private val binding get() = _binding!!


    private fun colorize(i: Int) {
        if (valueAnimator != null) {
            valueAnimator?.cancel()
        }

        valueAnimator = ValueAnimator.ofObject(
            ArgbEvaluator(),
            surfaceColor(),
            i
        )
        valueAnimator?.addUpdateListener { animation ->
            if (isAdded) {
                val drawable = DrawableGradient(
                    GradientDrawable.Orientation.TOP_BOTTOM,
                    intArrayOf(
                        animation.animatedValue as Int,
                        surfaceColor()
                    ), 0
                )
                binding.colorGradientBackground.background = drawable
            }
        }
        valueAnimator?.setDuration(ViewUtil.RETRO_MUSIC_ANIM_TIME.toLong())?.start()
    }

    override fun onShow() {
        controlsFragment.show()
    }

    override fun onHide() {
        controlsFragment.hide()
        onBackPressed()
    }

    override fun onBackPressed(): Boolean {
        return false
    }

    override fun toolbarIconColor() = colorControlNormal()

    override fun onColorChanged(color: MediaNotificationProcessor) {
        controlsFragment.setColor(color)
        lastColor = color.backgroundColor
        libraryViewModel.updateColor(color.backgroundColor)

        if (PreferenceUtil.isAdaptiveColor) {
            colorize(color.backgroundColor)
        }
    }

    override fun toggleFavorite(song: Song) {
        super.toggleFavorite(song)
        if (song.id == MusicPlayerRemote.currentSong.id) {
            updateIsFavorite()
        }
    }

    override fun onFavoriteToggled() {
        toggleFavorite(MusicPlayerRemote.currentSong)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentPlayerBinding.bind(view)
        setUpSubFragments()
        setUpPlayerToolbar()
        startOrStopSnow(PreferenceUtil.isSnowFalling)

        PreferenceUtil.sharedPreferences
            .registerOnSharedPreferenceChangeListener(this)
        binding.playerToolbar.drawAboveSystemBars()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        PreferenceUtil.sharedPreferences
            .unregisterOnSharedPreferenceChangeListener(this)
        _binding = null
    }

    private fun setUpSubFragments() {
        controlsFragment = whichFragment(R.id.playbackControlsFragment)
        val playerAlbumCoverFragment: PlayerAlbumCoverFragment =
            whichFragment(R.id.playerAlbumCoverFragment)
        playerAlbumCoverFragment.setCallbacks(this)
    }

    private fun setUpPlayerToolbar() {
        binding.includePlayMenu.actionSleepTimer.setOnClickListener(this)
        binding.includePlayMenu.actionToggleLyrics.setOnClickListener(this)
        binding.includePlayMenu.actionToggleFavorite.setOnClickListener(this)
        binding.includePlayMenu.nowPlaying.setOnClickListener(this)
        binding.includePlayMenu.actionMore.setOnClickListener(this)
    }

    override fun onSharedPreferenceChanged(sharedPreferences: SharedPreferences?, key: String?) {
        if (key == SNOWFALL) {
            startOrStopSnow(PreferenceUtil.isSnowFalling)
        }
    }

    private fun startOrStopSnow(isSnowFalling: Boolean) {
        if (_binding == null) return
        if (isSnowFalling && !surfaceColor().isColorLight) {
            binding.snowfallView.isVisible = true
            binding.snowfallView.restartFalling()
        } else {
            binding.snowfallView.isVisible = false
            binding.snowfallView.stopFalling()
        }
    }

    override fun onServiceConnected() {
        updateIsFavorite()
    }

    override fun onPlayingMetaChanged() {
        updateIsFavorite()
    }

    companion object {

        fun newInstance(): PlayerFragment {
            return PlayerFragment()
        }
    }
}
