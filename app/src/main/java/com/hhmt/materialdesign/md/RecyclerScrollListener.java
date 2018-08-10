package com.hhmt.materialdesign.md;

import android.support.v7.widget.RecyclerView;

/**
 * author : yangshaopeng.
 * Description:.....
 * 2018/8/4 12:13
 * email : yangshaopeng_it@163.com
 */
public class RecyclerScrollListener extends RecyclerView.OnScrollListener {

    private ScrollListener mListener;

    private static final int MIN_DELTA = 20;
    private boolean isShow = true;
    private int distance = 0;

    public RecyclerScrollListener(ScrollListener listener) {
        mListener = listener;
    }

    /**
     *
     * @param recyclerView
     * @param dx
     * @param dy
     */
    @Override
    public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
        super.onScrolled(recyclerView, dx, dy);

        if (distance >= MIN_DELTA && isShow) {
            //隐藏view
            mListener.onHide();
            isShow = false;
            distance = 0;
        } else if (distance <= -MIN_DELTA && !isShow) {
            //显示
            mListener.onShow();
            isShow = true;
            distance = 0;
        } else {
            distance += dy;
        }

    }
}
