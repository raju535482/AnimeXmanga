package com.rajuyadav.animexmanga.database.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.rajuyadav.animexmanga.modelclass.Animeinfo;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class MangaDao_Impl implements MangaDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Animeinfo> __insertionAdapterOfAnimeinfo;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public MangaDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAnimeinfo = new EntityInsertionAdapter<Animeinfo>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `ANIMEXMANGA_DB` (`id`,`date_n_time`,`manga_chap`,`links`,`manga_id`,`manga_name`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Animeinfo value) {
        stmt.bindLong(1, value.getId());
        if (value.getDate_n_time() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDate_n_time());
        }
        stmt.bindLong(3, value.getManga_chap());
        if (value.getLinks() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getLinks());
        }
        if (value.getManga_id() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getManga_id());
        }
        if (value.getManga_name() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getManga_name());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM animexmanga_db";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final Animeinfo word, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfAnimeinfo.insert(word);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public List<Animeinfo> getMangaList() {
    final String _sql = "SELECT * FROM animexmanga_db ORDER BY manga_chap DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfDateNTime = CursorUtil.getColumnIndexOrThrow(_cursor, "date_n_time");
      final int _cursorIndexOfMangaChap = CursorUtil.getColumnIndexOrThrow(_cursor, "manga_chap");
      final int _cursorIndexOfLinks = CursorUtil.getColumnIndexOrThrow(_cursor, "links");
      final int _cursorIndexOfMangaId = CursorUtil.getColumnIndexOrThrow(_cursor, "manga_id");
      final int _cursorIndexOfMangaName = CursorUtil.getColumnIndexOrThrow(_cursor, "manga_name");
      final List<Animeinfo> _result = new ArrayList<Animeinfo>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Animeinfo _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpDate_n_time;
        if (_cursor.isNull(_cursorIndexOfDateNTime)) {
          _tmpDate_n_time = null;
        } else {
          _tmpDate_n_time = _cursor.getString(_cursorIndexOfDateNTime);
        }
        final int _tmpManga_chap;
        _tmpManga_chap = _cursor.getInt(_cursorIndexOfMangaChap);
        final String _tmpLinks;
        if (_cursor.isNull(_cursorIndexOfLinks)) {
          _tmpLinks = null;
        } else {
          _tmpLinks = _cursor.getString(_cursorIndexOfLinks);
        }
        final String _tmpManga_id;
        if (_cursor.isNull(_cursorIndexOfMangaId)) {
          _tmpManga_id = null;
        } else {
          _tmpManga_id = _cursor.getString(_cursorIndexOfMangaId);
        }
        final String _tmpManga_name;
        if (_cursor.isNull(_cursorIndexOfMangaName)) {
          _tmpManga_name = null;
        } else {
          _tmpManga_name = _cursor.getString(_cursorIndexOfMangaName);
        }
        _item = new Animeinfo(_tmpId,_tmpDate_n_time,_tmpManga_chap,_tmpLinks,_tmpManga_id,_tmpManga_name);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
