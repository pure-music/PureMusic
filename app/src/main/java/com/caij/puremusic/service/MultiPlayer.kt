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
package com.caij.puremusic.service

import android.content.Context
import android.os.PowerManager
import code.name.monkey.appthemehelper.util.VersionUtils
import com.caij.puremusic.ThreadManager
import com.caij.puremusic.extensions.*
import com.caij.puremusic.service.playback.Playback.PlaybackCallbacks
import com.caij.puremusic.util.*
import com.caij.video.BaseMediaPlayer
import com.caij.video.PlaybackParamsCompat
import com.google.android.exoplayer2.MediaMetadata


/**
 * @author Andrew Neal, Karim Abou Zeid (kabouzeid)
 */
class MultiPlayer(context: Context) : LocalPlayback(context) {
    private var mCurrentMediaPlayer = OkhttpExoMediaPlayer(context, ThreadManager.getInstance().NET_WORK_EXECUTOR)
    override var callbacks: PlaybackCallbacks? = null

    /**
     * @return True if the player is ready to go, false otherwise
     */
    override var isInitialized = false
        private set

    init {
        mCurrentMediaPlayer.setWakeMode(context, PowerManager.PARTIAL_WAKE_LOCK)
    }

    /**
     * @param song The song object you want to play
     * @return True if the `player` has been prepared and is ready to play, false otherwise
     */
    override fun setDataSource(
        url: String, headers: Map<String, String>?,
        force: Boolean,
        completion: (success: Boolean) -> Unit,
    ) {
        isInitialized = false

        setDataSourceImpl(mCurrentMediaPlayer, url, headers) { success ->
            isInitialized = success
            completion(isInitialized)
        }

        mCurrentMediaPlayer
    }

    /**
     * Starts or resumes playback.
     */
    override fun start(): Boolean {
        super.start()
        return try {
            mCurrentMediaPlayer.start()
            true
        } catch (e: IllegalStateException) {
            false
        }
    }

    /**
     * Resets the MediaPlayer to its uninitialized state.
     */
    override fun stop() {
        super.stop()
        mCurrentMediaPlayer.reset()
        isInitialized = false
    }

    /**
     * Releases resources associated with this MediaPlayer object.
     */
    override fun release() {
        stop()
        mCurrentMediaPlayer.release()
    }

    /**
     * Pauses playback. Call start() to resume.
     */
    override fun pause(): Boolean {
        super.pause()
        return try {
            mCurrentMediaPlayer.pause()
            true
        } catch (e: IllegalStateException) {
            false
        }
    }

    /**
     * Checks whether the MultiPlayer is playing.
     */
    override val isPlaying: Boolean
        get() = isInitialized && mCurrentMediaPlayer.isPlaying

    /**
     * Gets the duration of the file.
     *
     * @return The duration in milliseconds
     */
    override fun duration(): Int {
        return if (!this.isInitialized) {
            -1
        } else try {
            mCurrentMediaPlayer.duration.toInt()
        } catch (e: IllegalStateException) {
            -1
        }
    }

    /**
     * Gets the current playback position.
     *
     * @return The current position in milliseconds
     */
    override fun position(): Int {
        return if (!this.isInitialized) {
            -1
        } else try {
            mCurrentMediaPlayer.currentPosition.toInt()
        } catch (e: IllegalStateException) {
            -1
        }
    }

    override fun audioFormat(): Any? {
        return if (!this.isInitialized) {
            null
        } else try {
            mCurrentMediaPlayer.audioFormat
            mCurrentMediaPlayer.audioFormat
        } catch (e: Exception) {
            null
        }
    }

    /**
     * Gets the current playback position.
     *
     * @param whereto The offset in milliseconds from the start to seek to
     * @return The offset in milliseconds from the start to seek to
     */
    override fun seek(whereto: Int): Int {
        return try {
            mCurrentMediaPlayer.seekTo(whereto)
            whereto
        } catch (e: IllegalStateException) {
            -1
        }
    }

    override fun setVolume(vol: Float): Boolean {
        return try {
            mCurrentMediaPlayer.setVolume(vol, vol)
            true
        } catch (e: IllegalStateException) {
            false
        }
    }

    /**
     * Sets the audio session ID.
     *
     * @param sessionId The audio session ID
     */
    override fun setAudioSessionId(sessionId: Int): Boolean {
        return try {
            // TODO:
//            mCurrentMediaPlayer.audioSessionId = sessionId
            true
        } catch (e: IllegalArgumentException) {
            false
        } catch (e: IllegalStateException) {
            false
        }
    }

    /**
     * Returns the audio session ID.
     *
     * @return The current audio session ID.
     */
    override val audioSessionId: Int
        get() = mCurrentMediaPlayer.audioSessionId

    override fun onError(mp: BaseMediaPlayer?, what: Int, extra: Int): Boolean {
        isInitialized = false
        mCurrentMediaPlayer.release()
        mCurrentMediaPlayer = OkhttpExoMediaPlayer(context, ThreadManager.getInstance().NET_WORK_EXECUTOR)
        mCurrentMediaPlayer.setWakeMode(context, PowerManager.PARTIAL_WAKE_LOCK)

        callbacks?.onPlayError(what, extra)
        logE(what.toString() + extra)
        return false
    }

    override fun onCompletion(mp: BaseMediaPlayer) {
        callbacks?.onTrackEnded()
    }

    override fun setCrossFadeDuration(duration: Int) {}

    override fun setPlaybackSpeedPitch(speed: Float, pitch: Float) {
        mCurrentMediaPlayer.setPlaybackSpeedPitch(speed, pitch)
    }

    companion object {
        val TAG: String = MultiPlayer::class.java.simpleName
    }
}

fun BaseMediaPlayer.setPlaybackSpeedPitch(speed: Float, pitch: Float) {
    if (VersionUtils.hasMarshmallow()) {
        val wasPlaying = isPlaying
        setPlaybackParams(PlaybackParamsCompat(pitch, speed))
        if (!wasPlaying) {
            pause()
        }
    }
}