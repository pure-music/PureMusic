package com.caij.puremusic.network

import java.util.*

object SpotifyCountryUtil {

    public val SINGLE_LOCK = Any()

    fun getCountry(): String? {
        var country: String? = Locale.getDefault().country.uppercase()
        if (country == "CN") {
            country = "HK"
        }
        return country
    }
}