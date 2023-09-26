package com.caij.puremusic.interfaces

import android.view.View
import com.caij.puremusic.model.PlaylistWrapper
import com.caij.puremusic.db.model.Song

interface IPlaylistClickListener {
    fun onPlaylistClick(playlistWithSongs: PlaylistWrapper, view: View)
    fun getPlaylistSongs(playListId: Long): Collection<Song>
}