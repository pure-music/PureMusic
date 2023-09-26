package com.caij.puremusic.repository

import com.caij.lib.encrypt.MD5Util
import com.caij.puremusic.extensions.nameWithoutSuffix
import com.caij.puremusic.extensions.suffix
import com.caij.puremusic.util.logD
import com.google.android.exoplayer2.MediaMetadata
import com.google.android.exoplayer2.metadata.Metadata
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame
import com.google.android.exoplayer2.metadata.vorbis.VorbisComment
import java.util.Arrays
import java.util.Collections

object SongUtil {

    fun populateFromMetadata(builder: MediaMetadata.Builder, metadata: Metadata): MediaMetadata.Builder {
        for (i in 0 until metadata.length()) {
            val entry = metadata[i]
            if (entry is VorbisComment) {
                if ("TRACKNUMBER" == entry.key) {
                    runCatching {
                        builder.setTrackNumber(entry.value.toInt())
                    }
                } else if ("TRACKTOTAL" == entry.key || "TOTALTRACKS" == entry.key) {
                    runCatching {
                        builder.setTotalTrackCount(entry.value.toInt())
                    }
                } else if ("DATE" == entry.key || "ORIGINALDATE" == entry.key) {
                    runCatching {
                        val dates = entry.value.split("-")
                        when (dates.size) {
                            1 -> {
                                builder.setRecordingYear(dates[0].toInt())
                            }
                            2 -> {
                                builder.setRecordingYear(dates[0].toInt())
                                builder.setRecordingMonth(dates[1].toInt())
                            }
                            else -> {
                                builder.setRecordingYear(dates[0].toInt())
                                builder.setRecordingMonth(dates[1].toInt())
                                builder.setRecordingDay(dates[2].toInt())
                            }
                        }
                    }
                } else if ("ORIGINALYEAR" == entry.key) {
                    runCatching {
                        builder.setRecordingYear(entry.value.toInt())
                    }
                }
            }
            entry.populateMediaMetadata(builder)
        }
        return builder
    }


}

class NameInfo(val name: String, val artistId: String?, val artist: String?, val trackNumber: Int) {

}

class SortInfo(val name: String, val index: Int) {
    override fun toString(): String {
        return "SortInfo(name='$name', index=$index)"
    }
}