package com.blood.daggerdemo.mvp.presenter;

import com.blood.daggerdemo.mvp.Contract;
import com.blood.daggerdemo.mvp.bean.LoginResult;
import com.blood.daggerdemo.mvp.net.RetrofitManager;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class Presenter implements Contract.IPresenter {

    private final Contract.IView mView;

    @Inject
    public Presenter(Contract.IView view) {
        mView = view;
    }

    @Override
    public void login(String name, String password) {
        Observable<LoginResult> login = RetrofitManager.getInstance().getNet().login(name, password);
        login.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<LoginResult>() {
                    @Override
                    public void accept(LoginResult loginResult) throws Exception {
                        mView.loginResult(loginResult);
                    }
                });
    }
}
