package com.tinytongtong.peaklee.biz.signin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RelativeLayout;

import com.tinytongtong.peaklee.R;
import com.tinytongtong.peaklee.base.BaseActivity;
import com.tinytongtong.peaklee.utils.ToastUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SchoolTimeSingInActivity extends BaseActivity {

    @BindView(R.id.rl_my_courses)
    RelativeLayout rlMyCourses;
    @BindView(R.id.ll_remind)
    RelativeLayout llRemind;
    @BindView(R.id.ll_setting)
    RelativeLayout llSetting;
    private CheckBox cbScreenOn;

    public static void actionStart(Context context) {
        Intent starter = new Intent(context, SchoolTimeSingInActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected int setContentLayout() {
        return R.layout.activity_school_time_sing_in;
    }

    @Override
    protected void buildContentView() {
        cbScreenOn = findViewById(R.id.cb_screen_on);
        final boolean isScreenOn = true;
        cbScreenOn.setChecked(isScreenOn);
    }

    @Override
    protected void initViewData() {

    }

    @Override
    protected String getTitleText() {
        return "上课签到";
    }

    @OnClick({R.id.rl_my_courses, R.id.ll_remind, R.id.ll_setting})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rl_my_courses:
                MyCourseActivity.actionStart(mContext);
                break;
            case R.id.ll_remind:
                cbScreenOn.setChecked(!cbScreenOn.isChecked());
                ToastUtils.showSingleToast((cbScreenOn.isChecked() ? "打开" : "关闭") + "上课提醒");
                break;
            case R.id.ll_setting:
                ToastUtils.showSingleToast("设置");
                break;
        }
    }
}
