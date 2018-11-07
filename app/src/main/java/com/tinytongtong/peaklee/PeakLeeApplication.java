package com.tinytongtong.peaklee;

import android.app.Application;
import android.content.Context;

/**
 * @Description: TODO
 * @Author wangjianzhou@qding.me
 * @Date 2018/11/6 8:21 PM
 * @Version TODO
 */
public class PeakLeeApplication extends Application {
    private static Context instance;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        instance = this;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static Context instance() {
        return instance;
    }
}
