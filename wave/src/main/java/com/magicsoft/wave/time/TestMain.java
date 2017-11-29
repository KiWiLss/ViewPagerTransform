package com.magicsoft.wave.time;

import android.os.CountDownTimer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: TestMain.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/11/29 15:42
 * @Changes (from 2017/11/29)
 * -----------------------------------------------------------------
 * 2017/11/29 : Create TestMain.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public class TestMain {
    public static void main(String[] args) {

    }


    /**
     * 倒计时
     */
    public static void countDown(){
//         new CountDownTimer(1000 * 10, 1000) {//第一个参数,总时间;第二个参数,间隔时间
//            @Override
//            public void onTick(long l) {
//                System.out.println(l);
//            }
//
//            @Override
//            public void onFinish() {
//                System.out.println("finish");
//            }
//        }.start();
//        //cdt.cancel();

        CountDownTimer countDownTimer
                = new CountDownTimer(1000*20,1000) {
            @Override
            public void onTick(long l) {
                System.out.println(l);
            }

            @Override
            public void onFinish() {
                System.out.println("finish");
            }
        };
        countDownTimer.start();
    }

    public void timerTask(){
        final int[] time = {0};
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                time[0]++;
                System.out.println(time[0]);
            }
        }, 1000, 9000);//第二个是多久以后执行;第三个参数是隔多久执行
    }

    public void timerTask2(){
        new Timer().schedule(timerTask,1000,2000);
    }
    TimerTask timerTask=new TimerTask() {
        @Override
        public void run() {
            System.out.println("at will");
        }
    };
}
