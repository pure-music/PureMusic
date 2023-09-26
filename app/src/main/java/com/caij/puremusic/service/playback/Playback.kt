/*
 * Copyright (c) 2019 Hemanth Savarala.
 *
 * Licensed under the GNU General Public License v3
 *
 * This is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by
 *  the Free Software Foundation either version 3 of the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 */

package com.caij.puremusic.service.playback

interface Playback {

    val isInitialized: Boolean

    val isPlaying: Boolean

    val audioSessionId: Int

    fun setDataSource(
        url: String, headers: Map<String, String>?, force: Boolean, completion: (success: Boolean) -> Unit,
    )

    var callbacks: PlaybackCallbacks?

    fun start(): Boolean

    fun stop()

    fun release()

    fun pause(): Boolean

    fun duration(): Int

    fun position(): Int

    fun audioFormat(): Any?

    fun seek(whereto: Int): Int

    fun setVolume(vol: Float): Boolean

    fun setAudioSessionId(sessionId: Int): Boolean

    fun setCrossFadeDuration(duration: Int)

    fun setPlaybackSpeedPitch(speed: Float, pitch: Float)

    fun bufferedPosition(): Int

    interface PlaybackCallbacks {

        fun onTrackEnded()

        fun onTrackEndedWithCrossfade()

        fun onPlayError(what: Int, extra: Int)

        fun onPlayStateChanged()
    }
}
