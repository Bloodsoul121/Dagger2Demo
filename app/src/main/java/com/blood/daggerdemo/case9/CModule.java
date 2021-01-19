package com.blood.daggerdemo.case9;

import dagger.Module;
import dagger.Provides;

@Module
public class CModule {

    @Provides
    public CBean provideCBean() {
        return new CBean();
    }

}
