package cn.lyric.getter.api

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import cn.lyric.getter.api.data.LyricData

class LyricReceiver(val callback: (LyricData) -> Unit) : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        runCatching {
            val lyricData = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                intent.getSerializableExtra("Data", LyricData::class.java)!!
            } else {
                intent.getSerializableExtra("Data") as LyricData
            }
            callback(lyricData)
        }
    }
}