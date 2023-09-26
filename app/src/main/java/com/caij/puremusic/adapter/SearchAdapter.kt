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
package com.caij.puremusic.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.core.view.isGone
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import code.name.monkey.appthemehelper.ThemeStore
import com.caij.puremusic.adapter.base.MediaEntryViewHolder
import com.caij.puremusic.glide.GlideApp
import com.caij.puremusic.glide.RetroGlideExtension
import com.caij.puremusic.helper.MusicPlayerRemote
import com.caij.puremusic.helper.menu.SongMenuHelper
import com.caij.puremusic.*
import com.caij.puremusic.db.model.PlaylistEntity
import com.caij.puremusic.db.model.Artist
import com.caij.puremusic.model.Genre
import com.caij.puremusic.db.model.Album
import com.caij.puremusic.model.PlaylistWrapper
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.extensions.openFragment
import com.caij.puremusic.fragments.albums.AlbumDetailsFragment
import com.caij.puremusic.fragments.artists.AlbumArtistDetailsFragment
import com.caij.puremusic.fragments.artists.ArtistDetailsFragment
import com.caij.puremusic.fragments.genres.GenreDetailsFragment
import com.caij.puremusic.fragments.playlists.PlaylistDetailsFragment
import java.util.*

class SearchAdapter(
    private val activity: FragmentActivity,
    private var dataSet: List<Any>
) : RecyclerView.Adapter<SearchAdapter.ViewHolder>() {

    @SuppressLint("NotifyDataSetChanged")
    fun swapDataSet(dataSet: List<Any>) {
        this.dataSet = dataSet
        notifyDataSetChanged()
    }

    override fun getItemViewType(position: Int): Int {
        if (dataSet[position] is Album) return ALBUM
        if (dataSet[position] is Artist) return ARTIST
        if (dataSet[position] is Genre) return GENRE
        if (dataSet[position] is PlaylistEntity) return PLAYLIST
        return if (dataSet[position] is Song) SONG else HEADER
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return when (viewType) {
            HEADER -> ViewHolder(
                LayoutInflater.from(activity).inflate(
                    R.layout.sub_header,
                    parent,
                    false
                ), viewType
            )
            ALBUM, ARTIST, ALBUM_ARTIST -> ViewHolder(
                LayoutInflater.from(activity).inflate(
                    R.layout.item_list_big,
                    parent,
                    false
                ), viewType
            )
            else -> ViewHolder(
                LayoutInflater.from(activity).inflate(R.layout.item_list, parent, false),
                viewType
            )
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        when (getItemViewType(position)) {
            ALBUM -> {
                holder.imageTextContainer?.isVisible = true
                val album = dataSet[position] as Album
                holder.title?.text = album.albumName
                holder.text?.text = album.artistName
                val model = RetroGlideExtension.getAlbumModel(album)
                GlideApp.with(activity).asDrawable().albumCoverOptions(album, model)
                    .load(model)
                    .into(holder.image!!)
            }
            ARTIST -> {
                holder.imageTextContainer?.isVisible = true
                val artist = dataSet[position] as Artist
                holder.title?.text = artist.name
                val str = "" //MusicUtil.getArtistInfoString(activity, artist)
                holder.text?.text = str
                val model = RetroGlideExtension.getArtistModel(artist)
                GlideApp.with(activity).asDrawable().artistImageOptions(model).load(model).into(holder.image!!)
            }
            SONG -> {
                holder.imageTextContainer?.isVisible = true
                val song = dataSet[position] as Song
                holder.title?.text = song.title
                holder.text?.text = song.albumName
                val model = RetroGlideExtension.getSongModel(song)
                GlideApp.with(activity).asDrawable().songCoverOptions(song, model)
                    .load(model).into(holder.image!!)
            }
            GENRE -> {
                val genre = dataSet[position] as Genre
                holder.title?.text = genre.name
                holder.text?.text = String.format(
                    Locale.getDefault(),
                    "%d %s",
                    genre.songCount,
                    if (genre.songCount > 1) activity.getString(R.string.songs) else activity.getString(
                        R.string.song
                    )
                )
            }
            PLAYLIST -> {
                val playlist = dataSet[position] as PlaylistEntity
                holder.title?.text = playlist.playlistName
                //holder.text?.text = MusicUtil.playlistInfoString(activity, playlist.songs)
            }
            ALBUM_ARTIST -> {
                holder.imageTextContainer?.isVisible = true
                val artist = dataSet[position] as Artist
                holder.title?.text = artist.name
                val str = "" //MusicUtil.getArtistInfoString(activity, artist);
                holder.text?.text = str
                val model = RetroGlideExtension.getArtistModel(artist)
                GlideApp.with(activity).asDrawable().artistImageOptions(model).load(model).into(holder.image!!)
            }
            else -> {
                holder.title?.text = dataSet[position].toString()
                holder.title?.setTextColor(ThemeStore.accentColor(activity,))
            }
        }
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    inner class ViewHolder(itemView: View, itemViewType: Int) : MediaEntryViewHolder(itemView) {
        init {
            itemView.setOnLongClickListener(null)
            imageTextContainer?.isInvisible = true
            if (itemViewType == SONG) {
                imageTextContainer?.isGone = true
                menu?.isVisible = true
                menu?.setOnClickListener(object : SongMenuHelper.OnClickSongMenu(activity) {
                    override val song: Song
                        get() = dataSet[layoutPosition] as Song
                })
            } else {
                menu?.isVisible = false
            }

            when (itemViewType) {
                ALBUM -> setImageTransitionName(activity.getString(R.string.transition_album_art))
                ARTIST -> setImageTransitionName(activity.getString(R.string.transition_artist_image))
                else -> {
                    val container = itemView.findViewById<View>(R.id.imageContainer)
                    container?.isVisible = false
                }
            }
        }

        override fun onClick(v: View?) {
            val item = dataSet[layoutPosition]
            when (itemViewType) {
                ALBUM -> {
                    val fragment = AlbumDetailsFragment()
                    fragment.arguments = bundleOf(EXTRA_ALBUM_ID to (item as Album).id)
                    activity.openFragment(fragment)
                }
                ARTIST -> {
                    val fragment = ArtistDetailsFragment()
                    fragment.arguments = bundleOf(EXTRA_ARTIST_ID to (item as Artist).id)
                    activity.openFragment(fragment)
                }
                ALBUM_ARTIST ->{
                    val fragment = AlbumArtistDetailsFragment()
                    fragment.arguments = bundleOf(EXTRA_ARTIST_NAME to (item as Artist).name)
                    activity.openFragment(fragment)
                }
                GENRE -> {
                    val fragment = GenreDetailsFragment()
                    fragment.arguments = bundleOf(EXTRA_GENRE to (item as Genre))
                    activity.openFragment(fragment)
                }
                PLAYLIST -> {
                    val fragment = PlaylistDetailsFragment()
                    fragment.arguments = bundleOf(EXTRA_PLAYLIST to (item as PlaylistWrapper).playlistEntity.playListId)
                    activity.openFragment(fragment)
                }
                SONG -> {
                    MusicPlayerRemote.playNext(item as Song)
                    MusicPlayerRemote.playNextSong()
                }
            }
        }
    }

    companion object {
        private const val HEADER = 0
        private const val ALBUM = 1
        private const val ARTIST = 2
        private const val SONG = 3
        private const val GENRE = 4
        private const val PLAYLIST = 5
        private const val ALBUM_ARTIST = 6
    }
}
