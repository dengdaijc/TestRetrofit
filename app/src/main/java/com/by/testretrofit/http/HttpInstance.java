package com.by.testretrofit.http;

import com.by.testretrofit.http.pojo.NewsList;
import com.by.testretrofit.http.service.ILoginService;
import com.by.testretrofit.http.pojo.UserData;
import com.by.testretrofit.http.service.INewsService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by baiyu on 16/10/18.
 */

public class HttpInstance {

    private static HttpInstance instance = null;
    private HttpInstance() {

    }
    public static HttpInstance getInstance() {
        if (instance == null) {
            synchronized (HttpInstance.class) {
                if (instance == null) {
                    instance = new HttpInstance();
                }
            }
        }
        return instance;
    }

    private Retrofit retrofit;

    public void init() {
        retrofit = new Retrofit.Builder()
                .baseUrl("http://baseurl")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    private <T> void getResult(final Call<HttpResult<T>> call, final IHttpCallback<T> callback) {
        call.enqueue(new Callback<HttpResult<T>>() {
            @Override
            public void onResponse(Call<HttpResult<T>> call, Response<HttpResult<T>> response) {
                if (response.body().getCode() == 1) {
                    callback.success(response.body().getData());
                } else {
                    callback.failed(response.body().getMessage());
                }
            }

            @Override
            public void onFailure(Call<HttpResult<T>> call, Throwable t) {
                //connect to server failure
                callback.connectFailure(t);
            }
        });

    }

    public void login(final String account, final String password, final IHttpCallback<UserData> callback) {
        ILoginService loginService = retrofit.create(ILoginService.class);
        Call<HttpResult<UserData>> call = loginService.login(account, password);
        getResult(call, callback);
    }

    public void getNewsList(final int page, final int number, final IHttpCallback<NewsList> callback) {
        INewsService newsService = retrofit.create(INewsService.class);
        Call<HttpResult<NewsList>> call = newsService.getNewsList(page, number);
        getResult(call, callback);
    }







}
