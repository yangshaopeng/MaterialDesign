package com.hhmt.materialdesign.ui.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.hhmt.materialdesign.R;
import com.hhmt.materialdesign.app.App;
import com.hhmt.materialdesign.di.annotation.LayoutResource;
import com.hhmt.materialdesign.net.response.RecommendResponse;
import com.hhmt.materialdesign.ui.activity.presenter.MainPresenter;
import com.hhmt.materialdesign.ui.activity.view.MainView;
import com.hhmt.materialdesign.ui.adapter.MainRecommendAdapter;
import com.hhmt.materialdesign.ui.mvp.BaseActivity;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

@LayoutResource(value = R.layout.activity_main)
public class MainActivity extends BaseActivity<MainView, MainPresenter> implements MainView {

    private RecyclerView recyclerView;
    private MainRecommendAdapter adapter;

    @Override
    public void initView(View view) {
        recyclerView =  view.findViewById(R.id.main_recommend_rv);
        adapter = new MainRecommendAdapter(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter);
        ((App)getApplication()).getAppComponent().provideApiService().getRecommend()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<RecommendResponse>() {
                    @Override
                    public void onCompleted() {
                        Log.i("yang", "onCompleted");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i("yang", "onError" + e.toString());
                    }

                    @Override
                    public void onNext(RecommendResponse recommendResponse) {
                        Log.i("yang", "onNext");
                        adapter.setResData(recommendResponse.getFeedList());
                        adapter.notifyDataSetChanged();
                    }
                });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*recyclerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((App)getApplication()).getAppComponent().provideApiService().getRecommend()
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Subscriber<RecommendResponse>() {
                            @Override
                            public void onCompleted() {
                                Log.i("yang", "onCompleted");
                            }

                            @Override
                            public void onError(Throwable e) {
                                Log.i("yang", "onError" + e.toString());
                            }

                            @Override
                            public void onNext(RecommendResponse recommendResponse) {
                                Log.i("yang", "onNext");
                            }
                        });
            }
        });*/
    }

    @NonNull
    @Override
    public MainPresenter createPresenter() {
        return new MainPresenter();
    }
}
