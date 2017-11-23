package com.magicsoft.vector;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.ImageView;

import com.magicsoft.vector.activity.BottomBehaviorActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void imageAnim(View view) {
        ImageView imageView=(ImageView)view;
        Drawable drawableColor = imageView.getDrawable();
        if (drawableColor instanceof Animatable) {
            ((Animatable) drawableColor).start();
        }
    }

    public void cpuStart(View view) {
        ImageView imageView=(ImageView)view;
        Drawable drawableColor = imageView.getDrawable();
        if (drawableColor instanceof Animatable) {
            ((Animatable) drawableColor).start();
        }
    }

    public void dayListener(View view) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        recreate();
    }

    public void nightListener(View view) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        recreate();
    }

    public void jumpListener(View view) {
        startActivity(new Intent(this, BottomBehaviorActivity.class));
    }
}
