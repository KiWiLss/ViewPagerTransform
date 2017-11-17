package com.magicsoft.wave.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * @author winding
 * @project ViewPagerTransform
 * @QQ 1771050446
 * @time 2017/11/17 17:49
 * @description button
 * @change
 */


public class MyButton extends Button {

    public static final String TAG = "MMM";

    public MyButton(Context context) {
        this(context,null);
    }

    public MyButton(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.e(TAG, "button-----dispatchTouchEvent: "+event.getAction());
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(TAG, "button----onTouchEvent: "+event.getAction() );
        return super.onTouchEvent(event);
    }
}
