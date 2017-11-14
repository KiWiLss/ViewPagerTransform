package com.magicsoft.wave.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ScrollView;

public class OverScrollView extends ScrollView {
 
 
    //要操作的布局
    private View innerView;
    private float y;
    private Rect normal = new Rect();
    private Rect normal1 = new Rect();
    private boolean animationFinish = true;
 
    public OverScrollView(Context context) {
        super(context, null);
    }
 
    public OverScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
 
    public OverScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
 
 
    @Override
    protected void onFinishInflate() {
        int childCount = getChildCount();
        if (childCount > 0) {
            innerView = getChildAt(0);
 
        }
    }
 
    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        if (innerView == null) {
            return super.onTouchEvent(ev);
        } else {
            commonTouchEvent(ev);
        }
        return super.onTouchEvent(ev);
    }
 
    private float downY;
    private int isUpDetermine = -1;
 
    /**
     * 自定义touch事件处理
     *
     * @param ev
     */
    private void commonTouchEvent(MotionEvent ev) {
        if (animationFinish) {
            int action = ev.getAction();
            switch (action) {
                case MotionEvent.ACTION_DOWN:
                    y = ev.getY();
                    downY = y;
                    break;
                case MotionEvent.ACTION_MOVE:
                    float preY = y == 0 ? ev.getY() : y;
                    float nowY = ev.getY();
                    int detailY = (int) (preY - nowY);
                    int isUp = 0;  //0为向下滑
                    if (nowY - y <= 0) {
                        isUp = 1;
                    }
 
                    Log.e("zoubo", "innerView.getTop():" + innerView.getTop()
                            + "----innerView.getTop() - detailY:" + (innerView.getTop() - detailY / 4)
                            + "---- detailY:" + detailY
                            + "----innerView.getBottom() - detailY:" + (innerView.getBottom() - detailY / 4)
                            + "----innerView.getBottom():" + innerView.getBottom() + "------------isup====" + (isUp == 0 ? "下滑" : "上滑"));
 
//                    if (isUpDetermine != -1) {
//                        if (isUpDetermine != isUp) {
//                            if (innerView.getTop() > 0 || innerView.getBottom() < getHeight()) {
//                                if (isUp == 0) {
//                                    Log.e("come", "1");
//                                    animation();
//                                } else {
//                                    Log.e("come", "2");
//                                    animation();
//                                }
//                            }
//                        }
//                    }
//                    isUpDetermine = isUp;
 
                    y = nowY;
                    //操作view进行拖动detailY的一半
                    if (isNeedMove()) {
                        //布局改变位置之前，记录一下正常状态的位置
                        if (normal.isEmpty()) {
                            normal.set(innerView.getLeft(), innerView.getTop(), innerView.getRight(), innerView.getBottom());
                        }
 
                        innerView.layout(innerView.getLeft(), innerView.getTop() - detailY / 4, innerView.getRight(), innerView.getBottom() - detailY / 4);
 
                        normal1.set(innerView.getLeft(), innerView.getTop(), innerView.getRight(), innerView.getBottom());
 
                    }
                    break;
                case MotionEvent.ACTION_UP:
                    y = 0;
                    //布局回滚到原来的位置
                    if (isNeedAnimation()) {
                        animation();
                    }
                    break;
            }
        }
    }
 
 
    private void animation() {
        TranslateAnimation ta = new TranslateAnimation(0, 0, 0, normal.top - innerView.getTop());
        ta.setDuration(150);
        ta.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                animationFinish = false;
            }
 
            @Override
            public void onAnimationEnd(Animation animation) {
 
                innerView.clearAnimation();
                innerView.layout(normal.left, normal.top, normal.right, normal.bottom);
                normal.setEmpty();
                animationFinish = true;
            }
 
            @Override
            public void onAnimationRepeat(Animation animation) {
 
            }
        });
        innerView.startAnimation(ta);
    }
 
    /**
     * 判断是否需要回滚
     *
     * @return
     */
    private boolean isNeedAnimation() {
        return !normal.isEmpty();
    }
 
    /**
     * 判断是否需要移动
     *
     * @return
     */
    private boolean isNeedMove() {
        int offset = innerView.getMeasuredHeight() - getHeight();
        int scrollY = getScrollY();
        Log.e("zoubo", "getMeasuredHeight:" + innerView.getMeasuredHeight() + "----getHeight:" + getHeight());
        Log.e("zoubo", "offset:" + offset + "----scrollY:" + scrollY);
        if (scrollY == 0 || scrollY == offset) {
            return true;
        }
        return false;
    }
 
}