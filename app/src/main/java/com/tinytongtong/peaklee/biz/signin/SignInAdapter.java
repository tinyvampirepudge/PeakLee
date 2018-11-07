package com.tinytongtong.peaklee.biz.signin;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tinytongtong.peaklee.R;
import com.tinytongtong.peaklee.biz.cate.CateHomeActivity;
import com.tinytongtong.peaklee.biz.cate.CateListActivity;
import com.tinytongtong.peaklee.biz.cate.SupermarketListActivity;
import com.tinytongtong.peaklee.biz.cate.TakeOutHomeActivity;
import com.tinytongtong.peaklee.biz.home.HomeListBean;
import com.tinytongtong.peaklee.utils.ToastUtils;

import java.util.List;

/**
 * @Description:
 * @Author wangjianzhou@qding.me
 * @Date 2018/9/5 4:29 PM
 * @Version v4.1.3
 */
public class SignInAdapter extends RecyclerView.Adapter<SignInAdapter.WeatherViewHolder> {

    private Context mContext;
    private List<SignInBean> mList;

    public SignInAdapter(Context mContext, List<SignInBean> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    @Override
    public WeatherViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.sign_in_adatper, parent, false);
        return new WeatherViewHolder(view);
    }

    @Override
    public void onBindViewHolder(WeatherViewHolder holder, int position) {
        if (mList != null && mList.size() > position) {
            SignInBean bean = mList.get(position);
            if (holder != null && bean != null) {
                holder.bindData(bean);
            }
        }

    }

    @Override
    public int getItemCount() {
        return mList != null ? mList.size() : 0;
    }

    class WeatherViewHolder extends RecyclerView.ViewHolder {
        private View itemView;
        TextView tv;

        public WeatherViewHolder(View itemView) {
            super(itemView);
            this.itemView = itemView;
            tv = itemView.findViewById(R.id.tv);
        }

        public void bindData(final SignInBean bean) {
            if (bean != null) {
                tv.setText(bean.getTitle());
                if (!TextUtils.isEmpty(bean.getType())) {
                    tv.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            switch (bean.getType()) {
                                case "skqd":// 上课签到
                                    SchoolTimeSingInActivity.actionStart(mContext);
                                    break;
                                case "dkqd":// 打卡签到
                                    ToastUtils.showSingleToast("打卡签到");
                                    break;
                                case "fqqd":// 发起签到
                                    ToastUtils.showSingleToast("发起签到");
                                    break;
                                case "wdwz":// 我的位置
                                    ToastUtils.showSingleToast("我的位置");
                                    break;
                                case "grzx":// 个人中心
                                    UserCenterActivity.actionStart(mContext);
                                    break;
                                default:
                                    break;
                            }
                        }
                    });
                }
            }
        }

    }
}
