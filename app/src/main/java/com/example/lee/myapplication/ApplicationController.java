package com.example.lee.myapplication;

import android.app.Activity;
import android.app.Application;

import com.kakao.auth.KakaoSDK;
import com.example.lee.kakao.KaKaoSDKAdapter;

public class ApplicationController extends Application {
    private static ApplicationController instance = null;
    private static volatile Activity currentActivity = null;

    public static ApplicationController getInstance() { return instance; }

    @Override
    public void onCreate() {
        super.onCreate();
        ApplicationController.instance = this;
        KakaoSDK.init(new KaKaoSDKAdapter());
    }
    public static Activity getCurrentActivity() { return currentActivity; }

    public static void setCurrentActivity(Activity currentActivity) {
        ApplicationController.currentActivity = currentActivity;
    }
    @Override
    public void onTerminate(){
        super.onTerminate();
        instance = null;
    }
}
