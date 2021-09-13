// Generated by data binding compiler. Do not edit!
package com.rajuyadav.animexmanga.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.rajuyadav.animexmanga.R;
import com.rajuyadav.animexmanga.viewmodel.MainViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMangaDetailsBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView activityMangaDetailsRecyclerviewList;

  @NonNull
  public final TextView activityMangaDetailsTextviewAppTitle;

  @Bindable
  protected MainViewModel mViewModel;

  protected ActivityMangaDetailsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView activityMangaDetailsRecyclerviewList,
      TextView activityMangaDetailsTextviewAppTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.activityMangaDetailsRecyclerviewList = activityMangaDetailsRecyclerviewList;
    this.activityMangaDetailsTextviewAppTitle = activityMangaDetailsTextviewAppTitle;
  }

  public abstract void setViewModel(@Nullable MainViewModel viewModel);

  @Nullable
  public MainViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityMangaDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_manga_details, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMangaDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMangaDetailsBinding>inflateInternal(inflater, R.layout.activity_manga_details, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMangaDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_manga_details, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMangaDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMangaDetailsBinding>inflateInternal(inflater, R.layout.activity_manga_details, null, false, component);
  }

  public static ActivityMangaDetailsBinding bind(@NonNull View view) {
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
  public static ActivityMangaDetailsBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMangaDetailsBinding)bind(component, view, R.layout.activity_manga_details);
  }
}
