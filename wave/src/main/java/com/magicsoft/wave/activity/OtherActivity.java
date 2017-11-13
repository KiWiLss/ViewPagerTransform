package com.magicsoft.wave.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.gongwen.marqueen.MarqueeFactory;
import com.gongwen.marqueen.MarqueeView;
import com.gongwen.marqueen.SimpleMF;
import com.gongwen.marqueen.SimpleMarqueeView;
import com.magicsoft.wave.R;
import com.magicsoft.wave.model.ComplexItemEntity;
import com.magicsoft.wave.model.ComplexViewMF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 刘少帅 on 2017/11/8
 */

public class OtherActivity extends AppCompatActivity {

    private final List<String> datas = Arrays.asList("《赋得古原草送别》", "离离原上草，一岁一枯荣。", "野火烧不尽，春风吹又生。", "远芳侵古道，晴翠接荒城。", "又送王孙去，萋萋满别情。");
    private SimpleMarqueeView mSmvOne;
    private SimpleMarqueeView mSmvTwo;
    private SimpleMarqueeView mSmvThree;
    private MarqueeView mMvFour;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        mSmvOne = (SimpleMarqueeView) findViewById(R.id.smv_one);
        mSmvTwo = (SimpleMarqueeView) findViewById(R.id.smv_two);
        mSmvThree = (SimpleMarqueeView) findViewById(R.id.smv_three);

        mMvFour = (MarqueeView) findViewById(R.id.mv_four);


        initMarqueeView1();
        initMarqueeView2();
        initMarqueeView3();
        initFout();
    }

    private void initFout() {
        List<ComplexItemEntity> complexDatas = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            complexDatas.add(new ComplexItemEntity("标题 " + i, "副标题 " + i, "时间 " + i));
        }
        MarqueeFactory<RelativeLayout, ComplexItemEntity> marqueeFactory = new ComplexViewMF(this);
        marqueeFactory.setOnItemClickListener(new MarqueeFactory.OnItemClickListener<RelativeLayout, ComplexItemEntity>() {
            @Override
            public void onItemClickListener(MarqueeFactory.ViewHolder<RelativeLayout, ComplexItemEntity> holder) {
                Toast.makeText(OtherActivity.this, holder.data.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        marqueeFactory.setData(complexDatas);
        mMvFour.setInAndOutAnim(R.anim.in_top, R.anim.out_bottom);
        mMvFour.setMarqueeFactory(marqueeFactory);
        mMvFour.startFlipping();

    }

    private void initMarqueeView3() {

        SimpleMF<String> marqueeFactory = new SimpleMF(this);
        marqueeFactory.setData(datas);
        mSmvThree.setMarqueeFactory(marqueeFactory);
        mSmvThree.startFlipping();
        marqueeFactory.setOnItemClickListener(new MarqueeFactory.OnItemClickListener<TextView, String>() {
            @Override
            public void onItemClickListener(MarqueeFactory.ViewHolder<TextView, String> holder) {
                Toast.makeText(OtherActivity.this, holder.data, Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void initMarqueeView2() {
        SimpleMF<String> marqueeFactory = new SimpleMF(this);
        marqueeFactory.setData(datas);
        mSmvTwo.setMarqueeFactory(marqueeFactory);
        mSmvTwo.startFlipping();
    }

    private void initMarqueeView1() {
        SimpleMF<String> marqueeFactory = new SimpleMF(this);
        marqueeFactory.setData(datas);
        mSmvOne.setMarqueeFactory(marqueeFactory);
        mSmvOne.startFlipping();
        marqueeFactory.setOnItemClickListener(new MarqueeFactory.OnItemClickListener<TextView, String>() {
            @Override
            public void onItemClickListener(MarqueeFactory.ViewHolder<TextView, String> holder) {
                Toast.makeText(OtherActivity.this, holder.data, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();
       mSmvOne.startFlipping();
    }

    @Override
    public void onStop() {
        super.onStop();
        mSmvOne.stopFlipping();
    }
}
