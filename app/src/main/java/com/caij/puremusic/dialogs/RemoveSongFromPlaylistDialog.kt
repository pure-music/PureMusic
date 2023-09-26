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
import com.caij.puremusic.EXTRA_SONG
import com.caij.puremusic.R
import com.caij.puremusic.db.model.SongEntity
import com.caij.puremusic.db.SongEntityWrapper
import com.caij.puremusic.db.toSongEntity
import com.caij.puremusic.extensions.colorButtons
import com.caij.puremusic.extensions.extraNotNull
import com.caij.puremusic.extensions.materialDialog
import com.caij.puremusic.fragments.LibraryViewModel
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class RemoveSongFromPlaylistDialog : DialogFragment() {
    private val libraryViewModel by sharedViewModel<LibraryViewModel>()

    companion object {
        fun create(song: SongEntityWrapper): RemoveSongFromPlaylistDialog {
            val list = mutableListOf<SongEntityWrapper>()
            list.add(song)
            return create(list)
        }

        fun create(songs: List<SongEntityWrapper>): RemoveSongFromPlaylistDialog {
            return RemoveSongFromPlaylistDialog().apply {
                arguments = bundleOf(
                    EXTRA_SONG to songs
                )
            }
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val songs = extraNotNull<List<SongEntityWrapper>>(EXTRA_SONG).value
        val pair = if (songs.size > 1) {
            Pair(
                R.string.remove_songs_from_playlist_title,
                String.format(getString(R.string.remove_x_songs_from_playlist), songs.size)
                    .parseAsHtml()
            )
        } else {
            Pair(
                R.string.remove_song_from_playlist_title,
                String.format(
                    getString(R.string.remove_song_x_from_playlist),
                    songs[0].song.title
                ).parseAsHtml()
            )
        }
        return materialDialog(pair.first)
            .setMessage(pair.second)
            .setPositiveButton(R.string.remove_action) { _, _ ->
                val playListSongs = ArrayList<SongEntity>()
                songs.forEach {
                    playListSongs.add(it.song.toSongEntity(it.playlistCreatorId))
                }
                libraryViewModel.deleteSongsInPlaylistWithNofify(playListSongs)
            }
            .setNegativeButton(android.R.string.cancel, null)
            .create()
            .colorButtons()
    }
}
