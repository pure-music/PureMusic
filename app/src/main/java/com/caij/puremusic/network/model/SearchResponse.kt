package com.caij.puremusic.network.model

import androidx.annotation.Keep

@Keep
data class SearchResponse(val artists: ArtistWrapper?, val albums: ArtistWrapper?, val tracks: ArtistWrapper?)

@Keep
data class ArtistWrapper(val href: String?, val total: Int?, val items: List<Artist>?)

