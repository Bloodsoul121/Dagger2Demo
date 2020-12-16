package com.blood.daggerdemo.mvp.net;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitManager {

    private final NetApiInterface mNet;

    private RetrofitManager() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.wanandroid.com")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        mNet = retrofit.create(NetApiInterface.class);
    }

    private static class Holder {
        private static final RetrofitManager sInstance = new RetrofitManager();
    }

    public static RetrofitManager getInstance() {
        return Holder.sInstance;
    }

    public NetApiInterface getNet() {
        return mNet;
    }

}
