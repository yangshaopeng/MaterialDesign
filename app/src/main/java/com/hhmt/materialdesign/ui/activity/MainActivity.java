package com.hhmt.materialdesign.ui.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hhmt.materialdesign.R;

public class MainActivity extends AppCompatActivity {

    private Button recyclerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerBtn = (Button)findViewById(R.id.recycler_btn);
        recyclerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CoordinateActivity.class));
            }
        });
    }
}
