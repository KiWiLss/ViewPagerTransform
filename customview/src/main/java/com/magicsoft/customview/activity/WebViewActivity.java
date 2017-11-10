package com.magicsoft.customview.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.magicsoft.customview.R;

/**
 * Created by 刘少帅 on 2017/11/9
 */

public class WebViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

    }

    public static void open(Context context, String url){
        Intent intent = new Intent();
        intent.setClass(context,WebViewActivity.class);
        intent.putExtra("webUrl",url);
        context.startActivity(intent);
    }
}
