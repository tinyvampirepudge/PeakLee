package com.tinytongtong.peaklee.biz.cate;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.tinytongtong.peaklee.R;
import com.tinytongtong.peaklee.base.BaseActivity;

public class TakeOutHomeActivity extends BaseActivity {

    public static void actionStart(Context context) {
        Intent starter = new Intent(context, TakeOutHomeActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected int setContentLayout() {
        return R.layout.activity_take_out_home;
    }

    @Override
    protected void buildContentView() {
        findViewById(R.id.layout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TakeOutDetailActivity.actionStart(mContext);
            }
        });
    }

    @Override
    protected void initViewData() {

    }

    @Override
    protected String getTitleText() {
        return "外卖首页";
    }
}
