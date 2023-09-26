package com.caij.puremusic.adapter.album;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\u00060\u000bR\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006H\u0014J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0016J\u001c\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00062\n\u0010\u0018\u001a\u00060\u000bR\u00020\u0001H\u0014J\u001c\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\n\u0010\u0018\u001a\u00060\u000bR\u00020\u0001H\u0014\u00a8\u0006\u001d"}, d2 = {"Lcom/caij/puremusic/adapter/album/HorizontalAlbumAdapter;", "Lcom/caij/puremusic/adapter/album/AlbumAdapter;", "activity", "Landroidx/fragment/app/FragmentActivity;", "dataSet", "", "Lcom/caij/puremusic/db/model/Album;", "albumClickListener", "Lcom/caij/puremusic/interfaces/IAlbumClickListener;", "(Landroidx/fragment/app/FragmentActivity;Ljava/util/List;Lcom/caij/puremusic/interfaces/IAlbumClickListener;)V", "createViewHolder", "Lcom/caij/puremusic/adapter/album/AlbumAdapter$ViewHolder;", "view", "Landroid/view/View;", "viewType", "", "getAlbumText", "", "album", "getItemCount", "getItemViewType", "position", "loadAlbumCover", "", "holder", "setColors", "color", "Lcom/caij/puremusic/util/color/MediaNotificationProcessor;", "Companion", "app_chinaDebug"})
public final class HorizontalAlbumAdapter extends com.caij.puremusic.adapter.album.AlbumAdapter {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.adapter.album.HorizontalAlbumAdapter.Companion Companion = null;
    
    public HorizontalAlbumAdapter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Album> dataSet, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.interfaces.IAlbumClickListener albumClickListener) {
        super(null, null, 0, null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected com.caij.puremusic.adapter.album.AlbumAdapter.ViewHolder createViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View view, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    protected void setColors(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.util.color.MediaNotificationProcessor color, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.adapter.album.AlbumAdapter.ViewHolder holder) {
    }
    
    @java.lang.Override()
    protected void loadAlbumCover(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Album album, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.adapter.album.AlbumAdapter.ViewHolder holder) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected java.lang.String getAlbumText(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Album album) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/caij/puremusic/adapter/album/HorizontalAlbumAdapter$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "app_chinaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG() {
            return null;
        }
    }
}