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
package com.caij.puremusic.fragments.albums

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.util.LruCache
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import code.name.monkey.appthemehelper.common.ATHToolbarActivity.getToolbarBackgroundColor
import code.name.monkey.appthemehelper.util.ToolbarContentTintHelper
import com.caij.puremusic.EVENT_ALBUM_UPDATE
import com.caij.puremusic.EXTRA_ALBUM_ID
import com.caij.puremusic.EventBus
import com.caij.puremusic.EventObserver
import com.caij.puremusic.R
import com.caij.puremusic.activities.tageditor.AbsTagEditorActivity
import com.caij.puremusic.activities.tageditor.AlbumTagEditorActivityV2
import com.caij.puremusic.adapter.album.HorizontalAlbumAdapter
import com.caij.puremusic.adapter.song.SimpleSongAdapter
import com.caij.puremusic.databinding.FragmentAlbumDetailsBinding
import com.caij.puremusic.databinding.ItemAlbumFooterBinding
import com.caij.puremusic.dialogs.AddToPlaylistDialog
import com.caij.puremusic.dialogs.DeleteSongsDialog
import com.caij.puremusic.extensions.*
import com.caij.puremusic.fragments.base.AbsMainActivityFragment
import com.caij.puremusic.glide.GlideApp
import com.caij.puremusic.glide.RetroGlideExtension
import com.caij.puremusic.glide.SingleColorTarget
import com.caij.puremusic.helper.MusicPlayerRemote
import com.caij.puremusic.helper.SortOrder.AlbumSongSortOrder.Companion.SONG_A_Z
import com.caij.puremusic.helper.SortOrder.AlbumSongSortOrder.Companion.SONG_DURATION
import com.caij.puremusic.helper.SortOrder.AlbumSongSortOrder.Companion.SONG_TRACK_LIST
import com.caij.puremusic.helper.SortOrder.AlbumSongSortOrder.Companion.SONG_Z_A
import com.caij.puremusic.interfaces.IAlbumClickListener
import com.caij.puremusic.db.model.Album
import com.caij.puremusic.model.AlbumWrapper
import com.caij.puremusic.model.ArtistWrapper
import com.caij.puremusic.repository.RealRepository
import com.caij.puremusic.util.*
import com.caij.puremusic.views.HeaderAndFooterRecyclerViewAdapter
import com.google.android.material.shape.MaterialShapeDrawable
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.fragments.artists.ArtistDetailsFragment
import com.caij.puremusic.repository.RoomRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.koin.android.ext.android.get
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf
import org.koin.java.KoinJavaComponent
import java.text.Collator

class AlbumDetailsFragment : AbsMainActivityFragment(R.layout.fragment_album_details),
    IAlbumClickListener, EventObserver {

    companion object {
        val cache = HashMap<Long, Album>()
    }

    private var albumId: Long = 0
    private var _binding: FragmentAlbumDetailsBinding? = null
    private val binding get() = _binding!!

//    private val detailsViewModel by viewModel<AlbumDetailsViewModel> {
//        parametersOf(requireArguments().getLong(EXTRA_ALBUM_ID))
//    }

    private val realRepository = KoinJavaComponent.get<RealRepository>(RealRepository::class.java)
    private lateinit var detailsViewModel: AlbumDetailsViewModel

    private lateinit var simpleSongAdapter: SimpleSongAdapter
    private lateinit var albumWrapper: AlbumWrapper

    private val savedSortOrder: String
        get() = PreferenceUtil.albumDetailSongSortOrder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enterTransition = MaterialSharedAxis(MaterialSharedAxis.Y, true)
//        returnTransition = MaterialSharedAxis(MaterialSharedAxis.Y, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        albumId = if (arguments != null) {
           requireArguments().getLong(EXTRA_ALBUM_ID)
        } else {
            -1
        }
        detailsViewModel = AlbumDetailsViewModel(realRepository, albumId)

        _binding = FragmentAlbumDetailsBinding.bind(view)
        mainActivity.addMusicServiceEventListener(detailsViewModel)
        mainActivity.setSupportActionBar(binding.toolbar)

        binding.toolbar.title = " "

        detailsViewModel.getAlbum().observe(viewLifecycleOwner) { album ->
            showAlbum(album)
        }

        setupRecyclerView()
