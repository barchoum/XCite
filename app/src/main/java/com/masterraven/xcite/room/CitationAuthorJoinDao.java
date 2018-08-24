package com.masterraven.xcite.room;

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
            "citations._id=citation_author_join.citationId WHERE " +
            "citation_author_join.authorId=:authorId")
    List<CitationEntry> getCitationsForAuthor(final int authorId);

    @Query("SELECT * FROM authors INNER JOIN citation_author_join ON" +
            " author._id=citation_author_join.authorId WHERE " +
            "citation_author_join.citationId=:citationID")
    List<AuthorEntry> getAuthorsForCitation(final int citationId);
}
