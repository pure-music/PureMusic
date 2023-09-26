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

import android.animation.Animator
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.ViewAnimationUtils
import android.view.animation.AccelerateInterpolator
import android.view.animation.DecelerateInterpolator
import android.widget.ImageButton
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import code.name.monkey.appthemehelper.util.ColorUtil
import code.name.monkey.appthemehelper.util.TintHelper
import com.caij.puremusic.R
import com.caij.puremusic.databinding.FragmentColorPlayerPlaybackControlsBinding
import com.caij.puremusic.extensions.applyColor
import com.caij.puremusic.extensions.getSongInfo
import com.caij.puremusic.extensions.hide
import com.caij.puremusic.extensions.show
import com.caij.puremusic.fragments.base.AbsPlayerControlsFragment
import com.caij.puremusic.fragments.base.goToAlbum
import com.caij.puremusic.fragments.base.goToArtist
import com.caij.puremusic.helper.MusicPlayerRemote
import com.caij.puremusic.lyrics.SimpleLrcView
import com.caij.puremusic.util.PreferenceUtil
import com.caij.puremusic.util.ViewUtil
import com.caij.puremusic.util.color.MediaNotificationProcessor
import com.google.android.material.slider.Slider
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.math.sqrt

class ColorPlaybackControlsFragment :
    AbsPlayerControlsFragment(R.layout.fragment_color_player_playback_controls) {

    private var _binding: FragmentColorPlayerPlaybackControlsBinding? = null
    private val binding get() = _binding!!

    override val progressSlider: Slider
        get() = binding.progressSlider

    override val shuffleButton: ImageButton
        get() = binding.shuffleButton

    override val repeatButton: ImageButton
        get() = binding.repeatButton

    override val nextButton: ImageButton
        get() = binding.nextButton

    override val previousButton: ImageButton
        get() = binding.previousButton

    override val songTotalTime: TextView
        get() = binding.songTotalTime

    override val songCurrentProgress: TextView
        get() = binding.songCurrentProgress

    override val lyricsView2: SimpleLrcView
        get() = binding.lyricsView2

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentColorPlayerPlaybackControlsBinding.bind(view)

        initLyrics()

        setUpPlayPauseFab()
        binding.title.isSelected = true
        binding.text.isSelected = true
        binding.title.setOnClickListener {
            goToAlbum(requireActivity())
        }
        binding.text.setOnClickListener {
            goToArtist(requireActivity())
        }
    }

    override fun getAvalibleHeight(): Float {
        return requireView().height - ViewUtil.convertDpToPixel(16f, resources) * 3 - binding.text.height - binding.title.height -
                binding.songInfo.height - binding.playPauseButton.height - binding.volumeFragmentContainer.height
//        return super.getAvalibleHeight()
    }

    private fun updateSong() {
        val song = MusicPlayerRemote.currentSong
        binding.title.text = song.title
        binding.text.text = song.artistName

        if (PreferenceUtil.isSongInfo) {
            lifecycleScope.launch(Dispatchers.Main) {
                val songInfo = withContext(Dispatchers.IO) {
                    getSongInfo(song)
                }
                binding.songInfo.text = songInfo
            }
            binding.songInfo.show()
        } else {
            binding.songInfo.hide()
        }
    }

    override fun onServiceConnected() {
        updatePlayPauseDrawableState()
        updateRepeatState()
        updateShuffleState()
        updateSong()
    }

    override fun onPlayingMetaChanged() {
        super.onPlayingMetaChanged()
        updateSong()
    }

    override fun onPlayStateChanged() {
        updatePlayPauseDrawableState()
    }

    override fun onRepeatModeChanged() {
        updateRepeatState()
    }

    override fun onShuffleModeChanged() {
        updateShuffleState()
    }

    override fun setColor(color: MediaNotificationProcessor) {
        TintHelper.setTintAuto(binding.playPauseButton, color.primaryTextColor, true)
        TintHelper.setTintAuto(binding.playPauseButton, color.backgroundColor, false)
        binding.progressSlider.applyColor(color.primaryTextColor)

        binding.title.setTextColor(color.primaryTextColor)
        binding.text.setTextColor(color.secondaryTextColor)

        lyricsView2.setCurrentColor(color.primaryTextColor)
        lyricsView2.setNormalTextColor(color.secondaryTextColor)

        binding.songInfo.setTextColor(color.secondaryTextColor)
        binding.songCurrentProgress.setTextColor(color.secondaryTextColor)
        binding.songTotalTime.setTextColor(color.secondaryTextColor)
        volumeFragment?.setTintableColor(color.primaryTextColor)

        lastPlaybackControlsColor = color.secondaryTextColor
        lastDisabledPlaybackControlsColor = ColorUtil.withAlpha(color.secondaryTextColor, 0.25f)

        updateRepeatState()
        updateShuffleState()
        updatePrevNextColor()

    }

    private fun setUpPlayPauseFab() {
        TintHelper.setTintAuto(binding.playPauseButton, Color.WHITE, true)
        TintHelper.setTintAuto(binding.playPauseButton, Color.BLACK, false)
        binding.playPauseButton.setOnClickListener {
            if (MusicPlayerRemote.isPlaying) {
                MusicPlayerRemote.pauseSong()
            } else {
                MusicPlayerRemote.resumePlaying()
            }
            it.showBounceAnimation()
        }
    }

    private fun updatePlayPauseDrawableState() {
        binding.playPauseButton.setImageResource(
            when {
                MusicPlayerRemote.isPlaying -> R.drawable.ic_pause
                else -> R.drawable.ic_play_arrow
            }
        )
    }

    public override fun show() {
        binding.playPauseButton.animate()
            .scaleX(1f)
            .scaleY(1f)
            .rotation(360f)
            .setInterpolator(DecelerateInterpolator())
            .start()
    }

    public override fun hide() {
        binding.playPauseButton.apply {
            scaleX = 0f
            scaleY = 0f
            rotation = 0f
        }
    }

    fun createRevealAnimator(view: View): Animator {
        val location = IntArray(2)
        binding.playPauseButton.getLocationOnScreen(location)
        val x = (location[0] + binding.playPauseButton.measuredWidth / 2)
        val y = (location[1] + binding.playPauseButton.measuredHeight / 2)
        val endRadius = sqrt((x * x + y * y).toFloat())
        val startRadius =
            binding.playPauseButton.measuredWidth.coerceAtMost(binding.playPauseButton.measuredHeight)
        return ViewAnimationUtils.createCircularReveal(
            view, x, y, startRadius.toFloat(),
            endRadius
        ).apply {
            duration = 300
            interpolator = AccelerateInterpolator()
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
