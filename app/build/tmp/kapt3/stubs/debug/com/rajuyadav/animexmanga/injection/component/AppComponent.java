package com.rajuyadav.animexmanga.injection.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u000eJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&\u00a8\u0006\u000f"}, d2 = {"Lcom/rajuyadav/animexmanga/injection/component/AppComponent;", "", "inject", "", "myApplication", "Lcom/rajuyadav/animexmanga/App;", "baseActivity", "Lcom/rajuyadav/animexmanga/BaseActivity;", "roomDatabase", "Lcom/rajuyadav/animexmanga/database/MangaRoomDatabase;", "mangaListActivity", "Lcom/rajuyadav/animexmanga/ui/MangaListActivity;", "mainViewModel", "Lcom/rajuyadav/animexmanga/viewmodel/MainViewModel;", "Builder", "app_debug"})
@dagger.Component(modules = {com.rajuyadav.animexmanga.injection.modules.AppModule.class, com.rajuyadav.animexmanga.injection.modules.NetworkModule.class})
@javax.inject.Singleton
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.rajuyadav.animexmanga.App myApplication);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.rajuyadav.animexmanga.BaseActivity baseActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.rajuyadav.animexmanga.ui.MangaListActivity mangaListActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.rajuyadav.animexmanga.database.MangaRoomDatabase roomDatabase);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.rajuyadav.animexmanga.viewmodel.MainViewModel mainViewModel);
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/rajuyadav/animexmanga/injection/component/AppComponent$Builder;", "", "appModule", "Lcom/rajuyadav/animexmanga/injection/modules/AppModule;", "build", "Lcom/rajuyadav/animexmanga/injection/component/AppComponent;", "networkModule", "Lcom/rajuyadav/animexmanga/injection/modules/NetworkModule;", "app_debug"})
    @dagger.Component.Builder
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull
        public abstract com.rajuyadav.animexmanga.injection.component.AppComponent build();
        
        @org.jetbrains.annotations.NotNull
        public abstract com.rajuyadav.animexmanga.injection.component.AppComponent.Builder networkModule(@org.jetbrains.annotations.NotNull
        com.rajuyadav.animexmanga.injection.modules.NetworkModule networkModule);
        
        @org.jetbrains.annotations.NotNull
        public abstract com.rajuyadav.animexmanga.injection.component.AppComponent.Builder appModule(@org.jetbrains.annotations.NotNull
        com.rajuyadav.animexmanga.injection.modules.AppModule appModule);
    }
}