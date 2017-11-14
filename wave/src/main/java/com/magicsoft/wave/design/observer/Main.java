package com.magicsoft.wave.design.observer;

/**
 * Created by 刘少帅 on 2017/11/14
 */

public class Main {

    public static void main(String[] args) {

        Observable<Weather> observable = new Observable<>();

        Observer<Weather> observer1 = new Observer<Weather>() {
            @Override
            public void onUpdate(Observable<Weather> observable, Weather data) {
                System.out.println("观察者1："+data.toString());
            }
        } ;

        Observer<Weather> observer2 = new Observer<Weather>() {
            @Override
            public void onUpdate(Observable<Weather> observable, Weather data) {
                System.out.println("观察者2："+data.toString());
            }
        } ;

        MyObserver myObserver = new MyObserver();

        observable.register(myObserver);

        observable.register(observer1);
        observable.register(observer2);

        Weather weather = new Weather("晴朗");
        observable.notifyObservers(weather);

        Weather weather1=new Weather("多云转阴");
        observable.notifyObservers(weather1);

        observable.unregister(observer1);

        Weather weather2=new Weather("台风");
        observable.notifyObservers(weather2);

    }
}
