package com.magicsoft.wave.design.decorator;

import com.magicsoft.wave.design.decorator.component.Component;
import com.magicsoft.wave.design.decorator.concretecomponent.ConcreteComponent;
import com.magicsoft.wave.design.decorator.concretedecorator.ConcreteDecoratorA;
import com.magicsoft.wave.design.decorator.decorator.Decorator;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: Client.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/11/29 13:43
 * @Changes (from 2017/11/29)
 * -----------------------------------------------------------------
 * 2017/11/29 : Create Client.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public class Client {
    public static void main(String[] args) {
        Component component=new ConcreteComponent();

        Decorator decorator=new ConcreteDecoratorA(component);

        decorator.operation();
    }
}
