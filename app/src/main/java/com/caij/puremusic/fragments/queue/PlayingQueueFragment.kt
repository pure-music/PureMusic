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
package com.caij.puremusic.fragments.queue

import android.content.res.ColorStateList
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import code.name.monkey.appthemehelper.util.ColorUtil
import code.name.monkey.appthemehelper.util.MaterialValueHelper
import code.name.monkey.appthemehelper.util.ToolbarContentTintHelper
import com.caij.puremusic.R
import com.caij.puremusic.activities.MainActivity
import com.caij.puremusic.adapter.song.PlayingQueueAdapter
import com.caij.puremusic.databinding.FragmentPlayingQueueBinding
import com.caij.puremusic.extensions.accentColor
import com.caij.puremusic.extensions.surfaceColor
import com.caij.puremusic.fragments.base.AbsMusicServiceFragment
import com.caij.puremusic.helper.MusicPlayerRemote
import com.caij.puremusic.util.MusicUtil
import com.caij.puremusic.util.ThemedFastScroller

class PlayingQueueFragment : AbsMusicServiceFragment(R.layout.fragment_playing_queue) {

    private var _binding: FragmentPlayingQueueBinding? = null
    private val binding get() = _binding!!
    private var playingQueueAdapter: PlayingQueueAdapter? = null
    private lateinit var linearLayoutManager: LinearLayoutManager

    val mainActivity: MainActivity
        get() = activity as MainActivity

    private fun getUpNextAndQueueTime(): String {
        val duration = MusicPlayerRemote.getQueueDurationMillis(MusicPlayerRemote.position)
        return MusicUtil.buildInfoString(
            resources.getString(R.string.up_next),
            MusicUtil.getReadableDurationString(duration)
        )
    }

    override fun checkActivity(): Boolean {
        return false
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentPlayingQueueBinding.bind(view)

        setupToolbar()
        setUpRecyclerView()

        binding.clearQueue.setOnClickListener {
            MusicPlayerRemote.clearQueue()
        }
        checkForPadding()

        view.setBackgroundColor(surfaceColor())
    }

    private fun setUpRecyclerView() {
        playingQueueAdapter = PlayingQueueAdapter(
            requireActivity(),
            MusicPlayerRemote.playingQueue.toMutableList(),
            MusicPlayerRemote.position,
            R.layout.item_queue
        )
        linearLayoutManager = LinearLayoutManager(requireContext())

        binding.recyclerView.layoutManager = linearLayoutManager
        binding.recyclerView.adapter = playingQueueAdapter
        linearLayoutManager.scrollToPositionWithOffset(MusicPlayerRemote.position + 1, 0)

        binding.recyclerView.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                if (dy > 0) {
                    binding.clearQueue.shrink()
                } else if (dy < 0) {
                    binding.clearQueue.extend()
                }
            }
        })
        ThemedFastScroller.create(binding.recyclerView)
    }

    private fun checkForPadding() {
    }

    override fun onQueueChanged() {
        if (MusicPlayerRemote.playingQueue.isEmpty()) {
            parentFragmentManager.popBackStack()
            return
        }
        checkForPadding()
        updateQueue()
        updateCurrentSong()
    }

    override fun onMediaStoreChanged() {
        updateQueue()
        updateCurrentSong()
    }

    private fun updateCurrentSong() {
        binding.appBarLayout.toolbar.subtitle = getUpNextAndQueueTime()
    }

    override fun onPlayingMetaChanged() {
        updateQueuePosition()
    }

    private fun updateQueuePosition() {
        playingQueueAdapter?.setCurrent(MusicPlayerRemote.position)
        resetToCurrentPosition()
        binding.appBarLayout.toolbar.subtitle = getUpNextAndQueueTime()
    }

    private fun updateQueue() {
        playingQueueAdapter?.swapDataSet(MusicPlayerRemote.playingQueue, MusicPlayerRemote.position)
    }

    private fun resetToCurrentPosition() {
        binding.recyclerView.stopScroll()
        linearLayoutManager.scrollToPositionWithOffset(MusicPlayerRemote.position + 1, 0)
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onDestroy() {
        playingQueueAdapter = null
        super.onDestroy()
    }

    private fun setupToolbar() {
        binding.appBarLayout.toolbar.subtitle = getUpNextAndQueueTime()
        binding.clearQueue.backgroundTintList = ColorStateList.valueOf(accentColor())
        ColorStateList.valueOf(
            MaterialValueHelper.getPrimaryTextColor(
                requireContext(),
                ColorUtil.isColorLight(accentColor())
            )
        ).apply {
            binding.clearQueue.setTextColor(this)
            binding.clearQueue.iconTint = this
        }
        binding.appBarLayout.pinWhenScrolled()
        binding.appBarLayout.toolbar.apply {
            setNavigationOnClickListener {
                requireActivity().finish()
            }
            setTitle(R.string.now_playing_queue)
            setTitleTextAppearance(context, R.style.ToolbarTextAppearanceNormal)
            setNavigationIcon(R.drawable.ic_arrow_back)
            ToolbarContentTintHelper.colorBackButton(this)
        }
    }
}

