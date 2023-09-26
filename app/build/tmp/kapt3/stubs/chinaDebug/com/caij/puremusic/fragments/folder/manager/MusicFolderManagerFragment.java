package com.caij.puremusic.fragments.folder.manager;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J$\u0010\u001c\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016J\"\u0010#\u001a\u00020$2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\'H\u0016J\u0018\u0010(\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u001a\u0010)\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020\u00172\u0006\u0010/\u001a\u000200H\u0002J\u0010\u00101\u001a\u00020\u00172\u0006\u00102\u001a\u000203H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lcom/caij/puremusic/fragments/folder/manager/MusicFolderManagerFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/core/view/MenuProvider;", "Lcom/caij/adapter/RecyclerViewOnItemClickListener;", "Lcom/caij/adapter/OnItemPartViewClickListener;", "Lcom/caij/adapter/RecyclerViewOnItemLongClickListener;", "()V", "_binding", "Lcom/caij/puremusic/databinding/FragmentMusicManagerBinding;", "binding", "getBinding", "()Lcom/caij/puremusic/databinding/FragmentMusicManagerBinding;", "libraryViewModel", "Lcom/caij/puremusic/fragments/LibraryViewModel;", "getLibraryViewModel", "()Lcom/caij/puremusic/fragments/LibraryViewModel;", "libraryViewModel$delegate", "Lkotlin/Lazy;", "musicFolderAdapter", "Lcom/caij/puremusic/adapter/MusicFolderAdapter;", "musicFolderUtil", "Lcom/caij/puremusic/fragments/folder/manager/MusicFolderUtil;", "onCreateMenu", "", "menu", "Landroid/view/Menu;", "menuInflater", "Landroid/view/MenuInflater;", "onItemClick", "baseViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "position", "", "onItemLongClick", "", "onMenuItemSelected", "menuItem", "Landroid/view/MenuItem;", "onPartViewClick", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "showLoadingDialog", "Landroidx/appcompat/app/AlertDialog;", "showLongDialog", "folderWrapper", "Lcom/caij/puremusic/adapter/FolderWrapper;", "toFolderDetailActivity", "folder", "Lcom/caij/puremusic/db/model/Folder;", "app_chinaDebug"})
public final class MusicFolderManagerFragment extends androidx.fragment.app.Fragment implements androidx.core.view.MenuProvider, com.caij.adapter.RecyclerViewOnItemClickListener, com.caij.adapter.OnItemPartViewClickListener, com.caij.adapter.RecyclerViewOnItemLongClickListener {
    @org.jetbrains.annotations.Nullable()
    private com.caij.puremusic.databinding.FragmentMusicManagerBinding _binding;
    private com.caij.puremusic.adapter.MusicFolderAdapter musicFolderAdapter;
    private com.caij.puremusic.fragments.folder.manager.MusicFolderUtil musicFolderUtil;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy libraryViewModel$delegate = null;
    
    public MusicFolderManagerFragment() {
        super();
    }
    
    private final com.caij.puremusic.databinding.FragmentMusicManagerBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.caij.puremusic.fragments.LibraryViewModel getLibraryViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onCreateMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater menuInflater) {
    }
    
    @java.lang.Override()
    public boolean onMenuItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem menuItem) {
        return false;
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.RecyclerView.ViewHolder baseViewHolder, @org.jetbrains.annotations.Nullable()
    android.view.View view, int position) {
    }
    
    private final void toFolderDetailActivity(com.caij.puremusic.db.model.Folder folder) {
    }
    
    @java.lang.Override()
    public void onPartViewClick(@org.jetbrains.annotations.NotNull()
    android.view.View view, int position) {
    }
    
    @java.lang.Override()
    public boolean onItemLongClick(@org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.RecyclerView.ViewHolder baseViewHolder, @org.jetbrains.annotations.NotNull()
    android.view.View view, int position) {
        return false;
    }
    
    private final void showLongDialog(com.caij.puremusic.adapter.FolderWrapper folderWrapper) {
    }
    
    private final androidx.appcompat.app.AlertDialog showLoadingDialog() {
        return null;
    }
}