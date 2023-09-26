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
package com.caij.puremusic.fragments.settings

import android.content.Intent
import android.content.res.ColorStateList
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import code.name.monkey.appthemehelper.ThemeStore
import com.caij.puremusic.R
import com.caij.puremusic.activities.FolderManagerActivity
import com.caij.puremusic.activities.SettingActivity
import com.caij.puremusic.analyze.ChannelUtil
import com.caij.puremusic.databinding.FragmentMainSettingsBinding
import com.caij.puremusic.extensions.drawAboveSystemBarsWithPadding
import com.caij.puremusic.extensions.goToProVersion
import com.caij.puremusic.fragments.about.AboutFragment
import com.caij.puremusic.fragments.backup.BackupFragment
import com.caij.vip.VipWrapper

class MainSettingsFragment : Fragment(), View.OnClickListener {

    private var _binding: FragmentMainSettingsBinding? = null
    private val binding get() = _binding!!


    override fun onClick(view: View) {
//        findNavController().navigate(
//            when (view.id) {
//                R.id.musicFolderManagerSetting -> {
//                    val intent = Intent(requireActivity(), FolderManagerActivity::class.java)
//                    startActivity(intent)
//                    return
//                }
//                R.id.generalSettings -> R.id.action_mainSettingsFragment_to_themeSettingsFragment
//                R.id.audioSettings -> R.id.action_mainSettingsFragment_to_audioSettings
//                R.id.personalizeSettings -> R.id.action_mainSettingsFragment_to_personalizeSettingsFragment
//                R.id.imageSettings -> R.id.action_mainSettingsFragment_to_imageSettingFragment
//                R.id.notificationSettings -> R.id.action_mainSettingsFragment_to_notificationSettingsFragment
//                R.id.otherSettings -> R.id.action_mainSettingsFragment_to_otherSettingsFragment
//                R.id.aboutSettings -> R.id.action_mainSettingsFragment_to_aboutActivity
//                R.id.nowPlayingSettings -> R.id.action_mainSettingsFragment_to_nowPlayingSettingsFragment
//                R.id.backup_restore_settings -> R.id.action_mainSettingsFragment_to_backupFragment
//                else -> R.id.action_mainSettingsFragment_to_themeSettingsFragment
//            }
//        )
        when (view.id) {
            R.id.musicFolderManagerSetting -> {
                val intent = Intent(requireActivity(), FolderManagerActivity::class.java)
                startActivity(intent)
                return
            }
            R.id.generalSettings -> {
                val intent = SettingActivity.starFragmentV4(requireActivity(), ThemeSettingsFragment::class.java)
                startActivity(intent)
            }
            R.id.audioSettings -> {
                val intent = SettingActivity.starFragmentV4(requireActivity(), AudioSettings::class.java)
                startActivity(intent)
            }
            R.id.personalizeSettings -> {
                val intent = SettingActivity.starFragmentV4(requireActivity(), PersonalizeSettingsFragment::class.java)
                startActivity(intent)
            }
            R.id.imageSettings -> {
                val intent = SettingActivity.starFragmentV4(requireActivity(), ImageSettingFragment::class.java)
                startActivity(intent)
            }
            R.id.notificationSettings -> {
                val intent = SettingActivity.starFragmentV4(requireActivity(), NotificationSettingsFragment::class.java)
                startActivity(intent)
            }
            R.id.otherSettings -> {
                val intent = SettingActivity.starFragmentV4(requireActivity(), OtherSettingsFragment::class.java)
                startActivity(intent)
            }
            R.id.aboutSettings -> {
                val intent = SettingActivity.starFragmentV4(requireActivity(), AboutFragment::class.java)
                startActivity(intent)
            }
            R.id.nowPlayingSettings -> {
                val intent = SettingActivity.starFragmentV4(requireActivity(), NowPlayingSettingsFragment::class.java)
                startActivity(intent)
            }
            R.id.backup_restore_settings -> {
                val intent = SettingActivity.starFragmentV4(requireActivity(), BackupFragment::class.java)
                startActivity(intent)
            }
            else -> {
                val intent = SettingActivity.starFragmentV4(requireActivity(), ThemeSettingsFragment::class.java)
                startActivity(intent)
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainSettingsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.musicFolderManagerSetting.setOnClickListener(this)
        binding.generalSettings.setOnClickListener(this)
        binding.audioSettings.setOnClickListener(this)
        binding.nowPlayingSettings.setOnClickListener(this)
        binding.personalizeSettings.setOnClickListener(this)
        binding.imageSettings.setOnClickListener(this)
        binding.notificationSettings.setOnClickListener(this)
        binding.otherSettings.setOnClickListener(this)
        binding.aboutSettings.setOnClickListener(this)
        binding.backupRestoreSettings.setOnClickListener(this)

        if (ChannelUtil.getChannel(requireActivity()) == "google") {
            binding.buyProContainer.visibility = View.GONE
            binding.googlePlay.visibility = View.VISIBLE
        } else {
            binding.buyProContainer.visibility = View.VISIBLE
            binding.googlePlay.visibility = View.GONE
        }

        binding.buyProContainer.apply {
            setOnClickListener {
                requireContext().goToProVersion()
            }
        }
        binding.buyPremium.setOnClickListener {
            requireContext().goToProVersion()
        }

        binding.googlePlay.setOnClickListener {
            requireContext().goToProVersion()
        }

        if (VipWrapper.getInstance(requireActivity()).wwwwwwww()) {
            binding.buyPremium.visibility = View.GONE
            binding.divider.visibility = View.GONE
        } else {
            binding.buyPremium.visibility = View.VISIBLE
            binding.divider.visibility = View.VISIBLE
        }

        ThemeStore.accentColor(requireContext()).let {
            binding.buyPremium.setTextColor(it)
            binding.diamondIcon.imageTintList = ColorStateList.valueOf(it)
        }

        binding.container.drawAboveSystemBarsWithPadding()

        requireActivity().title = getString(R.string.action_settings)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
