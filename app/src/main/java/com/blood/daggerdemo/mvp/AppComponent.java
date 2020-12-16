package com.blood.daggerdemo.mvp;

import com.blood.daggerdemo.mvp.view.DemoActivity;

import dagger.Component;

@Component(modules = PresenterModule.class)
public interface AppComponent {

    void inject(DemoActivity activity);

}
