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

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.text.Spanned
import android.util.Log
import androidx.core.os.bundleOf
import androidx.core.text.parseAsHtml
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.lifecycleScope
import com.caij.puremusic.EXTRA_SONG
import com.caij.puremusic.R
import com.caij.puremusic.databinding.DialogFileDetailsBinding
import com.caij.puremusic.extensions.colorButtons
import com.caij.puremusic.extensions.isLocal
import com.caij.puremusic.extensions.materialDialog
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.repository.RoomRepository
import com.caij.puremusic.util.GsonUtil
import com.caij.puremusic.util.MusicUtil
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.jaudiotagger.audio.AudioFileIO
import org.koin.core.component.KoinComponent
import org.koin.java.KoinJavaComponent
import java.io.File

class SongDetailDialog : DialogFragment(), KoinComponent {

    private val mRoomRepository = KoinJavaComponent.get<RoomRepository>(RoomRepository::class.java)

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val context: Context = requireContext()
        val binding = DialogFileDetailsBinding.inflate(layoutInflater)

        val str = requireArguments().getString(EXTRA_SONG)
        val song = GsonUtil.fromJson(str, Song::class.java)
        with(binding) {
            fileName.text = makeTextWithTitle(context, R.string.label_file_name, "-")
            filePath.text = makeTextWithTitle(context, R.string.label_file_path, "-")
            fileSize.text = makeTextWithTitle(context, R.string.label_file_size, "-")
            fileFormat.text = makeTextWithTitle(context, R.string.label_file_format, "-")
            trackLength.text = makeTextWithTitle(context, R.string.label_track_length, "-")
            bitrate.text = makeTextWithTitle(context, R.string.label_bit_rate, "-")
            samplingRate.text = makeTextWithTitle(context, R.string.label_sampling_rate, "-")
        }

        if (song != null) {
            binding.fileName.text =
                makeTextWithTitle(context, R.string.label_file_name, song.title)
            binding.filePath.text =
                makeTextWithTitle(context, R.string.label_file_path, song.path)

            binding.dateModified.text = makeTextWithTitle(
                context, R.string.label_last_modified,
                MusicUtil.getDateModifiedString(song.dateModified)
            )

            binding.fileSize.text =
                makeTextWithTitle(
                    context,
                    R.string.label_file_size,
                    getFileSizeString(song.size)
                )

            binding.trackLength.text = makeTextWithTitle(
                context,
                R.string.label_track_length,
                MusicUtil.getReadableDurationString(song.duration)
            )

            lifecycleScope.launch(Dispatchers.IO) {
                if (song.isLocal) {
                    val songFile = File(song.url)
                    if (songFile.exists()) {
                        try {
                            val audioFile = AudioFileIO.read(songFile)
                            val audioHeader = audioFile.audioHeader
                            withContext(Dispatchers.Main) {
                                binding.fileFormat.text =
                                    makeTextWithTitle(
                                        context,
                                        R.string.label_file_format,
                                        audioHeader.format
                                    )
                                binding.bitrate.text = makeTextWithTitle(
                                    context,
                                    R.string.label_bit_rate,
                                    audioHeader.bitRate + " kb/s"
                                )
                                binding.samplingRate.text =
                                    makeTextWithTitle(
                                        context,
                                        R.string.label_sampling_rate,
                                        audioHeader.sampleRate + " Hz"
                                    )
                            }
                        } catch (e: Exception) {
                            Log.e(TAG, "error while reading the song file", e)
                            // fallback
                        }
                    }
                } else {
                    val audioFormat = mRoomRepository.getAudioFormat(song.id)
                    if (audioFormat != null) {
                        withContext(Dispatchers.Main) {
                            binding.fileFormat.text =
                                makeTextWithTitle(
                                    context,
                                    R.string.label_file_format,
                                    audioFormat.mimeType
                                )
                            binding.bitrate.text = makeTextWithTitle(
                                context,
                                R.string.label_bit_rate,
                                audioFormat.bitRate + " kb/s"
                            )
                            binding.samplingRate.text =
                                makeTextWithTitle(
                                    context,
                                    R.string.label_sampling_rate,
                                    audioFormat.sampleRate + " Hz"
                                )
                        }
                    }
                }
            }
        }
        return materialDialog(R.string.action_details)
            .setPositiveButton(android.R.string.ok, null)
            .setView(binding.root)
            .create()
            .colorButtons()
    }

    companion object {

        val TAG: String = SongDetailDialog::class.java.simpleName

        fun create(song: Song): SongDetailDialog {
            return SongDetailDialog().apply {
                arguments = bundleOf(
                    EXTRA_SONG to GsonUtil.toJson(song)
                )
            }
        }

        private fun makeTextWithTitle(context: Context, titleResId: Int, text: String?): Spanned {
            return ("<b>" + context.resources.getString(titleResId) + ": " + "</b>" + text)
                .parseAsHtml()
        }

        private fun getFileSizeString(sizeInBytes: Long): String {
            val fileSizeInKB = sizeInBytes / 1024
            val fileSizeInMB = fileSizeInKB / 1024
            return "$fileSizeInMB MB"
        }
    }
}
