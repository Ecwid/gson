package com.google.gson.internal;

import org.junit.Assert;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class PreJava20DateFormatProviderTest {
    @Test
    public void getNewUSDateFormatTest() throws ParseException {
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            DateFormat format = PreJava20DateFormatProvider.getNewUSDateFormat();
            Date date = format.parse("Jun 6, 2024, 6:54:39 PM");

            Assert.assertEquals(1717700079000L, date.getTime());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
    }

    @Test
    public void getUSDateFormatTest() throws ParseException {
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            DateFormat format = PreJava20DateFormatProvider.getUSDateFormat();
            Date date = format.parse("Jun 6, 2024, 6:54:39 PM");

            Assert.assertEquals(1717700079000L, date.getTime());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
    }

}