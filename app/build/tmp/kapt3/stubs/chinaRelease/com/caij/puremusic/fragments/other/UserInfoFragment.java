package com.caij.puremusic.fragments.other;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0014H\u0016J\u001a\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010 \u001a\u00020\u0014H\u0002J\u0018\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J3\u0010!\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\'2!\u0010(\u001a\u001d\u0012\u0013\u0012\u00110*\u00a2\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u00140)H\u0002J\b\u0010.\u001a\u00020\u0014H\u0002J\u0010\u0010/\u001a\u00020\u00142\u0006\u00100\u001a\u00020*H\u0002J\u0010\u00101\u001a\u00020\u00142\u0006\u00100\u001a\u00020*H\u0002J\b\u00102\u001a\u00020\u0014H\u0002J\b\u00103\u001a\u00020\u0014H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lcom/caij/puremusic/fragments/other/UserInfoFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/caij/puremusic/databinding/FragmentUserInfoBinding;", "binding", "getBinding", "()Lcom/caij/puremusic/databinding/FragmentUserInfoBinding;", "libraryViewModel", "Lcom/caij/puremusic/fragments/LibraryViewModel;", "getLibraryViewModel", "()Lcom/caij/puremusic/fragments/LibraryViewModel;", "libraryViewModel$delegate", "Lkotlin/Lazy;", "startForBannerImageResult", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "startForProfileImageResult", "loadProfile", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "pickNewPhoto", "saveImage", "bitmap", "Landroid/graphics/Bitmap;", "fileName", "", "result", "Landroidx/activity/result/ActivityResult;", "doIfResultOk", "Lkotlin/Function1;", "Landroid/net/Uri;", "Lkotlin/ParameterName;", "name", "uri", "selectBannerImage", "setAndSaveBannerImage", "fileUri", "setAndSaveUserImage", "showBannerImageOptions", "showUserImageOptions", "app_chinaRelease"})
public final class UserInfoFragment extends androidx.fragment.app.Fragment {
    private com.caij.puremusic.databinding.FragmentUserInfoBinding _binding;
    private final kotlin.Lazy libraryViewModel$delegate = null;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> startForProfileImageResult = null;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> startForBannerImageResult = null;
    
    public UserInfoFragment() {
        super();
    }
    
    private final com.caij.puremusic.databinding.FragmentUserInfoBinding getBinding() {
        return null;
    }
    
    private final com.caij.puremusic.fragments.LibraryViewModel getLibraryViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showBannerImageOptions() {
    }
    
    private final void showUserImageOptions() {
    }
    
    private final void loadProfile() {
    }
    
    private final void selectBannerImage() {
    }
    
    private final void pickNewPhoto() {
    }
    
    private final void saveImage(androidx.activity.result.ActivityResult result, kotlin.jvm.functions.Function1<? super android.net.Uri, kotlin.Unit> doIfResultOk) {
    }
    
    private final void setAndSaveBannerImage(android.net.Uri fileUri) {
    }
    
    private final void saveImage(android.graphics.Bitmap bitmap, java.lang.String fileName) {
    }
    
    private final void setAndSaveUserImage(android.net.Uri fileUri) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}