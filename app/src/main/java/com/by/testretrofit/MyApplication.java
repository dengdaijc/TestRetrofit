package com.by.testretrofit;

import android.app.Application;

import com.by.testretrofit.http.HttpInstance;

/**
 * Created by baiyu on 16/10/18.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        HttpInstance.getInstance().init();
    }

}
