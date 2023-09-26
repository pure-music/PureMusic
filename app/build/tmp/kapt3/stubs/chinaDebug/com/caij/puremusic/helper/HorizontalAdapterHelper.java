package com.caij.puremusic.helper;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004J\u0016\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/caij/puremusic/helper/HorizontalAdapterHelper;", "", "()V", "LAYOUT_RES", "", "TYPE_FIRST", "TYPE_LAST", "TYPE_MIDDLE", "applyMarginToLayoutParams", "", "context", "Landroid/content/Context;", "layoutParams", "Landroid/view/ViewGroup$MarginLayoutParams;", "viewType", "getItemViewType", "position", "itemCount", "app_chinaDebug"})
public final class HorizontalAdapterHelper {
    public static final int LAYOUT_RES = com.caij.puremusic.R.layout.item_image;
    private static final int TYPE_FIRST = 1;
    private static final int TYPE_MIDDLE = 2;
    private static final int TYPE_LAST = 3;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.helper.HorizontalAdapterHelper INSTANCE = null;
    
    private HorizontalAdapterHelper() {
        super();
    }
    
    public final void applyMarginToLayoutParams(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup.MarginLayoutParams layoutParams, int viewType) {
    }
    
    public final int getItemViewType(int position, int itemCount) {
        return 0;
    }
}