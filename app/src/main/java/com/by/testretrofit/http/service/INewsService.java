package com.by.testretrofit.http.service;

import com.by.testretrofit.http.HttpResult;
import com.by.testretrofit.http.pojo.NewsList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by baiyu on 16/10/18.
 */

public interface INewsService {

    @GET("/api/test")
    public Call<HttpResult<NewsList>> getNewsList(@Query("page") int page, @Query("number") int number);

}
