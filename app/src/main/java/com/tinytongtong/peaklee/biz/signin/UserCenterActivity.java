package com.tinytongtong.peaklee.biz.signin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.tinytongtong.peaklee.R;
import com.tinytongtong.peaklee.base.BaseActivity;
import com.tinytongtong.peaklee.utils.ToastUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import de.hdodenhof.circleimageview.CircleImageView;

public class UserCenterActivity extends BaseActivity {
    @BindView(R.id.img_avatar)
    CircleImageView imgAvatar;
    @BindView(R.id.txt_userid)
    TextView txtUserid;
    @BindView(R.id.rl_my_signin)
    RelativeLayout rlMySignin;
    @BindView(R.id.ll_setting)
    RelativeLayout llSetting;
    @BindView(R.id.rl_msg_remind)
    RelativeLayout rlMsgRemind;
    @BindView(R.id.rl_switch_account)
    RelativeLayout rlSwitchAccount;
    @BindView(R.id.rl_exit)
    RelativeLayout rlExit;

    public static void actionStart(Context context) {
        Intent starter = new Intent(context, UserCenterActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected int setContentLayout() {
        return R.layout.activity_user_center;
    }

    @Override
    protected void buildContentView() {

    }

    @Override
    protected void initViewData() {

    }

    @Override
    protected String getTitleText() {
        return "个人中心";
    }

    @OnClick({R.id.rl_my_signin, R.id.ll_setting, R.id.rl_msg_remind, R.id.rl_switch_account, R.id.rl_exit})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rl_my_signin:
                MySigninActivity.actionStart(mContext);
                break;
            case R.id.ll_setting:
                ToastUtils.showSingleToast("设置");
                break;
            case R.id.rl_msg_remind:
                ToastUtils.showSingleToast("消息提醒");
                break;
            case R.id.rl_switch_account:
                ToastUtils.showSingleToast("切换账号");
                break;
            case R.id.rl_exit:
                ToastUtils.showSingleToast("退出");
                break;
        }
    }
}
