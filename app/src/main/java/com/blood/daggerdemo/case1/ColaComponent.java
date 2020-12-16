package com.blood.daggerdemo.case1;

import com.blood.daggerdemo.activity.Case1Activity;

import dagger.Component;

@Component
public interface ColaComponent {

    void inject(Case1Activity case1Activity);

}
