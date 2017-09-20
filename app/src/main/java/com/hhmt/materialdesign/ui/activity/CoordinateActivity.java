package com.hhmt.materialdesign.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.hhmt.materialdesign.R;

public class CoordinateActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinate);
        recyclerView = (RecyclerView)findViewById(R.id.coordinate_rv);

    }
}
