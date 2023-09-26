package com.caij.puremusic.interfaces

import com.caij.puremusic.db.model.Artist
import com.caij.puremusic.model.Genre
import com.caij.puremusic.db.model.Album

interface IHomeClickListener {
    fun onAlbumClick(album: Album)

    fun onArtistClick(artist: Artist)

    fun onGenreClick(genre: Genre)
}