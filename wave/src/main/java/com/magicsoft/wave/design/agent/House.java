package com.magicsoft.wave.design.agent;

import android.os.SystemClock;
import android.util.Log;

import java.text.SimpleDateFormat;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: House.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/11/29 14:36
 * @Changes (from 2017/11/29)
 * -----------------------------------------------------------------
 * 2017/11/29 : Create House.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public class House implements IHouse {
    private final String TAG = House.class.getSimpleName();
    private String name;
    private double price;

    public House(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public void getHouseInfo() {
        Log.i(TAG, "House Info- name:" + name + "  ￥:" + price);
    }

    @Override
    public void signContract() {
        Log.i(TAG, "Contract:" + name + "  signed at" +
                new SimpleDateFormat("HH:mm:ss").format(SystemClock.uptimeMillis()));
    }

    @Override
    public void payFees() {
        Log.i(TAG, "Bill: name-" + name + "  $-" + price);
    }


}
