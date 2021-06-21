package com.stdio.dagger2sample2;


import javax.inject.Singleton;

import dagger.Component;

@Component(modules = AppModule.class)
@Singleton
 public interface AppComponent {
    void inject(MainActivity mainActivity);
}
