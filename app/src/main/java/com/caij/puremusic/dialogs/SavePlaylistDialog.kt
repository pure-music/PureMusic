///*
// * Copyright (c) 2020 Hemanth Savarla.
// *
// * Licensed under the GNU General Public License v3
// *
// * This is free software: you can redistribute it and/or modify it
// * under the terms of the GNU General Public License as published by
// * the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
// *
// * This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
// * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
// * See the GNU General Public License for more details.
// *
// */
//package com.caij.puremusic.dialogs
//
//import android.app.Dialog
//import android.media.MediaScannerConnection
//import android.os.Bundle
//import android.widget.Toast
//import androidx.core.os.bundleOf
//import androidx.fragment.app.DialogFragment
//import androidx.lifecycle.lifecycleScope
//import code.name.monkey.appthemehelper.util.VersionUtils
//import com.caij.puremusic.EXTRA_PLAYLIST
//import com.caij.puremusic.R
//import com.caij.puremusic.db.PlaylistWithSongs
//import com.caij.puremusic.extensions.*
//import com.caij.puremusic.fragments.playlists.PlayListWrapperUtil
//import com.caij.puremusic.helper.M3UWriter
//import com.caij.puremusic.repository.SongRepository
//import com.caij.puremusic.util.PlaylistsUtil
//import kotlinx.coroutines.Dispatchers
//import kotlinx.coroutines.launch
//import kotlinx.coroutines.withContext
//import org.koin.android.ext.android.inject
//
//class SavePlaylistDialog : DialogFragment() {
//
//    private val songRepository by inject<SongRepository>()
//
//    companion object {
//        fun create(playlistWithSongs: PlaylistWithSongs): SavePlaylistDialog {
//            return SavePlaylistDialog().apply {
//                arguments = bundleOf(
//                    EXTRA_PLAYLIST to playlistWithSongs
//                )
//            }
//        }
//    }
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        val playlistWithSongs = extraNotNull<PlaylistWithSongs>(EXTRA_PLAYLIST).value
//
//        if (VersionUtils.hasR()) {
//            createNewFile(
//                "audio/mpegurl",
//                playlistWithSongs.playlistEntity.playlistName
//            ) { outputStream, data ->
//                try {
//                    if (outputStream != null) {
//                        lifecycleScope.launch(Dispatchers.IO) {
//                            M3UWriter.writeIO(
//                                outputStream,
//                                PlayListWrapperUtil.toWrapper(songRepository, playlistWithSongs)
//                            )
//                            withContext(Dispatchers.Main) {
//                                showToast(
//                                    requireContext().getString(R.string.saved_playlist_to,
//                                        data?.lastPathSegment),
//                                    Toast.LENGTH_LONG
//                                )
//                                dismiss()
//                            }
//                        }
//                    }
//                } catch (e: Exception) {
//                    showToast(
//                        "Something went wrong : " + e.message
//                    )
//                }
//            }
//        } else {
//            lifecycleScope.launch(Dispatchers.IO) {
//                val file = PlaylistsUtil.savePlaylistWithSongs(PlayListWrapperUtil.toWrapper(songRepository, playlistWithSongs))
//                MediaScannerConnection.scanFile(
//                    requireActivity(),
//                    arrayOf<String>(file.path),
//                    null
//                ) { _, _ ->
//                }
//                withContext(Dispatchers.Main) {
//                    showToast(
//                        getString(R.string.saved_playlist_to, file),
//                        Toast.LENGTH_LONG
//                    )
//                    dismiss()
//                }
//            }
//        }
//    }
//
//    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
//        return materialDialog(R.string.save_playlist_title)
//            .setView(R.layout.loading)
//            .create().colorButtons()
//    }
//}
