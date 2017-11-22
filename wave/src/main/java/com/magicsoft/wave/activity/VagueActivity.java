package com.magicsoft.wave.activity;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.magicsoft.wave.R;
import com.magicsoft.wave.utils.BlurBitmapUtil;
import com.qiushui.blurredview.BlurredView;

public class VagueActivity extends AppCompatActivity {

    private ImageView mImg;
    private BlurredView mBv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vague);

        mImg = (ImageView) findViewById(R.id.img);
        mBv = (BlurredView) findViewById(R.id.bv_icon);

        //拿到初始图
        //Bitmap initBitmap = BitmapUtil.drawableToBitmap(getResources().getDrawable(R.mipmap.lotus));

        Bitmap initBitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.lotus);
        //处理得到模糊效果的图
        Bitmap blurBitmap = BlurBitmapUtil.blurBitmap(this, initBitmap, 20f);
        mImg.setImageBitmap(blurBitmap);
        //设置模糊度
        mBv.setBlurredLevel(100);

    }
}
