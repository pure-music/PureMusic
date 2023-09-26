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
package com.caij.puremusic.fragments.lyrics

import android.annotation.SuppressLint
import android.app.Activity
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.text.InputType
import android.view.*
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.IntentSenderRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.core.view.MenuProvider
import androidx.core.view.isVisible
import androidx.transition.Fade
import code.name.monkey.appthemehelper.common.ATHToolbarActivity
import code.name.monkey.appthemehelper.util.ToolbarContentTintHelper
import code.name.monkey.appthemehelper.util.VersionUtils
import com.caij.puremusic.R
import com.caij.puremusic.activities.tageditor.TagWriter
import com.caij.puremusic.databinding.FragmentLyricsBinding
import com.caij.puremusic.model.AudioTagInfo
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.util.FileUtils
import com.caij.puremusic.util.LyricUtil
import com.caij.puremusic.util.UriUtil
import com.afollestad.materialdialogs.input.input
import com.caij.puremusic.EVENT_LYRICS_UPDATE
import com.caij.puremusic.EXTRA_SONG
import com.caij.puremusic.EventBus
import com.caij.puremusic.extensions.*
import com.caij.puremusic.fragments.base.AbsMusicServiceFragment
import com.caij.puremusic.util.GsonUtil
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.jaudiotagger.audio.AudioFileIO
import org.jaudiotagger.tag.FieldKey
import java.io.File
import java.io.FileOutputStream
import java.io.FileWriter
import java.util.*
import kotlin.collections.set

open class ComnLyricsFragment : AbsMusicServiceFragment(R.layout.fragment_lyrics), MenuProvider {

    companion object {

        fun create(song: Song): ComnLyricsFragment {
            return ComnLyricsFragment().apply {
                arguments = bundleOf(
                    EXTRA_SONG to GsonUtil.toJson(song)
                )
            }
        }
    }

    private var _binding: FragmentLyricsBinding? = null
    protected val binding get() = _binding!!
    protected lateinit var song: Song

    private lateinit var normalLyricsLauncher: ActivityResultLauncher<IntentSenderRequest>
    private lateinit var editSyncedLyricsLauncher: ActivityResultLauncher<IntentSenderRequest>

    private lateinit var cacheFile: File
    private var syncedLyrics: String = ""
    private lateinit var syncedFileUri: Uri

    private var lyricsType: LyricsType = LyricsType.NONE_LYRICS

