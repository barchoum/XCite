package com.masterraven.xcite.room;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

/**
 * Created by Tahir on 23.8.2018.
 */
@Entity (tableName = "citations")
public class CitationEntry {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    private int id;

    @ColumnInfo(name = "year_published")
    private String yearPublished;

    @ColumnInfo(name = "book_name")
    private String bookName;

    private String city, state, publisher, url;

    @ColumnInfo(name = "updated_at")
    private Date updatedAt;

    @Ignore
    public CitationEntry(String yearPublished, String bookName, String city, String state,
                         String publisher, String url, Date updatedAt){
        this.yearPublished = yearPublished;
        this.bookName = bookName;
        this.city = city;
        this.state = state;
        this.publisher = publisher;
        this.url = url;
        this.updatedAt = updatedAt;
    }

    public CitationEntry(int id, String yearPublished, String bookName, String city, String state,
                         String publisher, String url, Date updatedAt){
        this.id = id;
        this.yearPublished = yearPublished;
        this.bookName = bookName;
        this.city = city;
        this.state = state;
        this.publisher = publisher;
        this.url = url;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(String yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}