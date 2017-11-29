package com.magicsoft.wave.design.adapter.test_one;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: TestMian.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/11/29 11:09
 * @Changes (from 2017/11/29)
 * -----------------------------------------------------------------
 * 2017/11/29 : Create TestMian.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public class TestMian {
    public static void main(String[] args) {
        Xiaomi xiaomi = new Xiaomi();
        xiaomi.store();
        xiaomi.takeAlong();

        XiaomiWrapper xiaomiWrapper = new XiaomiWrapper(new Phone());
        xiaomiWrapper.store();
        xiaomiWrapper.takeAlong();

        Phone1 phone1 = new Phone1();
        phone1.store();
        phone1.call();
    }
}
