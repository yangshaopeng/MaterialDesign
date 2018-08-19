package com.hhmt.materialdesign.md;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.hhmt.materialdesign.R;

public class MdMainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button recyclerBtn;
    private Button floatingActionButton;
    private Button collaspingBtn;
    private Button snackBarBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_md_main);

        recyclerBtn = (Button) findViewById(R.id.recycler_view);
        floatingActionButton = (Button) findViewById(R.id.float_btn);
        collaspingBtn = (Button) findViewById(R.id.collasping_toolbar_layout);
        snackBarBtn = (Button) findViewById(R.id.snack_bar);

        recyclerBtn.setOnClickListener(this);
        floatingActionButton.setOnClickListener(this);
        collaspingBtn.setOnClickListener(this);
        snackBarBtn.setOnClickListener(this);
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
            case R.id.collasping_toolbar_layout:
                startActivity(new Intent(this, CollapsingToolBarLayoutActivity.class));
                break;
            case R.id.snack_bar:
                startActivity(new Intent(this, SnackBarActivity.class));
                break;
            default:
                break;
        }

    }
}
