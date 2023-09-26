package com.caij.puremusic.model.smartplaylist

import androidx.annotation.DrawableRes
import kotlin.math.abs

object PlaylistIdGenerator {

    operator fun invoke(name: String, @DrawableRes iconRes: Int): Long {
        return abs(31L * name.hashCode() + iconRes * name.hashCode() * 31L * 31L)
    }

}