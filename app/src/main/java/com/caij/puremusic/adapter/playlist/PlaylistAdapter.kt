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
package com.caij.puremusic.adapter.playlist

import android.graphics.Color
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.PopupMenu
import androidx.core.view.isGone
import androidx.core.view.setPadding
import androidx.fragment.app.FragmentActivity
import code.name.monkey.appthemehelper.util.ATHUtil
import code.name.monkey.appthemehelper.util.TintHelper
import com.caij.puremusic.R
import com.caij.puremusic.adapter.base.AbsMultiSelectAdapter
import com.caij.puremusic.adapter.base.MediaEntryViewHolder
import com.caij.puremusic.db.model.PlaylistEntity
import com.caij.puremusic.extensions.dipToPix
import com.caij.puremusic.glide.GlideApp
import com.caij.puremusic.glide.RetroGlideExtension
import com.caij.puremusic.helper.SortOrder.PlaylistSortOrder
import com.caij.puremusic.helper.menu.PlaylistMenuHelper
import com.caij.puremusic.helper.menu.SongsMenuHelper
import com.caij.puremusic.interfaces.IPlaylistClickListener
import com.caij.puremusic.model.PlaylistWrapper
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.util.MusicUtil
import com.caij.puremusic.util.PreferenceUtil
import me.zhanghai.android.fastscroll.PopupTextProvider

class PlaylistAdapter(
    override val activity: FragmentActivity,
    var dataSet: List<PlaylistWrapper>,
    private var itemLayoutRes: Int,
    private val listener: IPlaylistClickListener
) : AbsMultiSelectAdapter<PlaylistAdapter.ViewHolder, PlaylistWrapper>(
    activity,
    R.menu.menu_playlists_selection
), PopupTextProvider {


    fun swapDataSet(dataSet: List<PlaylistWrapper>) {
        this.dataSet = dataSet
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(activity).inflate(itemLayoutRes, parent, false)
        return createViewHolder(view)
    }

    private fun createViewHolder(view: View): ViewHolder {
        return ViewHolder(view)
    }

    private fun getPlaylistTitle(playlist: PlaylistEntity): String {
        return playlist.playlistName.ifEmpty { "-" }
    }

    private fun getPlaylistText(playlist: PlaylistWrapper): String {
        return MusicUtil.getSongCountString(activity, playlist.songCount)
    }

    override fun getPopupText(position: Int): String {
        val sectionName: String = when (PreferenceUtil.playlistSortOrder) {
            PlaylistSortOrder.PLAYLIST_A_Z, PlaylistSortOrder.PLAYLIST_Z_A -> dataSet[position].playlistEntity.playlistName
            PlaylistSortOrder.PLAYLIST_SONG_COUNT, PlaylistSortOrder.PLAYLIST_SONG_COUNT_DESC -> dataSet[position].songCount.toString()
            else -> {
                return ""
            }
        }
        return MusicUtil.getSectionName(sectionName)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val playlist = dataSet[position]
        holder.itemView.isActivated = isChecked(playlist)
        holder.title?.text = getPlaylistTitle(playlist.playlistEntity)
        holder.text?.text = getPlaylistText(playlist)
        holder.menu?.isGone = isChecked(playlist)
        if (itemLayoutRes == R.layout.item_list) {
            holder.image?.setPadding(activity.dipToPix(8F).toInt())
            holder.image?.setImageDrawable(getIconRes())
        } else {
            if (playlist.firstSong == null) {
                GlideApp.with(activity)
                    .load("")
                    .error(RetroGlideExtension.getDrawable(RetroGlideExtension.DEFAULT_ALBUM_IMAGE))
                    .placeholder(RetroGlideExtension.getDrawable(RetroGlideExtension.DEFAULT_ALBUM_IMAGE))
                    .into(holder.image!!)
            } else {
                val song = playlist.firstSong!!
                val model = RetroGlideExtension.getSongModel(song)
                GlideApp.with(activity)
                    .load(model)
                    .songCoverOptions(song, model)
                    .into(holder.image!!)
            }
        }
    }

    private fun getIconRes(): Drawable = TintHelper.createTintedDrawable(
        activity,
        R.drawable.ic_playlist_play,
        ATHUtil.resolveColor(activity, android.R.attr.colorControlNormal)
    )

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun getIdentifier(position: Int): PlaylistWrapper {
        return dataSet[position]
    }

    override fun getName(model: PlaylistWrapper): String {
        return model.playlistEntity.playlistName
    }

    override fun onMultipleItemAction(menuItem: MenuItem, selection: List<PlaylistWrapper>) {
        when (menuItem.itemId) {
            else -> SongsMenuHelper.handleMenuClick(
                activity,
                getSongList(selection),
                menuItem.itemId
            )
        }
    }

    private fun getSongList(playlists: List<PlaylistWrapper>): List<Song> {
        val songs = mutableListOf<Song>()
        playlists.forEach {
            songs.addAll(listener.getPlaylistSongs(it.playlistEntity.playListId))
        }
        return songs
    }

    inner class ViewHolder(itemView: View) : MediaEntryViewHolder(itemView) {
        init {
            menu?.setOnClickListener { view ->
                val popupMenu = PopupMenu(activity, view)
                popupMenu.inflate(R.menu.menu_item_playlist)
                popupMenu.setOnMenuItemClickListener { item ->
                    PlaylistMenuHelper.handleMenuClick(activity, dataSet[layoutPosition].playlistEntity, item)
                }
                popupMenu.show()
            }

            imageTextContainer?.apply {
                cardElevation = 0f
                setCardBackgroundColor(Color.TRANSPARENT)
            }
        }

        override fun onClick(v: View?) {
            if (isInQuickSelectMode) {
                toggleChecked(layoutPosition)
            } else {
                itemView.transitionName = "playlist"
                listener.onPlaylistClick(dataSet[layoutPosition], itemView)
            }
        }

        override fun onLongClick(v: View?): Boolean {
            toggleChecked(layoutPosition)
            return true
        }
    }

    companion object {
        val TAG: String = PlaylistAdapter::class.java.simpleName
    }
}
