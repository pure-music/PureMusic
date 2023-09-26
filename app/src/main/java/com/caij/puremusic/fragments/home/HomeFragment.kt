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
package com.caij.puremusic.fragments.home

import android.content.Intent
import android.os.Bundle
import android.view.*
import android.view.MenuItem.SHOW_AS_ACTION_IF_ROOM
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.os.bundleOf
import androidx.core.view.doOnLayout
import androidx.core.view.doOnPreDraw
import androidx.core.view.isVisible
import androidx.core.view.updateLayoutParams
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import code.name.monkey.appthemehelper.common.ATHToolbarActivity
import code.name.monkey.appthemehelper.util.ColorUtil
import code.name.monkey.appthemehelper.util.ToolbarContentTintHelper
import com.caij.puremusic.adapter.HomeAdapter
import com.caij.puremusic.databinding.FragmentHomeBinding
import com.caij.puremusic.dialogs.CreatePlaylistDialog
import com.caij.puremusic.dialogs.ImportPlaylistDialog
import com.caij.puremusic.*
import com.caij.puremusic.activities.FolderManagerActivity
import com.caij.puremusic.activities.SettingActivity
import com.caij.puremusic.db.model.Album
import com.caij.puremusic.db.model.Artist
import com.caij.puremusic.extensions.*
import com.caij.puremusic.fragments.ReloadType
import com.caij.puremusic.fragments.base.AbsMainActivityFragment
import com.caij.puremusic.glide.GlideApp
import com.caij.puremusic.glide.RetroGlideExtension
import com.caij.puremusic.helper.MusicPlayerRemote
import com.caij.puremusic.interfaces.IScrollHelper
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.fragments.albums.AlbumDetailsFragment
import com.caij.puremusic.fragments.artists.ArtistDetailsFragment
import com.caij.puremusic.fragments.genres.GenreDetailsFragment
import com.caij.puremusic.fragments.other.DetailListFragment
import com.caij.puremusic.fragments.search.SearchFragment
import com.caij.puremusic.fragments.settings.MainSettingsFragment
import com.caij.puremusic.model.Genre
import com.caij.puremusic.util.PreferenceUtil
import com.google.android.material.shape.MaterialShapeDrawable
import com.google.android.material.transition.MaterialSharedAxis
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class HomeFragment :
    AbsMainActivityFragment(R.layout.fragment_home), IScrollHelper, EventObserver {

    private lateinit var homeAdapter: HomeAdapter
    private var _binding: HomeBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val homeBinding = FragmentHomeBinding.bind(view)
        _binding = HomeBinding(homeBinding)

        setupListeners()
//        binding.titleWelcome.text = String.format("%s", userName)

//        enterTransition = MaterialFadeThrough().addTarget(binding.contentContainer)
//        reenterTransition = MaterialFadeThrough().addTarget(binding.contentContainer)

        checkForMargins()

        homeAdapter = HomeAdapter(mainActivity, libraryViewModel)
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(mainActivity)
            adapter = homeAdapter
        }

