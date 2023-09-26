package com.caij.puremusic.extensions

import android.net.Uri
import android.support.v4.media.MediaDescriptionCompat
import android.support.v4.media.session.MediaSessionCompat.QueueItem
import com.caij.puremusic.repository.SongUtil
import com.caij.puremusic.util.MusicUtil
import com.caij.puremusic.util.SongAuthUtil
import com.google.android.exoplayer2.MediaMetadata
import com.caij.puremusic.db.model.Song

val Song.url: String get() = SongAuthUtil.getSongUrl(this)

val Song.uri: Uri get() = Uri.parse(SongAuthUtil.getSongUrl(this))

fun Song.albumArtUri(): Uri {
    return MusicUtil.getMediaStoreAlbumCoverUri(albumId.toLong())
}

fun ArrayList<Song>.toMediaSessionQueue(): List<QueueItem> {
    return map { song ->
        val mediaDescription = MediaDescriptionCompat.Builder()
            .setMediaId(song.id.toString())
            .setTitle(song.title)
            .setSubtitle(song.artistName)
            .setIconUri(song.albumArtUri())
            .build()
        QueueItem(mediaDescription, song.hashCode().toLong())
    }
}




fun MediaMetadata.Builder.populateFromMetadataCompat(metadata: com.google.android.exoplayer2.metadata.Metadata): MediaMetadata.Builder {
    return SongUtil.populateFromMetadata(this, metadata)
}