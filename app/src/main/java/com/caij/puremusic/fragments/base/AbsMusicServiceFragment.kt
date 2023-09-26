/*
 * Copyright (c) 2020 Hemanth Savarla.
 *
 * Licensed under the GNU General Public License v3
 *
 * This is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 */
package com.caij.puremusic.fragments.base

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.annotation.CallSuper
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import com.caij.puremusic.R
import com.caij.puremusic.activities.base.AbsMusicServiceActivity
import com.caij.puremusic.interfaces.IMusicServiceEventListener
import com.caij.puremusic.util.logD

/**
 * Created by hemanths on 18/08/17.
 */

open class AbsMusicServiceFragment(@LayoutRes layout: Int) : Fragment(layout),
    IMusicServiceEventListener {

    var serviceActivity: AbsMusicServiceActivity? = null
        private set

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (checkActivity()) {
            try {
                serviceActivity = context as AbsMusicServiceActivity?
            } catch (e: ClassCastException) {
                throw RuntimeException(context.javaClass.simpleName + " must be an instance of " + AbsMusicServiceActivity::class.java.simpleName)
            }
        }
    }

    open fun checkActivity(): Boolean {
        return true
    }

    override fun onDetach() {
        super.onDetach()
        serviceActivity = null
    }

    override fun onResume() {
        super.onResume()
        logD("onResume")
    }

    override fun onPause() {
        super.onPause()
        logD("onPause")
    }

    override fun onStop() {
        super.onStop()
        logD("onStop")
    }

    override fun onStart() {
        super.onStart()
        logD("onStart")
    }

    @CallSuper
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        serviceActivity?.addMusicServiceEventListener(this)
    }

    @CallSuper
    override fun onDestroyView() {
        super.onDestroyView()
        serviceActivity?.removeMusicServiceEventListener(this)
    }

    override fun onFavoriteStateChanged() {
    }

    override fun onPlayingMetaChanged() {
    }

    override fun onServiceConnected() {
    }

    override fun onServiceDisconnected() {
    }

    override fun onQueueChanged() {
    }

    override fun onPlayStateChanged() {
    }

    override fun onRepeatModeChanged() {
    }

    override fun onShuffleModeChanged() {
    }

    override fun onMediaStoreChanged() {
    }
}
