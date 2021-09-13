package com.rajuyadav.animexmanga.injection.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0001\u00a2\u0006\u0002\b\u000bJ\r\u0010\f\u001a\u00020\nH\u0001\u00a2\u0006\u0002\b\r\u00a8\u0006\u000e"}, d2 = {"Lcom/rajuyadav/animexmanga/injection/modules/NetworkModule;", "", "()V", "provideClient", "Lokhttp3/OkHttpClient;", "provideHttpLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "providePostApi", "Lcom/rajuyadav/animexmanga/APIService;", "retrofit", "Lretrofit2/Retrofit;", "providePostApi$app_release", "provideRetrofitInterface", "provideRetrofitInterface$app_release", "app_release"})
@dagger.Module
public final class NetworkModule {
    @org.jetbrains.annotations.NotNull
    public static final com.rajuyadav.animexmanga.injection.modules.NetworkModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final okhttp3.logging.HttpLoggingInterceptor provideHttpLoggingInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final okhttp3.OkHttpClient provideClient() {
        return null;
    }
    
    /**
     * Provides the Post service implementation.
     * @param retrofit the Retrofit object used to instantiate the service
     * @return the Post service implementation.
     */
    @org.jetbrains.annotations.NotNull
    @dagger.Reusable
    @dagger.Provides
    public static final com.rajuyadav.animexmanga.APIService providePostApi$app_release(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    /**
     * Provides the Retrofit object.
     * @return the Retrofit object
     */
    @org.jetbrains.annotations.NotNull
    @dagger.Reusable
    @dagger.Provides
    public static final retrofit2.Retrofit provideRetrofitInterface$app_release() {
        return null;
    }
    
    private NetworkModule() {
        super();
    }
}