package com.masterraven.xcite.room;

import android.arch.persistence.room.TypeConverter;

import java.util.Date;

/**
 * Created by Tahir on 23.8.2018.
 */

public class DateConverter {
    @TypeConverter
    public static Date toDate(Long timestamp) {
        return timestamp == null ? null : new Date(timestamp);
    }

    @TypeConverter
    public static Long toTimestamp(Date date) {
        return date == null ? null : date.getTime();
    }
}
