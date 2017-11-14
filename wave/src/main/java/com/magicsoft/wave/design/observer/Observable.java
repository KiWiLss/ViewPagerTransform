package com.magicsoft.wave.design.observer;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by 刘少帅 on 2017/11/14
 */

public class Observable<T> {

    List<Observer<T>> mObservable=new ArrayList();

    public void register(Observer<T> observer){
        if (observer == null) {
            throw new NullPointerException("observer == null");
        }
        synchronized (this){
            if (!mObservable.contains(observer)){
                mObservable.add(observer);
            }
        }

    }
    public synchronized void unregister(Observer<T> observer){
        if (mObservable.contains(observer)){
            mObservable.remove(observer);
        }
    }

    public void notifyObservers(T data){
        for (Observer<T> observer :
                mObservable) {
            observer.onUpdate(this, data);
        }
    }

}
