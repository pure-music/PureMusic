package com.caij.puremusic.util

import androidx.annotation.WorkerThread
import com.caij.puremusic.ThreadManager
import com.caij.puremusic.db.DatabaseUtil
import com.caij.puremusic.db.model.Album
import com.caij.puremusic.db.model.ServerAudioFormat
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.drive.DriveFactory
import com.caij.puremusic.helper.SortOrder
import com.google.android.exoplayer2.Format
import java.text.Collator

object AlbumUtil {

    fun rateSong(song: Song, audioFormat: Format, type: String) {
        ThreadManager.getInstance().DISK_IO_EXECUTOR.execute(Runnable {
            if (song.duration > 0 && DatabaseUtil.pureMusicDatabase.serverAudioFormatDao()
                    .get(song.id) == null
            ) {
                val bitrate: String
                var sampleRate: String = audioFormat.sampleRate.toString()
                if (audioFormat.bitrate == Format.NO_VALUE) {
                    bitrate = (song.size * 1f / (song.duration * 1f / 1000f) * 8 / 1006).toInt()
                        .toString()
                } else {
                    bitrate = audioFormat.bitrate.toString()
                    sampleRate = audioFormat.sampleRate.toString()
                }

                val serverAudioFormat = ServerAudioFormat(
                    song.id, song.sourceId, bitrate, sampleRate, type
                )
                logD(serverAudioFormat.toString())
                DatabaseUtil.pureMusicDatabase.serverAudioFormatDao()
                    .insert(serverAudioFormat)
            }
        })
    }

    @WorkerThread
    public fun isOnlyServer(id: Long): Boolean {
        return DatabaseUtil.pureMusicDatabase.songDao().songsByAlbumIdCount(id, DriveFactory.TYPE_INNER) == 0
    }

    public fun findFirstSong(id: Long, type: Int): Song? {
        return DatabaseUtil.pureMusicDatabase.songDao().firstSongByAlbumId(id, type)
    }

    fun sortAlbumSongs(songs: List<Song>): List<Song> {
        val collator = Collator.getInstance()
        val songs = when (PreferenceUtil.albumDetailSongSortOrder) {
            SortOrder.AlbumSongSortOrder.SONG_TRACK_LIST -> songs.sortedWith { o1, o2 ->
                o1.trackNumber.compareTo(o2.trackNumber)
            }
            SortOrder.AlbumSongSortOrder.SONG_A_Z -> {
                songs.sortedWith { o1, o2 -> collator.compare(o1.title, o2.title) }
            }
            SortOrder.AlbumSongSortOrder.SONG_Z_A -> {
                songs.sortedWith { o1, o2 -> collator.compare(o2.title, o1.title) }
            }
            SortOrder.AlbumSongSortOrder.SONG_DURATION -> songs.sortedWith { o1, o2 ->
                o1.duration.compareTo(o2.duration)
            }
            else -> throw IllegalArgumentException("invalid ${PreferenceUtil.albumDetailSongSortOrder}")
        }
        return songs
    }

    fun sort(grouped: List<Album>): List<Album> {
        val collator = Collator.getInstance()
        return when (PreferenceUtil.albumSortOrder) {
            SortOrder.AlbumSortOrder.ALBUM_A_Z -> {
                grouped.sortedWith { a1, a2 -> collator.compare(a1.albumName, a2.albumName) }
            }
            SortOrder.AlbumSortOrder.ALBUM_Z_A -> {
                grouped.sortedWith { a1, a2 -> collator.compare(a2.albumName, a1.albumName) }
            }
            SortOrder.AlbumSortOrder.ALBUM_ARTIST -> {
                grouped.sortedWith { a1, a2 -> collator.compare(a1.albumName, a2.albumName) }
            }
            SortOrder.AlbumSortOrder.ALBUM_NUMBER_OF_SONGS -> {
                grouped.sortedByDescending { it.songCount }
            }
            else -> grouped
        }
    }
}