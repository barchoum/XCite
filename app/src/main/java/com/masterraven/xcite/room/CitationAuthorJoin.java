package com.masterraven.xcite.room;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;

/**
 * Created by Tahir on 24.8.2018.
 */

@Entity(tableName = "citation_author_join",
        primaryKeys = {"citationId", "authorId"},
        foreignKeys = {
                @ForeignKey(entity = CitationEntry.class,
                            parentColumns = "id",
                            childColumns = "citationId"),
                @ForeignKey(entity = AuthorEntry.class,
                            parentColumns = "id",
                            childColumns = "authorId")
        })
public class CitationAuthorJoin {

    public final int citationId;
    public final int authorId;

    public CitationAuthorJoin(int citationId, int authorId) {
        this.citationId = citationId;
        this.authorId = authorId;
    }
}