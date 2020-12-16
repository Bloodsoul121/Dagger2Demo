package com.blood.daggerdemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.blood.daggerdemo.R;
import com.blood.daggerdemo.case5.NetworkClient;
import com.blood.daggerdemo.case6.DaggerNetworkComponentScope;

import javax.inject.Inject;

import dagger.Lazy;

public class Case7Activity extends AppCompatActivity {

    @Inject
    Lazy<NetworkClient> mNetworkClientLazy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case7);

        DaggerNetworkComponentScope.create().inject(this);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        NetworkClient networkClient = mNetworkClientLazy.get();
        networkClient.init();
    }
}