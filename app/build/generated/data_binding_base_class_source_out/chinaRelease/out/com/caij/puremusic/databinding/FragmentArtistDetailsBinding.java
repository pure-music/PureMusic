// Generated by view binder compiler. Do not edit!
package com.caij.puremusic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.caij.puremusic.R;
import com.caij.puremusic.views.BaselineGridTextView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentArtistDetailsBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final RecyclerView albumRecyclerView;

  @NonNull
  public final MaterialTextView albumTitle;

  @NonNull
  public final AppBarLayout appBarLayout;

  @NonNull
  public final MaterialCardView artistCoverContainer;

  @NonNull
  public final BaselineGridTextView artistTitle;

  @NonNull
  public final BaselineGridTextView desc;

  @NonNull
  public final AppCompatImageView image;

  @NonNull
  public final MaterialButton playAction;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final MaterialButton shuffleAction;

  @NonNull
  public final MaterialButton songSortOrder;

  @NonNull
  public final MaterialTextView songTitle;

  @NonNull
  public final BaselineGridTextView text;

  @NonNull
  public final MaterialToolbar toolbar;

  @NonNull
  public final FrameLayout toolbarContainer;

  private FragmentArtistDetailsBinding(@NonNull CoordinatorLayout rootView,
      @NonNull RecyclerView albumRecyclerView, @NonNull MaterialTextView albumTitle,
      @NonNull AppBarLayout appBarLayout, @NonNull MaterialCardView artistCoverContainer,
      @NonNull BaselineGridTextView artistTitle, @NonNull BaselineGridTextView desc,
      @NonNull AppCompatImageView image, @NonNull MaterialButton playAction,
      @NonNull RecyclerView recyclerView, @NonNull MaterialButton shuffleAction,
      @NonNull MaterialButton songSortOrder, @NonNull MaterialTextView songTitle,
      @NonNull BaselineGridTextView text, @NonNull MaterialToolbar toolbar,
      @NonNull FrameLayout toolbarContainer) {
    this.rootView = rootView;
    this.albumRecyclerView = albumRecyclerView;
    this.albumTitle = albumTitle;
    this.appBarLayout = appBarLayout;
    this.artistCoverContainer = artistCoverContainer;
    this.artistTitle = artistTitle;
    this.desc = desc;
    this.image = image;
    this.playAction = playAction;
    this.recyclerView = recyclerView;
    this.shuffleAction = shuffleAction;
    this.songSortOrder = songSortOrder;
    this.songTitle = songTitle;
    this.text = text;
    this.toolbar = toolbar;
    this.toolbarContainer = toolbarContainer;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentArtistDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentArtistDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_artist_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentArtistDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.albumRecyclerView;
      RecyclerView albumRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (albumRecyclerView == null) {
        break missingId;
      }

      id = R.id.albumTitle;
      MaterialTextView albumTitle = ViewBindings.findChildViewById(rootView, id);
      if (albumTitle == null) {
        break missingId;
      }

      id = R.id.appBarLayout;
      AppBarLayout appBarLayout = ViewBindings.findChildViewById(rootView, id);
      if (appBarLayout == null) {
        break missingId;
      }

      id = R.id.artistCoverContainer;
      MaterialCardView artistCoverContainer = ViewBindings.findChildViewById(rootView, id);
      if (artistCoverContainer == null) {
        break missingId;
      }

      id = R.id.artistTitle;
      BaselineGridTextView artistTitle = ViewBindings.findChildViewById(rootView, id);
      if (artistTitle == null) {
        break missingId;
      }

      id = R.id.desc;
      BaselineGridTextView desc = ViewBindings.findChildViewById(rootView, id);
      if (desc == null) {
        break missingId;
      }

      id = R.id.image;
      AppCompatImageView image = ViewBindings.findChildViewById(rootView, id);
      if (image == null) {
        break missingId;
      }

      id = R.id.playAction;
      MaterialButton playAction = ViewBindings.findChildViewById(rootView, id);
      if (playAction == null) {
        break missingId;
      }

      id = R.id.recyclerView;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.shuffleAction;
      MaterialButton shuffleAction = ViewBindings.findChildViewById(rootView, id);
      if (shuffleAction == null) {
        break missingId;
      }

      id = R.id.song_sort_order;
      MaterialButton songSortOrder = ViewBindings.findChildViewById(rootView, id);
      if (songSortOrder == null) {
        break missingId;
      }

      id = R.id.songTitle;
      MaterialTextView songTitle = ViewBindings.findChildViewById(rootView, id);
      if (songTitle == null) {
        break missingId;
      }

      id = R.id.text;
      BaselineGridTextView text = ViewBindings.findChildViewById(rootView, id);
      if (text == null) {
        break missingId;
      }

      id = R.id.toolbar;
      MaterialToolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.toolbar_container;
      FrameLayout toolbarContainer = ViewBindings.findChildViewById(rootView, id);
      if (toolbarContainer == null) {
        break missingId;
      }

      return new FragmentArtistDetailsBinding((CoordinatorLayout) rootView, albumRecyclerView,
          albumTitle, appBarLayout, artistCoverContainer, artistTitle, desc, image, playAction,
          recyclerView, shuffleAction, songSortOrder, songTitle, text, toolbar, toolbarContainer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
