package com.blood.daggerdemo.case9;

import com.blood.daggerdemo.activity.Case9Activity;

import dagger.Component;
import dagger.Subcomponent;

@Subcomponent(modules = CModule.class)
public interface ThirdComponent {

    void inject(Case9Activity activity);

    @Subcomponent.Builder
    interface Builder {
        ThirdComponent build();
    }

}
