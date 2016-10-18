package com.by.testretrofit.http.service;

import com.by.testretrofit.http.pojo.UserData;
import com.by.testretrofit.http.HttpResult;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by baiyu on 16/10/18.
 */

public interface ILoginService {

    @POST("/api/test")
    public Call<HttpResult<UserData>> login(@Query("account") String account, @Query("password") String password);

}
