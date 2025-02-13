// Generated by view binder compiler. Do not edit!
package com.caij.puremusic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.caij.puremusic.R;
import com.caij.puremusic.lyrics.SimpleLrcView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.slider.Slider;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentPlayerPlaybackControlsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearProgressIndicator lpnBuffingPosition;

  @NonNull
  public final SimpleLrcView lyricsView2;

  @NonNull
  public final AppCompatImageButton nextButton;

  @NonNull
  public final FloatingActionButton playPauseButton;

  @NonNull
  public final AppCompatImageButton previousButton;

  @NonNull
  public final Slider progressSlider;

  @NonNull
  public final AppCompatImageButton repeatButton;

  @NonNull
  public final AppCompatImageButton shuffleButton;

  @NonNull
  public final MaterialTextView songCurrentProgress;

  @NonNull
  public final MaterialTextView songInfo;

  @NonNull
  public final MaterialTextView songTotalTime;

  @NonNull
  public final MaterialTextView text;

  @NonNull
  public final MaterialTextView title;

  @NonNull
  public final FrameLayout volumeFragmentContainer;

  private FragmentPlayerPlaybackControlsBinding(@NonNull ConstraintLayout rootView,
      @NonNull LinearProgressIndicator lpnBuffingPosition, @NonNull SimpleLrcView lyricsView2,
      @NonNull AppCompatImageButton nextButton, @NonNull FloatingActionButton playPauseButton,
      @NonNull AppCompatImageButton previousButton, @NonNull Slider progressSlider,
      @NonNull AppCompatImageButton repeatButton, @NonNull AppCompatImageButton shuffleButton,
      @NonNull MaterialTextView songCurrentProgress, @NonNull MaterialTextView songInfo,
      @NonNull MaterialTextView songTotalTime, @NonNull MaterialTextView text,
      @NonNull MaterialTextView title, @NonNull FrameLayout volumeFragmentContainer) {
    this.rootView = rootView;
    this.lpnBuffingPosition = lpnBuffingPosition;
    this.lyricsView2 = lyricsView2;
    this.nextButton = nextButton;
    this.playPauseButton = playPauseButton;
    this.previousButton = previousButton;
    this.progressSlider = progressSlider;
    this.repeatButton = repeatButton;
    this.shuffleButton = shuffleButton;
    this.songCurrentProgress = songCurrentProgress;
    this.songInfo = songInfo;
    this.songTotalTime = songTotalTime;
    this.text = text;
    this.title = title;
    this.volumeFragmentContainer = volumeFragmentContainer;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentPlayerPlaybackControlsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentPlayerPlaybackControlsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_player_playback_controls, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentPlayerPlaybackControlsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.lpnBuffingPosition;
      LinearProgressIndicator lpnBuffingPosition = ViewBindings.findChildViewById(rootView, id);
      if (lpnBuffingPosition == null) {
        break missingId;
      }

      id = R.id.lyricsView2;
      SimpleLrcView lyricsView2 = ViewBindings.findChildViewById(rootView, id);
      if (lyricsView2 == null) {
        break missingId;
      }

      id = R.id.nextButton;
      AppCompatImageButton nextButton = ViewBindings.findChildViewById(rootView, id);
      if (nextButton == null) {
        break missingId;
      }

      id = R.id.playPauseButton;
      FloatingActionButton playPauseButton = ViewBindings.findChildViewById(rootView, id);
      if (playPauseButton == null) {
        break missingId;
      }

      id = R.id.previousButton;
      AppCompatImageButton previousButton = ViewBindings.findChildViewById(rootView, id);
      if (previousButton == null) {
        break missingId;
      }

      id = R.id.progressSlider;
      Slider progressSlider = ViewBindings.findChildViewById(rootView, id);
      if (progressSlider == null) {
        break missingId;
      }

      id = R.id.repeatButton;
      AppCompatImageButton repeatButton = ViewBindings.findChildViewById(rootView, id);
      if (repeatButton == null) {
        break missingId;
      }

      id = R.id.shuffleButton;
      AppCompatImageButton shuffleButton = ViewBindings.findChildViewById(rootView, id);
      if (shuffleButton == null) {
        break missingId;
      }

      id = R.id.songCurrentProgress;
      MaterialTextView songCurrentProgress = ViewBindings.findChildViewById(rootView, id);
      if (songCurrentProgress == null) {
        break missingId;
      }

      id = R.id.songInfo;
      MaterialTextView songInfo = ViewBindings.findChildViewById(rootView, id);
      if (songInfo == null) {
        break missingId;
      }

      id = R.id.songTotalTime;
      MaterialTextView songTotalTime = ViewBindings.findChildViewById(rootView, id);
      if (songTotalTime == null) {
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

      id = R.id.volumeFragmentContainer;
      FrameLayout volumeFragmentContainer = ViewBindings.findChildViewById(rootView, id);
      if (volumeFragmentContainer == null) {
        break missingId;
      }

      return new FragmentPlayerPlaybackControlsBinding((ConstraintLayout) rootView,
          lpnBuffingPosition, lyricsView2, nextButton, playPauseButton, previousButton,
          progressSlider, repeatButton, shuffleButton, songCurrentProgress, songInfo, songTotalTime,
          text, title, volumeFragmentContainer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
