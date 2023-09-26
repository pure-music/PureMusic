package com.caij.puremusic.interfaces;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J(\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00050\rj\b\u0012\u0004\u0012\u00020\u0005`\u000eH&\u00a8\u0006\u000f"}, d2 = {"Lcom/caij/puremusic/interfaces/ICallbacks;", "", "onFileMenuClicked", "", "file", "Ljava/io/File;", "view", "Landroid/view/View;", "onFileSelected", "onMultipleItemAction", "item", "Landroid/view/MenuItem;", "files", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "app_chinaDebug"})
public abstract interface ICallbacks {
    
    public abstract void onFileSelected(@org.jetbrains.annotations.NotNull()
    java.io.File file);
    
    public abstract void onFileMenuClicked(@org.jetbrains.annotations.NotNull()
    java.io.File file, @org.jetbrains.annotations.NotNull()
    android.view.View view);
    
    public abstract void onMultipleItemAction(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.io.File> files);
}