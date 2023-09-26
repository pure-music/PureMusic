package com.caij.puremusic.activities

import android.os.Bundle
import com.caij.puremusic.R
import com.caij.puremusic.activities.base.AbsBaseActivity
import com.caij.puremusic.drive.DriveFactory
import com.caij.puremusic.drive.model.DriveFile
import com.caij.puremusic.extensions.toParcelable
import com.caij.puremusic.fragments.folder.DriveFilesFragment
import com.caij.puremusic.fragments.folder.FoldersSettingFragment
import com.caij.puremusic.fragments.folder.manager.MusicFolderManagerFragment

class FolderFilesActivity: AbsBaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_folder_manager)
        setSupportActionBar(findViewById(R.id.toolbar))
        setTitle(R.string.folders)
        val type = intent.getIntExtra("folder_type", 0)
        if (supportActionBar != null) {
            supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        }
        if (type == DriveFactory.TYPE_INNER) {
            supportFragmentManager.beginTransaction().replace(R.id.content, FoldersSettingFragment()).commit()
        } else {
            val fragment = DriveFilesFragment()
            val bundle = Bundle()
            bundle.putLong("folder_id", intent.getLongExtra("folder_id", 0))
            bundle.putInt("folder_type", type)
            fragment.arguments = bundle
            supportFragmentManager.beginTransaction().replace(R.id.content, fragment).commit()
        }

    }

    fun openFolder(file: DriveFile) {
        val fragment = DriveFilesFragment()
        val bundle = Bundle()
        bundle.putLong("folder_id", intent.getLongExtra("folder_id", 0))
        bundle.putInt("folder_type", intent.getIntExtra("folder_type", 0))
        bundle.putParcelable("file", file.toParcelable)
        fragment.arguments = bundle
        supportFragmentManager.beginTransaction().add(R.id.content, fragment)
            .addToBackStack(file.fileName)
            .commit()
    }
}