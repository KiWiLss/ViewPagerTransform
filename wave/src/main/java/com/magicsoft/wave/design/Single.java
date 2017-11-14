package com.magicsoft.wave.design;

/**
 * Created by 刘少帅 on 2017/11/14
 */

public class Single {

    private static volatile Single instance;

    private Single(){
    }

    private static Single getInstance(){
        return SingleInstance.INSTANCE;
    }

    static class SingleInstance{
        private static final Single INSTANCE=new Single();
    }


}
