package com.tinytongtong.peaklee.biz.cate;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.tinytongtong.peaklee.R;

import java.util.List;

/**
 * @Description:
 * @Author wangjianzhou@qding.me
 * @Date 2018/9/5 4:29 PM
 * @Version v4.1.3
 */
public class CateListAdapter extends RecyclerView.Adapter<CateListAdapter.WeatherViewHolder> {

    private Context mContext;
    private List<CateListBean> mList;

    public CateListAdapter(Context mContext, List<CateListBean> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    @Override
    public WeatherViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.cate_list_adatper, parent, false);
        return new WeatherViewHolder(view);
    }

    @Override
    public void onBindViewHolder(WeatherViewHolder holder, int position) {
        if (mList != null && mList.size() > position) {
            CateListBean bean = mList.get(position);
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
        TextView title;
        TextView desc;
        Button check;

        public WeatherViewHolder(View itemView) {
            super(itemView);
            this.itemView = itemView;
            title = itemView.findViewById(R.id.title);
            desc = itemView.findViewById(R.id.desc);
            check = itemView.findViewById(R.id.check);
        }

        public void bindData(final CateListBean bean) {
            if (bean != null) {
                title.setText(bean.getTitle());
                desc.setText(bean.getDesc());
                check.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if ("supermarket".equals(bean.getType())) {
                            SupermarketDetailActivity.actionStart(mContext);
                        } else {
                            CateDetailActivity.actionStart(mContext);
                        }
                    }
                });
            }
        }

    }
}
