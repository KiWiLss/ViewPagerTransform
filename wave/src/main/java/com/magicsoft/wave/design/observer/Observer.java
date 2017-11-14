package com.magicsoft.wave.design.observer;

public interface Observer<T> {
    void onUpdate(Observable<T> observable,T data);
}