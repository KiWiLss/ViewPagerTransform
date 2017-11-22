package com.magicsoft.wave.activity;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.magicsoft.wave.R;
import com.magicsoft.wave.utils.BlurBitmapUtil;

public class VagueActivity2 extends AppCompatActivity {

    private ImageView mImg;
    private Bitmap mTempBitmap;
    private Bitmap mFinalBitmap;
    private ImageView mBluredImage;
    private ImageView mOriginImg;
    private SeekBar mSeekBar;
    private TextView mProgressTv;
    private int mAlpha;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {//https://github.com/wl9739/BlurredView
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vague2);


// 初始化视图
        initViews();
        // 获取图片
        mTempBitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.mountain);
        mFinalBitmap = BlurBitmapUtil.blurBitmap(this,mTempBitmap,20f);


        // 填充模糊后的图像和原图
        mBluredImage.setImageBitmap(mFinalBitmap);
        mOriginImg.setImageBitmap(mTempBitmap);
        // 处理seekbar滑动事件
        setSeekBar();
    }

    /**
     * 初始化视图
     */
    private void initViews() {
        mBluredImage = (ImageView) findViewById(R.id.activity_main_blured_img);
        mOriginImg = (ImageView) findViewById(R.id.activity_main_origin_img);
        mSeekBar = (SeekBar) findViewById(R.id.activity_main_seekbar);
        mProgressTv = (TextView) findViewById(R.id.activity_main_progress_tv);
    }

    /**
     * 处理seekbar滑动事件
     */
    private void setSeekBar() {
        mSeekBar.setMax(100);
        mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mAlpha = progress;
                mOriginImg.setAlpha((int) (255 - mAlpha * 2.55));
                mProgressTv.setText(String.valueOf(mAlpha));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }


}
