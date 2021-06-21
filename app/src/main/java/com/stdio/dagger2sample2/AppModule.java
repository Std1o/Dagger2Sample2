package com.stdio.dagger2sample2;

import java.text.SimpleDateFormat;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    public AppModule() {

    }

    @Provides
    @Singleton
    SimpleDateFormat provideDateFormat() {
        return new SimpleDateFormat("dd.MM.yyyy HH:mm ");
    }
}
