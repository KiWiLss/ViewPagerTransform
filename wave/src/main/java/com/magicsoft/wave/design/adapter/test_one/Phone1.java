package com.magicsoft.wave.design.adapter.test_one;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: Phone1.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/11/29 11:21
 * @Changes (from 2017/11/29)
 * -----------------------------------------------------------------
 * 2017/11/29 : Create Phone1.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public class Phone1 extends AbsPhone {

    @Override
    public void store() {
        System.out.println("Phone1 need usb's store methond");
    }
    public void call() {
        System.out.println("Phone1 call");
    }

    public void sms() {
        System.out.println("Phone1 sms");
    }
}
