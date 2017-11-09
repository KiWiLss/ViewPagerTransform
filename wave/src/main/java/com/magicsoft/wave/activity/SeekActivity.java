package com.magicsoft.wave.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;
import com.magicsoft.wave.R;
import com.xw.repo.BubbleSeekBar;

/**
 * Created by 刘少帅 on 2017/11/9
 */

public class SeekActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek);


        BubbleSeekBar bsb = (BubbleSeekBar) findViewById(R.id.bsb);
        bsb.setOnProgressChangedListener(new BubbleSeekBar.OnProgressChangedListener() {
            @Override
            public void onProgressChanged(BubbleSeekBar bubbleSeekBar, int progress, float progressFloat) {

            }

            @Override
            public void getProgressOnActionUp(BubbleSeekBar bubbleSeekBar, int progress, float progressFloat) {

            }

            @Override
            public void getProgressOnFinally(BubbleSeekBar bubbleSeekBar, int progress, float progressFloat) {

            }
        });

        final LottieAnimationView byId = (LottieAnimationView) findViewById(R.id.animation_view);
        //加载网络json图片
       /* JSONObject json = new JSONObject(response.body().string());
        LottieComposition.Factory.fromJson(getResources(), json, new OnCompositionLoadedListener() {
            @Override
            public void onCompositionLoaded(@Nullable LottieComposition composition) {
                byId.setProgress(0);
                byId.loop(true);
                byId.setComposition(composition);
                byId.playAnimation();
            }
        });*/


    }
}
