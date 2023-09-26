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
package com.caij.puremusic.fragments.player.cardblur

import android.content.SharedPreferences
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar
import code.name.monkey.appthemehelper.util.ToolbarContentTintHelper
import com.caij.puremusic.NEW_BLUR_AMOUNT
import com.caij.puremusic.R
import com.caij.puremusic.databinding.FragmentCardBlurPlayerBinding
import com.caij.puremusic.extensions.drawAboveSystemBars
import com.caij.puremusic.extensions.whichFragment
import com.caij.puremusic.fragments.base.AbsPlayerFragment
import com.caij.puremusic.fragments.player.PlayerAlbumCoverFragment
import com.caij.puremusic.fragments.player.normal.PlayerFragment
import com.caij.puremusic.glide.*
import com.caij.puremusic.helper.MusicPlayerRemote
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.util.PreferenceUtil
import com.caij.puremusic.util.PreferenceUtil.blurAmount
import com.caij.puremusic.util.color.MediaNotificationProcessor

class CardBlurFragment : AbsPlayerFragment(R.layout.fragment_card_blur_player),
    SharedPreferences.OnSharedPreferenceChangeListener {

    private var lastColor: Int = 0
    override val paletteColor: Int
        get() = lastColor
    private lateinit var playbackControlsFragment: CardBlurPlaybackControlsFragment

    private var _binding: FragmentCardBlurPlayerBinding? = null
    private val binding get() = _binding!!
    private var lastRequest: GlideRequest<Drawable>? = null

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
        return Color.WHITE
    }

    override fun onColorChanged(color: MediaNotificationProcessor) {
        playbackControlsFragment.setColor(color)
        lastColor = color.backgroundColor
        libraryViewModel.updateColor(color.backgroundColor)
        tintChild(binding.includePlayMenu.root, Color.WHITE)

        binding.title.setTextColor(Color.WHITE)
        binding.text.setTextColor(Color.WHITE)
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
        _binding = FragmentCardBlurPlayerBinding.bind(view)
        setUpSubFragments()
        setUpPlayerToolbar()
        binding.playerToolbar.drawAboveSystemBars()
        PreferenceUtil.sharedPreferences
            .registerOnSharedPreferenceChangeListener(this)
    }

    private fun setUpSubFragments() {
        playbackControlsFragment =
            whichFragment(R.id.playbackControlsFragment) as CardBlurPlaybackControlsFragment
        (whichFragment(R.id.playerAlbumCoverFragment) as? PlayerAlbumCoverFragment)?.setCallbacks(
            this
        )
    }

    private fun setUpPlayerToolbar() {
        binding.includePlayMenu.actionSleepTimer.setOnClickListener(this)
        binding.includePlayMenu.actionToggleLyrics.setOnClickListener(this)
        binding.includePlayMenu.actionToggleFavorite.setOnClickListener(this)
        binding.includePlayMenu.nowPlaying.setOnClickListener(this)
        binding.includePlayMenu.actionMore.setOnClickListener(this)
        tintChild(binding.includePlayMenu.root, Color.WHITE)
    }

    override fun onServiceConnected() {
        updateIsFavorite()
        updateBlur()
        updateSong()
    }

    override fun onPlayingMetaChanged() {
        updateIsFavorite()
        updateBlur()
        updateSong()
    }

    private fun updateSong() {
        val song = MusicPlayerRemote.currentSong
        binding.run {
            title.text = song.title
            text.text = song.artistName
        }
    }

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
            )
            .thumbnail(lastRequest).also {
                lastRequest = it.clone()
                it.crossfadeListener()
                    .into(binding.colorBackground)
            }
    }

    override fun onPause() {
        super.onPause()
        lastRequest = null
    }

    override fun onResume() {
        super.onResume()
        lastRequest = null
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

    companion object {
        fun newInstance(): PlayerFragment {
            return PlayerFragment()
        }
    }
}
