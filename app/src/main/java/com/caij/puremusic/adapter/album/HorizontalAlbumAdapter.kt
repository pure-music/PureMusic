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
package com.caij.puremusic.adapter.album

import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.caij.puremusic.glide.GlideApp
import com.caij.puremusic.glide.RetroGlideExtension
import com.caij.puremusic.glide.RetroMusicColoredTarget
import com.caij.puremusic.helper.HorizontalAdapterHelper
import com.caij.puremusic.interfaces.IAlbumClickListener
import com.caij.puremusic.db.model.Album
import com.caij.puremusic.util.MusicUtil
import com.caij.puremusic.util.color.MediaNotificationProcessor

class HorizontalAlbumAdapter(
    activity: FragmentActivity,
    dataSet: List<Album>,
    albumClickListener: IAlbumClickListener
) : AlbumAdapter(
    activity, dataSet, HorizontalAdapterHelper.LAYOUT_RES, albumClickListener
) {

    override fun createViewHolder(view: View, viewType: Int): ViewHolder {
        val params = view.layoutParams as ViewGroup.MarginLayoutParams
        HorizontalAdapterHelper.applyMarginToLayoutParams(activity, params, viewType)
        return ViewHolder(view)
    }

    override fun setColors(color: MediaNotificationProcessor, holder: ViewHolder) {
        // holder.title?.setTextColor(ATHUtil.resolveColor(activity, android.R.attr.textColorPrimary))
        // holder.text?.setTextColor(ATHUtil.resolveColor(activity, android.R.attr.textColorSecondary))
    }

    override fun loadAlbumCover(album: Album, holder: ViewHolder) {
        if (holder.image == null) return
        val model = RetroGlideExtension.getAlbumModel(album)
        GlideApp.with(activity).asBitmapPalette().albumCoverOptions(album, model)
            .load(model)
            .into(object : RetroMusicColoredTarget(holder.image!!) {
                override fun onColorReady(colors: MediaNotificationProcessor) {
                    setColors(colors, holder)
                }
            })
    }

    override fun getAlbumText(album: Album): String {
        return MusicUtil.getYearString(album.year)
    }

    override fun getItemViewType(position: Int): Int {
        return HorizontalAdapterHelper.getItemViewType(position, itemCount)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    companion object {
        val TAG: String = AlbumAdapter::class.java.simpleName
    }
}
