// Generated by view binder compiler. Do not edit!
package com.caij.puremusic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.caij.puremusic.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDonationBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final AppBarLayout appBarLayout;

  @NonNull
  public final MaterialCardView kofi;

  @NonNull
  public final MaterialCardView paypal;

  @NonNull
  public final MaterialToolbar toolbar;

  private ActivityDonationBinding(@NonNull CoordinatorLayout rootView,
      @NonNull AppBarLayout appBarLayout, @NonNull MaterialCardView kofi,
      @NonNull MaterialCardView paypal, @NonNull MaterialToolbar toolbar) {
    this.rootView = rootView;
    this.appBarLayout = appBarLayout;
    this.kofi = kofi;
    this.paypal = paypal;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDonationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDonationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_donation, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDonationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appBarLayout;
      AppBarLayout appBarLayout = ViewBindings.findChildViewById(rootView, id);
      if (appBarLayout == null) {
        break missingId;
      }

      id = R.id.kofi;
      MaterialCardView kofi = ViewBindings.findChildViewById(rootView, id);
      if (kofi == null) {
        break missingId;
      }

      id = R.id.paypal;
      MaterialCardView paypal = ViewBindings.findChildViewById(rootView, id);
      if (paypal == null) {
        break missingId;
      }

      id = R.id.toolbar;
      MaterialToolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityDonationBinding((CoordinatorLayout) rootView, appBarLayout, kofi, paypal,
          toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
