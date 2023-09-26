package com.caij.puremusic.fragments.player;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0019H\u0016J\b\u0010\u001d\u001a\u00020\u0019H\u0016J\b\u0010\u001e\u001a\u00020\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0016J\u001c\u0010 \u001a\u00020\u00192\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J \u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\'2\u0006\u0010)\u001a\u00020\'H\u0016J\u001a\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u000e\u0010/\u001a\u00020\u00192\u0006\u00100\u001a\u000201J\b\u00102\u001a\u00020\u0019H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/caij/puremusic/fragments/player/CoverLyricsFragment;", "Lcom/caij/puremusic/fragments/base/AbsMusicServiceFragment;", "Lcom/caij/puremusic/helper/MusicProgressViewUpdateHelper$Callback;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "()V", "_binding", "Lcom/caij/puremusic/databinding/FragmentCoverLyricsBinding;", "binding", "getBinding", "()Lcom/caij/puremusic/databinding/FragmentCoverLyricsBinding;", "lyrics", "Lcom/caij/puremusic/model/lyrics/Lyrics;", "lyricsLayout", "Landroid/widget/FrameLayout;", "getLyricsLayout", "()Landroid/widget/FrameLayout;", "lyricsLine1", "Landroid/widget/TextView;", "getLyricsLine1", "()Landroid/widget/TextView;", "lyricsLine2", "getLyricsLine2", "progressViewUpdateHelper", "Lcom/caij/puremusic/helper/MusicProgressViewUpdateHelper;", "hideLyricsLayout", "", "isLyricsLayoutVisible", "", "onDestroyView", "onPlayingMetaChanged", "onResume", "onServiceConnected", "onSharedPreferenceChanged", "sharedPreferences", "Landroid/content/SharedPreferences;", "key", "", "onUpdateProgressViews", "progress", "", "bufferedPosition", "total", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setColors", "color", "Lcom/caij/puremusic/util/color/MediaNotificationProcessor;", "updateLyrics", "app_chinaDebug"})
public final class CoverLyricsFragment extends com.caij.puremusic.fragments.base.AbsMusicServiceFragment implements com.caij.puremusic.helper.MusicProgressViewUpdateHelper.Callback, android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    @org.jetbrains.annotations.Nullable()
    private com.caij.puremusic.helper.MusicProgressViewUpdateHelper progressViewUpdateHelper;
    @org.jetbrains.annotations.Nullable()
    private com.caij.puremusic.databinding.FragmentCoverLyricsBinding _binding;
    @org.jetbrains.annotations.Nullable()
    private com.caij.puremusic.model.lyrics.Lyrics lyrics;
    
    public CoverLyricsFragment() {
        super(0);
    }
    
    private final com.caij.puremusic.databinding.FragmentCoverLyricsBinding getBinding() {
        return null;
    }
    
    private final android.widget.FrameLayout getLyricsLayout() {
        return null;
    }
    
    private final android.widget.TextView getLyricsLine1() {
        return null;
    }
    
    private final android.widget.TextView getLyricsLine2() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setColors(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.util.color.MediaNotificationProcessor color) {
    }
    
    @java.lang.Override()
    public void onSharedPreferenceChanged(@org.jetbrains.annotations.Nullable()
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.Nullable()
    java.lang.String key) {
    }
    
    @java.lang.Override()
    public void onPlayingMetaChanged() {
    }
    
    @java.lang.Override()
    public void onServiceConnected() {
    }
    
    private final void updateLyrics() {
    }
    
    @java.lang.Override()
    public void onUpdateProgressViews(int progress, int bufferedPosition, int total) {
    }
    
    private final boolean isLyricsLayoutVisible() {
        return false;
    }
    
    private final void hideLyricsLayout() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}