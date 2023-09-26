package com.caij.puremusic.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.caij.puremusic.R
import com.caij.puremusic.activities.base.AbsBaseActivity
import com.caij.puremusic.extensions.applyToolbar
import com.caij.puremusic.util.logD
import com.google.android.material.appbar.MaterialToolbar

open class SettingActivity: AbsBaseActivity() {

    companion object {

        const val DATA = "data"

        fun starFragmentV4(
            context: Context?,
            fragmentClazz: Class<out Fragment?>?,
            bundle: Bundle?
        ): Intent {
            val intent = Intent(context, SettingActivity::class.java)
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
        setContentView(R.layout.fragment_settings)
        val toolbar = findViewById<MaterialToolbar>(R.id.toolbar)
        applyToolbar(toolbar)
        toolbar.setNavigationOnClickListener {
            finish()
        }
        attachV4Fragment()
    }

    override fun recreate() {
        super.recreate()
        logD("recreate")
    }

    open fun getStack(): String {
        val sb = StringBuilder()
        val stackTrace = Thread.currentThread().stackTrace
        for (s in stackTrace) {
            sb.append(s.toString()).append("\n")
        }
        return sb.toString()
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
                fragmentTransaction.replace(R.id.contentFrame, fragment).commit()
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