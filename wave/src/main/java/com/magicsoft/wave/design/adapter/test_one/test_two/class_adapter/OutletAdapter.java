package com.magicsoft.wave.design.adapter.test_one.test_two.class_adapter;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: OutletAdapter.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/11/29 13:08
 * @Changes (from 2017/11/29)
 * -----------------------------------------------------------------
 * 2017/11/29 : Create OutletAdapter.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public class OutletAdapter extends HKOutlet implements IChinaOutlet {
    @Override
    public String getChinaType() {
        String hkType = getHKType();

        return hkType.replace("British","chinese");
    }
}
