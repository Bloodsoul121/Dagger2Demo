package com.blood.daggerdemo.case3;

import com.blood.daggerdemo.activity.Case3Activity;

import dagger.Component;

@Component(modules = LittleSheepModule.class)
public interface LittleSheepComponent {

    void inject(Case3Activity activity);

}
