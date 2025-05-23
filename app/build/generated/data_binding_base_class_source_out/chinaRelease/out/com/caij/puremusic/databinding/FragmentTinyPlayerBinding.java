// Generated by view binder compiler. Do not edit!
package com.caij.puremusic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.caij.puremusic.R;
import com.caij.puremusic.views.VerticalTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentTinyPlayerBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final IncludePlayerMenuBinding includePlayMenu;

  @NonNull
  public final View masked;

  @NonNull
  public final FragmentContainerView playbackControlsFragment;

  @NonNull
  public final FragmentContainerView playerAlbumCoverFragment;

  @NonNull
  public final VerticalTextView playerSongTotalTime;

  @NonNull
  public final FrameLayout playerToolbar;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final VerticalTextView songInfo;

  @NonNull
  public final VerticalTextView text;

  @NonNull
  public final VerticalTextView title;

  private FragmentTinyPlayerBinding(@NonNull ConstraintLayout rootView,
      @NonNull IncludePlayerMenuBinding includePlayMenu, @NonNull View masked,
      @NonNull FragmentContainerView playbackControlsFragment,
      @NonNull FragmentContainerView playerAlbumCoverFragment,
      @NonNull VerticalTextView playerSongTotalTime, @NonNull FrameLayout playerToolbar,
      @NonNull ProgressBar progressBar, @NonNull VerticalTextView songInfo,
      @NonNull VerticalTextView text, @NonNull VerticalTextView title) {
    this.rootView = rootView;
    this.includePlayMenu = includePlayMenu;
    this.masked = masked;
    this.playbackControlsFragment = playbackControlsFragment;
    this.playerAlbumCoverFragment = playerAlbumCoverFragment;
    this.playerSongTotalTime = playerSongTotalTime;
    this.playerToolbar = playerToolbar;
    this.progressBar = progressBar;
    this.songInfo = songInfo;
    this.text = text;
    this.title = title;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentTinyPlayerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentTinyPlayerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_tiny_player, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentTinyPlayerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.include_play_menu;
      View includePlayMenu = ViewBindings.findChildViewById(rootView, id);
      if (includePlayMenu == null) {
        break missingId;
      }
      IncludePlayerMenuBinding binding_includePlayMenu = IncludePlayerMenuBinding.bind(includePlayMenu);

      id = R.id.masked;
      View masked = ViewBindings.findChildViewById(rootView, id);
      if (masked == null) {
        break missingId;
      }

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

      id = R.id.playerSongTotalTime;
      VerticalTextView playerSongTotalTime = ViewBindings.findChildViewById(rootView, id);
      if (playerSongTotalTime == null) {
        break missingId;
      }

      id = R.id.playerToolbar;
      FrameLayout playerToolbar = ViewBindings.findChildViewById(rootView, id);
      if (playerToolbar == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.songInfo;
      VerticalTextView songInfo = ViewBindings.findChildViewById(rootView, id);
      if (songInfo == null) {
        break missingId;
      }

      id = R.id.text;
      VerticalTextView text = ViewBindings.findChildViewById(rootView, id);
      if (text == null) {
        break missingId;
      }

      id = R.id.title;
      VerticalTextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      return new FragmentTinyPlayerBinding((ConstraintLayout) rootView, binding_includePlayMenu,
          masked, playbackControlsFragment, playerAlbumCoverFragment, playerSongTotalTime,
          playerToolbar, progressBar, songInfo, text, title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
