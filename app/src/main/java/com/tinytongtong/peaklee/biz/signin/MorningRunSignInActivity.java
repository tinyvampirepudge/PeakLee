package com.tinytongtong.peaklee.biz.signin;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.tinytongtong.peaklee.R;
import com.tinytongtong.peaklee.base.BaseActivity;
import com.tinytongtong.peaklee.utils.ToastUtils;

public class MorningRunSignInActivity extends BaseActivity {

    public static void actionStart(Context context) {
        Intent starter = new Intent(context, MorningRunSignInActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected int setContentLayout() {
        return R.layout.activity_morning_run_sign_in;
    }

    @Override
    protected void buildContentView() {
        findViewById(R.id.btn_signIn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtils.showSingleToast("李峰是个傻逼。");
            }
        });
    }

    @Override
    protected void initViewData() {

    }

    @Override
    protected String getTitleText() {
        return "晨跑签到";
    }
}
