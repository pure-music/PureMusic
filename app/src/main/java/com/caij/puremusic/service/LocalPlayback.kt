package com.caij.puremusic.service

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.media.AudioAttributes
import android.media.AudioManager
import android.media.MediaPlayer
import android.os.Looper
import androidx.annotation.CallSuper
import androidx.core.content.getSystemService
import androidx.core.net.toUri
import androidx.media.AudioAttributesCompat
import androidx.media.AudioFocusRequestCompat
import androidx.media.AudioManagerCompat
import code.name.monkey.appthemehelper.util.VersionUtils
import com.caij.puremusic.EVENT_SONGS_UPDATE
import com.caij.puremusic.EVENT_SONG_PAUSE
import com.caij.puremusic.EventBus
import com.caij.puremusic.R
import com.caij.puremusic.extensions.showToast
import com.caij.puremusic.service.playback.Playback
import com.caij.puremusic.util.PreferenceUtil.isAudioFocusEnabled
import com.caij.puremusic.util.PreferenceUtil.playbackPitch
import com.caij.puremusic.util.PreferenceUtil.playbackSpeed
import com.caij.video.BaseMediaPlayer
import com.caij.video.PlaybackParamsCompat

abstract class LocalPlayback(val context: Context) : Playback, BaseMediaPlayer.OnCompletionListener,
    BaseMediaPlayer.OnErrorListener,
    BaseMediaPlayer.OnBufferingUpdateListener {

    private var bufferedPercentage: Int = -1

    private val becomingNoisyReceiverIntentFilter =
        IntentFilter(AudioManager.ACTION_AUDIO_BECOMING_NOISY)

    private val audioManager: AudioManager? = context.getSystemService()

    private var becomingNoisyReceiverRegistered = false
    private val becomingNoisyReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            if (intent.action != null
                && intent.action == AudioManager.ACTION_AUDIO_BECOMING_NOISY
            ) {
                try {
                    val serviceIntent = Intent(context, MusicService::class.java)
                    serviceIntent.action = MusicService.ACTION_PAUSE
                    context.startService(serviceIntent)
                } catch (e: Throwable) {
                    EventBus.post(EVENT_SONG_PAUSE)
                }
            }
        }
    }

    private var isPausedByTransientLossOfFocus = false

    private val audioFocusListener = AudioManager.OnAudioFocusChangeListener { focusChange ->
        when (focusChange) {
            AudioManager.AUDIOFOCUS_GAIN -> {
                if (!isPlaying && isPausedByTransientLossOfFocus) {
                    start()
                    callbacks?.onPlayStateChanged()
                    isPausedByTransientLossOfFocus = false
                }
                setVolume(Volume.NORMAL)
            }
            AudioManager.AUDIOFOCUS_LOSS -> {
                // Lost focus for an unbounded amount of time: stop playback and release media playback
                if (!isAudioFocusEnabled) {
                    pause()
                    callbacks?.onPlayStateChanged()
                }
            }
            AudioManager.AUDIOFOCUS_LOSS_TRANSIENT -> {
                // Lost focus for a short time, but we have to stop
                // playback. We don't release the media playback because playback
                // is likely to resume
                val wasPlaying = isPlaying
                pause()
                callbacks?.onPlayStateChanged()
                isPausedByTransientLossOfFocus = wasPlaying
            }
            AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK -> {
                // Lost focus for a short time, but it's ok to keep playing
                // at an attenuated level
                setVolume(Volume.DUCK)
            }
        }
    }

    private val audioFocusRequest: AudioFocusRequestCompat =
        AudioFocusRequestCompat.Builder(AudioManagerCompat.AUDIOFOCUS_GAIN)
            .setOnAudioFocusChangeListener(audioFocusListener)
            .setAudioAttributes(
                AudioAttributesCompat.Builder()
                    .setContentType(AudioAttributesCompat.CONTENT_TYPE_MUSIC).build()
            ).build()


    override fun bufferedPosition(): Int {
        return (bufferedPercentage / 100f * duration()).toInt()
    }

    @CallSuper
    override fun start(): Boolean {
        if (!requestFocus()) {
            context.showToast(R.string.audio_focus_denied)
        }
        registerBecomingNoisyReceiver()
        return true
    }

    @CallSuper
    override fun stop() {
        abandonFocus()
        unregisterBecomingNoisyReceiver()
    }

    @CallSuper
    override fun pause(): Boolean {
        unregisterBecomingNoisyReceiver()
        return true
    }

    /**
     * @param player The [MediaPlayer] to use
     * @param path The path of the file, or the http/rtsp URL of the stream you want to play
     * @return True if the <code>player</code> has been prepared and is ready to play, false otherwise
     */
    fun setDataSourceImpl(
        player: BaseMediaPlayer,
        path: String,
        completion: (success: Boolean) -> Unit,
    ) {
        setDataSourceImpl(player, path, null, completion)
    }

    /**
     * @param player The [MediaPlayer] to use
     * @param path The path of the file, or the http/rtsp URL of the stream you want to play
     * @return True if the <code>player</code> has been prepared and is ready to play, false otherwise
     */
    fun setDataSourceImpl(
        player: BaseMediaPlayer,
        path: String,
        headers: Map<String, String>?,
        completion: (success: Boolean) -> Unit,
    ) {
        if (Thread.currentThread() != Looper.getMainLooper().thread) {
            throw java.lang.IllegalStateException("must man thread")
        }

        player.reset()
        try {
            if (path.startsWith("content://")) {
                player.setDataSource(context, path.toUri(), headers)
            } else {
                player.setDataSource(context, path.toUri(), headers)
            }
            player.setAudioAttributes(
                AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_MEDIA)
                    .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                    .build()
            )
            if (VersionUtils.hasMarshmallow())
                player.setPlaybackParams(PlaybackParamsCompat(playbackPitch, playbackSpeed))

            player.setOnPreparedListener {
                player.setOnPreparedListener(null)
                completion(true)
            }
            player.prepareAsync()
        } catch (e: Exception) {
            completion(false)
            e.printStackTrace()
        }
        player.setOnCompletionListener(this)
        player.setOnErrorListener(this)
        player.setOnBufferingUpdateListener(this)
    }

    override fun onBufferingUpdate(mp: BaseMediaPlayer, percent: Int) {
        this.bufferedPercentage = percent
    }

    private fun unregisterBecomingNoisyReceiver() {
        if (becomingNoisyReceiverRegistered) {
            context.unregisterReceiver(becomingNoisyReceiver)
            becomingNoisyReceiverRegistered = false
        }
    }

    private fun registerBecomingNoisyReceiver() {
        if (!becomingNoisyReceiverRegistered) {
            context.registerReceiver(
                becomingNoisyReceiver,
                becomingNoisyReceiverIntentFilter
            )
            becomingNoisyReceiverRegistered = true
        }
    }

    private fun requestFocus(): Boolean {
        return AudioManagerCompat.requestAudioFocus(
            audioManager!!,
            audioFocusRequest
        ) == AudioManager.AUDIOFOCUS_REQUEST_GRANTED
    }

    private fun abandonFocus() {
        AudioManagerCompat.abandonAudioFocusRequest(audioManager!!, audioFocusRequest)
    }

    object Volume {
        /**
         * The volume we set the media player to when we lose audio focus, but are
         * allowed to reduce the volume instead of stopping playback.
         */
        const val DUCK = 0.2f

        /** The volume we set the media player when we have audio focus.  */
        const val NORMAL = 1.0f
    }

}