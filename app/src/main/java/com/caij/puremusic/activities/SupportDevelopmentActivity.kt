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
package com.caij.puremusic.activities

import android.os.Bundle
import android.view.MenuItem
import code.name.monkey.appthemehelper.util.ToolbarContentTintHelper
import com.caij.puremusic.activities.base.AbsThemeActivity
import com.caij.puremusic.databinding.ActivityDonationBinding
import com.caij.puremusic.extensions.openUrl
import com.caij.puremusic.extensions.setStatusBarColorAuto
import com.caij.puremusic.extensions.setTaskDescriptionColorAuto
import com.caij.puremusic.extensions.surfaceColor


class SupportDevelopmentActivity : AbsThemeActivity() {

    lateinit var binding: ActivityDonationBinding
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDonationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setStatusBarColorAuto()
        setTaskDescriptionColorAuto()

        setupToolbar()

        binding.paypal.setOnClickListener {
            openUrl(PAYPAL_URL)
        }
        binding.kofi.setOnClickListener {
            openUrl(KOFI_URL)
        }
    }

    private fun setupToolbar() {
        binding.toolbar.setBackgroundColor(surfaceColor())
        ToolbarContentTintHelper.colorBackButton(binding.toolbar)
        setSupportActionBar(binding.toolbar)
    }

    companion object {
        const val PAYPAL_URL = "https://paypal.me/quickersilver"
        const val KOFI_URL = "https://ko-fi.com/quickersilver"
    }
}
