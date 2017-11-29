package com.magicsoft.wave.design.decorator.concretecomponent;

import com.magicsoft.wave.design.decorator.component.Beverage;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: HouseBlend.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/11/29 13:57
 * @Changes (from 2017/11/29)
 * -----------------------------------------------------------------
 * 2017/11/29 : Create HouseBlend.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public class HouseBlend extends Beverage{//具体的构建

    public HouseBlend(){
        description = "HouseBlend";
    }


    @Override
    public double cost() {
        return 0.89;
    }

}
