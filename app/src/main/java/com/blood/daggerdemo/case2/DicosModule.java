package com.blood.daggerdemo.case2;

import dagger.Module;
import dagger.Provides;

@Module
public class DicosModule {

    @Provides
    public Dicos provideDicos() {
        return new Dicos();
    }

}
