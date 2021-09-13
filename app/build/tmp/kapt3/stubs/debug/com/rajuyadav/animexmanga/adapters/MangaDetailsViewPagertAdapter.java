package com.rajuyadav.animexmanga.adapters;

import java.lang.System;

/**
 * Author : Raju Yadav
 * Date : 21 Sept 2020
 * Description : Adapter class for Listing Manga ..
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/rajuyadav/animexmanga/adapters/MangaDetailsViewPagertAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "viewModel", "Lcom/rajuyadav/animexmanga/viewmodel/MainViewModel;", "mContext", "Landroid/content/Context;", "arrayImagelist", "Ljava/util/ArrayList;", "", "(Lcom/rajuyadav/animexmanga/viewmodel/MainViewModel;Landroid/content/Context;Ljava/util/ArrayList;)V", "destroyItem", "", "collection", "Landroid/view/ViewGroup;", "position", "", "view", "", "getCount", "getPageTitle", "instantiateItem", "isViewFromObject", "", "Landroid/view/View;", "object", "app_debug"})
public final class MangaDetailsViewPagertAdapter extends androidx.viewpager.widget.PagerAdapter {
    private final com.rajuyadav.animexmanga.viewmodel.MainViewModel viewModel = null;
    private final android.content.Context mContext = null;
    private final java.util.ArrayList<java.lang.String> arrayImagelist = null;
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.Object instantiateItem(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup collection, int position) {
        return null;
    }
    
    @java.lang.Override
    public void destroyItem(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup collection, int position, @org.jetbrains.annotations.NotNull
    java.lang.Object view) {
    }
    
    @java.lang.Override
    public int getCount() {
        return 0;
    }
    
    @java.lang.Override
    public boolean isViewFromObject(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.NotNull
    java.lang.Object object) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getPageTitle(int position) {
        return null;
    }
    
    public MangaDetailsViewPagertAdapter(@org.jetbrains.annotations.NotNull
    com.rajuyadav.animexmanga.viewmodel.MainViewModel viewModel, @org.jetbrains.annotations.NotNull
    android.content.Context mContext, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<java.lang.String> arrayImagelist) {
        super();
    }
}