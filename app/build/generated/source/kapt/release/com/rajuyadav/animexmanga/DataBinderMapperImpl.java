package com.rajuyadav.animexmanga;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.rajuyadav.animexmanga.databinding.ActivityMainBindingImpl;
import com.rajuyadav.animexmanga.databinding.ActivityMangaDetailsBindingImpl;
import com.rajuyadav.animexmanga.databinding.ActivityMangaViewpagerDetailsBindingImpl;
import com.rajuyadav.animexmanga.databinding.ActivitySplashBindingImpl;
import com.rajuyadav.animexmanga.databinding.ActivityZoomBindingImpl;
import com.rajuyadav.animexmanga.databinding.ItemListBindingImpl;
import com.rajuyadav.animexmanga.databinding.MangaDetailsItemListBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Generated;

@Generated("Android Data Binding")
public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_ACTIVITYMANGADETAILS = 2;

  private static final int LAYOUT_ACTIVITYMANGAVIEWPAGERDETAILS = 3;

  private static final int LAYOUT_ACTIVITYSPLASH = 4;

  private static final int LAYOUT_ACTIVITYZOOM = 5;

  private static final int LAYOUT_ITEMLIST = 6;

  private static final int LAYOUT_MANGADETAILSITEMLIST = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rajuyadav.animexmanga.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rajuyadav.animexmanga.R.layout.activity_manga_details, LAYOUT_ACTIVITYMANGADETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rajuyadav.animexmanga.R.layout.activity_manga_viewpager_details, LAYOUT_ACTIVITYMANGAVIEWPAGERDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rajuyadav.animexmanga.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rajuyadav.animexmanga.R.layout.activity_zoom, LAYOUT_ACTIVITYZOOM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rajuyadav.animexmanga.R.layout.item_list, LAYOUT_ITEMLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rajuyadav.animexmanga.R.layout.manga_details_item_list, LAYOUT_MANGADETAILSITEMLIST);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMANGADETAILS: {
          if ("layout/activity_manga_details_0".equals(tag)) {
            return new ActivityMangaDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_manga_details is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMANGAVIEWPAGERDETAILS: {
          if ("layout/activity_manga_viewpager_details_0".equals(tag)) {
            return new ActivityMangaViewpagerDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_manga_viewpager_details is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASH: {
          if ("layout/activity_splash_0".equals(tag)) {
            return new ActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYZOOM: {
          if ("layout/activity_zoom_0".equals(tag)) {
            return new ActivityZoomBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_zoom is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMLIST: {
          if ("layout/item_list_0".equals(tag)) {
            return new ItemListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_list is invalid. Received: " + tag);
        }
        case  LAYOUT_MANGADETAILSITEMLIST: {
          if ("layout/manga_details_item_list_0".equals(tag)) {
            return new MangaDetailsItemListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for manga_details_item_list is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(8);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "adapter");
      sKeys.put(2, "imgURL");
      sKeys.put(3, "intPosition");
      sKeys.put(4, "mainmodel");
      sKeys.put(5, "modelanimeinfo");
      sKeys.put(6, "strArrayListImage");
      sKeys.put(7, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/activity_main_0", com.rajuyadav.animexmanga.R.layout.activity_main);
      sKeys.put("layout/activity_manga_details_0", com.rajuyadav.animexmanga.R.layout.activity_manga_details);
      sKeys.put("layout/activity_manga_viewpager_details_0", com.rajuyadav.animexmanga.R.layout.activity_manga_viewpager_details);
      sKeys.put("layout/activity_splash_0", com.rajuyadav.animexmanga.R.layout.activity_splash);
      sKeys.put("layout/activity_zoom_0", com.rajuyadav.animexmanga.R.layout.activity_zoom);
      sKeys.put("layout/item_list_0", com.rajuyadav.animexmanga.R.layout.item_list);
      sKeys.put("layout/manga_details_item_list_0", com.rajuyadav.animexmanga.R.layout.manga_details_item_list);
    }
  }
}
