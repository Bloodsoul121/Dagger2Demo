package com.blood.daggerdemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.blood.daggerdemo.R;
import com.blood.daggerdemo.case4.DaggerFastFoodComponent;
import com.blood.daggerdemo.case4.FastFood;
import com.blood.daggerdemo.case4.annotation.BurgerKing;
import com.blood.daggerdemo.case4.annotation.KFC;

import javax.inject.Inject;

public class Case4Activity extends AppCompatActivity {

    @KFC
    @Inject
    FastFood mKFC;

    @BurgerKing
    @Inject
    FastFood mBurgerKing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case4);

        DaggerFastFoodComponent.create().inject(this);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();

        mKFC.eat();
        mBurgerKing.eat();
    }
}