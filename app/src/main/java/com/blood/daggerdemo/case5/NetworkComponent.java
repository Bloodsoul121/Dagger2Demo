package com.blood.daggerdemo.case5;

import com.blood.daggerdemo.activity.Case5Activity;
import com.blood.daggerdemo.activity.Case5Activity_1;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = NetworkModule.class)
public interface NetworkComponent {

    void inject(Case5Activity activity);

    void inject(Case5Activity_1 activity);

}
