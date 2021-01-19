package com.blood.daggerdemo.case10;

import com.blood.daggerdemo.activity.Case10Activity;
import com.blood.daggerdemo.activity.Case9Activity;
import com.blood.daggerdemo.case9.CModule;

import dagger.Subcomponent;

@Subcomponent(modules = CModule.class)
public interface FifthComponent {

    void inject(Case10Activity activity);

}
