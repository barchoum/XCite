package com.masterraven.xcite.room;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by Tahir on 24.8.2018.
 */

@Dao
public interface AuthorDao {
    @Query("SELECT * FROM task ORDER BY priority")
    LiveData<List<AuthorEntry>> loadAllAuthors();

    @Insert
    void insertAuthor(AuthorEntry authorEntry);

    @Update(onConflict = OnConflictStrategy.REPLACE)
    void updateAuthor(AuthorEntry authorEntry);

    @Delete
    void deleteAuthor(AuthorEntry authorEntry);

    @Query("SELECT * FROM task WHERE id = :id")
    LiveData<AuthorEntry> loadAuthorById(int id);

}