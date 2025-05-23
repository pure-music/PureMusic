// Generated by view binder compiler. Do not edit!
package com.caij.puremusic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.caij.puremusic.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentColorPlayerBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final View colorGradientBackground;

  @NonNull
  public final IncludePlayerMenuBinding includePlayMenu;

  @NonNull
  public final FragmentContainerView playbackControlsFragment;

  @NonNull
  public final FragmentContainerView playerAlbumCoverFragment;

  @NonNull
  public final FrameLayout playerToolbar;

  private FragmentColorPlayerBinding(@NonNull View rootView, @NonNull View colorGradientBackground,
      @NonNull IncludePlayerMenuBinding includePlayMenu,
      @NonNull FragmentContainerView playbackControlsFragment,
      @NonNull FragmentContainerView playerAlbumCoverFragment, @NonNull FrameLayout playerToolbar) {
    this.rootView = rootView;
    this.colorGradientBackground = colorGradientBackground;
    this.includePlayMenu = includePlayMenu;
    this.playbackControlsFragment = playbackControlsFragment;
    this.playerAlbumCoverFragment = playerAlbumCoverFragment;
    this.playerToolbar = playerToolbar;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentColorPlayerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentColorPlayerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_color_player, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentColorPlayerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.colorGradientBackground;
      View colorGradientBackground = ViewBindings.findChildViewById(rootView, id);
      if (colorGradientBackground == null) {
        break missingId;
      }

      id = R.id.include_play_menu;
      View includePlayMenu = ViewBindings.findChildViewById(rootView, id);
      if (includePlayMenu == null) {
        break missingId;
      }
      IncludePlayerMenuBinding binding_includePlayMenu = IncludePlayerMenuBinding.bind(includePlayMenu);

      id = R.id.playbackControlsFragment;
      FragmentContainerView playbackControlsFragment = ViewBindings.findChildViewById(rootView, id);
      if (playbackControlsFragment == null) {
        break missingId;
      }

      id = R.id.playerAlbumCoverFragment;
      FragmentContainerView playerAlbumCoverFragment = ViewBindings.findChildViewById(rootView, id);
      if (playerAlbumCoverFragment == null) {
        break missingId;
      }

      id = R.id.playerToolbar;
      FrameLayout playerToolbar = ViewBindings.findChildViewById(rootView, id);
      if (playerToolbar == null) {
        break missingId;
      }

      return new FragmentColorPlayerBinding(rootView, colorGradientBackground,
          binding_includePlayMenu, playbackControlsFragment, playerAlbumCoverFragment,
          playerToolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
