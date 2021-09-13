package com.rajuyadav.animexmanga.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.rajuyadav.animexmanga.App
import com.rajuyadav.animexmanga.database.dao.MangaDao
import com.rajuyadav.animexmanga.modelclass.Animeinfo

/**
 * Created by Raju Yadav 9th May 2021
 */

@Database(entities = [Animeinfo::class], version = 1, exportSchema = false)
public abstract class MangaRoomDatabase : RoomDatabase() {

    abstract fun MangaDao(): MangaDao

    companion object {
        // Singleton prevents multiple instances of database opening at the
        // same time.
        @Volatile
        private var INSTANCE: MangaRoomDatabase? = null

        fun getDatabase(context: Context): MangaRoomDatabase {
            // if the INSTANCE is not null, then return it,
            // if it is, then create the database
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MangaRoomDatabase::class.java,
                    "ANIMEXMANGA_DB"
                ).build()
                INSTANCE = instance
                // return instance
                instance
            }
        }
    }
}