package com.rajuyadav.animexmanga

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex
import androidx.room.Room
import com.google.firebase.FirebaseApp
import com.rajuyadav.animexmanga.database.MangaRoomDatabase
import com.rajuyadav.animexmanga.injection.component.AppComponent
import com.rajuyadav.animexmanga.injection.component.DaggerAppComponent
import com.rajuyadav.animexmanga.injection.modules.AppModule
import com.rajuyadav.animexmanga.injection.modules.NetworkModule


class App : Application() {

    companion object {
        lateinit var application: Application
        lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()

        application = this
        FirebaseApp.initializeApp(this)
        appComponent = DaggerAppComponent.builder()
            .appModule(
                appModule = AppModule(
                    application,
                    Room.databaseBuilder(this, MangaRoomDatabase::class.java, "ANIMEXMANGA_DB")
                        .allowMainThreadQueries().build()
//                    MangaRoomDatabase.getDatabase(this)
                )
            )
            .networkModule(networkModule = NetworkModule)
            .build()

        appComponent.inject(this)
    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }
}
