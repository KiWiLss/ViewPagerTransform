package com.magicsoft.wave.design.decorator.concretecomponent;

import com.magicsoft.wave.design.decorator.component.Beverage;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: DarkRoast.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/11/29 13:59
 * @Changes (from 2017/11/29)
 * -----------------------------------------------------------------
 * 2017/11/29 : Create DarkRoast.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public class DarkRoast extends Beverage {

    public void DarkRoast(){
        description="DarkRoast";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
