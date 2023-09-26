package com.caij.puremusic.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u0010\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u001d"}, d2 = {"Lcom/caij/puremusic/model/CategoryInfo;", "Landroid/os/Parcelable;", "categoryId", "", "visible", "", "(IZ)V", "getCategoryId", "()I", "getVisible", "()Z", "setVisible", "(Z)V", "component1", "component2", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Category", "app_chinaRelease"})
public final class CategoryInfo implements android.os.Parcelable {
    private final int categoryId = 0;
    private boolean visible;
    public static final android.os.Parcelable.Creator<com.caij.puremusic.model.CategoryInfo> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.caij.puremusic.model.CategoryInfo copy(int categoryId, boolean visible) {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public CategoryInfo(int categoryId, boolean visible) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getCategoryId() {
        return 0;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean getVisible() {
        return false;
    }
    
    public final void setVisible(boolean p0) {
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.caij.puremusic.model.CategoryInfo> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.caij.puremusic.model.CategoryInfo createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.caij.puremusic.model.CategoryInfo[] newArray(int size) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B+\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/caij/puremusic/model/CategoryInfo$Category;", "", "id", "", "stringRes", "icon", "idHolder", "(Ljava/lang/String;IIIII)V", "getIcon", "()I", "getId", "getIdHolder", "getStringRes", "Home", "Songs", "Albums", "Artists", "Playlists", "app_chinaRelease"})
    public static enum Category {
        /*public static final*/ Home /* = new Home(0, 0, 0, 0) */,
        /*public static final*/ Songs /* = new Songs(0, 0, 0, 0) */,
        /*public static final*/ Albums /* = new Albums(0, 0, 0, 0) */,
        /*public static final*/ Artists /* = new Artists(0, 0, 0, 0) */,
        /*public static final*/ Playlists /* = new Playlists(0, 0, 0, 0) */;
        private final int id = 0;
        private final int stringRes = 0;
        private final int icon = 0;
        private final int idHolder = 0;
        
        Category(int id, @androidx.annotation.StringRes()
        int stringRes, @androidx.annotation.DrawableRes()
        int icon, int idHolder) {
        }
        
        public final int getId() {
            return 0;
        }
        
        public final int getStringRes() {
            return 0;
        }
        
        public final int getIcon() {
            return 0;
        }
        
        public final int getIdHolder() {
            return 0;
        }
    }
}