package com.caij.puremusic.util

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.io.Reader
import java.lang.reflect.Type

object GsonUtil {

    @JvmStatic
    private val gson: Gson = GsonBuilder().create()

    @JvmStatic
    fun toJson(obj: Any?): String {
        return gson.toJson(obj)
    }

    @JvmStatic
    fun toJson(obj: Any, writer: Appendable?) {
        gson.toJson(obj, obj.javaClass, writer)
    }

    @JvmStatic
    fun <T> fromJson(json: String?, tClass: Class<T>?): T {
        return gson.fromJson<T>(json, tClass)
    }

    @JvmStatic
    fun <T> fromJson(reader: Reader?, tClass: Class<T>?): T {
        return gson.fromJson<T>(reader, tClass)
    }

    @JvmStatic
    fun <T> fromJsonType(json: String?, type: Type): T {
        return gson.fromJson<T>(json, type)
    }
}