package com.blood.daggerdemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.blood.daggerdemo.MainApplication;
import com.blood.daggerdemo.R;
import com.blood.daggerdemo.case5.DaggerNetworkComponent;
import com.blood.daggerdemo.case5.NetworkClient;
import com.blood.daggerdemo.case6.DaggerNetworkComponentScope;

import javax.inject.Inject;

public class Case6Activity_1 extends AppCompatActivity {

    @Inject
    NetworkClient networkClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case6_1);

//        DaggerNetworkComponentScope.create().inject(this);

        MainApplication.getInstance().getNetworkComponentScope().inject(this);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        networkClient.init();
    }
}