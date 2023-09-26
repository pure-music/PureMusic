package com.caij.puremusic.model.smartplaylist;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u00d6\u0001J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u00d6\u0001\u00a8\u0006\u000e"}, d2 = {"Lcom/caij/puremusic/model/smartplaylist/ShuffleAllPlaylist;", "Lcom/caij/puremusic/model/smartplaylist/AbsSmartPlaylist;", "Landroid/os/Parcelable;", "()V", "describeContents", "", "songs", "", "Lcom/caij/puremusic/db/model/Song;", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_chinaDebug"})
@kotlinx.parcelize.Parcelize()
public final class ShuffleAllPlaylist extends com.caij.puremusic.model.smartplaylist.AbsSmartPlaylist implements android.os.Parcelable {
    
    public ShuffleAllPlaylist() {
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