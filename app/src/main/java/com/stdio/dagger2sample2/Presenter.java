package com.stdio.dagger2sample2;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Provides;

public class Presenter {

    @Inject
    Repository repository;

    @Inject
    public Presenter() {

    }
    String getDateString() {
        return repository.getDate();
    }
}
