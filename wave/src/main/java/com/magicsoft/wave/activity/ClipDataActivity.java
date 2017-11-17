package com.magicsoft.wave.activity;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.magicsoft.wave.R;
import com.magicsoft.wave.utils.ClipboardUtil;

/**
 * Created by 刘少帅 on 2017/11/16
 */

public class ClipDataActivity extends AppCompatActivity {

    private ClipboardManager mClipboarManager;
    private EditText mET;
    private TextView mTvOne;
    private TextView mTvTwo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clip_data);


        mET = (EditText) findViewById(R.id.et_clip_input);
        mTvOne = (TextView) findViewById(R.id.tv_clip_one);
        mTvTwo= (TextView) findViewById(R.id.tv_clip_two);


        //获取clipboarmanager
        mClipboarManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
//        //创建clipdata对象
//        ClipData clipData = ClipData.newPlainText("label", "text");
//        //添加到剪切板
//        mClipboarManager.setPrimaryClip(clipData);

        //首先初始化
        ClipboardUtil.init(getApplicationContext());
        ClipboardUtil.getInstance().copyText("label","text");
    }

    public void copy(View view) {

        String clipText = ClipboardUtil.getInstance().getClipText();
        mTvOne.setText(clipText);

//        //剪切板有内容
//        if (mClipboarManager.hasPrimaryClip()){
//
//            ClipData primaryClip = mClipboarManager.getPrimaryClip();
//            ClipDescription primaryClipDescription = mClipboarManager.getPrimaryClipDescription();
//
//            //获取label
//            String label = primaryClipDescription.getLabel().toString();
//
//            CharSequence text = primaryClip.getItemAt(0).getText();
//
//            mTvOne.setText(label);
//            mTvTwo.setText(text);
//        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //ClipboardUtil.getInstance().clearClip();
    }
}
