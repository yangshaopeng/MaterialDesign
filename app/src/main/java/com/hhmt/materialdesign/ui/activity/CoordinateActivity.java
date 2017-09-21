package com.hhmt.materialdesign.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.hhmt.materialdesign.R;
import com.hhmt.materialdesign.ui.recycler.adapter.RecyclerArrayAdapter;
import com.hhmt.materialdesign.ui.adapter.TestAdapter;

import java.util.ArrayList;
import java.util.List;

public class CoordinateActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<String> mData;
    private TestAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinate);
        recyclerView = (RecyclerView)findViewById(R.id.coordinate_rv);
        adapter = new TestAdapter(this, getData());
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(new RecyclerArrayAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(CoordinateActivity.this, position+"", Toast.LENGTH_SHORT).show();
                adapter.remove(position);
            }
        });
    }

    private List<String> getData() {
        mData = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            mData.add("Test" + i);
        }
        return mData;
    }

}
