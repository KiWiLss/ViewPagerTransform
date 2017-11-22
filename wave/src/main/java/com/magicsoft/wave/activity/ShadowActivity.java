package com.magicsoft.wave.activity;


import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.magicsoft.wave.App;
import com.magicsoft.wave.R;

public class ShadowActivity extends AppCompatActivity {

    public static final String TAG = "MMM";
    private View mBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shadow);

        mBtn = findViewById(R.id.btn_shadow_double);

//      mBtn.setOnClickListener(new DoubleClickListener() {
//
//          @Override
//          protected void singleListener() {
//              Log.e(TAG, "singleListener: " );
//          }
//
//          @Override
//          protected void doubleListener(View view) {
//              Log.e(TAG, "doubleListener: " );
//          }
//      });

        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doubleClick_2();
            }
        });

        Log.e(TAG, "onCreate: "+ App.isForeground);
    }

    /**
     * 在intervalTime(ms)时间内点击了clickTimes次，就执行TODO逻辑
     */
    public void clicks(long intervalTime, int clickTimes) {
        long[] mArrs = new long[clickTimes];

        //src    源数组
        //srcPos 源数组的开始拷贝位置
        //dst    目标数组
        //dstPos 目标数组的开始拷贝位置
        //length 数组的拷贝长度
        System.arraycopy(mArrs, 1, mArrs, 0, mArrs.length - 1); //拷贝数组
        mArrs[mArrs.length - 1] = SystemClock.uptimeMillis();
        if (mArrs[0] >= (SystemClock.uptimeMillis() - intervalTime)) {
            Log.d("clickEvent", "clickTimes次点击事件已发生，开始执行TODO");
            // TODO
            Log.e(TAG, "clicks: ");

        }
    }

    private long[] mHits = new long[2];
    private void doubleClick_2() {
        System.arraycopy(mHits, 1, mHits, 0, mHits.length - 1);
        mHits[mHits.length - 1] = SystemClock.uptimeMillis();//获取手机开机时间
        if (mHits[mHits.length - 1] - mHits[0] < 500) {
            /**双击的业务逻辑*/
            Log.e(TAG, "doubleClick_2: " );
        }
    }
}
