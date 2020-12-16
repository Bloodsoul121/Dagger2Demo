package com.blood.daggerdemo.mvp;

import dagger.Module;
import dagger.Provides;

@Module
public class PresenterModule {

    private final Contract.IView mView;

    public PresenterModule(Contract.IView view) {
        mView = view;
    }

    @Provides
    Contract.IView provideIView() {
        return mView;
    }

}