    private val googleSearchLrcUrl: String
        get() {
            var baseUrl = "http://www.google.com/search?"
            var query = song.title + "+" + song.artistName
            query = "q=" + query.replace(" ", "+") + " lyrics"
            baseUrl += query
            return baseUrl
        }




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Normal lyrics launcher
        normalLyricsLauncher =
            registerForActivityResult(ActivityResultContracts.StartIntentSenderForResult()) {
                if (it.resultCode == Activity.RESULT_OK) {
                    FileUtils.copyFileToUri(requireContext(), cacheFile, song.uri)
                    EventBus.post(EVENT_LYRICS_UPDATE)
                }
            }
        editSyncedLyricsLauncher =
            registerForActivityResult(ActivityResultContracts.StartIntentSenderForResult()) {
                if (it.resultCode == Activity.RESULT_OK) {
                    requireContext().contentResolver.openOutputStream(syncedFileUri)?.use { os ->
                        (os as FileOutputStream).channel.truncate(0)
                        os.write(syncedLyrics.toByteArray())
                        os.flush()
                    }
                    EventBus.post(EVENT_LYRICS_UPDATE)
                }
            }
    }

    override fun checkActivity(): Boolean {
        return false
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        enterTransition = Fade()
        exitTransition = Fade()
        _binding = FragmentLyricsBinding.bind(view)

//        val menuHost: MenuHost = requireActivity() as MenuHost
//        menuHost.addMenuProvider(this, viewLifecycleOwner, Lifecycle.State.RESUMED)
        view.setBackgroundColor(surfaceColor())

        val songJson = requireArguments().getString(EXTRA_SONG)
        song = GsonUtil.fromJson(songJson!!, Song::class.java)

        setupLyricsView()
        loadLyrics()

        setupWakelock()
        setupViews()
        setupToolbar()
    }

    private fun setupLyricsView() {
        binding.lyricsView.apply {
            setCurrentColor(accentColor())
            setTimeTextColor(accentColor())
            setTimelineColor(accentColor())
            setTimelineTextColor(accentColor())
        }
    }

    private fun setupViews() {
        binding.editButton.accentColor()
        binding.editButton.setOnClickListener {
            when (lyricsType) {
                LyricsType.LOCAL_ORI_FILE_LYRICS -> {
                    val tag = binding.lyricsView.tag
                    if (tag is File) {
                        editSyncedLyrics(tag)
                    }
                }
                LyricsType.LOCAL_CUS_FILE_LYRICS -> {
                    val tag = binding.lyricsView.tag
                    if (tag is File) {
                        editSyncedLyrics(tag)
                    }
                }
                LyricsType.LOACL_META_LYRICS -> {
                    editNormalLyrics()
                }
                LyricsType.SERVER_LYRICS -> {
                    val tag = binding.lyricsView.tag
                    if (tag is File) {
                        editFileLyrics(tag)
                    }
                }
                LyricsType.SERVER_META_LYRICS -> {
                    val tag = binding.lyricsView.tag
                    if (tag is File) {
                        editFileLyrics(tag)
                    }
                }
                LyricsType.NONE_LYRICS -> {
                    if (song.isLocal) {
                        editNormalLyrics("")
                    } else {
                        val file = File(LyricUtil.getLrcSongMetaCachePath(requireContext(), song))
                        editFileLyrics(file, "")
                    }
                }
            }
        }
    }


    private fun setupToolbar() {
        (requireActivity() as AppCompatActivity).setSupportActionBar(binding.toolbar)
        ToolbarContentTintHelper.colorBackButton(binding.toolbar)
        binding.toolbar.setNavigationOnClickListener {
            requireActivity().finish()
        }
    }

    private fun setupWakelock() {
        requireActivity().window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
    }

    override fun onCreateMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_lyrics, menu)
        ToolbarContentTintHelper.handleOnCreateOptionsMenu(
            requireContext(),
            binding.toolbar,
            menu,
            ATHToolbarActivity.getToolbarBackgroundColor(binding.toolbar)
        )
    }

    override fun onMenuItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.action_search) {
            openUrl(googleSearchLrcUrl)
        }
        return false
    }

    @SuppressLint("CheckResult")
    private fun editNormalLyrics(lyrics: String? = null) {
        val file = File(song.url)
        val content = lyrics ?: try {
            AudioFileIO.read(file).tagOrCreateDefault.getFirst(FieldKey.LYRICS)
        } catch (e: Exception) {
            e.printStackTrace()
            ""
        }

        val song = song

        materialDialog().show {
            title(res = R.string.edit_normal_lyrics)
            input(
                hintRes = R.string.paste_lyrics_here,
                prefill = content,
                inputType = InputType.TYPE_TEXT_FLAG_MULTI_LINE or InputType.TYPE_CLASS_TEXT
            ) { _, input ->
                val fieldKeyValueMap = EnumMap<FieldKey, String>(FieldKey::class.java)
                fieldKeyValueMap[FieldKey.LYRICS] = input.toString()
                GlobalScope.launch {
                    if (VersionUtils.hasR()) {
                        cacheFile = TagWriter.writeTagsToFilesR(
                            requireContext(), AudioTagInfo(
                                listOf(song.url), fieldKeyValueMap, null
                            )
                        )[0]
                        val pendingIntent =
                            MediaStore.createWriteRequest(
                                requireContext().contentResolver,
                                listOf(song.uri)
                            )

                        normalLyricsLauncher.launch(
                            IntentSenderRequest.Builder(pendingIntent).build()
                        )
                    } else {
                        TagWriter.writeTagsToFiles(
                            requireContext(), AudioTagInfo(
                                listOf(song.url), fieldKeyValueMap, null
                            )
                        )
                        EventBus.post(EVENT_LYRICS_UPDATE)
                    }
                }
            }
            positiveButton(res = R.string.save) {
                loadLyrics()
            }
            negativeButton(res = android.R.string.cancel)
        }
    }


    @SuppressLint("CheckResult")
    private fun editSyncedLyrics(file: File, lyrics: String? = null) {
        val content = lyrics ?: LyricUtil.getStringFromLrc(file)

        val song = song
        materialDialog().show {
            title(res = R.string.edit_synced_lyrics)
            input(
                hintRes = R.string.paste_timeframe_lyrics_here,
                prefill = content,
                inputType = InputType.TYPE_TEXT_FLAG_MULTI_LINE or InputType.TYPE_CLASS_TEXT
            ) { _, input ->
                if (VersionUtils.hasR()) {
                    syncedLyrics = input.toString()
                    val lrcFile = file
                    if (lrcFile.exists()) {
                        syncedFileUri =
                            UriUtil.getUriFromPath(requireContext(), lrcFile.absolutePath)
                        val pendingIntent =
                            MediaStore.createWriteRequest(
                                requireContext().contentResolver,
                                listOf(syncedFileUri)
                            )
                        editSyncedLyricsLauncher.launch(
                            IntentSenderRequest.Builder(pendingIntent).build()
                        )
                    } else {
                        val fieldKeyValueMap = EnumMap<FieldKey, String>(FieldKey::class.java)
                        fieldKeyValueMap[FieldKey.LYRICS] = input.toString()
                        GlobalScope.launch {
                            cacheFile = TagWriter.writeTagsToFilesR(
                                requireContext(),
                                AudioTagInfo(listOf(song.url), fieldKeyValueMap, null)
                            )[0]
                            val pendingIntent = MediaStore.createWriteRequest(
                                requireContext().contentResolver,
                                listOf(song.uri)
                            )

                            normalLyricsLauncher.launch(
                                IntentSenderRequest.Builder(pendingIntent).build()
                            )
                        }
                    }
                } else {
                    LyricUtil.writeLrc(song, input.toString())
                    EventBus.post(EVENT_LYRICS_UPDATE)
                }
            }
            positiveButton(res = R.string.save) {
                loadLyrics()
            }
            negativeButton(res = android.R.string.cancel)
        }
    }

    @SuppressLint("CheckResult")
    private fun editFileLyrics(file: File, holder: String? = null) {
        val content = holder ?: LyricUtil.getStringFromLrc(file)
        materialDialog().show {
            title(res = R.string.edit_synced_lyrics)
            input(
                hintRes = R.string.paste_timeframe_lyrics_here,
                prefill = content,
                inputType = InputType.TYPE_TEXT_FLAG_MULTI_LINE or InputType.TYPE_CLASS_TEXT
            ) { _, input ->
                var writer: FileWriter? = null
                try {
                    writer = FileWriter(file)
                    writer.write(input.toString())
                } catch (ignore: Exception) {

                } finally {
                    writer?.close()
                }
            }
            positiveButton(res = R.string.save) {
                loadLyrics()
                EventBus.post(EVENT_LYRICS_UPDATE)
            }
            negativeButton(res = android.R.string.cancel)
        }
    }

