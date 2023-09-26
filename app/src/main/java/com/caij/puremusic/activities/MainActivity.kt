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
package com.caij.puremusic.activities

import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import androidx.core.content.edit
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import com.caij.easypermissions.PermissionListener
import com.caij.easypermissions.Permissions
import com.caij.puremusic.BuildConfig
import com.caij.puremusic.FragmentStackManager
import com.caij.puremusic.R
import com.caij.puremusic.SHOW_PRIVACY
import com.caij.puremusic.SHOW_SOURCE_EMPTY_HINT
import com.caij.puremusic.activities.base.AbsCastActivity
import com.caij.puremusic.analyze.Catee
import com.caij.puremusic.analyze.ChannelUtil
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.drive.DriveFactory
import com.caij.puremusic.extensions.*
import com.caij.puremusic.fragments.albums.AlbumsFragment
import com.caij.puremusic.fragments.artists.ArtistsFragment
import com.caij.puremusic.fragments.base.AbsMainActivityFragment
import com.caij.puremusic.fragments.folder.FolderUtil
import com.caij.puremusic.fragments.folder.PermissionUtil
import com.caij.puremusic.fragments.genres.GenresFragment
import com.caij.puremusic.fragments.home.HomeFragment
import com.caij.puremusic.fragments.playlists.PlaylistsFragment
import com.caij.puremusic.fragments.songs.SongsFragment
import com.caij.puremusic.helper.MusicPlayerRemote
import com.caij.puremusic.helper.SearchQueryHelper.getSongs
import com.caij.puremusic.helper.UpdateHelper
import com.caij.puremusic.interfaces.IScrollHelper
import com.caij.puremusic.model.CategoryInfo
import com.caij.puremusic.service.MusicService
import com.caij.puremusic.util.*
import com.caij.vip.VipWrapper
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class MainActivity : AbsCastActivity() {

    private var lastShowFragment: Fragment? = null
    private lateinit var musicFolderUtil: MusicFolderUtil

    companion object {
        const val TAG = "MainActivity"
        const val EXPAND_PANEL = "expand_panel"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTaskDescriptionColorAuto()
        hideStatusBar()
        updateTabs()
        AppRater.appLaunched(this)

        setupNavigationController()

//        WhatsNewFragment.showChangeLog(this)

        val showPrivacy = SPs.getGlobalSharedPreferences(this).getBoolean(SHOW_PRIVACY, true)
        musicFolderUtil = MusicFolderUtil(this@MainActivity, this@MainActivity, libraryViewModel, null)
        if (showPrivacy) {
            showPrivacy()
        } else {
            showFolderHint()
        }

        val updateHelper = UpdateHelper(application, BuildConfig.VERSION_CODE, ChannelUtil.getChannel(this),
            VipWrapper.getInstance(applicationContext).wwwwwwww(), false)
        updateHelper.checkUpdateLimit()
    }

    private fun showFolderHint() {
        lifecycleScope.launch(Dispatchers.Main) {
            val musicSourceFolder = withContext(Dispatchers.IO) {
                FolderUtil.folderManager.getFolders()
            }
            if (musicSourceFolder.isEmpty()) {
                val sp =  SPs.getGlobalSharedPreferences(this@MainActivity)
                val showHint = sp.getBoolean(SHOW_SOURCE_EMPTY_HINT, true)
                if (showHint) {
                    musicFolderUtil.showSourceSelectDialog(getString(R.string.empty_music_source_title))
                    sp.edit {
                        putBoolean(SHOW_SOURCE_EMPTY_HINT, false)
                    }
                }
            } else {
                for (folder in musicSourceFolder) {
                    if (folder.type == DriveFactory.TYPE_INNER) {
                        val permissions = PermissionUtil.getStoragePermissionsToRequest()
                        if (!Permissions.hasPermissions(this@MainActivity, *permissions)) {
                            Permissions.with(this@MainActivity)
                                .permissions(*permissions)
                                .showReasonBeforeRequest()
                                .showReasonAfterRequest()
                                .request(PermissionListener { allGranted, grantResults, deniedResults ->

                                })
                        }
                    }
                }
            }
        }
    }

    private fun showPrivacy() {
        val dialog = MaterialAlertDialogBuilder(this)
            .setTitle(getString(R.string.privacy))
            .setMessage(R.string.user_privacy)
            .setNegativeButton(R.string.view, DialogInterface.OnClickListener { dialog, which ->
                RetroUtil.onClick(dialog)
                NavigationUtil.openPrivacy(this)
            })
            .setPositiveButton(
                R.string.accept,
                DialogInterface.OnClickListener { dialog, which ->
                    RetroUtil.dismissDialog(dialog)
                    dialog.dismiss()
                    SPs.getGlobalSharedPreferences(this).edit {
                        putBoolean(SHOW_PRIVACY, false)
                    }
                    Catee.submitPolicyGrantResult(application, true)
                    val channel = ChannelUtil.getChannel(this)
                    Catee.preInit(application, channel)
                    Init.initCatee(application, channel)

                    showFolderHint()
                })
            .setNeutralButton(R.string.reject, DialogInterface.OnClickListener { dialog, which ->
                RetroUtil.dismissDialog(dialog)
                finish()
            })
            .setCancelable(false)
            .create();
        dialog.setCanceledOnTouchOutside(false)
        dialog.show()
    }

    private fun setupNavigationController() {


//        val navController = findNavController(R.id.fragment_container)
//        navController.navigatorProvider.addNavigator(
//            RouteFragmentNavigator(this, findNavHostFragment(R.id.fragment_container).childFragmentManager, R.id.fragment_container)
//        )
//
//        val navInflater = navController.navInflater
//        val navGraph = navInflater.inflate(R.navigation.main_graph)
//

        val fragmentStackManager = FragmentStackManager(supportFragmentManager)
        binding.fragmentContainer.tag = fragmentStackManager

        val categoryInfo: CategoryInfo = PreferenceUtil.libraryCategory.first { it.visible }

        val lastTabItem = PreferenceUtil.findCategory(PreferenceUtil.lastTab)

        val defaultTabItem = PreferenceUtil.findCategory(categoryInfo.categoryId)

        val id = if (PreferenceUtil.rememberLastTab && lastTabItem != null) {
            lastTabItem.id
        } else defaultTabItem?.id ?: CategoryInfo.Category.Home.id

        navigationView.selectedItemId = id

        toFragment(id)

        navigationView.setOnItemSelectedListener { item ->
            if (PreferenceUtil.rememberLastTab) {
                val categoryId = findCategoryId(item.itemId)
                if (categoryId != 0) saveTab(categoryId)
            }
            toFragment(item.itemId)
            true
        }
//
//        // Scroll Fragment to top
        navigationView.setOnItemReselectedListener {
           lastShowFragment.apply {
                if (this is IScrollHelper && this.isAdded) {
                    scrollToTop()
                }
            }
        }

        supportFragmentManager.registerFragmentLifecycleCallbacks(object : FragmentManager.FragmentLifecycleCallbacks() {
            override fun onFragmentResumed(fm: FragmentManager, f: Fragment) {
                super.onFragmentResumed(fm, f)
                if (f is AbsMainActivityFragment && navigationView.isLaidOut) {
                    if (f is HomeFragment || f is AlbumsFragment || f is SongsFragment || f is ArtistsFragment || f is PlaylistsFragment || f is GenresFragment) {
                        setBottomNavVisibility(visible = true, animate = true)
                    } else {
                        setBottomNavVisibility(visible = false, animate = true)
                    }
                }
            }
        }, false)

//        navController.addOnDestinationChangedListener { _, destination, _ ->
//            if (destination.id == navGraph.startDestinationId) {
//                currentFragment(R.id.fragment_container)?.enterTransition = null
//            }
//            when (destination.id) {
//                R.id.action_home, R.id.action_song, R.id.action_album, R.id.action_artist, R.id.action_playlist, R.id.action_genre -> {
//                    // Show Bottom Navigation Bar
//                    setBottomNavVisibility(visible = true, animate = true)
//                }
//                R.id.playing_queue_fragment -> {
//                    setBottomNavVisibility(visible = false, hideBottomSheet = true)
//                }
//                else -> setBottomNavVisibility(
//                    visible = false,
//                    animate = true
//                ) // Hide Bottom Navigation Bar
//            }
//        }


    }

    private fun toFragment(id: Int) {
        var showFragment = supportFragmentManager.findFragmentByTag(id.toString())
        if (showFragment == null) {
            showFragment = when (id) {
                R.id.action_home -> {
                    HomeFragment()
                }

                R.id.action_album -> {
                    AlbumsFragment()
                }

                R.id.action_song -> {
                    SongsFragment()
                }

                R.id.action_artist -> {
                    ArtistsFragment()
                }

                R.id.action_playlist -> {
                    PlaylistsFragment()
                }

                else -> {
                    HomeFragment()
                }
            }
        }
        val currentFragment: Fragment? = lastShowFragment

        val ft = supportFragmentManager.beginTransaction()
        if (currentFragment != null) {
            ft.hide(currentFragment)
            ft.setMaxLifecycle(currentFragment, Lifecycle.State.STARTED)
        }
        if (showFragment.isAdded) {
            logD(showFragment.javaClass.simpleName + " set resume")
            ft.setMaxLifecycle(showFragment, Lifecycle.State.RESUMED)
        } else {
            logD(showFragment.javaClass.simpleName + " add")
            ft.add(R.id.fragment_container, showFragment, id.toString())
        }
        ft.show(showFragment)
        ft.commit()
        lastShowFragment = showFragment
    }

    fun getLastFragment(): Fragment? {
        return lastShowFragment
    }

    private fun findCategoryId(menuId: Int): Int {
        for (item in PreferenceUtil.defaultItemCategories) {
            if (menuId == item.id) {
                return item.idHolder
            }
        }
        return 0
    }

    private fun saveTab(categoryId: Int) {
        if (PreferenceUtil.libraryCategory.firstOrNull { it.categoryId == categoryId }?.visible == true) {
            PreferenceUtil.lastTab = categoryId
        }
    }

//    override fun onSupportNavigateUp(): Boolean  {
//        findNavController(R.id.fragment_container).navigateUp()
//        return false
//    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        val expand = intent?.extra<Boolean>(EXPAND_PANEL)?.value ?: false
        if (expand && PreferenceUtil.isExpandPanel) {
            fromNotification = true
            slidingPanel.bringToFront()
            expandPanel()
            intent?.removeExtra(EXPAND_PANEL)
        }
    }

    override fun onServiceConnected() {
        super.onServiceConnected()
        intent ?: return
        handlePlaybackIntent(intent)
    }

    private fun handlePlaybackIntent(intent: Intent) {
        lifecycleScope.launch(IO) {
            val uri: Uri? = intent.data
            val mimeType: String? = intent.type
            var handled = false
            if (intent.action != null &&
                intent.action == MediaStore.INTENT_ACTION_MEDIA_PLAY_FROM_SEARCH
            ) {
                val songs: List<Song> = getSongs(intent.extras!!)
                if (MusicPlayerRemote.shuffleMode == MusicService.SHUFFLE_MODE_SHUFFLE) {
                    MusicPlayerRemote.openAndShuffleQueue(songs, true)
                } else {
                    MusicPlayerRemote.openQueue(songs, 0, true)
                }
                handled = true
            }
            if (uri != null && uri.toString().isNotEmpty()) {
                withContext(Dispatchers.Main) {
                    MusicPlayerRemote.playFromUri(this@MainActivity, uri)
                }
                handled = true
            } else if (MediaStore.Audio.Albums.CONTENT_TYPE == mimeType) {
                val id = parseLongFromIntent(intent, "albumId", "album")
                if (id >= 0L) {
                    val position: Int = intent.getIntExtra("position", 0)
                    lifecycleScope.launch(Dispatchers.IO) {
                        val album = libraryViewModel.albumById(id)
                        if (album != null) {
                            val songs = libraryViewModel.getAlbumSongs(album.id)
                            withContext(Dispatchers.Main) {
                                MusicPlayerRemote.openQueue(
                                    songs,
                                    position,
                                    true
                                )
                            }
                        }
                    }
                    handled = true
                }
            } else if (MediaStore.Audio.Artists.CONTENT_TYPE == mimeType) {
                val id = parseLongFromIntent(intent, "artistId", "artist")
                if (id != -1L) {
                    val position: Int = intent.getIntExtra("position", 0)
                    lifecycleScope.launch(Dispatchers.IO) {
                        val artist = libraryViewModel.artistById(id)
                        val songs = if (artist != null) {
                            libraryViewModel.getArtistSongs(artist.id)
                        } else {
                            emptyList()
                        }
                        withContext(Dispatchers.Main) {
                            MusicPlayerRemote.openQueue(
                                songs,
                                position,
                                true
                            )
                        }
                    }
                    handled = true
                }
            }
            if (handled) {
                setIntent(Intent())
            }
        }
    }

    private fun parseLongFromIntent(
        intent: Intent,
        longKey: String,
        stringKey: String,
    ): Long {
        var id = intent.getLongExtra(longKey, -1)
        if (id < 0) {
            val idString = intent.getStringExtra(stringKey)
            if (idString != null) {
                try {
                    id = idString.toLong()
                } catch (e: NumberFormatException) {
                    logE(e)
                }
            }
        }
        return id
    }

}
