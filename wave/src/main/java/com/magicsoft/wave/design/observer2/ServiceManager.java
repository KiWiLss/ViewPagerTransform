package com.magicsoft.wave.design.observer2;


import java.util.Observable;

/**
 * Created by 刘少帅 on 2017/11/15
 * 被观察者
 */

public class ServiceManager extends Observable {

    private int data=0;

    public int getData() {
        return data;
    }

    public void setData(int i) {
        if (this.data!=i){//数据发生变化
            this.data=i;
            setChanged();
        }
        notifyObservers();//只有在setChange()被调用后，notifyObservers()才会去调用update()，否则什么都不干。
    }
}
