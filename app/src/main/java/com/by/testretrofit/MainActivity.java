package com.by.testretrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.by.testretrofit.http.DefaultHttpCallback;
import com.by.testretrofit.http.HttpInstance;
import com.by.testretrofit.http.pojo.NewsList;
import com.by.testretrofit.http.pojo.UserData;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickBtn();
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickBtn2();
            }
        });

    }

    private void clickBtn2() {

        HttpInstance.getInstance().getNewsList(1, 1, new DefaultHttpCallback<NewsList>(this) {
            @Override
            public void success(NewsList data) {

            }

            @Override
            public void failed(String message) {
                super.failed(message);

            }
        });

    }

    private void clickBtn() {
        HttpInstance.getInstance().login("account", "password", new DefaultHttpCallback<UserData>(this) {
            @Override
            public void success(UserData data) {

            }
        });
    }
}
