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
package com.caij.puremusic.activities.tageditor

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.animation.OvershootInterpolator
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.IntentSenderRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
import androidx.core.os.bundleOf
import androidx.core.view.MenuProvider
import androidx.core.view.isVisible
import androidx.core.widget.doAfterTextChanged
import androidx.lifecycle.lifecycleScope
import code.name.monkey.appthemehelper.util.MaterialValueHelper
import code.name.monkey.appthemehelper.util.VersionUtils
import com.caij.puremusic.R
import com.caij.puremusic.databinding.ActivitySongTagEditorBinding
import com.caij.puremusic.glide.GlideApp
import com.caij.puremusic.glide.palette.BitmapPaletteWrapper
import com.caij.puremusic.model.ArtworkInfo
import com.caij.puremusic.repository.SongRepository
import com.caij.puremusic.util.ImageUtil
import com.caij.puremusic.util.MusicUtil
import com.caij.puremusic.util.RetroColorUtil
import com.caij.puremusic.util.logD
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.target.ImageViewTarget
import com.bumptech.glide.request.transition.Transition
import com.caij.lib.toast.ToastUtil
import com.caij.puremusic.EVENT_ALBUMS_UPDATE
import com.caij.puremusic.EVENT_ARTISTS_UPDATE
import com.caij.puremusic.EVENT_SONG_UPDATE
import com.caij.puremusic.EXTRA_SONG
import com.caij.puremusic.EventBus
import com.caij.puremusic.activities.HolderActivity
import com.caij.puremusic.activities.base.AbsBaseActivity
import com.caij.puremusic.db.model.Album
import com.caij.puremusic.db.model.Artist
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.extensions.*
import com.caij.puremusic.fragments.lyrics.ComnLyricsFragment
import com.caij.puremusic.glide.RetroGlideExtension
import com.caij.puremusic.helper.MusicPlayerRemote
import com.caij.puremusic.model.AudioTagInfo
import com.caij.puremusic.repository.RoomRepository
import com.caij.puremusic.util.ArtistUtil
import com.caij.puremusic.util.BaseSongUtil
import com.caij.puremusic.util.CustomSongImageUtil
import com.caij.puremusic.util.GsonUtil
import com.caij.puremusic.util.LyricUtil
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.shape.MaterialShapeDrawable
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.jaudiotagger.tag.FieldKey
import org.koin.android.ext.android.inject
import org.koin.java.KoinJavaComponent
import java.io.File
import java.io.FileWriter
import java.util.*

open class SongTagEditorActivityV2 : AbsBaseActivity(), MenuProvider {

//    override val bindingInflater: (LayoutInflater) -> ActivitySongTagEditorBinding =
//        ActivitySongTagEditorBinding::inflate

    private var song: Song? = null
    private lateinit var binding: ActivitySongTagEditorBinding

    private val songRepository by inject<SongRepository>()
    private val mRoomRepository = KoinJavaComponent.get<RoomRepository>(RoomRepository::class.java)

    private var albumArtBitmap: Bitmap? = null
    private var deleteAlbumArt: Boolean = false
    private var songId: Long = 0L

    private lateinit var items: List<String>
    private var cacheFiles = listOf<File>()
    private lateinit var launcher: ActivityResultLauncher<IntentSenderRequest>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        songId = intent.getLongExtra(AbsTagEditorActivity.EXTRA_ID, 0L)
        binding = ActivitySongTagEditorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpViews()
        setSupportActionBar(binding.toolbar)
        binding.appBarLayout?.statusBarForeground =
            MaterialShapeDrawable.createWithElevationOverlay(this)
        lifecycleScope.launch(Dispatchers.IO) {
            song = songRepository.song(songId)
            withContext(Dispatchers.Main) {
                if (song != null) {
                    fillViewsWithFileTags(song!!)
                    loadCurrentImage(song!!)
                } else {
                    finish()
                }
            }
        }
        items = listOf(
            getString(R.string.pick_from_local_storage),
            getString(R.string.remove_cover)
        )
        launcher = registerForActivityResult(ActivityResultContracts.StartIntentSenderForResult()) {
            if (it.resultCode == Activity.RESULT_OK) {
                writeToFiles(getSongUris(), cacheFiles)
            }
        }

