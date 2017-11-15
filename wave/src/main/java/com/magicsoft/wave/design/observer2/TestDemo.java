package com.magicsoft.wave.design.observer2;

/**
 * Created by 刘少帅 on 2017/11/15
 */

public class TestDemo {//测试
    public static void main(String[] args) {
        //创建被观察者
        ServiceManager sm = new ServiceManager();
        //创建两个观察者
        AObserver a = new AObserver(sm);
        BObserver b = new BObserver(sm);

        //变动数据,观察变化
        sm.setData(5);
        //注销其中一个观察者,观察变化
        sm.deleteObserver(a);
        sm.setData(9);
    }
}
