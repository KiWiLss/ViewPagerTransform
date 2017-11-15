package com.magicsoft.wave.design.observer;

/**
 * Created by 刘少帅 on 2017/11/14
 * 另一个自定义的观察者
 */

public class MyObserver implements Observer {

    @Override
    public void onUpdate(Observable observable, Object data) {
        System.out.println("myobserver"+data.toString());
    }
}
