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
import android.transition.Slide
import android.view.animation.OvershootInterpolator
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.IntentSenderRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
import androidx.core.widget.doAfterTextChanged
import androidx.lifecycle.lifecycleScope
import code.name.monkey.appthemehelper.util.MaterialValueHelper
import code.name.monkey.appthemehelper.util.VersionUtils
import com.caij.puremusic.R
import com.caij.puremusic.databinding.ActivityAlbumTagEditorBinding
import com.caij.puremusic.glide.GlideApp
import com.caij.puremusic.glide.palette.BitmapPaletteWrapper
import com.caij.puremusic.model.ArtworkInfo
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.util.ImageUtil
import com.caij.puremusic.util.RetroColorUtil.generatePalette
import com.caij.puremusic.util.RetroColorUtil.getColor
import com.caij.puremusic.util.logD
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.target.ImageViewTarget
import com.bumptech.glide.request.transition.Transition
import com.caij.lib.toast.ToastUtil
import com.caij.puremusic.EVENT_ALBUMS_UPDATE
import com.caij.puremusic.EVENT_ALBUM_UPDATE
import com.caij.puremusic.EVENT_ARTISTS_UPDATE
import com.caij.puremusic.EVENT_SONGS_UPDATE
import com.caij.puremusic.EventBus
import com.caij.puremusic.activities.base.AbsBaseActivity
import com.caij.puremusic.activities.tageditor.AbsTagEditorActivity.Companion.EXTRA_ID
import com.caij.puremusic.db.model.Album
import com.caij.puremusic.db.model.Artist
import com.caij.puremusic.extensions.*
import com.caij.puremusic.glide.RetroGlideExtension
import com.caij.puremusic.helper.MusicPlayerRemote
import com.caij.puremusic.model.AudioTagInfo
import com.caij.puremusic.repository.RoomRepository
import com.caij.puremusic.util.ArtistUtil
import com.caij.puremusic.util.BaseSongUtil
import com.caij.puremusic.util.CustomAlbumImageUtil
import com.caij.puremusic.util.MusicUtil
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.shape.MaterialShapeDrawable
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.jaudiotagger.tag.FieldKey
import org.koin.java.KoinJavaComponent
import java.io.File
import java.util.*
import kotlin.collections.ArrayList

open class AlbumTagEditorActivityV2 : AbsBaseActivity() {

//    override val bindingInflater: (LayoutInflater) -> ActivityAlbumTagEditorBinding =
//        ActivityAlbumTagEditorBinding::inflate

    private val mRoomRepository = KoinJavaComponent.get<RoomRepository>(RoomRepository::class.java)

    private lateinit var binding: ActivityAlbumTagEditorBinding
    private var albumId: Long = -1L
    private var cacheFiles = listOf<File>()

    private lateinit var launcher: ActivityResultLauncher<IntentSenderRequest>

    private fun windowEnterTransition() {
        val slide = Slide()
        slide.excludeTarget(R.id.appBarLayout, true)
        slide.excludeTarget(R.id.status_bar, true)
        slide.excludeTarget(android.R.id.statusBarBackground, true)
        slide.excludeTarget(android.R.id.navigationBarBackground, true)

        window.enterTransition = slide
    }

    private var albumArtBitmap: Bitmap? = null
    private var deleteAlbumArt: Boolean = false

