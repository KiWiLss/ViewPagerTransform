package com.magicsoft.wave.design.adapter.test_one.test_two.class_adapter;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: TestCH.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/11/29 13:10
 * @Changes (from 2017/11/29)
 * -----------------------------------------------------------------
 * 2017/11/29 : Create TestCH.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public class TestCH {
    public static void main(String[] args) {
        HKOutlet hkOutlet = new HKOutlet();
        System.out.println(hkOutlet.getHKType());


        ChinaOutlet chinaOutlet = new ChinaOutlet();
        System.out.println(chinaOutlet.getChinaType());


        OutletAdapter outletAdapter = new OutletAdapter();
        System.out.println(outletAdapter.getChinaType());

    }
}
