package com.caij.puremusic.repository

import android.content.Context
import android.database.Cursor
import android.os.Environment
import android.provider.MediaStore
import code.name.monkey.appthemehelper.util.VersionUtils
import com.caij.puremusic.Constants
import com.caij.puremusic.drive.DriveFactory
import com.caij.puremusic.extensions.getInt
import com.caij.puremusic.extensions.getLong
import com.caij.puremusic.extensions.getString
import com.caij.puremusic.extensions.getStringOrNull
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.extensions.toLongId
import com.caij.puremusic.providers.BlacklistStore
import com.caij.puremusic.util.BaseSongUtil
import com.caij.puremusic.util.PreferenceUtil
import com.caij.puremusic.util.getExternalStoragePublicDirectory

class LocalSongsUtil(val context: Context) {


    fun songs(): List<Song> {
        return songs(makeSongCursor(null, null))
    }

    fun songs(cursor: Cursor?): List<Song> {
        val songs = arrayListOf<Song>()
        if (cursor != null && cursor.moveToFirst()) {
            do {
                songs.add(getSongFromCursorImpl(cursor))
            } while (cursor.moveToNext())
        }
        cursor?.close()
        return songs
    }

    fun song(cursor: Cursor?): Song {
        val song: Song = if (cursor != null && cursor.moveToFirst()) {
            getSongFromCursorImpl(cursor)
        } else {
            BaseSongUtil.emptySong
        }
        cursor?.close()
        return song
    }

    fun songs(query: String): List<Song> {
        return songs(makeSongCursor(MediaStore.Audio.AudioColumns.TITLE + " LIKE ?", arrayOf("%$query%")))
    }

    fun song(songId: Long): Song {
        return song(makeSongCursor(MediaStore.Audio.AudioColumns._ID + "=?", arrayOf(songId.toString())))
    }

    fun songsByFilePath(filePath: String, ignoreBlacklist: Boolean): List<Song> {
        return songs(
            makeSongCursor(
                Constants.DATA + "=?",
                arrayOf(filePath),
                ignoreBlacklist = ignoreBlacklist
            )
        )
    }

    private fun getSongFromCursorImpl(
        cursor: Cursor
    ): Song {
        val id = cursor.getLong(MediaStore.Audio.AudioColumns._ID)
        var title = cursor.getString(MediaStore.Audio.AudioColumns.TITLE)
        var trackNumber = cursor.getInt(MediaStore.Audio.AudioColumns.TRACK)
        val year = cursor.getInt(MediaStore.Audio.AudioColumns.YEAR)
        val duration = cursor.getLong(MediaStore.Audio.AudioColumns.DURATION)
        val data = cursor.getString(Constants.DATA)
        val dateModified = cursor.getLong(MediaStore.Audio.AudioColumns.DATE_MODIFIED)
        val albumId = cursor.getLong(MediaStore.Audio.AudioColumns.ALBUM_ID)
        val albumName = cursor.getStringOrNull(MediaStore.Audio.AudioColumns.ALBUM)
        val artistId = cursor.getLong(MediaStore.Audio.AudioColumns.ARTIST_ID)
        var artistName = cursor.getStringOrNull(MediaStore.Audio.AudioColumns.ARTIST)
        val composer = cursor.getStringOrNull(MediaStore.Audio.AudioColumns.COMPOSER)
        var albumArtist = cursor.getStringOrNull("album_artist")
        val dateAdded = cursor.getLong(MediaStore.Audio.AudioColumns.DATE_ADDED)
        val size = cursor.getLong(MediaStore.Audio.AudioColumns.SIZE)

//        if (title.contains("-")) {
//            val pair = BaseSongUtil.parseArtistInfo(title)
//            val artistNameParse = pair.artist
//            val artistIdStrParse = pair.artistId
//            title = pair.name
//            if (pair.trackNumber > 0) {
//                trackNumber = pair.trackNumber
//            }
//
//            if (!artistNameParse.isNullOrEmpty()) {
//                artistName = artistNameParse
//                artistIdStr = artistIdStrParse
//            }
//        }

        if (artistName.isNullOrEmpty() || artistName == "<unknown>") {
            artistName = BaseSongUtil.DEFAULT_ARTIST
        }

        if (albumArtist.isNullOrEmpty()) {
            albumArtist = artistName
        }

        val artistIdStr: String = BaseSongUtil.getArtistId(artistName).toString()

        return Song(
            id,
            title,
            trackNumber,
            year,
            duration,
            data,
            data,
            dateModified,
            albumId,
            albumName ?: "",
            artistIdStr,
            artistName,
            composer ?: "",
            albumArtist ?: "",
            dateAdded,
            DriveFactory.TYPE_INNER,
            DriveFactory.ID_LOCAL,
            size
        )
    }

    @JvmOverloads
    fun makeSongCursor(
        selection: String?,
        selectionValues: Array<String>?,
        sortOrder: String = PreferenceUtil.songSortOrder,
        ignoreBlacklist: Boolean = false
    ): Cursor? {
        var selectionFinal = selection
        var selectionValuesFinal = selectionValues
        if (!ignoreBlacklist) {
            selectionFinal = if (selection != null && selection.trim { it <= ' ' } != "") {
                "${Constants.IS_MUSIC} AND $selectionFinal"
            } else {
                Constants.IS_MUSIC
            }

            // Whitelist
            if (PreferenceUtil.isWhiteList) {
                selectionFinal =
                    selectionFinal + " AND " + Constants.DATA + " LIKE ?"
                selectionValuesFinal = addSelectionValues(
                    selectionValuesFinal, arrayListOf(
                        getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC).canonicalPath
                    )
                )
            } else {
                // Blacklist
                val paths = BlacklistStore.getInstance(context).paths
                if (paths.isNotEmpty()) {
                    selectionFinal = generateBlacklistSelection(selectionFinal, paths.size)
                    selectionValuesFinal = addSelectionValues(selectionValuesFinal, paths)
                }
            }

            selectionFinal =
                selectionFinal + " AND " + MediaStore.Audio.Media.DURATION + ">= " + (PreferenceUtil.filterLength * 1000)
        }
        val uri = if (VersionUtils.hasQ()) {
            MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
        } else {
            MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
        }
        return try {
            context.contentResolver.query(
                uri,
                Constants.baseProjection,
                selectionFinal,
                selectionValuesFinal,
                sortOrder
            )
        } catch (ex: SecurityException) {
            return null
        }
    }

    private fun generateBlacklistSelection(
        selection: String?,
        pathCount: Int
    ): String {
        val newSelection = StringBuilder(
            if (selection != null && selection.trim { it <= ' ' } != "") "$selection AND " else "")
        newSelection.append(Constants.DATA + " NOT LIKE ?")
        for (i in 0 until pathCount - 1) {
            newSelection.append(" AND " + Constants.DATA + " NOT LIKE ?")
        }
        return newSelection.toString()
    }

    private fun addSelectionValues(
        selectionValues: Array<String>?,
        paths: ArrayList<String>
    ): Array<String> {
        var selectionValuesFinal = selectionValues
        if (selectionValuesFinal == null) {
            selectionValuesFinal = emptyArray()
        }
        val newSelectionValues = Array(selectionValuesFinal.size + paths.size) {
            "n = $it"
        }
        System.arraycopy(selectionValuesFinal, 0, newSelectionValues, 0, selectionValuesFinal.size)
        for (i in selectionValuesFinal.size until newSelectionValues.size) {
            newSelectionValues[i] = paths[i - selectionValuesFinal.size] + "%"
        }
        return newSelectionValues
    }

}