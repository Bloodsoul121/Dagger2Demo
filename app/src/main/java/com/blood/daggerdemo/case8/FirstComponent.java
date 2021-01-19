package com.blood.daggerdemo.case8;

import com.blood.daggerdemo.activity.Case8Activity;

import dagger.Component;

@Component(modules = AModule.class, dependencies = SecondComponent.class)
public interface FirstComponent {

    void inject(Case8Activity activity);

}
