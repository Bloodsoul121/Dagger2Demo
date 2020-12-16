package com.blood.daggerdemo.mvp.view;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.blood.daggerdemo.R;
import com.blood.daggerdemo.databinding.ActivityDemoBinding;
import com.blood.daggerdemo.mvp.Contract;
import com.blood.daggerdemo.mvp.DaggerAppComponent;
import com.blood.daggerdemo.mvp.PresenterModule;
import com.blood.daggerdemo.mvp.bean.LoginResult;
import com.blood.daggerdemo.mvp.presenter.Presenter;

import javax.inject.Inject;

public class DemoActivity extends AppCompatActivity implements Contract.IView {

    @Inject
    Presenter mPresenter;

    private ActivityDemoBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_demo);

        DaggerAppComponent.builder()
                .presenterModule(new PresenterModule(this))
                .build()
                .inject(this);
    }

    public void clickBtn1(View view) {
        String username = "bloodsoul";
        String password = "cgz123456";
        mPresenter.login(username, password);
    }

    @Override
    public void loginResult(LoginResult result) {
        mBinding.result.setText(result.toString());
    }
}