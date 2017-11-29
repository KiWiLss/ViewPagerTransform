package com.magicsoft.wave.design.decorator.concretedecorator;

import com.magicsoft.wave.design.decorator.component.Beverage;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: CondimentDecorator.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/11/29 14:01
 * @Changes (from 2017/11/29)
 * -----------------------------------------------------------------
 * 2017/11/29 : Create CondimentDecorator.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();
    @Override
    public double cost() {
        return 0;
    }
}
