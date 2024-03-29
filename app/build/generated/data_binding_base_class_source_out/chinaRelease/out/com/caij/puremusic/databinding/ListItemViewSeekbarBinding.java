// Generated by view binder compiler. Do not edit!
package com.caij.puremusic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.caij.puremusic.R;
import com.caij.puremusic.views.BaselineGridTextView;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ListItemViewSeekbarBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Guideline guidelineFrontMargin;

  @NonNull
  public final AppCompatImageView icon;

  @NonNull
  public final SeekBar seekbar;

  @NonNull
  public final TextView seekbarValue;

  @NonNull
  public final BaselineGridTextView summary;

  @NonNull
  public final MaterialTextView title;

  private ListItemViewSeekbarBinding(@NonNull ConstraintLayout rootView,
      @NonNull Guideline guidelineFrontMargin, @NonNull AppCompatImageView icon,
      @NonNull SeekBar seekbar, @NonNull TextView seekbarValue,
      @NonNull BaselineGridTextView summary, @NonNull MaterialTextView title) {
    this.rootView = rootView;
    this.guidelineFrontMargin = guidelineFrontMargin;
    this.icon = icon;
    this.seekbar = seekbar;
    this.seekbarValue = seekbarValue;
    this.summary = summary;
    this.title = title;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ListItemViewSeekbarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListItemViewSeekbarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.list_item_view_seekbar, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListItemViewSeekbarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.guideline_front_margin;
      Guideline guidelineFrontMargin = ViewBindings.findChildViewById(rootView, id);
      if (guidelineFrontMargin == null) {
        break missingId;
      }

      id = android.R.id.icon;
      AppCompatImageView icon = ViewBindings.findChildViewById(rootView, id);
      if (icon == null) {
        break missingId;
      }

      id = R.id.seekbar;
      SeekBar seekbar = ViewBindings.findChildViewById(rootView, id);
      if (seekbar == null) {
        break missingId;
      }

      id = R.id.seekbar_value;
      TextView seekbarValue = ViewBindings.findChildViewById(rootView, id);
      if (seekbarValue == null) {
        break missingId;
      }

      id = android.R.id.summary;
      BaselineGridTextView summary = ViewBindings.findChildViewById(rootView, id);
      if (summary == null) {
        break missingId;
      }

      id = android.R.id.title;
      MaterialTextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      return new ListItemViewSeekbarBinding((ConstraintLayout) rootView, guidelineFrontMargin, icon,
          seekbar, seekbarValue, summary, title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
