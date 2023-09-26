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
package com.caij.puremusic.fragments.player.circle

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.media.AudioManager
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.LinearInterpolator
import androidx.appcompat.widget.Toolbar
import androidx.core.content.getSystemService
import androidx.lifecycle.lifecycleScope
import code.name.monkey.appthemehelper.util.ColorUtil
import code.name.monkey.appthemehelper.util.MaterialValueHelper
import code.name.monkey.appthemehelper.util.TintHelper
import code.name.monkey.appthemehelper.util.ToolbarContentTintHelper
import com.caij.puremusic.R
import com.caij.puremusic.databinding.FragmentCirclePlayerBinding
import com.caij.puremusic.extensions.*
import com.caij.puremusic.fragments.MusicSeekSkipTouchListener
import com.caij.puremusic.fragments.base.AbsPlayerFragment
import com.caij.puremusic.fragments.base.goToAlbum
import com.caij.puremusic.fragments.base.goToArtist
import com.caij.puremusic.glide.GlideApp
import com.caij.puremusic.glide.GlideRequest
import com.caij.puremusic.glide.RetroGlideExtension
import com.caij.puremusic.glide.crossfadeListener
import com.caij.puremusic.helper.MusicPlayerRemote
import com.caij.puremusic.helper.MusicProgressViewUpdateHelper
import com.caij.puremusic.helper.MusicProgressViewUpdateHelper.Callback
import com.caij.puremusic.helper.PlayPauseButtonOnClickHandler
import com.caij.puremusic.util.MusicUtil
import com.caij.puremusic.util.PreferenceUtil
import com.caij.puremusic.util.color.MediaNotificationProcessor
import com.caij.puremusic.volume.AudioVolumeObserver
import com.caij.puremusic.volume.OnAudioVolumeChangedListener
import com.google.android.material.slider.Slider
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.tankery.lib.circularseekbar.CircularSeekBar

/**
 * Created by hemanths on 2020-01-06.
 */

