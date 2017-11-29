package com.magicsoft.wave.design.adapter.test_one;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: XiaomiWrapper.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/11/29 11:15
 * @Changes (from 2017/11/29)
 * -----------------------------------------------------------------
 * 2017/11/29 : Create XiaomiWrapper.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public class XiaomiWrapper implements USB {

    private Phone phone;

    public XiaomiWrapper(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void store() {
        System.out.println("store implements usb");
    }

    @Override
    public void takeAlong() {
        phone.takeAlong();
    }
}
