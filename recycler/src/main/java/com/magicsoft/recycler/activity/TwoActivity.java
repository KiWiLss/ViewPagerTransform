package com.magicsoft.recycler.activity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;

import com.magicsoft.recycler.R;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: TwoActivity.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/12/14 16:52
 * @Changes (from 2017/12/14)
 * -----------------------------------------------------------------
 * 2017/12/14 : Create TwoActivity.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public class TwoActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);





    }

    public void goole(View view) {
        String title="原生样式标题";
        //改变标题
        SpannableStringBuilder Builder = new
                SpannableStringBuilder(title);

        StyleSpan spanState1 = new
                StyleSpan(Typeface.BOLD);
        Builder.setSpan(spanState1,0,title.length(), Spanned.SPAN_EXCLUSIVE_INCLUSIVE);

        Builder.setSpan(new ForegroundColorSpan(Color.YELLOW),0,3,Spanned.SPAN_EXCLUSIVE_INCLUSIVE);


                AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder
                .setTitle(Builder).setIcon(R.drawable.skin_left_menu_icon)
                .setMessage("这是一个原生样式的对话框")
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
        //单独修改按钮的颜色等,要在show方法后执行
        alertDialog.getButton(DialogInterface.BUTTON_NEGATIVE).setTextColor(ContextCompat.getColor(this,R.color.colorPrimaryDark));
        alertDialog.getButton(DialogInterface.BUTTON_POSITIVE).setTextColor(ContextCompat.getColor(this,R.color.colorPrimaryDark));



    }

    public void themeOne(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this,R.style.MyDialogTheme);
        builder
                .setTitle("原生样式标题").setIcon(R.drawable.skin_left_menu_icon)
                .setMessage("这是一个原生样式的对话框")
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        AlertDialog alertDialog = builder.create();
        //alertDialog.getButton(alertDialog.BUTTON_NEGATIVE).setTextColor(ContextCompat.getColor(this,R.color.colorAccent));
        alertDialog.show();
    }
}
