package com.blood.daggerdemo.case10;

import com.blood.daggerdemo.case9.DModule;
import com.blood.daggerdemo.case9.ThirdComponent;

import dagger.Component;

@Component(modules = DModule.class)
public interface SixthComponent {

    FifthComponent buildFifthComponent();

}
