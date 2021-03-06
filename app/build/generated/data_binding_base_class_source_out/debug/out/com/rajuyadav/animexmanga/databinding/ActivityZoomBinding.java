// Generated by data binding compiler. Do not edit!
package com.rajuyadav.animexmanga.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.rajuyadav.animexmanga.R;
import com.rajuyadav.animexmanga.utilities.ZoomClass;
import com.rajuyadav.animexmanga.viewmodel.MainViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityZoomBinding extends ViewDataBinding {
  @NonNull
  public final ZoomClass largeImage;

  @Bindable
  protected MainViewModel mMainmodel;

  @Bindable
  protected String mImgURL;

  protected ActivityZoomBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ZoomClass largeImage) {
    super(_bindingComponent, _root, _localFieldCount);
    this.largeImage = largeImage;
  }

  public abstract void setMainmodel(@Nullable MainViewModel mainmodel);

  @Nullable
  public MainViewModel getMainmodel() {
    return mMainmodel;
  }

  public abstract void setImgURL(@Nullable String imgURL);

  @Nullable
  public String getImgURL() {
    return mImgURL;
  }

  @NonNull
  public static ActivityZoomBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_zoom, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityZoomBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityZoomBinding>inflateInternal(inflater, R.layout.activity_zoom, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityZoomBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_zoom, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityZoomBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityZoomBinding>inflateInternal(inflater, R.layout.activity_zoom, null, false, component);
  }

  public static ActivityZoomBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityZoomBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityZoomBinding)bind(component, view, R.layout.activity_zoom);
  }
}
