package cn.lyric.getter.api.data

import java.io.Serializable

class LyricData : Serializable {
    var type: DataType = DataType.UPDATE
    var lyric: String = ""
    var customIcon = false
    var serviceName: String = ""
    var packageName: String = ""
    var base64Icon: String = ""
    var useOwnMusicController = false
    override fun toString(): String {
        return "{\"type\":\"$type\",\"lyric\":\"$lyric\",\"customIcon\":$customIcon,\"serviceName\":\"$serviceName\",\"packageName\":\"$packageName\",\"base64Icon\":\"$base64Icon\",\"base64Icon\":\"$useOwnMusicController\"}"
    }

    companion object {
        private const val serialVersionUID = 13232L
    }
}
