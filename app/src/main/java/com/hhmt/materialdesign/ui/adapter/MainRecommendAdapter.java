package com.hhmt.materialdesign.ui.adapter;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.hhmt.materialdesign.R;
import com.hhmt.materialdesign.net.response.RecommendResponse;
import com.hhmt.materialdesign.ui.recycler.adapter.BaseViewHolder;
import com.hhmt.materialdesign.ui.recycler.adapter.RecyclerArrayAdapter;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * author    : yangshaopeng
 * email     : ysp@btomorrow.cn
 * date      : 2017/09/21  20:14
 * desc      : <p> </p>
 * package   : com.hhmt.materialdesign.ui.adapter
 * project   : MaterialDesign
 */

public class MainRecommendAdapter extends RecyclerArrayAdapter<RecommendResponse.FeedListBean> {

    public MainRecommendAdapter(Context context){
        super(context);
    }

    public MainRecommendAdapter(Context context, List<RecommendResponse.FeedListBean> objects) {
        super(context, objects);
    }

    public void setResData(List<RecommendResponse.FeedListBean> objects) {
        mObjects = objects;
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new MainRecommendViewHolder(parent);
    }

    class MainRecommendViewHolder extends BaseViewHolder<RecommendResponse.FeedListBean> {

        CircleImageView avator;
        TextView title;
        ImageView showIv;

        public MainRecommendViewHolder(ViewGroup viewGroup) {
            super(viewGroup, R.layout.main_recommend_item);
            avator = $(R.id.avatar);
            title = $(R.id.title);
            showIv = $(R.id.image);
        }

        @Override
        public void setData(RecommendResponse.FeedListBean data) {
            super.setData(data);
            Glide.with(mContext).load(data.getUrl()).into(avator);
            title.setText(data.getTitle());
            Glide.with(mContext).load("https://photo.tuchong.com/"
                    +data.getImages().get(0).getUser_id()
                    +"/f/"+data.getImages().get(0).getImg_id()+".jpg").into(showIv);
        }
    }

}
