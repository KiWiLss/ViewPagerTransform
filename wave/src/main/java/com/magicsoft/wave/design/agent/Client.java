package com.magicsoft.wave.design.agent;

import android.util.Log;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: Client.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/11/29 14:46
 * @Changes (from 2017/11/29)
 * -----------------------------------------------------------------
 * 2017/11/29 : Create Client.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public class Client {

    public static final String TAG="MMM";

    public static void main(String[] args) {
        IHouse house = new House("Downton Abbey", 5000);
        IHouse proxyHouse = new ProxyHouse(house);
        Log.i(TAG, "looking for a perfect house");
        proxyHouse.getHouseInfo();
        Log.i(TAG, "thinking");
        proxyHouse.signContract();
        proxyHouse.payFees();
        Log.i(TAG, "so easy");
    }
}
