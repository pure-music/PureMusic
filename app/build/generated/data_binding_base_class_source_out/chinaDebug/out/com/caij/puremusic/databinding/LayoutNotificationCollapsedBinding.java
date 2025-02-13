// Generated by view binder compiler. Do not edit!
package com.caij.puremusic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.caij.puremusic.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutNotificationCollapsedBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageButton actionNext;

  @NonNull
  public final ImageButton actionPlayPause;

  @NonNull
  public final ImageButton actionPrev;

  @NonNull
  public final ImageButton actionQuit;

  @NonNull
  public final LinearLayout actions;

  @NonNull
  public final LinearLayout app;

  @NonNull
  public final TextView appName;

  @NonNull
  public final LinearLayout content;

  @NonNull
  public final RelativeLayout image;

  @NonNull
  public final ImageView largeIcon;

  @NonNull
  public final ImageView smallIcon;

  @NonNull
  public final TextView subtitle;

  @NonNull
  public final TextView title;

  private LayoutNotificationCollapsedBinding(@NonNull RelativeLayout rootView,
      @NonNull ImageButton actionNext, @NonNull ImageButton actionPlayPause,
      @NonNull ImageButton actionPrev, @NonNull ImageButton actionQuit,
      @NonNull LinearLayout actions, @NonNull LinearLayout app, @NonNull TextView appName,
      @NonNull LinearLayout content, @NonNull RelativeLayout image, @NonNull ImageView largeIcon,
      @NonNull ImageView smallIcon, @NonNull TextView subtitle, @NonNull TextView title) {
    this.rootView = rootView;
    this.actionNext = actionNext;
    this.actionPlayPause = actionPlayPause;
    this.actionPrev = actionPrev;
    this.actionQuit = actionQuit;
    this.actions = actions;
    this.app = app;
    this.appName = appName;
    this.content = content;
    this.image = image;
    this.largeIcon = largeIcon;
    this.smallIcon = smallIcon;
    this.subtitle = subtitle;
    this.title = title;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutNotificationCollapsedBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutNotificationCollapsedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_notification_collapsed, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutNotificationCollapsedBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.action_next;
      ImageButton actionNext = ViewBindings.findChildViewById(rootView, id);
      if (actionNext == null) {
        break missingId;
      }

      id = R.id.action_play_pause;
      ImageButton actionPlayPause = ViewBindings.findChildViewById(rootView, id);
      if (actionPlayPause == null) {
        break missingId;
      }

      id = R.id.action_prev;
      ImageButton actionPrev = ViewBindings.findChildViewById(rootView, id);
      if (actionPrev == null) {
        break missingId;
      }

      id = R.id.action_quit;
      ImageButton actionQuit = ViewBindings.findChildViewById(rootView, id);
      if (actionQuit == null) {
        break missingId;
      }

      id = R.id.actions;
      LinearLayout actions = ViewBindings.findChildViewById(rootView, id);
      if (actions == null) {
        break missingId;
      }

      id = R.id.app;
      LinearLayout app = ViewBindings.findChildViewById(rootView, id);
      if (app == null) {
        break missingId;
      }

      id = R.id.appName;
      TextView appName = ViewBindings.findChildViewById(rootView, id);
      if (appName == null) {
        break missingId;
      }

      id = R.id.content;
      LinearLayout content = ViewBindings.findChildViewById(rootView, id);
      if (content == null) {
        break missingId;
      }

      id = R.id.image;
      RelativeLayout image = ViewBindings.findChildViewById(rootView, id);
      if (image == null) {
        break missingId;
      }

      id = R.id.largeIcon;
      ImageView largeIcon = ViewBindings.findChildViewById(rootView, id);
      if (largeIcon == null) {
        break missingId;
      }

      id = R.id.smallIcon;
      ImageView smallIcon = ViewBindings.findChildViewById(rootView, id);
      if (smallIcon == null) {
        break missingId;
      }

      id = R.id.subtitle;
      TextView subtitle = ViewBindings.findChildViewById(rootView, id);
      if (subtitle == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      return new LayoutNotificationCollapsedBinding((RelativeLayout) rootView, actionNext,
          actionPlayPause, actionPrev, actionQuit, actions, app, appName, content, image, largeIcon,
          smallIcon, subtitle, title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
