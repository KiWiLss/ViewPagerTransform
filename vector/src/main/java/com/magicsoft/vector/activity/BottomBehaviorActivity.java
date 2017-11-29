package com.magicsoft.vector.activity;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.magicsoft.vector.R;

public class BottomBehaviorActivity extends AppCompatActivity {

    public static final String TAG = "MMM";
    private LinearLayout mlinearlayout;
    BottomSheetBehavior behavior;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_behavior);

        mlinearlayout = (LinearLayout) findViewById(R.id.mlinearlayout);

    behavior = BottomSheetBehavior.from(mlinearlayout);
        behavior.setState(BottomSheetBehavior.STATE_HIDDEN);

        mlinearlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                behavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
            }
        });

        behavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(View bottomSheet, int newState) {
                Log.e(TAG, "onStateChanged: "+bottomSheet+"||"+newState );
            }
            @Override
            public void onSlide(View bottomSheet, float slideOffset) {
                Log.e(TAG, "onSlide: "+bottomSheet+"||"+slideOffset );
            }
        });


    }

    public void showBottom(View view) {
        behavior.setState(BottomSheetBehavior.STATE_EXPANDED);
    }

    public void showDialog(View view) {


        final BottomSheetDialog dialog = new BottomSheetDialog(this);
        View pwView = LayoutInflater.from(this).inflate(R.layout.bottomdialog_layout, null);
        LinearLayout linearLayout = (LinearLayout)pwView.findViewById(R.id.dialog_layout);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BottomBehaviorActivity.this, "click", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(BottomBehaviorActivity.this,VectorActivity.class));
            }
        });
        dialog.setContentView(pwView);
        dialog.show();
    }
}
