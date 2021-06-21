package com.stdio.dagger2sample2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.inject.Inject;

import dagger.Provides;

public class  Repository {

    @Inject
    SimpleDateFormat sdf;

    @Inject
    LongUtils longUtils;

    @Inject
    public Repository() {

    }

    String getDate() {
        long dateLong = longUtils.getDateLong();
        Date date = new Date(dateLong);
        return sdf.format(date);
    }
}
