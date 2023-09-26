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
package com.caij.puremusic.fragments.genres

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.core.os.bundleOf
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.caij.puremusic.EXTRA_ALBUM_ID
import com.caij.puremusic.EXTRA_GENRE
import com.caij.puremusic.R
import com.caij.puremusic.adapter.GenreAdapter
import com.caij.puremusic.extensions.openFragment
import com.caij.puremusic.extensions.setUpMediaRouteButton
import com.caij.puremusic.fragments.ReloadType
import com.caij.puremusic.fragments.albums.AlbumDetailsFragment
import com.caij.puremusic.fragments.base.AbsRecyclerViewFragment
import com.caij.puremusic.interfaces.IGenreClickListener
import com.caij.puremusic.model.Genre
import com.caij.puremusic.util.RetroUtil
import com.google.android.material.transition.MaterialSharedAxis
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class
GenresFragment : AbsRecyclerViewFragment<GenreAdapter, LinearLayoutManager>(),
    IGenreClickListener {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lifecycleScope.launch(Dispatchers.IO) {
            val it = libraryViewModel.fetchGenres()
            withContext(Dispatchers.Main) {
                if (it.isNotEmpty())
                    adapter?.swapDataSet(it)
                else
                    adapter?.swapDataSet(listOf())
            }
        }
    }

    override fun createLayoutManager(): LinearLayoutManager {
        return if (RetroUtil.isLandscape) {
            GridLayoutManager(activity, 4)
        } else {
            GridLayoutManager(activity, 2)
        }
    }

    override fun createAdapter(): GenreAdapter {
        val dataSet = if (adapter == null) ArrayList() else adapter!!.dataSet
        return GenreAdapter(requireActivity(), dataSet, this)
    }

    override fun onCreateMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateMenu(menu, inflater)
        menu.removeItem(R.id.action_grid_size)
        menu.removeItem(R.id.action_layout_type)
        menu.removeItem(R.id.action_sort_order)
        menu.findItem(R.id.action_settings).setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM)
        //Setting up cast button
        requireContext().setUpMediaRouteButton(menu)
    }

    override val titleRes: Int
        get() = R.string.genres

    override val emptyMessage: Int
        get() = R.string.no_genres

    override val isShuffleVisible: Boolean
        get() = false

    companion object {
        @JvmField
        val TAG: String = GenresFragment::class.java.simpleName

        @JvmStatic
        fun newInstance(): GenresFragment {
            return GenresFragment()
        }
    }

    override fun onClickGenre(genre: Genre, view: View) {
        exitTransition = MaterialSharedAxis(MaterialSharedAxis.Z, true).addTarget(requireView())
        reenterTransition = MaterialSharedAxis(MaterialSharedAxis.Z, false)
        val fragment = GenreDetailsFragment()
        fragment.arguments = bundleOf(EXTRA_GENRE to genre)
        openFragment(fragment)
    }
}
