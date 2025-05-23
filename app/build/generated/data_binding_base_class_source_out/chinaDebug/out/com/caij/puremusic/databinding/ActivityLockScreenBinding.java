// Generated by view binder compiler. Do not edit!
package com.caij.puremusic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.caij.puremusic.R;
import com.caij.puremusic.views.WidthFitSquareCardView;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLockScreenBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final WidthFitSquareCardView albumCoverContainer;

  @NonNull
  public final AppCompatImageView image;

  @NonNull
  public final FragmentContainerView playbackControlsFragment;

  @NonNull
  public final MaterialTextView slide;

  private ActivityLockScreenBinding(@NonNull LinearLayout rootView,
      @NonNull WidthFitSquareCardView albumCoverContainer, @NonNull AppCompatImageView image,
      @NonNull FragmentContainerView playbackControlsFragment, @NonNull MaterialTextView slide) {
    this.rootView = rootView;
    this.albumCoverContainer = albumCoverContainer;
    this.image = image;
    this.playbackControlsFragment = playbackControlsFragment;
    this.slide = slide;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLockScreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLockScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_lock_screen, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLockScreenBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.albumCoverContainer;
      WidthFitSquareCardView albumCoverContainer = ViewBindings.findChildViewById(rootView, id);
      if (albumCoverContainer == null) {
        break missingId;
      }

      id = R.id.image;
      AppCompatImageView image = ViewBindings.findChildViewById(rootView, id);
      if (image == null) {
        break missingId;
      }

      id = R.id.playback_controls_fragment;
      FragmentContainerView playbackControlsFragment = ViewBindings.findChildViewById(rootView, id);
      if (playbackControlsFragment == null) {
        break missingId;
      }

      id = R.id.slide;
      MaterialTextView slide = ViewBindings.findChildViewById(rootView, id);
      if (slide == null) {
        break missingId;
      }

      return new ActivityLockScreenBinding((LinearLayout) rootView, albumCoverContainer, image,
          playbackControlsFragment, slide);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
