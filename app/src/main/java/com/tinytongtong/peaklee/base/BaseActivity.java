package com.tinytongtong.peaklee.base;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.tinytongtong.peaklee.R;
import com.tinytongtong.peaklee.manager.ActivityCollector;
import com.tinytongtong.peaklee.utils.LogUtils;

import butterknife.ButterKnife;


/**
 * Created by 87959 on 2017/3/7.
 */

public abstract class BaseActivity extends AppCompatActivity {
    public Context mContext;
    protected final String TAG = this.getClass().getSimpleName();

    /**
     * 全局的LayoutInflater对象，已经完成初始化.
     */
    public LayoutInflater mInflater;
    private FrameLayout content_fl;
    private LinearLayout rootLl;
    private TextView leftTv;
    private TextView rightTv;
    private TextView titleTv;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_layout);
        mInflater = LayoutInflater.from(this);
        rootLl = findViewById(R.id.root_ll);
        View titleRoot = findViewById(R.id.title_rl);
        titleRoot.setVisibility(showTitle() ? View.VISIBLE : View.GONE);

        leftTv = findViewById(R.id.left_tv);
        if (showLeftArrow()) {
            leftTv.setVisibility(View.VISIBLE);
            leftTv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
            setLeftBtnDrawable(R.drawable.selector_back_bt);
        } else {
            leftTv.setVisibility(View.GONE);
        }
        rightTv = findViewById(R.id.right_tv);
        content_fl = findViewById(R.id.content_fl);
        titleTv = findViewById(R.id.title_tv);
        if (getTitleText() == null) {
            titleTv.setText("");
        } else {
            titleTv.setText(getTitleText());
        }
        addContentView(setContentLayout());

        ButterKnife.bind(this);
        mContext = this;
        LogUtils.e("class name --> " + getClass().getSimpleName());
        ActivityCollector.addActivity(this);
        buildContentView();
        rootLl.postDelayed(new Runnable() {
            @Override
            public void run() {
                initViewData();
            }
        }, 300);
    }

    /**
     * 描述：用指定资源ID表示的View填充主界面.
     *
     * @param resId 指定的View的资源ID
     */
    public void addContentView(int resId) {
        content_fl.removeAllViews();
        content_fl.addView(mInflater.inflate(resId, null));
    }

    /**
     * 设置左边按钮的图片
     *
     * @param draw
     */
    public void setLeftBtnDrawable(int draw) {
        Drawable drawable = getResources().getDrawable(draw);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight()); //设置边界
        leftTv.setCompoundDrawables(drawable, null, null, null);//画在左
    }

    protected abstract int setContentLayout();

    protected abstract void buildContentView();

    protected abstract void initViewData();

    /**
     * 设置标题名称
     *
     * @return
     */
    protected abstract String getTitleText();

    protected boolean showTitle() {
        return true;
    }

    protected boolean showLeftArrow() {
        return true;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }


    // 页面切换方法，不带参数
    public void activitySwitch(Class<?> cls) {
        Intent intent = new Intent(mContext, cls);
        startActivity(intent);
    }

    // 页面切换方法，带参数
    public void activitySwitchWithBundle(Class<?> cls, Bundle args) {
        Intent intent = new Intent(mContext, cls);
        intent.putExtras(args);
        startActivity(intent);
    }
}
