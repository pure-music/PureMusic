// Generated by view binder compiler. Do not edit!
package com.caij.puremusic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.caij.puremusic.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRestoreBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextInputEditText backupName;

  @NonNull
  public final TextInputLayout backupNameContainer;

  @NonNull
  public final MaterialButton cancelButton;

  @NonNull
  public final MaterialCheckBox checkPlaylists;

  @NonNull
  public final MaterialTextView materialTextView;

  @NonNull
  public final MaterialButton restoreButton;

  private ActivityRestoreBinding(@NonNull LinearLayout rootView,
      @NonNull TextInputEditText backupName, @NonNull TextInputLayout backupNameContainer,
      @NonNull MaterialButton cancelButton, @NonNull MaterialCheckBox checkPlaylists,
      @NonNull MaterialTextView materialTextView, @NonNull MaterialButton restoreButton) {
    this.rootView = rootView;
    this.backupName = backupName;
    this.backupNameContainer = backupNameContainer;
    this.cancelButton = cancelButton;
    this.checkPlaylists = checkPlaylists;
    this.materialTextView = materialTextView;
    this.restoreButton = restoreButton;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRestoreBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRestoreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_restore, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRestoreBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backupName;
      TextInputEditText backupName = ViewBindings.findChildViewById(rootView, id);
      if (backupName == null) {
        break missingId;
      }

      id = R.id.backupNameContainer;
      TextInputLayout backupNameContainer = ViewBindings.findChildViewById(rootView, id);
      if (backupNameContainer == null) {
        break missingId;
      }

      id = R.id.cancel_button;
      MaterialButton cancelButton = ViewBindings.findChildViewById(rootView, id);
      if (cancelButton == null) {
        break missingId;
      }

      id = R.id.check_playlists;
      MaterialCheckBox checkPlaylists = ViewBindings.findChildViewById(rootView, id);
      if (checkPlaylists == null) {
        break missingId;
      }

      id = R.id.materialTextView;
      MaterialTextView materialTextView = ViewBindings.findChildViewById(rootView, id);
      if (materialTextView == null) {
        break missingId;
      }

      id = R.id.restore_button;
      MaterialButton restoreButton = ViewBindings.findChildViewById(rootView, id);
      if (restoreButton == null) {
        break missingId;
      }

      return new ActivityRestoreBinding((LinearLayout) rootView, backupName, backupNameContainer,
          cancelButton, checkPlaylists, materialTextView, restoreButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
