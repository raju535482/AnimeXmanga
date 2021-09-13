package com.rajuyadav.animexmanga;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0001\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\'J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/rajuyadav/animexmanga/APIService;", "", "forceUpdate", "Lio/reactivex/Observable;", "Lcom/rajuyadav/animexmanga/modelclass/ModelResponseForceUpdate;", "mHashMap", "", "", "getMangaList", "Lretrofit2/Call;", "Lcom/rajuyadav/animexmanga/modelclass/VoMangaResult;", "app_release"})
public abstract interface APIService {
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "dispanimelist.php")
    public abstract retrofit2.Call<com.rajuyadav.animexmanga.modelclass.VoMangaResult> getMangaList();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "forceupdate.php")
    @retrofit2.http.FormUrlEncoded
    public abstract io.reactivex.Observable<com.rajuyadav.animexmanga.modelclass.ModelResponseForceUpdate> forceUpdate(@org.jetbrains.annotations.NotNull
    @retrofit2.http.FieldMap
    java.util.Map<java.lang.String, java.lang.String> mHashMap);
}