package com.caij.puremusic.util

import com.caij.puremusic.App
import com.caij.puremusic.db.DatabaseUtil
import com.caij.puremusic.db.model.Album
import com.caij.puremusic.db.model.ServerArtistCover
import com.caij.puremusic.db.model.ServerSongCover
import com.caij.puremusic.db.model.Song
import java.util.ArrayList

object CoverManager {

    @Synchronized
    fun insertServerSongCover(serverSongCovers: ArrayList<ServerSongCover>) {
        DatabaseUtil.pureMusicDatabase.serverSongCoverDao().insert(serverSongCovers)
    }

//    @Synchronized
//    fun getServerSongCover(id: String): ServerSongCover? {
//        return DatabaseUtil.pureMusicDatabase.serverSongCoverDao().get(id)
//    }

    @Synchronized
    fun insertArtistCover(serverSongCovers: ArrayList<ServerArtistCover>) {
        DatabaseUtil.pureMusicDatabase.serverArtistCoverDao().insert(serverSongCovers)
    }

    @Synchronized
    fun getArtistCover(id: String): ServerArtistCover? {
        return DatabaseUtil.pureMusicDatabase.serverArtistCoverDao().get(id)
    }


//    @JvmStatic
//    fun geLyricsId(song: Song): String {
//        return "${song.title}-${song.artistName}-${song.sourceId}"
//    }

//    fun geLyricsId(file: DriveFile): String {
//        val pair = SongUtil.parseArtistInfo(file.fileName)
//        val artistName = pair.second
//        val title = pair.third
//        return "$title-$artistName-${file.sourceId}"
//    }

    fun deleteSongBySource(id: Long) {
        val covers = DatabaseUtil.pureMusicDatabase.serverSongCoverDao().getBySource(id)
        val ids = ArrayList<String>()
        for (v in covers) {
            ids.add(v.id)
        }
        CustomServerAlbumImageUtil.getInstance(App.getContext()).resetCustomAlbumImage(ids)
        DatabaseUtil.pureMusicDatabase.serverSongCoverDao().deleteSongBySource(id)
    }

//    @JvmStatic
//    fun saveSongCover(context: Context, song: Song, artworkData: ByteArray) {
//        val file = songCoverFile(context, geCoverId(song))
//        if (!file.parentFile.exists()) {
//            file.parentFile.mkdirs()
//        }
//        var fileStream: FileOutputStream? = null
//        try {
//            fileStream = FileOutputStream(file)
//            fileStream.write(artworkData)
//        } finally {
//            fileStream?.close()
//        }
//    }

//    @JvmStatic
//    fun isSongCoverExist(context: Context, song: Song): Boolean {
//        val imageFile = songCoverFile(context, geCoverId(song))
//        if (imageFile.exists() && imageFile.length() > 0) {
//            return true
//        }
//        return false
//    }

//    @JvmStatic
//    fun isSongCoverExist(context: Context, id: String): Boolean {
//        val file = File(context.cacheDir, "cover")
//        val imageFile = File(file, id)
//        if (imageFile.exists() && imageFile.length() > 0) {
//            return true
//        }
//        return false
//    }

//    @JvmStatic
//    fun songCoverFile(context: Context, id: String): File {
//        val file = File(context.cacheDir, "cover")
//        return File(file, id)
//    }
}