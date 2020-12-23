package com.blood.daggerdemo.dagger;

import com.blood.daggerdemo.activity.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityModule {

    // 标记哪个类需要使用依赖注入功能
    // 帮我们生成需要的Subcomponent
    @ContributesAndroidInjector
    abstract MainActivity contributeMainActivity();

}
