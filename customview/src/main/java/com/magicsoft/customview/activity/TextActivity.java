package com.magicsoft.customview.activity;

import android.graphics.RectF;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;

import com.magicsoft.customview.R;
import com.magicsoft.customview.span.ReplaceSpan;
import com.magicsoft.customview.span.SpansManager;

/**
 * Created by 刘少帅 on 2017/11/9
 *
 * 选题
 */

public class TextActivity extends AppCompatActivity implements ReplaceSpan.OnClickListener{
    private TextView mTvContent;
    private EditText mEtInput;
    private SpansManager mSpansManager;
    private String mTestStr = "我是个____学生,我有一个梦想，我要成为像____一样的人.";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);


        mTvContent = (TextView) findViewById(R.id.tv_content);
        mEtInput = (EditText) findViewById(R.id.et_input);

        mSpansManager = new SpansManager(this,mTvContent,mEtInput);
        mSpansManager.doFillBlank(mTestStr);


    }


    //填空题点击响应事件
    @Override
    public void OnClick(TextView v, int id, ReplaceSpan span) {
        mSpansManager.setData(mEtInput.getText().toString(),null, mSpansManager.mOldSpan);
        mSpansManager.mOldSpan = id;
        //如果当前span身上有值，先赋值给et身上
        mEtInput.setText(TextUtils.isEmpty(span.mText)?"":span.mText);
        mEtInput.setSelection(span.mText.length());
        span.mText = "";
        //通过rf计算出et当前应该显示的位置
        RectF rf = mSpansManager.drawSpanRect(span);
        //设置EditText填空题中的相对位置
        mSpansManager.setEtXY(rf);
        mSpansManager.setSpanChecked(id);
    }
}
