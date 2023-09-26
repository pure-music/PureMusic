package com.caij.puremusic.extensions

import okhttp3.Request

fun Request.Builder.addHeaderMap(headers: Map<String, String>?): Request.Builder {
    if (headers != null) {
        for (item in headers) {
            addHeader(item.key, item.value)
        }
    }
    return this
}

fun Request.Builder.addRangeHeader(request: Request): Request.Builder {
    var range = request.header("Range")
    if (range.isNullOrEmpty()) {
        range = request.header("range")
    }
    if (!range.isNullOrEmpty()) {
        addHeader("Range", range)
    }
    return this
}