package com.rajuyadav.animexmanga.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.rajuyadav.animexmanga.database.dao.MangaDao;
import com.rajuyadav.animexmanga.database.dao.MangaDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class MangaRoomDatabase_Impl extends MangaRoomDatabase {
  private volatile MangaDao _mangaDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ANIMEXMANGA_DB` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `date_n_time` TEXT, `manga_chap` INTEGER NOT NULL, `links` TEXT, `manga_id` TEXT, `manga_name` TEXT)");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_ANIMEXMANGA_DB_manga_id_manga_chap` ON `ANIMEXMANGA_DB` (`manga_id`, `manga_chap`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ab4b1c53a39fca72fa1020459a6c26dc')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `ANIMEXMANGA_DB`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsANIMEXMANGADB = new HashMap<String, TableInfo.Column>(6);
        _columnsANIMEXMANGADB.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsANIMEXMANGADB.put("date_n_time", new TableInfo.Column("date_n_time", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsANIMEXMANGADB.put("manga_chap", new TableInfo.Column("manga_chap", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsANIMEXMANGADB.put("links", new TableInfo.Column("links", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsANIMEXMANGADB.put("manga_id", new TableInfo.Column("manga_id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsANIMEXMANGADB.put("manga_name", new TableInfo.Column("manga_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysANIMEXMANGADB = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesANIMEXMANGADB = new HashSet<TableInfo.Index>(1);
        _indicesANIMEXMANGADB.add(new TableInfo.Index("index_ANIMEXMANGA_DB_manga_id_manga_chap", true, Arrays.asList("manga_id","manga_chap")));
        final TableInfo _infoANIMEXMANGADB = new TableInfo("ANIMEXMANGA_DB", _columnsANIMEXMANGADB, _foreignKeysANIMEXMANGADB, _indicesANIMEXMANGADB);
        final TableInfo _existingANIMEXMANGADB = TableInfo.read(_db, "ANIMEXMANGA_DB");
        if (! _infoANIMEXMANGADB.equals(_existingANIMEXMANGADB)) {
          return new RoomOpenHelper.ValidationResult(false, "ANIMEXMANGA_DB(com.rajuyadav.animexmanga.modelclass.Animeinfo).\n"
                  + " Expected:\n" + _infoANIMEXMANGADB + "\n"
                  + " Found:\n" + _existingANIMEXMANGADB);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "ab4b1c53a39fca72fa1020459a6c26dc", "ffa1f9f7df8d22719fe048dbdb644a04");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "ANIMEXMANGA_DB");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `ANIMEXMANGA_DB`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(MangaDao.class, MangaDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public MangaDao MangaDao() {
    if (_mangaDao != null) {
      return _mangaDao;
    } else {
      synchronized(this) {
        if(_mangaDao == null) {
          _mangaDao = new MangaDao_Impl(this);
        }
        return _mangaDao;
      }
    }
  }
}
