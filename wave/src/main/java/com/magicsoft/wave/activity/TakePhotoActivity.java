package com.magicsoft.wave.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.magicsoft.wave.R;
import com.ufo.imageselector.DWImages;

import java.util.List;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: TakePhotoActivity.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/11/29 16:28
 * @Changes (from 2017/11/29)
 * -----------------------------------------------------------------
 * 2017/11/29 : Create TakePhotoActivity.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public class TakePhotoActivity extends AppCompatActivity {

    public static final String TAG = "MMM";
    private ImageView mImg;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_photo);

        mImg = (ImageView) findViewById(R.id.img_take_icon);




    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        //就加上这行代码
        DWImages.parserResult(requestCode, data, new DWImages.GetImagesCallback() {
            @Override
            public void onResult(List<String> images) {
                //这里返回选择的图片路径
                Log.e(TAG, "onResult: "+images.get(0).toString());
            }
        });

    }

    public void take(View view) {
        DWImages.getImages(this, DWImages.ACTION_CAMERA, 1);
//        Matisse.from(this)
//                .choose(MimeType.allOf())//选择图片的类型
//                .countable(true)//是否使用数字标记
//                .maxSelectable(9)
//                //.addFilter(new GifSizeFilter(320, 320, 5 * Filter.K * Filter.K))
//                //.gridExpectedSize(getResources().getDimensionPixelSize(R.dimen.dp_4))
//                .restrictOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED)
//                .thumbnailScale(0.85f)
//                .imageEngine(new GlideEngine())
//                .forResult(1);
    }

    public void album(View view) {
        DWImages.getImages(this, DWImages.ACTION_ALBUM, 1);
    }

    public void cut(View view) {

    }
}
