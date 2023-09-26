package com.caij.puremusic.adapter.song;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\tH\u0016J\u001c\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u000fR\u00020\u00012\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u001c\u0010\u0011\u001a\u00060\u000fR\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tH\u0016J\u0016\u0010\u0015\u001a\u00020\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017H\u0016\u00a8\u0006\u0018"}, d2 = {"Lcom/caij/puremusic/adapter/song/SimpleSongAdapter;", "Lcom/caij/puremusic/adapter/song/SongAdapter;", "context", "Landroidx/fragment/app/FragmentActivity;", "songs", "Ljava/util/ArrayList;", "Lcom/caij/puremusic/db/model/Song;", "Lkotlin/collections/ArrayList;", "layoutRes", "", "(Landroidx/fragment/app/FragmentActivity;Ljava/util/ArrayList;I)V", "getItemCount", "onBindViewHolder", "", "holder", "Lcom/caij/puremusic/adapter/song/SongAdapter$ViewHolder;", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "swapDataSet", "dataSet", "", "app_chinaDebug"})
public final class SimpleSongAdapter extends com.caij.puremusic.adapter.song.SongAdapter {
    
    public SimpleSongAdapter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.caij.puremusic.db.model.Song> songs, int layoutRes) {
        super(null, null, 0, false);
    }
    
    @java.lang.Override()
    public void swapDataSet(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Song> dataSet) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.caij.puremusic.adapter.song.SongAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.adapter.song.SongAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
}