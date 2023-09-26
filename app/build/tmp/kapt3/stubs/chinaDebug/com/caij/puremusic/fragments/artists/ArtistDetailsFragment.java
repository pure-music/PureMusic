package com.caij.puremusic.fragments.artists;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lcom/caij/puremusic/fragments/artists/ArtistDetailsFragment;", "Lcom/caij/puremusic/fragments/artists/AbsArtistDetailsFragment;", "()V", "artistId", "", "getArtistId", "()Ljava/lang/Long;", "artistName", "", "getArtistName", "()Ljava/lang/String;", "detailsViewModel", "Lcom/caij/puremusic/fragments/artists/ArtistDetailsViewModel;", "getDetailsViewModel", "()Lcom/caij/puremusic/fragments/artists/ArtistDetailsViewModel;", "detailsViewModel$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showArtistStep1", "artistWrapper", "Lcom/caij/puremusic/model/ArtistWrapper;", "Companion", "app_chinaDebug"})
public final class ArtistDetailsFragment extends com.caij.puremusic.fragments.artists.AbsArtistDetailsFragment {
    @org.jetbrains.annotations.NotNull()
    private static final java.util.HashMap<java.lang.Long, com.caij.puremusic.db.model.Artist> cache = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy detailsViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.fragments.artists.ArtistDetailsFragment.Companion Companion = null;
    
    public ArtistDetailsFragment() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.caij.puremusic.fragments.artists.ArtistDetailsViewModel getDetailsViewModel() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.Long getArtistId() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getArtistName() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void showArtistStep1(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.model.ArtistWrapper artistWrapper) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/caij/puremusic/fragments/artists/ArtistDetailsFragment$Companion;", "", "()V", "cache", "Ljava/util/HashMap;", "", "Lcom/caij/puremusic/db/model/Artist;", "getCache", "()Ljava/util/HashMap;", "app_chinaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.HashMap<java.lang.Long, com.caij.puremusic.db.model.Artist> getCache() {
            return null;
        }
    }
}