package com.blood.daggerdemo.case8;

import dagger.Module;
import dagger.Provides;

@Module
public class BModule {

    @Provides
    public BBean provideBBean() {
        return new BBean();
    }

}
