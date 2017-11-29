package com.magicsoft.wave.design.bridging;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: BridgeTest.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/11/29 13:33
 * @Changes (from 2017/11/29)
 * -----------------------------------------------------------------
 * 2017/11/29 : Create BridgeTest.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public class BridgeTest {
    public static void main(String[] args) {

        MyBridge myBridge = new MyBridge();

        SourceSub1 sourceSub1 = new SourceSub1();
        myBridge.setSourceable(sourceSub1);
        myBridge.method();

         /*调用第二个对象*/
        Sourceable source2 = new SourceSub2();
        myBridge.setSourceable(source2);
        myBridge.method();


    }
}
