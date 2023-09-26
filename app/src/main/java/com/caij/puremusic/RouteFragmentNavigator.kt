//package com.caij.puremusic
//
//import android.content.Context
//import android.os.Bundle
//import android.util.AttributeSet
//import android.util.Log
//import android.view.View
//import androidx.annotation.CallSuper
//import androidx.annotation.IdRes
//import androidx.core.content.res.use
//import androidx.core.os.bundleOf
//import androidx.fragment.app.Fragment
//import androidx.fragment.app.FragmentManager
//import androidx.lifecycle.Lifecycle
//import androidx.navigation.*
//import androidx.navigation.fragment.FragmentNavigator
//import com.caij.puremusic.fragments.albums.AlbumsFragment
//import com.caij.puremusic.fragments.artists.ArtistsFragment
//import com.caij.puremusic.fragments.folder.FoldersFragment
//import com.caij.puremusic.fragments.home.HomeFragment
//import com.caij.puremusic.fragments.playlists.PlaylistsFragment
//import com.caij.puremusic.fragments.songs.SongsFragment
//import com.caij.puremusic.util.logD
//import kotlin.math.log
//
//@Navigator.Name("fragment")
//class RouteFragmentNavigator(
//    private val context: Context,
//    private val fragmentManager: FragmentManager,
//    private val containerId: Int
//) :  Navigator<FragmentNavigator.Destination>() {
//    private val savedIds = mutableSetOf<String>()
//
//    /**
//     * {@inheritDoc}
//     *
//     * This method must call
//     * [FragmentTransaction.setPrimaryNavigationFragment]
//     * if the pop succeeded so that the newly visible Fragment can be retrieved with
//     * [FragmentManager.getPrimaryNavigationFragment].
//     *
//     * Note that the default implementation pops the Fragment
//     * asynchronously, so the newly visible Fragment from the back stack
//     * is not instantly available after this call completes.
//     */
//    override fun popBackStack(popUpTo: NavBackStackEntry, savedState: Boolean) {
//        if (fragmentManager.isStateSaved) {
//            Log.i(
//                TAG, "Ignoring popBackStack() call: FragmentManager has already saved its state"
//            )
//            return
//        }
//        if (savedState) {
//            val beforePopList = state.backStack.value
//            val initialEntry = beforePopList.first()
//            // Get the set of entries that are going to be popped
//            val poppedList = beforePopList.subList(
//                beforePopList.indexOf(popUpTo),
//                beforePopList.size
//            )
//            // Now go through the list in reversed order (i.e., started from the most added)
//            // and save the back stack state of each.
//            for (entry in poppedList.reversed()) {
//                if (entry == initialEntry) {
//                    Log.i(
//                        TAG,
//                        "FragmentManager cannot save the state of the initial destination $entry"
//                    )
//                } else {
//                    fragmentManager.saveBackStack(entry.id)
//                    savedIds += entry.id
//                }
//            }
//        } else {
//            fragmentManager.popBackStack(
//                popUpTo.id,
//                FragmentManager.POP_BACK_STACK_INCLUSIVE
//            )
//        }
//        state.pop(popUpTo, savedState)
//    }
//
//    public override fun createDestination(): FragmentNavigator.Destination {
//        return FragmentNavigator.Destination(this)
//    }
//
//    /**
//     * Instantiates the Fragment via the FragmentManager's
//     * [androidx.fragment.app.FragmentFactory].
//     *
//     * Note that this method is **not** responsible for calling
//     * [Fragment.setArguments] on the returned Fragment instance.
//     *
//     * @param context Context providing the correct [ClassLoader]
//     * @param fragmentManager FragmentManager the Fragment will be added to
//     * @param className The Fragment to instantiate
//     * @param args The Fragment's arguments, if any
//     * @return A new fragment instance.
//     */
//    @Suppress("DeprecatedCallableAddReplaceWith")
//    @Deprecated(
//        """Set a custom {@link androidx.fragment.app.FragmentFactory} via
//      {@link FragmentManager#setFragmentFactory(FragmentFactory)} to control
//      instantiation of Fragments."""
//    )
//    public open fun instantiateFragment(
//        context: Context,
//        fragmentManager: FragmentManager,
//        className: String,
//        args: Bundle?
//    ): Fragment {
//        return fragmentManager.fragmentFactory.instantiate(context.classLoader, className)
//    }
//
//    /**
//     * {@inheritDoc}
//     *
//     * This method should always call
//     * [FragmentTransaction.setPrimaryNavigationFragment]
//     * so that the Fragment associated with the new destination can be retrieved with
//     * [FragmentManager.getPrimaryNavigationFragment].
//     *
//     * Note that the default implementation commits the new Fragment
//     * asynchronously, so the new Fragment is not instantly available
//     * after this call completes.
//     */
//    override fun navigate(
//        entries: List<NavBackStackEntry>,
//        navOptions: NavOptions?,
//        navigatorExtras: Extras?
//    ) {
//        if (fragmentManager.isStateSaved) {
//            Log.i(
//                TAG, "Ignoring navigate() call: FragmentManager has already saved its state"
//            )
//            return
//        }
//        for (entry in entries) {
//            navigate(entry, navOptions, navigatorExtras)
//        }
//    }
//
//    private fun navigate(
//        entry: NavBackStackEntry,
//        navOptions: NavOptions?,
//        navigatorExtras: Extras?
//    ) {
//        val backStack = state.backStack.value
//        val initialNavigation = backStack.isEmpty()
//        val restoreState = (
//                navOptions != null && !initialNavigation &&
//                        navOptions.shouldRestoreState() &&
//                        savedIds.remove(entry.id)
//                )
//        if (restoreState) {
//            // Restore back stack does all the work to restore the entry
//            fragmentManager.restoreBackStack(entry.id)
//            state.push(entry)
//            return
//        }
//        val destination = entry.destination as FragmentNavigator.Destination
//        val args = entry.arguments
//        var className = destination.className
//        if (className[0] == '.') {
//            className = context.packageName + className
//        }
//        val frag = fragmentManager.fragmentFactory.instantiate(context.classLoader, className)
//        frag.arguments = args
//        val ft = fragmentManager.beginTransaction()
//        var enterAnim = navOptions?.enterAnim ?: -1
//        var exitAnim = navOptions?.exitAnim ?: -1
//        var popEnterAnim = navOptions?.popEnterAnim ?: -1
//        var popExitAnim = navOptions?.popExitAnim ?: -1
//        if (enterAnim != -1 || exitAnim != -1 || popEnterAnim != -1 || popExitAnim != -1) {
//            enterAnim = if (enterAnim != -1) enterAnim else 0
//            exitAnim = if (exitAnim != -1) exitAnim else 0
//            popEnterAnim = if (popEnterAnim != -1) popEnterAnim else 0
//            popExitAnim = if (popExitAnim != -1) popExitAnim else 0
//            ft.setCustomAnimations(enterAnim, exitAnim, popEnterAnim, popExitAnim)
//        }
//
//        val currentFragment = fragmentManager.primaryNavigationFragment
//
//        val tag = destination.id.toString()
//        logD("destination.id " + context.resources.getResourceEntryName(destination.id))
//        val showFragment = fragmentManager.findFragmentByTag(tag)
//        val lastShowFragment : Fragment
//        if (isHomeFragment(currentFragment) && isHomeFragment(frag)) {
//            ft.setMaxLifecycle(currentFragment!!, Lifecycle.State.STARTED)
//            ft.hide(currentFragment)
//            logD(currentFragment.javaClass.simpleName + " hide and set pause")
//
//            if (showFragment != null) {
//                ft.show(showFragment)
//                if (showFragment.isAdded) {
//                    logD(showFragment.javaClass.simpleName + " set resume")
//                    ft.setMaxLifecycle(showFragment, Lifecycle.State.RESUMED)
//                } else {
//                    logD(showFragment.javaClass.simpleName + " add")
//                    ft.add(containerId, showFragment, tag)
//                }
//                lastShowFragment = showFragment
//            } else {
//                logD(frag.javaClass.simpleName + " add")
//                ft.add(containerId, frag, tag)
//                lastShowFragment = frag
//            }
//        } else {
//            if (currentFragment != null) {
//                ft.setMaxLifecycle(currentFragment, Lifecycle.State.STARTED)
//                logD(currentFragment.javaClass.simpleName + " set pause")
//            }
//            if (showFragment != null) {
//                if (showFragment.isAdded) {
//                    logD(showFragment.javaClass.simpleName + " set resume")
//                    ft.setMaxLifecycle(showFragment, Lifecycle.State.RESUMED)
//                } else {
//                    logD(showFragment.javaClass.simpleName + " add")
//                    ft.add(containerId, showFragment, tag)
//                }
//                lastShowFragment = showFragment
//            } else {
//                ft.add(containerId, frag, tag)
//                lastShowFragment = frag
//                logD(frag.javaClass.simpleName + " null add")
//            }
//        }
//
//        ft.setPrimaryNavigationFragment(lastShowFragment)
//        @IdRes val destId = destination.id
//        // TODO Build first class singleTop behavior for fragments
//        val isSingleTopReplacement = (
//                navOptions != null && !initialNavigation &&
//                        navOptions.shouldLaunchSingleTop() &&
//                        backStack.last().destination.id == destId
//                )
//
//        val isAdded = when {
//            initialNavigation -> {
//                true
//            }
//            isSingleTopReplacement -> {
//                // Single Top means we only want one instance on the back stack
//                if (backStack.size > 1) {
//                    // If the Fragment to be replaced is on the FragmentManager's
//                    // back stack, a simple replace() isn't enough so we
//                    // remove it from the back stack and put our replacement
//                    // on the back stack in its place
//                    fragmentManager.popBackStack(
//                        entry.id,
//                        FragmentManager.POP_BACK_STACK_INCLUSIVE
//                    )
//                    ft.addToBackStack(entry.id)
//                }
//                false
//            }
//            isHomeFragment(frag) -> {
//                false
//            }
//            else -> {
//                ft.addToBackStack(entry.id)
//                true
//            }
//        }
//        if (navigatorExtras is FragmentNavigator.Extras) {
//            for ((key, value) in navigatorExtras.sharedElements) {
//                ft.addSharedElement(key, value)
//            }
//        }
//        ft.setReorderingAllowed(true)
//        ft.commit()
//        // The commit succeeded, update our view of the world
//        if (isAdded) {
//            state.push(entry)
//        }
//    }
//
//    fun isHomeFragment(fragment: Fragment?): Boolean {
//        return fragment is HomeFragment || fragment is SongsFragment || fragment is AlbumsFragment
//                || fragment is ArtistsFragment || fragment is PlaylistsFragment
//    }
//
//    public override fun onSaveState(): Bundle? {
//        if (savedIds.isEmpty()) {
//            return null
//        }
//        return bundleOf(KEY_SAVED_IDS to ArrayList(savedIds))
//    }
//
//    public override fun onRestoreState(savedState: Bundle) {
//        val savedIds = savedState.getStringArrayList(KEY_SAVED_IDS)
//        if (savedIds != null) {
//            this.savedIds.clear()
//            this.savedIds += savedIds
//        }
//    }
//
//    private companion object {
//        private const val TAG = "RouteFragmentNavigator"
//        private const val KEY_SAVED_IDS = "androidx-nav-fragment:navigator:savedIds"
//    }
//}