package com.caij.puremusic.adapter.song;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\n\u001a\u00060\u000bR\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0014J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\bH\u0014J\b\u0010\u0010\u001a\u00020\bH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u001c\u0010\u0014\u001a\u00060\u000bR\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\bH\u0016\u00a8\u0006\u001a"}, d2 = {"Lcom/caij/puremusic/adapter/song/AbsOffsetSongAdapter;", "Lcom/caij/puremusic/adapter/song/SongAdapter;", "activity", "Landroidx/fragment/app/FragmentActivity;", "dataSet", "", "Lcom/caij/puremusic/db/model/Song;", "itemLayoutRes", "", "(Landroidx/fragment/app/FragmentActivity;Ljava/util/List;I)V", "createViewHolder", "Lcom/caij/puremusic/adapter/song/SongAdapter$ViewHolder;", "view", "Landroid/view/View;", "getIdentifier", "position", "getItemCount", "getItemId", "", "getItemViewType", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "ViewHolder", "app_chinaDebug"})
public abstract class AbsOffsetSongAdapter extends com.caij.puremusic.adapter.song.SongAdapter {
    public static final int OFFSET_ITEM = 0;
    public static final int SONG = 1;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.adapter.song.AbsOffsetSongAdapter.Companion Companion = null;
    
    public AbsOffsetSongAdapter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Song> dataSet, @androidx.annotation.LayoutRes()
    int itemLayoutRes) {
        super(null, null, 0, false);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.caij.puremusic.adapter.song.SongAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected com.caij.puremusic.adapter.song.SongAdapter.ViewHolder createViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    protected com.caij.puremusic.db.model.Song getIdentifier(int position) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/caij/puremusic/adapter/song/AbsOffsetSongAdapter$Companion;", "", "()V", "OFFSET_ITEM", "", "SONG", "app_chinaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0096\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\u0006\u001a\u00020\u00078TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000f"}, d2 = {"Lcom/caij/puremusic/adapter/song/AbsOffsetSongAdapter$ViewHolder;", "Lcom/caij/puremusic/adapter/song/SongAdapter$ViewHolder;", "Lcom/caij/puremusic/adapter/song/SongAdapter;", "itemView", "Landroid/view/View;", "(Lcom/caij/puremusic/adapter/song/AbsOffsetSongAdapter;Landroid/view/View;)V", "song", "Lcom/caij/puremusic/db/model/Song;", "getSong", "()Lcom/caij/puremusic/db/model/Song;", "onClick", "", "v", "onLongClick", "", "app_chinaDebug"})
    public class ViewHolder extends com.caij.puremusic.adapter.song.SongAdapter.ViewHolder {
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null, null);
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        protected com.caij.puremusic.db.model.Song getSong() {
            return null;
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.Nullable()
        android.view.View v) {
        }
        
        @java.lang.Override()
        public boolean onLongClick(@org.jetbrains.annotations.Nullable()
        android.view.View v) {
            return false;
        }
    }
}