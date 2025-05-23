// Generated by view binder compiler. Do not edit!
package com.caij.puremusic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.caij.puremusic.R;
import com.caij.puremusic.views.BaselineGridTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemPermissionBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton button;

  @NonNull
  public final AppCompatImageView checkImage;

  @NonNull
  public final Guideline guidelineFrontMargin;

  @NonNull
  public final MaterialTextView number;

  @NonNull
  public final BaselineGridTextView summary;

  @NonNull
  public final MaterialTextView title;

  private ItemPermissionBinding(@NonNull ConstraintLayout rootView, @NonNull MaterialButton button,
      @NonNull AppCompatImageView checkImage, @NonNull Guideline guidelineFrontMargin,
      @NonNull MaterialTextView number, @NonNull BaselineGridTextView summary,
      @NonNull MaterialTextView title) {
    this.rootView = rootView;
    this.button = button;
    this.checkImage = checkImage;
    this.guidelineFrontMargin = guidelineFrontMargin;
    this.number = number;
    this.summary = summary;
    this.title = title;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemPermissionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemPermissionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_permission, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemPermissionBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button;
      MaterialButton button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.checkImage;
      AppCompatImageView checkImage = ViewBindings.findChildViewById(rootView, id);
      if (checkImage == null) {
        break missingId;
      }

      id = R.id.guideline_front_margin;
      Guideline guidelineFrontMargin = ViewBindings.findChildViewById(rootView, id);
      if (guidelineFrontMargin == null) {
        break missingId;
      }

      id = R.id.number;
      MaterialTextView number = ViewBindings.findChildViewById(rootView, id);
      if (number == null) {
        break missingId;
      }

      id = R.id.summary;
      BaselineGridTextView summary = ViewBindings.findChildViewById(rootView, id);
      if (summary == null) {
        break missingId;
      }

      id = R.id.title;
      MaterialTextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      return new ItemPermissionBinding((ConstraintLayout) rootView, button, checkImage,
          guidelineFrontMargin, number, summary, title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
