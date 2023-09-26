package com.caij.puremusic.fragments.base;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0006\u0010\u0016\u001a\u00020\u0011R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0011\u0010\f\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0017"}, d2 = {"Lcom/caij/puremusic/fragments/base/AbsMainActivityFragment;", "Lcom/caij/puremusic/fragments/base/AbsMusicServiceFragment;", "Landroidx/core/view/MenuProvider;", "layout", "", "(I)V", "libraryViewModel", "Lcom/caij/puremusic/fragments/LibraryViewModel;", "getLibraryViewModel", "()Lcom/caij/puremusic/fragments/LibraryViewModel;", "libraryViewModel$delegate", "Lkotlin/Lazy;", "mainActivity", "Lcom/caij/puremusic/activities/MainActivity;", "getMainActivity", "()Lcom/caij/puremusic/activities/MainActivity;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "popUp", "app_chinaDebug"})
public abstract class AbsMainActivityFragment extends com.caij.puremusic.fragments.base.AbsMusicServiceFragment implements androidx.core.view.MenuProvider {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy libraryViewModel$delegate = null;
    
    public AbsMainActivityFragment(@androidx.annotation.LayoutRes()
    int layout) {
        super(0);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.caij.puremusic.fragments.LibraryViewModel getLibraryViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.caij.puremusic.activities.MainActivity getMainActivity() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void popUp() {
    }
}