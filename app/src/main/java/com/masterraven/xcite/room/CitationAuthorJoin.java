package com.masterraven.xcite.room;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;

/**
 * Created by Tahir on 24.8.2018.
 */

@Entity(tableName = "citation_author_join",
        primaryKeys = {"c_id", "a_id"},
        foreignKeys = {
                @ForeignKey(entity = CitationEntry.class,
                            parentColumns = "_id",
                            childColumns = "c_id"),
                @ForeignKey(entity = AuthorEntry.class,
                            parentColumns = "_id",
                            childColumns = "a_id")
        })
public class CitationAuthorJoin {

    public final int c_id;
    public final int a_id;

    public CitationAuthorJoin(int c_id, int a_id) {
        this.c_id = c_id;
        this.a_id = a_id;
    }
}