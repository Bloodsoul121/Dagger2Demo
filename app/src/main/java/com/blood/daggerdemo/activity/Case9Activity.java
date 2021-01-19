package com.blood.daggerdemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.blood.daggerdemo.R;
import com.blood.daggerdemo.case8.BBean;
import com.blood.daggerdemo.case9.DBean;
import com.blood.daggerdemo.case9.DaggerFourthComponent;
import com.blood.daggerdemo.util.LogUtil;

import javax.inject.Inject;

public class Case9Activity extends AppCompatActivity {

    @Inject
    public DBean mDBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case9);

        DaggerFourthComponent.create().buildThirdComponent().build().inject(this);

        LogUtil.log("mDBean " + mDBean);
    }
}