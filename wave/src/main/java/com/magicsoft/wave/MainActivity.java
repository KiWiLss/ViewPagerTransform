package com.magicsoft.wave;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.magicsoft.wave.activity.OtherActivity;
import com.magicsoft.wave.activity.SeekActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




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
}
