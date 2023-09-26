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
package com.caij.puremusic.fragments.base

import android.annotation.SuppressLint
import android.app.Activity
import android.content.ContentUris
import android.content.Context
import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.drawable.AnimatedVectorDrawable
import android.media.MediaMetadataRetriever
import android.os.Bundle
import android.provider.MediaStore
import android.view.GestureDetector
import android.view.MenuItem
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.annotation.LayoutRes
import androidx.appcompat.widget.PopupMenu
import androidx.appcompat.widget.Toolbar
import androidx.core.os.bundleOf
import androidx.core.view.isVisible
import androidx.core.view.size
import androidx.lifecycle.lifecycleScope
import androidx.viewpager.widget.ViewPager
import code.name.monkey.appthemehelper.util.VersionUtils
import com.caij.puremusic.EVENT_PLAY_LIST_UPDATE
import com.caij.puremusic.EXTRA_ALBUM_ID
import com.caij.puremusic.EXTRA_ARTIST_ID
import com.caij.puremusic.EXTRA_SONG
import com.caij.puremusic.EventBus
import com.caij.puremusic.EventObserver
import com.caij.puremusic.R
import com.caij.puremusic.activities.HolderActivity
import com.caij.puremusic.activities.MainActivity
import com.caij.puremusic.activities.tageditor.AbsTagEditorActivity
import com.caij.puremusic.activities.tageditor.SongTagEditorActivityV2
import com.caij.puremusic.db.model.PlaylistEntity
import com.caij.puremusic.db.toSongEntity
import com.caij.puremusic.fragments.LibraryViewModel
import com.caij.puremusic.fragments.NowPlayingScreen
import com.caij.puremusic.fragments.ReloadType
import com.caij.puremusic.fragments.player.PlayerAlbumCoverFragment
import com.caij.puremusic.helper.MusicPlayerRemote
import com.caij.puremusic.interfaces.IPaletteColorHolder
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.repository.RealRepository
import com.caij.puremusic.service.MusicService
import com.caij.puremusic.util.NavigationUtil
import com.caij.puremusic.util.PreferenceUtil
import com.caij.puremusic.dialogs.*
import com.caij.puremusic.extensions.*
import com.caij.puremusic.fragments.albums.AlbumDetailsFragment
import com.caij.puremusic.fragments.artists.ArtistDetailsFragment
import com.caij.puremusic.fragments.lyrics.LyricsFragment
import com.caij.puremusic.fragments.queue.PlayingQueueFragment
import com.caij.puremusic.util.GsonUtil
import com.caij.puremusic.util.RingtoneManager
import com.google.android.material.bottomsheet.BottomSheetBehavior
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.koin.android.ext.android.get
import org.koin.androidx.viewmodel.ext.android.sharedViewModel
import kotlin.math.abs

