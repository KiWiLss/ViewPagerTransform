package com.magicsoft.wave.activity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.andrognito.patternlockview.PatternLockView;
import com.andrognito.patternlockview.listener.PatternLockViewListener;
import com.andrognito.patternlockview.utils.PatternLockUtils;
import com.magicsoft.wave.R;

import java.util.List;

/**
 * Created by 刘少帅 on 2017/11/14
 */

public class PatternActivity extends AppCompatActivity {

    public static final String TAG = "MMM";
    private PatternLockView mPlv;
    private SharedPreferences mSpf;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pattern);

        mSpf = getSharedPreferences("pattern", MODE_PRIVATE);


        mPlv = (PatternLockView) findViewById(R.id.plv_pattern_guest);
        mPlv.setInputEnabled(false);//设置禁止输入
        mPlv.addPatternLockListener(mPatternLockViewListener);


    }

    private PatternLockViewListener mPatternLockViewListener = new PatternLockViewListener() {
        @Override
        public void onStarted() {
            Log.e(TAG, "Pattern drawing started");
        }

        @Override
        public void onProgress(List<PatternLockView.Dot> progressPattern) {
            Log.e(TAG, "Pattern progress: " +
                    PatternLockUtils.patternToString(mPlv, progressPattern));
        }

        @Override
        public void onComplete(List<PatternLockView.Dot> pattern) {
            Log.e(TAG, "Pattern complete: " +
                    PatternLockUtils.patternToString(mPlv, pattern));
            //mPlv.setViewMode(PatternLockView.PatternViewMode.AUTO_DRAW);//设置状态
            mPlv.setViewMode(PatternLockView.PatternViewMode.WRONG);
            //mPlv.setAspectRatioEnabled(true);

            //完成以后清理
//            mPlv.postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    mPlv.clearPattern();
//                }
//            }, 1000);



        }

        @Override
        public void onCleared() {
            Log.e(TAG, "Pattern has been cleared");
        }
    };
}
