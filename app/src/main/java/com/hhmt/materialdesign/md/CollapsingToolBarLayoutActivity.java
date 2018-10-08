package com.hhmt.materialdesign.md;

import android.graphics.Color;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.WindowManager;

import com.hhmt.materialdesign.R;

public class CollapsingToolBarLayoutActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private AppBarLayout mAppBarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collasping_tool_bar_layout);
        initView();
    }

    private void initView() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mAppBarLayout = (AppBarLayout) findViewById(R.id.appbar_layout);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        mToolbar.setPadding(mToolbar.getPaddingLeft(), mToolbar.getPaddingTop() + getStateBar(), mToolbar.getPaddingRight(), mToolbar.getPaddingBottom());
        CollapsingToolbarLayout.LayoutParams lp = (CollapsingToolbarLayout.LayoutParams) mToolbar.getLayoutParams();
        lp.height += getStateBar();
        mToolbar.setLayoutParams(lp);

        mAppBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                float rate = Math.abs(verticalOffset) * 1.0f / mAppBarLayout.getTotalScrollRange();
                Log.i("yang", "rate: " + rate);
                mToolbar.setBackgroundColor(changeAlpha(getColor(R.color.colorPrimary), rate));
            }
        });

    }

    public int changeAlpha(int color, float fraction) {
        int red = Color.red(color);
        int green = Color.green(color);
        int blue = Color.blue(color);
        int alpha = (int) (Color.alpha(color) * fraction);
        return Color.argb(alpha, red, green, blue);
    }

    private int getStateBar() {
        int result = 0;
        int resourceId = this.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = this.getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }

}
