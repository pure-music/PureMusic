package com.caij.puremusic.model.smartplaylist

import androidx.annotation.DrawableRes
import com.caij.puremusic.R
import com.caij.puremusic.model.AbsCustomPlaylist

abstract class AbsSmartPlaylist(
    name: String,
    @DrawableRes val iconRes: Int = R.drawable.ic_queue_music
) : AbsCustomPlaylist(
    id = PlaylistIdGenerator(name, iconRes),
    name = name
)