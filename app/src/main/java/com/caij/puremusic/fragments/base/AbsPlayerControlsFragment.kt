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
package com.caij.puremusic.fragments.base

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.graphics.PorterDuff
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewTreeObserver
import android.view.animation.AccelerateInterpolator
import android.view.animation.DecelerateInterpolator
import android.view.animation.LinearInterpolator
import android.widget.ImageButton
import android.widget.SeekBar
import android.widget.TextView
import androidx.annotation.LayoutRes
import androidx.core.view.isVisible
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.caij.puremusic.R
import com.caij.puremusic.extensions.whichFragment
import com.caij.puremusic.fragments.MusicSeekSkipTouchListener
import com.caij.puremusic.fragments.other.VolumeFragment
import com.caij.puremusic.helper.MusicPlayerRemote
import com.caij.puremusic.helper.MusicProgressViewUpdateHelper
import com.caij.puremusic.lyrics.LrcEntry
import com.caij.puremusic.lyrics.SimpleLrcView
import com.caij.puremusic.service.GlobalLyricsManager
import com.caij.puremusic.service.LyricsCallback
import com.caij.puremusic.service.LyricsProgressCallback
import com.caij.puremusic.service.MusicService
import com.caij.puremusic.util.MusicUtil
import com.caij.puremusic.util.PreferenceUtil
import com.caij.puremusic.util.ViewUtil
import com.caij.puremusic.util.color.MediaNotificationProcessor
import com.google.android.material.slider.Slider

/**
 * Created by hemanths on 24/09/17.
 */

