package com.blood.daggerdemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.blood.daggerdemo.R;
import com.blood.daggerdemo.case3.DaggerLittleSheepComponent;
import com.blood.daggerdemo.case3.LittleSheep;
import com.blood.daggerdemo.case3.LittleSheepComponent;

import javax.inject.Inject;
import javax.inject.Named;

public class Case3Activity extends AppCompatActivity {

    @Named("all")
    @Inject
    LittleSheep mLittleSheep1;

    @Named("mutton")
    @Inject
    LittleSheep mLittleSheep2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case3);

        DaggerLittleSheepComponent.create().inject(this);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();

        mLittleSheep1.eat();
        mLittleSheep2.eat();
    }
}