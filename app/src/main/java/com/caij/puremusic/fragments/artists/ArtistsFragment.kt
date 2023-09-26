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
package com.caij.puremusic.fragments.artists

import android.os.Bundle
import android.view.*
import androidx.core.os.bundleOf
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import com.caij.puremusic.EVENT_ARTISTS_UPDATE
import com.caij.puremusic.EXTRA_ARTIST_ID
import com.caij.puremusic.EXTRA_ARTIST_NAME
import com.caij.puremusic.EventBus
import com.caij.puremusic.EventObserver
import com.caij.puremusic.R
import com.caij.puremusic.adapter.artist.ArtistAdapter
import com.caij.puremusic.extensions.setUpMediaRouteButton
import com.caij.puremusic.fragments.GridStyle
import com.caij.puremusic.fragments.ReloadType
import com.caij.puremusic.fragments.base.AbsRecyclerViewCustomGridSizeFragment
import com.caij.puremusic.helper.MusicPlayerRemote
import com.caij.puremusic.helper.SortOrder.ArtistSortOrder
import com.caij.puremusic.interfaces.IAlbumArtistClickListener
import com.caij.puremusic.interfaces.IArtistClickListener
import com.caij.puremusic.service.MusicService
import com.caij.puremusic.util.PreferenceUtil
import com.caij.puremusic.util.RetroUtil
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.extensions.openFragment
import com.caij.puremusic.fragments.albums.AlbumDetailsFragment
import com.caij.puremusic.util.ArtistUtil
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ArtistsFragment : AbsRecyclerViewCustomGridSizeFragment<ArtistAdapter, GridLayoutManager>(),
    IArtistClickListener, IAlbumArtistClickListener, EventObserver {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        EventBus.register(EVENT_ARTISTS_UPDATE, this)
    }

    private fun loadData() {
        lifecycleScope.launch(Dispatchers.IO) {
            var artists = libraryViewModel.getArtists()
            artists = ArtistUtil.sortArtists(artists)
            withContext(Dispatchers.Main) {
                for (artist in artists) {
                    ArtistDetailsFragment.cache[artist.id] = artist
                }
                if (artists.isNotEmpty())
                    adapter?.swapDataSet(artists)
                else
                    adapter?.swapDataSet(listOf())
            }
        }
    }

    override val titleRes: Int
        get() = R.string.artists

    override val emptyMessage: Int
        get() = R.string.no_artists

    override val isShuffleVisible: Boolean
        get() = true

    override fun onShuffleClicked() {
        lifecycleScope.launch(Dispatchers.IO) {
            val artists = libraryViewModel.getArtists()
            val songs = artists.shuffled().flatMap { artist ->
                libraryViewModel.getArtistSongs(artist.id)
            }
            withContext(Dispatchers.Main) {
                MusicPlayerRemote.setShuffleMode(MusicService.SHUFFLE_MODE_NONE)
                MusicPlayerRemote.openQueue(
                    queue = songs,
                    startPosition = 0,
                    startPlaying = true
                )
            }
        }
    }

    override fun setSortOrder(sortOrder: String) {
        loadData()
    }

    override fun createLayoutManager(): GridLayoutManager {
        return GridLayoutManager(requireActivity(), getGridSize())
    }

    override fun createAdapter(): ArtistAdapter {
        val dataSet = if (adapter == null) ArrayList() else adapter!!.dataSet
        return ArtistAdapter(
            requireActivity(),
            dataSet,
            itemLayoutRes(),
            this,
            this
        )
    }

    override fun loadGridSize(): Int {
        return PreferenceUtil.artistGridSize
    }

    override fun saveGridSize(gridColumns: Int) {
        PreferenceUtil.artistGridSize = gridColumns
    }

    override fun loadGridSizeLand(): Int {
        return PreferenceUtil.artistGridSizeLand
    }

    override fun saveGridSizeLand(gridColumns: Int) {
        PreferenceUtil.artistGridSizeLand = gridColumns
    }

    override fun setGridSize(gridSize: Int) {
        layoutManager?.spanCount = gridSize
        adapter?.notifyDataSetChanged()
    }

    override fun loadSortOrder(): String {
        return PreferenceUtil.artistSortOrder
    }

    override fun saveSortOrder(sortOrder: String) {
        PreferenceUtil.artistSortOrder = sortOrder
    }

    override fun loadLayoutRes(): Int {
        return PreferenceUtil.artistGridStyle.layoutResId
    }

    override fun saveLayoutRes(layoutRes: Int) {
        PreferenceUtil.artistGridStyle = GridStyle.values().first { gridStyle ->
            gridStyle.layoutResId == layoutRes
        }
    }

    companion object {

        fun newInstance(): ArtistsFragment {
            return ArtistsFragment()
        }
    }

    override fun onArtist(artistId: Long, view: View) {
        val fragment = ArtistDetailsFragment()
        fragment.arguments = bundleOf(EXTRA_ARTIST_ID to artistId)
        openFragment(fragment)
        reenterTransition = null
    }

    override fun getArtistSongs(id: Long): List<Song> {
        return libraryViewModel.getArtistSongs(id)
    }

    override fun onAlbumArtist(artistName: String, view: View) {
        val fragment = AlbumArtistDetailsFragment()
        fragment.arguments = bundleOf(EXTRA_ARTIST_NAME to artistName)
        openFragment(fragment)
        reenterTransition = null
    }

    override fun onCreateMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateMenu(menu, inflater)
        val gridSizeItem: MenuItem = menu.findItem(R.id.action_grid_size)
        if (RetroUtil.isLandscape) {
            gridSizeItem.setTitle(R.string.action_grid_size_land)
        }
        val gridSizeItemSubMenu = gridSizeItem.subMenu
        if (gridSizeItemSubMenu != null) {
            setUpGridSizeMenu(gridSizeItemSubMenu)
        }

        val layoutItem = menu.findItem(R.id.action_layout_type)
        val layoutItemSubMenu = layoutItem.subMenu
        if (layoutItemSubMenu != null) {
            setupLayoutMenu(layoutItemSubMenu)
        }

        val sortItem = menu.findItem(R.id.action_sort_order)
        val sortItemSubMenu = sortItem.subMenu
        if (sortItemSubMenu != null) {
            setUpSortOrderMenu(sortItemSubMenu)
        }
        setupAlbumArtistMenu(menu)
        //Setting up cast button
        requireContext().setUpMediaRouteButton(menu)
    }

    private fun setupAlbumArtistMenu(menu: Menu) {
//        menu.add(0, R.id.action_album_artist, 0, R.string.show_album_artists).apply {
//            isCheckable = true
//            isChecked = PreferenceUtil.albumArtistsOnly
//        }
    }

    private fun setUpSortOrderMenu(
        sortOrderMenu: SubMenu
    ) {
        val currentSortOrder: String? = getSortOrder()
        sortOrderMenu.clear()
        sortOrderMenu.add(
            0,
            R.id.action_artist_sort_order_asc,
            0,
            R.string.sort_order_a_z
        ).isChecked = currentSortOrder.equals(ArtistSortOrder.ARTIST_A_Z)
        sortOrderMenu.add(
            0,
            R.id.action_artist_sort_order_desc,
            1,
            R.string.sort_order_z_a
        ).isChecked = currentSortOrder.equals(ArtistSortOrder.ARTIST_Z_A)
        sortOrderMenu.setGroupCheckable(0, true, true)
    }

    private fun setupLayoutMenu(
        subMenu: SubMenu
    ) {
        when (itemLayoutRes()) {
            R.layout.item_card -> subMenu.findItem(R.id.action_layout_card).isChecked = true
            R.layout.item_grid -> subMenu.findItem(R.id.action_layout_normal).isChecked = true
            R.layout.item_card_color -> subMenu.findItem(R.id.action_layout_colored_card).isChecked =
                true
            R.layout.item_grid_circle -> subMenu.findItem(R.id.action_layout_circular).isChecked =
                true
            R.layout.image -> subMenu.findItem(R.id.action_layout_image).isChecked = true
            R.layout.item_image_gradient -> subMenu.findItem(R.id.action_layout_gradient_image).isChecked =
                true
        }
    }

    private fun setUpGridSizeMenu(
        gridSizeMenu: SubMenu
    ) {
        when (getGridSize()) {
            1 -> gridSizeMenu.findItem(R.id.action_grid_size_1).isChecked =
                true
            2 -> gridSizeMenu.findItem(R.id.action_grid_size_2).isChecked = true
            3 -> gridSizeMenu.findItem(R.id.action_grid_size_3).isChecked = true
            4 -> gridSizeMenu.findItem(R.id.action_grid_size_4).isChecked = true
            5 -> gridSizeMenu.findItem(R.id.action_grid_size_5).isChecked = true
            6 -> gridSizeMenu.findItem(R.id.action_grid_size_6).isChecked = true
            7 -> gridSizeMenu.findItem(R.id.action_grid_size_7).isChecked = true
            8 -> gridSizeMenu.findItem(R.id.action_grid_size_8).isChecked = true
        }
        val gridSize: Int = maxGridSize
        if (gridSize < 8) {
            gridSizeMenu.findItem(R.id.action_grid_size_8).isVisible = false
        }
        if (gridSize < 7) {
            gridSizeMenu.findItem(R.id.action_grid_size_7).isVisible = false
        }
        if (gridSize < 6) {
            gridSizeMenu.findItem(R.id.action_grid_size_6).isVisible = false
        }
        if (gridSize < 5) {
            gridSizeMenu.findItem(R.id.action_grid_size_5).isVisible = false
        }
        if (gridSize < 4) {
            gridSizeMenu.findItem(R.id.action_grid_size_4).isVisible = false
        }
        if (gridSize < 3) {
            gridSizeMenu.findItem(R.id.action_grid_size_3).isVisible = false
        }
    }

    override fun onMenuItemSelected(item: MenuItem): Boolean {
        if (handleGridSizeMenuItem(item)) {
            return true
        }
        if (handleLayoutResType(item)) {
            return true
        }
        if (handleSortOrderMenuItem(item)) {
            return true
        }
        if (handleAlbumArtistMenu(item)) {
            return true
        }
        return super.onMenuItemSelected(item)
    }

    private fun handleAlbumArtistMenu(item: MenuItem): Boolean {
        return if (item.itemId == R.id.action_album_artist) {
            PreferenceUtil.albumArtistsOnly = !item.isChecked
            item.isChecked = !item.isChecked
            loadData()
            true
        } else {
            false
        }
    }

    private fun handleSortOrderMenuItem(
        item: MenuItem
    ): Boolean {
        val sortOrder: String = when (item.itemId) {
            R.id.action_artist_sort_order_asc -> ArtistSortOrder.ARTIST_A_Z
            R.id.action_artist_sort_order_desc -> ArtistSortOrder.ARTIST_Z_A
            else -> PreferenceUtil.artistSortOrder
        }
        if (sortOrder != PreferenceUtil.artistSortOrder) {
            item.isChecked = true
            setAndSaveSortOrder(sortOrder)
            return true
        }
        return false
    }

    private fun handleLayoutResType(
        item: MenuItem
    ): Boolean {
        val layoutRes = when (item.itemId) {
            R.id.action_layout_normal -> R.layout.item_grid
            R.id.action_layout_card -> R.layout.item_card
            R.id.action_layout_colored_card -> R.layout.item_card_color
            R.id.action_layout_circular -> R.layout.item_grid_circle
            R.id.action_layout_image -> R.layout.image
            R.id.action_layout_gradient_image -> R.layout.item_image_gradient
            else -> PreferenceUtil.artistGridStyle.layoutResId
        }
        if (layoutRes != PreferenceUtil.artistGridStyle.layoutResId) {
            item.isChecked = true
            setAndSaveLayoutRes(layoutRes)
            return true
        }
        return false
    }

    private fun handleGridSizeMenuItem(
        item: MenuItem
    ): Boolean {
        val gridSize = when (item.itemId) {
            R.id.action_grid_size_1 -> 1
            R.id.action_grid_size_2 -> 2
            R.id.action_grid_size_3 -> 3
            R.id.action_grid_size_4 -> 4
            R.id.action_grid_size_5 -> 5
            R.id.action_grid_size_6 -> 6
            R.id.action_grid_size_7 -> 7
            R.id.action_grid_size_8 -> 8
            else -> 0
        }
        if (gridSize > 0) {
            item.isChecked = true
            setAndSaveGridSize(gridSize)
            return true
        }
        return false
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        EventBus.unregister(EVENT_ARTISTS_UPDATE, this)
    }

    override fun onEvent(key: String, value: Any?) {
        if (key == EVENT_ARTISTS_UPDATE) {
            loadData()
        }
    }
}
