package com.tinytongtong.peaklee.biz.cate;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.tinytongtong.peaklee.R;
import com.tinytongtong.peaklee.base.BaseActivity;
import com.tinytongtong.peaklee.utils.StatusBarUtil;

public class TakeOutDetailActivity extends BaseActivity {
    public static void actionStart(Context context) {
        Intent starter = new Intent(context, TakeOutDetailActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected int setContentLayout() {
        return R.layout.activity_take_out_detail;
    }

    @Override
    protected void buildContentView() {
        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    protected void setStatusBar() {
        View mViewNeedOffset = findViewById(R.id.view_need_offset);
        StatusBarUtil.setTranslucentForImageView(this, 0, mViewNeedOffset);
    }

    @Override
    protected void initViewData() {

    }

    @Override
    protected String getTitleText() {
        return "外卖详情";
    }

    @Override
    protected boolean showTitle() {
        return false;
    }
}