class CirclePlayerFragment : AbsPlayerFragment(R.layout.fragment_circle_player), Callback,
    OnAudioVolumeChangedListener,
    CircularSeekBar.OnCircularSeekBarChangeListener {

    private lateinit var progressViewUpdateHelper: MusicProgressViewUpdateHelper
    private var audioVolumeObserver: AudioVolumeObserver? = null

    private val audioManager: AudioManager
        get() = requireContext().getSystemService()!!

    private var _binding: FragmentCirclePlayerBinding? = null
    private val binding get() = _binding!!

    private var rotateAnimator: ObjectAnimator? = null
    private var lastRequest: GlideRequest<Drawable>? = null

    private var progressAnimator: ObjectAnimator? = null
    var isSeeking = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        progressViewUpdateHelper = MusicProgressViewUpdateHelper(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentCirclePlayerBinding.bind(view)

        setupViews()
        binding.title.isSelected = true
        binding.title.setOnClickListener {
            goToAlbum(requireActivity())
        }
        binding.text.setOnClickListener {
            goToArtist(requireActivity())
        }
        binding.songInfo.drawAboveSystemBars()
    }

    private fun setUpPlayerToolbar() {
        binding.includePlayMenu.actionSleepTimer.setOnClickListener(this)
        binding.includePlayMenu.actionToggleLyrics.setOnClickListener(this)
        binding.includePlayMenu.actionToggleFavorite.setOnClickListener(this)
        binding.includePlayMenu.nowPlaying.setOnClickListener(this)
        binding.includePlayMenu.actionMore.setOnClickListener(this)
        tintChild(binding.includePlayMenu.root, colorControlNormal())
    }

    private fun setupViews() {
        setUpProgressSlider()
        binding.volumeSeekBar.circleProgressColor = accentColor()
        binding.volumeSeekBar.circleColor = ColorUtil.withAlpha(accentColor(), 0.25f)
        setUpPlayPauseFab()
        setUpPrevNext()
        setUpPlayerToolbar()
        binding.albumCoverOverlay.background = ColorDrawable(
            MaterialValueHelper.getPrimaryTextColor(
                requireContext(),
                accentColor().isColorLight
            )
        )
    }

    @SuppressLint("ClickableViewAccessibility")
    private fun setUpPrevNext() {
        updatePrevNextColor()
        binding.nextButton.setOnTouchListener(MusicSeekSkipTouchListener(requireActivity(), true))
        binding.previousButton.setOnTouchListener(
            MusicSeekSkipTouchListener(requireActivity(),
            false)
        )
    }

    private fun updatePrevNextColor() {
        val accentColor = accentColor()
        binding.nextButton.setColorFilter(accentColor, PorterDuff.Mode.SRC_IN)
        binding.previousButton.setColorFilter(accentColor, PorterDuff.Mode.SRC_IN)
    }

    private fun setUpPlayPauseFab() {
        TintHelper.setTintAuto(
            binding.playPauseButton,
            accentColor(),
            false
        )
        binding.playPauseButton.setOnClickListener(PlayPauseButtonOnClickHandler())
    }

    private fun setupRotateAnimation() {
        rotateAnimator = ObjectAnimator.ofFloat(binding.albumCover, View.ROTATION, 360F).apply {
            interpolator = LinearInterpolator()
            repeatCount = Animation.INFINITE
            duration = 10000
            if (MusicPlayerRemote.isPlaying) {
                start()
            }
        }
    }

    override fun onResume() {
        super.onResume()
        progressViewUpdateHelper.start()
        if (audioVolumeObserver == null) {
            audioVolumeObserver = AudioVolumeObserver(requireActivity())
        }
        audioVolumeObserver?.register(AudioManager.STREAM_MUSIC, this)

        val audioManager = audioManager
        binding.volumeSeekBar.max =
            audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC).toFloat()
        binding.volumeSeekBar.progress =
            audioManager.getStreamVolume(AudioManager.STREAM_MUSIC).toFloat()
        binding.volumeSeekBar.setOnSeekBarChangeListener(this)
    }

    override fun onPause() {
        super.onPause()
        lastRequest = null
        progressViewUpdateHelper.stop()
    }

    override fun onShow() {
    }

    override fun onHide() {
    }

    override fun onBackPressed(): Boolean = false

    override fun toolbarIconColor(): Int =
        colorControlNormal()

    override val paletteColor: Int
        get() = Color.BLACK

    override fun onColorChanged(color: MediaNotificationProcessor) {
    }

    override fun onFavoriteToggled() {
    }

    override fun onPlayStateChanged() {
        updatePlayPauseDrawableState()
        if (MusicPlayerRemote.isPlaying) {
            if (rotateAnimator?.isStarted == true) rotateAnimator?.resume() else rotateAnimator?.start()
        } else {
            rotateAnimator?.pause()
        }
    }

    override fun onPlayingMetaChanged() {
        super.onPlayingMetaChanged()
        updateSong()
    }

    override fun onServiceConnected() {
        super.onServiceConnected()
        updateSong()
        updatePlayPauseDrawableState()
        setupRotateAnimation()
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
        val model = RetroGlideExtension.getSongModel(song)
        GlideApp.with(this)
            .load(model)
            .simpleSongCoverOptions(song, model)
            .thumbnail(lastRequest)
            .error(GlideApp.with(this).load(R.drawable.default_audio_art).fitCenter())
            .fitCenter().also {
                lastRequest = it.clone()
                it.crossfadeListener()
                    .into(binding.albumCover)
            }
    }

    private fun updatePlayPauseDrawableState() {
        when {
            MusicPlayerRemote.isPlaying -> binding.playPauseButton.setImageResource(R.drawable.ic_pause)
            else -> binding.playPauseButton.setImageResource(R.drawable.ic_play_arrow)
        }
    }

    override fun onAudioVolumeChanged(currentVolume: Int, maxVolume: Int) {
        _binding?.volumeSeekBar?.max = maxVolume.toFloat()
        _binding?.volumeSeekBar?.progress = currentVolume.toFloat()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        if (audioVolumeObserver != null) {
            audioVolumeObserver!!.unregister()
        }
        _binding = null
    }


    override fun onProgressChanged(
        circularSeekBar: CircularSeekBar?,
        progress: Float,
        fromUser: Boolean,
    ) {
        val audioManager = audioManager
        audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, progress.toInt(), 0)
    }

    override fun onStartTrackingTouch(seekBar: CircularSeekBar?) {
    }

    override fun onStopTrackingTouch(seekBar: CircularSeekBar?) {
    }

    private fun setUpProgressSlider() {
        binding.progressSlider.applyColor(accentColor())
        val progressSlider = binding.progressSlider
        progressSlider.addOnChangeListener(Slider.OnChangeListener { _, value, fromUser ->
            if (fromUser) {
                onUpdateProgressViews(
                    value.toInt(),
                    MusicPlayerRemote.bufferedPosition,
                    MusicPlayerRemote.songDurationMillis
                )
            }
        })
        progressSlider.addOnSliderTouchListener(object : Slider.OnSliderTouchListener {
            override fun onStartTrackingTouch(slider: Slider) {
                isSeeking = true
                progressViewUpdateHelper.stop()
            }

            override fun onStopTrackingTouch(slider: Slider) {
                isSeeking = false
                MusicPlayerRemote.seekTo(slider.value.toInt())
                progressViewUpdateHelper.start()
            }
        })
    }

    override fun onUpdateProgressViews(progress: Int, bufferedPosition: Int, total: Int) {
        if (total < 0) return

        val progressSlider = binding.progressSlider
        progressSlider.valueTo = total.toFloat()

        progressSlider.valueTo = total.toFloat()

        progressSlider.value =
            progress.toFloat().coerceIn(progressSlider.valueFrom, progressSlider.valueTo)

        binding.songTotalTime.text = MusicUtil.getReadableDurationString(total.toLong())
        binding.songCurrentProgress.text = MusicUtil.getReadableDurationString(progress.toLong())
    }
}
