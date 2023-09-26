package com.caij.puremusic.util

import com.caij.puremusic.helper.SortOrder
import com.caij.puremusic.db.model.Artist
import com.caij.puremusic.db.model.Song
import java.text.Collator

object ArtistUtil {

    fun sortedSongs(songs: List<Song>): List<Song> {
        val collator = Collator.getInstance()
        return songs.sortedWith(
            when (PreferenceUtil.artistDetailSongSortOrder) {
                SortOrder.ArtistSongSortOrder.SONG_A_Z -> { o1, o2 ->
                    collator.compare(o1.title, o2.title)
                }
                SortOrder.ArtistSongSortOrder.SONG_Z_A -> { o1, o2 ->
                    collator.compare(o2.title, o1.title)
                }
                SortOrder.ArtistSongSortOrder.SONG_ALBUM -> { o1, o2 ->
                    collator.compare(o1.albumName, o2.albumName)
                }
                SortOrder.ArtistSongSortOrder.SONG_YEAR -> { o1, o2 ->
                    o2.year.compareTo(
                        o1.year
                    )
                }
                SortOrder.ArtistSongSortOrder.SONG_DURATION -> { o1, o2 ->
                    o1.duration.compareTo(
                        o2.duration
                    )
                }
                else -> {
                    throw IllegalArgumentException("invalid ${PreferenceUtil.artistDetailSongSortOrder}")
                }
            })
    }

    fun sortArtists(artists: List<Artist>): List<Artist> {
        val collator = Collator.getInstance()
        return when (PreferenceUtil.artistSortOrder) {
            SortOrder.ArtistSortOrder.ARTIST_A_Z -> {
                artists.sortedWith { a1, a2 -> collator.compare(a1.name, a2.name) }
            }
            SortOrder.ArtistSortOrder.ARTIST_Z_A -> {
                artists.sortedWith { a1, a2 -> collator.compare(a2.name, a1.name) }
            }
            else -> artists
        }
    }

    fun splitIntoArtists(songs: List<Song>): List<Artist> {
        val data = ArrayList<Artist>()
        for (song in songs) {
            splitIntoArtists(data, song)
        }
        return data
    }

    fun splitIntoArtists(song: Song): List<Artist> {
        val data = ArrayList<Artist>()
        splitIntoArtists(data, song)
        return data
    }


    private fun splitIntoArtists(data: ArrayList<Artist>, song: Song) {
        splitIntoArtists(data, song.artistId, song.artistName)
    }

    fun splitIntoArtists(data: ArrayList<Artist>, artistId: String, artistName: String) {
        if (artistId.contains(",") || artistId.contains("&")) {
            val aids = artistId.split(",", "&")
            val anames = artistName.split(",", "&")
            for (index in aids.indices) {
                val aid = aids[index]
                val aname = anames[index]
                val laid = aid.toLong()
                if (!contains(laid, data)) {
                    val artist = Artist(laid, aname)
                    data.add(artist)
                }
            }
        } else {
            val laid = artistId.toLong()
            if (!contains(laid, data)) {
                val artist = Artist(laid, artistName)
                data.add(artist)
            }
        }
    }

    fun contains(aid: Long, artists: List<Artist>): Boolean {
        for (a in artists) {
            if (a.id == aid) return true
        }
        return false
    }
}