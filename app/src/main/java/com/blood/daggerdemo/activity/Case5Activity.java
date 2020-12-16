package com.blood.daggerdemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.blood.daggerdemo.R;
import com.blood.daggerdemo.case5.DaggerNetworkComponent;
import com.blood.daggerdemo.case5.NetworkClient;

import javax.inject.Inject;

public class Case5Activity extends AppCompatActivity {

    @Inject
    NetworkClient networkClient1;

    @Inject
    NetworkClient networkClient2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case5);

        DaggerNetworkComponent.create().inject(this);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();

        networkClient1.init();
        networkClient2.init();
    }

    public void clickBtn1(View view) {
        startActivity(new Intent(this, Case5Activity_1.class));
    }
}