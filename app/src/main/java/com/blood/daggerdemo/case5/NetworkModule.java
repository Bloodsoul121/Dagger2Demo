package com.blood.daggerdemo.case5;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class NetworkModule {

    @Singleton
    @Provides
    public NetworkClient getClient() {
        return new NetworkClient();
    }

}
