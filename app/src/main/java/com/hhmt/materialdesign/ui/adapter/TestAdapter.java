package com.hhmt.materialdesign.ui.adapter;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hhmt.materialdesign.R;
import com.hhmt.materialdesign.ui.recycler.adapter.BaseViewHolder;
import com.hhmt.materialdesign.ui.recycler.adapter.RecyclerArrayAdapter;

import java.util.List;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * @since 2017/3/17
 */

public class TestAdapter extends RecyclerArrayAdapter<String> {

    public TestAdapter(Context context, List<String> objects) {
        super(context, objects);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new RecommendViewHolder(parent);
    }

    public class RecommendViewHolder extends BaseViewHolder<String>{

        private TextView textView;

        public RecommendViewHolder(ViewGroup itemView) {
            super(itemView, R.layout.test_recyclerview);
            textView = $(R.id.test_rv_tv);
        }

        @Override
        public void setData(String data) {
            super.setData(data);
            textView.setText(data);
        }
    }
}
