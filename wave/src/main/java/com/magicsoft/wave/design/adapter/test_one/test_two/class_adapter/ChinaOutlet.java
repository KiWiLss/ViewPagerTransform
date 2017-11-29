package com.magicsoft.wave.design.adapter.test_one.test_two.class_adapter;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: ChinaOutlet.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/11/29 11:55
 * @Changes (from 2017/11/29)
 * -----------------------------------------------------------------
 * 2017/11/29 : Create ChinaOutlet.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public class ChinaOutlet implements IChinaOutlet {//
    @Override
    public String getChinaType() {
        return "chinese type";//返回中文格式
    }
}
