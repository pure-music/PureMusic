package com.caij.puremusic.fragments.folder

import android.content.Context
import androidx.appcompat.app.AlertDialog
import com.caij.puremusic.R
import com.caij.puremusic.drive.SyncCallback
import com.caij.puremusic.extensions.showToast
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class DefaultSyncCallback(val context: Context, val dialog: AlertDialog): SyncCallback {
    override fun onPreloadInfo() {
        showToast(context.getString(R.string.sync_load_info))
    }

    override fun onLoadSongs(count: Int) {
        showToast(context.getString(R.string.sync_song_count) + count)
    }

    override fun onLoadAlbums(count: Int) {
        showToast(context.getString(R.string.sync_album_count) + count)
    }

    override fun onLoadPlaylists(count: Int) {
        showToast(context.getString(R.string.sync_playlist_count) + count)
    }

    private fun showToast(id: String) {
        GlobalScope.launch(Dispatchers.Main) {
            dialog.setMessage(id)
        }
    }
}