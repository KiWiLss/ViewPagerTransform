package com.magicsoft.customview.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.magicsoft.customview.R;
import com.magicsoft.customview.model.AnswerRange;
import com.magicsoft.customview.widget.FillBlankView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 刘少帅 on 2017/11/10
 */

public class TextActivity2 extends AppCompatActivity {

    private FillBlankView fillBlankView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text2);
        fillBlankView = (FillBlankView) findViewById(R.id.fbv_content);

        initData();

    }

    private void initData() {
        String content = "纷纷扬扬的________下了半尺多厚。天地间________的一片。我顺着________工地走了四十多公里，" +
                "只听见各种机器的吼声，可是看不见人影，也看不见工点。一进灵官峡，我就心里发慌。";

        // 答案范围集合
        List<AnswerRange> rangeList = new ArrayList<>();
        rangeList.add(new AnswerRange(5, 13));
        rangeList.add(new AnswerRange(23, 31));
        rangeList.add(new AnswerRange(38, 46));

        fillBlankView.setData(content, rangeList);
    }
}
