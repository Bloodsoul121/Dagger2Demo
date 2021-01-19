package com.blood.daggerdemo.case8;

import dagger.Module;
import dagger.Provides;

@Module
public class AModule {

    @Provides
    public ABean provideABean() {
        return new ABean();
    }

}
