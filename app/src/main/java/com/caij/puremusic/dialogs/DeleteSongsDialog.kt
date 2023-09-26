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
package com.caij.puremusic.dialogs

import android.app.Activity
import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.result.IntentSenderRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.os.bundleOf
import androidx.core.text.parseAsHtml
import androidx.fragment.app.DialogFragment
import code.name.monkey.appthemehelper.util.VersionUtils
import com.caij.puremusic.EVENT_SONGS_UPDATE
import com.caij.puremusic.EXTRA_SONG
import com.caij.puremusic.EventBus
import com.caij.puremusic.R
import com.caij.puremusic.activities.saf.SAFGuideActivity
import com.caij.puremusic.extensions.extraNotNull
import com.caij.puremusic.extensions.materialDialog
import com.caij.puremusic.fragments.LibraryViewModel
import com.caij.puremusic.helper.MusicPlayerRemote
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.extensions.isLocal
import com.caij.puremusic.util.GsonUtil
import com.caij.puremusic.util.MusicUtil
import com.caij.puremusic.util.SAFUtil
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.koin.androidx.viewmodel.ext.android.getViewModel

class DeleteSongsDialog : DialogFragment() {
    lateinit var libraryViewModel: LibraryViewModel

    companion object {
        fun create(song: Song): DeleteSongsDialog {
            val list = ArrayList<Song>()
            list.add(song)
            return create(list)
        }

        fun create(songs: List<Song>): DeleteSongsDialog {
            return DeleteSongsDialog().apply {
                arguments = bundleOf(
                    EXTRA_SONG to GsonUtil.toJson(songs)
                )
            }
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        libraryViewModel = activity?.getViewModel() as LibraryViewModel
        val songsJson = extraNotNull<String>(EXTRA_SONG).value
        val songs: List<Song> = GsonUtil.fromJsonType(songsJson, object : TypeToken<List<Song>>() {}.type)
        val localSongs = ArrayList<Song>()
        for (song in songs) {
            if (song.isLocal) {
                localSongs.add(song)
            }
        }

        if (localSongs.isNotEmpty()) {
            if (VersionUtils.hasR()) {
                val deleteResultLauncher =
                    registerForActivityResult(ActivityResultContracts.StartIntentSenderForResult()) { result ->
                        if (result.resultCode == Activity.RESULT_OK) {
                            CoroutineScope(Dispatchers.IO).launch {
                                libraryViewModel.deleteSongs(songs)
                                withContext(Dispatchers.Main) {
                                    MusicPlayerRemote.removeFromQueue(songs)
                                    EventBus.post(EVENT_SONGS_UPDATE)
                                }
                            }
                        }
                        dismiss()
                    }
                val pendingIntent =
                    MediaStore.createDeleteRequest(requireActivity().contentResolver, localSongs.map {
                        MusicUtil.getSongFileUri(it.id)
                    })
                deleteResultLauncher.launch(
                    IntentSenderRequest.Builder(pendingIntent.intentSender).build()
                )
                return super.onCreateDialog(savedInstanceState)
            } else {
                val pair = if (songs.size > 1) {
                    Pair(
                        R.string.delete_songs_title,
                        String.format(getString(R.string.delete_x_songs), songs.size).parseAsHtml()
                    )
                } else {
                    Pair(
                        R.string.delete_song_title,
                        String.format(getString(R.string.delete_song_x), songs[0].title).parseAsHtml()
                    )
                }

                return materialDialog()
                    .title(pair.first)
                    .message(text = pair.second)
                    .noAutoDismiss()
                    .negativeButton(android.R.string.cancel)
                    {
                        dismiss()
                    }
                    .positiveButton(R.string.action_delete)
                    {
                        if (!SAFUtil.isSAFRequiredForSongs(localSongs)) {
                            CoroutineScope(Dispatchers.IO).launch {
                                dismiss()
                                MusicUtil.deleteTracks(requireContext(), localSongs)
                                withContext(Dispatchers.Main) {
                                    MusicPlayerRemote.removeFromQueue(songs)
                                    EventBus.post(EVENT_SONGS_UPDATE)
                                }
                            }
                        } else {
                            if (SAFUtil.isSDCardAccessGranted(requireActivity())) {
                                deleteSongs(songs, localSongs)
                            } else {
                                startActivityForResult(
                                    Intent(requireActivity(), SAFGuideActivity::class.java),
                                    SAFGuideActivity.REQUEST_CODE_SAF_GUIDE
                                )
                            }
                        }
                    }
            }
        } else {
            return materialDialog()
                .title(R.string.delete_songs_title)
                .message(text = "not support without device storage song")
                .noAutoDismiss()
                .negativeButton(android.R.string.cancel)
                {
                    dismiss()
                }
                .positiveButton(R.string.action_delete)
                {
                    dismiss()
                    deleteSongs2(songs)
                }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            SAFGuideActivity.REQUEST_CODE_SAF_GUIDE -> {
                SAFUtil.openTreePicker(this)
            }
            SAFUtil.REQUEST_SAF_PICK_TREE,
            SAFUtil.REQUEST_SAF_PICK_FILE -> {
                if (resultCode == Activity.RESULT_OK) {
                    SAFUtil.saveTreeUri(requireActivity(), data)
                    val songsJson = extraNotNull<String>(EXTRA_SONG).value
                    val songs: List<Song> = GsonUtil.fromJsonType(songsJson, object : TypeToken<List<Song>>() {}.type)
                    val localSongs = ArrayList<Song>()
                    for (song in songs) {
                        if (song.isLocal) {
                            localSongs.add(song)
                        }
                    }
                    deleteSongs(songs, localSongs)
                }
            }
        }
    }

    private fun deleteSongs(songs: List<Song>, localSongs: ArrayList<Song>) {
        CoroutineScope(Dispatchers.IO).launch {
            dismiss()
            MusicUtil.deleteTracks(requireActivity(), localSongs, null, null)
            libraryViewModel.deleteSongs(songs)
            withContext(Dispatchers.Main) {
                MusicPlayerRemote.removeFromQueue(songs)
                EventBus.post(EVENT_SONGS_UPDATE)
            }
        }
    }

    private fun deleteSongs2(songs: List<Song>) {
        CoroutineScope(Dispatchers.IO).launch {
            libraryViewModel.deleteSongs(songs)
            withContext(Dispatchers.Main) {
                MusicPlayerRemote.removeFromQueue(songs)
                EventBus.post(EVENT_SONGS_UPDATE)
            }
        }
    }
}
