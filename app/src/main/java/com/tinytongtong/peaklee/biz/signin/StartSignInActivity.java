package com.tinytongtong.peaklee.biz.signin;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tinytongtong.peaklee.R;
import com.tinytongtong.peaklee.base.BaseActivity;
import com.tinytongtong.peaklee.mock.MockDataUtils;

import java.util.List;

public class StartSignInActivity extends BaseActivity {
    public static void actionStart(Context context) {
        Intent starter = new Intent(context, StartSignInActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected int setContentLayout() {
        return R.layout.activity_start_sign_in;
    }

    @Override
    protected void buildContentView() {
        RecyclerView recyclerViewStart = findViewById(R.id.recyclerView_start);
        recyclerViewStart.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerViewStart.setAdapter(new SignInAdapter(this, MockDataUtils.generateStartSignInList()));

        RecyclerView recyclerViewEntered = findViewById(R.id.recyclerView_entered);
        recyclerViewEntered.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerViewEntered.setAdapter(new SignInAdapter(this, MockDataUtils.generateEnteredSignInList()));
    }

    @Override
    protected void initViewData() {

    }

    @Override
    protected String getTitleText() {
        return "发起签到";
    }
}
