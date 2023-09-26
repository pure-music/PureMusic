package com.caij.puremusic.service

import android.animation.Animator
import android.animation.ValueAnimator
import android.media.MediaPlayer
import androidx.core.animation.doOnEnd
import com.caij.puremusic.service.playback.Playback
import com.caij.puremusic.util.PreferenceUtil
import com.caij.video.BaseMediaPlayer

class AudioFader {
    companion object {
        fun startFadeAnimator(
            playback: Playback,
            fadeIn: Boolean, /* fadeIn -> true  fadeOut -> false*/
            callback: Runnable? = null, /* Code to run when Animator Ends*/
        ) {
            val duration = PreferenceUtil.audioFadeDuration.toLong()
            if (duration == 0L) {
                callback?.run()
                return
            }
            val startValue = if (fadeIn) 0f else 1.0f
            val endValue = if (fadeIn) 1.0f else 0f
            val animator = ValueAnimator.ofFloat(startValue, endValue)
            animator.duration = duration
            animator.addUpdateListener { animation: ValueAnimator ->
                playback.setVolume(animation.animatedValue as Float)
            }
            animator.doOnEnd {
                callback?.run()
            }
            animator.start()
        }
    }
}