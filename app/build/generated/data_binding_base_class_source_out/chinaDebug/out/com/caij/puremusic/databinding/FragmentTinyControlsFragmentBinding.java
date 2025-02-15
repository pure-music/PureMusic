// Generated by view binder compiler. Do not edit!
package com.caij.puremusic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.caij.puremusic.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentTinyControlsFragmentBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AppCompatImageButton repeatButton;

  @NonNull
  public final AppCompatImageButton shuffleButton;

  @NonNull
  public final FrameLayout volumeFragmentContainer;

  private FragmentTinyControlsFragmentBinding(@NonNull LinearLayout rootView,
      @NonNull AppCompatImageButton repeatButton, @NonNull AppCompatImageButton shuffleButton,
      @NonNull FrameLayout volumeFragmentContainer) {
    this.rootView = rootView;
    this.repeatButton = repeatButton;
    this.shuffleButton = shuffleButton;
    this.volumeFragmentContainer = volumeFragmentContainer;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentTinyControlsFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentTinyControlsFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_tiny_controls_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentTinyControlsFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.repeatButton;
      AppCompatImageButton repeatButton = ViewBindings.findChildViewById(rootView, id);
      if (repeatButton == null) {
        break missingId;
      }

      id = R.id.shuffleButton;
      AppCompatImageButton shuffleButton = ViewBindings.findChildViewById(rootView, id);
      if (shuffleButton == null) {
        break missingId;
      }

      id = R.id.volumeFragmentContainer;
      FrameLayout volumeFragmentContainer = ViewBindings.findChildViewById(rootView, id);
      if (volumeFragmentContainer == null) {
        break missingId;
      }

      return new FragmentTinyControlsFragmentBinding((LinearLayout) rootView, repeatButton,
          shuffleButton, volumeFragmentContainer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
