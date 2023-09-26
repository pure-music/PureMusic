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
package com.caij.puremusic.helper.menu

import android.content.Intent
import android.view.MenuItem
import android.view.View
import androidx.appcompat.widget.PopupMenu
import androidx.core.os.bundleOf
import androidx.fragment.app.FragmentActivity
import com.caij.puremusic.EVENT_SONGS_UPDATE
import com.caij.puremusic.EXTRA_ALBUM_ID
import com.caij.puremusic.EXTRA_ARTIST_ID
import com.caij.puremusic.EXTRA_PLAYLIST
import com.caij.puremusic.EventBus
import com.caij.puremusic.R
import com.caij.puremusic.activities.tageditor.AbsTagEditorActivity
import com.caij.puremusic.activities.tageditor.SongTagEditorActivityV2
import com.caij.puremusic.db.SongEntityWrapper
import com.caij.puremusic.dialogs.AddToPlaylistDialog
import com.caij.puremusic.dialogs.DeleteSongsDialog
import com.caij.puremusic.dialogs.SongDetailDialog
import com.caij.puremusic.extensions.firstArtistId
import com.caij.puremusic.extensions.isLocal
import com.caij.puremusic.extensions.showToast
import com.caij.puremusic.fragments.LibraryViewModel
import com.caij.puremusic.fragments.ReloadType
import com.caij.puremusic.helper.MusicPlayerRemote
import com.caij.puremusic.interfaces.IPaletteColorHolder
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.dialogs.RemoveSongFromPlaylistDialog
import com.caij.puremusic.extensions.openFragment
import com.caij.puremusic.fragments.albums.AlbumDetailsFragment
import com.caij.puremusic.fragments.artists.ArtistDetailsFragment
import com.caij.puremusic.fragments.playlists.PlaylistDetailsFragment
import com.caij.puremusic.providers.BlacklistStore
import com.caij.puremusic.repository.RealRepository
import com.caij.puremusic.util.MusicUtil
import com.caij.puremusic.util.RingtoneManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.get
import java.io.File

object SongMenuHelper : KoinComponent {
    const val MENU_RES = R.menu.menu_item_song

    fun handleMenuClick(activity: FragmentActivity, song: Song, menuItemId: Int): Boolean {
        val libraryViewModel = activity.getViewModel() as LibraryViewModel
        when (menuItemId) {
            R.id.action_set_as_ringtone -> {
                if (song.isLocal) {
                    if (RingtoneManager.requiresDialog(activity)) {
                        RingtoneManager.showDialog(activity)
                    } else {
                        RingtoneManager.setRingtone(activity, song)
                    }
                } else {
                    activity.showToast(R.string.only_support_local_song)
                }
                return true
            }
            R.id.action_share -> {
                if (song.isLocal) {
                    activity.startActivity(
                        Intent.createChooser(
                            MusicUtil.createShareSongFileIntent(activity, song),
                            null
                        )
                    )
                } else {
                    activity.showToast(R.string.only_support_local_song)
                }
                return true
            }
            R.id.action_delete_from_device -> {
                DeleteSongsDialog.create(song).show(activity.supportFragmentManager, "DELETE_SONGS")
                return true
            }
            R.id.action_add_to_playlist -> {
                CoroutineScope(Dispatchers.IO).launch {
                    val playlists = get<RealRepository>().fetchPlaylists()
                    withContext(Dispatchers.Main) {
                        AddToPlaylistDialog.create(playlists, song)
                            .show(activity.supportFragmentManager, "ADD_PLAYLIST")
                    }
                }
                return true
            }
            R.id.action_play_next -> {
                MusicPlayerRemote.playNext(song)
                return true
            }
            R.id.action_add_to_current_playing -> {
                MusicPlayerRemote.enqueue(song)
                return true
            }
            R.id.action_tag_editor -> {
                val tagEditorIntent = Intent(activity, SongTagEditorActivityV2::class.java)
                tagEditorIntent.putExtra(AbsTagEditorActivity.EXTRA_ID, song.id)
                if (activity is IPaletteColorHolder)
                    tagEditorIntent.putExtra(
                        AbsTagEditorActivity.EXTRA_PALETTE,
                        (activity as IPaletteColorHolder).paletteColor
                    )
                activity.startActivity(tagEditorIntent)
                return true
            }
            R.id.action_details -> {
                SongDetailDialog.create(song).show(activity.supportFragmentManager, "SONG_DETAILS")
                return true
            }
            R.id.action_go_to_album -> {
                val fragment = AlbumDetailsFragment()
                fragment.arguments = bundleOf(EXTRA_ALBUM_ID to song.albumId)
                activity.openFragment(fragment)
                return true
            }
            R.id.action_go_to_artist -> {
                val fragment = ArtistDetailsFragment()
                fragment.arguments = bundleOf(EXTRA_ARTIST_ID to song.firstArtistId)
                activity.openFragment(fragment)
                return true
            }
            R.id.action_add_to_blacklist -> {
                BlacklistStore.getInstance(activity).addPath(File(song.url))
                EventBus.post(EVENT_SONGS_UPDATE)
                return true
            }
        }
        return false
    }

    abstract class OnClickSongMenu(private val activity: FragmentActivity) :
        View.OnClickListener, PopupMenu.OnMenuItemClickListener {

        open val menuRes: Int
            get() = MENU_RES

        abstract val song: Song

        override fun onClick(v: View) {
            val popupMenu = PopupMenu(activity, v)
            popupMenu.inflate(menuRes)
            popupMenu.setOnMenuItemClickListener(this)
            popupMenu.show()
        }

        override fun onMenuItemClick(item: MenuItem): Boolean {
            return handleMenuClick(activity, song, item.itemId)
        }
    }
}
