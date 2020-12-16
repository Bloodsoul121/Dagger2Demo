package com.blood.daggerdemo;

import com.blood.daggerdemo.case6.DaggerNetworkComponentScope;
import com.blood.daggerdemo.case6.NetworkComponentScope;
import com.blood.daggerdemo.dagger.DaggerCookAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class MainApplication extends DaggerApplication {

    private static MainApplication sInstance;

    private NetworkComponentScope mNetworkComponentScope;

    @Override
    public void onCreate() {
        super.onCreate();
        mNetworkComponentScope = DaggerNetworkComponentScope.create();
        sInstance = this;
    }

    public static MainApplication getInstance() {
        return sInstance;
    }

    public NetworkComponentScope getNetworkComponentScope() {
        return mNetworkComponentScope;
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerCookAppComponent.builder().create(this);
    }
}
