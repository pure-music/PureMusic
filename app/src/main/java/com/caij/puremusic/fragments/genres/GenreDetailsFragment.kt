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

import android.os.Build
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.core.os.ParcelCompat
import androidx.core.view.doOnPreDraw
import androidx.core.view.isVisible
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.caij.puremusic.EXTRA_GENRE
import com.caij.puremusic.R
import com.caij.puremusic.adapter.song.SongAdapter
import com.caij.puremusic.databinding.FragmentPlaylistDetailBinding
import com.caij.puremusic.extensions.dipToPix
import com.caij.puremusic.fragments.base.AbsMainActivityFragment
import com.caij.puremusic.helper.menu.GenreMenuHelper
import com.caij.puremusic.model.Genre
import com.caij.puremusic.db.model.Song
import com.google.android.material.shape.MaterialShapeDrawable
import com.google.android.material.transition.MaterialSharedAxis
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class GenreDetailsFragment : AbsMainActivityFragment(R.layout.fragment_playlist_detail) {
    private val detailsViewModel: GenreDetailsViewModel by viewModel {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            parametersOf(requireArguments().getParcelable(EXTRA_GENRE, Genre::class.java))
        } else {
            parametersOf(requireArguments().getParcelable(EXTRA_GENRE))
        }
    }
    private lateinit var genre: Genre
    private lateinit var songAdapter: SongAdapter
    private var _binding: FragmentPlaylistDetailBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        enterTransition = MaterialSharedAxis(MaterialSharedAxis.Z, true).addTarget(view)
        returnTransition = MaterialSharedAxis(MaterialSharedAxis.Z, false)
        _binding = FragmentPlaylistDetailBinding.bind(view)
        mainActivity.addMusicServiceEventListener(detailsViewModel)
        mainActivity.setSupportActionBar(binding.toolbar)
        binding.container.transitionName = "genre"
        genre = requireArguments().getParcelable(EXTRA_GENRE)!!
        binding.toolbar.title = genre.name
        setupRecyclerView()
        detailsViewModel.getSongs().observe(viewLifecycleOwner) {
            songs(it)
        }
        postponeEnterTransition()
        view.doOnPreDraw {
            startPostponedEnterTransition()
        }
        binding.appBarLayout.statusBarForeground =
            MaterialShapeDrawable.createWithElevationOverlay(requireContext())
    }

    private fun setupRecyclerView() {
        songAdapter = SongAdapter(requireActivity(), ArrayList(), R.layout.item_list)
        binding.recyclerView.apply {
            itemAnimator = DefaultItemAnimator()
            layoutManager = LinearLayoutManager(requireContext())
            adapter = songAdapter
        }
        songAdapter.registerAdapterDataObserver(object : RecyclerView.AdapterDataObserver() {
            override fun onChanged() {
                super.onChanged()
                checkIsEmpty()
            }
        })
    }

    fun songs(songs: List<Song>) {
        binding.progressIndicator.hide()
        if (songs.isNotEmpty()) songAdapter.swapDataSet(songs)
        else songAdapter.swapDataSet(emptyList())
    }

    private fun getEmojiByUnicode(unicode: Int): String {
        return String(Character.toChars(unicode))
    }

    private fun checkIsEmpty() {
        checkForPadding()
        binding.emptyEmoji.text = getEmojiByUnicode(0x1F631)
        binding.empty.isVisible = songAdapter.itemCount == 0
    }

    private fun checkForPadding() {
        val height = dipToPix(52f).toInt()
        binding.recyclerView.setPadding(0, 0, 0, height)
    }

    override fun onCreateMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_genre_detail, menu)
    }

    override fun onMenuItemSelected(item: MenuItem): Boolean {
        return GenreMenuHelper.handleMenuClick(requireActivity(), genre, item)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
