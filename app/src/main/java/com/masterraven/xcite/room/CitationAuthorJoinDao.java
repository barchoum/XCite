package com.masterraven.xcite.room;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by Tahir on 24.8.2018.
 */

@Dao
public interface CitationAuthorJoinDao {
    @Insert
    void insert(CitationAuthorJoin citationAuthorJoin);

    @Query("SELECT * FROM citations INNER JOIN citation_author_join ON " +
            "citations._id=citation_author_join.c_id WHERE " +
            "citation_author_join.a_id=:a_id")
    LiveData<CitationEntry> getCitationsForAuthor(final int a_id);

    @Query("SELECT * FROM authors INNER JOIN citation_author_join ON" +
            " authors._id=citation_author_join.a_id WHERE " +
            "citation_author_join.c_id=:c_id")
    LiveData<AuthorEntry> getAuthorsForCitation(final int c_id);
}
