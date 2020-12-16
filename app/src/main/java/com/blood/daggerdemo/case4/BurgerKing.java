package com.blood.daggerdemo.case4;

import com.blood.daggerdemo.util.LogUtil;

public class BurgerKing extends FastFood {
    @Override
    public void eat() {
        LogUtil.log("三层牛肉汉堡");
    }
}
