package com.magicsoft.wave.adapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.magicsoft.wave.R;

import java.util.List;

/**
 * Created by 刘少帅 on 2017/11/15
 */

public class StatusAdapter extends BaseQuickAdapter<String,BaseViewHolder> {

    public StatusAdapter(@LayoutRes int layoutResId, @Nullable List<String> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.tv_item_status_text,item);
    }
}