//        binding.artistImage.setOnClickListener { artistView ->
//            val fragment = ArtistDetailsFragment()
//            fragment.arguments = bundleOf(EXTRA_ARTIST_ID to albumWrapper.album.artistId)
//            openFragment(fragment)
//        }
        binding.playAction.setOnClickListener {
            val songs = albumWrapper.songs
            MusicPlayerRemote.openQueue(songs, 0, true)
        }
        binding.shuffleAction.setOnClickListener {
            val songs = albumWrapper.songs
            MusicPlayerRemote.openAndShuffleQueue(
                songs,
                true
            )
        }

        binding.appBarLayout.statusBarForeground =
            MaterialShapeDrawable.createWithElevationOverlay(requireContext())

        val albumCache = cache[albumId]
        if (albumCache != null) {
            showAlbumInfo(albumCache)
        }

        setColors(accentColor())

        EventBus.register(EVENT_ALBUM_UPDATE, this)
    }

    override fun onDestroy() {
        super.onDestroy()
        serviceActivity?.removeMusicServiceEventListener(detailsViewModel)
    }

    private fun setupRecyclerView() {
        simpleSongAdapter = SimpleSongAdapter(
            requireActivity() as AppCompatActivity,
            ArrayList(),
            R.layout.item_song
        )
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            itemAnimator = DefaultItemAnimator()
            adapter = HeaderAndFooterRecyclerViewAdapter(simpleSongAdapter)
        }
    }

    private fun showAlbumInfo(album: Album) {
        binding.albumTitle.text = album.albumName

        loadAlbumCover(album)
    }

    private fun showAlbum(albumWrapper: AlbumWrapper) {
        if (albumWrapper.songs.isEmpty()) {
            popUp()
            return
        }
        this@AlbumDetailsFragment.albumWrapper = albumWrapper

        val album = albumWrapper.album

        showAlbumInfo(album)

        val songText = resources.getQuantityString(
            R.plurals.albumSongs,
            albumWrapper.songs.size,
            albumWrapper.songs.size
        )
        binding.songTitle.text = songText

        cache[album.albumId] = album

        if (MusicUtil.getYearString(album.year) == "-") {
            binding.albumText.text = String.format(
                "%s",
                album.artistName)
        } else {
            binding.albumText.text = String.format(
                "%s • %s",
                album.artistName,
                MusicUtil.getYearString(album.year))
        }

        binding.albumDesc.text =
            MusicUtil.getPlaylistInfoString(requireContext(), albumWrapper.songs)

        simpleSongAdapter.swapDataSet(albumWrapper.songs)

        detailsViewModel.getArtistByStrId(album.artistId).observe(viewLifecycleOwner) {
            loadArtistImage(it)
        }
    }

    private fun moreAlbums(albums: List<Album>) {
        val headerAndFooterRecyclerViewAdapter = HeaderAndFooterRecyclerViewAdapter(simpleSongAdapter)
        val footerBinding = ItemAlbumFooterBinding.inflate(layoutInflater, binding.recyclerView, false)
        headerAndFooterRecyclerViewAdapter.addFooterView(footerBinding.root)
        footerBinding.moreTitle.show()
        footerBinding.moreRecyclerView.show()
        footerBinding.moreTitle.text =
            String.format(getString(R.string.label_more_from), albumWrapper.album.artistName)

        val albumAdapter =
            HorizontalAlbumAdapter(requireActivity() as AppCompatActivity, albums, this)
        footerBinding.moreRecyclerView.layoutManager = GridLayoutManager(
            requireContext(),
            1,
            GridLayoutManager.HORIZONTAL,
            false
        )
        footerBinding.moreRecyclerView.adapter = albumAdapter
        binding.recyclerView.adapter = headerAndFooterRecyclerViewAdapter
    }

    private fun loadArtistImage(artistWrapper: ArtistWrapper) {
        detailsViewModel.getMoreAlbums(artistWrapper).observe(viewLifecycleOwner) {
            moreAlbums(it)
        }
//        val model = RetroGlideExtension.getArtistModel(artistWrapper.artist)
//        GlideApp.with(requireContext())
//            //.forceDownload(PreferenceUtil.isAllowedToDownloadMetadata())
//            .load(model)
//            .artistImageOptions(artistWrapper.artist)
//            .dontAnimate()
//            .dontTransform()
//            .into(binding.artistImage)
    }

    private fun loadAlbumCover(album: Album) {
        val model = RetroGlideExtension.getAlbumModel(album)
        GlideApp.with(requireContext()).asBitmapPalette()
            .albumCoverOptions(album, model)
            //.checkIgnoreMediaStore()
            .load(model)
            .into(object : SingleColorTarget(binding.image) {
                override fun onColorReady(color: Int) {
//                    setColors(color)
                }
            })
    }

    private fun setColors(color: Int) {
        _binding?.apply {
            playAction.applyColor(color)
            shuffleAction.applyOutlineColor(color)
        }
    }

    override fun onAlbumClick(albumId: Long, view: View) {
        val fragment = AlbumDetailsFragment()
        fragment.arguments = bundleOf(EXTRA_ALBUM_ID to albumId)
        openFragment(fragment)
    }

    override fun getAlbumSongs(id: Long): List<Song> {
        return detailsViewModel.getSongs()
    }

    override fun onCreateMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_album_detail, menu)
        val sortOrder = menu.findItem(R.id.action_sort_order)
        val subMenu = sortOrder.subMenu
        if (subMenu != null) {
            setUpSortOrderMenu(subMenu)
        }
        ToolbarContentTintHelper.handleOnCreateOptionsMenu(
            requireContext(),
            binding.toolbar,
            menu,
            getToolbarBackgroundColor(binding.toolbar)
        )
    }

    override fun onMenuItemSelected(item: MenuItem): Boolean {
        return handleSortOrderMenuItem(item)
    }

    private fun handleSortOrderMenuItem(item: MenuItem): Boolean {
        var sortOrder: String? = null
        val songs = simpleSongAdapter.dataSet
        when (item.itemId) {
            android.R.id.home -> popUp()
            R.id.action_play_next -> {
                MusicPlayerRemote.playNext(songs)
                return true
            }
            R.id.action_add_to_current_playing -> {
                MusicPlayerRemote.enqueue(songs)
                return true
            }
            R.id.action_add_to_playlist -> {
                lifecycleScope.launch(Dispatchers.IO) {
                    val playlists = get<RealRepository>().fetchPlaylists()
                    withContext(Dispatchers.Main) {
                        AddToPlaylistDialog.create(playlists, songs)
                            .show(childFragmentManager, "ADD_PLAYLIST")
                    }
                }
                return true
            }
            R.id.action_delete_from_device -> {
                DeleteSongsDialog.create(songs).show(childFragmentManager, "DELETE_SONGS")
                return true
            }
            R.id.action_tag_editor -> {
                val intent = Intent(requireContext(), AlbumTagEditorActivityV2::class.java)
                intent.putExtra(AbsTagEditorActivity.EXTRA_ID, albumWrapper.album.id)
                val options = ActivityOptions.makeSceneTransitionAnimation(
                    requireActivity(),
                    binding.albumCoverContainer,
                    "${getString(R.string.transition_album_art)}_${albumWrapper.album.id}"
                )
                startActivity(
                    intent, options.toBundle()
                )
                return true
            }
            R.id.action_sort_order_title -> sortOrder = SONG_A_Z
            R.id.action_sort_order_title_desc -> sortOrder = SONG_Z_A
            R.id.action_sort_order_track_list -> sortOrder = SONG_TRACK_LIST
            R.id.action_sort_order_artist_song_duration -> sortOrder = SONG_DURATION
        }
        if (sortOrder != null) {
            item.isChecked = true
            setSaveSortOrder(sortOrder)
        }
        return true
    }

    private fun setUpSortOrderMenu(sortOrder: SubMenu) {
        when (savedSortOrder) {
            SONG_A_Z -> sortOrder.findItem(R.id.action_sort_order_title)?.isChecked = true
            SONG_Z_A -> sortOrder.findItem(R.id.action_sort_order_title_desc)?.isChecked = true
            SONG_TRACK_LIST ->
                sortOrder.findItem(R.id.action_sort_order_track_list)?.isChecked = true
            SONG_DURATION ->
                sortOrder.findItem(R.id.action_sort_order_artist_song_duration)?.isChecked = true
        }
    }

    private fun setSaveSortOrder(sortOrder: String) {
        lifecycleScope.launch(Dispatchers.IO) {
            val albumSongs = albumWrapper.songs
            withContext(Dispatchers.Main) {
                PreferenceUtil.albumDetailSongSortOrder = sortOrder
                val songs = when (sortOrder) {
                    SONG_TRACK_LIST -> albumSongs.sortedWith { o1, o2 ->
                        o1.trackNumber.compareTo(
                            o2.trackNumber
                        )
                    }
                    SONG_A_Z -> {
                        val collator = Collator.getInstance()
                        albumSongs.sortedWith { o1, o2 -> collator.compare(o1.title, o2.title) }
                    }
                    SONG_Z_A -> {
                        val collator = Collator.getInstance()
                        albumSongs.sortedWith { o1, o2 -> collator.compare(o2.title, o1.title) }
                    }
                    SONG_DURATION -> albumSongs.sortedWith { o1, o2 ->
                        o1.duration.compareTo(
                            o2.duration
                        )
                    }
                    else -> throw IllegalArgumentException("invalid $sortOrder")
                }
                simpleSongAdapter.swapDataSet(songs)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        EventBus.unregister(EVENT_ALBUM_UPDATE, this)
    }

    override fun onEvent(key: String, value: Any?) {
        if (key == EVENT_ALBUM_UPDATE && value == albumId) {
            detailsViewModel.fetchAlbum()
        }
    }
}
