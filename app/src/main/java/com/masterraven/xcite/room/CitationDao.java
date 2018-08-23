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
 * Created by Tahir on 23.8.2018.
 */

@Dao
public interface CitationDao {

    @Query("SELECT * FROM task ORDER BY priority")
    LiveData<List<CitationEntry>> loadAllCitations();

    @Insert
    void insertCitation(CitationEntry citationEntry);

    @Update(onConflict = OnConflictStrategy.REPLACE)
    void updateCitation(CitationEntry citationEntry);

    @Delete
    void deleteCitation(CitationEntry citationEntry);

    @Query("SELECT * FROM task WHERE id = :id")
    LiveData<CitationEntry> loadCitationById(int id);
}
