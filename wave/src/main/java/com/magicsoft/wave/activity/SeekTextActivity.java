package com.magicsoft.wave.activity;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

import com.magicsoft.wave.R;

/**
 * Created by 刘少帅 on 2017/11/14
 */

public class SeekTextActivity extends AppCompatActivity {
    private TextView tv_quota;
    private SeekBar sb_quota;
    private int quota;
    private ProgressBar mPb;
    private float scrollDistance;
    private int width;
    private int tvWidth;
    private float currentPosition;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_text);



        tv_quota = (TextView) findViewById(R.id.tv_quota);
        sb_quota = (SeekBar) findViewById(R.id.sb_quota);

        mPb = (ProgressBar) findViewById(R.id.pb_pb);


        sb_quota.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tv_quota.setText("¥" + progress);
                quota = progress;
                int spec = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
                tv_quota.measure(spec, spec);
                int quotaWidth = tv_quota.getMeasuredWidth();

                int spec2 = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
                tv_quota.measure(spec2, spec2);
                int sbWidth = sb_quota.getMeasuredWidth();
                LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) tv_quota.getLayoutParams();
                params.leftMargin = (int) (((double) progress / sb_quota.getMax()) * sbWidth - (double) quotaWidth * progress / sb_quota.getMax());
                tv_quota.setLayoutParams(params);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        // 得到progressBar控件的宽度
        ViewTreeObserver vto2 = mPb.getViewTreeObserver();
        vto2.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                mPb.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                width = mPb.getWidth();
                Log.i("MMM", "MainActivity onCreate()=="+mPb.getWidth());
            }
        });


        ValueAnimator animator = ValueAnimator.ofInt(0, 100);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int progress = (int) animation.getAnimatedValue();
                sb_quota.setProgress(progress);

                mPb.setProgress(progress);



            }
        });
        animator.setRepeatCount(1);
        animator.setDuration(4000);
        animator.start();

    }
}
