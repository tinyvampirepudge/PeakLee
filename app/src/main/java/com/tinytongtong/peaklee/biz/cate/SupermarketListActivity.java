package com.tinytongtong.peaklee.biz.cate;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tinytongtong.peaklee.R;
import com.tinytongtong.peaklee.base.BaseActivity;
import com.tinytongtong.peaklee.mock.MockDataUtils;

import java.util.List;

public class SupermarketListActivity extends BaseActivity {

    private RecyclerView recyclerView;

    public static void actionStart(Context context) {
        Intent starter = new Intent(context, SupermarketListActivity.class);
        context.startActivity(starter);
    }
    @Override
    protected int setContentLayout() {
        return R.layout.activity_supermarket_list;
    }

    @Override
    protected void buildContentView() {
        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager llm = new LinearLayoutManager(mContext);
        recyclerView.setLayoutManager(llm);
        List<CateListBean> listBeans = MockDataUtils.generateSupermarketList();
        CateListAdapter adapter = new CateListAdapter(this, listBeans);
        recyclerView.setAdapter(adapter);
    }

    @Override
    protected void initViewData() {

    }

    @Override
    protected String getTitleText() {
        return "超市";
    }
}
