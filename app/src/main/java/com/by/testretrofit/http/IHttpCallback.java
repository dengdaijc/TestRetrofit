package com.by.testretrofit.http;

/**
 * Created by baiyu on 16/10/18.
 */

public interface IHttpCallback<T> {

    public void success(T data);

    public void failed(String message);

    public void connectFailure(Throwable t);

}
