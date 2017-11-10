package com.magicsoft.customview.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import static com.magicsoft.customview.widget.CustomTitleView.TAG;

/**
 * Created by 刘少帅 on 2017/11/9
 */

public class MyView extends View {
    public MyView(Context context) {
        this(context,null);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

         int w,h;

        int width = getMySize(100, widthMeasureSpec);
        int height = getMySize(100, heightMeasureSpec);
        Log.e(TAG, "onMeasure: "+width+"|||"+height );
        if (width < height) {
            height = width;
        } else {
            width = height;
        }
        w=width;
        h=height;
        Log.e(TAG, "onMeasure:``````````````"+width+"|||"+height+"|||"+w+"||"+h );
        setMeasuredDimension(w, h);


    }

    public int getMySize(int defaultSize,int measeureSpec){
        int mySize=defaultSize;

        int mode = MeasureSpec.getMode(measeureSpec);
        int size = MeasureSpec.getSize(measeureSpec);

        switch (mode) {
            case MeasureSpec.AT_MOST://当前尺寸是当前View能取的最大尺寸
                //我们将大小取最大值,你也可以取其他值
                mySize = size;
                break;
            case MeasureSpec.EXACTLY://确切地
                mySize=size;
                break;
            case MeasureSpec.UNSPECIFIED://当前尺寸是当前View能取的最大尺寸
                //如果没有指定大小，就设置为默认大小
                mySize = defaultSize;
                break;
        }
        return mySize;
    }

}
