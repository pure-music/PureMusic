package cn.lyric.getter.api.tools;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0002J,\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u0013H\u0007\u00a8\u0006\u0015"}, d2 = {"Lcn/lyric/getter/api/tools/Tools;", "", "()V", "base64ToDrawable", "Landroid/graphics/Bitmap;", "base64", "", "drawableToBase64", "bitmap", "drawable", "Landroid/graphics/drawable/Drawable;", "makeDrawableToBitmap", "receptionLyric", "", "context", "Landroid/content/Context;", "apiVersion", "", "callback", "Lkotlin/Function1;", "Lcn/lyric/getter/api/data/LyricData;", "app_chinaDebug"})
public final class Tools {
    @org.jetbrains.annotations.NotNull()
    public static final cn.lyric.getter.api.tools.Tools INSTANCE = null;
    
    private Tools() {
        super();
    }
    
    private final android.graphics.Bitmap makeDrawableToBitmap(android.graphics.drawable.Drawable drawable) {
        return null;
    }
    
    /**
     * @param [base64] 图片的Base64
     * @return [Bitmap] 返回图片的Bitmap?，传入Base64无法转换则为null
     */
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap base64ToDrawable(@org.jetbrains.annotations.NotNull()
    java.lang.String base64) {
        return null;
    }
    
    /**
     * 将Drawable转换成Base64
     *
     * @param drawable 图片
     * @return [String] 返回图片的Base64
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String drawableToBase64(@org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable drawable) {
        return null;
    }
    
    /**
     * 将Bitmap转换成Base64
     *
     * @param bitmap 图片
     * @return [String] 返回图片的Base64
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String drawableToBase64(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap) {
        return null;
    }
    
    /**
     * 接待抒情
     * @param [context] Context
     * @param [callback] 收到歌词的回调
     */
    @android.annotation.SuppressLint(value = {"UnspecifiedRegisterReceiverFlag"})
    public final void receptionLyric(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int apiVersion, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super cn.lyric.getter.api.data.LyricData, kotlin.Unit> callback) {
    }
}