package com.caij.puremusic.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.caij.puremusic.R
import com.caij.puremusic.activities.base.AbsBaseActivity
import com.caij.vip.DefaultFragmentActivity

open class HolderActivity: AbsBaseActivity() {

    companion object {

        const val DATA = "data"

        fun starFragmentV4(
            context: Context?,
            fragmentClazz: Class<out Fragment?>?,
            bundle: Bundle?
        ): Intent {
            val intent = Intent(context, HolderActivity::class.java)
            intent.putExtra(DATA, bundle)
            intent.putExtra("clazz", fragmentClazz)
            return intent
        }

        fun starFragmentV4(
            context: Context?,
            fragmentClazz: Class<out Fragment?>?
        ): Intent {
            return starFragmentV4(context, fragmentClazz, null)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_holder)
        attachV4Fragment()
    }

    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.activity_none, R.anim.activity_top_to_bottom)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun attachV4Fragment() {
        try {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            val fragment: Fragment? = getFragment()
            if (fragment != null) {
                var bundle: Bundle? = getBundle()
                if (bundle == null) {
                    bundle = Bundle()
                }
                bundle.putString("uri", intent.dataString)
                fragment.arguments = bundle
                fragmentTransaction.replace(R.id.fragment_container, fragment).commit()
            }
        } catch (e: Exception) {
            // ignore
            e.printStackTrace()
        }
    }

    protected open fun getBundle(): Bundle? {
        return intent.getBundleExtra(DATA)
    }

    private fun getFragment(): Fragment? {
        val fragmentClazz = getFragmentClassExtra(
            intent
        ) as Class<Fragment>
        var fragment: Fragment? = null
        try {
            fragment = fragmentClazz.newInstance()
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }
        return fragment
    }

    private fun getFragmentClassExtra(intent: Intent): Class<*>? {
        val o: Any? = intent.getSerializableExtra("clazz")
        return if (o is Class<*>) {
            o
        } else null
    }
}