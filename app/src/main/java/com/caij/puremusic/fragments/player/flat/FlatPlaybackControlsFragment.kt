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
package com.caij.puremusic.fragments.player.flat

import android.os.Bundle
import android.view.View
import android.view.animation.DecelerateInterpolator
import android.widget.ImageButton
import android.widget.SeekBar
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import code.name.monkey.appthemehelper.util.ATHUtil
import code.name.monkey.appthemehelper.util.ColorUtil
import code.name.monkey.appthemehelper.util.MaterialValueHelper
import code.name.monkey.appthemehelper.util.TintHelper
import com.caij.puremusic.R
import com.caij.puremusic.databinding.FragmentFlatPlayerPlaybackControlsBinding
import com.caij.puremusic.extensions.*
import com.caij.puremusic.fragments.base.AbsPlayerControlsFragment
import com.caij.puremusic.fragments.base.goToAlbum
import com.caij.puremusic.fragments.base.goToArtist
import com.caij.puremusic.helper.MusicPlayerRemote
import com.caij.puremusic.helper.MusicProgressViewUpdateHelper.Callback
import com.caij.puremusic.helper.PlayPauseButtonOnClickHandler
import com.caij.puremusic.util.PreferenceUtil
import com.caij.puremusic.util.color.MediaNotificationProcessor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class FlatPlaybackControlsFragment :
    AbsPlayerControlsFragment(R.layout.fragment_flat_player_playback_controls), Callback {

    private var _binding: FragmentFlatPlayerPlaybackControlsBinding? = null
    private val binding get() = _binding!!

    override val seekBar: SeekBar
        get() = binding.progressSlider

    override val shuffleButton: ImageButton
        get() = binding.shuffleButton

    override val repeatButton: ImageButton
        get() = binding.repeatButton

    override val nextButton: ImageButton?
        get() = null

    override val previousButton: ImageButton?
        get() = null

    override val songTotalTime: TextView
        get() = binding.songTotalTime

    override val songCurrentProgress: TextView
        get() = binding.songCurrentProgress

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentFlatPlayerPlaybackControlsBinding.bind(view)
        binding.playPauseButton.setOnClickListener(PlayPauseButtonOnClickHandler())
        binding.title.isSelected = true
        binding.text.isSelected = true
        binding.title.setOnClickListener {
            goToAlbum(requireActivity())
        }
        binding.text.setOnClickListener {
            goToArtist(requireActivity())
        }
    }

    public override fun show() {
        binding.playPauseButton.animate()
            .scaleX(1f)
            .scaleY(1f)
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

    override fun setColor(color: MediaNotificationProcessor) {
        if (ATHUtil.isWindowBackgroundDark(requireContext())) {
            lastPlaybackControlsColor =
                MaterialValueHelper.getSecondaryTextColor(requireContext(), false)
            lastDisabledPlaybackControlsColor =
                MaterialValueHelper.getSecondaryDisabledTextColor(requireContext(), false)
        } else {
            lastPlaybackControlsColor =
                MaterialValueHelper.getPrimaryTextColor(requireContext(), true)
            lastDisabledPlaybackControlsColor =
                MaterialValueHelper.getPrimaryDisabledTextColor(requireContext(), true)
        }

        val colorFinal = if (PreferenceUtil.isAdaptiveColor) {
            color.primaryTextColor
        } else {
            accentColor().ripAlpha()
        }

        updateTextColors(colorFinal)
        volumeFragment?.setTintable(colorFinal)
        binding.progressSlider.applyColor(colorFinal)
        updateRepeatState()
        updateShuffleState()
    }

    private fun updateTextColors(color: Int) {
        val isDark = ColorUtil.isColorLight(color)
        val darkColor = ColorUtil.darkenColor(color)
        val colorPrimary = MaterialValueHelper.getPrimaryTextColor(context, isDark)
        val colorSecondary =
            MaterialValueHelper.getSecondaryTextColor(context, ColorUtil.isColorLight(darkColor))

        TintHelper.setTintAuto(binding.playPauseButton, colorPrimary, false)
        TintHelper.setTintAuto(binding.playPauseButton, color, true)

        binding.title.setBackgroundColor(color)
        binding.title.setTextColor(colorPrimary)
        binding.text.setBackgroundColor(darkColor)
        binding.text.setTextColor(colorSecondary)
        binding.songInfo.setBackgroundColor(darkColor)
        binding.songInfo.setTextColor(colorSecondary)
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

    private fun updatePlayPauseDrawableState() {
        if (MusicPlayerRemote.isPlaying) {
            binding.playPauseButton.setImageResource(R.drawable.ic_pause)
        } else {
            binding.playPauseButton.setImageResource(R.drawable.ic_play_arrow_white_32dp)
        }
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

    override fun onRepeatModeChanged() {
        updateRepeatState()
    }

    override fun onShuffleModeChanged() {
        updateShuffleState()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}