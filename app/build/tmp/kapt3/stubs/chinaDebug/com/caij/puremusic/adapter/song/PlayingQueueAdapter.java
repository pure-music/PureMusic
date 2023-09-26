package com.caij.puremusic.adapter.song;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0002!\"B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000bJ\u0014\u0010\r\u001a\u00060\u000eR\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\tH\u0016J\u001c\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00072\n\u0010\u0018\u001a\u00060\u000eR\u00020\u0001H\u0014J\u001c\u0010\u0019\u001a\u00020\u00162\n\u0010\u0018\u001a\u00060\u000eR\u00020\u00012\u0006\u0010\u0012\u001a\u00020\tH\u0016J\u001c\u0010\u001a\u001a\u00020\u00162\n\u0010\u0018\u001a\u00060\u000eR\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u000e\u0010\u001d\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0007J\u001c\u0010\u001f\u001a\u00020\u00162\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070 2\u0006\u0010\u0012\u001a\u00020\tR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/caij/puremusic/adapter/song/PlayingQueueAdapter;", "Lcom/caij/puremusic/adapter/song/SongAdapter;", "Lme/zhanghai/android/fastscroll/PopupTextProvider;", "activity", "Landroidx/fragment/app/FragmentActivity;", "dataSet", "", "Lcom/caij/puremusic/db/model/Song;", "current", "", "itemLayoutRes", "(Landroidx/fragment/app/FragmentActivity;Ljava/util/List;II)V", "songToRemove", "createViewHolder", "Lcom/caij/puremusic/adapter/song/SongAdapter$ViewHolder;", "view", "Landroid/view/View;", "getItemViewType", "position", "getPopupText", "", "loadAlbumCover", "", "song", "holder", "onBindViewHolder", "setAlpha", "alpha", "", "setCurrent", "setSongToRemove", "swapDataSet", "", "Companion", "ViewHolder", "app_chinaDebug"})
public final class PlayingQueueAdapter extends com.caij.puremusic.adapter.song.SongAdapter implements me.zhanghai.android.fastscroll.PopupTextProvider {
    private int current;
    @org.jetbrains.annotations.Nullable()
    private com.caij.puremusic.db.model.Song songToRemove;
    private static final int HISTORY = 0;
    private static final int CURRENT = 1;
    private static final int UP_NEXT = 2;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.adapter.song.PlayingQueueAdapter.Companion Companion = null;
    
    public PlayingQueueAdapter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Song> dataSet, int current, int itemLayoutRes) {
        super(null, null, 0, false);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected com.caij.puremusic.adapter.song.SongAdapter.ViewHolder createViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.adapter.song.SongAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    protected void loadAlbumCover(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song song, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.adapter.song.SongAdapter.ViewHolder holder) {
    }
    
    public final void swapDataSet(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Song> dataSet, int position) {
    }
    
    public final void setCurrent(int current) {
    }
    
    private final void setAlpha(com.caij.puremusic.adapter.song.SongAdapter.ViewHolder holder, float alpha) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getPopupText(int position) {
        return null;
    }
    
    public final void setSongToRemove(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song song) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/caij/puremusic/adapter/song/PlayingQueueAdapter$Companion;", "", "()V", "CURRENT", "", "HISTORY", "UP_NEXT", "app_chinaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0014R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078T@TX\u0094\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lcom/caij/puremusic/adapter/song/PlayingQueueAdapter$ViewHolder;", "Lcom/caij/puremusic/adapter/song/SongAdapter$ViewHolder;", "Lcom/caij/puremusic/adapter/song/SongAdapter;", "itemView", "Landroid/view/View;", "(Lcom/caij/puremusic/adapter/song/PlayingQueueAdapter;Landroid/view/View;)V", "value", "", "songMenuRes", "getSongMenuRes", "()I", "setSongMenuRes", "(I)V", "onClick", "", "v", "onSongMenuItemClick", "", "item", "Landroid/view/MenuItem;", "app_chinaDebug"})
    public final class ViewHolder extends com.caij.puremusic.adapter.song.SongAdapter.ViewHolder {
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null, null);
        }
        
        @java.lang.Override()
        protected int getSongMenuRes() {
            return 0;
        }
        
        @java.lang.Override()
        protected void setSongMenuRes(int value) {
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.Nullable()
        android.view.View v) {
        }
        
        @java.lang.Override()
        protected boolean onSongMenuItemClick(@org.jetbrains.annotations.NotNull()
        android.view.MenuItem item) {
            return false;
        }
    }
}