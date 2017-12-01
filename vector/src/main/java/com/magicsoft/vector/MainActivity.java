package com.magicsoft.vector;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;

import com.magicsoft.vector.activity.AutoActivity1;
import com.magicsoft.vector.activity.BottomBehaviorActivity;
import com.magicsoft.vector.activity.CustomActivity;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MMM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewConfiguration viewConfiguration = ViewConfiguration.get(this);

        //双击间隔时间.在该时间内是双击，否则是单击
        int doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout();
        Log.e(TAG, "onCreate: " + doubleTapTimeout);
        //判断是否有物理按键
        boolean isHavePermanentMenuKey = viewConfiguration.hasPermanentMenuKey();
        Log.e(TAG, "onCreate: "+isHavePermanentMenuKey );

        GestureDetector gestureDetector = new GestureDetector(this,new
                GestureListenerImpl());


    }
    GestureDetector gestureDetector;
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return gestureDetector.onTouchEvent(event);
    }



    private class GestureListenerImpl implements GestureDetector.OnGestureListener {
        //触摸屏幕时均会调用该方法
        @Override
        public boolean onDown(MotionEvent e) {
            Log.e(TAG, "onDown: ---> 手势中的onDown方法");
            return false;
        }

        //手指在屏幕上拖动时会调用该方法
        @Override
        public boolean onFling(MotionEvent e1,MotionEvent e2, float velocityX,float velocityY) {
            Log.e(TAG, "onFling: ---> 手势中的onFling方法" );
            return false;
        }

        //手指长按屏幕时均会调用该方法
        @Override
        public void onLongPress(MotionEvent e) {
            Log.e(TAG, "onLongPress: ---> 手势中的onLongPress方法" );
        }

        //手指在屏幕上滚动时会调用该方法
        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            Log.e(TAG, "onScroll: ---> 手势中的onScroll方法" );
            return false;
        }

        //手指在屏幕上按下,且未移动和松开时调用该方法
        @Override
        public void onShowPress(MotionEvent e) {
            Log.e(TAG, "onShowPress: ---> 手势中的onShowPress方法" );
        }

        //轻击屏幕时调用该方法
        @Override
        public boolean onSingleTapUp(MotionEvent e) {
            Log.e(TAG, "onSingleTapUp: ---> 手势中的onSingleTapUp方法" );
            return false;
        }
    }

    public void imageAnim(View view) {
        ImageView imageView = (ImageView) view;
        Drawable drawableColor = imageView.getDrawable();
        if (drawableColor instanceof Animatable) {
            ((Animatable) drawableColor).start();
        }
    }

    public void cpuStart(View view) {
        ImageView imageView = (ImageView) view;
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

    public void percentListener(View view) {
        startActivity(new Intent(this, AutoActivity1.class));
    }

    public void customListener(View view) {
        startActivity(new Intent(this, CustomActivity.class));
    }
}
