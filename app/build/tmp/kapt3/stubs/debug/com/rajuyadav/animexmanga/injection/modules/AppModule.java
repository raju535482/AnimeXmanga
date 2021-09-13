package com.rajuyadav.animexmanga.injection.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\r\u0010\u0007\u001a\u00020\bH\u0001\u00a2\u0006\u0002\b\tJ\r\u0010\n\u001a\u00020\u0003H\u0001\u00a2\u0006\u0002\b\u000bJ\r\u0010\f\u001a\u00020\rH\u0001\u00a2\u0006\u0002\b\u000eJ\r\u0010\u000f\u001a\u00020\u0005H\u0001\u00a2\u0006\u0002\b\u0010J\r\u0010\u0011\u001a\u00020\u0012H\u0001\u00a2\u0006\u0002\b\u0013J\r\u0010\u0014\u001a\u00020\u0015H\u0001\u00a2\u0006\u0002\b\u0016J\r\u0010\u0017\u001a\u00020\u0018H\u0001\u00a2\u0006\u0002\b\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/rajuyadav/animexmanga/injection/modules/AppModule;", "", "application", "Landroid/app/Application;", "appDatabase", "Lcom/rajuyadav/animexmanga/database/MangaRoomDatabase;", "(Landroid/app/Application;Lcom/rajuyadav/animexmanga/database/MangaRoomDatabase;)V", "provideCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "provideCoroutineScope$app_debug", "providerApplication", "providerApplication$app_debug", "providerContext", "Landroid/content/Context;", "providerContext$app_debug", "providerMangaDatabase", "providerMangaDatabase$app_debug", "providerUtils", "Lcom/rajuyadav/animexmanga/utilities/AppUtils;", "providerUtils$app_debug", "providesSharedPrefereces", "Landroid/content/SharedPreferences;", "providesSharedPrefereces$app_debug", "providesSharedPreferencesEditor", "Landroid/content/SharedPreferences$Editor;", "providesSharedPreferencesEditor$app_debug", "app_debug"})
@dagger.Module
public final class AppModule {
    private final android.app.Application application = null;
    private final com.rajuyadav.animexmanga.database.MangaRoomDatabase appDatabase = null;
    
    @org.jetbrains.annotations.NotNull
    @dagger.Reusable
    @dagger.Provides
    public final android.app.Application providerApplication$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Reusable
    @dagger.Provides
    public final android.content.Context providerContext$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Reusable
    @dagger.Provides
    public final android.content.SharedPreferences providesSharedPrefereces$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Reusable
    @dagger.Provides
    public final android.content.SharedPreferences.Editor providesSharedPreferencesEditor$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Reusable
    @dagger.Provides
    public final com.rajuyadav.animexmanga.utilities.AppUtils providerUtils$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.rajuyadav.animexmanga.database.MangaRoomDatabase providerMangaDatabase$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final kotlinx.coroutines.CoroutineScope provideCoroutineScope$app_debug() {
        return null;
    }
    
    public AppModule(@org.jetbrains.annotations.NotNull
    android.app.Application application, @org.jetbrains.annotations.NotNull
    com.rajuyadav.animexmanga.database.MangaRoomDatabase appDatabase) {
        super();
    }
}