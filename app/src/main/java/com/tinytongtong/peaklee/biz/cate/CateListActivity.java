package com.tinytongtong.peaklee.biz.cate;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tinytongtong.peaklee.R;
import com.tinytongtong.peaklee.base.BaseActivity;
import com.tinytongtong.peaklee.biz.home.HomeAdapter;
import com.tinytongtong.peaklee.biz.home.HomeListBean;
import com.tinytongtong.peaklee.mock.MockDataUtils;

import java.util.List;

public class CateListActivity extends BaseActivity {

    private RecyclerView recyclerView;

    public static void actionStart(Context context) {
        Intent starter = new Intent(context, CateListActivity.class);
        context.startActivity(starter);
    }
    @Override
    protected int setContentLayout() {
        return R.layout.activity_cate_list;
    }

    @Override
    protected void buildContentView() {
        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager llm = new LinearLayoutManager(mContext);
        recyclerView.setLayoutManager(llm);
        List<CateListBean> listBeans = MockDataUtils.generateCateList();
        CateListAdapter adapter = new CateListAdapter(this, listBeans);
        recyclerView.setAdapter(adapter);
    }

    @Override
    protected void initViewData() {

    }

    @Override
    protected String getTitleText() {
        return "美食列表";
    }
}
