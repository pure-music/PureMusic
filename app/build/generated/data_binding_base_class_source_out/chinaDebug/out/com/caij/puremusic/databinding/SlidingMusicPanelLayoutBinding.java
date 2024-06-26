// Generated by view binder compiler. Do not edit!
package com.caij.puremusic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.caij.puremusic.R;
import com.google.android.material.navigation.NavigationBarView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SlidingMusicPanelLayoutBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final FrameLayout fragmentContainer;

  @NonNull
  public final CoordinatorLayout mainContent;

  @NonNull
  public final NavigationBarView navigationView;

  @NonNull
  public final FrameLayout playerFragmentContainer;

  @NonNull
  public final FrameLayout slidingPanel;

  private SlidingMusicPanelLayoutBinding(@NonNull CoordinatorLayout rootView,
      @NonNull FrameLayout fragmentContainer, @NonNull CoordinatorLayout mainContent,
      @NonNull NavigationBarView navigationView, @NonNull FrameLayout playerFragmentContainer,
      @NonNull FrameLayout slidingPanel) {
    this.rootView = rootView;
    this.fragmentContainer = fragmentContainer;
    this.mainContent = mainContent;
    this.navigationView = navigationView;
    this.playerFragmentContainer = playerFragmentContainer;
    this.slidingPanel = slidingPanel;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SlidingMusicPanelLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SlidingMusicPanelLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.sliding_music_panel_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SlidingMusicPanelLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fragment_container;
      FrameLayout fragmentContainer = ViewBindings.findChildViewById(rootView, id);
      if (fragmentContainer == null) {
        break missingId;
      }

      CoordinatorLayout mainContent = (CoordinatorLayout) rootView;

      id = R.id.navigationView;
      NavigationBarView navigationView = ViewBindings.findChildViewById(rootView, id);
      if (navigationView == null) {
        break missingId;
      }

      id = R.id.playerFragmentContainer;
      FrameLayout playerFragmentContainer = ViewBindings.findChildViewById(rootView, id);
      if (playerFragmentContainer == null) {
        break missingId;
      }

      id = R.id.slidingPanel;
      FrameLayout slidingPanel = ViewBindings.findChildViewById(rootView, id);
      if (slidingPanel == null) {
        break missingId;
      }

      return new SlidingMusicPanelLayoutBinding((CoordinatorLayout) rootView, fragmentContainer,
          mainContent, navigationView, playerFragmentContainer, slidingPanel);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
