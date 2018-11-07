package com.tinytongtong.peaklee.biz.home;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tinytongtong.peaklee.R;
import com.tinytongtong.peaklee.biz.cate.CateHomeActivity;
import com.tinytongtong.peaklee.biz.cate.TakeOutHomeActivity;
import com.tinytongtong.peaklee.utils.ToastUtils;

import java.util.List;

/**
 * @Description:
 * @Author wangjianzhou@qding.me
 * @Date 2018/9/5 4:29 PM
 * @Version v4.1.3
 */
public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.WeatherViewHolder> {

    private Context mContext;
    private List<HomeListBean> mList;

    public HomeAdapter(Context mContext, List<HomeListBean> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    @Override
    public WeatherViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.home_adatper, parent, false);
        return new WeatherViewHolder(view);
    }

    @Override
    public void onBindViewHolder(WeatherViewHolder holder, int position) {
        if (mList != null && mList.size() > position) {
            HomeListBean bean = mList.get(position);
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

        public void bindData(final HomeListBean bean) {
            if (bean != null) {
                tv.setText(bean.getTitle());
                if (!TextUtils.isEmpty(bean.getType())) {
                    tv.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            switch (bean.getType()) {
                                case "msyh":// 美食优惠
                                    CateHomeActivity.actionStart(mContext);
                                    break;
                                case "ybqd":// 易班签到
                                    ToastUtils.showSingleToast("易班签到");
                                    break;
                                case "waimai":// 外卖
                                    TakeOutHomeActivity.actionStart(mContext);
                                    break;
                                case "meishi":// 美食
                                    ToastUtils.showSingleToast("美食");
                                    break;
                                case "chaoshi":// 超市
                                    ToastUtils.showSingleToast("超市");
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
