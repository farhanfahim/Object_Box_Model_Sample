package com.example.ormsample;

import android.app.Application;

import io.objectbox.BoxStore;


public class BaseApplication extends Application {

    private static BaseApplication baseApplication;
    private BoxStore boxStore;

    @Override
    public void onCreate() {
        super.onCreate();
        baseApplication = this;
        boxStore = MyObjectBox.builder().androidContext(BaseApplication.this).build();
    }

    public static BaseApplication getApp() {
        return baseApplication;
    }

    public BoxStore getBoxStore() {
        return boxStore;
    }
}
