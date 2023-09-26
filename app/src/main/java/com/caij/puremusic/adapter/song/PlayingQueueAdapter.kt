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
package com.caij.puremusic.adapter.song

import android.view.MenuItem
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.FragmentActivity
import com.caij.puremusic.R
import com.caij.puremusic.glide.GlideApp
import com.caij.puremusic.glide.RetroGlideExtension
import com.caij.puremusic.helper.MusicPlayerRemote
import com.caij.puremusic.helper.MusicPlayerRemote.removeFromQueue
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.util.MusicUtil
import com.caij.puremusic.util.ViewUtil
import me.zhanghai.android.fastscroll.PopupTextProvider

class PlayingQueueAdapter(
    activity: FragmentActivity,
    dataSet: MutableList<Song>,
    private var current: Int,
    itemLayoutRes: Int,
) : SongAdapter(activity, dataSet, itemLayoutRes),
    PopupTextProvider {

    private var songToRemove: Song? = null

    override fun createViewHolder(view: View): SongAdapter.ViewHolder {
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: SongAdapter.ViewHolder, position: Int) {
        super.onBindViewHolder(holder, position)
        val song = dataSet[position]
        holder.time?.text = MusicUtil.getReadableDurationString(song.duration)
        if (holder.itemViewType == CURRENT) {
            setAlpha(holder, 0.5f)
        }
    }

    override fun getItemViewType(position: Int): Int {
        if (position < current) {
            return HISTORY
        } else if (position > current) {
            return UP_NEXT
        }
        return CURRENT
    }

    override fun loadAlbumCover(song: Song, holder: SongAdapter.ViewHolder) {
        if (holder.image == null) {
            return
        }
        val model = RetroGlideExtension.getSongModel(song)
        GlideApp.with(activity)
            .load(model)
            .songCoverOptions(song, model)
            .into(holder.image!!)
    }

    fun swapDataSet(dataSet: List<Song>, position: Int) {
        this.dataSet = dataSet.toMutableList()
        current = position
        notifyDataSetChanged()
    }

    fun setCurrent(current: Int) {
        this.current = current
        notifyDataSetChanged()
    }

    private fun setAlpha(holder: SongAdapter.ViewHolder, alpha: Float) {
        holder.image?.alpha = alpha
        holder.title?.alpha = alpha
        holder.text?.alpha = alpha
        holder.paletteColorContainer?.alpha = alpha
        holder.dragView?.alpha = alpha
        holder.menu?.alpha = alpha
    }

    override fun getPopupText(position: Int): String {
        return MusicUtil.getSectionName(dataSet[position].title)
    }

    fun setSongToRemove(song: Song) {
        songToRemove = song
    }

    inner class ViewHolder(itemView: View) : SongAdapter.ViewHolder(itemView) {

        override var songMenuRes: Int
            get() = R.menu.menu_item_playing_queue_song
            set(value) {
                super.songMenuRes = value
            }

        init {
            dragView?.isVisible = true
        }

        override fun onClick(v: View?) {
            if (isInQuickSelectMode) {
                toggleChecked(layoutPosition)
            } else {
                MusicPlayerRemote.playSongAt(layoutPosition)
            }
        }

        override fun onSongMenuItemClick(item: MenuItem): Boolean {
            when (item.itemId) {
                R.id.action_remove_from_playing_queue -> {
                    removeFromQueue(layoutPosition)
                    return true
                }
            }
            return super.onSongMenuItemClick(item)
        }
    }

    companion object {

        private const val HISTORY = 0
        private const val CURRENT = 1
        private const val UP_NEXT = 2
    }
}
