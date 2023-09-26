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

import StatusBarLyric.API.StatusBarLyric
import android.annotation.SuppressLint
import android.app.NotificationManager
import android.app.PendingIntent
import android.appwidget.AppWidgetManager
import android.bluetooth.BluetoothDevice
import android.content.*
import android.content.SharedPreferences.OnSharedPreferenceChangeListener
import android.content.pm.ServiceInfo
import android.database.ContentObserver
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.media.AudioManager
import android.os.*
import android.os.Build.VERSION
import android.os.Build.VERSION_CODES
import android.os.PowerManager.WakeLock
import android.provider.MediaStore
import android.support.v4.media.MediaBrowserCompat
import android.support.v4.media.MediaMetadataCompat
import android.support.v4.media.session.MediaSessionCompat
import android.support.v4.media.session.PlaybackStateCompat
import android.util.Log
import android.widget.Toast
import androidx.core.content.edit
import androidx.core.content.getSystemService
import androidx.media.MediaBrowserServiceCompat
import cn.lyric.getter.api.tools.EventTools
import code.name.monkey.appthemehelper.util.VersionUtils
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.target.Target
import com.bumptech.glide.request.transition.Transition
import com.caij.lib.lifemanager.ActivityStackManager
import com.caij.puremusic.*
import com.caij.puremusic.activities.LockScreenActivity
import com.caij.puremusic.appwidgets.*
import com.caij.puremusic.auto.AutoMediaIDHelper
import com.caij.puremusic.auto.AutoMusicProvider
import com.caij.puremusic.db.DatabaseUtil
import com.caij.puremusic.db.model.Album
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.drive.DriveFactory
import com.caij.puremusic.drive.DriveFactorys
import com.caij.puremusic.extensions.*
import com.caij.puremusic.fragments.LibraryViewModel
import com.caij.puremusic.fragments.folder.FolderUtil
import com.caij.puremusic.glide.BlurTransformation
import com.caij.puremusic.glide.GlideApp
import com.caij.puremusic.glide.RetroGlideExtension.getDefaultTransition
import com.caij.puremusic.glide.RetroGlideExtension.getSongModel
import com.caij.puremusic.helper.MusicProgressViewUpdateHelper
import com.caij.puremusic.helper.ShuffleHelper.makeShuffleList
import com.caij.puremusic.lyrics.LrcEntry
import com.caij.puremusic.lyrics.LrcUtils
import com.caij.puremusic.lyrics.SimpleLrcView
import com.caij.puremusic.model.smartplaylist.AbsSmartPlaylist
import com.caij.puremusic.providers.MusicPlaybackQueueStore
import com.caij.puremusic.repository.RoomRepository
import com.caij.puremusic.service.notification.PlayingNotification
import com.caij.puremusic.service.notification.PlayingNotification.Companion.FLAG_ALWAYS_SHOW_TICKER
import com.caij.puremusic.service.notification.PlayingNotification.Companion.FLAG_ONLY_UPDATE_TICKER
import com.caij.puremusic.service.notification.PlayingNotificationClassic
import com.caij.puremusic.service.notification.PlayingNotificationImpl24
import com.caij.puremusic.service.playback.Playback
import com.caij.puremusic.service.playback.Playback.PlaybackCallbacks
import com.caij.puremusic.util.*
import com.caij.puremusic.util.GsonUtil.toJson
import com.caij.puremusic.util.MusicUtil.toggleFavorite
import com.caij.puremusic.util.PreferenceUtil.isAlbumArtOnLockScreen
import com.caij.puremusic.util.PreferenceUtil.isBluetoothSpeaker
import com.caij.puremusic.util.PreferenceUtil.isBlurredAlbumArt
import com.caij.puremusic.util.PreferenceUtil.isClassicNotification
import com.caij.puremusic.util.PreferenceUtil.isHeadsetPlugged
import com.caij.puremusic.util.PreferenceUtil.isLockScreen
import com.caij.puremusic.util.PreferenceUtil.isPauseOnZeroVolume
import com.caij.puremusic.util.PreferenceUtil.playbackPitch
import com.caij.puremusic.util.PreferenceUtil.playbackSpeed
import com.caij.puremusic.util.PreferenceUtil.registerOnSharedPreferenceChangedListener
import com.caij.puremusic.util.PreferenceUtil.unregisterOnSharedPreferenceChangedListener
import com.caij.puremusic.volume.AudioVolumeObserver
import com.caij.puremusic.volume.OnAudioVolumeChangedListener
import com.caij.video.BaseMediaPlayer
import com.caij.vip.DonatedActivity
import com.google.android.exoplayer2.Format
import com.google.android.exoplayer2.MediaMetadata
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import org.koin.java.KoinJavaComponent.get
import java.util.*


/**
 * @author Karim Abou Zeid (kabouzeid), Andrew Neal. Modified by Prathamesh More
 */
