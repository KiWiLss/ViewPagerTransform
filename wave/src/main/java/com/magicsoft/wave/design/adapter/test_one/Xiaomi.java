package com.magicsoft.wave.design.adapter.test_one;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: Xiaomi.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/11/29 11:08
 * @Changes (from 2017/11/29)
 * -----------------------------------------------------------------
 * 2017/11/29 : Create Xiaomi.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public class Xiaomi extends Phone implements USB {
    @Override
    public void store() {
        System.out.println("store implements usb");
    }
}