abstract class AbsPlayerControlsFragment(@LayoutRes layout: Int) : AbsMusicServiceFragment(layout),
    MusicProgressViewUpdateHelper.Callback {

    protected abstract fun show()

    protected abstract fun hide()

    abstract fun setColor(color: MediaNotificationProcessor)

    open val lyricsView2: SimpleLrcView? = null

    var lastPlaybackControlsColor: Int = 0

    var lastDisabledPlaybackControlsColor: Int = 0

    private var isSeeking = false

    open val progressSlider: Slider? = null

    open val seekBar: SeekBar? = null

    abstract val shuffleButton: ImageButton

    abstract val repeatButton: ImageButton

    open val nextButton: ImageButton? = null

    open val previousButton: ImageButton? = null

    open val songTotalTime: TextView? = null

    open val songCurrentProgress: TextView? = null

    private var progressAnimator: ObjectAnimator? = null

    private val lyricsCallback: LyricsCallback = object : LyricsCallback {

        override fun lyricsReset() {
            lyricsView2?.reset()
        }

        override fun lyricsUpdate(lyricsCache: List<LrcEntry>) {
            lyricsView2?.loadLrc(lyricsCache)
        }
    }

    private val lyricsProgressCallback: LyricsProgressCallback = object : LyricsProgressCallback {

        override fun onLineUpdate(line: Int) {
            lyricsView2?.updateLine(line)
        }
    }

    override fun onUpdateProgressViews(progress: Int, bufferedPosition: Int, total: Int) {
        if (total < 0) return

        if (seekBar == null) {
            progressSlider?.valueTo = total.toFloat()
            if ((progressSlider?.valueTo ?: 0f) > 0) {
                progressSlider?.value =
                    progress.toFloat().coerceIn(progressSlider?.valueFrom, progressSlider?.valueTo)
            }
        } else {
            seekBar?.max = total
            seekBar?.secondaryProgress = bufferedPosition

            if (isSeeking) {
                seekBar?.progress = progress
            } else {
                progressAnimator =
                    ObjectAnimator.ofInt(seekBar, "progress", progress).apply {
                        duration = SLIDER_ANIMATION_TIME
                        interpolator = LinearInterpolator()
                        start()
                    }

            }
        }
        songTotalTime?.text = MusicUtil.getReadableDurationString(total.toLong())
        songCurrentProgress?.text = MusicUtil.getReadableDurationString(progress.toLong())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        GlobalLyricsManager.unregister(lyricsCallback)
    }

    private fun setUpProgressSlider() {
        progressSlider?.addOnChangeListener(Slider.OnChangeListener { _, value, fromUser ->
            onProgressChange(value.toInt(), fromUser)
        })
        progressSlider?.addOnSliderTouchListener(object : Slider.OnSliderTouchListener {
            override fun onStartTrackingTouch(slider: Slider) {
                onStartTrackingTouch()
            }

            override fun onStopTrackingTouch(slider: Slider) {
                onStopTrackingTouch(slider.value.toInt())
            }
        })

        seekBar?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                onProgressChange(progress, fromUser)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                onStartTrackingTouch()
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                onStopTrackingTouch(seekBar?.progress ?: 0)
            }
        })
    }

    private fun onProgressChange(value: Int, fromUser: Boolean) {
        if (fromUser) {
            onUpdateProgressViews(value, MusicPlayerRemote.bufferedPosition, MusicPlayerRemote.songDurationMillis)
        }
    }

    private fun onStartTrackingTouch() {
        isSeeking = true
        progressViewUpdateHelper.stop()
        progressAnimator?.cancel()
    }

    private fun onStopTrackingTouch(value: Int) {
        isSeeking = false
        MusicPlayerRemote.seekTo(value)
        progressViewUpdateHelper.start()
    }

    private lateinit var progressViewUpdateHelper: MusicProgressViewUpdateHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        progressViewUpdateHelper = MusicProgressViewUpdateHelper(this)
    }

    fun View.showBounceAnimation() {
        clearAnimation()
        scaleX = 0.9f
        scaleY = 0.9f
        isVisible = true
        pivotX = (width / 2).toFloat()
        pivotY = (height / 2).toFloat()

        animate().setDuration(200)
            .setInterpolator(DecelerateInterpolator())
            .scaleX(1.1f)
            .scaleY(1.1f)
            .withEndAction {
                animate().setDuration(200)
                    .setInterpolator(AccelerateInterpolator())
                    .scaleX(1f)
                    .scaleY(1f)
                    .alpha(1f)
                    .start()
            }
            .start()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        hideVolumeIfAvailable()
        GlobalLyricsManager.register(lyricsCallback)
    }

    fun initLyrics() {
        lyricsView2?.apply {
            setOnClickListener {
                goToLyrics(requireActivity())
            }

            view?.viewTreeObserver?.addOnGlobalLayoutListener(object :
                ViewTreeObserver.OnGlobalLayoutListener {
                override fun onGlobalLayout() {
                    if (view?.viewTreeObserver?.isAlive == true) {
                        view?.viewTreeObserver?.removeOnGlobalLayoutListener(this)
                    }

                    val h = getAvalibleHeight()
                    if (h > 0) {
                        setShowLine(3)
                        setMaxHeight2(h.toInt())
                        visibility = View.VISIBLE
                    } else {
                        visibility = View.GONE
                    }
                }
            })
            loadLrc(GlobalLyricsManager.getLyrics())
        }
    }

    open fun getAvalibleHeight(): Float {
        val h = requireView().height / 2 - ViewUtil.convertDpToPixel(16f, resources) * 5
        return h
    }

    override fun onStart() {
        super.onStart()
        setUpProgressSlider()
        setUpPrevNext()
        setUpShuffleButton()
        setUpRepeatButton()
    }

    @SuppressLint("ClickableViewAccessibility")
    private fun setUpPrevNext() {
        nextButton?.setOnTouchListener(MusicSeekSkipTouchListener(requireActivity(), true))
        previousButton?.setOnTouchListener(MusicSeekSkipTouchListener(requireActivity(), false))
    }

    private fun setUpShuffleButton() {
        shuffleButton.setOnClickListener { MusicPlayerRemote.toggleShuffleMode() }
    }

    private fun setUpRepeatButton() {
        repeatButton.setOnClickListener { MusicPlayerRemote.cycleRepeatMode() }
    }

    fun updatePrevNextColor() {
        nextButton?.setColorFilter(lastPlaybackControlsColor, PorterDuff.Mode.SRC_IN)
        previousButton?.setColorFilter(lastPlaybackControlsColor, PorterDuff.Mode.SRC_IN)
    }

    fun updateShuffleState() {
        shuffleButton.setColorFilter(
            when (MusicPlayerRemote.shuffleMode) {
                MusicService.SHUFFLE_MODE_SHUFFLE -> lastPlaybackControlsColor
                else -> lastDisabledPlaybackControlsColor
            }, PorterDuff.Mode.SRC_IN
        )
    }

    fun updateRepeatState() {
        when (MusicPlayerRemote.repeatMode) {
            MusicService.REPEAT_MODE_NONE -> {
                repeatButton.setImageResource(R.drawable.ic_repeat)
                repeatButton.setColorFilter(
                    lastDisabledPlaybackControlsColor,
                    PorterDuff.Mode.SRC_IN
                )
            }
            MusicService.REPEAT_MODE_ALL -> {
                repeatButton.setImageResource(R.drawable.ic_repeat)
                repeatButton.setColorFilter(
                    lastPlaybackControlsColor,
                    PorterDuff.Mode.SRC_IN
                )
            }
            MusicService.REPEAT_MODE_THIS -> {
                repeatButton.setImageResource(R.drawable.ic_repeat_one)
                repeatButton.setColorFilter(
                    lastPlaybackControlsColor,
                    PorterDuff.Mode.SRC_IN
                )
            }
        }
    }

    protected var volumeFragment: VolumeFragment? = null

    private fun hideVolumeIfAvailable() {
        if (PreferenceUtil.isVolumeVisibilityMode) {
            childFragmentManager.commit {
                replace<VolumeFragment>(R.id.volumeFragmentContainer)
            }
            childFragmentManager.executePendingTransactions()
        }
        volumeFragment = whichFragment(R.id.volumeFragmentContainer)
    }

    override fun onResume() {
        super.onResume()
        progressViewUpdateHelper.start()
        GlobalLyricsManager.registerProgress(lyricsProgressCallback)
    }

    override fun onPause() {
        super.onPause()
        progressViewUpdateHelper.stop()
        GlobalLyricsManager.unregisterProgress(lyricsProgressCallback)
    }

    companion object {
        const val SLIDER_ANIMATION_TIME: Long = 400
    }

}
