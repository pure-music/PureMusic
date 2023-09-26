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
package com.caij.puremusic.dialogs

import android.app.Dialog
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.core.text.parseAsHtml
import androidx.fragment.app.DialogFragment
import com.caij.puremusic.EVENT_PLAY_LIST_SONGS_UPDATE
import com.caij.puremusic.EVENT_PLAY_LIST_UPDATE
import com.caij.puremusic.EXTRA_PLAYLIST
import com.caij.puremusic.EventBus
import com.caij.puremusic.R
import com.caij.puremusic.db.model.PlaylistEntity
import com.caij.puremusic.extensions.colorButtons
import com.caij.puremusic.extensions.extraNotNull
import com.caij.puremusic.extensions.materialDialog
import com.caij.puremusic.fragments.LibraryViewModel
import com.caij.puremusic.fragments.ReloadType
import com.caij.puremusic.util.GsonUtil
import com.google.gson.reflect.TypeToken
import org.eclipse.egit.github.core.client.GsonUtils
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class DeletePlaylistDialog : DialogFragment() {

    private val libraryViewModel by sharedViewModel<LibraryViewModel>()

    companion object {

        fun create(playlist: PlaylistEntity): DeletePlaylistDialog {
            val list = mutableListOf<PlaylistEntity>()
            list.add(playlist)
            return create(list)
        }

        fun create(playlists: List<PlaylistEntity>): DeletePlaylistDialog {
            return DeletePlaylistDialog().apply {
                arguments = bundleOf(EXTRA_PLAYLIST to GsonUtil.toJson(playlists))
            }
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val json = extraNotNull<String>(EXTRA_PLAYLIST).value
        val playlists = GsonUtil.fromJsonType<List<PlaylistEntity>>(json, object : TypeToken<List<PlaylistEntity>>(){}.type)
        val title: Int
        val message: CharSequence
        //noinspection ConstantConditions
        if (playlists.size > 1) {
            title = R.string.delete_playlists_title
            message = String.format(getString(R.string.delete_x_playlists), playlists.size).parseAsHtml()
        } else {
            title = R.string.delete_playlist_title
            message = String.format(getString(R.string.delete_playlist_x), playlists[0].playlistName).parseAsHtml()
        }

        return materialDialog(title)
            .setTitle(title)
            .setMessage(message)
            .setNegativeButton(android.R.string.cancel, null)
            .setPositiveButton(R.string.action_delete) { _, _ ->
                libraryViewModel.deleteSongsFromPlaylist(playlists)
                libraryViewModel.deleteRoomPlaylist(playlists)
                EventBus.post(EVENT_PLAY_LIST_UPDATE, null)
            }
            .create()
            .colorButtons()
    }
}
