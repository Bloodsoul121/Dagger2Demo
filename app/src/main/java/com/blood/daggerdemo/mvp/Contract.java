package com.blood.daggerdemo.mvp;

import com.blood.daggerdemo.mvp.bean.LoginResult;

public interface Contract {

    interface IView {
        void loginResult(LoginResult result);
    }

    interface IPresenter {
        void login(String name, String password);
    }

}
