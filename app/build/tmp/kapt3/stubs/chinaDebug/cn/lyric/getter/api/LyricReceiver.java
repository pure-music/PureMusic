package cn.lyric.getter.api;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000e"}, d2 = {"Lcn/lyric/getter/api/LyricReceiver;", "Landroid/content/BroadcastReceiver;", "callback", "Lkotlin/Function1;", "Lcn/lyric/getter/api/data/LyricData;", "", "(Lkotlin/jvm/functions/Function1;)V", "getCallback", "()Lkotlin/jvm/functions/Function1;", "onReceive", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_chinaDebug"})
public final class LyricReceiver extends android.content.BroadcastReceiver {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<cn.lyric.getter.api.data.LyricData, kotlin.Unit> callback = null;
    
    public LyricReceiver(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super cn.lyric.getter.api.data.LyricData, kotlin.Unit> callback) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<cn.lyric.getter.api.data.LyricData, kotlin.Unit> getCallback() {
        return null;
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
}