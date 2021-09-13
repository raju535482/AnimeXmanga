package com.rajuyadav.animexmanga.injection.modules

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.rajuyadav.animexmanga.R
import com.rajuyadav.animexmanga.database.MangaRoomDatabase
import com.rajuyadav.animexmanga.utilities.AppUtils
import dagger.Module
import dagger.Provides
import dagger.Reusable
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import javax.inject.Singleton

@Module
class AppModule(private val application: Application, private val appDatabase: MangaRoomDatabase) {

    @Provides
    @Reusable
    internal fun providerApplication(): Application {
        return application
    }

    @Provides
    @Reusable
    internal fun providerContext(): Context {
        return application
    }

    @Provides
    @Reusable
    internal fun providesSharedPrefereces(): SharedPreferences {
        return application.getSharedPreferences(
            application.resources.getString(R.string.app_name),
            0
        )
    }

    @Provides
    @Reusable
    internal fun providesSharedPreferencesEditor(): SharedPreferences.Editor {
        return providesSharedPrefereces().edit()
    }

    @Provides
    @Reusable
    internal fun providerUtils(): AppUtils {
        return AppUtils.newInstance(application)
    }

    @Provides
    @Singleton
    internal fun providerMangaDatabase(): MangaRoomDatabase {
        return appDatabase
    }

    @Provides
    @Singleton
    internal fun provideCoroutineScope() = CoroutineScope(SupervisorJob())

}