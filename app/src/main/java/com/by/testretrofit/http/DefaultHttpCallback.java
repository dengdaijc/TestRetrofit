package com.by.testretrofit.http;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by baiyu on 16/10/18.
 */

public abstract class DefaultHttpCallback<T> implements IHttpCallback<T> {

    private Context context;

    public DefaultHttpCallback(Context context) {
        this.context = context;
    }

    @Override
    public void failed(String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void connectFailure(Throwable t) {
        t.printStackTrace();
        Log.e("http failure", t.getMessage());
    }
}
