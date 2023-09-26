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
import android.view.View
import com.caij.puremusic.EXTRA_ARTIST_ID
import com.caij.puremusic.db.model.Artist
import com.caij.puremusic.model.ArtistWrapper
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class ArtistDetailsFragment : AbsArtistDetailsFragment() {

    companion object {
        val cache = HashMap<Long, Artist>(10)
    }

    override val detailsViewModel: ArtistDetailsViewModel by viewModel {
        parametersOf(requireArguments().getLong(EXTRA_ARTIST_ID), null)
    }
    override val artistId: Long
        get() = requireArguments().getLong(EXTRA_ARTIST_ID)
    override val artistName: String?
        get() = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val artistId = requireArguments().getLong(EXTRA_ARTIST_ID)
        val artistCache = cache[artistId]
        if (artistCache != null) {
            showArtistInfo(artistCache)
        }
    }

    override fun showArtistStep1(artistWrapper: ArtistWrapper) {
        super.showArtistStep1(artistWrapper)
        cache[artistWrapper.artist.id] = artistWrapper.artist
    }

}
