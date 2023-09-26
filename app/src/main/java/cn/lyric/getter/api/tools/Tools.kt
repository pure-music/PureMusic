package cn.lyric.getter.api.tools

import android.annotation.SuppressLint
import android.content.Context
import android.content.IntentFilter
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.drawable.AdaptiveIconDrawable
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.graphics.drawable.VectorDrawable
import android.os.Build
import android.util.Base64
import android.util.Log
import cn.lyric.getter.api.LyricReceiver
import cn.lyric.getter.api.data.LyricData
import java.io.ByteArrayOutputStream


object Tools {

    private fun makeDrawableToBitmap(drawable: Drawable): Bitmap {
        val bitmap = Bitmap.createBitmap(drawable.intrinsicWidth, drawable.intrinsicHeight, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)
        drawable.apply {
            setBounds(0, 0, canvas.width, canvas.height)
            draw(canvas)
        }
        return bitmap
    }


    /**
     *
     * @param [base64] 图片的Base64
     * @return [Bitmap] 返回图片的Bitmap?，传入Base64无法转换则为null
     */
    fun base64ToDrawable(base64: String): Bitmap? {
        return try {
            val bitmapArray: ByteArray = Base64.decode(base64, Base64.DEFAULT)
            BitmapFactory.decodeByteArray(bitmapArray, 0, bitmapArray.size)
        } catch (e: Exception) {
            null
        }
    }

    /**
     * 将Drawable转换成Base64
     *
     * @param drawable 图片
     * @return [String] 返回图片的Base64
     */
    fun drawableToBase64(drawable: Drawable): String {
        Log.d("aaaaaa", drawable::class.java.name)
        when (drawable) {
            is BitmapDrawable -> {
                return drawableToBase64(drawable.bitmap)
            }

            is VectorDrawable -> {
                return drawableToBase64(makeDrawableToBitmap(drawable))
            }

            is AdaptiveIconDrawable -> {
                return drawableToBase64(makeDrawableToBitmap(drawable))
            }

            else -> {
                return try {
                    drawableToBase64((drawable as BitmapDrawable).bitmap)
                } catch (_: Exception) {
                    ""
                }
            }
        }
    }


    /**
     * 将Bitmap转换成Base64
     *
     * @param bitmap 图片
     * @return [String] 返回图片的Base64
     */
    fun drawableToBase64(bitmap: Bitmap): String {
        val stream = ByteArrayOutputStream()
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream)
        val bytes = stream.toByteArray()
        return Base64.encodeToString(bytes, Base64.DEFAULT)
    }

    /**
     * 接待抒情
     * @param [context] Context
     * @param [callback] 收到歌词的回调
     */
    @SuppressLint("UnspecifiedRegisterReceiverFlag")
    fun receptionLyric(context: Context, apiVersion: Int, callback: (LyricData) -> Unit) {
        if (apiVersion != EventTools.API_VERSION) return
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            context.registerReceiver(LyricReceiver(callback), IntentFilter().apply {
                addAction("Lyric_Data")
            }, Context.RECEIVER_EXPORTED)
        } else {
            context.registerReceiver(LyricReceiver(callback), IntentFilter().apply {
                addAction("Lyric_Data")
            })
        }
    }
}