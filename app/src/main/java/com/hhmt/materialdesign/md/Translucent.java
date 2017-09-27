package com.hhmt.materialdesign.md;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hhmt.materialdesign.R;
import com.jaeger.library.StatusBarUtil;

public class Translucent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translucent);
        StatusBarUtil.setColor(this, Color.BLUE);
    }
}
