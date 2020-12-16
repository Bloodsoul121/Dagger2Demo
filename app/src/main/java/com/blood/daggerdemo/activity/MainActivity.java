package com.blood.daggerdemo.activity;

import android.os.Bundle;
import android.util.Log;

import com.blood.daggerdemo.dagger.Chef;
import com.blood.daggerdemo.R;

import javax.inject.Inject;

import dagger.android.DaggerActivity;

public class MainActivity extends DaggerActivity {

    private static final String TAG = "MainActivity";

    @Inject
    Chef chef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 正常操作
//        Map<String, Boolean> menus = new LinkedHashMap<>();
//        menus.put("酸菜鱼", true);
//        menus.put("土豆丝", true);
//        menus.put("铁板牛肉", true);
//        Menu menu = new Menu(menus);
//        Chef chef = new Chef(menu);
//        System.out.println(chef.cook());


        // dagger 操作
        Log.d(TAG, chef.cook());
    }
}