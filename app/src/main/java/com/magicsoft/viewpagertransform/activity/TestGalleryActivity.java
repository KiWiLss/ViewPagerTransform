package com.magicsoft.viewpagertransform.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.magicsoft.viewpagertransform.R;
import com.magicsoft.viewpagertransform.adapter.MyPagerAdapter;
import com.magicsoft.viewpagertransform.transform.RotationPageTransformer;

/**
 * Created by 刘少帅 on 2017/11/8
 */

public class TestGalleryActivity extends AppCompatActivity {

    private int [] drawableIds=new int[]{R.mipmap.sea, R.mipmap.sunset,R.mipmap.sea,R.mipmap.lotus,R.mipmap.red};
    private ViewPager mViewPager;
    private MyPagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_gallery);
        initViews();
    }
    private void initViews() {
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        mPagerAdapter = new MyPagerAdapter(drawableIds,this);
        mViewPager.setAdapter(mPagerAdapter);

        mViewPager.setPageTransformer(true,new RotationPageTransformer());
        mViewPager.setOffscreenPageLimit(2); //下面会说到
    }


}
