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
package com.caij.puremusic.fragments.player.blur

import android.content.SharedPreferences
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar
import code.name.monkey.appthemehelper.util.ToolbarContentTintHelper
import com.caij.puremusic.NEW_BLUR_AMOUNT
import com.caij.puremusic.R
import com.caij.puremusic.databinding.FragmentBlurBinding
import com.caij.puremusic.extensions.drawAboveSystemBars
import com.caij.puremusic.extensions.whichFragment
import com.caij.puremusic.fragments.base.AbsPlayerFragment
import com.caij.puremusic.fragments.player.PlayerAlbumCoverFragment
import com.caij.puremusic.glide.*
import com.caij.puremusic.helper.MusicPlayerRemote
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.util.PreferenceUtil
import com.caij.puremusic.util.PreferenceUtil.blurAmount
import com.caij.puremusic.util.color.MediaNotificationProcessor


class BlurPlayerFragment : AbsPlayerFragment(R.layout.fragment_blur),
    SharedPreferences.OnSharedPreferenceChangeListener {

    private var lastRequest: GlideRequest<Drawable>? = null

    private lateinit var playbackControlsFragment: BlurPlaybackControlsFragment

    private var lastColor: Int = 0

    private var _binding: FragmentBlurBinding? = null
    private val binding get() = _binding!!


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentBlurBinding.bind(view)
        setUpSubFragments()
        setUpPlayerToolbar()
        binding.playerToolbar.drawAboveSystemBars()
        PreferenceUtil.sharedPreferences
            .registerOnSharedPreferenceChangeListener(this)
    }

    private fun setUpSubFragments() {
        playbackControlsFragment = whichFragment(R.id.playbackControlsFragment)
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
        tintChild(binding.includePlayMenu.root, Color.WHITE)
    }

    override fun onFavoriteToggled() {
        toggleFavorite(MusicPlayerRemote.currentSong)
    }

    override fun onColorChanged(color: MediaNotificationProcessor) {
        playbackControlsFragment.setColor(color)
        lastColor = color.backgroundColor
        libraryViewModel.updateColor(color.backgroundColor)
        tintChild(binding.includePlayMenu.root, Color.WHITE)
    }

    override fun toggleFavorite(song: Song) {
        super.toggleFavorite(song)
        if (song.id == MusicPlayerRemote.currentSong.id) {
            updateIsFavorite()
        }
    }

    override fun onShow() {
    }

    override fun onHide() {
    }

    override fun onBackPressed(): Boolean {
        return false
    }

    override fun toolbarIconColor(): Int {
        return Color.WHITE
    }

    override val paletteColor: Int
        get() = lastColor

    private fun updateBlur() {
        // https://github.com/bumptech/glide/issues/527#issuecomment-148840717
        val song = MusicPlayerRemote.currentSong
        val model = RetroGlideExtension.getSongModel(song)
        GlideApp.with(this)
            .load(model)
            .simpleSongCoverOptions(song, model)
            .transform(
                BlurTransformation.Builder(requireContext()).blurRadius(blurAmount.toFloat())
                    .build()
            ).thumbnail(lastRequest)
            .error(GlideApp.with(this).load(ColorDrawable(Color.DKGRAY)).fitCenter())
            .also {
                lastRequest = it.clone()
                it.crossfadeListener()
                    .into(binding.colorBackground)
            }
    }

    override fun onServiceConnected() {
        updateIsFavorite()
        updateBlur()
    }

    override fun onPlayingMetaChanged() {
        updateIsFavorite()
        updateBlur()
    }

    override fun onPause() {
        super.onPause()
        lastRequest = null
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        PreferenceUtil.sharedPreferences
            .unregisterOnSharedPreferenceChangeListener(this)
        _binding = null
    }

    override fun onSharedPreferenceChanged(sharedPreferences: SharedPreferences?, key: String?) {
        if (key == NEW_BLUR_AMOUNT) {
            updateBlur()
        }
    }
}
