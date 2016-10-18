package com.by.testretrofit.http;

/**
 * Created by baiyu on 16/10/18.
 */

public class HttpResult<T> {


    /**
     * code : 1
     * data : {}
     * message :
     */

    private int code;
    private String message;
    private T data;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
