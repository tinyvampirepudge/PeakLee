package com.tinytongtong.peaklee.biz.cate;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tinytongtong.peaklee.R;
import com.tinytongtong.peaklee.base.BaseActivity;

public class SupermarketDetailActivity extends BaseActivity {
    public static void actionStart(Context context) {
        Intent starter = new Intent(context, SupermarketDetailActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected int setContentLayout() {
        return R.layout.activity_supermarket_detail;
    }

    @Override
    protected void buildContentView() {

    }

    @Override
    protected void initViewData() {

    }

    @Override
    protected String getTitleText() {
        return "超市商品详情";
    }
}
