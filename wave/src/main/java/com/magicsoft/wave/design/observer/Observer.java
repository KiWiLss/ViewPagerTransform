package com.magicsoft.wave.design.observer;

/**
 * 自定义的观察者,通知更新的方法
 * @param <T>
 */
public interface Observer<T> {
    void onUpdate(Observable<T> observable,T data);
}