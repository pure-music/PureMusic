package com.caij.puremusic.interfaces

import android.view.View
import com.caij.puremusic.model.Genre

interface IGenreClickListener {
    fun onClickGenre(genre: Genre, view: View)
}