    private fun setupToolbar() {
        setSupportActionBar(binding.toolbar)
        binding.appBarLayout?.statusBarForeground =
            MaterialShapeDrawable.createWithElevationOverlay(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        albumId = intent.getLongExtra(EXTRA_ID, 0L)
        binding = ActivityAlbumTagEditorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window.sharedElementsUseOverlay = true
        binding.imageContainer.transitionName = getString(R.string.transition_album_art)
        windowEnterTransition()
        setUpViews()
        setupToolbar()

        lifecycleScope.launch(Dispatchers.IO) {
            val album = mRoomRepository.album(albumId)
            withContext(Dispatchers.Main) {
                if (album != null) {
                    fillViewsWithFileTags(album)
                    loadCurrentImage(album)
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
    }

    private fun setUpViews() {
        binding.yearContainer.setTint(false)
        binding.genreContainer.setTint(false)
        binding.albumTitleContainer.setTint(false)
        binding.albumArtistContainer.setTint(false)

        binding.albumText.appHandleColor().doAfterTextChanged { dataChanged() }
        binding.albumArtistText.appHandleColor().doAfterTextChanged { dataChanged() }
        binding.genreTitle.appHandleColor().doAfterTextChanged { dataChanged() }
        binding.yearTitle.appHandleColor().doAfterTextChanged { dataChanged() }

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

    private fun fillViewsWithFileTags(album: Album) {
        binding.albumText.setText(album.albumName)
        binding.albumArtistText.setText(album.artistName)
        binding.genreTitle.setText("")
        binding.yearTitle.setText(album.year.toString())
        logD(album.albumName + album.artistName)
    }

    private fun loadCurrentImage(album: Album) {
        lifecycleScope.launch(Dispatchers.IO) {
            try {
                val model = RetroGlideExtension.getAlbumModel(album)
                val bitmap = GlideApp.with(this@AlbumTagEditorActivityV2)
                    .asBitmap()
                    .albumCoverOptions(album, model)
                    //.checkIgnoreMediaStore()
                    .load(model).submit().get()
                withContext(Dispatchers.Main) {
                    setImageBitmap(
                        bitmap,
                        getColor(
                            generatePalette(bitmap),
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

    private fun loadImageFromFile(selectedFile: Uri?) {
        GlideApp.with(this@AlbumTagEditorActivityV2).asBitmapPalette().load(selectedFile)
            .diskCacheStrategy(DiskCacheStrategy.NONE).skipMemoryCache(true)
            .into(object : ImageViewTarget<BitmapPaletteWrapper>(binding.editorImage) {
                override fun onResourceReady(
                    resource: BitmapPaletteWrapper,
                    transition: Transition<in BitmapPaletteWrapper>?
                ) {
                    getColor(resource.palette, Color.TRANSPARENT)
                    albumArtBitmap = resource.bitmap?.let { ImageUtil.resizeBitmap(it, 2048) }
                    setImageBitmap(
                        albumArtBitmap,
                        getColor(
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

    fun save() {
        hideSoftKeyboard()
        hideFab()
        lifecycleScope.launch(Dispatchers.IO) {
            val songPaths = getSongPaths()
            val songUris = getSongUris()
            val album = mRoomRepository.album(albumId)!!
            val year = try {
                binding.yearTitle.text.toString().toInt()
            } catch (e: Exception) {
                0
            }
            var artistName = binding.albumArtistText.text.toString()
            var newArtist: Artist? = null
            var newArtistId: String? = null
            var needUpdate = false
            val albumName = binding.albumText.text.toString()
            if (artistName.isEmpty()) {
                artistName = BaseSongUtil.DEFAULT_ARTIST
            }
            if (artistName != album.artistName) {
                newArtistId = BaseSongUtil.parseArtistId(artistName)
                val artists = ArrayList<Artist>()
                ArtistUtil.splitIntoArtists(artists, newArtistId, artistName)
                newArtist = artists[0]
                mRoomRepository.insertAllArtists(artists)
                withContext(Dispatchers.Main) {
                    EventBus.post(EVENT_ARTISTS_UPDATE)
                }
                needUpdate = true
            }

            if (albumName != album.albumName) {
                needUpdate = true
            }

            if (year != album.year) {
                needUpdate = true
            }

            if (needUpdate) {
                val newAlbum = Album(
                    albumId,
                    year,
                    album.url,
                    album.dateModified,
                    album.albumId,
                    albumName,
                    newArtist?.id ?: album.artistId,
                    artistName,
                    album.composer,
                    album.songCount,
                    album.sourceType
                )
                val songs = mRoomRepository.songsByAlumId(albumId)
                val newSongs = ArrayList<Song>()
                for (song in songs) {
                    val newSong = Song(
                        song.id,
                        song.title,
                        song.trackNumber,
                        year,
                        song.duration,
                        song.url,
                        song.path,
                        song.dateModified,
                        song.albumId,
                        albumName,
                        newArtistId ?: song.artistId,
                        artistName,
                        song.composer,
                        artistName,
                        song.dateAdded,
                        song.sourceType,
                        song.sourceId,
                        song.size
                    )
                    newSongs.add(newSong)
                }
                mRoomRepository.insertAllSongs(newSongs)
                mRoomRepository.addOrReplaceAlbum(newAlbum)
            }

            if (deleteAlbumArt) {
                CustomAlbumImageUtil.getInstance(this@AlbumTagEditorActivityV2).resetCustomAlbumImage(album)
            } else if (albumArtBitmap != null) {
                CustomAlbumImageUtil.getInstance(this@AlbumTagEditorActivityV2).setCustomAlbumImage(album, albumArtBitmap!!)
            }

            withContext(Dispatchers.Main) {
                EventBus.post(EVENT_ALBUMS_UPDATE)
                EventBus.post(EVENT_SONGS_UPDATE)
                EventBus.post(EVENT_ALBUM_UPDATE, album.albumId)
                MusicPlayerRemote.clearQueue()
                ToastUtil.show(this@AlbumTagEditorActivityV2, getString(R.string.edit_success))
            }

            if (songPaths.isNotEmpty()) {
                val fieldKeyValueMap = EnumMap<FieldKey, String>(FieldKey::class.java)
                fieldKeyValueMap[FieldKey.ALBUM] = albumName
                // android seems not to recognize album_artist field so we additionally write the normal artist field
                fieldKeyValueMap[FieldKey.ARTIST] = artistName
                fieldKeyValueMap[FieldKey.ALBUM_ARTIST] = albumName
                fieldKeyValueMap[FieldKey.YEAR] = year.toString()

                withContext(Dispatchers.Main) {
                    writeValuesToFiles(
                        fieldKeyValueMap,
                        when {
                            deleteAlbumArt -> ArtworkInfo(albumId, null)
                            albumArtBitmap == null -> null
                            else -> ArtworkInfo(albumId, albumArtBitmap!!)
                        }, songPaths, songUris)
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
                    this@AlbumTagEditorActivityV2, AudioTagInfo(
                        songPaths,
                        fieldKeyValueMap,
                        artworkInfo
                    )
                )
                val pendingIntent = MediaStore.createWriteRequest(contentResolver, songUris)

                launcher.launch(IntentSenderRequest.Builder(pendingIntent).build())
            } else {
                TagWriter.writeTagsToFiles(
                    this@AlbumTagEditorActivityV2, AudioTagInfo(
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
            TagWriter.scan(this@AlbumTagEditorActivityV2, songPaths)
        }
    }

    private fun getSongPaths(): List<String> {
        val songs = mRoomRepository.songsByAlumId(albumId)
        return songs.filter {
            it.isLocal
        }.map(Song::url)
    }

    private fun getSongUris(): List<Uri> {
        val songs = mRoomRepository.songsByAlumId(albumId)
        return songs.filter {
            it.isLocal
        }.map {
            MusicUtil.getSongFileUri(it.id)
        }
    }

    fun setColors(color: Int) {
        binding.saveTags.backgroundTintList = ColorStateList.valueOf(color)
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

    private val editorImage: ImageView
        get() = binding.editorImage

    private lateinit var items: List<String>

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
        val TAG: String = AlbumTagEditorActivityV2::class.java.simpleName
    }
}
