package com.blood.daggerdemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.blood.daggerdemo.R;
import com.blood.daggerdemo.case10.DaggerSixthComponent;
import com.blood.daggerdemo.case9.DBean;
import com.blood.daggerdemo.util.LogUtil;

import javax.inject.Inject;

public class Case10Activity extends AppCompatActivity {

    @Inject
    public DBean mDBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case10);

        DaggerSixthComponent.create().buildFifthComponent().inject(this);

        LogUtil.log("mDBean " + mDBean);
    }
}