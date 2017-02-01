package com.example.android.camera2basic.application;

import android.app.Application;
import com.parse.Parse;


public class MyApplication extends Application {

    @Override
    public void onCreate() {

        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(MyApplication.this)
                .applicationId(ParseConstants.PARSE_APP_ID)
                .server(ParseConstants.PARSE_SERVER_URL)
                .enableLocalDataStore()
                .build()
        );
    }
}
