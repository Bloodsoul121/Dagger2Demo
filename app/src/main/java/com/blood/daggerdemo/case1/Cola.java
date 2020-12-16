package com.blood.daggerdemo.case1;

import android.util.Log;

import com.blood.daggerdemo.Constants;

import javax.inject.Inject;

public class Cola {

    @Inject
    public Cola() {
    }

    public void drink() {
        Log.i(Constants.TAG, "drink: cola");
    }

}
