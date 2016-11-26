package com.shane.javauper.common.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateUtil {
    public static final String FORMAT_DATE_TIME_DEFAULT = "yyyy-MM-dd HH:mm:ss";
    public static final String FORMAT_DATE_TIME_KEY = "yyyyMMddHHmmss";

    public static final String FORMAT_DATE_DEFAULT = "yyyy-MM-dd";

    public static final String FORMAT_TIME_DEFAULT = "HH:mm:ss";

    public static final String GMT_CN = "GMT+8";

    private static final long DAY_TIMESTAMP = 1000 * 24 * 60 * 60;

    private static GregorianCalendar calendar = null;

    private DateUtil() {}

    //--------------------------------------------------------------------------------
    public static Date parse(String source, String format) {
        if (null == source || null == format) {
            return null;
        }

        SimpleDateFormat df = new SimpleDateFormat(format);
        df.setTimeZone(TimeZone.getTimeZone(GMT_CN));
        try {
            return df.parse(source);
        } catch (ParseException ignored) {}

        return null;
    }

    public static String format(Date date, String format) {
        if (null == date || null == format) {
            return null;
        }

        SimpleDateFormat df = new SimpleDateFormat(format);
        df.setTimeZone(TimeZone.getTimeZone(GMT_CN));
        return df.format(date);
    }
    //--------------------------------------------------------------------------------
    public static String formatTimestamp(long timestamp, String format) {
        return format(new Date(timestamp), format);
    }
}
