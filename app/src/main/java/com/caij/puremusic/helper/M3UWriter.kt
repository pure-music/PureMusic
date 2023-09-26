/*
 * Copyright (c) 2020 Hemanth Savarla.
 *
 * Licensed under the GNU General Public License v3
 *
 * This is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 */
package com.caij.puremusic.helper

import com.caij.puremusic.db.PlaylistWithSongs
import com.caij.puremusic.extensions.isLocal
import com.caij.puremusic.db.model.Song
import java.io.*

object M3UWriter : M3UConstants {

    @JvmStatic
    @Throws(IOException::class)
    fun writeIO(dir: File, playlistWithSongs: PlaylistWithSongs): File {
        if (!dir.exists()) dir.mkdirs()
        val fileName = "${playlistWithSongs.playlistEntity.playlistName}.${M3UConstants.EXTENSION}"
        val file = File(dir, fileName)
        val songs: List<Song> = playlistWithSongs.songs
        if (songs.isNotEmpty()) {
            BufferedWriter(FileWriter(file)).use { bw->
                bw.write(M3UConstants.HEADER)
                songs.forEach {
                    bw.newLine()
                    bw.write(M3UConstants.ENTRY + it.duration + M3UConstants.DURATION_SEPARATOR + it.artistName + " - " + it.title)
                    bw.newLine()
                    if (it.isLocal) {
                        bw.write(M3UConstants.DATA + M3UConstants.SPIT + it.url + M3UConstants.SPIT + it.id)
                    } else {
                        bw.write(M3UConstants.ID + M3UConstants.SPIT + it.id)
                    }
                }
            }
        }
        return file
    }

}
