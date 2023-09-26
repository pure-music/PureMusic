package com.caij.puremusic.extensions

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.net.toUri
import androidx.fragment.app.Fragment
import com.caij.puremusic.activities.WebActivity
import com.caij.puremusic.util.RetroUtil
import java.io.OutputStream

fun Fragment.createNewFile(
    mimeType: String,
    fileName: String,
    write: (outputStream: OutputStream?, data: Uri?) -> Unit
) {
    val intent = Intent(Intent.ACTION_CREATE_DOCUMENT)
    intent.addCategory(Intent.CATEGORY_OPENABLE)
    intent.type = mimeType
    intent.putExtra(Intent.EXTRA_TITLE, fileName)
    val startForResult =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult())
        { result: ActivityResult ->
            if (result.resultCode == Activity.RESULT_OK) {
                write(
                    context?.contentResolver?.openOutputStream(result.data?.data!!),
                    result.data?.data
                )
            }

        }
    startForResult.launch(intent)
}

fun Context.openUrl(url: String) {
    try {
        val i = Intent(Intent.ACTION_VIEW)
        i.data = url.toUri()
        i.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(i)
    } catch (ignore: Throwable) {

    }
}


fun Fragment.openUrl(url: String) {
    requireContext().openUrl(url)
}

