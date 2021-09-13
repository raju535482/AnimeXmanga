package com.rajuyadav.animexmanga.injection.component

import com.rajuyadav.animexmanga.App
import com.rajuyadav.animexmanga.BaseActivity
import com.rajuyadav.animexmanga.database.MangaRoomDatabase
import com.rajuyadav.animexmanga.database.dao.MangaDao
import com.rajuyadav.animexmanga.injection.modules.AppModule
import com.rajuyadav.animexmanga.injection.modules.NetworkModule
import com.rajuyadav.animexmanga.ui.MangaListActivity
import com.rajuyadav.animexmanga.viewmodel.MainViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, NetworkModule::class])
interface AppComponent {

    fun inject(myApplication: App)
    fun inject(baseActivity: BaseActivity)
    fun inject(mangaListActivity: MangaListActivity)
    fun inject(roomDatabase: MangaRoomDatabase)
    fun inject(mainViewModel: MainViewModel)

    @Component.Builder
    interface Builder {
        fun build(): AppComponent

        fun networkModule(networkModule: NetworkModule): Builder

        fun appModule(appModule: AppModule): Builder
    }
}