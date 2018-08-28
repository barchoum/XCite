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
    private int citationId;

    @ColumnInfo(name = "year_published")
    private String yearPublished;

    // Such as book name, newspaper name or magazin name
    @ColumnInfo(name = "main_title")
    private String mainTitle;

    // Article title from a magazin, website, journal or newspaper
    @ColumnInfo(name = "article_title")
    private String articleTitle;

    private String city, state, publisher, url;

    @ColumnInfo(name = "updated_at")
    private Date updatedAt;

    @ColumnInfo(name = "citation_type")
    private String citationType;

    @Ignore
    public CitationEntry(String yearPublished, String mainTitle, String articleTitle, String city,
                         String state, String publisher, String url, Date updatedAt,
                         String citationType){
        this.yearPublished = yearPublished;
        this.mainTitle = mainTitle;
        this.articleTitle = articleTitle;
        this.city = city;
        this.state = state;
        this.publisher = publisher;
        this.url = url;
        this.updatedAt = updatedAt;
        this.citationType = citationType;
    }

    public CitationEntry(int citationId, String yearPublished, String mainTitle, String articleTitle,
                         String city, String state, String publisher, String url, Date updatedAt,
                         String citationType){
        this.citationId = citationId;
        this.yearPublished = yearPublished;
        this.mainTitle = mainTitle;
        this.articleTitle = articleTitle;
        this.city = city;
        this.state = state;
        this.publisher = publisher;
        this.url = url;
        this.updatedAt = updatedAt;
        this.citationType = citationType;
    }

    public int getCitationId() {
        return citationId;
    }

    public void setCitationId(int citationId) {
        this.citationId = citationId;
    }

    public String getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(String yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getMainTitle() {
        return mainTitle;
    }

    public void setMainTitle(String mainTitle) {
        this.mainTitle = mainTitle;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
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

    public String getCitationType() {
        return citationType;
    }

    public void setCitationType(String citationType) {
        this.citationType = citationType;
    }
}