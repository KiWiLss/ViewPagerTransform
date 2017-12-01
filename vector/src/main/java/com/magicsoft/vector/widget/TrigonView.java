package com.magicsoft.vector.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.magicsoft.vector.R;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: TrigonView.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/12/1 16:03
 * @Changes (from 2017/12/1)
 * -----------------------------------------------------------------
 * 2017/12/1 : Create TrigonView.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public class TrigonView extends View {
    public TrigonView(Context context) {
        this(context,null);
    }

    public TrigonView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public TrigonView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setColor(Color.YELLOW);

   /**绘制三角形
     //实例化路径
        Path path = new Path();
        path.moveTo(0,0);//路径起点

        path.lineTo(getWidth(),0);
        path.lineTo(getWidth(),getHeight());
        //path.lineTo(0,getHeight());
        path.close();//让这些点构成封闭多边形

        canvas.drawPath(path,paint);*/

    /**
      //绘制扇形
        RectF rectF = new RectF(0, 0, getWidth(), getHeight());
        //canvas.drawRect(rectF,paint);//绘制矩形
        canvas.drawArc(rectF,135,90,true,paint);//第三个参数,圆心是否和圆弧连接*/

       /**画椭圆
        RectF rectF = new RectF(0, 0, getWidth(), getHeight());
        //rectF.set();
        canvas.drawOval(0,0,getWidth()/2,getHeight()/3,paint);*/

       paint.reset();
       //设置空心
        paint.setStyle(Paint.Style.STROKE);
        Path path = new Path();
        path.moveTo(0,0);//起点
        path.quadTo(0,getHeight(),getWidth(),getHeight());//路径和终点
        canvas.drawPath(path,paint);
        //画文本
        paint.setTextSize(40f);
        canvas.drawText("文本",50,50,paint);
        //画图片
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
        canvas.drawBitmap(bitmap,getWidth()/2,getHeight()/2,paint);
        //划线
        canvas.drawLine(0,getHeight()-5,getWidth(),getHeight()-5,paint);
        paint.setStyle(Paint.Style.FILL);
        //画圆角
        canvas.drawRoundRect(20,20,200,200,10,10,paint);
    }
}
