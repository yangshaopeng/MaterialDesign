package com.hhmt.materialdesign.ui.mvp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;

import com.hannesdorfmann.mosby.mvp.MvpActivity;
import com.hannesdorfmann.mosby.mvp.MvpPresenter;
import com.hannesdorfmann.mosby.mvp.MvpView;
import com.hannesdorfmann.mosby.mvp.delegate.ActivityMvpDelegate;
import com.hhmt.materialdesign.di.annotation.LayoutResource;

/**
 * author    : yangshaopeng
 * email     : ysp@btomorrow.cn
 * date      : 2017/09/21  15:56
 * desc      : <p> </p>
 * package   : com.hhmt.materialdesign.ui.mvp
 * project   : MaterialDesign
 */

public abstract class BaseActivity<V extends MvpView, P extends MvpPresenter<V>> extends MvpActivity<V, P> {


    protected Toolbar toolbar;
    private View view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initLayout();
        initView(view);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }



    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
    }


    @NonNull
    protected ActivityMvpDelegate<V, P> getMvpDelegate() {
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

    @NonNull
    @Override
    public V getMvpView() {
        return super.getMvpView();
    }

    @Override
    public boolean isRetainInstance() {
        return super.isRetainInstance();
    }

    @Override
    public boolean shouldInstanceBeRetained() {
        return super.shouldInstanceBeRetained();
    }

    @Override
    public void setRetainInstance(boolean retainInstance) {
        super.setRetainInstance(retainInstance);
    }

    @NonNull
    @Override
    public abstract P createPresenter();

    @Override
    public Object onRetainNonMosbyCustomNonConfigurationInstance() {
        return super.onRetainNonMosbyCustomNonConfigurationInstance();
    }

    public void initLayout() {
        LayoutResource layoutResource = getClass().getAnnotation(LayoutResource.class);
        view = LayoutInflater.from(this).inflate(layoutResource.value(), null, false);
        setContentView(view);
        if (view != null && getToolbarId() != 0) {
            toolbar = (Toolbar) view.findViewById(getToolbarId());
            toolbar.setTitle("");
            setSupportActionBar(toolbar);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }
    }

    public int getToolbarId() {
        return 0;
    }

    public abstract void initView(View view);

}
