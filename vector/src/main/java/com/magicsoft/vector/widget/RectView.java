package com.magicsoft.vector.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: RectView.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/12/1 15:32
 * @Changes (from 2017/12/1)
 * -----------------------------------------------------------------
 * 2017/12/1 : Create RectView.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public class RectView extends View {
    private int width;
    private int height;

    public RectView(Context context) {
        this(context,null);
    }

    public RectView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public RectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        //获取屏幕的宽高
        //Android绘图机制（一）——自定义View的基础属性和方法里面有讲
        WindowManager wm = (WindowManager) getContext()
                .getSystemService(Context.WINDOW_SERVICE);

        width = wm.getDefaultDisplay().getWidth();
        height = wm.getDefaultDisplay().getHeight();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);




    }
}