class MusicService : MediaBrowserServiceCompat(),
    OnSharedPreferenceChangeListener, PlaybackCallbacks, OnAudioVolumeChangedListener,
    EventObserver, LyricsProgressCallback {

    private lateinit var statusBarLyric: StatusBarLyric
    private var preShowLyrics: String? = null

    private val musicBind: IBinder = MusicBinder()

    @JvmField
    var nextPosition = -1

    @JvmField
    var pendingQuit = false

    private lateinit var playbackManager: PlaybackManager

    val playback: Playback? get() = playbackManager.playback

    private var mPackageValidator: PackageValidator? = null
    private val mMusicProvider = get<AutoMusicProvider>(AutoMusicProvider::class.java)
    private val mMusicPlaybackQueueStore = get<MusicPlaybackQueueStore>(MusicPlaybackQueueStore::class.java)
    private val mRoomRepository = get<RoomRepository>(RoomRepository::class.java)
    private val mLibraryViewModel = get<LibraryViewModel>(LibraryViewModel::class.java)
    private var trackEndedByCrossfade = false
    private val serviceScope = CoroutineScope(Job() + Main)

    @JvmField
    var position = -1
    private val appWidgetBig = AppWidgetBig.instance
    private val appWidgetCard = AppWidgetCard.instance
    private val appWidgetClassic = AppWidgetClassic.instance
    private val appWidgetSmall = AppWidgetSmall.instance
    private val appWidgetText = AppWidgetText.instance
    private val appWidgetMd3 = AppWidgetMD3.instance
    private val appWidgetCircle = AppWidgetCircle.instance
    private val widgetIntentReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            val command = intent.getStringExtra(EXTRA_APP_WIDGET_NAME)
            val ids = intent.getIntArrayExtra(AppWidgetManager.EXTRA_APPWIDGET_IDS)
            if (command != null) {
                when (command) {
                    AppWidgetClassic.NAME -> {
                        appWidgetClassic.performUpdate(this@MusicService, ids)
                    }
                    AppWidgetSmall.NAME -> {
                        appWidgetSmall.performUpdate(this@MusicService, ids)
                    }
                    AppWidgetBig.NAME -> {
                        appWidgetBig.performUpdate(this@MusicService, ids)
                    }
                    AppWidgetCard.NAME -> {
                        appWidgetCard.performUpdate(this@MusicService, ids)
                    }
                    AppWidgetText.NAME -> {
                        appWidgetText.performUpdate(this@MusicService, ids)
                    }
                    AppWidgetMD3.NAME -> {
                        appWidgetMd3.performUpdate(this@MusicService, ids)
                    }
                    AppWidgetCircle.NAME -> {
                        appWidgetCircle.performUpdate(this@MusicService, ids)
                    }
                }
            }
        }
    }

    private val bluetoothConnectedIntentFilter = IntentFilter(BluetoothDevice.ACTION_ACL_CONNECTED)
    private var bluetoothConnectedRegistered = false
    private val headsetReceiverIntentFilter = IntentFilter(Intent.ACTION_HEADSET_PLUG)
    private var headsetReceiverRegistered = false
    private var mediaSession: MediaSessionCompat? = null
    private var mediaStoreObserver: ContentObserver? = null
    private var musicPlayerHandlerThread: HandlerThread? = null
    private var notHandledMetaChangedForCurrentTrack = false
    private var originalPlayingQueue = ArrayList<Song>()

    private lateinit var mMainHandler: Handler

    @JvmField
    var playingQueue = ArrayList<Song>()

    private var playerHandler: Handler? = null

    private var playingNotification: PlayingNotification? = null

    private val updateFavoriteReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            isCurrentFavorite { isFavorite ->
                if (!isForeground) {
                    playingNotification?.updateMetadata(currentSong) {
                        playingNotification?.setPlaying(isPlaying)
                        playingNotification?.updateFavorite(isFavorite)
                        startForegroundOrNotify()
                    }
                } else {
                    playingNotification?.updateFavorite(isFavorite)
                    startForegroundOrNotify()
                }

                appWidgetCircle.notifyChange(this@MusicService, FAVORITE_STATE_CHANGED)
            }
        }
    }

    private val lockScreenReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            if (isLockScreen && isPlaying) {
                val lockIntent = Intent(context, LockScreenActivity::class.java)
                lockIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
                startActivity(lockIntent)
            }
        }
    }

    private var queuesRestored = false

    var repeatMode = 0
        private set(value) {
            when (value) {
                REPEAT_MODE_NONE, REPEAT_MODE_ALL, REPEAT_MODE_THIS -> {
                    field = value
                    PreferenceUtil.sharedPreferences.edit {
                        putInt(SAVED_REPEAT_MODE, value)
                    }
                    prepareNext()
                    handleAndSendChangeInternal(REPEAT_MODE_CHANGED)
                }
            }
        }

    @JvmField
    var shuffleMode = 0
    private val songPlayCountHelper = SongPlayCountHelper()

    private val bluetoothReceiver: BroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            val action = intent.action
            if (action != null) {
                if (BluetoothDevice.ACTION_ACL_CONNECTED == action && isBluetoothSpeaker) {
                    @Suppress("Deprecation")
                    if (getSystemService<AudioManager>()!!.isBluetoothA2dpOn) {
                        play()
                    }
                }
            }
        }
    }

    private var receivedHeadsetConnected = false
    private val headsetReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            val action = intent.action
            if (action != null) {
                if (Intent.ACTION_HEADSET_PLUG == action) {
                    when (intent.getIntExtra("state", -1)) {
                        0 -> pause()
                        // Check whether the current song is empty which means the playing queue hasn't restored yet
                        1 -> if (currentSong != BaseSongUtil.emptySong) {
                            play()
                        } else {
                            receivedHeadsetConnected = true
                        }
                    }
                }
            }
        }
    }
    private var throttledSeekHandler: ThrottledSeekHandler? = null
    private var uiThreadHandler: Handler? = null
    private var wakeLock: WakeLock? = null
    private var notificationManager: NotificationManager? = null
    private var isForeground = false
    private lateinit var savePositionHandler: Handler

    override fun onCreate() {
        super.onCreate()
        val powerManager = getSystemService<PowerManager>()
        if (powerManager != null) {
            wakeLock = powerManager.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, javaClass.name)
        }
        wakeLock?.setReferenceCounted(false)
        musicPlayerHandlerThread = HandlerThread("PlaybackHandler")
        musicPlayerHandlerThread?.start()
        playerHandler = Handler(musicPlayerHandlerThread!!.looper)

        playbackManager = PlaybackManager(this)
        playbackManager.setCallbacks(this)
        setupMediaSession()

        uiThreadHandler = Handler(Looper.getMainLooper())
        registerReceiver(widgetIntentReceiver, IntentFilter(APP_WIDGET_UPDATE))
        registerReceiver(updateFavoriteReceiver, IntentFilter(FAVORITE_STATE_CHANGED))
        registerReceiver(lockScreenReceiver, IntentFilter(Intent.ACTION_SCREEN_ON))
        sessionToken = mediaSession?.sessionToken
        notificationManager = getSystemService()
        initNotification()

        throttledSeekHandler = ThrottledSeekHandler(this, Handler(mainLooper))
        savePositionHandler = object : Handler(Looper.getMainLooper()) {
            override fun handleMessage(msg: Message) {
                super.handleMessage(msg)
                if (isPlaying) {
                    savePositionInTrack()
                }
                savePositionHandler.sendEmptyMessageDelayed(0, 10 * 1000)
            }
        }
        savePositionHandler.sendEmptyMessageDelayed(0, 10 * 1000)

        val audioVolumeObserver = AudioVolumeObserver(this)
        audioVolumeObserver.register(AudioManager.STREAM_MUSIC, this)
        registerOnSharedPreferenceChangedListener(this)
        restoreState()
        sendBroadcast(Intent("$RETRO_MUSIC_PACKAGE_NAME.RETRO_MUSIC_SERVICE_CREATED"))
        registerHeadsetEvents()
        registerBluetoothConnected()
        mMusicProvider.setMusicService(this)
        mMainHandler = object : Handler(Looper.getMainLooper()) {
            override fun handleMessage(msg: Message) {
                super.handleMessage(msg)
                if (msg.what == PRELOAD_SONG) {
                    val nextSong = msg.obj as Song
                    CacheUtil.cache(this@MusicService, nextSong.url, null)
                    SongAuthUtil.downServerLyrics(applicationContext, nextSong, false)
                }
            }
        }

        GlobalLyricsManager.registerProgress(this)

        val showPrivacy = SPs.getGlobalSharedPreferences(this).getBoolean(SHOW_PRIVACY, true)
        if (!showPrivacy) {
            registerContentObserver()
        }

        statusBarLyric = StatusBarLyric(this, null, packageName, false)

        EventBus.register(EVENT_SONG_PAUSE, this)
        EventBus.register(EVENT_LYRICS_UPDATE, this)
    }

    private fun registerContentObserver() {
        mediaStoreObserver = MediaStoreObserver(this, playerHandler!!)
        contentResolver.registerContentObserver(
            MediaStore.Audio.Media.EXTERNAL_CONTENT_URI,
            true,
            mediaStoreObserver!!
        )
        contentResolver.registerContentObserver(
            MediaStore.Audio.Media.INTERNAL_CONTENT_URI,
            true,
            mediaStoreObserver!!
        )
    }

    override fun onDestroy() {
        unregisterReceiver(widgetIntentReceiver)
        unregisterReceiver(updateFavoriteReceiver)
        unregisterReceiver(lockScreenReceiver)
        if (headsetReceiverRegistered) {
            unregisterReceiver(headsetReceiver)
            headsetReceiverRegistered = false
        }
        if (bluetoothConnectedRegistered) {
            unregisterReceiver(bluetoothReceiver)
            bluetoothConnectedRegistered = false
        }
        mediaSession?.isActive = false
        quit()
        releaseResources()
        serviceScope.cancel()
        if (mediaStoreObserver != null) {
            contentResolver.unregisterContentObserver(mediaStoreObserver!!)
        }
        unregisterOnSharedPreferenceChangedListener(this)
        wakeLock?.release()
        sendBroadcast(Intent("$RETRO_MUSIC_PACKAGE_NAME.RETRO_MUSIC_SERVICE_DESTROYED"))
        mMainHandler.removeCallbacksAndMessages(null)
        savePositionHandler.removeCallbacksAndMessages(null)
        EventBus.unregister(EVENT_SONG_PAUSE, this)
        GlobalLyricsManager.unregisterProgress(this)
        EventBus.unregister(EVENT_LYRICS_UPDATE, this)
    }

    private fun acquireWakeLock() {
        wakeLock?.acquire(30000)
    }

    private var pausedByZeroVolume = false
    override fun onAudioVolumeChanged(currentVolume: Int, maxVolume: Int) {
        if (isPauseOnZeroVolume) {
            if (isPlaying && currentVolume < 1) {
                pause()
                pausedByZeroVolume = true
            } else if (pausedByZeroVolume && currentVolume >= 1) {
                play()
                pausedByZeroVolume = false
            }
        }
    }

    fun addSong(position: Int, song: Song) {
        playingQueue.add(position, song)
        originalPlayingQueue.add(position, song)
        notifyChange(QUEUE_CHANGED)
    }

    fun addSong(song: Song) {
        playingQueue.add(song)
        originalPlayingQueue.add(song)
        notifyChange(QUEUE_CHANGED)
    }

    fun addSongs(position: Int, songs: List<Song>?) {
        playingQueue.addAll(position, songs!!)
        originalPlayingQueue.addAll(position, songs)
        notifyChange(QUEUE_CHANGED)
    }

    fun addSongs(songs: List<Song>?) {
        playingQueue.addAll(songs!!)
        originalPlayingQueue.addAll(songs)
        notifyChange(QUEUE_CHANGED)
    }

    fun back(force: Boolean) {
//        if (songProgressMillis > 2000) {
//            seek(0)
//        } else {
            playPreviousSong(force)
//        }
    }

    fun clearQueue() {
        playingQueue.clear()
        originalPlayingQueue.clear()
        setPosition(-1)
        notifyChange(QUEUE_CHANGED)
    }

    fun cycleRepeatMode() {
        repeatMode = when (repeatMode) {
            REPEAT_MODE_NONE -> REPEAT_MODE_ALL
            REPEAT_MODE_ALL -> REPEAT_MODE_THIS
            else -> REPEAT_MODE_NONE
        }
    }

    val audioSessionId: Int
        get() = playbackManager.audioSessionId

    val currentSong: Song
        get() = getSongAt(getPosition())

    val nextSong: Song?
        get() = if (isLastTrack && repeatMode == REPEAT_MODE_NONE) {
            null
        } else {
            getSongAt(getNextPosition(false))
        }

    private fun getNextPosition(force: Boolean): Int {
        var position = getPosition() + 1
        when (repeatMode) {
            REPEAT_MODE_ALL -> if (isLastTrack) {
                position = 0
            }
            REPEAT_MODE_THIS -> if (force) {
                if (isLastTrack) {
                    position = 0
                }
            } else {
                position -= 1
            }
            REPEAT_MODE_NONE -> if (isLastTrack) {
                position -= 1
            }
            else -> if (isLastTrack) {
                position -= 1
            }
        }
        return position
    }

    private fun getPosition(): Int {
        return position
    }

    private fun setPosition(position: Int) {
        openTrackAndPrepareNextAt(position) { success ->
            if (success) {
                notifyChange(PLAY_STATE_CHANGED)
            }
        }
    }

    private fun getPreviousPosition(force: Boolean): Int {
        var newPosition = getPosition() - 1
        when (repeatMode) {
            REPEAT_MODE_ALL -> if (newPosition < 0) {
                newPosition = playingQueue.size - 1
            }
            REPEAT_MODE_THIS -> if (force) {
                if (newPosition < 0) {
                    newPosition = playingQueue.size - 1
                }
            } else {
                newPosition = getPosition()
            }
            REPEAT_MODE_NONE -> if (newPosition < 0) {
                newPosition = 0
            }
            else -> if (newPosition < 0) {
                newPosition = 0
            }
        }
        return newPosition
    }

    fun getQueueDurationMillis(position: Int): Long {
        var duration: Long = 0
        for (i in position + 1 until playingQueue.size) {
            duration += playingQueue[i].duration
        }
        return duration
    }

    private fun getShuffleMode(): Int {
        return shuffleMode
    }

    fun setShuffleMode(shuffleMode: Int) {
        PreferenceUtil.sharedPreferences.edit {
            putInt(SAVED_SHUFFLE_MODE, shuffleMode)
        }
        when (shuffleMode) {
            SHUFFLE_MODE_SHUFFLE -> {
                this.shuffleMode = shuffleMode
                makeShuffleList(playingQueue, getPosition())
                position = 0
            }
            SHUFFLE_MODE_NONE -> {
                this.shuffleMode = shuffleMode
                val currentSongId = Objects.requireNonNull(currentSong).id
                playingQueue = ArrayList(originalPlayingQueue)
                var newPosition = 0
                for (song in playingQueue) {
                    if (song.id == currentSongId) {
                        newPosition = playingQueue.indexOf(song)
                    }
                }
                position = newPosition
            }
        }
        handleAndSendChangeInternal(SHUFFLE_MODE_CHANGED)
        notifyChange(QUEUE_CHANGED)
    }

    private fun getSongAt(position: Int): Song {
        return if ((position >= 0) && (position < playingQueue.size)) {
            playingQueue[position]
        } else {
            BaseSongUtil.emptySong
        }
    }

    private fun setSongAt(position: Int, song: Song) {
        if ((position >= 0) && (position < playingQueue.size)) {
            playingQueue[position] = song
        }
    }

    val songDurationMillis: Int
        get() = playbackManager.songDurationMillis

    val songProgressMillis: Int
        get() = playbackManager.songProgressMillis

    val bufferedPosition: Int
        get() = playbackManager.bufferedPosition

    fun handleAndSendChangeInternal(what: String) {
        handleChangeInternal(what)
        sendChangeInternal(what)
    }

    private fun initNotification() {
        playingNotification = if (VERSION.SDK_INT >= VERSION_CODES.N
            && !isClassicNotification
        ) {
            PlayingNotificationImpl24.from(this, notificationManager!!, mediaSession!!)
        } else {
            PlayingNotificationClassic.from(this, notificationManager!!)
        }
    }

    private val isLastTrack: Boolean
        get() = getPosition() == playingQueue.size - 1

    val isPlaying: Boolean
        get() = playbackManager.isPlaying

    fun moveSong(from: Int, to: Int) {
        if (from == to) {
            return
        }
        val currentPosition = getPosition()
        val songToMove = playingQueue.removeAt(from)
        playingQueue.add(to, songToMove)
        if (getShuffleMode() == SHUFFLE_MODE_NONE) {
            val tmpSong = originalPlayingQueue.removeAt(from)
            originalPlayingQueue.add(to, tmpSong)
        }
        when {
            currentPosition in to until from -> {
                position = currentPosition + 1
            }
            currentPosition in (from + 1)..to -> {
                position = currentPosition - 1
            }
            from == currentPosition -> {
                position = to
            }
        }
        notifyChange(QUEUE_CHANGED)
    }

    private fun notifyChange(what: String) {
        handleAndSendChangeInternal(what)
        sendPublicIntent(what)
    }

    override fun onBind(intent: Intent): IBinder {
        // For Android auto, need to call super, or onGetRoot won't be called.
        return if ("android.media.browse.MediaBrowserService" == intent.action) {
            super.onBind(intent)!!
        } else musicBind
    }

    override fun onGetRoot(
        clientPackageName: String,
        clientUid: Int,
        rootHints: Bundle?,
    ): BrowserRoot {


        // Check origin to ensure we're not allowing any arbitrary app to browse app contents
        return if (!getPackageValidator().isKnownCaller(clientPackageName, clientUid)) {
            // Request from an untrusted package: return an empty browser root
            BrowserRoot(AutoMediaIDHelper.MEDIA_ID_EMPTY_ROOT, null)
        } else {
            val browserRootPath = AutoMediaIDHelper.MEDIA_ID_ROOT
            BrowserRoot(browserRootPath, null)
        }
    }

    private fun getPackageValidator(): PackageValidator {
        if (mPackageValidator == null) {
            mPackageValidator = PackageValidator(this, R.xml.allowed_media_browser_callers)
        }
        return mPackageValidator!!
    }

    override fun onLoadChildren(
        parentId: String,
        result: Result<List<MediaBrowserCompat.MediaItem>>,
    ) {
        val data = mMusicProvider.getChildren(parentId, resources)
        result.sendResult(data)
    }

    override fun onSharedPreferenceChanged(
        sharedPreferences: SharedPreferences, key: String,
    ) {
        when (key) {
            PLAYBACK_SPEED, PLAYBACK_PITCH -> {
                updateMediaSessionPlaybackState()
                playbackManager.setPlaybackSpeedPitch(playbackSpeed, playbackPitch)
            }
            ALBUM_ART_ON_LOCK_SCREEN, BLURRED_ALBUM_ART -> updateMediaSessionMetaData(::updateMediaSessionPlaybackState)
            COLORED_NOTIFICATION -> {
                playingNotification?.updateMetadata(currentSong) {
                    playingNotification?.setPlaying(isPlaying)
                    startForegroundOrNotify()
                }
            }
            CLASSIC_NOTIFICATION -> {
                updateNotification()
                playingNotification?.updateMetadata(currentSong) {
                    playingNotification?.setPlaying(isPlaying)
                    startForegroundOrNotify()
                }
            }
            TOGGLE_HEADSET -> registerHeadsetEvents()
        }
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        if (intent != null && intent.action != null) {
            serviceScope.launch {
                restoreQueuesAndPositionIfNecessary()
                when (intent.action) {
                    ACTION_TOGGLE_PAUSE -> if (isPlaying) {
                        pause()
                    } else {
                        play()
                    }
                    ACTION_PAUSE -> pause()
                    ACTION_PLAY -> play()
                    ACTION_PLAY_PLAYLIST -> playFromPlaylist(intent)
                    ACTION_REWIND -> back(true)
                    ACTION_SKIP -> playNextSong(true)
                    ACTION_STOP, ACTION_QUIT -> {
                        pendingQuit = false
                        quit()
                    }
                    ACTION_PENDING_QUIT -> pendingQuit = true
                    TOGGLE_FAVORITE -> toggleFavorite()
                }
            }
        }
        return START_NOT_STICKY
    }

    override fun onTrackEnded() {
        acquireWakeLock()
        // if there is a timer finished, don't continue
        if (pendingQuit
            || repeatMode == REPEAT_MODE_NONE && isLastTrack
        ) {
            notifyChange(PLAY_STATE_CHANGED)
            seek(0)
            if (pendingQuit) {
                pendingQuit = false
                quit()
            }
        } else {
            playNextSong(false)
        }
        releaseWakeLock()
    }

    override fun onTrackEndedWithCrossfade() {
        trackEndedByCrossfade = true
        onTrackEnded()
    }

    override fun onPlayStateChanged() {
        notifyChange(PLAY_STATE_CHANGED)
    }

    override fun onPlayError(what: Int, extra: Int) {
        if (currentSong != BaseSongUtil.emptySong) {
            when (what) {
                BaseMediaPlayer.EXO_MEDIA_ERROR_WHAT_IO -> {
                    when (extra) {
                        BaseMediaPlayer.EXO_MEDIA_ERROR_EXTRA_SECURITY -> {
                            showToast(R.string.play_error_permission)
                        }

                        BaseMediaPlayer.EXO_MEDIA_ERROR_EXTRA_NETWORK -> {
                            showToast(R.string.play_error_no_network)
                        }
                        BaseMediaPlayer.EXO_MEDIA_ERROR_EXTRA_CONN -> {
                            showToast(R.string.play_error_connenct)
                        }
                        else -> {
                            showToast(R.string.unplayable_file)
                        }
                    }
                    notifyChange(PLAY_STATE_CHANGED)
                }
                BaseMediaPlayer.EXO_MEDIA_ERROR_WHAT_RESPONSE_CODE -> {
                    when (extra) {
                        401,403,402 -> {
                            showToast(R.string.play_error_http403)
                        }
                        404 -> {
                            showToast(R.string.play_error_not_exist)
                        }
                        else -> {
                            showToast(R.string.unplayable_file)
                        }
                    }
                    deleteCacheUrl(currentSong, extra)
                    notifyChange(PLAY_STATE_CHANGED)
                }
                BaseMediaPlayer.EXO_MEDIA_ERROR_WHAT_RENDERER -> {
                    showToast(R.string.play_error_unsupport_format)
                    onTrackEnded()
                }
                else -> {
                    showToast(R.string.unplayable_file)
                    onTrackEnded()
                }
            }
        }
    }

    private fun deleteCacheUrl(song: Song, extra: Int) {
        serviceScope.launch(Dispatchers.IO) {
            if (song.sourceType == DriveFactory.TYPE_ADRIVE) {
                if (extra >= 300) {
                    val file_id = song.uri.getQueryParameter("file_id")
                    if (!file_id.isNullOrEmpty()) {
                        DatabaseUtil.pureMusicDatabase.driveFileDownUrlInfoDao().delete(file_id)
                    }
                }
            } else if (song.sourceType == DriveFactory.TYPE_BAIDUDRIVE) {
                if (extra >= 300) {
                    val fs_id = song.uri.getQueryParameter("fs_id")
                    if (!fs_id.isNullOrEmpty()) {
                        DatabaseUtil.pureMusicDatabase.driveFileDownUrlInfoDao().delete(fs_id)
                    }
                }
            } else if (song.sourceType == DriveFactory.TYPE_DROPBOX || song.sourceType == DriveFactory.TYPE_GOOGLE_DRIVE) {
                if (extra in 401..403) {
                    val driveFactory = DriveFactorys.getFactory(song.sourceType)
                    val folder = FolderUtil.folderManager.getFolder(song.sourceId)
                    if (driveFactory != null && folder != null) {
                        val engine = driveFactory.createDriveEngine(folder)
                        engine.runRefreshToken()
                    }
                }
            }
        }
    }

    override fun onUnbind(intent: Intent): Boolean {
        if (!isPlaying) {
            stopSelf()
        }
        return true
    }

    fun openQueue(
        playingQueue: List<Song>?,
        startPosition: Int,
        startPlaying: Boolean,
    ) {
        if (!playingQueue.isNullOrEmpty() && startPosition >= 0 && startPosition < playingQueue.size) {
            // it is important to copy the playing queue here first as we might add/remove songs later
            originalPlayingQueue = ArrayList(playingQueue)
            this.playingQueue = ArrayList(originalPlayingQueue)
            var position = startPosition
            if (shuffleMode == SHUFFLE_MODE_SHUFFLE) {
                makeShuffleList(this.playingQueue, startPosition)
                position = 0
            }
            if (startPlaying) {
                playSongAt(position)
            } else {
                setPosition(position)
            }
            notifyChange(QUEUE_CHANGED)
        }
    }

    @Synchronized
    fun openTrackAndPrepareNextAt(position: Int, completion: (success: Boolean) -> Unit) {
        this.position = position
        notifyChange(META_CHANGED)
        openCurrent { success ->
            completion(success)
            if (success) {
                prepareNextImpl()
            }
            notHandledMetaChangedForCurrentTrack = false
        }
    }

    fun pause(force: Boolean = false) {
        playbackManager.pause(force) {
            notifyChange(PLAY_STATE_CHANGED)
        }
    }

    @Synchronized
    fun play() {
        playbackManager.play { playSongAt(getPosition()) }
        if (notHandledMetaChangedForCurrentTrack) {
            handleChangeInternal(META_CHANGED)
            notHandledMetaChangedForCurrentTrack = false
        }
        notifyChange(PLAY_STATE_CHANGED)
    }

    fun playNextSong(force: Boolean) {
        playSongAt(getNextPosition(force))
    }

    fun playPreviousSong(force: Boolean) {
        playSongAt(getPreviousPosition(force))
    }

    fun playSongAt(position: Int) {
        // Every chromecast method needs to run on main thread or you are greeted with IllegalStateException
        // So it will use Main dispatcher
        // And by using Default dispatcher for local playback we are reduce the burden of main thread
        serviceScope.launch(Main) {
            openTrackAndPrepareNextAt(position) { success ->
                if (success) {
                    play()
                } else {
                    runOnUiThread {
                        showToast(R.string.unplayable_file)
                    }
                }
            }
        }
    }

    @Synchronized
    fun prepareNextImpl() {
        try {
            val nextPosition = getNextPosition(false)
            val nextSong = getSongAt(nextPosition)
            this.nextPosition = nextPosition

            if (!nextSong.isLocal) {
                val message = Message.obtain()
                message.what = PRELOAD_SONG
                message.obj = nextSong
                mMainHandler.sendMessageDelayed(message, 5000)
            }
        } catch (ignored: Exception) {

        }
    }

    fun toggleFavorite() {
        serviceScope.launch {
            toggleFavorite(currentSong)
            sendBroadcast(Intent(FAVORITE_STATE_CHANGED))
        }
    }

    fun isCurrentFavorite(completion: (isFavorite: Boolean) -> Unit) {
        serviceScope.launch(IO) {
            val isFavorite = MusicUtil.isFavorite(currentSong)
            withContext(Main) {
                completion(isFavorite)
            }
        }
    }

    fun quit() {
        pause()
        stopForeground(true)
        isForeground = false
        notificationManager?.cancel(PlayingNotification.NOTIFICATION_ID)

        stopSelf()
    }

    private fun releaseWakeLock() {
        if (wakeLock!!.isHeld) {
            wakeLock?.release()
        }
    }

    fun removeSong(position: Int) {
        if (getShuffleMode() == SHUFFLE_MODE_NONE) {
            playingQueue.removeAt(position)
            originalPlayingQueue.removeAt(position)
        } else {
            originalPlayingQueue.remove(playingQueue.removeAt(position))
        }
        rePosition(position)
        notifyChange(QUEUE_CHANGED)
    }

    private fun removeSongImpl(song: Song) {
        val deletePosition = playingQueue.indexOfCompat(song)
        if (deletePosition != -1) {
            playingQueue.removeAt(deletePosition)
            rePosition(deletePosition)
        }

        val originalDeletePosition = originalPlayingQueue.indexOfCompat(song)
        if (originalDeletePosition != -1) {
            originalPlayingQueue.removeAt(originalDeletePosition)
            rePosition(originalDeletePosition)
        }
    }

    fun removeSong(song: Song) {
        removeSongImpl(song)
        notifyChange(QUEUE_CHANGED)
    }

    fun removeSongs(songs: List<Song>) {
        for (song in songs) {
            removeSongImpl(song)
        }
        notifyChange(QUEUE_CHANGED)
    }

    private fun rePosition(deletedPosition: Int) {
        val currentPosition = getPosition()
        if (deletedPosition < currentPosition) {
            position = currentPosition - 1
        } else if (deletedPosition == currentPosition) {
            if (playingQueue.size > deletedPosition) {
                setPosition(position)
            } else {
                setPosition(position - 1)
            }
        }
    }

    private suspend fun restoreQueuesAndPositionIfNecessary() {
        if (!queuesRestored && playingQueue.isEmpty()) {
            withContext(IO) {
                val restoredQueue = mMusicPlaybackQueueStore.savedPlayingQueue()
                val restoredOriginalQueue = mMusicPlaybackQueueStore.savedOriginalPlayingQueue()
                val restoredSongId = PreferenceUtil.sharedPreferences.getLong(SAVED_PLAYING_SONG_ID, -1L)
                val restoredPositionInTrack =
                    PreferenceUtil.sharedPreferences.getInt(
                        SAVED_POSITION_IN_TRACK, -1
                    )
                logD("restoredPositionInTrack $songProgressMillis")

                if (BuildConfig.DEBUG) {
                    logD("playingQueue " + toJson(restoredQueue))
                    logD("originalPlayingQueue " + toJson(restoredOriginalQueue))
                }

                if (restoredQueue.isNotEmpty() && restoredQueue.size == restoredOriginalQueue.size && restoredSongId != -1L) {
                    originalPlayingQueue = ArrayList(restoredOriginalQueue)
                    playingQueue = ArrayList(restoredQueue)
                    position = 0
                    for (i in playingQueue.indices) {
                        if (playingQueue[i].id == restoredSongId) {
                            position = i
                            break
                        }
                    }
                    withContext(Main) {
                        openCurrent {
                            prepareNext()
                            if (restoredPositionInTrack > 0) {
                                seek(restoredPositionInTrack)
                            }
                            notHandledMetaChangedForCurrentTrack = true
                        }
                        if (receivedHeadsetConnected) {
                            play()
                            receivedHeadsetConnected = false
                        }
                    }

                    sendChangeInternal(QUEUE_CHANGED)
                    mediaSession?.setQueueTitle(getString(R.string.now_playing_queue))
                    mediaSession?.setQueue(playingQueue.toMediaSessionQueue())

                    sendChangeInternal(META_CHANGED)

                    withContext(Dispatchers.Main) {
                        GlobalLyricsManager.update()
                    }
                }
            }
            queuesRestored = true
        }
    }

    fun runOnUiThread(runnable: Runnable?) {
        uiThreadHandler?.post(runnable!!)
    }

    fun savePositionInTrack() {
        PreferenceUtil.sharedPreferences.edit {
            putInt(SAVED_POSITION_IN_TRACK, songProgressMillis)
        }
    }

    @Synchronized
    fun seek(millis: Int): Int {
        GlobalLyricsManager.onUpdateProgressViews(millis, bufferedPosition, songDurationMillis)
        return try {
            val newPosition = playbackManager.seek(millis)
            throttledSeekHandler?.notifySeek()
            newPosition
        } catch (e: Exception) {
            -1
        }
    }

    // to let other apps know whats playing. i.e. last.fm (scrobbling) or musixmatch
    fun sendPublicIntent(what: String) {
        val intent = Intent(what.replace(RETRO_MUSIC_PACKAGE_NAME, MUSIC_PACKAGE_NAME))
        val song = currentSong
        intent.putExtra("id", song.id)
        intent.putExtra("artist", song.artistName)
        intent.putExtra("album", song.albumName)
        intent.putExtra("track", song.title)
        intent.putExtra("duration", song.duration)
        intent.putExtra("position", songProgressMillis.toLong())
        intent.putExtra("playing", isPlaying)
        intent.putExtra("scrobbling_source", RETRO_MUSIC_PACKAGE_NAME)
        @Suppress("Deprecation")
        sendStickyBroadcast(intent)
    }

    fun toggleShuffle() {
        if (getShuffleMode() == SHUFFLE_MODE_NONE) {
            setShuffleMode(SHUFFLE_MODE_SHUFFLE)
        } else {
            setShuffleMode(SHUFFLE_MODE_NONE)
        }
    }

    fun updateMediaSessionPlaybackState() {
        val stateBuilder = PlaybackStateCompat.Builder()
            .setActions(MEDIA_SESSION_ACTIONS)
            .setBufferedPosition(bufferedPosition.toLong())
            .setState(
                if (isPlaying) PlaybackStateCompat.STATE_PLAYING else PlaybackStateCompat.STATE_PAUSED,
                songProgressMillis.toLong(),
                playbackSpeed
            )
        setCustomAction(stateBuilder)
        mediaSession?.setPlaybackState(stateBuilder.build())
    }

    private fun updateNotification() {
        if (playingNotification != null && currentSong.id != -1L) {
            stopForegroundAndNotification()
            initNotification()
        }
    }

    @SuppressLint("CheckResult")
    fun updateMediaSessionMetaData(onCompletion: () -> Unit) {
        Log.i(TAG, "onResourceReady: ")
        val song = currentSong
        if (song == BaseSongUtil.emptySong || song.id == -1L) {
            mediaSession?.setMetadata(null)
            return
        }
        val metaData = MediaMetadataCompat.Builder()
            .putString(MediaMetadataCompat.METADATA_KEY_ARTIST, song.artistName)
            .putString(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, song.albumArtist)
            .putString(MediaMetadataCompat.METADATA_KEY_ALBUM, song.albumName)
            .putString(MediaMetadataCompat.METADATA_KEY_TITLE, song.title)
            .putLong(MediaMetadataCompat.METADATA_KEY_DURATION, song.duration)
            .putLong(
                MediaMetadataCompat.METADATA_KEY_TRACK_NUMBER,
                (getPosition() + 1).toLong()
            )
            .putLong(MediaMetadataCompat.METADATA_KEY_YEAR, song.year.toLong())
            .putBitmap(MediaMetadataCompat.METADATA_KEY_ALBUM_ART, null)
            .putLong(MediaMetadataCompat.METADATA_KEY_NUM_TRACKS, playingQueue.size.toLong())

        if (isAlbumArtOnLockScreen) {
            // val screenSize: Point = RetroUtil.getScreenSize(this)
            val model = getSongModel(song)
            val request = GlideApp.with(this)
                .asBitmap()
                .songCoverOptions(song, model)
                .load(model)
                .transition(getDefaultTransition())

            if (isBlurredAlbumArt) {
                request.transform(BlurTransformation.Builder(this@MusicService).build())
            }
            request.into(object :
                CustomTarget<Bitmap?>(Target.SIZE_ORIGINAL, Target.SIZE_ORIGINAL) {
                override fun onLoadFailed(errorDrawable: Drawable?) {
                    super.onLoadFailed(errorDrawable)
                    mediaSession?.setMetadata(metaData.build())
                    onCompletion()
                }

                override fun onResourceReady(
                    resource: Bitmap,
                    transition: Transition<in Bitmap?>?,
                ) {
                    metaData.putBitmap(
                        MediaMetadataCompat.METADATA_KEY_ALBUM_ART,
                        resource
                    )
                    mediaSession?.setMetadata(metaData.build())
                    onCompletion()
                }

                override fun onLoadCleared(placeholder: Drawable?) {}
            })
        } else {
            mediaSession?.setMetadata(metaData.build())
            onCompletion()
        }
    }

    private fun handleChangeInternal(what: String) {
        when (what) {
            PLAY_STATE_CHANGED -> {
                updateMediaSessionPlaybackState()
                val isPlaying = isPlaying
                if (!isPlaying && songProgressMillis > 0) {
                    savePositionInTrack()
                }
                songPlayCountHelper.notifyPlayStateChanged(isPlaying)
                playingNotification?.setPlaying(isPlaying)
                startForegroundOrNotify()
                if (isPlaying) {
                    GlobalLyricsManager.start()
                } else {
                    GlobalLyricsManager.stop()
                    stopLycisc()
                }
            }
            FAVORITE_STATE_CHANGED -> {
                isCurrentFavorite { isFavorite ->
                    playingNotification?.updateFavorite(isFavorite)
                    startForegroundOrNotify()
                }
            }
            META_CHANGED -> {
                playingNotification?.updateMetadata(currentSong) { startForegroundOrNotify() }
                isCurrentFavorite { isFavorite ->
                    playingNotification?.updateFavorite(isFavorite)
                    startForegroundOrNotify()
                }

                // We must call updateMediaSessionPlaybackState after the load of album art is completed
                // if we are loading it or it won't be updated in the notification
                updateMediaSessionMetaData(::updateMediaSessionPlaybackState)
                savePosition()
                savePositionInTrack()
                serviceScope.launch(IO) {
                    val currentSong = currentSong
                    logD("song ${currentSong.title} play time " + songPlayCountHelper.getPlayTime())
                    songPlayCountHelper.notifySongChanged(currentSong)
                }
                GlobalLyricsManager.update()
            }
            QUEUE_CHANGED -> {
                mediaSession?.setQueueTitle(getString(R.string.now_playing_queue))
                mediaSession?.setQueue(playingQueue.toMediaSessionQueue())
                updateMediaSessionMetaData(::updateMediaSessionPlaybackState) // because playing queue size might have changed
                saveQueues()
                if (playingQueue.size > 0) {
                    prepareNext()
                } else {
                    stopForegroundAndNotification()
                }
            }
        }
    }

    private fun stopLycisc() {
        if (isCanLyricMo()) {
            statusBarLyric.stopLyric()
            EventTools.stopLyric(this)
        }
    }

    private fun isCanLyric(): Boolean {
        return PreferenceUtil.statusBarLyric && (isCanLyricMeizu() || isCanLyricMo())
    }

    private fun isCanLyricMeizu(): Boolean {
        return Build.BRAND.lowercase() == "meizu"
    }

    private fun isCanLyricMo(): Boolean {
        return statusBarLyric.hasEnable() || EventTools.hasEnable()
    }

    private fun startForegroundOrNotify() {
        if (playingNotification != null && currentSong.id != -1L) {
            if (isForeground && !isPlaying) {
                // This makes the notification dismissible
                // We can't call stopForeground(false) on A12 though, which may result in crashes
                // when we call startForeground after that e.g. when Alarm goes off,
                if (!VersionUtils.hasS()) {
                    stopForeground(false)
                    isForeground = false
                }
            }
            if (!isForeground && isPlaying) {
                // Specify that this is a media service, if supported.
                if (VersionUtils.hasQ()) {
                    startForeground(
                        PlayingNotification.NOTIFICATION_ID, playingNotification!!.build(),
                        ServiceInfo.FOREGROUND_SERVICE_TYPE_MEDIA_PLAYBACK
                    )
                } else {
                    startForeground(
                        PlayingNotification.NOTIFICATION_ID,
                        playingNotification!!.build()
                    )
                }
                isForeground = true
            } else {
                // If we are already in foreground just update the notification
                try {
                    notificationManager?.notify(
                        PlayingNotification.NOTIFICATION_ID, playingNotification!!.build()
                    )
                } catch (ignore: Exception) {

                }
            }
        }
    }

    private fun stopForegroundAndNotification() {
        stopForeground(true)
        notificationManager?.cancel(PlayingNotification.NOTIFICATION_ID)
        isForeground = false
    }

    @Synchronized
    private fun openCurrent(completion: (success: Boolean) -> Unit) {
        val force = if (!trackEndedByCrossfade) {
            true
        } else {
            trackEndedByCrossfade = false
            false
        }

        mMainHandler.removeMessages(PRELOAD_SONG)

        val playSong = currentSong
        if (playSong.isLocal || App.isAllowedPlayDrive()) {
            playbackManager.setDataSource(playSong.url, null, force) { success ->
                completion(success)
                if (success) {

                }
            }
            SongAuthUtil.downServerLyrics(applicationContext, playSong, true)
        } else {
            val topActivity  = ActivityStackManager.getInstance().topActivity
            if (topActivity != null) {
                val dialog = MaterialAlertDialogBuilder(topActivity)
                    .setMessage(R.string.only_support_pro_vesion)
                    .setNegativeButton(R.string.action_cancel) { _, _ ->

                    }
                    .setPositiveButton(
                        "Go Pro") { _, _ ->
                        val intent = Intent(topActivity, DonatedActivity::class.java)
                        topActivity.startActivity(intent)
                    }
                    .create()
                dialog.setCancelable(false)
                dialog.setCanceledOnTouchOutside(false)
                dialog.show()
            }
        }
    }

    fun switchToLocalPlayback() {
        playbackManager.switchToLocalPlayback(this::restorePlaybackState)
    }

    fun switchToRemotePlayback(castPlayer: CastPlayer) {
        playbackManager.switchToRemotePlayback(castPlayer, this::restorePlaybackState)
    }

    private fun restorePlaybackState(wasPlaying: Boolean, progress: Int) {
        playbackManager.setCallbacks(this)
        openTrackAndPrepareNextAt(position) { success ->
            if (success) {
                seek(progress)
                if (wasPlaying) {
                    play()
                } else {
                    pause()
                }
            }
        }
    }

    private fun playFromPlaylist(intent: Intent) {
        val playlist: AbsSmartPlaylist? = intent.getParcelableExtra(INTENT_EXTRA_PLAYLIST)
        val shuffleMode = intent.getIntExtra(INTENT_EXTRA_SHUFFLE_MODE, getShuffleMode())
        if (playlist != null) {
            serviceScope.launch(IO) {
                val playlistSongs = playlist.songs()
                withContext(Main) {
                    if (playlistSongs.isNotEmpty()) {
                        if (shuffleMode == SHUFFLE_MODE_SHUFFLE) {
                            val startPosition = Random().nextInt(playlistSongs.size)
                            openQueue(playlistSongs, startPosition, true)
                            setShuffleMode(shuffleMode)
                        } else {
                            openQueue(playlistSongs, 0, true)
                        }
                    } else {
                        runOnUiThread {
                            showToast(
                                R.string.playlist_is_empty,
                                Toast.LENGTH_LONG
                            )
                        }
                    }
                }
            }
        } else {
            runOnUiThread {
                showToast(
                    R.string.playlist_is_empty,
                    Toast.LENGTH_LONG
                )
            }
        }
    }

    private fun prepareNext() {
        prepareNextImpl()
    }

    private fun registerBluetoothConnected() {
        Log.i(TAG, "registerBluetoothConnected: ")
        if (!bluetoothConnectedRegistered) {
            registerReceiver(bluetoothReceiver, bluetoothConnectedIntentFilter)
            bluetoothConnectedRegistered = true
        }
    }

    private fun registerHeadsetEvents() {
        if (!headsetReceiverRegistered && isHeadsetPlugged) {
            registerReceiver(headsetReceiver, headsetReceiverIntentFilter)
            headsetReceiverRegistered = true
        }
    }

    private fun releaseResources() {
        playerHandler?.removeCallbacksAndMessages(null)
        musicPlayerHandlerThread?.quitSafely()
        playbackManager.release()
        mediaSession?.release()
    }

    fun restoreState(completion: () -> Unit = {}) {
        shuffleMode =  PreferenceUtil.sharedPreferences.getInt(
            SAVED_SHUFFLE_MODE, 0
        )
        repeatMode =  PreferenceUtil.sharedPreferences.getInt(
            SAVED_REPEAT_MODE, 0
        )
        handleAndSendChangeInternal(SHUFFLE_MODE_CHANGED)
        handleAndSendChangeInternal(REPEAT_MODE_CHANGED)
        serviceScope.launch {
            restoreQueuesAndPositionIfNecessary()
            completion()
        }
    }

    private fun savePosition() {
        PreferenceUtil.sharedPreferences.edit {
            val song = getSongAt(getPosition())
            if (song != BaseSongUtil.emptySong) {
                putLong(SAVED_PLAYING_SONG_ID, song.id)
            }
        }
    }

    private fun saveQueues() {
        serviceScope.launch(IO) {
            mMusicPlaybackQueueStore
                .saveQueues(playingQueue, originalPlayingQueue)
        }
    }

    private fun sendChangeInternal(what: String) {
        sendBroadcast(Intent(what))
        appWidgetBig.notifyChange(this, what)
        appWidgetClassic.notifyChange(this, what)
        appWidgetSmall.notifyChange(this, what)
        appWidgetCard.notifyChange(this, what)
        appWidgetText.notifyChange(this, what)
        appWidgetMd3.notifyChange(this, what)
        appWidgetCircle.notifyChange(this, what)
    }

    private fun setCustomAction(stateBuilder: PlaybackStateCompat.Builder) {
        var repeatIcon = R.drawable.ic_repeat // REPEAT_MODE_NONE
        if (repeatMode == REPEAT_MODE_THIS) {
            repeatIcon = R.drawable.ic_repeat_one
        } else if (repeatMode == REPEAT_MODE_ALL) {
            repeatIcon = R.drawable.ic_repeat_white_circle
        }
        stateBuilder.addCustomAction(
            PlaybackStateCompat.CustomAction.Builder(
                CYCLE_REPEAT, getString(R.string.action_cycle_repeat), repeatIcon
            )
                .build()
        )
        val shuffleIcon =
            if (getShuffleMode() == SHUFFLE_MODE_NONE) R.drawable.ic_shuffle_off_circled else R.drawable.ic_shuffle_on_circled
        stateBuilder.addCustomAction(
            PlaybackStateCompat.CustomAction.Builder(
                TOGGLE_SHUFFLE, getString(R.string.action_toggle_shuffle), shuffleIcon
            )
                .build()
        )
    }

    private fun setupMediaSession() {
        val mediaButtonReceiverComponentName = ComponentName(
            applicationContext,
            MediaButtonIntentReceiver::class.java
        )

        val mediaButtonIntent = Intent(Intent.ACTION_MEDIA_BUTTON)
        mediaButtonIntent.component = mediaButtonReceiverComponentName
        val mediaButtonReceiverPendingIntent = PendingIntent.getBroadcast(
            applicationContext, 0, mediaButtonIntent,
            if (VersionUtils.hasMarshmallow()) PendingIntent.FLAG_IMMUTABLE else 0
        )
        mediaSession = MediaSessionCompat(
            this,
            BuildConfig.APPLICATION_ID,
            mediaButtonReceiverComponentName,
            mediaButtonReceiverPendingIntent
        )
        val mediaSessionCallback = MediaSessionCallback(this)
        mediaSession?.setCallback(mediaSessionCallback)
        mediaSession?.isActive = true
        mediaSession?.setMediaButtonReceiver(mediaButtonReceiverPendingIntent)
    }

    inner class MusicBinder : Binder() {
        val service: MusicService
            get() = this@MusicService
    }

    companion object {
        val TAG: String = MusicService::class.java.simpleName
        const val PRELOAD_SONG = 1
        const val RETRO_MUSIC_PACKAGE_NAME = "code.name.monkey.retromusic"
        const val MUSIC_PACKAGE_NAME = "com.android.music"
        const val ACTION_TOGGLE_PAUSE = "$RETRO_MUSIC_PACKAGE_NAME.togglepause"
        const val ACTION_PLAY = "$RETRO_MUSIC_PACKAGE_NAME.play"
        const val ACTION_PLAY_PLAYLIST = "$RETRO_MUSIC_PACKAGE_NAME.play.playlist"
        const val ACTION_PAUSE = "$RETRO_MUSIC_PACKAGE_NAME.pause"
        const val ACTION_STOP = "$RETRO_MUSIC_PACKAGE_NAME.stop"
        const val ACTION_SKIP = "$RETRO_MUSIC_PACKAGE_NAME.skip"
        const val ACTION_REWIND = "$RETRO_MUSIC_PACKAGE_NAME.rewind"
        const val ACTION_QUIT = "$RETRO_MUSIC_PACKAGE_NAME.quitservice"
        const val ACTION_PENDING_QUIT = "$RETRO_MUSIC_PACKAGE_NAME.pendingquitservice"
        const val INTENT_EXTRA_PLAYLIST = RETRO_MUSIC_PACKAGE_NAME + "intentextra.playlist"
        const val INTENT_EXTRA_SHUFFLE_MODE =
            "$RETRO_MUSIC_PACKAGE_NAME.intentextra.shufflemode"
        const val APP_WIDGET_UPDATE = "$RETRO_MUSIC_PACKAGE_NAME.appreciate"
        const val EXTRA_APP_WIDGET_NAME = RETRO_MUSIC_PACKAGE_NAME + "app_widget_name"

        // Do not change these three strings as it will break support with other apps (e.g. last.fm
        // scrobbling)
        const val META_CHANGED = "$RETRO_MUSIC_PACKAGE_NAME.metachanged"
        const val QUEUE_CHANGED = "$RETRO_MUSIC_PACKAGE_NAME.queuechanged"
        const val PLAY_STATE_CHANGED = "$RETRO_MUSIC_PACKAGE_NAME.playstatechanged"
        const val FAVORITE_STATE_CHANGED = "$RETRO_MUSIC_PACKAGE_NAME.favoritestatechanged"
        const val REPEAT_MODE_CHANGED = "$RETRO_MUSIC_PACKAGE_NAME.repeatmodechanged"
        const val SHUFFLE_MODE_CHANGED = "$RETRO_MUSIC_PACKAGE_NAME.shufflemodechanged"
        const val MEDIA_STORE_CHANGED = "$RETRO_MUSIC_PACKAGE_NAME.mediastorechanged"
        const val CYCLE_REPEAT = "$RETRO_MUSIC_PACKAGE_NAME.cyclerepeat"
        const val TOGGLE_SHUFFLE = "$RETRO_MUSIC_PACKAGE_NAME.toggleshuffle"
        const val TOGGLE_FAVORITE = "$RETRO_MUSIC_PACKAGE_NAME.togglefavorite"
        const val SAVED_PLAYING_SONG_ID = "saved_playing_song_id"
        const val SAVED_POSITION_IN_TRACK = "POSITION_IN_TRACK"
        const val SAVED_SHUFFLE_MODE = "SHUFFLE_MODE"
        const val SAVED_REPEAT_MODE = "REPEAT_MODE"
        const val SHUFFLE_MODE_NONE = 0
        const val SHUFFLE_MODE_SHUFFLE = 1
        const val REPEAT_MODE_NONE = 0
        const val REPEAT_MODE_ALL = 1
        const val REPEAT_MODE_THIS = 2
        private const val MEDIA_SESSION_ACTIONS = (PlaybackStateCompat.ACTION_PLAY
                or PlaybackStateCompat.ACTION_PAUSE
                or PlaybackStateCompat.ACTION_PLAY_PAUSE
                or PlaybackStateCompat.ACTION_SKIP_TO_NEXT
                or PlaybackStateCompat.ACTION_SKIP_TO_PREVIOUS
                or PlaybackStateCompat.ACTION_STOP
                or PlaybackStateCompat.ACTION_SEEK_TO)
    }

    override fun onEvent(key: String, value: Any?) {
        if (key == EVENT_SONG_PAUSE) {
            pause()
        } else if (key == EVENT_LYRICS_UPDATE) {
            GlobalLyricsManager.update(true)
        }
    }

    override fun onLineUpdate(line: Int) {
        if (isPlaying && !GlobalLyricsManager.getLyrics().isNullOrEmpty()
            && playingNotification != null && isCanLyric()) {
            try {
                val showLyrics = GlobalLyricsManager.getCurrentLyricsText()
                if (showLyrics != null) {
                    if (showLyrics != preShowLyrics) {
                        preShowLyrics = showLyrics
                        if (isCanLyricMeizu()) {
                            playingNotification?.setTicker(showLyrics)
                            val notification = playingNotification!!.build()
                            notification.flags =
                                notification.flags.or(FLAG_ALWAYS_SHOW_TICKER)
                            notification.flags =
                                notification.flags.or(FLAG_ONLY_UPDATE_TICKER)
                            notificationManager?.notify(
                                PlayingNotification.NOTIFICATION_ID, notification
                            )
                        } else if (isCanLyricMo()) {
                            statusBarLyric.updateLyric(showLyrics)
                            EventTools.sendLyric(this, showLyrics, this.packageName)
                        } else {
                            // ignore
                        }
                    }
                }
            } catch (ignore: Throwable) {

            }
        }
    }
}