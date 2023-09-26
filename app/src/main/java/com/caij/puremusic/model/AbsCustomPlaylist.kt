package com.caij.puremusic.model

import com.caij.puremusic.repository.SongRepository
import com.caij.puremusic.repository.TopPlayedRepository
import com.caij.puremusic.db.model.Song
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

abstract class AbsCustomPlaylist(
    id: Long,
    name: String
) : Playlist(id, name), KoinComponent {

    abstract fun songs(): List<Song>

    protected val songRepository by inject<SongRepository>()

    protected val topPlayedRepository by inject<TopPlayedRepository>()
}