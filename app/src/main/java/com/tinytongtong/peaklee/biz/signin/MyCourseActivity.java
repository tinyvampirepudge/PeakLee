package com.tinytongtong.peaklee.biz.signin;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tinytongtong.peaklee.R;
import com.tinytongtong.peaklee.base.BaseActivity;

public class MyCourseActivity extends BaseActivity {
    public static void actionStart(Context context) {
        Intent starter = new Intent(context, MyCourseActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected int setContentLayout() {
        return R.layout.activity_my_course;
    }

    @Override
    protected void buildContentView() {

    }

    @Override
    protected void initViewData() {

    }

    @Override
    protected String getTitleText() {
        return "我的课程";
    }
}
