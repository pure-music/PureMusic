package com.caij.puremusic.activities.base

import com.caij.puremusic.cast.RetroSessionManagerListener
import com.caij.puremusic.cast.RetroWebServer
import com.caij.puremusic.helper.MusicPlayerRemote
import com.caij.puremusic.service.CastPlayer
import com.caij.puremusic.activities.base.AbsSlidingMusicPanelActivity
import com.google.android.gms.cast.framework.CastContext
import com.google.android.gms.cast.framework.CastSession
import com.google.android.gms.cast.framework.SessionManager
import com.google.android.gms.common.ConnectionResult
import com.google.android.gms.common.GoogleApiAvailability
import org.koin.android.ext.android.inject


abstract class AbsCastActivity : AbsSlidingMusicPanelActivity() {

    private var mCastSession: CastSession? = null
    private val sessionManager: SessionManager? by lazy {
        try {
            CastContext.getSharedInstance(this).sessionManager
        } catch (e: Throwable) {
            null
        }
    }

    private val webServer: RetroWebServer by inject()

    private val playServicesAvailable: Boolean by lazy {
        try {
            GoogleApiAvailability
                .getInstance().isGooglePlayServicesAvailable(this) == ConnectionResult.SUCCESS
        } catch (e: Throwable) {
            false
        }
    }

    private val sessionManagerListener by lazy {
        object : RetroSessionManagerListener {
            override fun onSessionStarting(castSession: CastSession) {
                webServer.start()
            }

            override fun onSessionStarted(castSession: CastSession, p1: String) {
                invalidateOptionsMenu()
                mCastSession = castSession
                MusicPlayerRemote.switchToRemotePlayback(CastPlayer(castSession))
            }

            override fun onSessionEnded(castSession: CastSession, p1: Int) {
                invalidateOptionsMenu()
                if (mCastSession == castSession) {
                    mCastSession = null
                }
                MusicPlayerRemote.switchToLocalPlayback()
                webServer.stop()
            }

            override fun onSessionResumed(castSession: CastSession, p1: Boolean) {
                invalidateOptionsMenu()
                mCastSession = castSession
                webServer.start()
                MusicPlayerRemote.switchToRemotePlayback(CastPlayer(castSession))
            }

            override fun onSessionSuspended(castSession: CastSession, p1: Int) {
                invalidateOptionsMenu()
                if (mCastSession == castSession) {
                    mCastSession = null
                }
                MusicPlayerRemote.switchToLocalPlayback()
                webServer.stop()
            }
        }
    }

    override fun onResume() {
        super.onResume()
        if (playServicesAvailable && sessionManager != null) {
            sessionManager!!.addSessionManagerListener(
                sessionManagerListener,
                CastSession::class.java
            )
            if (mCastSession == null) {
                mCastSession = sessionManager!!.currentCastSession
            }
        }
    }

    override fun onPause() {
        super.onPause()
        if (playServicesAvailable && sessionManager != null) {
            sessionManager!!.removeSessionManagerListener(
                sessionManagerListener,
                CastSession::class.java
            )
            mCastSession = null
        }
    }
}