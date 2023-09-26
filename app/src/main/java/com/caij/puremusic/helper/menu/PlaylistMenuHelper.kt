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

import android.view.MenuItem
import androidx.fragment.app.FragmentActivity
import com.caij.puremusic.R
import com.caij.puremusic.db.model.PlaylistEntity
import com.caij.puremusic.dialogs.AddToPlaylistDialog
import com.caij.puremusic.dialogs.DeletePlaylistDialog
import com.caij.puremusic.dialogs.RenamePlaylistDialog
import com.caij.puremusic.helper.MusicPlayerRemote
import com.caij.puremusic.repository.RealRepository
import kotlinx.coroutines.*
import org.koin.core.component.KoinComponent
import org.koin.core.component.get

object PlaylistMenuHelper : KoinComponent {

    fun handleMenuClick(
        activity: FragmentActivity,
        playlistWithSongs: PlaylistEntity,
        item: MenuItem
    ): Boolean {
        when (item.itemId) {
            R.id.action_play -> {
                GlobalScope.launch(Dispatchers.IO) {
                    val songs = get<RealRepository>().getPlayListSongs(playlistWithSongs.playListId)
                    withContext(Dispatchers.Main) {
                        MusicPlayerRemote.openQueue(songs, 0, true)
                    }
                }
                return true
            }
            R.id.action_play_next -> {
                GlobalScope.launch(Dispatchers.IO) {
                    val songs = get<RealRepository>().getPlayListSongs(playlistWithSongs.playListId)
                    withContext(Dispatchers.Main) {
                        MusicPlayerRemote.playNext(songs)
                    }
                }
                return true
            }
            R.id.action_add_to_playlist -> {
                CoroutineScope(Dispatchers.IO).launch {
                    val playlists = get<RealRepository>().fetchPlaylists()
                    val songs = get<RealRepository>().getPlayListSongs(playlistWithSongs.playListId)
                    withContext(Dispatchers.Main) {
                        AddToPlaylistDialog.create(playlists, songs)
                            .show(activity.supportFragmentManager, "ADD_PLAYLIST")
                    }
                }
                return true
            }
            R.id.action_add_to_current_playing -> {
                GlobalScope.launch(Dispatchers.IO) {
                    val songs = get<RealRepository>().getPlayListSongs(playlistWithSongs.playListId)
                    withContext(Dispatchers.Main) {
                        MusicPlayerRemote.enqueue(songs)
                    }
                }
                return true
            }
            R.id.action_rename_playlist -> {
                RenamePlaylistDialog.create(playlistWithSongs)
                    .show(activity.supportFragmentManager, "RENAME_PLAYLIST")
                return true
            }
            R.id.action_delete_playlist -> {
                DeletePlaylistDialog.create(playlistWithSongs)
                    .show(activity.supportFragmentManager, "DELETE_PLAYLIST")
                return true
            }
//            R.id.action_save_playlist -> {
//                SavePlaylistDialog.create(playlistWithSongs)
//                    .show(activity.supportFragmentManager, "SavePlaylist")
//                return true
//            }
        }
        return false
    }
}
