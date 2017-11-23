package com.magicsoft.vector;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

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
}
