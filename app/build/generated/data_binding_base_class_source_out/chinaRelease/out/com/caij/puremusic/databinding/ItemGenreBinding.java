// Generated by view binder compiler. Do not edit!
package com.caij.puremusic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.caij.puremusic.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemGenreBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final AppCompatImageView image;

  @NonNull
  public final MaterialCardView imageContainerCard;

  @NonNull
  public final MaterialTextView text;

  @NonNull
  public final MaterialTextView title;

  @NonNull
  public final LinearLayout titleContainer;

  private ItemGenreBinding(@NonNull FrameLayout rootView, @NonNull AppCompatImageView image,
      @NonNull MaterialCardView imageContainerCard, @NonNull MaterialTextView text,
      @NonNull MaterialTextView title, @NonNull LinearLayout titleContainer) {
    this.rootView = rootView;
    this.image = image;
    this.imageContainerCard = imageContainerCard;
    this.text = text;
    this.title = title;
    this.titleContainer = titleContainer;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemGenreBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemGenreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_genre, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemGenreBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.image;
      AppCompatImageView image = ViewBindings.findChildViewById(rootView, id);
      if (image == null) {
        break missingId;
      }

      id = R.id.imageContainerCard;
      MaterialCardView imageContainerCard = ViewBindings.findChildViewById(rootView, id);
      if (imageContainerCard == null) {
        break missingId;
      }

      id = R.id.text;
      MaterialTextView text = ViewBindings.findChildViewById(rootView, id);
      if (text == null) {
        break missingId;
      }

      id = R.id.title;
      MaterialTextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      id = R.id.titleContainer;
      LinearLayout titleContainer = ViewBindings.findChildViewById(rootView, id);
      if (titleContainer == null) {
        break missingId;
      }

      return new ItemGenreBinding((FrameLayout) rootView, image, imageContainerCard, text, title,
          titleContainer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
