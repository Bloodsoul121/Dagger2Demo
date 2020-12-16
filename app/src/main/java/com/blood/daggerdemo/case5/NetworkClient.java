package com.blood.daggerdemo.case5;

import android.util.Log;

public class NetworkClient {

    String baseUrl;

    public NetworkClient() {
        baseUrl = "http://www.baidu.com/";
    }

    public void init() {
        Log.d("NetworkClient", "网络初始化 " + hashCode());
    }

}
