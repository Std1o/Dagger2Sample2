package com.stdio.dagger2sample2;

import java.util.Calendar;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class LongUtils {

    @Inject
    public LongUtils() {

    }

    long getDateLong() {
        return Calendar.getInstance().getTimeInMillis();
    }
}
