package com.rajuyadav.animexmanga.adapters;

import java.lang.System;

/**
 * Author : Raju Yadav
 * Date : 21 Sept 2020
 * Description : Adapter class for Listing Manga ..
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001%B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0017J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u001c\u0010\u001b\u001a\u00020\u001c2\n\u0010\u001d\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001aH\u0016J\u001c\u0010\u001f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001aH\u0016J\u001e\u0010#\u001a\u00020\u001c2\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR*\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\r\u00a8\u0006&"}, d2 = {"Lcom/rajuyadav/animexmanga/adapters/MangaListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/rajuyadav/animexmanga/adapters/MangaListAdapter$HistoryListViewHolder;", "mainViewModel", "Lcom/rajuyadav/animexmanga/viewmodel/MainViewModel;", "(Lcom/rajuyadav/animexmanga/viewmodel/MainViewModel;)V", "modelResponseFilterMangaList", "Ljava/util/ArrayList;", "Lcom/rajuyadav/animexmanga/modelclass/Animeinfo;", "Lkotlin/collections/ArrayList;", "getModelResponseFilterMangaList", "()Ljava/util/ArrayList;", "setModelResponseFilterMangaList", "(Ljava/util/ArrayList;)V", "modelResponseMainMangaList", "getModelResponseMainMangaList", "setModelResponseMainMangaList", "modelResponseMangaList", "getModelResponseMangaList", "setModelResponseMangaList", "getFilter", "Landroid/widget/Filter;", "getInitials", "", "args", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setDataToList", "modelResponseSearchCitie", "HistoryListViewHolder", "app_release"})
public final class MangaListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.rajuyadav.animexmanga.adapters.MangaListAdapter.HistoryListViewHolder> {
    public java.util.ArrayList<com.rajuyadav.animexmanga.modelclass.Animeinfo> modelResponseMainMangaList;
    public java.util.ArrayList<com.rajuyadav.animexmanga.modelclass.Animeinfo> modelResponseMangaList;
    public java.util.ArrayList<com.rajuyadav.animexmanga.modelclass.Animeinfo> modelResponseFilterMangaList;
    private final com.rajuyadav.animexmanga.viewmodel.MainViewModel mainViewModel = null;
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.rajuyadav.animexmanga.modelclass.Animeinfo> getModelResponseMainMangaList() {
        return null;
    }
    
    public final void setModelResponseMainMangaList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.rajuyadav.animexmanga.modelclass.Animeinfo> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.rajuyadav.animexmanga.modelclass.Animeinfo> getModelResponseMangaList() {
        return null;
    }
    
    public final void setModelResponseMangaList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.rajuyadav.animexmanga.modelclass.Animeinfo> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.rajuyadav.animexmanga.modelclass.Animeinfo> getModelResponseFilterMangaList() {
        return null;
    }
    
    public final void setModelResponseFilterMangaList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.rajuyadav.animexmanga.modelclass.Animeinfo> p0) {
    }
    
    public final void setDataToList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.rajuyadav.animexmanga.modelclass.Animeinfo> modelResponseSearchCitie) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.rajuyadav.animexmanga.adapters.MangaListAdapter.HistoryListViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.rajuyadav.animexmanga.adapters.MangaListAdapter.HistoryListViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getInitials(@org.jetbrains.annotations.NotNull
    java.lang.String args) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.Filter getFilter() {
        return null;
    }
    
    public MangaListAdapter(@org.jetbrains.annotations.NotNull
    com.rajuyadav.animexmanga.viewmodel.MainViewModel mainViewModel) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lcom/rajuyadav/animexmanga/adapters/MangaListAdapter$HistoryListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "rawArrivalToListItemBinding", "Lcom/rajuyadav/animexmanga/databinding/ItemListBinding;", "(Lcom/rajuyadav/animexmanga/adapters/MangaListAdapter;Lcom/rajuyadav/animexmanga/databinding/ItemListBinding;)V", "getRawArrivalToListItemBinding", "()Lcom/rajuyadav/animexmanga/databinding/ItemListBinding;", "bind", "", "animeinfo", "Lcom/rajuyadav/animexmanga/modelclass/Animeinfo;", "imgUrl", "", "int", "app_release"})
    public final class HistoryListViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.rajuyadav.animexmanga.databinding.ItemListBinding rawArrivalToListItemBinding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.rajuyadav.animexmanga.modelclass.Animeinfo animeinfo, int imgUrl, int p2_52215) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.rajuyadav.animexmanga.databinding.ItemListBinding getRawArrivalToListItemBinding() {
            return null;
        }
        
        public HistoryListViewHolder(@org.jetbrains.annotations.NotNull
        com.rajuyadav.animexmanga.databinding.ItemListBinding rawArrivalToListItemBinding) {
            super(null);
        }
    }
}