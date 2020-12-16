package com.blood.daggerdemo.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.blood.daggerdemo.R;
import com.blood.daggerdemo.case1.Cola;
import com.blood.daggerdemo.case1.DaggerColaComponent;

import javax.inject.Inject;

public class Case1Activity extends AppCompatActivity {

    @Inject
    Cola mCola;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case1);

        DaggerColaComponent.create().inject(this);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();

        mCola.drink();
    }
}