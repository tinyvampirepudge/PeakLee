package com.tinytongtong.peaklee.biz.cate;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tinytongtong.peaklee.R;
import com.tinytongtong.peaklee.base.BaseActivity;
import com.tinytongtong.peaklee.biz.home.HomeAdapter;
import com.tinytongtong.peaklee.biz.home.HomeListBean;
import com.tinytongtong.peaklee.mock.MockDataUtils;

import java.util.List;

public class CateHomeActivity extends BaseActivity {

    private RecyclerView recyclerView;
    private HomeAdapter adapter;

    public static void actionStart(Context context) {
        Intent starter = new Intent(context, CateHomeActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected int setContentLayout() {
        return R.layout.activity_cate_home;
    }

    @Override
    protected void buildContentView() {
        recyclerView = findViewById(R.id.recyclerView);
        GridLayoutManager glm = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(glm);
        List<HomeListBean> listBeans = MockDataUtils.generateCateHomeList();
        adapter = new HomeAdapter(this, listBeans);
        recyclerView.setAdapter(adapter);
    }

    @Override
    protected void initViewData() {

    }

    @Override
    protected String getTitleText() {
        return "美食优惠";
    }
}
