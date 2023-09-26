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

import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewTreeObserver.OnGlobalLayoutListener
import android.view.animation.DecelerateInterpolator
import android.widget.ImageButton
import android.widget.TextView
import androidx.annotation.ColorInt
import androidx.lifecycle.lifecycleScope
import code.name.monkey.appthemehelper.util.ATHUtil
import code.name.monkey.appthemehelper.util.ColorUtil
import code.name.monkey.appthemehelper.util.MaterialValueHelper
import code.name.monkey.appthemehelper.util.TintHelper
import com.caij.puremusic.EVENT_SONG_UPDATE
import com.caij.puremusic.EventBus
import com.caij.puremusic.EventObserver
import com.caij.puremusic.R
import com.caij.puremusic.databinding.FragmentPlayerPlaybackControlsBinding
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.extensions.*
import com.caij.puremusic.fragments.base.AbsPlayerControlsFragment
import com.caij.puremusic.fragments.base.goToAlbum
import com.caij.puremusic.fragments.base.goToArtist
import com.caij.puremusic.fragments.base.goToLyrics
import com.caij.puremusic.helper.MusicPlayerRemote
import com.caij.puremusic.lyrics.SimpleLrcView
import com.caij.puremusic.util.LyricUtil
import com.caij.puremusic.util.PreferenceUtil
import com.caij.puremusic.util.ViewUtil
import com.caij.puremusic.util.color.MediaNotificationProcessor
import com.google.android.material.slider.Slider
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class PlayerPlaybackControlsFragment :
    AbsPlayerControlsFragment(R.layout.fragment_player_playback_controls), EventObserver {

    private var _binding: FragmentPlayerPlaybackControlsBinding? = null
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
        _binding = FragmentPlayerPlaybackControlsBinding.bind(view)

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

        EventBus.register(EVENT_SONG_UPDATE, this)
    }

    override fun getAvalibleHeight(): Float {
        return requireView().height - ViewUtil.convertDpToPixel(16f, resources) * 3 - binding.text.height - binding.title.height -
                binding.songInfo.height - binding.playPauseButton.height - binding.volumeFragmentContainer.height
//        return super.getAvalibleHeight()
    }

    override fun setColor(color: MediaNotificationProcessor) {
        val colorBg = ATHUtil.resolveColor(requireContext(), android.R.attr.colorBackground)
        if (ColorUtil.isColorLight(colorBg)) {
            lastPlaybackControlsColor =
                MaterialValueHelper.getSecondaryTextColor(requireContext(), true)
            lastDisabledPlaybackControlsColor =
                MaterialValueHelper.getSecondaryDisabledTextColor(requireContext(), true)
        } else {
            lastPlaybackControlsColor =
                MaterialValueHelper.getPrimaryTextColor(requireContext(), false)
            lastDisabledPlaybackControlsColor =
                MaterialValueHelper.getPrimaryDisabledTextColor(requireContext(), false)
        }

        val colorFinal = if (PreferenceUtil.isAdaptiveColor) {
            color.primaryTextColor
        } else {
            accentColor()
        }.ripAlpha()

        TintHelper.setTintAuto(
            binding.playPauseButton,
            MaterialValueHelper.getPrimaryTextColor(
                requireContext(),
                ColorUtil.isColorLight(colorFinal)
            ),
            false
        )
        TintHelper.setTintAuto(binding.playPauseButton, colorFinal, true)
        binding.progressSlider.applyColor(colorFinal)
        binding.lpnBuffingPosition.setIndicatorColor(colorFinal.addAlpha(0.15f))
        volumeFragment?.setTintable(colorFinal)
        updateRepeatState()
        updateShuffleState()
        updatePrevNextColor()
    }

    override fun onUpdateProgressViews(progress: Int, bufferedPosition: Int, total: Int) {
        super.onUpdateProgressViews(progress, bufferedPosition, total)
        if (seekBar == null) {
            binding.lpnBuffingPosition.progress = bufferedPosition
            binding.lpnBuffingPosition.max = total
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

    private fun setUpPlayPauseFab() {
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
        if (MusicPlayerRemote.isPlaying) {
            binding.playPauseButton.setImageResource(R.drawable.ic_pause)
        } else {
            binding.playPauseButton.setImageResource(R.drawable.ic_play_arrow)
        }
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

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        EventBus.unregister(EVENT_SONG_UPDATE, this)
    }

    override fun onEvent(key: String, value: Any?) {
        val song = MusicPlayerRemote.currentSong
        if (value is Song && song.id == value.id) {
            updateSong()
        }
    }
}
