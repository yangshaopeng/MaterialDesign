package com.hhmt.materialdesign.ui.mvp;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.hannesdorfmann.mosby.mvp.MvpFragment;
import com.hannesdorfmann.mosby.mvp.MvpPresenter;
import com.hannesdorfmann.mosby.mvp.MvpView;
import com.hannesdorfmann.mosby.mvp.delegate.FragmentMvpDelegate;

/**
 * author    : yangshaopeng
 * email     : ysp@btomorrow.cn
 * date      : 2017/07/06  16:18
 * desc      : <p> </p>
 * package   : com.hhmt.common.mvp
 * project   : Market
 */

public abstract class BaseFragment<V extends MvpView, P extends MvpPresenter<V>> extends MvpFragment<V, P> {

    @NonNull
    protected FragmentMvpDelegate<V, P> getMvpDelegate() {
        return super.getMvpDelegate();
    }

    @NonNull
    @Override
    public P getPresenter() {
        return super.getPresenter();
    }


    @Override
    public void setPresenter(@NonNull P presenter) {
        super.setPresenter(presenter);
    }

    @Override
    public boolean isRetainInstance() {
        return super.isRetainInstance();
    }


    @NonNull
    @Override
    public V getMvpView() {
        return super.getMvpView();
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    public abstract void initView(View view);

    @NonNull
    @Override
    public abstract P createPresenter();

}
