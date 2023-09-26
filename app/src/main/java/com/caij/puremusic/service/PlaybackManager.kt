package com.caij.puremusic.service

import android.content.Context
import android.content.Intent
import android.media.audiofx.AudioEffect
import com.caij.puremusic.service.playback.Playback
import com.caij.puremusic.util.PreferenceUtil


class PlaybackManager(val context: Context) {

    var playback: Playback? = null
    private var playbackLocation = PlaybackLocation.LOCAL

    val isLocalPlayback get() = playbackLocation == PlaybackLocation.LOCAL

    val audioSessionId: Int
        get() = if (playback != null) {
            playback!!.audioSessionId
        } else 0

    val songDurationMillis: Int
        get() = if (playback != null) {
            playback!!.duration()
        } else -1

    val songProgressMillis: Int
        get() = if (playback != null) {
            playback!!.position()
        } else -1

    val bufferedPosition: Int
        get() = if (playback != null) {
            playback!!.bufferedPosition()
        } else -1

    val audioFormat: Any?
        get() = if (playback != null) {
            playback!!.audioFormat()
        } else null

    val isPlaying: Boolean
        get() = playback != null && playback!!.isPlaying

    init {
        playback = createLocalPlayback()
    }

    fun setCallbacks(callbacks: Playback.PlaybackCallbacks) {
        playback?.callbacks = callbacks
    }

    fun play(onNotInitialized: () -> Unit) {
        if (playback != null && !playback!!.isPlaying) {
            if (!playback!!.isInitialized) {
                onNotInitialized()
            } else {
                openAudioEffectSession()
                if (playbackLocation == PlaybackLocation.LOCAL) {
                    AudioFader.startFadeAnimator(playback!!, true)
                }
                playback?.start()
            }
        }
    }

    fun pause(force: Boolean, onPause: () -> Unit) {
        if (playback != null && playback!!.isPlaying) {
            if (force) {
                playback?.pause()
                closeAudioEffectSession()
                onPause()
            } else {
                AudioFader.startFadeAnimator(playback!!, false) {
                    //Code to run when Animator Ends
                    playback?.pause()
                    closeAudioEffectSession()
                    onPause()
                }
            }
        }
    }

    fun seek(millis: Int): Int = playback!!.seek(millis)

    fun setDataSource(
        url: String, headers: Map<String, String>?,
        force: Boolean,
        completion: (success: Boolean) -> Unit,
    ) {
        playback?.setDataSource(url, headers, force, completion)
    }

    fun release() {
        playback?.release()
        playback = null
        closeAudioEffectSession()
    }

    private fun openAudioEffectSession() {
        val intent = Intent(AudioEffect.ACTION_OPEN_AUDIO_EFFECT_CONTROL_SESSION)
        intent.putExtra(AudioEffect.EXTRA_AUDIO_SESSION, audioSessionId)
        intent.putExtra(AudioEffect.EXTRA_PACKAGE_NAME, context.packageName)
        intent.putExtra(AudioEffect.EXTRA_CONTENT_TYPE, AudioEffect.CONTENT_TYPE_MUSIC)
        context.sendBroadcast(intent)
    }

    private fun closeAudioEffectSession() {
        val audioEffectsIntent = Intent(AudioEffect.ACTION_CLOSE_AUDIO_EFFECT_CONTROL_SESSION)
        if (playback != null) {
            audioEffectsIntent.putExtra(AudioEffect.EXTRA_AUDIO_SESSION,
                playback!!.audioSessionId)
        }
        audioEffectsIntent.putExtra(AudioEffect.EXTRA_PACKAGE_NAME, context.packageName)
        context.sendBroadcast(audioEffectsIntent)
    }

    fun switchToLocalPlayback(onChange: (wasPlaying: Boolean, progress: Int) -> Unit) {
        playbackLocation = PlaybackLocation.LOCAL
        switchToPlayback(createLocalPlayback(), onChange)
    }

    fun switchToRemotePlayback(
        castPlayer: CastPlayer,
        onChange: (wasPlaying: Boolean, progress: Int) -> Unit,
    ) {
        playbackLocation = PlaybackLocation.REMOTE
        switchToPlayback(castPlayer, onChange)
    }

    private fun switchToPlayback(
        playback: Playback,
        onChange: (wasPlaying: Boolean, progress: Int) -> Unit,
    ) {
        val oldPlayback = this.playback
        val wasPlaying: Boolean = oldPlayback?.isPlaying == true
        val progress: Int = oldPlayback?.position() ?: 0
        this.playback = playback
        oldPlayback?.stop()
        onChange(wasPlaying, progress)
    }

    private fun createLocalPlayback(): Playback {
        // Set MultiPlayer when crossfade duration is 0 i.e. off
        return MultiPlayer(context)
    }

    fun setPlaybackSpeedPitch(playbackSpeed: Float, playbackPitch: Float) {
        playback?.setPlaybackSpeedPitch(playbackSpeed, playbackPitch)
    }
}

enum class PlaybackLocation {
    LOCAL,
    REMOTE
}