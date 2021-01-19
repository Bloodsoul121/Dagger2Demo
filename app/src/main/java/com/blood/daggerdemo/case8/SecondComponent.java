package com.blood.daggerdemo.case8;

import dagger.Component;

@Component(modules = BModule.class)
public interface SecondComponent {

    // 这个是提供的被依赖的 Component，所以里面的注入接口全部都要显式提供出来
    // 否则外部无法找到 Module 中提供的 Provides 函数
    // 所以显得有些繁琐了

    BBean provideBBean();

}
