package com.caij.puremusic.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\"B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0007H\u0002J\u0018\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0014H\u0017J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0014H\u0016J\u0018\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0014H\u0016R0\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006@GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/caij/puremusic/adapter/CategoryInfoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/caij/puremusic/adapter/CategoryInfoAdapter$ViewHolder;", "Lcom/caij/puremusic/util/SwipeAndDragHelper$ActionCompletionContract;", "()V", "value", "", "Lcom/caij/puremusic/model/CategoryInfo;", "categoryInfos", "getCategoryInfos", "()Ljava/util/List;", "setCategoryInfos", "(Ljava/util/List;)V", "touchHelper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "attachToRecyclerView", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getItemCount", "", "isLastCheckedCategory", "", "categoryInfo", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewMoved", "oldPosition", "newPosition", "ViewHolder", "app_chinaDebug"})
public final class CategoryInfoAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.caij.puremusic.adapter.CategoryInfoAdapter.ViewHolder> implements com.caij.puremusic.util.SwipeAndDragHelper.ActionCompletionContract {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.caij.puremusic.model.CategoryInfo> categoryInfos;
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.ItemTouchHelper touchHelper = null;
    
    public CategoryInfoAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.caij.puremusic.model.CategoryInfo> getCategoryInfos() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void setCategoryInfos(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.model.CategoryInfo> value) {
    }
    
    public final void attachToRecyclerView(@org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.adapter.CategoryInfoAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.caij.puremusic.adapter.CategoryInfoAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewMoved(int oldPosition, int newPosition) {
    }
    
    private final boolean isLastCheckedCategory(com.caij.puremusic.model.CategoryInfo categoryInfo) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/caij/puremusic/adapter/CategoryInfoAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/caij/puremusic/databinding/PreferenceDialogLibraryCategoriesListitemBinding;", "(Lcom/caij/puremusic/databinding/PreferenceDialogLibraryCategoriesListitemBinding;)V", "getBinding", "()Lcom/caij/puremusic/databinding/PreferenceDialogLibraryCategoriesListitemBinding;", "app_chinaDebug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.caij.puremusic.databinding.PreferenceDialogLibraryCategoriesListitemBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.caij.puremusic.databinding.PreferenceDialogLibraryCategoriesListitemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.databinding.PreferenceDialogLibraryCategoriesListitemBinding getBinding() {
            return null;
        }
    }
}