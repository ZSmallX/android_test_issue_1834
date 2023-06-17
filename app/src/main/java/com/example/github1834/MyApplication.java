package com.example.github1834;

import android.app.Application;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // test on exception on app init.
        throw new RuntimeException("test");
    }
}
