package com.blood.daggerdemo.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.blood.daggerdemo.R;
import com.blood.daggerdemo.case8.BBean;
import com.blood.daggerdemo.case8.DaggerFirstComponent;
import com.blood.daggerdemo.case8.DaggerSecondComponent;
import com.blood.daggerdemo.case8.SecondComponent;
import com.blood.daggerdemo.util.LogUtil;

import javax.inject.Inject;

public class Case8Activity extends AppCompatActivity {

    @Inject
    public BBean mBBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case8);

        SecondComponent secondComponent = DaggerSecondComponent.create();
        DaggerFirstComponent.builder().secondComponent(secondComponent).build().inject(this);

        LogUtil.log("mBBean " + mBBean);
    }
}