//    private fun loadNormalLyrics() {
//        val file = File(song.url)
//        val lyrics = try {
//            AudioFileIO.read(file).tagOrCreateDefault.getFirst(FieldKey.LYRICS)
//        } catch (e: Exception) {
//            e.printStackTrace()
//            ""
//        }
//        binding.normalLyrics.isVisible = !lyrics.isNullOrEmpty()
//        binding.noLyricsFound.isVisible = lyrics.isNullOrEmpty()
//        binding.normalLyrics.text = lyrics
//    }

//    /**
//     * @return success
//     */
//    private fun loadLRCLyrics(): Boolean {
//        val lrcFile = LyricUtil.getSyncedLyricsFile(requireActivity(), song)
//        if (lrcFile != null) {
//            binding.lyricsView.loadLrc(lrcFile)
//        } else {
//            val embeddedLyrics = LyricUtil.getEmbeddedSyncedLyrics(song.url)
//            if (embeddedLyrics != null) {
//                binding.lyricsView.loadLrc(embeddedLyrics)
//            } else {
//                binding.lyricsView.setLabel(getString(R.string.empty))
//                return false
//            }
//        }
//        return true
//    }

    protected fun loadLyrics() {
        val file = when {
            LyricUtil.isLrcOriginalFileExist(song.url) -> {
                lyricsType = LyricsType.LOCAL_ORI_FILE_LYRICS
                LyricUtil.getLocalLyricOriginalFile(song.url)
            }
            LyricUtil.isLrcFileExist(song.title, song.artistName) -> {
                lyricsType = LyricsType.LOCAL_CUS_FILE_LYRICS
                LyricUtil.getLocalLyricFile(song.title, song.artistName)
            }
            LyricUtil.isNetLrcCacheFileExist(requireContext(), song) -> {
                lyricsType = LyricsType.SERVER_LYRICS
                LyricUtil.getLrcNetCacheFile(requireContext(), song)
            }
            LyricUtil.isLrcSongMetaCacheFileExist(requireContext(), song) -> {
                lyricsType = LyricsType.SERVER_META_LYRICS
                File(LyricUtil.getLrcSongMetaCachePath(requireContext(), song))
            }
            else -> {
                null
            }
        }

        if (file != null) {
            binding.lyricsView.loadLrc(file)
            binding.lyricsView.tag = file
            binding.normalLyrics.isVisible = false
            binding.noLyricsFound.isVisible = false
            binding.lyricsView.isVisible = true
        } else if (song.isLocal) {
            val embeddedLyrics = LyricUtil.getEmbeddedSyncedLyrics(song.url)
            if (embeddedLyrics != null) {
                lyricsType = LyricsType.LOACL_META_LYRICS
                binding.lyricsView.loadLrc(embeddedLyrics)
                binding.normalLyrics.isVisible = false
                binding.noLyricsFound.isVisible = false
                binding.lyricsView.isVisible = true
            } else {
                lyricsType = LyricsType.NONE_LYRICS
                binding.lyricsView.setLabel(getString(R.string.empty))
                binding.normalLyrics.isVisible = false
                binding.noLyricsFound.isVisible = true
                binding.lyricsView.isVisible = false
            }
        } else {
            lyricsType = LyricsType.NONE_LYRICS
            binding.lyricsView.setLabel(getString(R.string.empty))
            binding.normalLyrics.isVisible = false
            binding.noLyricsFound.isVisible = true
            binding.lyricsView.isVisible = false
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    enum class LyricsType {
        NONE_LYRICS,
        LOACL_META_LYRICS,
//        SYNCED_LYRICS,
        SERVER_LYRICS,
        SERVER_META_LYRICS,
        LOCAL_ORI_FILE_LYRICS,
        LOCAL_CUS_FILE_LYRICS
    }
}
