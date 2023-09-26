package com.caij.puremusic.activities

import android.os.Bundle
import com.caij.puremusic.R
import com.caij.puremusic.activities.base.AbsBaseActivity
import com.caij.puremusic.fragments.folder.manager.MusicFolderManagerFragment

class FolderManagerActivity: AbsBaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_folder_manager)
        setSupportActionBar(findViewById(R.id.toolbar))
        setTitle(R.string.music_folder_manager_title)
        supportFragmentManager.beginTransaction().replace(R.id.content, MusicFolderManagerFragment()).commit()
    }
}