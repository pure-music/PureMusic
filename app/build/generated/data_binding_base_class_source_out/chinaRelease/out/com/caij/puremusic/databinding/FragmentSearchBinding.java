// Generated by view binder compiler. Do not edit!
package com.caij.puremusic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.caij.puremusic.R;
import com.caij.puremusic.views.insets.InsetsRecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSearchBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final AppBarLayout appBarLayout;

  @NonNull
  public final Chip chipAlbumArtists;

  @NonNull
  public final Chip chipAlbums;

  @NonNull
  public final Chip chipArtists;

  @NonNull
  public final Chip chipAudio;

  @NonNull
  public final Chip chipGenres;

  @NonNull
  public final Chip chipPlaylists;

  @NonNull
  public final AppCompatImageView clearText;

  @NonNull
  public final MaterialTextView empty;

  @NonNull
  public final ExtendedFloatingActionButton keyboardPopup;

  @NonNull
  public final InsetsRecyclerView recyclerView;

  @NonNull
  public final ChipGroup searchFilterGroup;

  @NonNull
  public final TextInputEditText searchView;

  @NonNull
  public final MaterialToolbar toolbar;

  @NonNull
  public final AppCompatImageView voiceSearch;

  private FragmentSearchBinding(@NonNull CoordinatorLayout rootView,
      @NonNull AppBarLayout appBarLayout, @NonNull Chip chipAlbumArtists, @NonNull Chip chipAlbums,
      @NonNull Chip chipArtists, @NonNull Chip chipAudio, @NonNull Chip chipGenres,
      @NonNull Chip chipPlaylists, @NonNull AppCompatImageView clearText,
      @NonNull MaterialTextView empty, @NonNull ExtendedFloatingActionButton keyboardPopup,
      @NonNull InsetsRecyclerView recyclerView, @NonNull ChipGroup searchFilterGroup,
      @NonNull TextInputEditText searchView, @NonNull MaterialToolbar toolbar,
      @NonNull AppCompatImageView voiceSearch) {
    this.rootView = rootView;
    this.appBarLayout = appBarLayout;
    this.chipAlbumArtists = chipAlbumArtists;
    this.chipAlbums = chipAlbums;
    this.chipArtists = chipArtists;
    this.chipAudio = chipAudio;
    this.chipGenres = chipGenres;
    this.chipPlaylists = chipPlaylists;
    this.clearText = clearText;
    this.empty = empty;
    this.keyboardPopup = keyboardPopup;
    this.recyclerView = recyclerView;
    this.searchFilterGroup = searchFilterGroup;
    this.searchView = searchView;
    this.toolbar = toolbar;
    this.voiceSearch = voiceSearch;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_search, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSearchBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appBarLayout;
      AppBarLayout appBarLayout = ViewBindings.findChildViewById(rootView, id);
      if (appBarLayout == null) {
        break missingId;
      }

      id = R.id.chip_album_artists;
      Chip chipAlbumArtists = ViewBindings.findChildViewById(rootView, id);
      if (chipAlbumArtists == null) {
        break missingId;
      }

      id = R.id.chip_albums;
      Chip chipAlbums = ViewBindings.findChildViewById(rootView, id);
      if (chipAlbums == null) {
        break missingId;
      }

      id = R.id.chip_artists;
      Chip chipArtists = ViewBindings.findChildViewById(rootView, id);
      if (chipArtists == null) {
        break missingId;
      }

      id = R.id.chip_audio;
      Chip chipAudio = ViewBindings.findChildViewById(rootView, id);
      if (chipAudio == null) {
        break missingId;
      }

      id = R.id.chip_genres;
      Chip chipGenres = ViewBindings.findChildViewById(rootView, id);
      if (chipGenres == null) {
        break missingId;
      }

      id = R.id.chip_playlists;
      Chip chipPlaylists = ViewBindings.findChildViewById(rootView, id);
      if (chipPlaylists == null) {
        break missingId;
      }

      id = R.id.clearText;
      AppCompatImageView clearText = ViewBindings.findChildViewById(rootView, id);
      if (clearText == null) {
        break missingId;
      }

      id = android.R.id.empty;
      MaterialTextView empty = ViewBindings.findChildViewById(rootView, id);
      if (empty == null) {
        break missingId;
      }

      id = R.id.keyboardPopup;
      ExtendedFloatingActionButton keyboardPopup = ViewBindings.findChildViewById(rootView, id);
      if (keyboardPopup == null) {
        break missingId;
      }

      id = R.id.recyclerView;
      InsetsRecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.searchFilterGroup;
      ChipGroup searchFilterGroup = ViewBindings.findChildViewById(rootView, id);
      if (searchFilterGroup == null) {
        break missingId;
      }

      id = R.id.searchView;
      TextInputEditText searchView = ViewBindings.findChildViewById(rootView, id);
      if (searchView == null) {
        break missingId;
      }

      id = R.id.toolbar;
      MaterialToolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.voiceSearch;
      AppCompatImageView voiceSearch = ViewBindings.findChildViewById(rootView, id);
      if (voiceSearch == null) {
        break missingId;
      }

      return new FragmentSearchBinding((CoordinatorLayout) rootView, appBarLayout, chipAlbumArtists,
          chipAlbums, chipArtists, chipAudio, chipGenres, chipPlaylists, clearText, empty,
          keyboardPopup, recyclerView, searchFilterGroup, searchView, toolbar, voiceSearch);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
