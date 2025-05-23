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
import com.caij.puremusic.views.insets.InsetsRecyclerView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class HomeContentBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AbsPlaylistsBinding absPlaylists;

  @NonNull
  public final InsetsRecyclerView recyclerView;

  @NonNull
  public final ItemSuggestionsBinding suggestions;

  private HomeContentBinding(@NonNull LinearLayout rootView,
      @NonNull AbsPlaylistsBinding absPlaylists, @NonNull InsetsRecyclerView recyclerView,
      @NonNull ItemSuggestionsBinding suggestions) {
    this.rootView = rootView;
    this.absPlaylists = absPlaylists;
    this.recyclerView = recyclerView;
    this.suggestions = suggestions;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static HomeContentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static HomeContentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.home_content, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static HomeContentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.abs_playlists;
      View absPlaylists = ViewBindings.findChildViewById(rootView, id);
      if (absPlaylists == null) {
        break missingId;
      }
      AbsPlaylistsBinding binding_absPlaylists = AbsPlaylistsBinding.bind(absPlaylists);

      id = R.id.recyclerView;
      InsetsRecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.suggestions;
      View suggestions = ViewBindings.findChildViewById(rootView, id);
      if (suggestions == null) {
        break missingId;
      }
      ItemSuggestionsBinding binding_suggestions = ItemSuggestionsBinding.bind(suggestions);

      return new HomeContentBinding((LinearLayout) rootView, binding_absPlaylists, recyclerView,
          binding_suggestions);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
