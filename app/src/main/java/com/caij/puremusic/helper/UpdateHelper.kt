package com.caij.puremusic.helper

import android.app.Activity
import android.app.Application
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.text.Html
import android.text.SpannableStringBuilder
import android.text.TextUtils
import com.caij.lib.lifemanager.ActivityStackManager
import com.caij.lib.toast.ToastUtil
import com.caij.puremusic.BuildConfig
import com.caij.puremusic.R
import com.caij.puremusic.analyze.RemoteConfig
import com.caij.puremusic.model.UpdateInfo
import com.caij.puremusic.util.DialogCancelDissmissOnClickListener
import com.caij.puremusic.util.DialogQueue
import com.caij.puremusic.util.DialogUtil.getDialogActivity
import com.caij.puremusic.util.GsonUtil
import com.caij.puremusic.util.HttpUtil
import com.caij.puremusic.util.SPs
import com.caij.vip.LogUtil
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.HttpUrl.Companion.toHttpUrl
import okhttp3.Request
import okhttp3.Response
import java.io.InputStreamReader
import java.text.SimpleDateFormat
import java.util.Date

open class UpdateHelper(private val context: Application, val version: Int,
                        private val channel: String, private val isVip: Boolean, val isHard: Boolean) {

    companion object {
        private const val TAG: String = "UpdateHelper"

        var UPDATE_FILE = "update_file"
        var UPDATE_TIME_KEY = "update_time_key"
        var IGNORE_UPDATE_VERSION = "ignore_update_version"
        var GOOGLE_APP_STORE_APPID = "com.android.vending"


        private const val KEY_LOAD_TIEMTRAM = "load_data_server_time"

        private const val UPDATE_TIME_INVAL = 30L * 60 * 1000

        private const val CHECK_TIME_LIFE = 5L * 60 * 60 * 1000

        private fun saveNextCheckUpdateTime(context: Context) {
            SPs.getSharedPreferences(context, UPDATE_FILE, Context.MODE_PRIVATE)
                .edit()
                .putLong(
                    UPDATE_TIME_KEY,
                    System.currentTimeMillis() + CHECK_TIME_LIFE
                )
                .apply()
        }

        private fun saveIgnoreUpdateVersion(context: Context, versionName: String) {
            SPs.getSharedPreferences(context, UPDATE_FILE, Context.MODE_PRIVATE)
                .edit()
                .putString(IGNORE_UPDATE_VERSION, versionName)
                .apply()
        }


        fun toAppStore(activity: Activity, packageName: String, channel: String) {
            val musicUrl: String = RemoteConfig.getString("app_host_url", "https://music.caij.xyz")
            try {
                if (channel == "google") {
                    try {
                        AppStoreUtil.toAppStore(activity, packageName, GOOGLE_APP_STORE_APPID)
                    } catch (e: java.lang.Exception) {
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(musicUrl)
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                        activity.startActivity(intent)
                    }
                } else {
                    AppStoreUtil.toAppStore(activity, packageName)
                }
            } catch (e: Exception) {
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(musicUrl)
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                activity.startActivity(intent)
            }
        }

        fun checkUpdateTime(context: Context): Boolean {
            if (BuildConfig.DEBUG) return true
            val updateTime: Long = SPs.getSharedPreferences(context, UPDATE_FILE, Context.MODE_PRIVATE)
                .getLong(UPDATE_TIME_KEY, 0)
            if (updateTime > System.currentTimeMillis()) {
                return false
            }
            return true
        }
    }

    fun checkUpdateLimit() {
        val updateTimestamp: Long = SPs.getGlobalSharedPreferences(context)
            .getLong(KEY_LOAD_TIEMTRAM, 0)
        if (System.currentTimeMillis() - updateTimestamp > UPDATE_TIME_INVAL || BuildConfig.DEBUG) {
            SPs.getGlobalSharedPreferences(context).edit()
                .putLong(KEY_LOAD_TIEMTRAM, System.currentTimeMillis())
                .apply()
            checkUpdate()
        }
    }

    fun checkUpdate() {
        if (isHard || checkUpdateTime(context)) {
            GlobalScope.launch(Dispatchers.Default) {
                val url = RemoteConfig.getString("update_url", "https://music.caij.xyz/update/info.php")
                val httpUrl = url.toHttpUrl().newBuilder()
                    .addQueryParameter("version", version.toString())
                    .addQueryParameter("osVersion", Build.VERSION.SDK_INT.toString())
                    .addQueryParameter("channel", channel)
                    .addQueryParameter("isVip", isVip.toString())
                    .build()
                val request = Request.Builder().url(httpUrl).get().build()
                val call = HttpUtil.okHttpClient.newCall(request)
                var response: Response? = null
                try {
                    response = call.execute()
                    if (response.code in 200..299 && response.body != null) {
                        val stream = response.body!!.byteStream()
                        val updateInfo = GsonUtil.fromJson(InputStreamReader(stream), UpdateInfo::class.java)
                        withContext(Dispatchers.Main) {
                            acceptVersionResponse(updateInfo)
                        }
                    }
                } catch (e : Exception) {
                    LogUtil.d(TAG, "request url error ${e.message}")
                } finally {
                    response?.close()
                }
            }
        } else {
            LogUtil.d(TAG, "ignore $isHard")
        }
    }

    private fun acceptVersionResponse(updateInfo: UpdateInfo) {
        if (updateInfo.versionCode > version) {
            if (isHard || isForcedUpgrade(updateInfo)) {
                update(updateInfo)
            } else {
                val sp = SPs.getSharedPreferences(context, UPDATE_FILE, Context.MODE_PRIVATE)
                val ignoreVersion: String = sp.getString(IGNORE_UPDATE_VERSION, "")!!
                if (!updateInfo.versionName.equals(ignoreVersion)) {
                    update(updateInfo)
                }
            }
        } else {
            noUpdate(updateInfo)
        }
    }

    private fun noUpdate(updateInfo: UpdateInfo) {

    }

    protected open fun update(updateInfo: UpdateInfo) {
        val title: String = getTitle(context, updateInfo)
        val desc = getDesc(context, updateInfo)
        val packageName = if (TextUtils.isEmpty(updateInfo.appId)) context.packageName else updateInfo.appId
        if (channel == "google") {
            showGoogleDialog(context, title, desc, packageName, updateInfo, channel)
        } else {
            showDefaultDialog(context, title, desc, packageName, updateInfo, channel)
        }
    }

    open fun getDesc(activity: Context, updateInfo: UpdateInfo): SpannableStringBuilder {
        val desc = SpannableStringBuilder()
        desc.append(formatDate(updateInfo.createTime, "yyyy.MM.dd")).append("  ")
            .append(formatFileSize(updateInfo.fileSize)).append("\n")
            .append("\n")
            .append(Html.fromHtml(updateInfo.desc))
//        val oldUrlSpans = desc.getSpans(0, desc.length, URLSpan::class.java)
//        for (oldUrlSpan in oldUrlSpans) {
//            //span 不能重复设置，需要先删除
//            val start = desc.getSpanStart(oldUrlSpan)
//            val end = desc.getSpanEnd(oldUrlSpan)
//            desc.removeSpan(oldUrlSpan)
//            val clickableSpan: ClickableSpan = object : ClickableSpan(oldUrlSpan.url) {
//                fun onClick(widget: View) {
//                    Nav.with(widget.context).uri(getURL()).navigation()
//                }
//            }
//            clickableSpan.setTextColor(ThemeUtils.getColorById(activity, R.color.link_text_color))
//            desc.setSpan(clickableSpan, start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
//        }
        return desc
    }

    open fun formatFileSize(size: Long): String? {
        val kb = (size / 1024f).toLong()
        return if (kb >= 1000) {
            val mb = (kb / 1000f).toLong()
            if (mb >= 1000) {
                val gb = (mb / 1024f).toLong()
                gb.toString() + "G"
            } else {
                mb.toString() + "M"
            }
        } else {
            kb.toString() + "KB"
        }
    }

    private fun formatDate(createTime: Long, format: String): String {
        val simpleDateFormat = SimpleDateFormat(format)
        return simpleDateFormat.format(Date(createTime))
    }

    private fun getTitle(context: Context, updateInfo: UpdateInfo): String {
        return context.getString(R.string.update) + " " + updateInfo.versionName
    }

    private fun isForcedUpgrade(updateInfo: UpdateInfo): Boolean {
        try {
            val forcedUpgradeInfo: UpdateInfo.ForcedUpgradeInfo? = updateInfo.forcedUpgradeInfo
            if (forcedUpgradeInfo != null) {
                return (version <= forcedUpgradeInfo.minVersionCode
                        || forcedUpgradeInfo.forcedUpgradeVersionCodes.contains(version))
            }
        } catch (ignore: Exception) {

        }
        return false
    }

    private fun showDefaultDialog(
        context: Context, title: String, desc: SpannableStringBuilder,
        packageName: String, updateInfo: UpdateInfo, channel: String) {
        val isForcedUpgrade = isForcedUpgrade(updateInfo)
        if (isForcedUpgrade) {
            DialogQueue.getInstance().add(
                title,
                desc,
                context.getString(R.string.down),
                context.getString(R.string.to_app_store),
                object : DialogCancelDissmissOnClickListener() {
                    override fun onClick(dialog: DialogInterface?, which: Int) {
                        super.onClick(dialog, which)
                        toDown(updateInfo)
                    }
                },
                object : DialogCancelDissmissOnClickListener() {
                    override fun onClick(dialog: DialogInterface?, which: Int) {
                        super.onClick(dialog, which)
                        toAppStore(
                            getDialogActivity(dialog),
                            packageName,
                            channel
                        )
                    }
                })
        } else {
            val cancelText = context.getString(R.string.remind_later)
            val ignore = context.getString(R.string.app_update_ignore)
            DialogQueue.getInstance().add(title, desc, context.getString(R.string.down),
                cancelText,
                ignore,
                { _, _ ->
                    toDown(updateInfo)
                },
                { _, _ ->
                    saveNextCheckUpdateTime(
                        context
                    )
                }
            ) { _, _ ->
                if (isCanIgnore(updateInfo)) {
                    saveIgnoreUpdateVersion(
                        context,
                        updateInfo.versionName
                    )
                } else {
                    saveNextCheckUpdateTime(
                        context
                    )
                    ToastUtil.show(context, R.string.cant_ignore_update)
                }
            }
        }
    }

    private fun toDown(updateInfo: UpdateInfo) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(updateInfo.url)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        val activity = ActivityStackManager.getInstance().topActivity
        activity?.startActivity(intent)
    }

    private fun showGoogleDialog(
        context: Context, title: String, desc: SpannableStringBuilder, packageName: String,
        updateInfo: UpdateInfo, channel: String) {
        val cancelText = context.getString(R.string.remind_later)
        val isForcedUpgrade: Boolean = isForcedUpgrade(updateInfo)
        if (isForcedUpgrade) {
            DialogQueue.getInstance().add(
                title,
                desc,
                context.getString(R.string.to_app_store),
                object : DialogCancelDissmissOnClickListener() {
                    override fun onClick(dialog: DialogInterface?, which: Int) {
                        super.onClick(dialog, which)
                        toAppStore(getDialogActivity(dialog), packageName, channel)
                    }
                })
        } else {
            val ignore = context.getString(R.string.app_update_ignore)
            DialogQueue.getInstance().add(title,
                desc,
                context.getString(R.string.to_app_store),
                cancelText,
                ignore,
                { dialog, _ ->
                    toAppStore(
                        getDialogActivity(dialog),
                        packageName,
                        channel
                    )
                },
                { _, _ ->
                    saveNextCheckUpdateTime(
                        context
                    )
                },
                { _, _ ->
                    if (isCanIgnore(updateInfo)) {
                        saveIgnoreUpdateVersion(context, updateInfo.versionName)
                    } else {
                        saveNextCheckUpdateTime(context)
                        ToastUtil.show(
                            context, R.string.cant_ignore_update
                        )
                    }
                })
        }
    }

    private fun isCanIgnore(updateInfo: UpdateInfo): Boolean {
        return updateInfo.isCanIgnore
    }
}