        addMenuProvider(this)
    }

    @SuppressLint("ClickableViewAccessibility")
    private fun setUpViews() {
        binding.songTextContainer.setTint(false)
        binding.composerContainer.setTint(false)
        binding.albumTextContainer.setTint(false)
        binding.artistContainer.setTint(false)
        binding.albumArtistContainer.setTint(false)
        binding.yearContainer.setTint(false)
        binding.genreContainer.setTint(false)
        binding.trackNumberContainer.setTint(false)
        binding.discNumberContainer.setTint(false)
        binding.lyricsContainer.setTint(false)

        binding.songText.appHandleColor().doAfterTextChanged { dataChanged() }
        binding.albumText.appHandleColor().doAfterTextChanged { dataChanged() }
        binding.albumArtistText.appHandleColor().doAfterTextChanged { dataChanged() }
        binding.artistText.appHandleColor().doAfterTextChanged { dataChanged() }
        binding.genreText.appHandleColor().doAfterTextChanged { dataChanged() }
        binding.yearText.appHandleColor().doAfterTextChanged { dataChanged() }
        binding.trackNumberText.appHandleColor().doAfterTextChanged { dataChanged() }
        binding.discNumberText.appHandleColor().doAfterTextChanged { dataChanged() }
        binding.lyricsText.appHandleColor().doAfterTextChanged { dataChanged() }
        binding.songComposerText.appHandleColor().doAfterTextChanged { dataChanged() }

        editorImage.setOnClickListener {
            show
        }

        binding.saveTags.setOnClickListener {
            save()
        }
    }

    protected fun dataChanged() {
        showFab()
    }

    private fun showFab() {
        binding.saveTags.animate().setDuration(500).setInterpolator(OvershootInterpolator()).scaleX(1f)
            .scaleY(1f).start()
        binding.saveTags.isEnabled = true
    }

    private fun hideFab() {
        binding.saveTags.animate().setDuration(500).setInterpolator(OvershootInterpolator()).scaleX(0.0f)
            .scaleY(0.0f).start()
        binding.saveTags.isEnabled = false
    }

    private fun fillViewsWithFileTags(song: Song) {
        binding.songText.setText(song.title)
        binding.albumArtistText.setText(song.albumArtist)
        binding.albumText.setText(song.albumName)
        binding.artistText.setText(song.artistName)
//        binding.genreText.setText(genreName)
        binding.yearText.setText(song.year.toString())
        binding.trackNumberText.setText(song.trackNumber.toString())
//        binding.discNumberText.setText(discNumber)
//        binding.lyricsText.setText(song.)
        binding.songComposerText.setText(song.composer)
        logD(song.title + song.year)
        lifecycleScope.launch(Dispatchers.IO) {
            val values = loadLyricsText(song)
            withContext(Dispatchers.Main) {
                if (values.first == ComnLyricsFragment.LyricsType.LOACL_META_LYRICS
                    || values.first == ComnLyricsFragment.LyricsType.SERVER_META_LYRICS
                    || values.first == ComnLyricsFragment.LyricsType.SERVER_LYRICS) {
                    binding.lyricsText.setText(values.second)
                    binding.lyricsContainer.visibility = View.VISIBLE
                    binding.lyricsContainer.tag = values.first
                } else {
                    binding.lyricsContainer.visibility = View.GONE
                }
            }
        }
    }

    private fun loadLyricsText(song: Song): Pair<ComnLyricsFragment.LyricsType, String?> {
        val lyricsType: ComnLyricsFragment.LyricsType
        val lyricsStr = when {
            LyricUtil.isLrcOriginalFileExist(song.url) -> {
                lyricsType = ComnLyricsFragment.LyricsType.LOCAL_ORI_FILE_LYRICS
                LyricUtil.getStringFromLrc(LyricUtil.getLocalLyricOriginalFile(song.url))
            }
            LyricUtil.isLrcFileExist(song.title, song.artistName) -> {
                lyricsType = ComnLyricsFragment.LyricsType.LOCAL_CUS_FILE_LYRICS
                LyricUtil.getStringFromLrc(LyricUtil.getLocalLyricFile(song.title, song.artistName))
            }
            LyricUtil.isNetLrcCacheFileExist(this, song) -> {
                lyricsType = ComnLyricsFragment.LyricsType.SERVER_LYRICS
                LyricUtil.getStringFromLrc(LyricUtil.getLrcNetCacheFile(this, song))
            }
            LyricUtil.isLrcSongMetaCacheFileExist(this, song) -> {
                lyricsType = ComnLyricsFragment.LyricsType.SERVER_META_LYRICS
                LyricUtil.getStringFromLrc(File(LyricUtil.getLrcSongMetaCachePath(this, song)))
            }
            song.isLocal -> {
                val embeddedLyrics = LyricUtil.getEmbeddedSyncedLyrics(song.url)
                lyricsType = ComnLyricsFragment.LyricsType.LOACL_META_LYRICS
                embeddedLyrics
            } else -> {
                lyricsType = ComnLyricsFragment.LyricsType.NONE_LYRICS
                null
            }
        }
        return Pair(lyricsType, lyricsStr)
    }

    private fun loadCurrentImage(song: Song) {
        lifecycleScope.launch(Dispatchers.IO) {
            try {
                val model = RetroGlideExtension.getSongModel(song)
                val bitmap = GlideApp.with(this@SongTagEditorActivityV2)
                    .asBitmap()
                    .songCoverOptions(song, model)
                    //.checkIgnoreMediaStore()
                    .load(model)
                    .submit()
                    .get()
                withContext(Dispatchers.Main) {
                    setImageBitmap(
                        bitmap,
                        RetroColorUtil.getColor(
                            RetroColorUtil.generatePalette(bitmap),
                            defaultFooterColor()
                        )
                    )
                }
            } catch (ignore: Exception) {

            }
        }
        deleteAlbumArt = false
    }

    protected fun setImageBitmap(bitmap: Bitmap?, bgColor: Int) {
        if (bitmap == null) {
            editorImage.setImageResource(R.drawable.default_audio_art)
        } else {
            editorImage.setImageBitmap(bitmap)
        }
        setColors(bgColor)
    }

    private fun deleteImage() {
        setImageBitmap(
            BitmapFactory.decodeResource(resources, R.drawable.default_audio_art),
            defaultFooterColor()
        )
        deleteAlbumArt = true
        dataChanged()
    }

    fun setColors(color: Int) {
//        super.setColors(color)
        binding.saveTags.backgroundTintList = ColorStateList.valueOf(color)
        ColorStateList.valueOf(
            MaterialValueHelper.getPrimaryTextColor(
                this,
                color.isColorLight
            )
        ).also {
            binding.saveTags.iconTint = it
            binding.saveTags.setTextColor(it)
        }
    }

    fun save() {
        hideSoftKeyboard()
        hideFab()
        lifecycleScope.launch(Dispatchers.IO) {
            val song = songRepository.song(songId)
            if (song != null) {
                val year = try {
                    binding.yearText.text.toString().toInt()
                } catch (e: Throwable) {
                    0
                }
                val title = binding.songText.text.toString()
                val albumName = binding.albumText.text.toString()
                var artistName = binding.artistText.text.toString()
                val trackNum = binding.trackNumberText.text.toString().toInt()
                val albumArtist = binding.albumArtistText.text.toString()
                val composer = binding.songComposerText.text.toString()
//

                if (artistName.isEmpty()) {
                    artistName = BaseSongUtil.DEFAULT_ARTIST
                }

                var newArtistId: String? = null
                var newArtist: Artist? = null
                if (artistName != song.artistName) {
                    newArtistId = BaseSongUtil.parseArtistId(artistName)
                    val artists = ArrayList<Artist>()
                    ArtistUtil.splitIntoArtists(artists, newArtistId, artistName)
                    mRoomRepository.insertAllArtists(artists)
                    withContext(Dispatchers.Main) {
                        EventBus.post(EVENT_ARTISTS_UPDATE)
                    }
                    newArtist = artists[0]
                }

                var newAlbumId: Long? = null
                if (albumName != song.albumName) {
                    newAlbumId = albumName.toLongId()
                    val newAlbum = Album(
                        newAlbumId,
                        year,
                        song.url,
                        song.dateModified,
                        newAlbumId,
                        albumName,
                        newArtist?.id ?: BaseSongUtil.getArtistId(BaseSongUtil.DEFAULT_ARTIST),
                        albumArtist,
                        composer,
                        0,
                        song.sourceType
                    )
                    mRoomRepository.addOrReplaceAlbum(newAlbum)
                    withContext(Dispatchers.Main) {
                        EventBus.post(EVENT_ALBUMS_UPDATE)
                    }
                }

                val newSong = Song(
                    song.id,
                    title,
                    trackNum,
                    year,
                    song.duration,
                    song.url,
                    song.path,
                    song.dateModified,
                    newAlbumId ?: song.albumId,
                    albumName,
                    newArtistId ?: song.artistId,
                    artistName,
                    composer,
                    artistName,
                    song.dateAdded,
                    song.sourceType,
                    song.sourceId,
                    song.size
                )
                mRoomRepository.insertSong(newSong)

                if (deleteAlbumArt) {
                    CustomSongImageUtil.getInstance(this@SongTagEditorActivityV2).resetCustomSongImage(song)
                } else if (albumArtBitmap != null) {
                    CustomSongImageUtil.getInstance(this@SongTagEditorActivityV2).setCustomSongImage(newSong, albumArtBitmap!!)
                }

                withContext(Dispatchers.Main) {
                    EventBus.post(EVENT_SONG_UPDATE, newSong)
                    ToastUtil.show(this@SongTagEditorActivityV2, getString(R.string.edit_success))
                    MusicPlayerRemote.clearQueue()
                }

                val lyrics = binding.lyricsText.text.toString()
                if (binding.lyricsContainer.visibility == View.VISIBLE) {
                    when (binding.lyricsContainer.tag) {
                        ComnLyricsFragment.LyricsType.SERVER_LYRICS -> {
                            LyricUtil.writeLrc(File(LyricUtil.getLrcNetCachePath(this@SongTagEditorActivityV2, song)), lyrics)
                        }
                        ComnLyricsFragment.LyricsType.SERVER_META_LYRICS -> {
                            LyricUtil.writeLrc(File(LyricUtil.getLrcSongMetaCachePath(this@SongTagEditorActivityV2, song)), lyrics)
                        }
                    }
                }

                val songPaths = getSongPaths()
                val songUris = getSongUris()
                if (songPaths.isNotEmpty()) {
                    val fieldKeyValueMap = EnumMap<FieldKey, String>(FieldKey::class.java)
                    fieldKeyValueMap[FieldKey.TITLE] = title
                    fieldKeyValueMap[FieldKey.ALBUM] = albumName
                    fieldKeyValueMap[FieldKey.ARTIST] = artistName
//                  fieldKeyValueMap[FieldKey.GENRE] = binding.genreText.text.toString()
                    fieldKeyValueMap[FieldKey.YEAR] = year.toString()
                    fieldKeyValueMap[FieldKey.TRACK] = trackNum.toString()
//                  fieldKeyValueMap[FieldKey.DISC_NO] = binding.discNumberText.text.toString()
                    if (binding.lyricsContainer.visibility == View.VISIBLE) {
                        fieldKeyValueMap[FieldKey.LYRICS] = lyrics
                    }
                    fieldKeyValueMap[FieldKey.ALBUM_ARTIST] = albumArtist
                    fieldKeyValueMap[FieldKey.COMPOSER] = composer
                    withContext(Dispatchers.Main) {
                        writeValuesToFiles(
                            fieldKeyValueMap, when {
                                deleteAlbumArt -> ArtworkInfo(songId, null)
                                albumArtBitmap == null -> null
                                else -> ArtworkInfo(songId, albumArtBitmap!!)
                            }, songPaths, songUris)
                    }
                }
            }
        }

    }


    private fun writeValuesToFiles(
        fieldKeyValueMap: Map<FieldKey, String>,
        artworkInfo: ArtworkInfo?,
        songPaths: List<String>,
        songUris: List<Uri>
    ) {
        logD(fieldKeyValueMap)
        GlobalScope.launch {
            if (VersionUtils.hasR()) {
                cacheFiles = TagWriter.writeTagsToFilesR(
                    this@SongTagEditorActivityV2, AudioTagInfo(
                        songPaths,
                        fieldKeyValueMap,
                        artworkInfo
                    )
                )
                val pendingIntent = MediaStore.createWriteRequest(contentResolver, songUris)

                launcher.launch(IntentSenderRequest.Builder(pendingIntent).build())
            } else {
                TagWriter.writeTagsToFiles(
                    this@SongTagEditorActivityV2, AudioTagInfo(
                        songPaths,
                        fieldKeyValueMap,
                        artworkInfo
                    )
                )
            }
        }
    }

    private fun writeToFiles(songUris: List<Uri>, cacheFiles: List<File>) {
        if (cacheFiles.size == songUris.size) {
            for (i in cacheFiles.indices) {
                contentResolver.openOutputStream(songUris[i])?.use { output ->
                    cacheFiles[i].inputStream().use { input ->
                        input.copyTo(output)
                    }
                }
            }
        }
        lifecycleScope.launch {
            val songPaths = withContext(Dispatchers.IO) {
                getSongPaths()
            }
            TagWriter.scan(this@SongTagEditorActivityV2, songPaths)
        }
    }

    private fun getSongPaths(): List<String> {
        val song = songRepository.song(songId)
        if (song != null && song.isLocal) {
            return listOf(song.url)
        }
        return emptyList()
    }

    private fun getSongUris(): List<Uri> {
        val song = songRepository.song(songId)
        if (song != null && song.isLocal) {
            return listOf(MusicUtil.getSongFileUri(songId))
        }
        return emptyList()
    }

    private fun loadImageFromFile(selectedFile: Uri?) {
        GlideApp.with(this@SongTagEditorActivityV2).asBitmapPalette().load(selectedFile)
            .diskCacheStrategy(DiskCacheStrategy.NONE).skipMemoryCache(true)
            .into(object : ImageViewTarget<BitmapPaletteWrapper>(binding.editorImage) {
                override fun onResourceReady(
                    resource: BitmapPaletteWrapper,
                    transition: Transition<in BitmapPaletteWrapper>?
                ) {
                    RetroColorUtil.getColor(resource.palette, Color.TRANSPARENT)
                    albumArtBitmap = resource.bitmap?.let { ImageUtil.resizeBitmap(it, 2048) }
                    setImageBitmap(
                        albumArtBitmap,
                        RetroColorUtil.getColor(
                            resource.palette,
                            defaultFooterColor()
                        )
                    )
                    deleteAlbumArt = false
                    dataChanged()
                    setResult(Activity.RESULT_OK)
                }

                override fun onLoadFailed(errorDrawable: Drawable?) {
                    super.onLoadFailed(errorDrawable)
                    showToast(
                        R.string.error_load_failed,
                        Toast.LENGTH_LONG
                    )
                }

                override fun setResource(resource: BitmapPaletteWrapper?) {}
            })
    }

    protected val show: AlertDialog
        get() =
            MaterialAlertDialogBuilder(this)
                .setTitle(R.string.update_image)
                .setItems(items.toTypedArray()) { _, position ->
                    when (position) {
                        0 -> startImagePicker()
                        1 -> deleteImage()
                    }
                }
                .setNegativeButton(R.string.action_cancel, null)
                .show()
                .colorButtons()

    private fun startImagePicker() {
        val intent = Intent(Intent.ACTION_GET_CONTENT)
        intent.type = "image/*"
        startActivityForResult(
            Intent.createChooser(
                intent,
                getString(R.string.pick_from_local_storage)
            ), AbsTagEditorActivity.REQUEST_CODE_SELECT_IMAGE
        )
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, intent: Intent?) {
        super.onActivityResult(requestCode, resultCode, intent)
        when (requestCode) {
            AbsTagEditorActivity.REQUEST_CODE_SELECT_IMAGE -> if (resultCode == Activity.RESULT_OK) {
                intent?.data?.let {
                    loadImageFromFile(it)
                }
            }
        }
    }

    companion object {
        val TAG: String = SongTagEditorActivityV2::class.java.simpleName
    }

    private val editorImage: ImageView
        get() = binding.editorImage


    override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
        menuInflater.inflate(R.menu.menu_edit_lyrics, menu)
    }

    override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
        if (menuItem.itemId == R.id.action_go_to_lyrics && song != null) {
            startActivity(
                HolderActivity.starFragmentV4(this, ComnLyricsFragment::class.java, bundleOf(
                EXTRA_SONG to GsonUtil.toJson(song)
            )))
        }
        return true
    }
}
