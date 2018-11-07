package com.tinytongtong.peaklee.biz.signin;

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

public class SignInHomeActivity extends BaseActivity {

    public static void actionStart(Context context) {
        Intent starter = new Intent(context, SignInHomeActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected int setContentLayout() {
        return R.layout.activity_sign_in_home;
    }

    @Override
    protected void buildContentView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        GridLayoutManager glm = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(glm);
        List<SignInBean> listBeans = MockDataUtils.generateSignInList();
        SignInAdapter adapter = new SignInAdapter(this, listBeans);
        recyclerView.setAdapter(adapter);
    }

    @Override
    protected void initViewData() {

    }

    @Override
    protected String getTitleText() {
        return "易班签到";
    }
}
