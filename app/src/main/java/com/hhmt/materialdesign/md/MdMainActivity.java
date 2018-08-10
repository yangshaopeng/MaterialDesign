package com.hhmt.materialdesign.md;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.hhmt.materialdesign.R;

public class MdMainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button recyclerBtn;
    private Button floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_md_main);

        recyclerBtn = (Button) findViewById(R.id.recycler_view);
        floatingActionButton = (Button) findViewById(R.id.float_btn);

        recyclerBtn.setOnClickListener(this);
        floatingActionButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.recycler_view:
                startActivity(new Intent(this, RecyclerViewActivity.class));
                break;
            case R.id.float_btn:
                startActivity(new Intent(this, FabActivity.class));
                break;
            default:
                break;
        }

    }
}
