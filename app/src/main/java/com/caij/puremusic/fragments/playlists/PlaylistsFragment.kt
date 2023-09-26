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
package com.caij.puremusic.fragments.playlists

import android.os.Bundle
import android.view.*
import androidx.core.os.bundleOf
import androidx.core.view.MenuCompat
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import com.caij.puremusic.EVENT_PLAY_LIST_UPDATE
import com.caij.puremusic.EXTRA_PLAYLIST
import com.caij.puremusic.EventBus
import com.caij.puremusic.EventObserver
import com.caij.puremusic.R
import com.caij.puremusic.adapter.playlist.PlaylistAdapter
import com.caij.puremusic.extensions.setUpMediaRouteButton
import com.caij.puremusic.fragments.ReloadType
import com.caij.puremusic.fragments.base.AbsRecyclerViewCustomGridSizeFragment
import com.caij.puremusic.helper.SortOrder.PlaylistSortOrder
import com.caij.puremusic.interfaces.IPlaylistClickListener
import com.caij.puremusic.model.PlaylistWrapper
import com.caij.puremusic.util.PreferenceUtil
import com.caij.puremusic.util.RetroUtil
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.extensions.openFragment
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class PlaylistsFragment :
    AbsRecyclerViewCustomGridSizeFragment<PlaylistAdapter, GridLayoutManager>(),
    IPlaylistClickListener, EventObserver {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        EventBus.register(EVENT_PLAY_LIST_UPDATE, this)
    }

    private fun loadData() {
        lifecycleScope.launch(Dispatchers.IO) {
            val it = libraryViewModel.fetchPlaylists()
            withContext(Dispatchers.Main) {
                if (it.isNotEmpty())
                    adapter?.swapDataSet(it)
                else
                    adapter?.swapDataSet(listOf())
            }
        }
    }

    override val titleRes: Int
        get() = R.string.playlists

    override val emptyMessage: Int
        get() = R.string.no_playlists

    override val isShuffleVisible: Boolean
        get() = false

    override fun createLayoutManager(): GridLayoutManager {
        return GridLayoutManager(requireContext(), getGridSize())
    }

    override fun createAdapter(): PlaylistAdapter {
        val dataSet = if (adapter == null) mutableListOf() else adapter!!.dataSet
        return PlaylistAdapter(
            requireActivity(),
            dataSet,
            itemLayoutRes(),
            this
        )
    }

    override fun onCreateMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateMenu(menu, inflater)
        val gridSizeItem: MenuItem = menu.findItem(R.id.action_grid_size)
        if (RetroUtil.isLandscape) {
            gridSizeItem.setTitle(R.string.action_grid_size_land)
        }
        val gridSizeItemSubMenu = gridSizeItem.subMenu
        if (gridSizeItemSubMenu != null) {
            setupGridSizeMenu(gridSizeItemSubMenu)
        }
        menu.removeItem(R.id.action_layout_type)
        menu.add(0, R.id.action_add_to_playlist, 0, R.string.new_playlist_title)
        menu.findItem(R.id.action_settings).setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER)
        val sortSubMenu = menu.findItem(R.id.action_sort_order).subMenu
        if (sortSubMenu != null) {
            setUpSortOrderMenu(sortSubMenu)
        }
        MenuCompat.setGroupDividerEnabled(menu, true)
        //Setting up cast button
        requireContext().setUpMediaRouteButton(menu)
    }

    override fun onMenuItemSelected(item: MenuItem): Boolean {
        if (handleGridSizeMenuItem(item)) {
            return true
        }
        if (handleSortOrderMenuItem(item)) {
            return true
        }
        return super.onMenuItemSelected(item)
    }

    private fun setupGridSizeMenu(gridSizeMenu: SubMenu) {
        when (getGridSize()) {
            1 -> gridSizeMenu.findItem(R.id.action_grid_size_1).isChecked = true
            2 -> gridSizeMenu.findItem(R.id.action_grid_size_2).isChecked = true
            3 -> gridSizeMenu.findItem(R.id.action_grid_size_3).isChecked = true
            4 -> gridSizeMenu.findItem(R.id.action_grid_size_4).isChecked = true
            5 -> gridSizeMenu.findItem(R.id.action_grid_size_5).isChecked = true
            6 -> gridSizeMenu.findItem(R.id.action_grid_size_6).isChecked = true
            7 -> gridSizeMenu.findItem(R.id.action_grid_size_7).isChecked = true
            8 -> gridSizeMenu.findItem(R.id.action_grid_size_8).isChecked = true
        }
        val gridSize = if (RetroUtil.isLandscape) 4 else 3
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

    private fun setUpSortOrderMenu(subMenu: SubMenu) {
        val order: String? = getSortOrder()
        subMenu.clear()
        createId(
            subMenu,
            R.id.action_song_sort_order_asc,
            R.string.sort_order_a_z,
            order == PlaylistSortOrder.PLAYLIST_A_Z
        )
        createId(
            subMenu,
            R.id.action_song_sort_order_desc,
            R.string.sort_order_z_a,
            order == PlaylistSortOrder.PLAYLIST_Z_A
        )
        createId(
            subMenu,
            R.id.action_playlist_sort_order,
            R.string.sort_order_num_songs,
            order == PlaylistSortOrder.PLAYLIST_SONG_COUNT
        )
        createId(
            subMenu,
            R.id.action_playlist_sort_order_desc,
            R.string.sort_order_num_songs_desc,
            order == PlaylistSortOrder.PLAYLIST_SONG_COUNT_DESC
        )
        subMenu.setGroupCheckable(0, true, true)
    }

    private fun handleSortOrderMenuItem(item: MenuItem): Boolean {
        val sortOrder: String = when (item.itemId) {
            R.id.action_song_sort_order_asc -> PlaylistSortOrder.PLAYLIST_A_Z
            R.id.action_song_sort_order_desc -> PlaylistSortOrder.PLAYLIST_Z_A
            R.id.action_playlist_sort_order -> PlaylistSortOrder.PLAYLIST_SONG_COUNT
            R.id.action_playlist_sort_order_desc -> PlaylistSortOrder.PLAYLIST_SONG_COUNT_DESC
            else -> PreferenceUtil.playlistSortOrder
        }
        if (sortOrder != PreferenceUtil.playlistSortOrder) {
            item.isChecked = true
            setAndSaveSortOrder(sortOrder)
            return true
        }
        return false
    }

    private fun handleGridSizeMenuItem(item: MenuItem): Boolean {
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

    private fun createId(menu: SubMenu, id: Int, title: Int, checked: Boolean) {
        menu.add(0, id, 0, title).isChecked = checked
    }

    override fun setGridSize(gridSize: Int) {
        adapter?.notifyDataSetChanged()
    }

    override fun setSortOrder(sortOrder: String) {
        loadData()
    }

    override fun loadSortOrder(): String {
        return PreferenceUtil.playlistSortOrder
    }

    override fun saveSortOrder(sortOrder: String) {
        PreferenceUtil.playlistSortOrder = sortOrder
    }

    override fun loadGridSize(): Int {
        return PreferenceUtil.playlistGridSize
    }

    override fun saveGridSize(gridColumns: Int) {
        PreferenceUtil.playlistGridSize = gridColumns
    }

    override fun loadGridSizeLand(): Int {
        return PreferenceUtil.playlistGridSizeLand
    }

    override fun saveGridSizeLand(gridColumns: Int) {
        PreferenceUtil.playlistGridSizeLand = gridColumns
    }

    override fun loadLayoutRes(): Int {
        return R.layout.item_grid
    }

    override fun saveLayoutRes(layoutRes: Int) {
        //Save layout
    }

    override fun onPlaylistClick(playlistWithSongs: PlaylistWrapper, view: View) {
//        exitTransition = MaterialSharedAxis(MaterialSharedAxis.Z, true).addTarget(requireView())
//        reenterTransition = MaterialSharedAxis(MaterialSharedAxis.Z, false)
        val fragment = PlaylistDetailsFragment()
        fragment.arguments = bundleOf(EXTRA_PLAYLIST to playlistWithSongs.playlistEntity.playListId)
        openFragment(fragment)
    }

    override fun getPlaylistSongs(playListId: Long): Collection<Song> {
        return libraryViewModel.getPlaylistSongs(playListId)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        EventBus.unregister(EVENT_PLAY_LIST_UPDATE, this)
    }

    override fun onEvent(key: String, value: Any?) {
        if (key == EVENT_PLAY_LIST_UPDATE) {
            loadData()
        }
    }

}
