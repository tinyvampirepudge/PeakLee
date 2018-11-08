package com.tinytongtong.peaklee.biz.signin;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tinytongtong.peaklee.R;
import com.tinytongtong.peaklee.base.BaseActivity;

public class CardSignInListActivity extends BaseActivity {
    public static void actionStart(Context context) {
        Intent starter = new Intent(context, CardSignInListActivity.class);
        context.startActivity(starter);
    }
    @Override
    protected int setContentLayout() {
        return R.layout.activity_card_sign_in_list;
    }

    @Override
    protected void buildContentView() {

    }

    @Override
    protected void initViewData() {

    }

    @Override
    protected String getTitleText() {
        return "打卡签到——日历模式";
    }
}
