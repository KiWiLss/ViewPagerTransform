package com.magicsoft.wave.activity;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.gyf.barlibrary.ImmersionBar;
import com.magicsoft.wave.R;
import com.magicsoft.wave.adapter.CustomLoadMore;
import com.magicsoft.wave.adapter.StatusAdapter;

import java.util.ArrayList;

/**
 * Created by 刘少帅 on 2017/11/15
 */

public class StatusActivity extends AppCompatActivity implements BaseQuickAdapter.RequestLoadMoreListener{

    private RecyclerView mRv;
    private ArrayList<String> mData;
    private StatusAdapter mAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);
        ImmersionBar.with(this)
                //.fitsSystemWindows(true)  //使用该属性,必须指定状态栏颜色
                .statusBarColor(R.color.colorPrimary)     //状态栏颜色，不写默认透明色
                //.statusBarColorTransform(R.color.colorAccent)  //状态栏变色后的颜色
                .statusBarDarkFont(true)   //状态栏字体是深色，不写默认为亮色
                .titleBar(findViewById(R.id.tb)) //解决状态栏和布局重叠问题，任选其一
                .init();//调用就会透明状态栏


        mRv = (RecyclerView) findViewById(R.id.rv_status_list);

        mRv.setHasFixedSize(true);
        mRv.setLayoutManager(new LinearLayoutManager(this));

        mData = new ArrayList<>();
        mAdapter = new StatusAdapter(R.layout.item_status, mData);
        mRv.setAdapter(mAdapter);

        mAdapter.setOnLoadMoreListener(this,mRv);
        mAdapter.openLoadAnimation(BaseQuickAdapter.SCALEIN);
        //mAdapter.disableLoadMoreIfNotFullPage();只有一页使用
        //mAdapter.setEnableLoadMore(false);
        mAdapter.setLoadMoreView(new CustomLoadMore());
        initData();

    }
    int mType=1;
    private void initData() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SystemClock.sleep(2000);
                for (int i = 0; i < 5; i++) {
                    mData.add("kitty"+i+"hello"+mType);
                }
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        mAdapter.notifyDataSetChanged();
                        mAdapter.loadMoreComplete();
                        mAdapter.setEnableLoadMore(true);
                        if (mType==6){
                            mAdapter.loadMoreEnd();
                        }
                    }
                });
            }
        }).start();
    }

    @Override
    public void onLoadMoreRequested() {
        mType++;
        initData();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ImmersionBar.with(this).destroy(); //必须调用该方法，防止内存泄漏
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_kiwi_out, R.anim.fade_kiwi_in);
    }
}
