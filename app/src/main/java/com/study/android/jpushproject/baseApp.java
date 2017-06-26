package com.study.android.jpushproject;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by maw on 2017/6/26.
 */

public class baseApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化jpush
        JPushInterface.init(this);
    }
}
