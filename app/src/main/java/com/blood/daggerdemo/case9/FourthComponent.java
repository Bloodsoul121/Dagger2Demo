package com.blood.daggerdemo.case9;

import dagger.Component;

@Component(modules = DModule.class)
public interface FourthComponent {

    ThirdComponent.Builder buildThirdComponent();

}
