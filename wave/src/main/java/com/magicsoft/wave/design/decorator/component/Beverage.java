package com.magicsoft.wave.design.decorator.component;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: Beverage.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/11/29 13:54
 * @Changes (from 2017/11/29)
 * -----------------------------------------------------------------
 * 2017/11/29 : Create Beverage.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public abstract class Beverage {//抽象构建,知之為知之和不知為不知

    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
