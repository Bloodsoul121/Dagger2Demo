package com.blood.daggerdemo.case4;

import com.blood.daggerdemo.util.LogUtil;

public class KFC extends FastFood {
    @Override
    public void eat() {
        LogUtil.log("KFC全家桶");
    }
}