//        libraryViewModel.getSuggestions().observe(viewLifecycleOwner) {
//            loadSuggestions(it)
//        }

        loadSections()

        loadProfile()
        colorButtons()
        postponeEnterTransition()
        view.doOnPreDraw { startPostponedEnterTransition() }
        binding.appBarLayout.statusBarForeground =
            MaterialShapeDrawable.createWithElevationOverlay(requireContext())
        binding.toolbar.drawNextToNavbar()
        view.doOnLayout {
            adjustPlaylistButtons()
        }

        EventBus.register(EVENT_HOME_UPDATE, this)
    }

    private fun loadSections() {
        lifecycleScope.launch(Dispatchers.IO) {
            val it = libraryViewModel.fetchHomeSections()
            withContext(Dispatchers.Main) {
                for (home in it) {
                    if (home.homeSection == TOP_ALBUMS || home.homeSection == RECENT_ALBUMS) {
                        val albums = home.arrayList
                        for (a in albums) {
                            val album = a as Album
                            AlbumDetailsFragment.cache[album.id] = album
                        }
                    } else if (home.homeSection == TOP_ARTISTS || home.homeSection == RECENT_ARTISTS) {
                        val artists = home.arrayList
                        for (a in artists) {
                            val artist = a as Artist
                            ArtistDetailsFragment.cache[artist.id] = artist
                        }
                    }
                }
                homeAdapter.swapData(it)
            }
        }
    }

    private fun adjustPlaylistButtons() {
        val buttons =
            listOf(binding.history, binding.lastAdded, binding.topPlayed, binding.actionShuffle)
        buttons.maxOf { it.lineCount }.let { maxLineCount ->
            buttons.forEach { button ->
                // Set the highest line count to every button for consistency
                button.setLines(maxLineCount)
            }
        }
    }

    private fun setupListeners() {
//        binding.bannerImage?.setOnClickListener {
//            findNavController().navigate(
//                R.id.user_info_fragment, null, null, FragmentNavigatorExtras(
//                    binding.userImage to "user_image"
//                )
//            )
//            reenterTransition = null
//        }

        binding.lastAdded.setOnClickListener {
            val intent = Intent(mainActivity, FolderManagerActivity::class.java)
            startActivity(intent)
        }

        binding.topPlayed.setOnClickListener {
            val fragment = DetailListFragment()
            fragment.arguments = bundleOf(EXTRA_PLAYLIST_TYPE to TOP_PLAYED_PLAYLIST)
            openFragment(fragment)
            setSharedAxisYTransitions()
        }

        binding.actionShuffle.setOnClickListener {
            libraryViewModel.shuffleSongs()
        }

        binding.history.setOnClickListener {
            val fragment = DetailListFragment()
            fragment.arguments = bundleOf(EXTRA_PLAYLIST_TYPE to HISTORY_PLAYLIST)
            openFragment(fragment)
            setSharedAxisYTransitions()
        }

//        binding.userImage.setOnClickListener {
//            findNavController().navigate(
//                R.id.user_info_fragment, null, null, FragmentNavigatorExtras(
//                    binding.userImage to "user_image"
//                )
//            )
//        }
        // Reload suggestions
//        binding.suggestions.refreshButton.setOnClickListener {
//            libraryViewModel.forceReload(
//                ReloadType.Suggestions
//            )
//        }
    }

    private fun setupTitle() {
        binding.toolbar.setNavigationOnClickListener {
            val fragment = SearchFragment()
            openFragment(fragment)
        }
//        val hexColor = String.format("#%06X", 0xFFFFFF and accentColor())
//        val appName = "<span  style='color:$hexColor';>${}</span>".parseAsHtml()
        binding.appNameText.text = getString(R.string.app_name)
    }

    private fun loadProfile() {
//        binding.bannerImage?.let {
//            GlideApp.with(requireContext())
//                .load(RetroGlideExtension.getBannerModel())
//                .profileBannerOptions(RetroGlideExtension.getBannerModel())
//                .into(it)
//        }
//        GlideApp.with(requireActivity())
//            .load(RetroGlideExtension.getUserModel())
//            .userProfileOptions(RetroGlideExtension.getUserModel(), requireContext())
//            .into(binding.userImage)
    }

    fun colorButtons() {
        binding.history.elevatedAccentColor()
        binding.lastAdded.elevatedAccentColor()
        binding.topPlayed.elevatedAccentColor()
        binding.actionShuffle.elevatedAccentColor()
    }

    private fun checkForMargins() {
        if (mainActivity.isBottomNavVisible) {
            binding.recyclerView.updateLayoutParams<ViewGroup.MarginLayoutParams> {
                bottomMargin = dip(R.dimen.bottom_nav_height)
            }
        }
    }

    override fun onCreateMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_main, menu)
        menu.removeItem(R.id.action_grid_size)
        menu.removeItem(R.id.action_layout_type)
        menu.removeItem(R.id.action_sort_order)
        menu.findItem(R.id.action_settings).setShowAsAction(SHOW_AS_ACTION_IF_ROOM)
        ToolbarContentTintHelper.handleOnCreateOptionsMenu(
            requireContext(),
            binding.toolbar,
            menu,
            ATHToolbarActivity.getToolbarBackgroundColor(binding.toolbar)
        )
        //Setting up cast button
        requireContext().setUpMediaRouteButton(menu)
    }

    override fun scrollToTop() {
        binding.container.scrollTo(0, 0)
        binding.appBarLayout.setExpanded(true)
    }

    fun setSharedAxisXTransitions() {
        exitTransition =
            MaterialSharedAxis(MaterialSharedAxis.X, true).addTarget(CoordinatorLayout::class.java)
        reenterTransition = MaterialSharedAxis(MaterialSharedAxis.X, false)
    }

    fun setSharedAxisYTransitions() {
        exitTransition =
            MaterialSharedAxis(MaterialSharedAxis.Y, true).addTarget(CoordinatorLayout::class.java)
        reenterTransition = MaterialSharedAxis(MaterialSharedAxis.Y, false)
    }

    private fun loadSuggestions(songs: List<Song>) {
        if (!PreferenceUtil.homeSuggestions || songs.isEmpty()) {
            binding.suggestions.root.isVisible = false
            return
        }
        val images = listOf(
            binding.suggestions.image1,
            binding.suggestions.image2,
            binding.suggestions.image3,
            binding.suggestions.image4,
            binding.suggestions.image5,
            binding.suggestions.image6,
            binding.suggestions.image7,
            binding.suggestions.image8
        )
        val color = accentColor()
        binding.suggestions.message.apply {
            setTextColor(color)
            setOnClickListener {
                it.isClickable = false
                it.postDelayed({ it.isClickable = true }, 500)
                MusicPlayerRemote.playNext(songs.subList(0, 8))
                if (!MusicPlayerRemote.isPlaying) {
                    MusicPlayerRemote.playNextSong()
                }
            }
        }
        binding.suggestions.card6.setCardBackgroundColor(ColorUtil.withAlpha(color, 0.12f))
        images.forEachIndexed { index, imageView ->
            imageView.setOnClickListener {
                it.isClickable = false
                it.postDelayed({ it.isClickable = true }, 500)
                MusicPlayerRemote.playNext(songs[index])
                if (!MusicPlayerRemote.isPlaying) {
                    MusicPlayerRemote.playNextSong()
                }
            }
            val model = RetroGlideExtension.getSongModel(songs[index])
            GlideApp.with(this)
                .load(model)
                .songCoverOptions(songs[index], model)
                .into(imageView)
        }
    }

    companion object {

        const val TAG: String = "BannerHomeFragment"

        @JvmStatic
        fun newInstance(): HomeFragment {
            return HomeFragment()
        }
    }

    override fun onMenuItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_settings -> {
                startActivity(SettingActivity.starFragmentV4(requireActivity(), MainSettingsFragment::class.java))
            }
            R.id.action_import_playlist -> ImportPlaylistDialog().show(
                childFragmentManager,
                "ImportPlaylist"
            )
            R.id.action_add_to_playlist -> CreatePlaylistDialog.create(emptyList()).show(
                childFragmentManager,
                "ShowCreatePlaylistDialog"
            )
        }
        return false
    }

    override fun onPrepareMenu(menu: Menu) {
        super.onPrepareMenu(menu)
        ToolbarContentTintHelper.handleOnPrepareOptionsMenu(requireActivity(), binding.toolbar)
    }

    override fun onResume() {
        super.onResume()
        setupToolbar(binding.toolbar)
        setupTitle()
        checkForMargins()
        exitTransition = null
    }

    override fun onDestroyView() {
        super.onDestroyView()
        EventBus.unregister(EVENT_HOME_UPDATE, this)
        _binding = null
    }

    override fun onEvent(key: String, value: Any?) {
        if (key == EVENT_HOME_UPDATE) {
            loadSections()
        }
    }
}
