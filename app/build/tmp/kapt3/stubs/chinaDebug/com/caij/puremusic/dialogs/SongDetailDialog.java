package com.caij.puremusic.dialogs;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u00012\u00020\u0002:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/caij/puremusic/dialogs/SongDetailDialog;", "Landroidx/fragment/app/DialogFragment;", "Lorg/koin/core/component/KoinComponent;", "()V", "mRoomRepository", "Lcom/caij/puremusic/repository/RoomRepository;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_chinaDebug"})
public final class SongDetailDialog extends androidx.fragment.app.DialogFragment implements org.koin.core.component.KoinComponent {
    @org.jetbrains.annotations.NotNull()
    private final com.caij.puremusic.repository.RoomRepository mRoomRepository = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.dialogs.SongDetailDialog.Companion Companion = null;
    
    public SongDetailDialog() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0002J\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0015"}, d2 = {"Lcom/caij/puremusic/dialogs/SongDetailDialog$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "create", "Lcom/caij/puremusic/dialogs/SongDetailDialog;", "song", "Lcom/caij/puremusic/db/model/Song;", "getFileSizeString", "sizeInBytes", "", "makeTextWithTitle", "Landroid/text/Spanned;", "context", "Landroid/content/Context;", "titleResId", "", "text", "app_chinaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.dialogs.SongDetailDialog create(@org.jetbrains.annotations.NotNull()
        com.caij.puremusic.db.model.Song song) {
            return null;
        }
        
        private final android.text.Spanned makeTextWithTitle(android.content.Context context, int titleResId, java.lang.String text) {
            return null;
        }
        
        private final java.lang.String getFileSizeString(long sizeInBytes) {
            return null;
        }
    }
}