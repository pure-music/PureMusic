package cn.lyric.getter.api.data;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010!\u001a\u00020\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000e\u00a8\u0006#"}, d2 = {"Lcn/lyric/getter/api/data/LyricData;", "Ljava/io/Serializable;", "()V", "base64Icon", "", "getBase64Icon", "()Ljava/lang/String;", "setBase64Icon", "(Ljava/lang/String;)V", "customIcon", "", "getCustomIcon", "()Z", "setCustomIcon", "(Z)V", "lyric", "getLyric", "setLyric", "packageName", "getPackageName", "setPackageName", "serviceName", "getServiceName", "setServiceName", "type", "Lcn/lyric/getter/api/data/DataType;", "getType", "()Lcn/lyric/getter/api/data/DataType;", "setType", "(Lcn/lyric/getter/api/data/DataType;)V", "useOwnMusicController", "getUseOwnMusicController", "setUseOwnMusicController", "toString", "Companion", "app_chinaDebug"})
public final class LyricData implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    private cn.lyric.getter.api.data.DataType type = cn.lyric.getter.api.data.DataType.UPDATE;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String lyric = "";
    private boolean customIcon = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String serviceName = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String packageName = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String base64Icon = "";
    private boolean useOwnMusicController = false;
    private static final long serialVersionUID = 13232L;
    @org.jetbrains.annotations.NotNull()
    public static final cn.lyric.getter.api.data.LyricData.Companion Companion = null;
    
    public LyricData() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final cn.lyric.getter.api.data.DataType getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull()
    cn.lyric.getter.api.data.DataType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLyric() {
        return null;
    }
    
    public final void setLyric(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getCustomIcon() {
        return false;
    }
    
    public final void setCustomIcon(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getServiceName() {
        return null;
    }
    
    public final void setServiceName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPackageName() {
        return null;
    }
    
    public final void setPackageName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBase64Icon() {
        return null;
    }
    
    public final void setBase64Icon(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getUseOwnMusicController() {
        return false;
    }
    
    public final void setUseOwnMusicController(boolean p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcn/lyric/getter/api/data/LyricData$Companion;", "", "()V", "serialVersionUID", "", "app_chinaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}