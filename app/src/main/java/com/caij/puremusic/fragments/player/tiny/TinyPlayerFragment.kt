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
package com.caij.puremusic.fragments.player.tiny

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.Context
import android.os.*
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View
import android.view.animation.LinearInterpolator
import androidx.appcompat.widget.Toolbar
import androidx.core.content.getSystemService
import androidx.lifecycle.lifecycleScope
import code.name.monkey.appthemehelper.util.ToolbarContentTintHelper
import code.name.monkey.appthemehelper.util.VersionUtils
import com.caij.puremusic.R
import com.caij.puremusic.databinding.FragmentTinyPlayerBinding
import com.caij.puremusic.extensions.*
import com.caij.puremusic.fragments.base.AbsPlayerFragment
import com.caij.puremusic.fragments.base.goToAlbum
import com.caij.puremusic.fragments.base.goToArtist
import com.caij.puremusic.fragments.player.PlayerAlbumCoverFragment
import com.caij.puremusic.helper.MusicPlayerRemote
import com.caij.puremusic.helper.MusicProgressViewUpdateHelper
import com.caij.puremusic.helper.PlayPauseButtonOnClickHandler
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.util.MusicUtil
import com.caij.puremusic.util.PreferenceUtil
import com.caij.puremusic.util.ViewUtil
import com.caij.puremusic.util.color.MediaNotificationProcessor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.math.abs

