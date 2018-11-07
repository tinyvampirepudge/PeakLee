package com.tinytongtong.peaklee;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.widget.Toast;

import com.tinytongtong.peaklee.base.BaseActivity;
import com.tinytongtong.peaklee.biz.home.HomeAdapter;
import com.tinytongtong.peaklee.biz.home.HomeListBean;
import com.tinytongtong.peaklee.manager.ActivityCollector;
import com.tinytongtong.peaklee.mock.MockDataUtils;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends BaseActivity {

    //是否需要退出App
    private static Boolean isExit = false;
    private RecyclerView recyclerView;
    private HomeAdapter adapter;

    @Override
    protected int setContentLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void buildContentView() {
        recyclerView = findViewById(R.id.weather_preview_recyclerView);
        GridLayoutManager glm = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(glm);
        List<HomeListBean> listBeans = MockDataUtils.generateHomeList();
        adapter = new HomeAdapter(this, listBeans);
        recyclerView.setAdapter(adapter);
    }

    @Override
    protected void initViewData() {

    }

    @Override
    protected String getTitleText() {
        return "首页";
    }

    @Override
    protected boolean showLeftArrow() {
        return false;
    }

    //双击退出
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exitBy2Click();      //调用双击退出函数
        }
        return false;
    }

    private void exitBy2Click() {
        Timer tExit = null;
        if (isExit == false) {
            isExit = true; // 准备退出
            Toast.makeText(this, R.string.string_exit_app, Toast.LENGTH_SHORT).show();
            tExit = new Timer();
            tExit.schedule(new TimerTask() {
                @Override
                public void run() {
                    isExit = false; // 取消退出
                }
            }, 2000); // 如果2秒钟内没有按下返回键，则启动定时器取消掉刚才执行的任务

        } else {


            ActivityCollector.finishAll();
            android.os.Process.killProcess(android.os.Process.myPid());
        }
    }

}
