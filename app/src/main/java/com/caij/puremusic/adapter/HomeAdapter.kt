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
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.os.bundleOf
import androidx.fragment.app.findFragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.caij.puremusic.adapter.album.AlbumAdapter
import com.caij.puremusic.adapter.artist.ArtistAdapter
import com.caij.puremusic.adapter.song.SongAdapter
import com.caij.puremusic.fragments.home.HomeFragment
import com.caij.puremusic.interfaces.IAlbumClickListener
import com.caij.puremusic.interfaces.IArtistClickListener
import com.caij.puremusic.util.PreferenceUtil
import com.caij.puremusic.*
import com.caij.puremusic.db.model.Album
import com.caij.puremusic.db.model.Artist
import com.caij.puremusic.fragments.LibraryViewModel
import com.caij.puremusic.model.*
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.extensions.openFragment
import com.caij.puremusic.fragments.albums.AlbumDetailsFragment
import com.caij.puremusic.fragments.artists.ArtistDetailsFragment
import com.caij.puremusic.fragments.other.DetailListFragment

class HomeAdapter(private val activity: AppCompatActivity, private val libraryViewModel: LibraryViewModel) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>(), IArtistClickListener, IAlbumClickListener {

    private var list = listOf<Home>()

    override fun getItemViewType(position: Int): Int {
        return list[position].homeSection
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layout =
            LayoutInflater.from(activity).inflate(R.layout.section_recycler_view, parent, false)
        return when (viewType) {
            RECENT_ARTISTS, TOP_ARTISTS -> ArtistViewHolder(layout)
            FAVOURITES -> PlaylistViewHolder(layout)
            TOP_ALBUMS, RECENT_ALBUMS -> AlbumViewHolder(layout)
            else -> {
                ArtistViewHolder(layout)
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val home = list[position]
        when (getItemViewType(position)) {
            RECENT_ALBUMS -> {
                val viewHolder = holder as AlbumViewHolder
                viewHolder.bindView(home)
                viewHolder.clickableArea.setOnClickListener {
                    it.findFragment<HomeFragment>().setSharedAxisXTransitions()
                    val fragment = DetailListFragment()
                    fragment.arguments = bundleOf("type" to RECENT_ALBUMS)
                    activity.openFragment(fragment)
                }
            }
            TOP_ALBUMS -> {
                val viewHolder = holder as AlbumViewHolder
                viewHolder.bindView(home)
                viewHolder.clickableArea.setOnClickListener {
                    it.findFragment<HomeFragment>().setSharedAxisXTransitions()
                    val fragment = DetailListFragment()
                    fragment.arguments = bundleOf("type" to TOP_ALBUMS)
                    activity.openFragment(fragment)
                }
            }
            RECENT_ARTISTS -> {
                val viewHolder = holder as ArtistViewHolder
                viewHolder.bindView(home)
                viewHolder.clickableArea.setOnClickListener {
                    it.findFragment<HomeFragment>().setSharedAxisXTransitions()
                    val fragment = DetailListFragment()
                    fragment.arguments =  bundleOf("type" to RECENT_ARTISTS)
                    activity.openFragment(fragment)
                }
            }
            TOP_ARTISTS -> {
                val viewHolder = holder as ArtistViewHolder
                viewHolder.bindView(home)
                viewHolder.clickableArea.setOnClickListener {
                    it.findFragment<HomeFragment>().setSharedAxisXTransitions()
                    val fragment = DetailListFragment()
                    fragment.arguments =  bundleOf("type" to TOP_ARTISTS)
                    activity.openFragment(fragment)
                }
            }
            FAVOURITES -> {
                val viewHolder = holder as PlaylistViewHolder
                viewHolder.bindView(home)
                viewHolder.clickableArea.setOnClickListener {
                    it.findFragment<HomeFragment>().setSharedAxisXTransitions()
                    val fragment = DetailListFragment()
                    fragment.arguments = bundleOf("type" to FAVOURITES)
                    activity.openFragment(fragment)
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun swapData(sections: List<Home>) {
        list = sections
        notifyDataSetChanged()
    }

    @Suppress("UNCHECKED_CAST")
    private inner class AlbumViewHolder(view: View) : AbsHomeViewItem(view) {
        fun bindView(home: Home) {
            title.setText(home.titleRes)
            recyclerView.apply {
                adapter = albumAdapter(home.arrayList as List<Album>)
                layoutManager = gridLayoutManager()
            }
        }
    }

    @Suppress("UNCHECKED_CAST")
    private inner class ArtistViewHolder(view: View) : AbsHomeViewItem(view) {
        fun bindView(home: Home) {
            title.setText(home.titleRes)
            recyclerView.apply {
                layoutManager = linearLayoutManager()
                adapter = artistsAdapter(home.arrayList as List<Artist>)
            }
        }
    }

    @Suppress("UNCHECKED_CAST")
    private inner class PlaylistViewHolder(view: View) : AbsHomeViewItem(view) {
        fun bindView(home: Home) {
            title.setText(home.titleRes)
            recyclerView.apply {
                val songAdapter = SongAdapter(
                    activity,
                    home.arrayList as MutableList<Song>,
                    R.layout.item_favourite_card
                )
                layoutManager = linearLayoutManager()
                adapter = songAdapter
            }
        }
    }

    open class AbsHomeViewItem(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val recyclerView: RecyclerView = itemView.findViewById(R.id.recyclerView)
        val title: AppCompatTextView = itemView.findViewById(R.id.title)
        val clickableArea: ViewGroup = itemView.findViewById(R.id.clickable_area)
    }

    private fun artistsAdapter(artists: List<Artist>) =
        ArtistAdapter(activity, artists, PreferenceUtil.homeArtistGridStyle, this)

    private fun albumAdapter(albums: List<Album>) =
        AlbumAdapter(activity, albums, PreferenceUtil.homeAlbumGridStyle, this)

    private fun gridLayoutManager() =
        GridLayoutManager(activity, 1, GridLayoutManager.HORIZONTAL, false)

    private fun linearLayoutManager() =
        LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)

    override fun onArtist(artistId: Long, view: View) {
        val fragment = ArtistDetailsFragment()
        fragment.arguments = bundleOf(EXTRA_ARTIST_ID to artistId)
        val homeFragment = view.findFragment<HomeFragment>()
        homeFragment.openFragment(fragment)
//        homeFragment.setSharedAxisYTransitions()
    }

    override fun getArtistSongs(id: Long): List<Song> {
        return libraryViewModel.getArtistSongs(id)
    }

    override fun onAlbumClick(albumId: Long, view: View) {
        val fragment = AlbumDetailsFragment()
        fragment.arguments = bundleOf(EXTRA_ALBUM_ID to albumId)
        activity.openFragment(fragment)
//        homeFragment.setSharedAxisYTransitions()
    }

    override fun getAlbumSongs(id: Long): List<Song> {
        return libraryViewModel.getAlbumSongs(id)
    }
}
