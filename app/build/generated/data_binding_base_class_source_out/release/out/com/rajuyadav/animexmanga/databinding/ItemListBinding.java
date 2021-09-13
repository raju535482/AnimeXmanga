// Generated by data binding compiler. Do not edit!
package com.rajuyadav.animexmanga.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.rajuyadav.animexmanga.R;
import com.rajuyadav.animexmanga.modelclass.Animeinfo;
import com.rajuyadav.animexmanga.viewmodel.MainViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemListBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final ImageView listItemImgViewIcon;

  @NonNull
  public final TextView listItemTxtViewDescription;

  @NonNull
  public final TextView listItemTxtViewTitle;

  @Bindable
  protected MainViewModel mMainmodel;

  @Bindable
  protected Integer mIntPosition;

  @Bindable
  protected Integer mImgURL;

  @Bindable
  protected Animeinfo mModelanimeinfo;

  protected ItemListBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout linearLayout, ImageView listItemImgViewIcon, TextView listItemTxtViewDescription,
      TextView listItemTxtViewTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.linearLayout = linearLayout;
    this.listItemImgViewIcon = listItemImgViewIcon;
    this.listItemTxtViewDescription = listItemTxtViewDescription;
    this.listItemTxtViewTitle = listItemTxtViewTitle;
  }

  public abstract void setMainmodel(@Nullable MainViewModel mainmodel);

  @Nullable
  public MainViewModel getMainmodel() {
    return mMainmodel;
  }

  public abstract void setIntPosition(@Nullable Integer intPosition);

  @Nullable
  public Integer getIntPosition() {
    return mIntPosition;
  }

  public abstract void setImgURL(@Nullable Integer imgURL);

  @Nullable
  public Integer getImgURL() {
    return mImgURL;
  }

  public abstract void setModelanimeinfo(@Nullable Animeinfo modelanimeinfo);

  @Nullable
  public Animeinfo getModelanimeinfo() {
    return mModelanimeinfo;
  }

  @NonNull
  public static ItemListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemListBinding>inflateInternal(inflater, R.layout.item_list, root, attachToRoot, component);
  }

  @NonNull
  public static ItemListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemListBinding>inflateInternal(inflater, R.layout.item_list, null, false, component);
  }

  public static ItemListBinding bind(@NonNull View view) {
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
  public static ItemListBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemListBinding)bind(component, view, R.layout.item_list);
  }
}
