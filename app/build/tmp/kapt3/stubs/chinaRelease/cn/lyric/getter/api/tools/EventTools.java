package cn.lyric.getter.api.tools;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J>\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fJ\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fJ\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcn/lyric/getter/api/tools/EventTools;", "", "()V", "API_VERSION", "", "hasEnable", "", "sendLyric", "", "context", "Landroid/content/Context;", "lyric", "", "customIcon", "base64Icon", "useOwnMusicController", "serviceName", "packageName", "stopLyric", "app_chinaRelease"})
public final class EventTools {
    @org.jetbrains.annotations.NotNull()
    public static final cn.lyric.getter.api.tools.EventTools INSTANCE = null;
    public static final int API_VERSION = 4;
    
    private EventTools() {
        super();
    }
    
    public final boolean hasEnable() {
        return false;
    }
    
    /**
     * 发送歌词
     *
     * @param context     Context
     * @param lyric       歌词
     * @param packageName 音乐包名
     */
    public final void sendLyric(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String lyric, @org.jetbrains.annotations.NotNull()
    java.lang.String packageName) {
    }
    
    /**
     * 把歌词
     *
     * @param context               Context
     * @param lyric                 歌词
     * @param customIcon            是否传入自定义图标
     * @param base64Icon            Base64图标，仅在customIcon为true时生效
     * @param useOwnMusicController 音乐软件自己控制歌词暂停
     * @param serviceName           音乐服务名称，仅在useOwnMusicController为false时生效
     * @param packageName           音乐包名
     */
    public final void sendLyric(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String lyric, boolean customIcon, @org.jetbrains.annotations.NotNull()
    java.lang.String base64Icon, boolean useOwnMusicController, @org.jetbrains.annotations.NotNull()
    java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
    java.lang.String packageName) {
    }
    
    public final void stopLyric(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
}