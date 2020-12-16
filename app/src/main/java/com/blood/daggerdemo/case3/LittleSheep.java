package com.blood.daggerdemo.case3;

import android.util.Log;

import com.blood.daggerdemo.Constants;

public class LittleSheep {

    String mutton = "没有肉";
    String vegetables = "没有菜";

    public LittleSheep(String mutton) {
        this.mutton = mutton;
    }

    public LittleSheep(String mutton, String vegetables) {
        this.mutton = mutton;
        this.vegetables = vegetables;
    }

    public void eat() {
        Log.i(Constants.TAG, "小肥羊火锅：" + mutton + " " + vegetables);
    }

}
