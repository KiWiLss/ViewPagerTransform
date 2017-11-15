package com.magicsoft.wave.design.observer2;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by 刘少帅 on 2017/11/15
 * 观察者b
 */

public class BObserver implements Observer {

    public BObserver(ServiceManager sm) {
        sm.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object o) {
        System.out.println("AObserver receive:Data has changed to "+((ServiceManager) observable).getData());
    }
}
