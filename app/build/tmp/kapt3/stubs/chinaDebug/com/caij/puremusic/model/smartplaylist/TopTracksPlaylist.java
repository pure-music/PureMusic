package com.caij.puremusic.model.smartplaylist;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\r"}, d2 = {"Lcom/caij/puremusic/model/smartplaylist/TopTracksPlaylist;", "Lcom/caij/puremusic/model/smartplaylist/AbsSmartPlaylist;", "()V", "describeContents", "", "songs", "", "Lcom/caij/puremusic/db/model/Song;", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_chinaDebug"})
@kotlinx.parcelize.Parcelize()
public final class TopTracksPlaylist extends com.caij.puremusic.model.smartplaylist.AbsSmartPlaylist {
    
    public TopTracksPlaylist() {
        super(null, 0);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.caij.puremusic.db.model.Song> songs() {
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
}