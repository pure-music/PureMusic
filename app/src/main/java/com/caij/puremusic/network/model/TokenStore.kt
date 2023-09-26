/*
 *  * Copyright (c)  2021  Shabinder Singh
 *  * This program is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * This program is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  * GNU General Public License for more details.
 *  *
 *  *  You should have received a copy of the GNU General Public License
 *  *  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.caij.puremusic.network.model

import android.content.SharedPreferences
import com.caij.puremusic.App
import com.caij.puremusic.network.authenticateSpotify
import com.caij.puremusic.util.GsonUtil
import com.caij.puremusic.util.SPs
import com.caij.vip.LogUtil
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

object TokenStore {
    private val TAG: String = "TokenStore"
    val sharedPreferences: SharedPreferences = SPs.getGlobalSharedPreferences(App.getContext())

    private fun save(token: TokenData) {
        if (!token.access_token.isNullOrBlank() && token.expires_in != null) {
            sharedPreferences.edit().putString("spotify_token", GsonUtil.toJson(token))
                .putLong("spotify_token_time", System.currentTimeMillis())
                .apply()
        }
    }

    @Synchronized
    fun getToken(): TokenData? {
        val spotifyTokenJson = sharedPreferences.getString("spotify_token", null)
        var token: TokenData? = null
        if (!spotifyTokenJson.isNullOrEmpty()) {
            token = GsonUtil.fromJson(spotifyTokenJson, TokenData::class.java)
        }
        if (token == null) {
            token = authenticateSpotify()
            if (token != null) {
                save(token)
            }
        } else {
            val spotify_token_time = sharedPreferences.getLong("spotify_token_time", 0L)
            if (System.currentTimeMillis() > (spotify_token_time + token.expires_in!! * 1000)) {
                LogUtil.d(TAG, "Requesting New Token")
                token = authenticateSpotify()
                if (token != null) {
                    save(token)
                }
            }
        }
        return token
    }
}
