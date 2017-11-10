package com.magicsoft.customview.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by 刘少帅 on 2017/11/9
 */

public class Bobble extends View {
    public Bobble(Context context) {
        this(context,null);
    }

    public Bobble(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public Bobble(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);


    }



}
