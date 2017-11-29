package com.magicsoft.wave.design.bridging;

public class MyBridge extends Bridge {
    @Override
    public void method() {
        //super.method();
        getSourceable().method();
    }


} 