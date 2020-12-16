package com.blood.daggerdemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.blood.daggerdemo.R;
import com.blood.daggerdemo.case2.DaggerDicosComponent;
import com.blood.daggerdemo.case2.Dicos;

import javax.inject.Inject;

public class Case2Activity extends AppCompatActivity {

    @Inject
    Dicos mDicos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case2);

        DaggerDicosComponent.create().inject(this);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();

        mDicos.eat();
    }
}