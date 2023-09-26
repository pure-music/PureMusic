package com.caij.puremusic

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.FragmentTransaction.TRANSIT_NONE
import androidx.lifecycle.Lifecycle
import com.caij.puremusic.fragments.lyrics.LyricsFragment
import com.caij.puremusic.fragments.queue.PlayingQueueFragment
import com.caij.puremusic.util.logD
import java.util.Stack

class FragmentStackManager(val supportFragmentManager: FragmentManager) {

    private var fragmentStacks: Stack<Fragment> = Stack()

    init {
        supportFragmentManager.registerFragmentLifecycleCallbacks(object :
            FragmentLifecycleCallbacks() {

            override fun onFragmentDestroyed(fm: FragmentManager, f: Fragment) {
                super.onFragmentDestroyed(fm, f)
                logD("onFragmentDestroyed " + f.javaClass.simpleName)
                fragmentStacks.remove(f)
            }

            override fun onFragmentDetached(fm: FragmentManager, f: Fragment) {
                super.onFragmentDetached(fm, f)
                logD("onFragmentDetached " + f.javaClass.simpleName)
            }
        }, false)
    }

//    fun addBackStack(fragment: Fragment) {
//        val currentFragment = fragmentStack.peek()
//        addBackStack(currentFragment, fragment)
//    }

    fun addBackStack(id: Int, currentFragment: Fragment?, fragment: Fragment) {
        val ft = supportFragmentManager.beginTransaction()
            .add(id, fragment)
            .setCustomAnimations(R.anim.activity_none, R.anim.activity_none, R.anim.activity_none, R.anim.activity_none)
            .addToBackStack(null)
//            .setTransition(FragmentTransaction.TRANSIT_NONE)
        if (currentFragment != null) {
            ft.setMaxLifecycle(currentFragment, Lifecycle.State.STARTED)
        }
        ft.commit()
        fragmentStacks.push(fragment)
    }

//    fun popBackStack() {
//        val curFragment = fragmentStack.pop()
//        val preFragment = fragmentStack.peek()
//        supportFragmentManager.beginTransaction()
//            .remove(curFragment)
//            .setMaxLifecycle(preFragment, Lifecycle.State.RESUMED)
//            .commit()
//    }

    fun getLastFragment(): Fragment? {
        if (fragmentStacks.isEmpty()) return null
        return fragmentStacks.peek()
    }

}