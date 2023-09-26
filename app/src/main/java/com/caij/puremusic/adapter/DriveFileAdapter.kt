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
package com.caij.puremusic.adapter

import android.app.Activity
import android.graphics.PorterDuff
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import code.name.monkey.appthemehelper.util.ATHUtil
import com.caij.puremusic.R
import com.caij.puremusic.adapter.base.MediaEntryViewHolder
import com.caij.puremusic.extensions.getTintedDrawable
import com.caij.puremusic.drive.model.DriveFile
import java.text.DecimalFormat
import kotlin.math.log10
import kotlin.math.pow

class DriveFileAdapter(
    private val activity: Activity,
    private var dataSet: List<DriveFile>,
    private val callbacks: com.caij.puremusic.adapter.ICallbacks,
) : RecyclerView.Adapter<DriveFileAdapter.ViewHolder>() {

    override fun getItemViewType(position: Int): Int {
        return if (dataSet[position].isDirectory) FOLDER else FILE
    }

    fun swapDataSet(songFiles: List<DriveFile>) {
        this.dataSet = songFiles
        notifyDataSetChanged()
    }

    fun getDataSet(): List<DriveFile> {
        return dataSet
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(activity).inflate(R.layout.item_list, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, index: Int) {
        val file = dataSet[index]
        holder.itemView.isActivated = false
        holder.title?.text = getFileTitle(file)
        if (holder.text != null) {
            if (holder.itemViewType == FILE) {
                holder.text?.text = getFileText(file)
            } else {
                holder.text?.isVisible = false
            }
        }

        if (holder.image != null) {
            loadFileImage(file, holder)
        }
    }

    private fun getFileTitle(file: DriveFile): String {
        return file.fileName
    }

    private fun getFileText(file: DriveFile): String? {
        return if (file.isDirectory) null else readableFileSize(file.fileLength)
    }

    private fun loadFileImage(file: DriveFile, holder: ViewHolder) {
        val iconColor = ATHUtil.resolveColor(activity, androidx.appcompat.R.attr.colorControlNormal)
        if (file.isDirectory) {
            holder.image?.let {
                it.setColorFilter(iconColor, PorterDuff.Mode.SRC_IN)
                it.setImageResource(R.drawable.ic_folder)
            }
            holder.imageTextContainer?.setCardBackgroundColor(
                ATHUtil.resolveColor(
                    activity,
                    com.google.android.material.R.attr.colorSurface
                )
            )
        } else {
            val error = activity.getTintedDrawable(R.drawable.baseline_insert_drive_file_24, iconColor)
            holder.image?.let {
                it.setImageDrawable(error)
            }
        }
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }


    inner class ViewHolder(itemView: View) : MediaEntryViewHolder(itemView) {

        init {
            if (imageTextContainer != null) {
                imageTextContainer?.cardElevation = 0f
            }
        }

        override fun onClick(v: View?) {
            val position = layoutPosition
            if (isPositionInRange(position)) {
                val file = dataSet[position]
                if (file.isDirectory) {
                    callbacks.onFolderClicked(file)
                } else {
                    callbacks.onFileClicked(position, file)
                }
            }
        }

        override fun onLongClick(v: View?): Boolean {
            val position = layoutPosition
            return isPositionInRange(position)
        }

        private fun isPositionInRange(position: Int): Boolean {
            return position >= 0 && position < dataSet.size
        }
    }

    companion object {

        private const val FILE = 0
        private const val FOLDER = 1

        fun readableFileSize(size: Long): String {
            if (size <= 0) return "$size B"
            val units = arrayOf("B", "KB", "MB", "GB", "TB")
            val digitGroups = (log10(size.toDouble()) / log10(1024.0)).toInt()
            return DecimalFormat("#,##0.##").format(size / 1024.0.pow(digitGroups.toDouble())) + " " + units[digitGroups]
        }
    }
}

public interface ICallbacks {
    fun onFolderClicked(file: DriveFile)
    fun onFileClicked(position: Int, file: DriveFile)
}
