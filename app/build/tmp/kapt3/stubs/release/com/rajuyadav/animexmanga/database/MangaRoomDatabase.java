package com.rajuyadav.animexmanga.database;

import java.lang.System;

/**
 * Created by Raju Yadav 9th May 2021
 */
@androidx.room.Database(entities = {com.rajuyadav.animexmanga.modelclass.Animeinfo.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/rajuyadav/animexmanga/database/MangaRoomDatabase;", "Landroidx/room/RoomDatabase;", "()V", "MangaDao", "Lcom/rajuyadav/animexmanga/database/dao/MangaDao;", "Companion", "app_release"})
public abstract class MangaRoomDatabase extends androidx.room.RoomDatabase {
    private static volatile com.rajuyadav.animexmanga.database.MangaRoomDatabase INSTANCE;
    @org.jetbrains.annotations.NotNull
    public static final com.rajuyadav.animexmanga.database.MangaRoomDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull
    public abstract com.rajuyadav.animexmanga.database.dao.MangaDao MangaDao();
    
    public MangaRoomDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/rajuyadav/animexmanga/database/MangaRoomDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/rajuyadav/animexmanga/database/MangaRoomDatabase;", "getDatabase", "context", "Landroid/content/Context;", "app_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull
        public final com.rajuyadav.animexmanga.database.MangaRoomDatabase getDatabase(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}