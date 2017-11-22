package com.magicsoft.wave;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.magicsoft.wave.activity.ClipActivity;
import com.magicsoft.wave.activity.ClipDataActivity;
import com.magicsoft.wave.activity.ExaminActivity;
import com.magicsoft.wave.activity.OtherActivity;
import com.magicsoft.wave.activity.PatternActivity;
import com.magicsoft.wave.activity.PhotoActivity;
import com.magicsoft.wave.activity.ScrollViewActivity;
import com.magicsoft.wave.activity.SeekActivity;
import com.magicsoft.wave.activity.SeekTextActivity;
import com.magicsoft.wave.activity.ShadowActivity;
import com.magicsoft.wave.activity.StatusActivity;
import com.magicsoft.wave.utils.TypeConversionUtils;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        SlidingRootNav slidingRootNav = new SlidingRootNavBuilder(this)
//                .withToolbarMenuToggle(toolbar)
//                .withMenuOpened(false)
//
//                .withContentClickableWhenMenuOpened(false)
//                .withSavedState(savedInstanceState)
//                .withMenuLayout(R.layout.menu_left_drawer)
//                .inject();


        Log.e("MMM", "onCreate: "+App.isForeground);

    }

    public void showListener(View view) {//带意图
        Intent intent = new Intent(this, OtherActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        PendingIntent pIntent = PendingIntent.getActivity(this,
                99, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        int smallIcon = R.mipmap.ic_launcher;
        String ticker = "您有一条新通知";
        String title = "双十一大优惠！！！";
        String content = "涣发大号费符合你符合符合IE凤凰飞IE！";

        NotifyUtil notify1 = new NotifyUtil(this, 1);
        //notify1.notify_normal_singline(pIntent, smallIcon, ticker, title, content, true, true, false);//高仿淘宝

        notify1.notify_normail_moreline(pIntent, smallIcon, ticker, title, content, true, true, false);

    }

    public void seekListener(View view) {
        startActivity(new Intent(this, SeekActivity.class));
    }

    public void textListener(View view) {
        startActivity(new Intent(this, OtherActivity.class));
    }

    public void clipListener(View view) {
        startActivity(new Intent(this, ClipActivity.class));
    }

    public void patternListener(View view) {
        startActivity(new Intent(this, PatternActivity.class));
    }

    public void scrollListener(View view) {
        startActivity(new Intent(this, ScrollViewActivity.class));
    }

    public void seekTextListener(View view) {
        startActivity(new Intent(this, SeekTextActivity.class));
    }

    public void statusTextListener(View view) {
        startActivity(new Intent(this, StatusActivity.class));
        overridePendingTransition(R.anim.fade_kiwi_in, R.anim.fade_kiwi_out);
    }

    public void clipdataListener(View view) {
        startActivity(new Intent(this, ClipDataActivity.class));
        overridePendingTransition(R.anim.fade_kiwi_out, R.anim.fade_kiwi_in);
    }

    public void touchListener(View view) {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add("hello"+i);
        }
        Object[] objects = strings.toArray();


        String value = TypeConversionUtils.getStringFromObject(strings);
        Intent intent = new Intent(this, PhotoActivity.class);

        startActivity(intent);
    }

    public void examineListener(View view) {
        startActivity(new Intent(this, ExaminActivity.class));
        Log.e("MMM", "onCreate: "+App.isForeground);
    }


    public void shadlowListener(View view) {
        startActivity(new Intent(this, ShadowActivity.class));
    }
}
