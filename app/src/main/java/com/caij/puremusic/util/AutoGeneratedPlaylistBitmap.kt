//package com.caij.puremusic.util
//
//import android.content.Context
//import android.graphics.Bitmap
//import android.graphics.BitmapFactory
//import com.caij.puremusic.R
//import com.caij.puremusic.glide.GlideApp
//import com.caij.puremusic.db.model.Song
//import com.caij.puremusic.util.MergedImageUtils.joinImages
//import com.caij.puremusic.util.MusicUtil.getMediaStoreAlbumCoverUri
//import com.bumptech.glide.load.resource.bitmap.RoundedCorners
//
//object AutoGeneratedPlaylistBitmap {
//    fun getBitmap(
//        context: Context, songPlaylist: List<Song>?
//    ): Bitmap? {
//        if (songPlaylist == null || songPlaylist.isEmpty()) return getDefaultBitmap(context)
//        if (songPlaylist.size == 1) return getBitmapWithAlbumId(context, songPlaylist[0].albumId)
//        val albumID: MutableList<Long> = ArrayList()
//        for (song in songPlaylist) {
//            if (!albumID.contains(song.albumId)) albumID.add(song.albumId)
//        }
//        val art: MutableList<Bitmap> = ArrayList()
//        for (id in albumID) {
//            val bitmap = getBitmapWithAlbumId(context, id)
//            if (bitmap != null) art.add(bitmap)
//            if (art.size == 9) break
//        }
//        return joinImages(art)
//    }
//
//    private fun getBitmapWithAlbumId(context: Context, id: Long): Bitmap? {
//        return try {
//            GlideApp.with(context)
//                .asBitmap()
//                .transform(RoundedCorners(20))
//                .load(getMediaStoreAlbumCoverUri(id))
//                .submit(200, 200)
//                .get()
//        } catch (e: Exception) {
//            null
//        }
//    }
//
//    private fun getDefaultBitmap(context: Context): Bitmap {
//        return BitmapFactory.decodeResource(context.resources, R.drawable.default_album_art)
//    }
//}