///*
// * Copyright (c) 2019 Hemanth Savarala.
// *
// * Licensed under the GNU General Public License v3
// *
// * This is free software: you can redistribute it and/or modify it under
// * the terms of the GNU General Public License as published by
// *  the Free Software Foundation either version 3 of the License, or (at your option) any later version.
// *
// * This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
// * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
// * See the GNU General Public License for more details.
// */
//package com.caij.puremusic.model
//
//import android.os.Parcelable
//import androidx.room.ColumnInfo
//import androidx.room.Entity
//import androidx.room.PrimaryKey
//import com.caij.puremusic.drive.DriveFactory
//import kotlinx.parcelize.Parcelize
//
//// update equals and hashcode if fields changes
//@Parcelize
//@Entity
//open class Song(
//    @PrimaryKey
//    open val id: String,
//    open val longId: Long,
//    open var title: String,
//    @ColumnInfo(name = "track_number")
//    open var trackNumber: Int,
//    open var year: Int,
//    open var duration: Long,
//    open val data: String,
//    @ColumnInfo(name = "date_modified")
//    open val dateModified: Long,
//    @ColumnInfo(name = "album_id")
//    open var albumId: Long,
//    @ColumnInfo(name = "album_name")
//    open var albumName: String,
//    @ColumnInfo(name = "artist_id")
//    open var artistId: String,
//    @ColumnInfo(name = "artist_name")
//    open var artistName: String,
//    open var composer: String?,
//    @ColumnInfo(name = "album_artist")
//    open var albumArtist: String?,
//    @ColumnInfo(name = "date_added")
//    open val dateAdded: Long,
//    @ColumnInfo(name = "source_type")
//    open val sourceType: Int,
//    @ColumnInfo(name = "source_id")
//    open val sourceId: Long,
//    open val size: Long
//) : Parcelable {
//
//    // need to override manually because is open and cannot be a data class
//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (javaClass != other?.javaClass) return false
//
//        other as Song
//
//        if (id != other.id) return false
//        if (title != other.title) return false
//        if (trackNumber != other.trackNumber) return false
//        if (year != other.year) return false
//        if (duration != other.duration) return false
//        if (data != other.data) return false
//        if (dateModified != other.dateModified) return false
//        if (albumId != other.albumId) return false
//        if (albumName != other.albumName) return false
//        if (artistId != other.artistId) return false
//        if (artistName != other.artistName) return false
//        if (composer != other.composer) return false
//        if (albumArtist != other.albumArtist) return false
//        if (sourceType != other.sourceType) return false
//        if (sourceId != other.sourceId) return false
//
//        return true
//    }
//
//    override fun hashCode(): Int {
//        var result = id.hashCode()
//        result = 31 * result + title.hashCode()
//        result = 31 * result + trackNumber
//        result = 31 * result + year
//        result = 31 * result + duration.hashCode()
//        result = 31 * result + data.hashCode()
//        result = 31 * result + dateModified.hashCode()
//        result = 31 * result + albumId.hashCode()
//        result = 31 * result + albumName.hashCode()
//        result = 31 * result + artistId.hashCode()
//        result = 31 * result + artistName.hashCode()
//        result = 31 * result + (composer?.hashCode() ?: 0)
//        result = 31 * result + (albumArtist?.hashCode() ?: 0)
//        result = 31 * result + sourceType.hashCode()
//        result = 31 * result + sourceId.hashCode()
//        return result
//    }
//
//
//    companion object {
//
//        const val DEFAULT_ARTIST = "unknown"
//
//        @JvmStatic
//        val emptySong = Song(
//            id = "",
//            longId = -1,
//            title = "",
//            trackNumber = -1,
//            year = -1,
//            duration = -1,
//            data = "",
//            dateModified = -1,
//            albumId = -1,
//            albumName = "",
//            artistId = "",
//            artistName = "",
//            composer = "",
//            albumArtist = "",
//            dateAdded = 0L,
//            DriveFactory.TYPE_INNER,
//            0,
//            0
//        )
//    }
//}