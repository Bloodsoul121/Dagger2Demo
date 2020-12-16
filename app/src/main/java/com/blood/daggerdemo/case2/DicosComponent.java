package com.blood.daggerdemo.case2;

import com.blood.daggerdemo.activity.Case2Activity;

import dagger.Component;

@Component(modules = DicosModule.class)
public interface DicosComponent {

    void inject(Case2Activity case2Activity);

}
