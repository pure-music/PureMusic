package com.caij.puremusic.activities

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.caij.puremusic.R
import com.caij.puremusic.drive.adrive.WebRouteFragment
import com.caij.puremusic.extensions.setLightStatusBar
import com.caij.puremusic.extensions.setStatusBarColor

class WebActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one_drive_auth)
        val fragment = WebRouteFragment()
        val bundle = Bundle()
        setStatusBarColor(Color.WHITE)
        setLightStatusBar(true)
        val url = intent.getStringExtra("url")
        bundle.putString("url", url)
        fragment.arguments = bundle
        supportFragmentManager.beginTransaction().replace(R.id.fl_roor, fragment).commit()
    }
}