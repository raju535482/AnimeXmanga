package com.rajuyadav.animexmanga.utilities;

import java.lang.System;

/**
 * Author : Raju Yadav
 * Date : 9 May 2021
 * Description : Utility class for handling Global Functions for the application.
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u0012"}, d2 = {"Lcom/rajuyadav/animexmanga/utilities/AppUtils;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "getApplication", "()Landroid/app/Application;", "setApplication", "checkLocationStatus", "", "hideKeyboard", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "isEmailValid", "email", "", "Companion", "app_release"})
public final class AppUtils {
    @org.jetbrains.annotations.NotNull
    private android.app.Application application;
    @org.jetbrains.annotations.NotNull
    public static final com.rajuyadav.animexmanga.utilities.AppUtils.Companion Companion = null;
    
    public final void hideKeyboard(@org.jetbrains.annotations.NotNull
    androidx.appcompat.app.AppCompatActivity activity) {
    }
    
    /**
     * Return the validity of Email Address
     */
    public final boolean isEmailValid(@org.jetbrains.annotations.NotNull
    java.lang.String email) {
        return false;
    }
    
    public final boolean checkLocationStatus() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.app.Application getApplication() {
        return null;
    }
    
    public final void setApplication(@org.jetbrains.annotations.NotNull
    android.app.Application p0) {
    }
    
    public AppUtils(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/rajuyadav/animexmanga/utilities/AppUtils$Companion;", "", "()V", "newInstance", "Lcom/rajuyadav/animexmanga/utilities/AppUtils;", "application", "Landroid/app/Application;", "app_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull
        public final com.rajuyadav.animexmanga.utilities.AppUtils newInstance(@org.jetbrains.annotations.NotNull
        android.app.Application application) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}