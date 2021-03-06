package com.inner.lovetao.search.viewholder;

/*
 *
 *
 * 作 者 :YangFan
 *
 * 版 本 :1.0
 *
 * 创建日期 :2019/1/14      17:58
 *
 * 描 述 :
 *
 * 修订日期 :
 */

import android.view.View;
import android.widget.TextView;

import com.inner.lovetao.R;
import com.inner.lovetao.search.bean.SearchHotItemBean;
import com.jess.arms.base.BaseHolder;

import androidx.annotation.NonNull;
import butterknife.BindView;

public class SearchHotViewHolder extends BaseHolder<SearchHotItemBean> {

    @BindView(R.id.item_hot_tv)
    TextView mTvDesc;

    public SearchHotViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void setData(@NonNull SearchHotItemBean data, int position) {
        mTvDesc.setText(data.getDesc());
    }
}
