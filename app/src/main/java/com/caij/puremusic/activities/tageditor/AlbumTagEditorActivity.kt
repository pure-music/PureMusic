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
import android.content.res.ColorStateList
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Bundle
import android.transition.Slide
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged
import code.name.monkey.appthemehelper.util.MaterialValueHelper
import com.caij.puremusic.R
import com.caij.puremusic.databinding.ActivityAlbumTagEditorBinding
import com.caij.puremusic.glide.GlideApp
import com.caij.puremusic.glide.palette.BitmapPaletteWrapper
import com.caij.puremusic.model.ArtworkInfo
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.util.ImageUtil
import com.caij.puremusic.util.MusicUtil
import com.caij.puremusic.util.RetroColorUtil.generatePalette
import com.caij.puremusic.util.RetroColorUtil.getColor
import com.caij.puremusic.util.logD
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.target.ImageViewTarget
import com.bumptech.glide.request.transition.Transition
import com.caij.puremusic.extensions.*
import com.google.android.material.shape.MaterialShapeDrawable
import org.jaudiotagger.tag.FieldKey
import java.util.*

class AlbumTagEditorActivity : AbsTagEditorActivity<ActivityAlbumTagEditorBinding>() {

    override val bindingInflater: (LayoutInflater) -> ActivityAlbumTagEditorBinding =
        ActivityAlbumTagEditorBinding::inflate

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
        window.sharedElementsUseOverlay = true
        binding.imageContainer.transitionName = getString(R.string.transition_album_art)
        windowEnterTransition()
        setUpViews()
        setupToolbar()
    }

    private fun setUpViews() {
        fillViewsWithFileTags()

        binding.yearContainer.setTint(false)
        binding.genreContainer.setTint(false)
        binding.albumTitleContainer.setTint(false)
        binding.albumArtistContainer.setTint(false)

        binding.albumText.appHandleColor().doAfterTextChanged { dataChanged() }
        binding.albumArtistText.appHandleColor().doAfterTextChanged { dataChanged() }
        binding.genreTitle.appHandleColor().doAfterTextChanged { dataChanged() }
        binding.yearTitle.appHandleColor().doAfterTextChanged { dataChanged() }
    }

    private fun fillViewsWithFileTags() {
        binding.albumText.setText(albumTitle)
        binding.albumArtistText.setText(albumArtistName)
        binding.genreTitle.setText(genreName)
        binding.yearTitle.setText(songYear)
        logD(albumTitle + albumArtistName)
    }

    override fun loadCurrentImage() {
        val bitmap = albumArt
        setImageBitmap(
            bitmap,
            getColor(
                generatePalette(bitmap),
                defaultFooterColor()
            )
        )
        deleteAlbumArt = false
    }

    private fun toastLoadingFailed() {
        showToast(R.string.could_not_download_album_cover)
    }

    override fun searchImageOnWeb() {
        searchWebFor(binding.albumText.text.toString(), binding.albumArtistText.text.toString())
    }

    override fun deleteImage() {
        setImageBitmap(
            BitmapFactory.decodeResource(resources, R.drawable.default_audio_art),
            defaultFooterColor()
        )
        deleteAlbumArt = true
        dataChanged()
    }

    override fun loadImageFromFile(selectedFile: Uri?) {
        GlideApp.with(this@AlbumTagEditorActivity).asBitmapPalette().load(selectedFile)
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

    override fun save() {
        val fieldKeyValueMap = EnumMap<FieldKey, String>(FieldKey::class.java)
        fieldKeyValueMap[FieldKey.ALBUM] = binding.albumText.text.toString()
        // android seems not to recognize album_artist field so we additionally write the normal artist field
        fieldKeyValueMap[FieldKey.ARTIST] = binding.albumArtistText.text.toString()
        fieldKeyValueMap[FieldKey.ALBUM_ARTIST] = binding.albumArtistText.text.toString()
        fieldKeyValueMap[FieldKey.GENRE] = binding.genreTitle.text.toString()
        fieldKeyValueMap[FieldKey.YEAR] = binding.yearTitle.text.toString()

        writeValuesToFiles(
            fieldKeyValueMap,
            when {
                deleteAlbumArt -> ArtworkInfo(id.toLong(), null)
                albumArtBitmap == null -> null
                else -> ArtworkInfo(id.toLong(), albumArtBitmap!!)
            }
        )
    }

    override fun getSongPaths(): List<String> {
        val album = repository.albumById(id.toLong())
        if (album != null) {
            val songs = repository.getAlbumSongs(album.id)
            return songs.map(Song::url)
        }
        return emptyList()
    }

    override fun getSongUris(): List<Uri> {
        val album = repository.albumById(id.toLong())
        if (album != null) {
            val songs = repository.getAlbumSongs(album.id)
            return songs.map {
                MusicUtil.getSongFileUri(it.id)
            }
        }
        return emptyList()
    }

    override fun setColors(color: Int) {
        super.setColors(color)
        saveFab.backgroundTintList = ColorStateList.valueOf(color)
        saveFab.backgroundTintList = ColorStateList.valueOf(color)
        ColorStateList.valueOf(
            MaterialValueHelper.getPrimaryTextColor(
                this,
                color.isColorLight
            )
        ).also {
            saveFab.iconTint = it
            saveFab.setTextColor(it)
        }
    }


    override val editorImage: ImageView
        get() = binding.editorImage

    companion object {

        val TAG: String = AlbumTagEditorActivity::class.java.simpleName
    }
}
