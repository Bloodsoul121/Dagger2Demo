package com.blood.daggerdemo.case9;

import dagger.Module;
import dagger.Provides;

@Module
public class DModule {

    @Provides
    public DBean provideDBean() {
        return new DBean();
    }

}
