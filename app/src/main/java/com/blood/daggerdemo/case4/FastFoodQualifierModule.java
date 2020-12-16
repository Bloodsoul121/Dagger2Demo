package com.blood.daggerdemo.case4;

import dagger.Module;
import dagger.Provides;

@Module
public class FastFoodQualifierModule {

    @com.blood.daggerdemo.case4.annotation.KFC
    @Provides
    public FastFood getKFC() {
        return new KFC();
    }

    @com.blood.daggerdemo.case4.annotation.BurgerKing
    @Provides
    public FastFood getBurgerKing() {
        return new BurgerKing();
    }

}
