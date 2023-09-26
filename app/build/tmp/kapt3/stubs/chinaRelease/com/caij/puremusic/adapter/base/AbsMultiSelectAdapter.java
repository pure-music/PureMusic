package com.caij.puremusic.adapter.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\b&\u0018\u0000*\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u0002*\u0004\b\u0001\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\u0017\u0010\u001d\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001e\u001a\u00020\tH$\u00a2\u0006\u0002\u0010\u001fJ\u0017\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00028\u0001H$\u00a2\u0006\u0002\u0010#J\u0015\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00028\u0001H\u0004\u00a2\u0006\u0002\u0010&J\u001c\u0010\'\u001a\u00020\u00162\b\u0010(\u001a\u0004\u0018\u00010\f2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u001c\u0010+\u001a\u00020\u00162\b\u0010(\u001a\u0004\u0018\u00010\f2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0012\u0010.\u001a\u00020\u001b2\b\u0010(\u001a\u0004\u0018\u00010\fH\u0016J\u001e\u0010/\u001a\u00020\u001b2\u0006\u00100\u001a\u00020*2\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u000102H$J\u001c\u00103\u001a\u00020\u00162\b\u0010(\u001a\u0004\u0018\u00010\f2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0012\u00104\u001a\u00020\u001b2\b\b\u0001\u0010\b\u001a\u00020\tH\u0004J\u0010\u00105\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\tH\u0004J\b\u00106\u001a\u00020\u001bH\u0002R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00168DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0017R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00067"}, d2 = {"Lcom/caij/puremusic/adapter/base/AbsMultiSelectAdapter;", "V", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "I", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroid/view/ActionMode$Callback;", "activity", "Landroidx/fragment/app/FragmentActivity;", "menuRes", "", "(Landroidx/fragment/app/FragmentActivity;I)V", "actionMode", "Landroid/view/ActionMode;", "getActionMode", "()Landroid/view/ActionMode;", "setActionMode", "(Landroid/view/ActionMode;)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "checked", "", "isInQuickSelectMode", "", "()Z", "onBackPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "checkAll", "", "clearChecked", "getIdentifier", "position", "(I)Ljava/lang/Object;", "getName", "", "model", "(Ljava/lang/Object;)Ljava/lang/String;", "isChecked", "identifier", "(Ljava/lang/Object;)Z", "onActionItemClicked", "mode", "item", "Landroid/view/MenuItem;", "onCreateActionMode", "menu", "Landroid/view/Menu;", "onDestroyActionMode", "onMultipleItemAction", "menuItem", "selection", "", "onPrepareActionMode", "setMultiSelectMenuRes", "toggleChecked", "updateCab", "app_chinaRelease"})
public abstract class AbsMultiSelectAdapter<V extends androidx.recyclerview.widget.RecyclerView.ViewHolder, I extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.Adapter<V> implements android.view.ActionMode.Callback {
    @org.jetbrains.annotations.NotNull()
    private final androidx.fragment.app.FragmentActivity activity = null;
    @org.jetbrains.annotations.Nullable()
    private android.view.ActionMode actionMode;
    private final java.util.List<I> checked = null;
    private int menuRes;
    private final androidx.activity.OnBackPressedCallback onBackPressedCallback = null;
    
    public AbsMultiSelectAdapter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @androidx.annotation.MenuRes()
    int menuRes) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public androidx.fragment.app.FragmentActivity getActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.ActionMode getActionMode() {
        return null;
    }
    
    public final void setActionMode(@org.jetbrains.annotations.Nullable()
    android.view.ActionMode p0) {
    }
    
    @java.lang.Override()
    public boolean onCreateActionMode(@org.jetbrains.annotations.Nullable()
    android.view.ActionMode mode, @org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onPrepareActionMode(@org.jetbrains.annotations.Nullable()
    android.view.ActionMode mode, @org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onActionItemClicked(@org.jetbrains.annotations.Nullable()
    android.view.ActionMode mode, @org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onDestroyActionMode(@org.jetbrains.annotations.Nullable()
    android.view.ActionMode mode) {
    }
    
    private final void checkAll() {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected abstract I getIdentifier(int position);
    
    @org.jetbrains.annotations.Nullable()
    protected abstract java.lang.String getName(I model);
    
    protected final boolean isChecked(I identifier) {
        return false;
    }
    
    protected final boolean isInQuickSelectMode() {
        return false;
    }
    
    protected abstract void onMultipleItemAction(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem menuItem, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends I> selection);
    
    protected final void setMultiSelectMenuRes(@androidx.annotation.MenuRes()
    int menuRes) {
    }
    
    protected final boolean toggleChecked(int position) {
        return false;
    }
    
    private final void clearChecked() {
    }
    
    private final void updateCab() {
    }
}