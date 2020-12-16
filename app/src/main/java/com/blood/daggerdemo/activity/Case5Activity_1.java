package com.blood.daggerdemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.blood.daggerdemo.R;
import com.blood.daggerdemo.case5.DaggerNetworkComponent;
import com.blood.daggerdemo.case5.NetworkClient;

import javax.inject.Inject;

public class Case5Activity_1 extends AppCompatActivity {

    @Inject
    NetworkClient networkClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case5_1);

        DaggerNetworkComponent.create().inject(this);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        networkClient.init();
    }
}