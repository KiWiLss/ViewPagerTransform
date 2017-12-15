package com.magicsoft.recycler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.magicsoft.recycler.activity.OneActivity;
import com.magicsoft.recycler.activity.TwoActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    public void one(View view) {
        startActivity(new Intent(this, OneActivity.class));
    }
    public void two(View view) {
        startActivity(new Intent(this, TwoActivity.class));
    }
}
