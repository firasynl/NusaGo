// Generated by view binder compiler. Do not edit!
package com.nusago.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nusago.R;
import com.nusago.ui.round.CodiaRoundImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProfileBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final CodiaRoundImageView changeHobby;

  @NonNull
  public final CodiaRoundImageView logout;

  @NonNull
  public final RelativeLayout profile;

  private FragmentProfileBinding(@NonNull RelativeLayout rootView,
      @NonNull CodiaRoundImageView changeHobby, @NonNull CodiaRoundImageView logout,
      @NonNull RelativeLayout profile) {
    this.rootView = rootView;
    this.changeHobby = changeHobby;
    this.logout = logout;
    this.profile = profile;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.changeHobby;
      CodiaRoundImageView changeHobby = ViewBindings.findChildViewById(rootView, id);
      if (changeHobby == null) {
        break missingId;
      }

      id = R.id.logout;
      CodiaRoundImageView logout = ViewBindings.findChildViewById(rootView, id);
      if (logout == null) {
        break missingId;
      }

      RelativeLayout profile = (RelativeLayout) rootView;

      return new FragmentProfileBinding((RelativeLayout) rootView, changeHobby, logout, profile);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
