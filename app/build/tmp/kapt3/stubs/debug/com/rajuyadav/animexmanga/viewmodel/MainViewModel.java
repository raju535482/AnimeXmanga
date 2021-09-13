package com.rajuyadav.animexmanga.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00a0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020GJ\u000e\u0010H\u001a\u00020E2\u0006\u0010I\u001a\u00020JJ\u000e\u0010K\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010LJ\u000e\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010LJ\u0016\u0010N\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0006\u0010O\u001a\u00020PJ\u001e\u0010Q\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`?\u0018\u00010LJ\u001e\u0010R\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`?2\u0006\u0010F\u001a\u00020GJ\b\u0010S\u001a\u00020EH\u0002J\u000e\u0010T\u001a\u00020E2\u0006\u0010U\u001a\u00020\u001cJ\u000e\u0010V\u001a\u00020E2\u0006\u0010U\u001a\u00020\u0016J\u000e\u0010W\u001a\u00020E2\u0006\u0010X\u001a\u00020YR\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001e\u0010+\u001a\u00020,8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u00101\u001a\u0004\u0018\u000102X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u000e\u00107\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R \u00108\u001a\b\u0012\u0004\u0012\u0002090\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010>\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`?0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00160\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020CX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006Z"}, d2 = {"Lcom/rajuyadav/animexmanga/viewmodel/MainViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_userData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/rajuyadav/animexmanga/modelclass/VoMangaResult;", "apiService", "Lcom/rajuyadav/animexmanga/APIService;", "getApiService", "()Lcom/rajuyadav/animexmanga/APIService;", "setApiService", "(Lcom/rajuyadav/animexmanga/APIService;)V", "applicationScope", "Lkotlinx/coroutines/CoroutineScope;", "getApplicationScope", "()Lkotlinx/coroutines/CoroutineScope;", "setApplicationScope", "(Lkotlinx/coroutines/CoroutineScope;)V", "arraylistAnimeInfo", "Ljava/util/ArrayList;", "Lcom/rajuyadav/animexmanga/modelclass/Animeinfo;", "getArraylistAnimeInfo", "()Ljava/util/ArrayList;", "setArraylistAnimeInfo", "(Ljava/util/ArrayList;)V", "arraylistDetailsInfo", "", "getArraylistDetailsInfo", "setArraylistDetailsInfo", "mangaDetailsViewPagertAdapter", "Lcom/rajuyadav/animexmanga/adapters/MangaDetailsViewPagertAdapter;", "getMangaDetailsViewPagertAdapter", "()Lcom/rajuyadav/animexmanga/adapters/MangaDetailsViewPagertAdapter;", "setMangaDetailsViewPagertAdapter", "(Lcom/rajuyadav/animexmanga/adapters/MangaDetailsViewPagertAdapter;)V", "mangaDetailslistAdapter", "Lcom/rajuyadav/animexmanga/adapters/MangaDetailsListAdapter;", "getMangaDetailslistAdapter", "()Lcom/rajuyadav/animexmanga/adapters/MangaDetailsListAdapter;", "setMangaDetailslistAdapter", "(Lcom/rajuyadav/animexmanga/adapters/MangaDetailsListAdapter;)V", "mangaRoomDatabase", "Lcom/rajuyadav/animexmanga/database/MangaRoomDatabase;", "getMangaRoomDatabase", "()Lcom/rajuyadav/animexmanga/database/MangaRoomDatabase;", "setMangaRoomDatabase", "(Lcom/rajuyadav/animexmanga/database/MangaRoomDatabase;)V", "mangalistAdapter", "Lcom/rajuyadav/animexmanga/adapters/MangaListAdapter;", "getMangalistAdapter", "()Lcom/rajuyadav/animexmanga/adapters/MangaListAdapter;", "setMangalistAdapter", "(Lcom/rajuyadav/animexmanga/adapters/MangaListAdapter;)V", "modelResponseFlightSearchItems", "modelResponseForceUpdate", "Lcom/rajuyadav/animexmanga/modelclass/ModelResponseForceUpdate;", "getModelResponseForceUpdate", "()Landroidx/lifecycle/MutableLiveData;", "setModelResponseForceUpdate", "(Landroidx/lifecycle/MutableLiveData;)V", "mutablePostList", "Lkotlin/collections/ArrayList;", "mutableSingleImage", "mutableSinglePostData", "subscription", "Lio/reactivex/disposables/Disposable;", "checkForceUpdate", "", "mangaListActivity", "Lcom/rajuyadav/animexmanga/ui/MangaListActivity;", "filterMangaList", "activityMainEdittextSearchManga", "Landroid/widget/EditText;", "getDetailTrigger", "Landroidx/lifecycle/LiveData;", "getListTrigger", "getMangaAPI", "binding", "Lcom/rajuyadav/animexmanga/databinding/ActivityMainBinding;", "getMangaData", "getMangaDataFromDB", "inject", "onDetailsItemClick", "mmodelResponseFlightSearchItems", "onItemClick", "transitTOMainActivity", "activitySplash", "Lcom/rajuyadav/animexmanga/ui/ActivitySplash;", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.AndroidViewModel {
    @javax.inject.Inject
    public kotlinx.coroutines.CoroutineScope applicationScope;
    @javax.inject.Inject
    public com.rajuyadav.animexmanga.APIService apiService;
    @javax.inject.Inject
    public com.rajuyadav.animexmanga.database.MangaRoomDatabase mangaRoomDatabase;
    @org.jetbrains.annotations.Nullable
    private com.rajuyadav.animexmanga.adapters.MangaListAdapter mangalistAdapter;
    @org.jetbrains.annotations.Nullable
    private com.rajuyadav.animexmanga.adapters.MangaDetailsListAdapter mangaDetailslistAdapter;
    @org.jetbrains.annotations.Nullable
    private com.rajuyadav.animexmanga.adapters.MangaDetailsViewPagertAdapter mangaDetailsViewPagertAdapter;
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.rajuyadav.animexmanga.modelclass.Animeinfo>> mutablePostList = null;
    private final androidx.lifecycle.MutableLiveData<com.rajuyadav.animexmanga.modelclass.Animeinfo> mutableSinglePostData = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mutableSingleImage = null;
    public java.util.ArrayList<com.rajuyadav.animexmanga.modelclass.Animeinfo> arraylistAnimeInfo;
    public java.util.ArrayList<java.lang.String> arraylistDetailsInfo;
    private androidx.lifecycle.MutableLiveData<com.rajuyadav.animexmanga.modelclass.VoMangaResult> _userData;
    private com.rajuyadav.animexmanga.modelclass.Animeinfo modelResponseFlightSearchItems;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.rajuyadav.animexmanga.modelclass.ModelResponseForceUpdate> modelResponseForceUpdate;
    private io.reactivex.disposables.Disposable subscription;
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.CoroutineScope getApplicationScope() {
        return null;
    }
    
    public final void setApplicationScope(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.rajuyadav.animexmanga.APIService getApiService() {
        return null;
    }
    
    public final void setApiService(@org.jetbrains.annotations.NotNull
    com.rajuyadav.animexmanga.APIService p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.rajuyadav.animexmanga.database.MangaRoomDatabase getMangaRoomDatabase() {
        return null;
    }
    
    public final void setMangaRoomDatabase(@org.jetbrains.annotations.NotNull
    com.rajuyadav.animexmanga.database.MangaRoomDatabase p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.rajuyadav.animexmanga.adapters.MangaListAdapter getMangalistAdapter() {
        return null;
    }
    
    public final void setMangalistAdapter(@org.jetbrains.annotations.Nullable
    com.rajuyadav.animexmanga.adapters.MangaListAdapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.rajuyadav.animexmanga.adapters.MangaDetailsListAdapter getMangaDetailslistAdapter() {
        return null;
    }
    
    public final void setMangaDetailslistAdapter(@org.jetbrains.annotations.Nullable
    com.rajuyadav.animexmanga.adapters.MangaDetailsListAdapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.rajuyadav.animexmanga.adapters.MangaDetailsViewPagertAdapter getMangaDetailsViewPagertAdapter() {
        return null;
    }
    
    public final void setMangaDetailsViewPagertAdapter(@org.jetbrains.annotations.Nullable
    com.rajuyadav.animexmanga.adapters.MangaDetailsViewPagertAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.rajuyadav.animexmanga.modelclass.Animeinfo> getArraylistAnimeInfo() {
        return null;
    }
    
    public final void setArraylistAnimeInfo(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.rajuyadav.animexmanga.modelclass.Animeinfo> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<java.lang.String> getArraylistDetailsInfo() {
        return null;
    }
    
    public final void setArraylistDetailsInfo(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.rajuyadav.animexmanga.modelclass.ModelResponseForceUpdate> getModelResponseForceUpdate() {
        return null;
    }
    
    public final void setModelResponseForceUpdate(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.rajuyadav.animexmanga.modelclass.ModelResponseForceUpdate> p0) {
    }
    
    /**
     * Injects the required dependencies
     */
    private final void inject() {
    }
    
    public final void onItemClick(@org.jetbrains.annotations.NotNull
    com.rajuyadav.animexmanga.modelclass.Animeinfo mmodelResponseFlightSearchItems) {
    }
    
    public final void onDetailsItemClick(@org.jetbrains.annotations.NotNull
    java.lang.String mmodelResponseFlightSearchItems) {
    }
    
    public final void checkForceUpdate(@org.jetbrains.annotations.NotNull
    com.rajuyadav.animexmanga.ui.MangaListActivity mangaListActivity) {
    }
    
    public final void getMangaAPI(@org.jetbrains.annotations.NotNull
    com.rajuyadav.animexmanga.ui.MangaListActivity mangaListActivity, @org.jetbrains.annotations.NotNull
    com.rajuyadav.animexmanga.databinding.ActivityMainBinding binding) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.rajuyadav.animexmanga.modelclass.Animeinfo> getMangaDataFromDB(@org.jetbrains.annotations.NotNull
    com.rajuyadav.animexmanga.ui.MangaListActivity mangaListActivity) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.rajuyadav.animexmanga.modelclass.Animeinfo>> getMangaData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final androidx.lifecycle.LiveData<com.rajuyadav.animexmanga.modelclass.Animeinfo> getListTrigger() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final androidx.lifecycle.LiveData<java.lang.String> getDetailTrigger() {
        return null;
    }
    
    public final void filterMangaList(@org.jetbrains.annotations.NotNull
    android.widget.EditText activityMainEdittextSearchManga) {
    }
    
    public final void transitTOMainActivity(@org.jetbrains.annotations.NotNull
    com.rajuyadav.animexmanga.ui.ActivitySplash activitySplash) {
    }
    
    public MainViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
}