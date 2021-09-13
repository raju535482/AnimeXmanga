package com.rajuyadav.animexmanga.adapters;

import java.lang.System;

/**
 * Author : Raju Yadav
 * Date : 21 Sept 2020
 * Description : Adapter class for Listing Manga ..
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\u001e\u0010\u0018\u001a\u00020\u00112\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u001b"}, d2 = {"Lcom/rajuyadav/animexmanga/adapters/MangaDetailsListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/rajuyadav/animexmanga/adapters/MangaDetailsListAdapter$HistoryListViewHolder;", "mainViewModel", "Lcom/rajuyadav/animexmanga/viewmodel/MainViewModel;", "(Lcom/rajuyadav/animexmanga/viewmodel/MainViewModel;)V", "modelResponseSearchCities", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getModelResponseSearchCities", "()Ljava/util/ArrayList;", "setModelResponseSearchCities", "(Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setDataToList", "modelResponseSearchCitie", "HistoryListViewHolder", "app_debug"})
public final class MangaDetailsListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.rajuyadav.animexmanga.adapters.MangaDetailsListAdapter.HistoryListViewHolder> {
    public java.util.ArrayList<java.lang.String> modelResponseSearchCities;
    private final com.rajuyadav.animexmanga.viewmodel.MainViewModel mainViewModel = null;
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<java.lang.String> getModelResponseSearchCities() {
        return null;
    }
    
    public final void setModelResponseSearchCities(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    public final void setDataToList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<java.lang.String> modelResponseSearchCitie) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.rajuyadav.animexmanga.adapters.MangaDetailsListAdapter.HistoryListViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.rajuyadav.animexmanga.adapters.MangaDetailsListAdapter.HistoryListViewHolder holder, int position) {
    }
    
    public MangaDetailsListAdapter(@org.jetbrains.annotations.NotNull
    com.rajuyadav.animexmanga.viewmodel.MainViewModel mainViewModel) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/rajuyadav/animexmanga/adapters/MangaDetailsListAdapter$HistoryListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "rawArrivalToListItemBinding", "Lcom/rajuyadav/animexmanga/databinding/MangaDetailsItemListBinding;", "(Lcom/rajuyadav/animexmanga/adapters/MangaDetailsListAdapter;Lcom/rajuyadav/animexmanga/databinding/MangaDetailsItemListBinding;)V", "bind", "", "animeinfo", "", "app_debug"})
    public final class HistoryListViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.rajuyadav.animexmanga.databinding.MangaDetailsItemListBinding rawArrivalToListItemBinding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull
        java.lang.String animeinfo) {
        }
        
        public HistoryListViewHolder(@org.jetbrains.annotations.NotNull
        com.rajuyadav.animexmanga.databinding.MangaDetailsItemListBinding rawArrivalToListItemBinding) {
            super(null);
        }
    }
}