abstract class AbsPlayerFragment(@LayoutRes layout: Int) : AbsMusicServiceFragment(layout),
    Toolbar.OnMenuItemClickListener, IPaletteColorHolder, PlayerAlbumCoverFragment.Callbacks, View.OnClickListener,
    PopupMenu.OnMenuItemClickListener {

    val libraryViewModel: LibraryViewModel by sharedViewModel()

    val mainActivity: MainActivity
        get() = activity as MainActivity

    private var playerAlbumCoverFragment: PlayerAlbumCoverFragment? = null

    override fun onClick(v: View) {
        val song = MusicPlayerRemote.currentSong
        when (v.id) {
            R.id.action_toggle_lyrics -> {
                PreferenceUtil.showLyrics = !PreferenceUtil.showLyrics
                showLyricsIcon(v as ImageButton)
                if (PreferenceUtil.lyricsScreenOn && PreferenceUtil.showLyrics) {
                    mainActivity.keepScreenOn(true)
                } else if (!PreferenceUtil.isScreenOnEnabled && !PreferenceUtil.showLyrics) {
                    mainActivity.keepScreenOn(false)
                }
            }
            R.id.action_toggle_favorite -> {
                toggleFavorite(song)
            }
            R.id.now_playing -> {
                startActivity(HolderActivity.starFragmentV4(requireActivity(), PlayingQueueFragment::class.java))
                requireActivity().overridePendingTransition(R.anim.activity_bottom_to_top, R.anim.activity_none)
            }
            R.id.action_show_lyrics -> {
                goToLyrics(requireActivity())
            }
            R.id.action_sleep_timer -> {
                SleepTimerDialog().show(parentFragmentManager, "SLEEP_TIMER")
            }
            R.id.action_more -> {
                val popupMenu = PopupMenu(requireContext(), v)
                popupMenu.setOnMenuItemClickListener(this)
                popupMenu.inflate(R.menu.menu_player)
                popupMenu.menu.findItem(R.id.action_sleep_timer).isVisible = false
                popupMenu.menu.findItem(R.id.action_toggle_favorite).isVisible = false
                popupMenu.menu.findItem(R.id.action_toggle_lyrics).isVisible = false
                popupMenu.menu.findItem(R.id.now_playing).isVisible = false
                popupMenu.menu.findItem(R.id.action_toggle_lyrics).isChecked = PreferenceUtil.showLyrics
                popupMenu.show()
            }
        }
    }

    fun tintChild(viewGroup: ViewGroup, color: Int) {
        for (i in 0 until viewGroup.size) {
            val imageView = viewGroup.getChildAt(i) as ImageView
            imageView.imageTintList = ColorStateList.valueOf(color)
        }
    }

    override fun onMenuItemClick(
        item: MenuItem,
    ): Boolean {
        val song = MusicPlayerRemote.currentSong
        when (item.itemId) {
            R.id.action_playback_speed -> {
                PlaybackSpeedDialog.newInstance().show(childFragmentManager, "PLAYBACK_SETTINGS")
                return true
            }
            R.id.action_toggle_lyrics -> {
                PreferenceUtil.showLyrics = !PreferenceUtil.showLyrics
                showLyricsIcon(item)
                view?.findViewById<ImageButton>(R.id.action_toggle_lyrics)?.let {
                    showLyricsIcon(it)
                }
                if (PreferenceUtil.lyricsScreenOn && PreferenceUtil.showLyrics) {
                    mainActivity.keepScreenOn(true)
                } else if (!PreferenceUtil.isScreenOnEnabled && !PreferenceUtil.showLyrics) {
                    mainActivity.keepScreenOn(false)
                }
                return true
            }
            R.id.action_go_to_lyrics -> {
                goToLyrics(requireActivity())
                return true
            }
            R.id.action_toggle_favorite -> {
                toggleFavorite(song)
                return true
            }
            R.id.action_share -> {
                SongShareDialog.create(song).show(childFragmentManager, "SHARE_SONG")
                return true
            }
            R.id.action_go_to_drive_mode -> {
                NavigationUtil.gotoDriveMode(requireActivity())
                return true
            }
            R.id.action_delete_from_device -> {
                DeleteSongsDialog.create(song).show(childFragmentManager, "DELETE_SONGS")
                return true
            }
            R.id.action_add_to_playlist -> {
                lifecycleScope.launch(IO) {
                    val playlists = get<RealRepository>().fetchPlaylists()
                    withContext(Main) {
                        AddToPlaylistDialog.create(playlists, song)
                            .show(childFragmentManager, "ADD_PLAYLIST")
                    }
                }
                return true
            }
            R.id.action_clear_playing_queue -> {
                MusicPlayerRemote.clearQueue()
                return true
            }
            R.id.action_save_playing_queue -> {
                CreatePlaylistDialog.create(ArrayList(MusicPlayerRemote.playingQueue))
                    .show(childFragmentManager, "ADD_TO_PLAYLIST")
                return true
            }
            R.id.action_tag_editor -> {
                val intent = Intent(activity, SongTagEditorActivityV2::class.java)
                intent.putExtra(AbsTagEditorActivity.EXTRA_ID, song.id)
                startActivity(intent)
                return true
            }
            R.id.action_details -> {
                SongDetailDialog.create(song).show(childFragmentManager, "SONG_DETAIL")
                return true
            }
            R.id.action_go_to_album -> {
                //Hide Bottom Bar First, else Bottom Sheet doesn't collapse fully
                mainActivity.setBottomNavVisibility(false)
                mainActivity.collapsePanel()

                val fragment = AlbumDetailsFragment()
                fragment.arguments = bundleOf(EXTRA_ALBUM_ID to song.albumId)
                mainActivity.openFragment(fragment)
                return true
            }
            R.id.action_go_to_artist -> {
                goToArtist(requireActivity())
                return true
            }
            R.id.now_playing -> {
//                val fragment = PlayingQueueFragment()
//                requireActivity().openFragmentContainerTop(fragment)
                startActivity(HolderActivity.Companion.starFragmentV4(requireActivity(), PlayingQueueFragment::class.java))
                requireActivity().overridePendingTransition(R.anim.activity_bottom_to_top, R.anim.activity_none)
                return true
            }
            R.id.action_show_lyrics -> {
                goToLyrics(requireActivity())
                return true
            }
            R.id.action_equalizer -> {
                NavigationUtil.openEqualizer(requireActivity())
                return true
            }
            R.id.action_sleep_timer -> {
                SleepTimerDialog().show(parentFragmentManager, "SLEEP_TIMER")
                return true
            }
            R.id.action_set_as_ringtone -> {
                if (song.isLocal) {
                    requireContext().run {
                        if (RingtoneManager.requiresDialog(this)) {
                            RingtoneManager.showDialog(this)
                        } else {
                            RingtoneManager.setRingtone(this, song)
                        }
                    }
                } else {
                    showToast(R.string.only_support_local_song)
                }
                return true
            }
            R.id.action_go_to_genre -> {
                if (song.isLocal) {
                    val retriever = MediaMetadataRetriever()
                    val trackUri =
                        ContentUris.withAppendedId(
                            MediaStore.Audio.Media.EXTERNAL_CONTENT_URI,
                            song.id
                        )
                    retriever.setDataSource(activity, trackUri)
                    var genre: String? =
                        retriever.extractMetadata(MediaMetadataRetriever.METADATA_KEY_GENRE)
                    if (genre == null) {
                        genre = "Not Specified"
                    }
                    showToast(genre)
                } else {
                    showToast(R.string.only_support_local_song)
                }
                return true
            }
        }
        return false
    }

    private fun showLyricsIcon(item: ImageButton) {
        val icon = if (PreferenceUtil.showLyrics) R.drawable.ic_lyrics else R.drawable.ic_lyrics_outline
        item.isSelected = PreferenceUtil.showLyrics
        item.setImageResource(icon)
    }

    private fun showLyricsIcon(item: MenuItem) {
        val icon =
            if (PreferenceUtil.showLyrics) R.drawable.ic_lyrics else R.drawable.ic_lyrics_outline
        val drawable = requireContext().getTintedDrawable(
            icon,
            toolbarIconColor()
        )
        item.isChecked = PreferenceUtil.showLyrics
        item.icon = drawable
    }

    abstract fun onShow()

    abstract fun onHide()

    abstract fun onBackPressed(): Boolean

    abstract fun toolbarIconColor(): Int

    override fun onServiceConnected() {
        updateIsFavorite()
    }

    override fun onPlayingMetaChanged() {
        updateIsFavorite()
    }

    override fun onFavoriteStateChanged() {
        updateIsFavorite(animate = true)
    }

    protected open fun toggleFavorite(song: Song) {
        lifecycleScope.launch(IO) {
            val playlist: PlaylistEntity = libraryViewModel.favoritePlaylist()
            val songEntity = song.toSongEntity(playlist.playListId)
            val isFavorite = libraryViewModel.isSongFavorite(song.id)
            if (isFavorite) {
                libraryViewModel.removeSongFromPlaylist(songEntity)
            } else {
                libraryViewModel.insertSongs(listOf(song.toSongEntity(playlist.playListId)))
            }
            EventBus.post(EVENT_PLAY_LIST_UPDATE)
            requireContext().sendBroadcast(Intent(MusicService.FAVORITE_STATE_CHANGED))
        }
    }

    fun updateIsFavorite(animate: Boolean = false) {
        lifecycleScope.launch(IO) {
            val isFavorite: Boolean =
                libraryViewModel.isSongFavorite(MusicPlayerRemote.currentSong.id)
            withContext(Main) {
                val icon = if (animate && VersionUtils.hasMarshmallow()) {
                    if (isFavorite) R.drawable.avd_favorite else R.drawable.avd_unfavorite
                } else {
                    if (isFavorite) R.drawable.ic_favorite else R.drawable.ic_favorite_border
                }
                val btnFavorite = view?.findViewById<ImageView>(R.id.action_toggle_favorite)
                btnFavorite?.apply {
                    setImageResource(icon)
                    contentDescription = if (isFavorite) getString(R.string.action_remove_from_favorites)
                    else getString(R.string.action_add_to_favorites)
                    drawable.also {
                        if (it is AnimatedVectorDrawable) {
                            it.start()
                        }
                    }
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (PreferenceUtil.circlePlayButton) {
            requireContext().theme.applyStyle(R.style.CircleFABOverlay, true)
        } else {
            requireContext().theme.applyStyle(R.style.RoundedFABOverlay, true)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (PreferenceUtil.isFullScreenMode &&
            view.findViewById<View>(R.id.status_bar) != null
        ) {
            view.findViewById<View>(R.id.status_bar).isVisible = false
        }
        playerAlbumCoverFragment = whichFragment(R.id.playerAlbumCoverFragment)
        playerAlbumCoverFragment?.setCallbacks(this)

        if (VersionUtils.hasMarshmallow())
            view.findViewById<RelativeLayout>(R.id.statusBarShadow)?.hide()
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onResume() {
        super.onResume()
        val nps = PreferenceUtil.nowPlayingScreen

        if (nps == NowPlayingScreen.Circle || nps == NowPlayingScreen.Peek || nps == NowPlayingScreen.Tiny) {
            view?.findViewById<View>(R.id.action_toggle_lyrics)?.hide()
        } else {
            view?.findViewById<View>(R.id.action_toggle_lyrics)?.apply {
                isSelected = PreferenceUtil.showLyrics
                showLyricsIcon(this as ImageButton)
            }
        }
    }

    override fun onStart() {
        super.onStart()
        addSwipeDetector()
    }

    fun addSwipeDetector() {
        view?.setOnTouchListener(
            if (PreferenceUtil.swipeAnywhereToChangeSong) {
                SwipeDetector(
                    requireContext(),
                    playerAlbumCoverFragment?.viewPager,
                    requireView()
                )
            } else null
        )
    }

    class SwipeDetector(val context: Context, val viewPager: ViewPager?, val view: View) :
        View.OnTouchListener {
        private var flingPlayBackController: GestureDetector = GestureDetector(
            context,
            object : GestureDetector.SimpleOnGestureListener() {
                override fun onScroll(
                    e1: MotionEvent,
                    e2: MotionEvent,
                    distanceX: Float,
                    distanceY: Float,
                ): Boolean {
                    return when {
                        abs(distanceX) > abs(distanceY) -> {
                            // Disallow Intercept Touch Event so that parent(BottomSheet) doesn't consume the events
                            view.parent.requestDisallowInterceptTouchEvent(true)
                            true
                        }
                        else -> {
                            false
                        }
                    }
                }
            })

        @SuppressLint("ClickableViewAccessibility")
        override fun onTouch(v: View, event: MotionEvent): Boolean {
            viewPager?.dispatchTouchEvent(event)
            return flingPlayBackController.onTouchEvent(event)
        }
    }

    companion object {
        val TAG: String = AbsPlayerFragment::class.java.simpleName
        const val VISIBILITY_ANIM_DURATION: Long = 300
    }
}

fun goToArtist(activity: Activity) {
    if (activity !is MainActivity) return
    val song = MusicPlayerRemote.currentSong
    activity.apply {

        // Remove exit transition of current fragment so
        // it doesn't exit with a weird transition
//        currentFragment(R.id.fragment_container)?.exitTransition = null

        //Hide Bottom Bar First, else Bottom Sheet doesn't collapse fully
        setBottomNavVisibility(false)
        if (getBottomSheetBehavior().state == BottomSheetBehavior.STATE_EXPANDED) {
            collapsePanel()
        }

        val fragment = ArtistDetailsFragment()
        fragment.arguments = bundleOf(EXTRA_ARTIST_ID to song.firstArtistId)
        openFragment(fragment)
    }
}

fun goToAlbum(activity: Activity) {
    if (activity !is MainActivity) return
    val song = MusicPlayerRemote.currentSong
    activity.apply {
//        currentFragment(R.id.fragment_container)?.exitTransition = null

        //Hide Bottom Bar First, else Bottom Sheet doesn't collapse fully
        setBottomNavVisibility(false)
        if (getBottomSheetBehavior().state == BottomSheetBehavior.STATE_EXPANDED) {
            collapsePanel()
        }

        val fragment = AlbumDetailsFragment()
        fragment.arguments = bundleOf(EXTRA_ALBUM_ID to song.albumId)
        openFragment(fragment)
    }
}

fun goToLyrics(activity: Activity) {
    if (activity !is MainActivity) return
    activity.apply {
//        val fragment = LyricsFragment()
//        openFragmentContainerTop(fragment)
        startActivity(HolderActivity.starFragmentV4(this, LyricsFragment::class.java, bundleOf(
            EXTRA_SONG to GsonUtil.toJson(MusicPlayerRemote.currentSong)
        )))
        overridePendingTransition(R.anim.activity_bottom_to_top, R.anim.activity_none)
    }
}