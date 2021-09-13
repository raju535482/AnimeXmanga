package com.rajuyadav.animexmanga;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/rajuyadav/animexmanga/App;", "Landroid/app/Application;", "()V", "attachBaseContext", "", "base", "Landroid/content/Context;", "onCreate", "Companion", "app_debug"})
public final class App extends android.app.Application {
    public static android.app.Application application;
    public static com.rajuyadav.animexmanga.injection.component.AppComponent appComponent;
    @org.jetbrains.annotations.NotNull
    public static final com.rajuyadav.animexmanga.App.Companion Companion = null;
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @java.lang.Override
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull
    android.content.Context base) {
    }
    
    public App() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/rajuyadav/animexmanga/App$Companion;", "", "()V", "appComponent", "Lcom/rajuyadav/animexmanga/injection/component/AppComponent;", "getAppComponent", "()Lcom/rajuyadav/animexmanga/injection/component/AppComponent;", "setAppComponent", "(Lcom/rajuyadav/animexmanga/injection/component/AppComponent;)V", "application", "Landroid/app/Application;", "getApplication", "()Landroid/app/Application;", "setApplication", "(Landroid/app/Application;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull
        public final android.app.Application getApplication() {
            return null;
        }
        
        public final void setApplication(@org.jetbrains.annotations.NotNull
        android.app.Application p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.rajuyadav.animexmanga.injection.component.AppComponent getAppComponent() {
            return null;
        }
        
        public final void setAppComponent(@org.jetbrains.annotations.NotNull
        com.rajuyadav.animexmanga.injection.component.AppComponent p0) {
        }
        
        private Companion() {
            super();
        }
    }
}