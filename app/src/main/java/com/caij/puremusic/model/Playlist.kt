package com.caij.puremusic.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import org.koin.core.component.KoinComponent

@Parcelize
open class Playlist(
    val id: Long,
    val name: String
) : Parcelable, KoinComponent {

    companion object {
        val empty = Playlist(-1, "")
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Playlist

        if (id != other.id) return false
        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + name.hashCode()
        return result
    }
}