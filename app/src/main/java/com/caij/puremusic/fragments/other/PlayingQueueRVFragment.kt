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
package com.caij.puremusic.fragments.other

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.caij.puremusic.R
import com.caij.puremusic.adapter.song.PlayingQueueAdapter
import com.caij.puremusic.fragments.base.AbsRecyclerViewFragment
import com.caij.puremusic.helper.MusicPlayerRemote

/**
 * Created by hemanths on 2019-12-08.
 */
class PlayingQueueRVFragment : AbsRecyclerViewFragment<PlayingQueueAdapter, LinearLayoutManager>() {

    override val titleRes: Int
        get() = R.string.now_playing_queue
    override val isShuffleVisible: Boolean
        get() = false

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
        setupToolbar()
    }

    private fun setupToolbar() {
        toolbar.apply {
            setNavigationOnClickListener {
                popUp()
            }
            setNavigationIcon(R.drawable.ic_arrow_back)
        }
    }

    private fun setupRecyclerView() {
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter

        layoutManager?.scrollToPositionWithOffset(MusicPlayerRemote.position + 1, 0)
    }

    override fun createLayoutManager(): LinearLayoutManager {
        return LinearLayoutManager(requireContext())
    }

    override fun createAdapter(): PlayingQueueAdapter {
        return PlayingQueueAdapter(
            requireActivity() as AppCompatActivity,
            MusicPlayerRemote.playingQueue.toMutableList(),
            MusicPlayerRemote.position,
            R.layout.item_queue
        )
    }

    override fun onServiceConnected() {
        super.onServiceConnected()
        updateQueue()
    }

    override fun onQueueChanged() {
        super.onQueueChanged()
        updateQueue()
        mainActivity.hideBottomSheet(true)
    }

    override fun onPlayingMetaChanged() {
        updateQueuePosition()
        mainActivity.hideBottomSheet(true)
    }

    private fun updateQueuePosition() {
        adapter?.setCurrent(MusicPlayerRemote.position)
        resetToCurrentPosition()
    }

    private fun updateQueue() {
        adapter?.swapDataSet(MusicPlayerRemote.playingQueue, MusicPlayerRemote.position)
        resetToCurrentPosition()
    }

    private fun resetToCurrentPosition() {
        recyclerView.stopScroll()
        layoutManager?.scrollToPositionWithOffset(MusicPlayerRemote.position + 1, 0)
    }

    override fun onPause() {
        super.onPause()
    }

    override val emptyMessage: Int
        get() = R.string.no_playing_queue

    override fun onDestroyView() {
        super.onDestroyView()
    }

    companion object {
        @JvmField
        val TAG: String = PlayingQueueRVFragment::class.java.simpleName

        @JvmStatic
        fun newInstance(): PlayingQueueRVFragment {
            return PlayingQueueRVFragment()
        }
    }
}
