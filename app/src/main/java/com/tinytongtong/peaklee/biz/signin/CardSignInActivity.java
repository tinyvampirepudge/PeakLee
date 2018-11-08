package com.tinytongtong.peaklee.biz.signin;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.tinytongtong.peaklee.R;
import com.tinytongtong.peaklee.base.BaseActivity;

public class CardSignInActivity extends BaseActivity {
    public static void actionStart(Context context) {
        Intent starter = new Intent(context, CardSignInActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected int setContentLayout() {
        return R.layout.activity_card_sign_in;
    }

    @Override
    protected void buildContentView() {
        findViewById(R.id.btn_ok).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CardSignInListActivity.actionStart(mContext);
            }
        });
    }

    @Override
    protected void initViewData() {

    }

    @Override
    protected String getTitleText() {
        return "确认打卡";
    }
}
