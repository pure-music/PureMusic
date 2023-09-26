package com.caij.puremusic.util

import android.content.Context
import android.os.Build
import java.nio.charset.Charset
import java.util.regex.Pattern
import kotlin.text.String
import kotlin.text.toByteArray

object TextCharUtil {

    //只要有繁体，就判定为繁体。因为有些字，简体和繁体是一样的。比如“定影”。如果是这样的字，优先判定为简体。
    fun isSimple(str: String, encode: String): Boolean {
        try {
            val charset = Charset.forName(encode)
            return str == String(str.toByteArray(charset), charset)
        } catch (ignore: Exception) {

        }
        return true
    }

    //判定是中文还是英文，只要含有中文就判定为中文，也比较符合实情吧
    fun isChinese(str: String): Boolean {
        val reg = "[\\u4E00-\\u9FA5]+"
        val m = Pattern.compile(reg).matcher(str)
        if (m.find()) {
//            System.out.println(str + "---是中文");
            return true
        }
        return false
    }

    fun getDeviceCountry(context: Context ): String {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            val local = context.resources.configuration.locales.get(0)
            local.country
        } else {
            val local = context.resources.configuration.locale
            local.country
        }
    }


}