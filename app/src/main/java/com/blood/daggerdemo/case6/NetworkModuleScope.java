package com.blood.daggerdemo.case6;

import com.blood.daggerdemo.case5.NetworkClient;
import com.blood.daggerdemo.case6.annotation.ApplicationScope;

import dagger.Module;
import dagger.Provides;

@Module
public class NetworkModuleScope {

    @ApplicationScope
    @Provides
    public NetworkClient getClient() {
        return new NetworkClient();
    }

}
