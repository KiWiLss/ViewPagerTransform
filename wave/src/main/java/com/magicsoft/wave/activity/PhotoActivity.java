package com.magicsoft.wave.activity;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.bm.library.PhotoView;
import com.bumptech.glide.Glide;
import com.magicsoft.wave.R;

public class PhotoActivity extends AppCompatActivity {


    String url = "https://ss0.baidu.com/94o3dSag_xI4khGko9WTAnF6hhy/super/whfpf%3D425%2C260%2C50/sign=30f49b810ff79052ef4a147e6acee3f8/5bafa40f4bfbfbedbb34deed7ef0f736afc31f36.jpg";
    String gif = "http://imgsrc.baidu.com/baike/pic/item/7af40ad162d9f2d339d2a789abec8a136227cc91.jpg";
    String url2 = "http://112.124.97.122:92//shareshop/upload/image/61510325203551x430x430x.jpg";
    private PhotoView mPhotoView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);

        mPhotoView = (PhotoView) findViewById(R.id.img1);
        mPhotoView.enable();

//        使用Glide加载的gif图片同样支持缩放功能
        Glide.with(this)
                .load(url2)
                .crossFade()
                .placeholder(R.mipmap.bbb)
                .into(((PhotoView) findViewById(R.id.img1)));
    }
}