class TinyPlayerFragment : AbsPlayerFragment(R.layout.fragment_tiny_player),
    MusicProgressViewUpdateHelper.Callback {
    private var _binding: FragmentTinyPlayerBinding? = null
    private val binding get() = _binding!!

    private var lastColor: Int = 0
    private var toolbarColor: Int = 0
    private var isDragEnabled = false
    lateinit var animator: ObjectAnimator

    override fun onShow() {}

    override fun onHide() {}

    override fun onBackPressed(): Boolean {
        return false
    }

    override fun toolbarIconColor(): Int {
        return toolbarColor
    }

    override val paletteColor: Int
        get() = lastColor

    override fun onColorChanged(color: MediaNotificationProcessor) {
        lastColor = color.backgroundColor
        libraryViewModel.updateColor(color.backgroundColor)
        toolbarColor = color.secondaryTextColor
        controlsFragment.setColor(color)

        binding.title.setTextColor(color.primaryTextColor)
        binding.playerSongTotalTime.setTextColor(color.primaryTextColor)
        binding.text.setTextColor(color.secondaryTextColor)
        binding.songInfo.setTextColor(color.secondaryTextColor)
        ViewUtil.setProgressDrawable(binding.progressBar, color.backgroundColor)

        Handler(Looper.myLooper()!!).post {
            tintChild(binding.includePlayMenu.root, color.secondaryTextColor)
        }
    }


    override fun onFavoriteToggled() {
        toggleFavorite(MusicPlayerRemote.currentSong)
    }

    private lateinit var controlsFragment: TinyPlaybackControlsFragment
    private lateinit var progressViewUpdateHelper: MusicProgressViewUpdateHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        progressViewUpdateHelper = MusicProgressViewUpdateHelper(this)
    }

    override fun onResume() {
        super.onResume()
        progressViewUpdateHelper.start()
    }

    override fun onPause() {
        super.onPause()
        progressViewUpdateHelper.stop()
    }

    private fun updateSong() {
        val song = MusicPlayerRemote.currentSong
        binding.title.text = song.title
        binding.text.text = String.format("%s \nby - %s", song.albumName, song.artistName)

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

    @SuppressLint("ClickableViewAccessibility")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentTinyPlayerBinding.bind(view)
        binding.title.isSelected = true
        binding.progressBar.setOnClickListener(PlayPauseButtonOnClickHandler())
        binding.progressBar.setOnTouchListener(ProgressHelper(requireContext()))

        setUpPlayerToolbar()
        setUpSubFragments()
        binding.title.setOnClickListener {
            goToAlbum(requireActivity())
        }
        binding.text.setOnClickListener {
            goToArtist(requireActivity())
        }
        binding.playerToolbar.drawAboveSystemBars()
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

    override fun toggleFavorite(song: Song) {
        super.toggleFavorite(song)
        if (song.id == MusicPlayerRemote.currentSong.id) {
            updateIsFavorite()
        }
    }

    override fun onServiceConnected() {
        super.onServiceConnected()
        updateSong()
    }

    override fun onPlayingMetaChanged() {
        super.onPlayingMetaChanged()
        updateSong()
    }

    override fun onUpdateProgressViews(progress: Int, bufferedPosition: Int, total: Int) {
        binding.progressBar.max = total
        binding.progressBar.secondaryProgress = bufferedPosition

        if (isDragEnabled) {
            binding.progressBar.progress = progress
        } else {
            animator = ObjectAnimator.ofInt(binding.progressBar, "progress", progress)

            val animatorSet = AnimatorSet()
            animatorSet.playSequentially(animator)

            animatorSet.duration = 1500
            animatorSet.interpolator = LinearInterpolator()
            animatorSet.start()
        }
        binding.playerSongTotalTime.text = String.format(
            "%s/%s", MusicUtil.getReadableDurationString(total.toLong()),
            MusicUtil.getReadableDurationString(progress.toLong())
        )
    }

    inner class ProgressHelper(context: Context) : View.OnTouchListener {
        private var initialY: Int = 0
        private var initialProgress = 0
        private var progress: Int = 0
        private val displayHeight = resources.displayMetrics.heightPixels
        private var gestureDetector: GestureDetector

        init {
            gestureDetector = GestureDetector(context, object :
                GestureDetector.SimpleOnGestureListener() {

                override fun onLongPress(e: MotionEvent) {
                    if (abs(e!!.y - initialY) <= 2) {
                        vibrate()
                        isDragEnabled = true
                        binding.progressBar.parent.requestDisallowInterceptTouchEvent(true)
                        animator.pause()
                    }
                    super.onLongPress(e)
                }

                override fun onFling(
                    e1: MotionEvent,
                    e2: MotionEvent,
                    velocityX: Float,
                    velocityY: Float
                ): Boolean {
                    if (abs(velocityX) > abs(velocityY)) {
                        if (velocityX < 0) {
                            MusicPlayerRemote.playNextSong()
                            return true
                        } else if (velocityX > 0) {
                            MusicPlayerRemote.playPreviousSong()
                            return true
                        }
                    }
                    return false
                }
            })
        }

        @SuppressLint("ClickableViewAccessibility")
        override fun onTouch(v: View, event: MotionEvent): Boolean {
            when (event.actionMasked) {
                MotionEvent.ACTION_DOWN -> {
                    initialProgress = MusicPlayerRemote.songProgressMillis
                    initialY = event.y.toInt()
                    progressViewUpdateHelper.stop()
                }
                MotionEvent.ACTION_UP,
                MotionEvent.ACTION_CANCEL -> {
                    progressViewUpdateHelper.start()
                    if (isDragEnabled) {
                        MusicPlayerRemote.seekTo(progress)
                        isDragEnabled = false
                        return true
                    }
                }
                MotionEvent.ACTION_MOVE -> {
                    if (isDragEnabled) {
                        val diffY = (initialY - event.y).toInt()
                        progress =
                            initialProgress + diffY * (binding.progressBar.max / displayHeight) // Multiplier
                        if (progress > 0 && progress < binding.progressBar.max) {
                            onUpdateProgressViews(
                                progress,
                                MusicPlayerRemote.bufferedPosition,
                                MusicPlayerRemote.songDurationMillis
                            )
                        }
                    }
                }
            }
            return gestureDetector.onTouchEvent(event)
        }

        @Suppress("Deprecation")
        private fun vibrate() {
            val v = requireContext().getSystemService<Vibrator>()
            if (VersionUtils.hasOreo()) {
                v?.vibrate(VibrationEffect.createOneShot(10, VibrationEffect.DEFAULT_AMPLITUDE))
            } else {
                v?.vibrate(10)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
