package com.magicsoft.customview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

import com.magicsoft.customview.R;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by 刘少帅 on 2017/11/9
 */

public class CustomTitleView extends View {


    public static final String TAG="MMM";
    private String mTitleText;//文本内容
    private int mTextColor;
    private int mTextSize;
    private Paint mPaint;
    private Rect mRect;


    public CustomTitleView(Context context) {
        this(context,null);
    }

    public CustomTitleView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public CustomTitleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        //获取自定义属性
        //TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.CustomTitleView);
        TypedArray ta = context.getTheme().obtainStyledAttributes(attrs, R.styleable.CustomTitleView, defStyleAttr, 0);

        String testText = ta.getString(R.styleable.CustomTitleView_titleText);
        Log.e(TAG, "CustomTitleView: "+testText );
        int indexCount = ta.getIndexCount();

        for (int i = 0; i < indexCount; i++) {

            int attr = ta.getIndex(i);

            switch (attr) {
                case R.styleable.CustomTitleView_titleText:
                    mTitleText = ta.getString(attr);
                    break;
                case R.styleable.CustomTitleView_titleTextColor:
                    mTextColor = ta.getColor(attr, Color.RED);//默认红色
                    break;
                case R.styleable.CustomTitleView_titleTextSize:
                    // 默认设置为16sp，TypeValue也可以把sp转化为px
                    mTextSize = ta.getDimensionPixelOffset(attr, (int) TypedValue.applyDimension(
                            TypedValue.COMPLEX_UNIT_SP, 16, getResources().getDisplayMetrics()));
                    break;
                default:
                    break;
            }

        }
        ta.recycle();
        /**
         * 获得绘制文本的宽和高
         */
        mPaint = new Paint();
        mPaint.setTextSize(mTextSize);

        mRect = new Rect();
        mPaint.getTextBounds(mTitleText,0,mTitleText.length(),mRect);


        this.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                mTitleText = randomText();
                postInvalidate();//重绘
            }
        });
    }

    private String randomText()
    {
        Random random = new Random();
        Set<Integer> set = new HashSet<Integer>();
        while (set.size() < 4)
        {
            int randomInt = random.nextInt(10);
            set.add(randomInt);
        }
        StringBuffer sb = new StringBuffer();
        for (Integer i : set)
        {
            sb.append("" + i);
        }
        return sb.toString();
    }

    /**
     *下面的三个方法按先后顺序执行
     */

    /**
     * 当空间的宽高都设置为wrap_content,需要自己测量控制宽高
     * MeasureSpec的specMode,一共三种类型：
     EXACTLY：一般是设置了明确的值或者是MATCH_PARENT
     AT_MOST：表示子布局限制在一个最大值内，一般为WARP_CONTENT
     UNSPECIFIED：表示子布局想要多大就多大，很少使用
     * @param widthMeasureSpec
     * @param heightMeasureSpec
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.e(TAG, "onMeasure: "+getWidth()+"|||"+getHeight()+"||"+getMeasuredHeight()+"||"+getMeasuredWidth() );

        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);

        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);

        Log.e(TAG, "onMeasure: ****"+widthMode+"||"+widthSize );
        Log.e(TAG, "onMeasure: *******"+heightMode+"||"+heightSize );
        int width,height;

        if (widthMode==MeasureSpec.EXACTLY){//match_parent,或是明确的值
            width=widthSize;
        }else {//wrap_content
            mPaint.setTextSize(mTextSize);

            mPaint.getTextBounds(mTitleText,0,mTitleText.length(),mRect);

            int textWidth = mRect.width();

            int desired =  (getPaddingLeft() + textWidth + getPaddingRight());

            width = desired;
        }

        if (heightMode == MeasureSpec.EXACTLY)
        {
            height = heightSize;
        } else
        {
            mPaint.setTextSize(mTextSize);
            mPaint.getTextBounds(mTitleText, 0, mTitleText.length(), mRect);
            float textHeight = mRect.height();
            int desired = (int) (getPaddingTop() + textHeight + getPaddingBottom());
            height = desired;
        }

        setMeasuredDimension(width, height);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);

        Log.e(TAG, "onLayout: "+getWidth()+"|||"+getHeight()+"||"+getMeasuredHeight()+"||"+getMeasuredWidth() );
    }

    @Override
    protected void onDraw(Canvas canvas) {
        //super.onDraw(canvas);

        mPaint.setColor(Color.RED);

        canvas.drawRect(0,0,getMeasuredWidth(),getMeasuredHeight(),mPaint);

        mPaint.setColor(mTextColor);

        canvas.drawText(mTitleText, getWidth() / 2 - mRect.width() / 2, getHeight() / 2 + mRect.height() / 2, mPaint);

        Log.e(TAG, "onDraw: "+getWidth()+"|||"+getHeight()+"||"+getMeasuredHeight()+"||"+getMeasuredWidth() );
    }


}
