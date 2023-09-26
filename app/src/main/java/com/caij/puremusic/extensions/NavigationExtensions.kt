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
package com.caij.puremusic.extensions

import android.annotation.SuppressLint
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.Lifecycle
import com.caij.puremusic.FragmentStackManager
import com.caij.puremusic.R
import com.caij.puremusic.activities.MainActivity

//import androidx.annotation.IdRes
//import androidx.appcompat.app.AppCompatActivity
//import androidx.fragment.app.Fragment
//import androidx.navigation.NavController
//import androidx.navigation.findNavController
//import androidx.navigation.fragment.NavHostFragment
//import androidx.navigation.fragment.findNavController
//import androidx.navigation.navOptions
//
//fun Fragment.navigate(@IdRes id: Int) = findNavController().navigate(id)
//
//fun Fragment.findNavController(@IdRes id: Int): NavController {
//    val fragment = childFragmentManager.findFragmentById(id) as NavHostFragment
//    return fragment.navController
//}
//
//fun Fragment.findActivityNavController(@IdRes id: Int): NavController {
//    return requireActivity().findNavController(id)
//}
//
//fun AppCompatActivity.findNavController(@IdRes id: Int): NavController {
//    val fragment = supportFragmentManager.findFragmentById(id) as NavHostFragment
//    return fragment.navController
//}
//
//fun AppCompatActivity.findNavHostFragment(@IdRes id: Int): NavHostFragment {
//    return supportFragmentManager.findFragmentById(id) as NavHostFragment
//}
//
//val fadeNavOptions
//    get() = navOptions {
//        anim {
//            enter = android.R.anim.fade_in
//            exit = android.R.anim.fade_out
//            popEnter = android.R.anim.fade_in
//            popExit = android.R.anim.fade_out
//        }
//    }


fun FragmentActivity.openFragment(fragment: Fragment) {
    val fragmentStackManager = findViewById<View>(R.id.fragment_container).tag as FragmentStackManager
    var lastFragment = fragmentStackManager.getLastFragment()
    if (lastFragment == null) {
        lastFragment = (this as MainActivity).getLastFragment()
    }
    fragmentStackManager.addBackStack(R.id.fragment_container, lastFragment, fragment)
}

fun Fragment.openFragment(fragment: Fragment) {
    val fragmentStackManager = requireActivity().findViewById<View>(R.id.fragment_container).tag as FragmentStackManager
    fragmentStackManager.addBackStack(R.id.fragment_container, this, fragment)
}

