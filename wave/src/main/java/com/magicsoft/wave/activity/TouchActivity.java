package com.magicsoft.wave.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;

import com.magicsoft.wave.R;
import com.magicsoft.wave.utils.TypeConversionUtils;
import com.magicsoft.wave.widget.MyButton;
import com.magicsoft.wave.widget.MyLinearLayout;

import java.util.List;

/**
 * @author winding
 * @project ViewPagerTransform
 * @QQ 1771050446
 * @time 2017/11/17 16:57
 * @description 事件
 * @change
 */


public class TouchActivity extends AppCompatActivity {

    public static final String TAG = "MMM";
    private MyButton mBtn;
    private MyLinearLayout mLl;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_touch);

        mBtn = (MyButton) findViewById(R.id.btn_touch);
        mLl = (MyLinearLayout) findViewById(R.id.ll_touch);


        String key = getIntent().getStringExtra("key");
        Log.e(TAG, "onCreate: "+key );

        List<String> list = (List<String>) TypeConversionUtils.getObjectFromString(key);

        Log.e(TAG, "onCreate: "+list.get(0).toString());
        //mLl.setCan(false);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e(TAG, "activity--dispatchTouchEvent: "+ev.getAction() );
        return super.dispatchTouchEvent(ev);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(TAG, "activity--onTouchEvent: "+event.getAction() );

//        switch (event.getAction()) {
//            case MotionEvent.ACTION_DOWN:
//                break;
//        }
        return super.onTouchEvent(event);
    }


}
