package com.hhmt.materialdesign.md;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hhmt.materialdesign.R;

import java.util.List;

/**
 * author : yangshaopeng.
 * Description:.....
 * 2018/8/4 12:16
 * email : yangshaopeng_it@163.com
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<String> mDataList;
    private Context mContext;

    public RecyclerAdapter(Context context, List<String> dataList) {
        mContext = context;
        mDataList = dataList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RecyclerViewHolder(LayoutInflater.from(mContext).inflate(R.layout.recycler_item, null, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof RecyclerViewHolder) {
            ((RecyclerViewHolder) holder).itemTv.setText(mDataList.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return mDataList == null ? 0 : mDataList.size();
    }

    class RecyclerViewHolder extends RecyclerView.ViewHolder {

        private TextView itemTv;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            itemTv = ((TextView) itemView.findViewById(R.id.item_tv));
        }

    }

}
