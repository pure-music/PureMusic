package com.caij.puremusic.model.smartplaylist

import android.os.Parcelable
import com.caij.puremusic.App
import com.caij.puremusic.R
import com.caij.puremusic.db.model.Song
import kotlinx.parcelize.Parcelize

@Parcelize
class ShuffleAllPlaylist : AbsSmartPlaylist(
    name = App.getContext().getString(R.string.action_shuffle_all),
    iconRes = R.drawable.ic_shuffle
), Parcelable {
    override fun songs(): List<Song> {
        return songRepository.songsDefaultOrder()
    }
}