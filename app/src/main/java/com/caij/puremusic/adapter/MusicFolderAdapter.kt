package com.caij.puremusic.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.caij.adapter.BaseViewHolder
import com.caij.adapter.ExtendBaseAdapter
import com.caij.puremusic.databinding.ItemMusicSourceFolderBinding
import com.caij.puremusic.db.model.Folder

class MusicFolderAdapter(ui: Any) : ExtendBaseAdapter<FolderWrapper, MusicFolderAdapter.ViewHolder>(ui) {

    private var counts: List<Int>? = null

    open inner class ViewHolder(itemView: View, val itemMusicSourceFolderBinding: ItemMusicSourceFolderBinding) :
        BaseViewHolder(itemView) {
    }

    override fun onCreateViewHolderInner(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemMusicSourceFolderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding.root, binding)
    }

    fun setCounts(counts: List<Int>) {
        this.counts = counts
    }

    override fun onBindViewHolderInner(holder: ViewHolder, position: Int) {
        super.onBindViewHolderInner(holder, position)
        val folderWrapper = getItem(position)
        val data = folderWrapper.folder
        val count = folderWrapper.count
        val desc = String.format("(%d) %s", count, data.desc)
        holder.itemMusicSourceFolderBinding.musicSystemFolderManagerSetting.setTitle(data.title)
        holder.itemMusicSourceFolderBinding.musicSystemFolderManagerSetting.setText(desc)
        holder.itemMusicSourceFolderBinding.actionDelete.setOnClickListener {
            holder.mInOnClickListener.onClick(it)
        }
        holder.itemMusicSourceFolderBinding.actionSync.setOnClickListener {
            holder.mInOnClickListener.onClick(it)
        }
    }

}

class FolderWrapper(val folder: Folder, var count: Int)