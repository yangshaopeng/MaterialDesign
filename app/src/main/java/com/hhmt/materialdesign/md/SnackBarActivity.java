package com.hhmt.materialdesign.md;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.hhmt.materialdesign.R;

public class SnackBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_bar);
    }

    public void snackBarClick(View view) {
        /**
         *
         */
        Snackbar snackbar = Snackbar.make(view, "买买买", Snackbar.LENGTH_INDEFINITE);
        snackbar.setAction("gggggg", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SnackBarActivity.this, "aaa", Toast.LENGTH_SHORT).show();
            }
        });

        snackbar.addCallback(new Snackbar.Callback(){

            @Override
            public void onShown(Snackbar sb) {
                super.onShown(sb);
            }

            @Override
            public void onDismissed(Snackbar transientBottomBar, int event) {
                super.onDismissed(transientBottomBar, event);
            }
        });

        snackbar.show();

    }

}
