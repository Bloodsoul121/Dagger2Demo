package com.blood.daggerdemo.mvp.net;

import com.blood.daggerdemo.mvp.bean.LoginResult;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface NetApiInterface {

    @FormUrlEncoded
    @POST("/user/login")
    Observable<LoginResult> login(@Field("username") String username, @Field("password") String password);

}
