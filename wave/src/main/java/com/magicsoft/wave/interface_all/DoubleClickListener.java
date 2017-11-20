package com.magicsoft.wave.interface_all;


import android.view.View;

public abstract class DoubleClickListener implements View.OnClickListener {//点击加双击监听


    long mLastTime;

    @Override
    public void onClick(final View view) {
        long nowTime = System.currentTimeMillis();
        view.removeCallbacks(runnable);
        //第一次点击,存下时间,等待下次点击
        if ((nowTime-mLastTime)<350){//双击
            doubleListener(view);
        }else {
            view.postDelayed(runnable, 350);
        }
        mLastTime=nowTime;


    }

    Runnable runnable=new Runnable() {
        @Override
        public void run() {
            singleListener();
        }
    };

    protected abstract void singleListener();

    protected abstract void doubleListener(View view);


}
