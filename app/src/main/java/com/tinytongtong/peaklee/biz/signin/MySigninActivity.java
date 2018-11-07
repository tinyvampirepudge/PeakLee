package com.tinytongtong.peaklee.biz.signin;

import android.content.Context;
import android.content.Intent;

import com.tinytongtong.peaklee.R;
import com.tinytongtong.peaklee.base.BaseActivity;

public class MySigninActivity extends BaseActivity {
    public static void actionStart(Context context) {
        Intent starter = new Intent(context, MySigninActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected int setContentLayout() {
        return R.layout.activity_my_signin;
    }

    @Override
    protected void buildContentView() {

    }

    @Override
    protected void initViewData() {

    }

    @Override
    protected String getTitleText() {
        return "我的签到";
    }
}
