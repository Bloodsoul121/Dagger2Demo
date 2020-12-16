package com.blood.daggerdemo.case4;

import com.blood.daggerdemo.activity.Case4Activity;

import dagger.Component;

@Component(modules = FastFoodQualifierModule.class)
public interface FastFoodComponent {

    void inject(Case4Activity activity);

}
