 package com.magicsoft.wave.activity;


 import android.os.Bundle;
 import android.support.annotation.Nullable;
 import android.support.v7.app.AppCompatActivity;
 import android.support.v7.widget.LinearLayoutManager;
 import android.support.v7.widget.RecyclerView;
 import android.view.WindowManager;
 import android.widget.ImageView;

 import com.magicsoft.wave.R;
 import com.magicsoft.wave.adapter.RecyclerViewAdapter;
 import com.qiushui.blurredview.BlurredView;

public class VagueActivity3 extends AppCompatActivity {

    private ImageView mImg;
    private BlurredView mBv;
    private BlurredView mBlurredView;
    private RecyclerView mRecyclerView;
    private int mScrollerY;
    private int mAlpha;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vague3);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        mBlurredView = (BlurredView) findViewById(R.id.yahooweather_blurredview);
        mRecyclerView = (RecyclerView) findViewById(R.id.yahooweather_recyclerview);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(new RecyclerViewAdapter(this));


        mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                mScrollerY += dy;
                if (Math.abs(mScrollerY) > 1000) {
                    mBlurredView.setBlurredTop(100);
                    mAlpha = 100;
                } else {
                    mBlurredView.setBlurredTop(mScrollerY / 10);
                    mAlpha = Math.abs(mScrollerY) / 10;
                }
                mBlurredView.setBlurredLevel(mAlpha);
            }
        });
    }
}
