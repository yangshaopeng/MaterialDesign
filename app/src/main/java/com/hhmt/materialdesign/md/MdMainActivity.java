package com.hhmt.materialdesign.md;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetDialog;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.hhmt.materialdesign.R;

public class MdMainActivity extends AppCompatActivity implements View.OnClickListener {

    private NavigationView navigationView;
    private Toolbar toolbar;
    private Button popupBottom;
    private Button statusBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_md_main);
        initView();
        initData();
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav_recycler_and_swipe_refresh:
                        Toast.makeText(MdMainActivity.this, "123", Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;
            }
        });


    }

    private void initView() {
        toolbar = (Toolbar)findViewById(R.id.toolbar_main);
        navigationView = (NavigationView) findViewById(R.id.navigation);
        popupBottom = (Button)findViewById(R.id.popup_bottom);
        statusBottom = (Button)findViewById(R.id.translucent_bottom);
    }

    private void initData() {
        toolbar.setTitle("MaterialDesign");
        popupBottom.setOnClickListener(this);
        statusBottom.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.popup_bottom:
                final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
                View popupBottomView = LayoutInflater.from(this).inflate(R.layout.popup_bottom_layout, null);
                bottomSheetDialog.setContentView(popupBottomView);
                Button okBtn = popupBottomView.findViewById(R.id.ok);
                Button cancelBtn = popupBottomView.findViewById(R.id.cancel);
                okBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        bottomSheetDialog.dismiss();
                    }
                });
                cancelBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        bottomSheetDialog.dismiss();
                    }
                });
                bottomSheetDialog.show();
                break;
            case R.id.translucent_bottom:
                startActivity(new Intent(this, Translucent.class));
                break;
        }
    }
}
