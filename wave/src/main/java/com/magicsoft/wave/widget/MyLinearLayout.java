package com.magicsoft.wave.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * @author winding
 * @project ViewPagerTransform
 * @QQ 1771050446
 * @time 2017/11/17 17:25
 * @description test
 * @change
 */


public class MyLinearLayout extends LinearLayout {
    public static final String TAG = "MMM";
    private boolean isCan=false;
    public MyLinearLayout(Context context) {
        this(context,null);
    }

    public MyLinearLayout(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MyLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e(TAG, "viewgroup---dispatchTouchEvent: "+ev.getAction());
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptHoverEvent(MotionEvent event) {
        Log.e(TAG, "viewgroup---onInterceptHoverEvent: "+event.getAction() );
        return super.onInterceptHoverEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(TAG, "viewgroup---onTouchEvent: "+event.getAction() );
        return super.onTouchEvent(event);
    }
}
