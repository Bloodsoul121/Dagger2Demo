package com.blood.daggerdemo.case3;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class LittleSheepModule {

    @Named("all")
    @Provides
    public LittleSheep provideLittleSheepAll() {
        return new LittleSheep("十盘羊肉", "一盘蔬菜");
    }

    @Named("mutton")
    @Provides
    public LittleSheep provideLittleSheepSingle() {
        return new LittleSheep("二十盘羊肉吃个够");
    }
}
