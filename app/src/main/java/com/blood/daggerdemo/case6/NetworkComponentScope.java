package com.blood.daggerdemo.case6;

import com.blood.daggerdemo.activity.Case6Activity;
import com.blood.daggerdemo.activity.Case6Activity_1;
import com.blood.daggerdemo.activity.Case7Activity;
import com.blood.daggerdemo.case6.annotation.ApplicationScope;

import dagger.Component;

@ApplicationScope
@Component(modules = NetworkModuleScope.class)
public interface NetworkComponentScope {

    void inject(Case6Activity activity);

    void inject(Case6Activity_1 activity);

    void inject(Case7Activity activity);

}
