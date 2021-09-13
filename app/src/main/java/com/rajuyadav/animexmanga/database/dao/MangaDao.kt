package com.rajuyadav.animexmanga.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.rajuyadav.animexmanga.modelclass.Animeinfo


@Dao
interface MangaDao {
    @Query("SELECT * FROM animexmanga_db ORDER BY manga_chap DESC")
    fun getMangaList(): List<Animeinfo>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(word: Animeinfo)

    @Query("DELETE FROM animexmanga_db")
    fun deleteAll()
}