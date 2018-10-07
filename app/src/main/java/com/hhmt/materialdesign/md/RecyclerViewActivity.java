package com.hhmt.materialdesign.md;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import com.hhmt.materialdesign.R;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity implements ScrollListener {

    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;
    private Toolbar toolbar;
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        initView();
        setListener();
    }

    private void setListener() {
        recyclerView.addOnScrollListener(new RecyclerScrollListener(this));
    }

    private void initView() {
        recyclerView = ((RecyclerView) findViewById(R.id.recycler_view));
        toolbar = ((Toolbar) findViewById(R.id.toolbar));
        imageButton = ((ImageButton) findViewById(R.id.image_btn));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecyclerAdapter(this, getData());
        recyclerView.setAdapter(adapter);

        setSupportActionBar(toolbar);
        toolbar.setTitle("RecyclerView");

    }

    private List<String> getData() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 60; i++) {
            list.add("条目" + i);
        }
        return list;
    }

    @Override
    public void onHide() {
        RelativeLayout.LayoutParams layoutParams = ((RelativeLayout.LayoutParams) imageButton.getLayoutParams());
        imageButton.animate().translationY(imageButton.getHeight() + layoutParams.bottomMargin).setInterpolator(new AccelerateInterpolator(3));
    }

    @Override
    public void onShow() {
        RelativeLayout.LayoutParams layoutParams = ((RelativeLayout.LayoutParams) imageButton.getLayoutParams());
        imageButton.animate().translationY(0).setInterpolator(new AccelerateInterpolator(3));
    }
}
