package com.google.gson.internal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class PreJava20DateFormatProvider {
    /**
     * Compatibility fix for bug: <a href="https://bugs.openjdk.org/browse/JDK-8304925">JDK-8304925</a>
     * Space used instead NBSP in format pattern.
     *
     * @return Returns the same DateFormat as {@code DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, Locale.US)}
     * in Java 19 or below.
     */
    public static DateFormat getUSDateFormat() {
        return new SimpleDateFormat("MMM d, y, h:mm:ss a", Locale.US);
    }

    /**
     * Compatibility fix for old Javas runtime, if date was written by JDK 20 or greater
     * This date format contains NBSP symbol instead space before AM/PM
     *
     * @return Returns the same DateFormat as {@code DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, Locale.US)}
     *  in Java 20 or upper.
     */
    public static DateFormat getNewUSDateFormat() {
        return new SimpleDateFormat("MMM d, y, h:mm:ss a", Locale.US);
    }
}
